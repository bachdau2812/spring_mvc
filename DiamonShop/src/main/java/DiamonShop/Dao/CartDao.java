package DiamonShop.Dao;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import DiamonShop.Dto.CartDto;
import DiamonShop.Dto.ProductDto;
@Repository
public class CartDao extends BaseDao{
	@Autowired
	ProductDao productDao = new ProductDao();
	
	public HashMap<Integer, CartDto> addCart(int id, HashMap<Integer, CartDto> cart) {
		CartDto itemCart = new CartDto();
		ProductDto product = productDao.findProductById(id);
		if(product != null) {
			if(!cart.containsKey(id)) {
				itemCart.setProduct(product);
				itemCart.setQty(1);
				itemCart.setTotalPrice(product.getPrice());
			}else {
				itemCart = cart.get(id);
				itemCart.setQty(itemCart.getQty() + 1);
				itemCart.setTotalPrice(itemCart.getQty() * itemCart.getProduct().getPrice());
			}
			cart.put(id, itemCart);
		}
		return cart;
	}
	
	public HashMap<Integer, CartDto> editCart(int id,int qty, HashMap<Integer, CartDto> cart) {
		if(cart == null) return cart;
		CartDto itemCart = new CartDto();
		if(cart.containsKey(id)) {
			itemCart = cart.get(id);
			itemCart.setQty(qty);
			itemCart.setTotalPrice(qty * itemCart.getProduct().getPrice());
		}
		
		cart.put(id, itemCart);
		return cart;
	}
	
	public HashMap<Integer, CartDto> deleteCart(int id, HashMap<Integer, CartDto> cart) {
		if(cart == null) return cart;
		if(cart.containsKey(id)) {
			cart.remove(id);
		}
		return cart;
	}
	
	public int totalQuantity(HashMap<Integer, CartDto> cart) {
		int total = 0;
		for(Map.Entry<Integer, CartDto> itemCart : cart.entrySet()) {
			total += itemCart.getValue().getQty();
		}
		return total;
	}
	
	public double totalPrice(HashMap<Integer, CartDto> cart) {
		double total = 0;
		for(Map.Entry<Integer, CartDto> itemCart : cart.entrySet()) {
			total += itemCart.getValue().getTotalPrice();
		}
		return total;
	}
}



















