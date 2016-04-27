public class HelloWorldTest extends junit.framework.TestCase {

    public void testNothing() {
    }
    
    public void testWillAlwaysFail() {
		oata.HelloWorld h = new oata.HelloWorld();
		assertEquals(h.getMessage(),"Hello World");
        //fail("An error message");
    }
    
}