package test.interface1;

/**
 * IDrawable interface
 * @author 91952
 *
 */
interface IDrawable { // created an interface IDrawable
	/**
	 * print method
	 * 
	 */
	void draw(); // declared method print
}
 /**
  * implementation ofIDrawable
 * @author 91952
 *
 */
class Rectangle implements IDrawable{ // child class rectangle implements/inherits parent IDrawable 
	/**
	 * implementation of method draw
	 *
	 */
	public void draw() // all child class must have to implements
	//the methods defined in the parent interface
	{
		System.out.println("drawing rectangle");} // printing drawing rectangle
	}
	/**
	 * executable class
	 * @author 91952
	 *
	 */
	class TestInterface1{ // created class TestInterface1
		/**
		 * main method for execution
		 * @param args
		 */
		public static void main (String...args) { // created main method for execute
			IDrawable d = new Rectangle(); //created a object for rectangle class. reference by IDrawable
			d.draw(); // calling method draw
			
		}
	}

	


