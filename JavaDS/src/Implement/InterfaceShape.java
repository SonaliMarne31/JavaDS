package Implement;

public interface InterfaceShape {
    //implicitly public, static and final
	public String LABLE="Shape";
	
	//interface methods are implicitly abstract and public
	void draw();
	
	double getArea();
}
