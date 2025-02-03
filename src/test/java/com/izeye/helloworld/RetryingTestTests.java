package com.izeye.helloworld;

import org.junitpioneer.jupiter.RetryingTest;

/**
 * Tests for {@link RetryingTest}.
 *
 * @author Johnny Lim
 */
class RetryingTestTests {

    static int tries = 0;

    @RetryingTest(2)
    void test() {
        tries++;
        System.out.println(tries);

        if (tries == 1) {
            throw new RuntimeException();
        }
    }

}
