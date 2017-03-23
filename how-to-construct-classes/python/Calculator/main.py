class Calculator(object):

  value = None;

  def __init__(self):
    self.clear();

  def add(self,operand):
    self.value += operand;
    return self.value;
    #raise Exception("Oi! Krushi! Write this code! :D");

  def subtract(self,operand):
    self.value -= operand;
    return self.vlaue;

  def multiply(self,operand):
    self.value *= operand;
    return self.value;
    #raise Exception("Oi! Krushi! Write this code! :D");

  def divide(self,operand):
    self.value /= operand;
    return self.vlaue;

  def power(self,operand):
    self.value **= operand;
    return self.value;
    #Assuming that user always wants x^x. if not we will need two inputs
    #raise Exception("Oi! Krushi! Write this code! :D");

  def clear(self):
    self.value = 0;

