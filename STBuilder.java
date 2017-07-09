package STBuffer;

public class STBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb2=new StringBuilder(); 
		
		System.out.println("Initial capacity of the Stringbuilder"); 
		System.out.println(sb2.capacity());//default 16 
		
		sb2.append("Hi");
		
		System.out.println("Inital string is " +sb2);
		
		System.out.println("Length of the actual characters in the StringBuffer "+sb2.length() +sb2);
		
		System.out.println("capacity of the buffer  " +sb2.capacity());//now 16  
		
		System.out.println("append a string");
		
		sb2.append("java is an user friendly language");  
		
		System.out.println("appended string is-  " +sb2);
		
		System.out.println("New Capacity of the Builder after append and the string is "+sb2.capacity());//(oldcapacity*2)+2  
		
		
		
		
		
		

	}

}
