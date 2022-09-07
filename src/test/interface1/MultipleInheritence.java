package test.interface1;

 /**
  * IPrintable1 interface
 * @author 91952
 *
 */
interface IPrintable1 {// created interface IPrintable1
	 /**
	  * print method
	 * 
	 */
	void print(); // declared method print
 }
 /**
  * IShowable interface
 * @author 91952
 *
 */
interface IShowable{ //created interface IShowable
	 /**
	  * show method
	 * 
	 */
	void show(); // declared method show
 }
 /**
  * class for implementing inherited method for execution
 * @author 91952
 *
 */
class A7 implements IPrintable1,IShowable{ // child class A7 implements/inherits
	 //multiple parent IPrintable1 and IShowable
	 public void print() { //implementing method print inherited from IPrintable1
		 System.out.println("Hello");
	 }
	 public void show() { //implementing method print inherited from IShowable
		 System.out.println("Welcome");
	 }
	 /**
	  * main method
	 * @param args
	 */
	public static void main(String...args) { // main method
		 A7 obj = new A7(); // created object of A7
		 obj.print(); // calling method print
		 obj.show(); // calling method show
	 }
	 

}
