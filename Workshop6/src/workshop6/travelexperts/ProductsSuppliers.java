package travelexperts;

// default package
// Generated 29-Aug-2017 10:13:16 AM by Hibernate Tools 5.2.5.Final

/**
 * ProductsSuppliers generated by hbm2java
 */
public class ProductsSuppliers implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer productSupplierId;
	private Integer productId;
	private Integer supplierId;

	public ProductsSuppliers() {
	}

	public ProductsSuppliers(Integer productId, Integer supplierId) {
		this.productId = productId;
		this.supplierId = supplierId;
	}

	public Integer getProductSupplierId() {
		return this.productSupplierId;
	}

	public void setProductSupplierId(Integer productSupplierId) {
		this.productSupplierId = productSupplierId;
	}

	public Integer getProductId() {
		return this.productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public Integer getSupplierId() {
		return this.supplierId;
	}

	public void setSupplierId(Integer supplierId) {
		this.supplierId = supplierId;
	}

}
