
public class Product {

	
	private int productId;
	private String productName;
	private int productPrice;
	
	static int count=1001;

	public Product(String productName, int productPrice) {
		super();
		productId=count;
		this.productName = productName;
		this.productPrice = productPrice;
		count++;
		
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}

	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		Product.count = count;
	}
	
	
	
	
	
	
	
	
}
