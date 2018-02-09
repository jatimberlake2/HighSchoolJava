public class Test_My_class {	
	public static void main(String[] args) {
		My_class obj;
		obj = new My_class();
		System.out.println(obj.get_str()+" "+obj.get_num());
		obj = new My_class("aa1bc2d3");
		System.out.println(obj.get_str()+" "+obj.get_num());
		obj = new My_class(22);
		System.out.println(obj.get_str()+" "+obj.get_num());
		obj = new My_class("aa1bc2d3", 22);
		System.out.println(obj.get_str()+" "+obj.get_num());

	}

}