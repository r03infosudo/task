package bean;

public class Product implements java.io.Serializable {

	private String productCode;
	private String productName;

	public String getProductCode() {
		return productCode;
	}
	public String getProductName() {
		return productName;
	}

	public void setProductCode(String productCode) {
		this.productCode=productCode;
	}
	public void setProductName(String productName) {
		this.productName=productName;
	}
}
