function MyClass(args) {

  var classScope = this;

  classScope.thisIsAPublicProperty = args.passInAValueForThePublicProperty;
}

MyClass.constructor.thisIsAPublicMethod = thisIsAPublicMethod;

function thisIsAPublicMethod(args) {

  var classScope = this;
  return classScope.thisIsAPublicProperty;
}

