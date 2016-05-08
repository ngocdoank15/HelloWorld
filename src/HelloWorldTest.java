public class HelloWorldTest extends junit.framework.TestCase {

    public void testNothing() {
    }
    
    public void testWillAlwaysPass() {
		oata.HelloWorld h = new oata.HelloWorld();
		assertEquals(h.getMessage(),"Hello World");
        //fail("An error message");
    }

   public void testWillAlwaysFail() {
		
        fail("An error message");
    }
    
}
