// navbar
console.log('js is connected')

document.addEventListener('DOMContentLoaded', function() {
    const loadingIndicator = document.getElementById('loading-indicator');

    // Show the loading indicator when the page starts loading
    window.addEventListener('load', function() {
        loadingIndicator.style.display = 'flex';
    });

    // Hide the loading indicator when the page has finished loading
    window.addEventListener('load', function() {
        loadingIndicator.style.display = 'none';
    });
});