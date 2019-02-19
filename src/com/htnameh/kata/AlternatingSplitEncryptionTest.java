package com.htnameh.kata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class AlternatingSplitEncryptionTest {

    @Test
    void encrypt() {
        // assertEquals("expected", "actual");
        assertEquals("This is a test!", AlternatingSplitEncryption.encrypt("This is a test!", 0));
        assertEquals("hsi  etTi sats!", AlternatingSplitEncryption.encrypt("This is a test!", 1));
        assertEquals("s eT ashi tist!", AlternatingSplitEncryption.encrypt("This is a test!", 2));
        assertEquals(" Tah itse sits!", AlternatingSplitEncryption.encrypt("This is a test!", 3));
        assertEquals("This is a test!", AlternatingSplitEncryption.encrypt("This is a test!", 4));
        assertEquals("This is a test!", AlternatingSplitEncryption.encrypt("This is a test!", -1));
        assertEquals("hskt svr neetn!Ti aai eyitrsig", AlternatingSplitEncryption.encrypt("This kata is very interesting!", 1));
    }

    @Test
    void decrypt() {
        // assertEquals("expected", "actual");
        assertEquals("This is a test!", AlternatingSplitEncryption.decrypt("This is a test!", 0));
        assertEquals("This is a test!", AlternatingSplitEncryption.decrypt("hsi  etTi sats!", 1));
        assertEquals("This is a test!", AlternatingSplitEncryption.decrypt("s eT ashi tist!", 2));
        assertEquals("This is a test!", AlternatingSplitEncryption.decrypt(" Tah itse sits!", 3));
        assertEquals("This is a test!", AlternatingSplitEncryption.decrypt("This is a test!", 4));
        assertEquals("This is a test!", AlternatingSplitEncryption.decrypt("This is a test!", -1));
        assertEquals("This kata is very interesting!", AlternatingSplitEncryption.decrypt("hskt svr neetn!Ti aai eyitrsig", 1));
    }

    @Test
    void testNullOrEmpty() {
        // assertEquals("expected", "actual");
        assertEquals("", AlternatingSplitEncryption.encrypt("", 0));
        assertEquals("", AlternatingSplitEncryption.decrypt("", 0));
        assertNull(AlternatingSplitEncryption.encrypt(null, 0));
        assertNull(AlternatingSplitEncryption.decrypt(null, 0));
    }
}