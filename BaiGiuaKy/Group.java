package BaiGiuaKy;

import java.util.HashMap;
import java.util.List;

public class Group {
	private String tenNhom;
	private HashMap<AnhTai, BaiHat> baihatCaNhan;
	private String baiHat;
	private double diemBinhChon;
	private List<AnhTai> listOfAnhTaiBiLoai;
	/**
	 * @param tenNhom
	 * @param listOfThanhVien
	 * @param baiHat
	 * @param diemBinhChon
	 * @param listOfAnhTaiBiLoai
	 */
	public Group(String tenNhom, HashMap<AnhTai, BaiHat> baihatCaNhan, String baihat) {
		this.tenNhom = tenNhom;
		this.baihatCaNhan = baihatCaNhan;
		this.baiHat = baihat;
	}
	public String getTenNhom() {
		return tenNhom;
	}
	public void setTenNhom(String tenNhom) {
		this.tenNhom = tenNhom;
	}
	public double getDiemBinhChon() {
		return diemBinhChon;
	}
	public void setDiemBinhChon(double diemBinhChon) {
		this.diemBinhChon = diemBinhChon;
	}
	public List<AnhTai> getListOfAnhTaiBiLoai() {
		return listOfAnhTaiBiLoai;
	}
	public void setListOfAnhTaiBiLoai(List<AnhTai> listOfAnhTaiBiLoai) {
		this.listOfAnhTaiBiLoai = listOfAnhTaiBiLoai;
	}
	public void display() {
		for (AnhTai key : baihatCaNhan.keySet()) {
		    BaiHat value = baihatCaNhan.get(key); // Lấy bài hát tương ứng
		    System.out.println(key + ": " + value);
		}
	}
	@Override
	public String toString() {
		return "Tên Nhóm: " + tenNhom + "\n" + "Tác Phẩm: " + "\n" + baihatCaNhan + "\n" + "Tên Bài Hát Chung: " + baiHat;
	}
}
