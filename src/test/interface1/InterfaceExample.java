package test.interface1;

 /** 
  * IPrintable3 Interface
 * @author 91952
 *
 */
interface  IPrintable3 { //created an interface IPrintable3 
	
	/**
	 * print method 
	 * 
	 * 
	 */
	void print(); // declared method print 
 }
 /**
  * Implementation of IPrintable3
 * @author 91952
 *
 */
class A6 implements IPrintable3{ // child class A6  implements/inherits parent IPrintable3
	/**
	 * implementation of method print
	 * print Hello
	 * @author 91952
	 *
	 */
	public void print() { // all child class must have to implements
		//the methods defined in the parent interface
		 System.out.println("Hello"); // printed hello
	 }
	 /**
	  * main method for execute the code
	 * @param args
	 */
	public static void main(String...args) { // created method for the code execution
		 A6 obj = new A6(); // created object for class A6
		 obj.print(); // calling method print
	 }
	 
	 

}
