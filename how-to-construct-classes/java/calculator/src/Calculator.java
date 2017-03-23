class Calculator {

  private double value;

  public Calculator() {
    this.clear();
  }

  public double add(double operand) throws Exception {
    this.value += operand;
    return this.value;
  }

  public double add(int operand) throws Exception {
    this.value += operand;
    return this.value;
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
    this.value *= operand;
    return this.value;
  }

  public double multiply(int operand) throws Exception {
    this.value *= operand;
    return this.value;
  }

  public double divide(double operand) throws Exception {
    this.value /= operand;
    return this.value;
  }

  public double divide(int operand) throws Exception {
    this.value /= operand;
    return this.value;
  }

  public double power(double operand) throws Exception {
    this.value = math.pow(double operand, double operand);
    return this.value;
  }

  public double power(int operand) throws Exception {
    this.value = math.pow(int operand, int operand);
    return this.value;
  }

  public void clear() {
    this.value = 0;
  }
}

