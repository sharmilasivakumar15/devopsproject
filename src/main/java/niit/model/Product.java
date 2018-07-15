package niit.model;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Product {
	@Id
	@GeneratedValue
	
	private int productId;
	private String productDesc;
	private String productName;
	
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductDesc() {
		return productDesc;
	}
	public void setProductDesc(String productDesc) {
		this.productDesc = productDesc;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getCategoryId() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
