package BaiGiuaKy;

import java.util.List;

public class ATVNCG {
	private int ozganizedTimes;
	private List<AnhTai> listOfAnhTai;
	private List<AnhTai> listOfAnhTaiToanNang;
	private List<AnhTai> listOfAnhTaiNoToanNang;
	private List<AnhTai> listOfAnhTaiBiLoai;
	private List<CongDien> listOfCongDien;
	/**
	 * @param ozganizedTimes
	 * @param listOfAnhTai
	 * @param listOfAnhTaiToanNang
	 * @param listOfAnhTaiNoToanNang
	 * @param listOfAnhTaiBiLoai
	 * @param listOfCongDien
	 */
	public ATVNCG(int ozganizedTimes, List<AnhTai> listOfAnhTai, List<AnhTai> listOfAnhTaiToanNang,
			List<AnhTai> listOfAnhTaiNoToanNang, List<AnhTai> listOfAnhTaiBiLoai, List<CongDien> listOfCongDien) {
		this.ozganizedTimes = ozganizedTimes;
		this.listOfAnhTai = listOfAnhTai;
		this.listOfAnhTaiToanNang = listOfAnhTaiToanNang;
		this.listOfAnhTaiNoToanNang = listOfAnhTaiNoToanNang;
		this.listOfAnhTaiBiLoai = listOfAnhTaiBiLoai;
		this.listOfCongDien = listOfCongDien;
	}
	public int getOzganizedTimes() {
		return ozganizedTimes;
	}
	public void setOzganizedTimes(int ozganizedTimes) {
		this.ozganizedTimes = ozganizedTimes;
	}
	public List<AnhTai> getListOfAnhTai() {
		return listOfAnhTai;
	}
	public void setListOfAnhTai(List<AnhTai> listOfAnhTai) {
		this.listOfAnhTai = listOfAnhTai;
	}
	public List<AnhTai> getListOfAnhTaiToanNang() {
		return listOfAnhTaiToanNang;
	}
	public void setListOfAnhTaiToanNang(List<AnhTai> listOfAnhTaiToanNang) {
		this.listOfAnhTaiToanNang = listOfAnhTaiToanNang;
	}
	public List<AnhTai> getListOfAnhTaiNoToanNang() {
		return listOfAnhTaiNoToanNang;
	}
	public void setListOfAnhTaiNoToanNang(List<AnhTai> listOfAnhTaiNoToanNang) {
		this.listOfAnhTaiNoToanNang = listOfAnhTaiNoToanNang;
	}
	public List<AnhTai> getListOfAnhTaiBiLoai() {
		return listOfAnhTaiBiLoai;
	}
	public void setListOfAnhTaiBiLoai(List<AnhTai> listOfAnhTaiBiLoai) {
		this.listOfAnhTaiBiLoai = listOfAnhTaiBiLoai;
	}
	public List<CongDien> getListOfCongDien() {
		return listOfCongDien;
	}
	public void setListOfCongDien(List<CongDien> listOfCongDien) {
		this.listOfCongDien = listOfCongDien;
	}
	@Override
	public String toString() {
		return "ATVNCG [ozganizedTimes=" + ozganizedTimes + ", listOfAnhTai=" + listOfAnhTai + ", listOfAnhTaiToanNang="
				+ listOfAnhTaiToanNang + ", listOfAnhTaiNoToanNang=" + listOfAnhTaiNoToanNang + ", listOfAnhTaiBiLoai="
				+ listOfAnhTaiBiLoai + ", listOfCongDien=" + listOfCongDien + "]";
	}
	
}
