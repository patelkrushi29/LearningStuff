class Example(object):

  thisIsAPublicProperty = None;

  def __init(self,args):
    self.thisIsAPublicProperty = args["passInAValueForThePublicProperty"];

  def thisIsAPublicMethod(self):
    return self.thisIsAPublicProperty;

  def __thisIsAPrivateMethod(self):
    print("Hello from the other side~!");

