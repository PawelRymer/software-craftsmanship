package org.local;

import java.util.List;
import java.util.stream.IntStream;

class FizzBuzzGameKata {

    private static final int countLimit = 100;

    private static final String FIZZ = "Fizz";
    private static final String BUZZ = "Buzz";

    String resultByNumber(int number) {
        if(isDivisibleBy5(number) && isDivisibleBy3(number)){
            return FIZZ + BUZZ;
        }
        if(isDivisibleBy3(number)){
            return FIZZ;
        }
        if(isDivisibleBy5(number)){
            return BUZZ;
        }
        return String.valueOf(number);
    }

    private boolean isDivisibleBy3(int number) {
        return number % 3 == 0;
    }

    private boolean isDivisibleBy5(int number) {
        return number % 5 == 0;
    }

    List<String> play() {
        return IntStream.rangeClosed(1, countLimit).mapToObj(this::resultByNumber).toList();
    }

    int getCountLimit() {
        return countLimit;
    }
}