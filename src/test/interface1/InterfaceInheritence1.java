package test.interface1;

/**
 * IPrintable interface
 * @author 91952
 *
 */
interface IPrintable { //created an interface IPrintable
	/**
	 * print method
	 * 
	 */
	void print(); // declared method print
	/**
	 * IShowable interface
	 * @author 91952
	 *
	 */
	interface IShowable extends IPrintable{ //child interface IShowable extends/inherits parent IPrintable
		/**
		 * method show
		 * 
		 */
		void show(); // declared method show
	}
	/**
	 * TestInterface for implementing method and execution
	 * @author 91952
	 *
	 */
	class TestInterface implements IShowable{ ///child class TestInterface  implements/inherits parent  IShowable
		public void print() { //all child class must have to implements
			//the methods defined in the parent interface
			System.out.println("Hello"); //printing hello 
		}
		public void show() // implementing method show inherited from parent IShowable
		{
			System.out.println("welcome"); // printing welcome
		}
		/**
		 * main method
		 * @param args
		 */
		public static void main( String...args) { // main method for the execution
			TestInterface obj = new TestInterface(); // created object of TestInterface
			obj.print(); // calling method print
			obj.show(); // calling method show
			
			
			
			
		}
	}

}
