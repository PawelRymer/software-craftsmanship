package org.local

import spock.lang.Specification

class FizzBuzzGameKataTest extends Specification {

    def "Game should take 100 turns"(){
        given:
        FizzBuzzGameKata fizzBuzzGame = Spy()
        when:
        fizzBuzzGame.play()
        then:
        100 * fizzBuzzGame.resultByNumber(_)
    }

}
