class MyClass {

  private String thisIsAPrivateProperty; 
  public int thisIsAPublicProperty;

  public MyClass(String passInAValueForThePrivateProperty, int passInAValueForThePublicProperty) {
    this.thisIsAPrivateProperty = passInAValueForThePrivateProperty; 
    this.thisIsAPublicProperty = passInAValueForThePublicProperty;
  }

  public String getPrivateProperty() {
    return this.thisIsAPrivateProperty;
  }
}

