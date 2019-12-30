

import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Array Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>十二月 30, 2019</pre>
 */
public class ArrayTest {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: reverseString(String s)
     */
    @Test
    public void testReverseString() throws Exception {
        assertEquals("not equal: " + Array.reverseString("abc123!@#"), "#@!321cba", Array.reverseString("abc123!@#"));
        assertEquals("not equal: " + Array.reverseString(""), "", Array.reverseString(""));
        assertEquals("not equal: " + Array.reverseString(null), null, Array.reverseString(null));
    }

    @Test
    public void testIsAnagrams() throws Exception {
        assertTrue("1", Array.isAnagrams("abc", "cba"));
        assertFalse("2", Array.isAnagrams("abc", "abc"));
        assertFalse("3", Array.isAnagrams("aabbcc", "aabbcd"));

    }


} 
