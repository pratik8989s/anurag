
public class DriverMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Product p = new Product();
		
		
		
		Product pone=new Product("LCD",20000);
		
		
		Product psecond=new Product("Led",60000);
		
		
		Product pthird=new Product("Plasma",80000);
	
		System.out.println(pone.getProductId());
		System.out.println(psecond.getProductId());
		System.out.println(pthird.getProductId());
	}

	public DriverMain() {
		super();
		// TODO Auto-generated constructor stub
	}

}
