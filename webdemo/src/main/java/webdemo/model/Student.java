package webdemo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "student")
public class Student {
	@Id
	private int masv;
	
	private String tensv;
	
	private String diachi;
	
	private String email;
	
	private String sdt;

	@Override
	public String toString() {
		return "Student [masv=" + masv + ", tensv=" + tensv + ", diachi=" + diachi + ", email=" + email + ", sdt=" + sdt
				+ "]";
	}

	public int getMasv() {
		return masv;
	}

	public void setMasv(int masv) {
		this.masv = masv;
	}

	public String getTensv() {
		return tensv;
	}

	public void setTensv(String tensv) {
		this.tensv = tensv;
	}

	public String getDiachi() {
		return diachi;
	}

	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSdt() {
		return sdt;
	}

	public void setSdt(String sdt) {
		this.sdt = sdt;
	}

	public Student(int masv, String tensv, String diachi, String email, String sdt) {
		super();
		this.masv = masv;
		this.tensv = tensv;
		this.diachi = diachi;
		this.email = email;
		this.sdt = sdt;
	}
	
	public Student() {
		
	}
	
	
	
	
}
