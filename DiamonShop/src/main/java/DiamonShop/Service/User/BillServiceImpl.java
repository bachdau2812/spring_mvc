package DiamonShop.Service.User;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import DiamonShop.Dao.BillDao;
import DiamonShop.Dto.CartDto;
import DiamonShop.Entity.Bill;
import DiamonShop.Entity.BillDetails;

@Service
public class BillServiceImpl implements IBillService{
	@Autowired
	private BillDao billDao;
	@Override
	public int addBill(Bill bill) {
		return billDao.addBill(bill);
	}

	@Override
	public void addBillDetail(HashMap<Integer, CartDto> cart) {
		int idBill = billDao.getIdLastBill();
		for(Map.Entry<Integer, CartDto> itemCart : cart.entrySet()) {
			BillDetails billDetail = new BillDetails();
			billDetail.setId_bill(idBill);
			billDetail.setId_product(itemCart.getValue().getProduct().getId_product());
			billDetail.setQty(itemCart.getValue().getQty());
			billDetail.setTotal(itemCart.getValue().getTotalPrice());
			billDao.addBillDetail(billDetail);
		}
	}

}
