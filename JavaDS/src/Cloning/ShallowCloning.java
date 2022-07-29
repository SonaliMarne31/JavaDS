package Cloning;
/* 
Shallow Copy of an Object
Shallow cloning is the “default implementation” in Java. In overridden clone() method, 
if we are not cloning all the object types (not primitives), then we are making a shallow copy.

All above examples are of shallow copy only, because we have not cloned the Department object on 
Employee class’s clone method. Now, I will move on to the next section where we will see the deep cloning.
 */

public class ShallowCloning {
    public static void main(String[] args) throws CloneNotSupportedException {

		Department hr = new Department(1, "Human Resource");

		Employee original = new Employee(1, "Admin", hr);
		Employee cloned = (Employee) original.clone();

		//Let change the department name in cloned object and we will verify in original object
		cloned.getDepartment().setName("Finance");

		System.out.println(original.getDepartment().getName());
		System.out.println(cloned.getDepartment().getName());
	}
}
