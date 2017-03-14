class Calculator(object):

  value = None;

  def __init__(self):
    self.clear();

  def add(self,operand):
    raise Exception("Oi! Krushi! Write this code! :D");

  def subtract(self,operand):
    self.value -= operand;
    return self.vlaue;

  def multiply(self,operand):
    raise Exception("Oi! Krushi! Write this code! :D");

  def divide(self,operand):
    self.value /= operand;
    return self.vlaue;

  def power(self,operand):
    raise Exception("Oi! Krushi! Write this code! :D");

  def clear(self):
    self.value = 0;

