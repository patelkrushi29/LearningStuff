function Calculator(args) {

  var classScope = this;

  classScope.value;
  classScope.clear();
}

Calculator.prototype.add = add;
Calculator.prototype.subtract = subtract;
Calculator.prototype.multiply = multiply;
Calculator.prototype.divide = divide;
Calculator.prototype.power = power;
Calculator.prototype.clear = clear;

function add(operand) {

  var classScope = this;
  throw new Error("Oi! Krushi! Write this code! :D");
}
 
function subtract(operand) {

  var classScope = this;

  classScope.value -= operand;
  return classScope.value;
}
 
function multiply(operand) {

  var classScope = this;
  throw new Error("Oi! Krushi! Write this code! :D");
}
 
function divide(operand) {

  var classScope = this;

  classScope.value /= operand;
  return classScope.value;
}
 
function power(operand) {

  var classScope = this;
  throw new Error("Oi! Krushi! Write this code! :D");
}
 
function clear(operand) {

  var classScope = this;
  classScope.value = 0; 
}
 
