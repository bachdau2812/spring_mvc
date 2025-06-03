package DiamonShop.Service.User;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import DiamonShop.Dao.CartDao;
import DiamonShop.Dto.CartDto;

@Service
public class CartServiceImpl implements ICartService{
	@Autowired
	private CartDao ct;

	@Override
	public HashMap<Integer, CartDto> addCart(int id, HashMap<Integer, CartDto> cart) {
		return ct.addCart(id, cart);
	}

	@Override
	public HashMap<Integer, CartDto> editCart(int id, int qty, HashMap<Integer, CartDto> cart) {
		return ct.editCart(id, qty, cart);
	}

	@Override
	public HashMap<Integer, CartDto> deleteCart(int id, HashMap<Integer, CartDto> cart) {
		return ct.deleteCart(id, cart);
	}

	@Override
	public int totalQuantity(HashMap<Integer, CartDto> cart) {
		return ct.totalQuantity(cart);
	}

	@Override
	public double totalPrice(HashMap<Integer, CartDto> cart) {
		return ct.totalPrice(cart);
	}
	
}
