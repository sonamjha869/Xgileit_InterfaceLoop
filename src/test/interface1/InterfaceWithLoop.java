package test.interface1;

/**
 * interface InterfaceWithLoop
 * @author 91952
 *
 */
interface InterfaceWithLoop { // created interface InterfaceWithLoop
	 static int[] arr = {1,2,3,4}; //created static array of data type int
	/**
	 * method print
	 * 
	 */
	void print(); // declared method print
}
class TestInterface2 implements InterfaceWithLoop{ // class TestInterface2 inherit/implement parent interface InterfaceWithLoop
	 public void print() { // all child class must have to implements
			//the methods defined in the parent interface
		for (int i =0; i< arr.length; i++) { // useing loop for array element
			System.out.println(arr[i]); // printing value i
		}
	 }
	 /**
	  * main method
	 * @param args
	 */
	public static void main (String ... args) { //main method 
		 InterfaceWithLoop obj =  new TestInterface2(); //created a object for InterfaceWithLoop . 
		// reference by TestInterface2
		 obj.print(); // calling method print
		 
	 }
	 
}
		
	

	
	


