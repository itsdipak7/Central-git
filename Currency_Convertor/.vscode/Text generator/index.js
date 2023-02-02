const generateBtn = document.getElementById("generateBtn");
const inputText = document.getElementById("inputText");
const generatedText = document.getElementById("generatedText");

generateBtn.addEventListener("click", function() {
    generatedText.textContent = inputText.value + " - generated text";
});