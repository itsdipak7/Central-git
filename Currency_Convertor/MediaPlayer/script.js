// Get the audio element and song list
const audio = document.getElementById("audio");
const songList = document.getElementById("song-list");

// Add event listeners to play songs when clicked
songList.addEventListener("click", function(e) {
    if (e.target.tagName === "LI") {
        audio.src = e.target.dataset.src;
        audio.play();
    }
});