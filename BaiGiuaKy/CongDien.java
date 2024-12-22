package BaiGiuaKy;

import java.util.List;

public class CongDien {
	private String idCongDien;
	private String chuDeCongDien;
	private List<Group> danhSachCongDien;
	/**
	 * @param idCongDien
	 * @param chuDeCongDien
	 * @param danhSachCongDien
	 */
	public CongDien(String idCongDien, String chuDeCongDien, List<Group> danhSachCongDien) {
		this.idCongDien = idCongDien;
		this.chuDeCongDien = chuDeCongDien;
		this.danhSachCongDien = danhSachCongDien;
	}
	public String getIdCongDien() {
		return idCongDien;
	}
	public void setIdCongDien(String idCongDien) {
		this.idCongDien = idCongDien;
	}
	public String getChuDeCongDien() {
		return chuDeCongDien;
	}
	public void setChuDeCongDien(String chuDeCongDien) {
		this.chuDeCongDien = chuDeCongDien;
	}
	public List<Group> getDanhSachCongDien() {
		return danhSachCongDien;
	}
	public void setDanhSachCongDien(List<Group> danhSachCongDien) {
		this.danhSachCongDien = danhSachCongDien;
	}
	@Override
	public String toString() {
		return "Mã Công Diễn: " + idCongDien + "\n" + "Chủ Đề Công Diễn: " +chuDeCongDien + "\n" + "Danh Sách Công Diễn: " +"\n"+ "\n"
				+ danhSachCongDien + "\n";
	}
	
}
