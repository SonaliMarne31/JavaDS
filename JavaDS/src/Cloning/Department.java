package Cloning;

public class Department {
    private int id;
	private String name;

	
    public Department(int id, String name)
	{
		this.id = id;
		this.name = name;
	}

    // Only for Deep cloing we will need this
    //Defined clone method in Department class.
    // @Override
    // protected Object clone() throws CloneNotSupportedException {
    //     return super.clone();
    // }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
