let tasklist = [];

function submithandler(){
    event.preventDefault();
    let input_value = document.getElementById("inputbox").value;
    tasklist.push(input_value);
    console.log(tasklist);
    let arrayToString = JSON.stringify(tasklist);
    localStorage.setItem("tasks", arrayToString);
    console.log(arrayToString);

    renderList();
}

function renderList(){
    const tasksInString = localStorage.getItem("tasks");
    const tasksInArray = JSON.parse(tasksInString);
    tasklist = tasksInArray;
    const noOfTask = tasklist.length;
    console.log(noOfTask);

    let tasksFinal = "";
    for (i = 0; i < noOfTask; i++) {
      const newLastTask = tasklist[i];
      let newTask = " <li class='list-group-item'> " + newLastTask + " </li> ";
      tasksFinal = tasksFinal + newTask;
    }
  
    const ulTag = document.getElementById("taskLists");
    ulTag.innerHTML = tasksFinal;
}

renderList();