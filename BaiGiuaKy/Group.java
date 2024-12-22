package BaiGiuaKy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Group {
	private String tenNhom;
	private HashMap<AnhTai, BaiHat> baihatCaNhan;
	private String baiHat;
	private double diemBinhChon;
	private List<AnhTai> listOfAnhTaiBiLoai;
	private HashMap<ArrayList<AnhTai>, BaiHat> baihatnhom;
	private int diemCuoiCung;
	
	/**
	 * @param tenNhom
	 * @param listOfThanhVien
	 * @param baiHat
	 * @param diemBinhChon
	 * @param listOfAnhTaiBiLoai
	 */
	public Group(String tenNhom, HashMap<AnhTai, BaiHat> baihatCaNhan, String baihat) {
		this.tenNhom = tenNhom;
		this.baihatCaNhan = baihatCaNhan != null ? baihatCaNhan : new HashMap<>();
		this.baiHat = baihat != null ? baihat : "Chưa có bài hát";
	}
	
	public Group(String tenNhom, HashMap<ArrayList<AnhTai>, BaiHat> baihatnhom, int point) {
		this.tenNhom = tenNhom;
		this.baihatnhom = baihatnhom != null ? baihatnhom : new HashMap<>();
		this.diemCuoiCung = point;
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
		return "Tên Nhóm: " + tenNhom + "\n" + "Tác Phẩm: " + "\n" + baihatCaNhan + "\n" + "Tên Bài Hát Chung: " + baiHat + "\n" + "--------------------------" + "\n";
	}
	public HashMap<ArrayList<AnhTai>, BaiHat> getBaihatnhom() {
		return baihatnhom;
	}
	public void setBaihatnhom(HashMap<ArrayList<AnhTai>, BaiHat> baihatnhom) {
		this.baihatnhom = baihatnhom;
	}

	public int getDiemCuoiCung() {
		return diemCuoiCung;
	}

	public void setDiemCuoiCung(int diemCuoiCung) {
		this.diemCuoiCung = diemCuoiCung;
	}
	 
    public static void findTwoGroupsWithLowestScores(List<Group> groups) {
        if (groups.size() < 2) {
            System.out.println("Không đủ nhóm để tìm.");
            return;
        }

        // Khởi tạo 2 nhóm có điểm thấp nhất
        Group min1 = groups.get(0);
        Group min2 = groups.get(1);

        // Đảm bảo min1 luôn có điểm thấp hơn min2
        if (min1.getDiemCuoiCung() > min2.getDiemCuoiCung()) {
            Group temp = min1;
            min1 = min2;
            min2 = temp;
        }

        // Duyệt qua các nhóm còn lại để tìm ra nhóm có điểm nhỏ nhất và nhóm có điểm nhỏ thứ 2
        for (int i = 2; i < groups.size(); i++) {
            Group currentGroup = groups.get(i);
            if (currentGroup.getDiemCuoiCung() < min1.getDiemCuoiCung()) {
                min2 = min1;
                min1 = currentGroup;
            } else if (currentGroup.getDiemCuoiCung() < min2.getDiemCuoiCung()) {
                min2 = currentGroup;
            }
        }
        // In kết quả
        System.out.println("--------------------------------------------");
        System.out.println("Hai nhóm có điểm nhỏ nhất và lọt vào nhóm nguy hiểm:");
        System.out.println(min1);
        System.out.println(min2);

}
}
