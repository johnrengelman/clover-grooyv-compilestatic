package pkg

import groovy.transform.CompileStatic

@CompileStatic
class Main {

  static void main(String[] args) {
    Foo foo = new Foo()
    Bar bar = foo?.bar
  }
}
