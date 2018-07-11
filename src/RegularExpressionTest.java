import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;

public class RegularExpressionTest {

    @Test
    public void test() {
        assertTrue(RegularExpression.regularCheck("testmail@gmx.de"));
        assertFalse(RegularExpression.regularCheck("testmailgmx.de"));
        assertTrue(RegularExpression.regularCheck("testmail5442@gmail.de"));
        assertTrue(RegularExpression.regularCheck("testmail@gmx.com"));
        assertFalse(RegularExpression.regularCheck(" testmail@gmx.com"));
    }
}
