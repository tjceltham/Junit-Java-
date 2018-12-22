package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TTTest {

    @org.junit.jupiter.api.Test
    void getTT() {
        TT t = new TT();
        int v = t.getTT();

    assertEquals(v,10,"error");
    }

    @org.junit.jupiter.api.Test
    void getTT1() {
        TT t = new TT();
        int v = t.getTT();

        assertEquals(v,10,"error");
    }
}