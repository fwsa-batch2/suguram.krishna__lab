// Pre-req goal :  on submitting a form                 completed
// goal 1 : get the values of the two input field       completed
// goal 2 : add the values of the two inputs            completed
// goal 3 : display the sum of the inputs

function addition(param1, param2) {
  const number1 = +param1;
  const number2 = +param2;
  const sum = number1 + number2;
  return sum;
}

function submitHandler() {
  event.preventDefault(); //. to prevent the page from reloading

  const firstInput = document.getElementById("firstInput");
  const secondInput = document.getElementById("secondInput");

  console.log("firstInput is " + firstInput.value);
  console.log("secondInput is " + secondInput.value);

  const sum = addition(firstInput.value, secondInput.value);
  console.log("Sum is = " + sum);

  const div = document.getElementById("answer");
  div.innerText = sum;
}

// subtraction

// multiplication

// division
