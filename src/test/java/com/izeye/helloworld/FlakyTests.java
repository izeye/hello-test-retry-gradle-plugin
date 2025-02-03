package com.izeye.helloworld;

import org.junit.jupiter.api.Test;

import java.util.Random;

/**
 * Flaky tests.
 *
 * @author Johnny Lim
 */
class FlakyTests {

    Random random = new Random();

    @Test
    void test() {
        if (this.random.nextBoolean()) {
            throw new RuntimeException();
        }
    }

}
