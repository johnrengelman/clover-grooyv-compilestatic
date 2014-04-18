package pkg

import spock.lang.Specification

class MainSpec extends Specification {

  def 'test main'() {
    expect:
    Main.main([] as String[])
  }
}
