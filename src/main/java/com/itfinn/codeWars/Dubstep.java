package com.itfinn.codeWars;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * @author xiefei
 */
public class Dubstep {
    public static String SongDecoder (String song) {
        // Your code is here...
        return song.replaceAll("WUB", " ").trim().replaceAll(" +"," ");
    }

    public class SongTests {
        @Test
        public void Test1() {
            Assert.assertEquals("ABC", new Dubstep().SongDecoder("WUBWUBABCWUB"));
        }
        @Test
        public void Test2()
        {
            Assert.assertEquals("R L", new Dubstep().SongDecoder("RWUBWUBWUBLWUB"));
        }
    }
}
