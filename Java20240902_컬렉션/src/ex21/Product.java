package ex21;

public class Product {
	String productID;
	String productName;
	String productPrice;
	
	Product(String productID, String productName, String productPrice) {
		this.productID = productID;
		this.productName = productName;
		this.productPrice = productPrice;
	}

	@Override
	public int hashCode() {
		return productID.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		return this.productID.equals( ((Product)obj).productID);
	}

	public String getProductID() {
		return productID;
	}

	public String getProductName() {
		return productName;
	}

	public String getProductPrice() {
		return productPrice;
	}
	
	
	
}
