package webdemo.model;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class SinhVien {
	private int masv;
	private String tenSv;
	private HocSinh hocsinh;
	private List<HocSinh> listHS;
	private Map<String, Object> map;
	private Properties properties;
	
	public SinhVien() {
		
	}
	public Properties getProperties() {
		return properties;
	}
	public void setProperties(Properties properties) {
		this.properties = properties;
	}
	
	public List<HocSinh> getListHS() {
		return listHS;
	}

	public void setListHS(List<HocSinh> listHS) {
		this.listHS = listHS;
	}

	public Map<String, Object> getMap() {
		return map;
	}
	public void setMap(Map<String, Object> map) {
		this.map = map;
	}
	public SinhVien(HocSinh hs) {
		this.hocsinh = hs;
	}
	
	public HocSinh getHocsinh() {
		return hocsinh;
	}

	public void setHocsinh(HocSinh hocsinh) {
		this.hocsinh = hocsinh;
	}

	public SinhVien(int masv) {
		this.masv = masv;
	}
	
	public SinhVien(int masv, String tenSv) {
		this.masv = masv;
		this.tenSv = tenSv;
	}
	
	public int getMasv() {
		return masv;
	}
	public void setMasv(int masv) {
		this.masv = masv;
	}
	public String getTenSv() {
		return tenSv;
	}
	public void setTenSv(String tenSv) {
		this.tenSv = tenSv;
	}
//	public void Init() {
//		System.out.println("Khoi tao bean");
//	}
//	
//	public void Destroy() {
//		System.out.println("Ket thuc");
//	}
	
//	public static SinhVien createSv() {
//		SinhVien sv = new SinhVien();
//		sv.setMasv(22000071);
//		sv.setTenSv("Dau Duc Bach");
//		return sv;
//	}
	
//	public SinhVien createSv() {
//		SinhVien sv = new SinhVien();
//		sv.setMasv(22000071);
//		sv.setTenSv("Dau Duc Bach");
//		return sv;
//	}
	
	@Override
	public String toString() {
		return "SinhVien [masv=" + masv + ", tenSv=" + tenSv + "]";
	}

}
