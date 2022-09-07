package test.interface1;

/**
 * IPrintable2 interface
 * @author 91952
 *
 */
interface IPrintable2 {// created interface IPrintable2
	/**
	 * method print
	 * 
	 */
	void print(); // decleared method print
}
/**
 * IShowable2 interface
 * @author 91952
 *
 */
interface IShowable2{ // created interface IShowable2
	void print(); 
}
/**
 * class for implementing inherited method for execution
 * @author 91952
 *
 */
class TestInterface implements IPrintable2 ,IShowable2{ //child class TestInterface  implements/inherits
	 //multiple parent IPrintable2 and IShowable2
	public void print() // declared method print
	{
		System.out.println("Hello");
	}
	/**
	 * main method
	 * @param args
	 */
	public static void main(String...args) { // main method
		TestInterface obj = new TestInterface(); //created object of TestInterface
		obj.print(); // calling method print
		
	}
	

}
