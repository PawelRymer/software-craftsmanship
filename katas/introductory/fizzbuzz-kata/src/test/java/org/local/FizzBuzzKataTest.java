package org.local;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FizzBuzzKataTest {

    private FizzBuzzGameKata fizzBuzzGame;

    @BeforeEach
    void setUp() {
        this.fizzBuzzGame = new FizzBuzzGameKata();
    }

    @Test
    void testBasicFizzCase() {
        Assertions.assertEquals("Fizz", fizzBuzzGame.resultByNumber(3));
    }

    @Test
    void testBasicBuzzCase(){
        Assertions.assertEquals("Buzz", fizzBuzzGame.resultByNumber(5));
    }

    @Test
    void testBasicFizzBuzzCase(){
        Assertions.assertEquals("FizzBuzz", fizzBuzzGame.resultByNumber(15));
    }

    @Test
    void testBasicDefaultCase(){
        Assertions.assertEquals("1", fizzBuzzGame.resultByNumber(1));
    }

    @Test
    void testGameCounter(){
        Assertions.assertEquals(100, fizzBuzzGame.getCountLimit());
    }

    @Test
    void testGamePlay(){
        var results = fizzBuzzGame.play();

        //First 10
        Assertions.assertEquals("1", results.getFirst());
        Assertions.assertEquals("2", results.get(1));
        Assertions.assertEquals("Fizz", results.get(2));
        Assertions.assertEquals("4", results.get(3));
        Assertions.assertEquals("Buzz", results.get(4));
        Assertions.assertEquals("Fizz", results.get(5));
        Assertions.assertEquals("7", results.get(6));
        Assertions.assertEquals("8", results.get(7));
        Assertions.assertEquals("Fizz", results.get(8));
        Assertions.assertEquals("Buzz", results.get(9));

        //Middle 10
        Assertions.assertEquals("46", results.get(45));
        Assertions.assertEquals("47", results.get(46));
        Assertions.assertEquals("Fizz", results.get(47));
        Assertions.assertEquals("49", results.get(48));
        Assertions.assertEquals("Buzz", results.get(49));
        Assertions.assertEquals("Fizz", results.get(50));
        Assertions.assertEquals("52", results.get(51));
        Assertions.assertEquals("53", results.get(52));
        Assertions.assertEquals("Fizz", results.get(53));
        Assertions.assertEquals("56", results.get(55));

        //Last 10
        Assertions.assertEquals("91", results.get(90));
        Assertions.assertEquals("92", results.get(91));
        Assertions.assertEquals("Fizz", results.get(92));
        Assertions.assertEquals("94", results.get(93));
        Assertions.assertEquals("Buzz", results.get(94));
        Assertions.assertEquals("Fizz", results.get(95));
        Assertions.assertEquals("97", results.get(96));
        Assertions.assertEquals("98", results.get(97));
        Assertions.assertEquals("Fizz", results.get(98));
        Assertions.assertEquals("Buzz", results.get(99));
    }
}