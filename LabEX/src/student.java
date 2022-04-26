/**
 * <p>Javadocs comments at class level
 * <p>====================================
 * 
 * 
 *<p> this is a class called student to capture student
 * details and display the same
 *<p>in the future the results of the student will
 * be integrated with this class
 * 
 * @author dont know
 * @version 1.0.0
 * @since 2022-03-23
 */
public class student {
	    String name;
		int age;
		/**
		 *<p> this is the constructor to 
		 *<p>initialise the attributes
		 * 
		 * @param name  this is the name of the student
		 * @param age  this is the age of the student
		 */
		public student(String name, int age)
		{
			this.name = name;
			this.age = age;
			
		}
		/**
		 * this is a copy constructor
		 * @param s object to be copied from
		 */
		public student(student s)
		{
			s.name = name;
			s.age = age;
		}
		/**
		 * this is a setter method
		 * @param age of the student
		 */
		public void setAge(int age)
		{
			this.age=age;
		}
		/**
		 * this is a getter method
		 * @return age of the student 
		 */
		public int getAge()
		{
			return age;
		}
		/**
		 * setter method
		 * @param name of student
		 */
		public void setName(String name) {
			this.name = name;
		}
		/**
		 * getter method
		 * @return name of student
		 */
		public String getName() {
			return name;
		}
		/**
		 * this is the method to display the student details
		 * this is a link to {@link #getName()}
		 * this is a link to {@link #getAge()}
		 */
		public void display()
		{
			
			System.out.println("name of the student is" + getName());
			System.out.println("age of the student is" + getAge());
		}
		/**
		 * this is the main program which is the entry point
		 * <p>for execute of this program
		 * @param args
		 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      student s1 = new student("jhon",23);
      s1.display();
	}

}
