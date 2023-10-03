package org.example.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task1138Test {

    @Test
    public void testAlphabetBoardPath1() {
        Task1138 t = new Task1138();
        String result = t.alphabetBoardPath("leet");
        assertEquals("DDR!UURRR!!DDD!", result);
    }

    @Test
    public void testAlphabetBoardPath2() {
        Task1138 t = new Task1138();
        String result = t.alphabetBoardPath("code");
        assertEquals("RR!DDRR!UUL!R!", result);
    }

    @Test
    public void testAlphabetBoardPath3() {
        Task1138 t = new Task1138();
        String result = t.alphabetBoardPath("z");
        assertEquals("DDDDD!", result);
    }
    @Test
    public void testAlphabetBoardPath4() {
        Task1138 t = new Task1138();
        String result = t.alphabetBoardPath("zz");
        assertEquals("DDDDD!!", result);
    }
    @Test
    public void testAlphabetBoardPath5() {
        Task1138 t = new Task1138();
        String result = t.alphabetBoardPath("a");
        assertEquals("!", result);
    }
    @Test
    public void testAlphabetBoardPath6() {
        Task1138 t = new Task1138();
        String result = t.alphabetBoardPath("abcd");
        assertEquals("!R!R!R!", result);
    }
    @Test
    public void testAlphabetBoardPat7() {
        Task1138 t = new Task1138();
        String result = t.alphabetBoardPath("zdz");
        assertEquals("DDDDD!UUUUURRR!DDDDLLLD!", result);
    }
    @Test
    public void testAlphabetBoardPat8() {
        Task1138 t = new Task1138();
        String result = t.alphabetBoardPath("gzz");
        assertEquals("DR!DDDLD!!", result);
    }


}
