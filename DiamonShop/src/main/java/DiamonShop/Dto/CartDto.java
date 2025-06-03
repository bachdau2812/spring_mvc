package DiamonShop.Dto;

public class CartDto {
	private int qty;
	private double totalPrice;
	private ProductDto product;
	
	public CartDto(){
		super();
	}
	
	public CartDto(int qty, double totalPrice, ProductDto product) {
		super();
		this.qty = qty;
		this.totalPrice = totalPrice;
		this.product = product;
	}
		
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
	public ProductDto getProduct() {
		return product;
	}
	public void setProduct(ProductDto product) {
		this.product = product;
	}
	
	
	
}
