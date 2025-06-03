package webdemo.model;

public class HocSinh extends SinhVien{
	private String diachi;
	
	public HocSinh(String diachi) {
		this.diachi = diachi;
	}
	
	public HocSinh(String diachi, int masv, String tensv) {
		super(masv, tensv);
		this.diachi = diachi;
	}
	public String getDiachi() {
		return diachi;
	}
	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}
	
	
}
