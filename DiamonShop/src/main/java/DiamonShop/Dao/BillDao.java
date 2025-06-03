package DiamonShop.Dao;

import org.springframework.stereotype.Repository;

import DiamonShop.Entity.Bill;
import DiamonShop.Entity.BillDetails;

@Repository
public class BillDao extends BaseDao{
	public int addBill(Bill bill) {
		StringBuffer  sql = new StringBuffer();
		sql.append("INSERT INTO bills (username, phone, display_name, address, total, qty, note) ");
		sql.append("VALUES ");
		sql.append("( ");
		sql.append("    '"+bill.getUsername()+"', ");
		sql.append("    '"+bill.getPhone()+"', ");
		sql.append("    '"+bill.getDisplay_name()+"', ");
		sql.append("    '"+bill.getAddress()+"', ");
		sql.append("    "+bill.getTotal()+", ");
		sql.append("    "+bill.getQty()+", ");
		sql.append("    '"+bill.getNote()+"' ");
		sql.append(")");
		int insert = _jdbcTemplate.update(sql.toString());
		
		return insert;
	}
	
	public int getIdLastBill() {
		StringBuffer sql = new StringBuffer();
		sql.append("select max(id) from bills");
		
		int id = _jdbcTemplate.queryForObject(sql.toString(), Integer.class);
		return id;
	}
	
	public int addBillDetail(BillDetails billDetail) {
		StringBuffer  sql = new StringBuffer();
		sql.append("INSERT INTO billdetails (id_product, id_bill, qty, total) ");
		sql.append("VALUES ");
		sql.append("( ");
		sql.append("    '"+billDetail.getId_product()+"', ");
		sql.append("    '"+billDetail.getId_bill()+"', ");
		sql.append("    '"+billDetail.getQty()+"', ");
		sql.append("    '"+billDetail.getTotal()+"' ");
		
		sql.append(")");
		int insert = _jdbcTemplate.update(sql.toString());
		
		return insert; 
	}
	
}





























