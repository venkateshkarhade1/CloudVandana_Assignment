function addTask() {
    const taskInput = document.getElementById("taskInput");
    const taskText = taskInput.value.trim();
    if (taskText === "") return;

    const taskList = document.getElementById("taskList");
    const li = document.createElement("li");
    li.className = "task-item";

    li.innerHTML = `<span>${taskText}</span> <button class="remove-btn" onclick="removeTask(this)">Remove</button>`;
    taskList.appendChild(li);

    taskInput.value = ""; 
}

function removeTask(button) {
    const li = button.parentElement;
    li.remove();
}
