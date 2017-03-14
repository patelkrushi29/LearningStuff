class Calculator {

  private double value;

  public Calculator() {
    this.clear();
  }

  public double add(double operand) throws Exception {
    throw new Exception("Oi! Krushi! Write this code! :D");
  }

  public double add(int operand) throws Exception {
    throw new Exception("Oi! Krushi! Write this code! :D");
  }

  public double subtract(double operand) {
    this.value -= operand;
    return this.value;
  }

  public double subtract(int operand) {
    this.value -= operand;
    return this.value;
  }

  public double multiply(double operand) throws Exception {
    throw new Exception("Oi! Krushi! Write this code! :D");
  }

  public double multiply(int operand) throws Exception {
    throw new Exception("Oi! Krushi! Write this code! :D");
  }

  public double divide(double operand) throws Exception {
    this.value /= operand;
    return this.value;
  }

  public double divide(int operand) throws Exception {
    throw new Exception("Oi! Krushi! Write this code! :D");
  }

  public double power(double operand) throws Exception {
    throw new Exception("Oi! Krushi! Write this code! :D");
  }

  public double power(int operand) throws Exception {
    throw new Exception("Oi! Krushi! Write this code! :D");
  }

  public void clear() {
    this.value = 0;
  }
}

