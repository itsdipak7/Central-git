const toDoInput = document.querySelector("#to-do-input");
const addTaskBtn = document.querySelector("#add-task-btn");
const toDoList = document.querySelector("#to-do-list");

addTaskBtn.addEventListener("click", function() {
    if (!toDoInput.value) return;

    const newTask = document.createElement("li");
    newTask.classList.add("to-do-item");
    newTask.innerHTML = `${toDoInput.value} <button class="delete-btn">X</button>`;

    toDoList.appendChild(newTask);

    toDoInput.value = "";

    const deleteBtns = document.querySelectorAll(".delete-btn");
    deleteBtns.forEach(function(deleteBtn) {
        deleteBtn.addEventListener("click", function(event) {
            event.target.parentElement.remove();
        });
    });
});