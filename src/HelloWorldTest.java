public class HelloWorldTest extends junit.framework.TestCase {

    public void testNothing() {
    }
    
    public void testWillAlwaysFail() {
		HelloWorld h = new HelloWorld();
		assertEquals(h.getMessage(),"Hello World");
        //fail("An error message");
    }
    
}