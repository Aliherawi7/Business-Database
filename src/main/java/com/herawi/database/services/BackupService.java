package com.herawi.database.services;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.time.LocalDate;

@Service

public class BackupService {

        private static final String BACKUP_DIRECTORY = "./data/backups";

        @Scheduled(cron = "0 0 2 * * ?") // Run backup daily at 2 AM
        public void backupDatabase() {
            try {
                Path backupPath = Paths.get(BACKUP_DIRECTORY, "myapp-backup-" + LocalDate.now() + ".mv.db");
                Files.copy(Paths.get("./data/myapp.mv.db"), backupPath, StandardCopyOption.REPLACE_EXISTING);
               // logger.info("Database backup created: {}", backupPath);
            } catch (IOException e) {
               // logger.error("Failed to create database backup", e);
            }
        }

    public void restoreFromBackup(String backupFileName) {
        try {
            Path backupPath = Paths.get(BACKUP_DIRECTORY, backupFileName);
            Files.copy(backupPath, Paths.get("./data/myapp.mv.db"), StandardCopyOption.REPLACE_EXISTING);
          //  logger.info("Database restored from backup: {}", backupPath);
        } catch (IOException e) {
          //  logger.error("Failed to restore database from backup", e);
        }
    }

}
