public class HelloWorld {
	private static final String HELLO_WORLD_TEMPLATE = "Hello, %s!";
	public static String hello(String name){
		if (name != null && name.length() >0){
			return String.format(HELLO_WORLD_TEMPLATE,name);
		}
		return String.format(HELLO_WORLD_TEMPLATE, "World");
	}
}
