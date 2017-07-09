package STBuffer;

public class stb {

	public static void main(String[] args) {
		String s1 ="Hello Smitha";
		System.out.println(s1);
		StringBuffer sb = new StringBuffer(s1);
		
		System.out.println("Length of the actual characters in the StringBuffer "+sb.length());
		
		System.out.println("capacity of the buffer as per the formula 16 +stringlength " +sb.capacity());
		
		System.out.println("append a string");
		
		System.out.println(sb.append(" XXXghjghjgjghjgkggjgjggjgjhgjgjgjgkgjggj"));
		
		System.out.println("Length of the actual characters in the Buffer " +sb.length());
		
		System.out.println("New capacity after append operation  as per the formula oldcapacity *2+2 is "+sb.capacity());
		

		
	}

}

