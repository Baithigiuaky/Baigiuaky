package BaiGiuaKy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Test {
	
	public static void main(String[] args) {
		AnhTai TuanHung = new AnhTai("Tuấn Hưng", "Tuấn Hưng", "1978", 28, 0, 0, 0, 0);
		AnhTai BangKieu = new AnhTai("Bằng Kiều", "Bằng Kiều", "1973", 35, 0, 0, 0, 0);
		AnhTai TuLong = new AnhTai("Tự Long", "Tự Long", "1973", 25, 0, 0, 0, 0);
		AnhTai HongSon = new AnhTai("Hồng Sơn", "Hồng Sơn", "1970", 35, 0, 0, 0, 0);
		
		ArrayList<AnhTai> danhsach1 = new ArrayList<AnhTai>();
		danhsach1.add(TuanHung);
		danhsach1.add(BangKieu);
		danhsach1.add(TuLong);
		danhsach1.add(HongSon);
		
		AnhTai KayTran = new AnhTai("Kay Trần", "Kay Trần", "1994", 10, 0, 0, 0, 0);
		AnhTai Soobin = new AnhTai("Soobin", "Soobin", "1992", 14, 0, 0, 0, 0);
		AnhTai Cuongseven = new AnhTai("Cường Seven", "Cường Seven", "1989", 15, 0, 0, 0, 0);
		AnhTai KienUng = new AnhTai("Kiên Ứng", "Kiên Ứng", "1992", 14, 0, 0, 0, 0);
		
		ArrayList<AnhTai> danhsach2 = new ArrayList<AnhTai>();
		danhsach2.add(KayTran);
		danhsach2.add(Soobin);
		danhsach2.add(Cuongseven);
		danhsach2.add(KienUng);
		
		
		AnhTai PhanDinhTung = new AnhTai("Phan Đinh Tùng", "Phan Đinh Tùng", "1976", 25, 0, 0, 0, 0);
		AnhTai ThanhTrung = new AnhTai("Thành Trung", "Thành Trung", "1983", 21, 0, 0, 0, 0);
		AnhTai DoHoangHiep = new AnhTai("Đỗ Hoàng Hiệp", "Đỗ Hoàng Hiệp", "1986", 28, 0, 0, 0, 0);
		
		ArrayList<AnhTai> danhsach3 = new ArrayList<AnhTai>();
		danhsach3.add(PhanDinhTung);
		danhsach3.add(ThanhTrung);
		danhsach3.add(DoHoangHiep);
		
		AnhTai STrongTrongHieu = new AnhTai("Trọng Hiếu", "Trọng Hiếu", "1992", 9, 0, 0, 0, 0);
		AnhTai StSonThach = new AnhTai("St Sơn Thạch", "St Sơn Thạch", "1990", 25, 0, 0, 0, 0);
		AnhTai ThanhDuy = new AnhTai("Thanh Duy", "Thanh Duy", "1986", 17, 0, 0, 0, 0);
		AnhTai BBTran = new AnhTai("BB Trần", "BB Trần", "1990", 15, 0, 0, 0, 0);
		AnhTai NekoLe = new AnhTai("Neko Lê", "Neko Lê", "1990", 15, 0, 0, 0, 0);
		
		ArrayList<AnhTai> danhsach4 = new ArrayList<AnhTai>();
		danhsach4.add(STrongTrongHieu);
		danhsach4.add(StSonThach);
		danhsach4.add(ThanhDuy);
		danhsach4.add(BBTran);
		danhsach4.add(NekoLe);
		
		AnhTai Binz = new AnhTai("Binz", "Binz", "1988", 14, 0, 0, 0, 0);
		AnhTai Rhymastic = new AnhTai("Rhymastic", "Rhymastic", "1991", 15, 0, 0, 0, 0);
		AnhTai DinhTienDat = new AnhTai("Đinh Tiến Đạt", "Đinh Tiến Đạt", "1981", 29, 0, 0, 0, 0);
		AnhTai HaLe = new AnhTai("Hà Lê", "Hà Lê", "1984", 20, 0, 0, 0, 0);
		
		ArrayList<AnhTai> danhsach5 = new ArrayList<AnhTai>();
		danhsach5.add(Binz);
		danhsach5.add(Rhymastic);
		danhsach5.add(DinhTienDat);
		danhsach5.add(HaLe);
		
		AnhTai QuocThien = new AnhTai("Quốc Thiên", "Quốc Thiên", "1988", 16, 0, 0, 0, 0);
		AnhTai PhamKhanhHung = new AnhTai("Phạm Khánh Hưng", "Phạm Khánh Hưng", "1982", 25, 0, 0, 0, 0);
		AnhTai DangKhoi = new AnhTai("Đăng Khôi", "Đăng Khôi", "1983", 20, 0, 0, 0, 0);
		
		ArrayList<AnhTai> danhsach6 = new ArrayList<AnhTai>();
		danhsach6.add(QuocThien);
		danhsach6.add(PhamKhanhHung);
		danhsach6.add(DangKhoi);
		
		
		AnhTai DuyKhanh = new AnhTai("Duy Khánh", "Duy Khánh", "1995", 16, 0, 0, 0, 0);
		AnhTai TangPhuc = new AnhTai("Tăng Phúc", "Tăng Phúc", "1990", 7, 0, 0, 0, 0);
		AnhTai BuiCongNam = new AnhTai("Bùi Công Nam", "Bùi Công Nam", "1994", 7, 0, 0, 0, 0);
		AnhTai HuyR = new AnhTai("Huy R", "Huy R", "1995", 9, 0, 0, 0, 0);
		AnhTai JunPham = new AnhTai("Jun Phạm", "Jun Phạm", "1989", 14, 0, 0, 0, 0);
		
		ArrayList<AnhTai> danhsach7 = new ArrayList<AnhTai>();
		danhsach7.add(DuyKhanh);
		danhsach7.add(TangPhuc);
		danhsach7.add(BuiCongNam);
		danhsach7.add(HuyR);
		danhsach7.add(JunPham);
		
		AnhTai ThienMinh = new AnhTai("Thiên Minh", "Thiên Minh", "1990", 16, 0, 0, 0, 0);
		AnhTai TienLuat = new AnhTai("Tiến Luật", "Tiến Luật", "1982", 25, 0, 0, 0, 0);
		AnhTai TruongTheVinh = new AnhTai("Trương Thế Vinh", "Trương Thế Vinh", "1984", 22, 0, 0, 0, 0);
		AnhTai LienBinhPhat = new AnhTai("Liên Bỉnh Phát", "Liên Bỉnh Phát", "1990", 7, 0, 0, 0, 0);
		AnhTai NguyenTranDuyNhat = new AnhTai("Nguyễn Trần Duy Nhất", "Nguyễn Trần Duy Nhất", "1989", 29, 0, 0, 0, 0);
		
		ArrayList<AnhTai> danhsach8 = new ArrayList<AnhTai>();
		danhsach8.add(ThienMinh);
		danhsach8.add(TienLuat);
		danhsach8.add(TruongTheVinh);
		danhsach8.add(LienBinhPhat);
		danhsach8.add(NguyenTranDuyNhat);
		
		
		BaiHat bai1 = new BaiHat("Quả táo vàng", "Phúc Bồ", null, null);
		BaiHat bai2 = new BaiHat("Hè Muộn", "Bằng Kiều", null, null);
		BaiHat bai3 = new BaiHat("Tình Đát", "Tuấn Phương", null, null);
		BaiHat bai4 = new BaiHat("Niềm Tin Chiến Thắng", "Lê Quang", null, null);
		
		BaiHat bai5 = new BaiHat("Đường vào tim em", "Phúc Bồ", null, null);
		BaiHat bai6 = new BaiHat("Giá như", "Soobin, SlimV", null, null);
		BaiHat bai7 = new BaiHat("Quên lối về", "Cường Seven", null, null);
		BaiHat bai8 = new BaiHat("Diamond", "Lil Wuyn", null, null);
		
		BaiHat bai9 = new BaiHat("Bởi vì anh yêu em", "Phan Đinh Tùng", null, null);
		BaiHat bai10 = new BaiHat("Chiếc khăn gió ấm", "Nguyễn Văn Chung", null, null);
		BaiHat bai11 = new BaiHat("Trống vắng", "Quốc Hùng", null, null);
		
		BaiHat bai12 = new BaiHat("Rise Up", "Scott Quinn", null, null);
		BaiHat bai13 = new BaiHat("Thật xa thật gần", "Andiez Nam Trương", null, null);
		BaiHat bai14 = new BaiHat("Tình anh bán chiếu", "Thanh Duy", null, null);
		BaiHat bai15 = new BaiHat("Cánh hồng phai", "Hoàng Duy Long", null, null);
		BaiHat bai16 = new BaiHat("Yêu em dại khờ", "Nguyên Jenda", null, null);
		
		BaiHat bai17 = new BaiHat("Men Cry", "Binz", null, null);
		BaiHat bai18 = new BaiHat("Lặng", "Rhymastic", null, null);
		BaiHat bai19 = new BaiHat("Tặng cho anh ấy", "Hứa Kim Tuyền", null, null);
		BaiHat bai20 = new BaiHat("Quay lại giường đi em", "Khắc Hưng", null, null);
		
		BaiHat bai21 = new BaiHat("Hơn 1000 năm sau", "Trịnh Đình Quang", null, null);
		BaiHat bai22 = new BaiHat("Biết làm sao để quên em", "Phạm Khánh Hưng", null, null);
		BaiHat bai23 = new BaiHat("Cô bé mùa đông", "Phạm Toàn Thắng", null, null);
		
		BaiHat bai24 = new BaiHat("Think of you", "Thu Thủy, Pháo", null, null);
		BaiHat bai25 = new BaiHat("Đừng chờ anh nữa", "Huỳnh Quốc Huy", null, null);
		BaiHat bai26 = new BaiHat("Chúa tể", "Bùi Công Nam", null, null);
		BaiHat bai27 = new BaiHat("Cô gái M52", "Huy R", null, null);
		BaiHat bai28 = new BaiHat("Tân thời", "Huỳnh Hiền Năng", null, null);
		
		BaiHat bai29 = new BaiHat("Cho em & Đôi mắt", "Nguyễn Hải Phong", null, null);
		BaiHat bai30 = new BaiHat("Tình anh là đại dương", "Duy Mạnh", null, null);
		BaiHat bai31 = new BaiHat("Cánh hoa vụt mất", "Phạm Việt Hoàng", null, null);
		BaiHat bai32 = new BaiHat("Từng yêu", "Nguyễn Đình Dũng", null, null);
		BaiHat bai33 = new BaiHat("Vì anh thương em", "Võ Hòai Phúc", null, null);
		
		HashMap<AnhTai, BaiHat> baihatCaNhan = new HashMap<AnhTai, BaiHat>();
		baihatCaNhan.put(TuanHung, bai1);
		baihatCaNhan.put(BangKieu, bai2);
		baihatCaNhan.put(TuLong, bai3);
		baihatCaNhan.put(HongSon, bai4);
		
		HashMap<AnhTai, BaiHat> baihatCaNhan2 = new HashMap<AnhTai, BaiHat>();
		baihatCaNhan2.put(KayTran, bai5);
		baihatCaNhan2.put(Soobin, bai6);
		baihatCaNhan2.put(Cuongseven, bai7);
		baihatCaNhan2.put(KienUng, bai8);
		
		HashMap<AnhTai, BaiHat> baihatCaNhan3 = new HashMap<AnhTai, BaiHat>();
		baihatCaNhan3.put(PhanDinhTung, bai9);
		baihatCaNhan3.put(ThanhTrung, bai10);
		baihatCaNhan3.put(DoHoangHiep, bai11);
		
		
		HashMap<AnhTai, BaiHat> baihatCaNhan4 = new HashMap<AnhTai, BaiHat>();
		baihatCaNhan4.put(STrongTrongHieu, bai12);
		baihatCaNhan4.put(StSonThach, bai13);
		baihatCaNhan4.put(ThanhDuy, bai14);
		baihatCaNhan4.put(BBTran, bai15);
		baihatCaNhan4.put(NekoLe, bai16);
		
		HashMap<AnhTai, BaiHat> baihatCaNhan5 = new HashMap<AnhTai, BaiHat>();
		baihatCaNhan5.put(Binz, bai17);
		baihatCaNhan5.put(Rhymastic, bai18);
		baihatCaNhan5.put(DinhTienDat, bai19);
		baihatCaNhan5.put(HaLe, bai20);
		
		HashMap<AnhTai, BaiHat> baihatCaNhan6 = new HashMap<AnhTai, BaiHat>();
		baihatCaNhan6.put(QuocThien, bai21);
		baihatCaNhan6.put(PhamKhanhHung, bai22);
		baihatCaNhan6.put(DangKhoi, bai23);
		
		HashMap<AnhTai, BaiHat> baihatCaNhan7 = new HashMap<AnhTai, BaiHat>();
		baihatCaNhan7.put(DuyKhanh, bai24);
		baihatCaNhan7.put(TangPhuc, bai25);
		baihatCaNhan7.put(BuiCongNam, bai26);
		baihatCaNhan7.put(HuyR, bai27);
		baihatCaNhan7.put(JunPham, bai28);
		
		HashMap<AnhTai, BaiHat> baihatCaNhan8 = new HashMap<AnhTai, BaiHat>();
		baihatCaNhan8.put(ThienMinh, bai29);
		baihatCaNhan8.put(TienLuat, bai30);
		baihatCaNhan8.put(TruongTheVinh, bai31);
		baihatCaNhan8.put(LienBinhPhat, bai32);
		baihatCaNhan8.put(NguyenTranDuyNhat, bai33);
		
		// Thong tin tat ca cac anh tai 
		Group g1 = new Group("Anh tài huyền thoại" + "\n", baihatCaNhan, "Quê Hương Tuổi Thơ Tôi & Nếu Có Yêu Tôi");
		Group g2 = new Group("Nam thần rực lửa" + "\n", baihatCaNhan2, "Nước Hoa");
		Group g3 = new Group("Anh tài sục sôi" + "\n", baihatCaNhan3, "Đón bình minh");
		Group g4 = new Group("Anh tài bí ẩn" + "\n", baihatCaNhan4, "Người lạ ơi");
		Group g5 = new Group("Anh tài nham thạch" + "\n", baihatCaNhan5, "Khiến nó ngầu");
		Group g6 = new Group("Thanh xuân học đường" + "\n", baihatCaNhan6, "Sóng tình");
		Group g7 = new Group("Anh tài đa sắc" + "\n", baihatCaNhan7, "Anh nhà ở đâu thế");
		Group g8 = new Group("Quý ông đa tình" + "\n", baihatCaNhan8, "Phía sau 1 cô gái");
		
		ArrayList<Group> danhsachNhomWhoAmI = new ArrayList<Group>();
		danhsachNhomWhoAmI.add(g1);
		danhsachNhomWhoAmI.add(g2);
		danhsachNhomWhoAmI.add(g3);
		danhsachNhomWhoAmI.add(g4);
		danhsachNhomWhoAmI.add(g5);
		danhsachNhomWhoAmI.add(g6);
		danhsachNhomWhoAmI.add(g7);
		danhsachNhomWhoAmI.add(g8);
		
		CongDien sanKhauRaMat = new CongDien("Sân Khâu Ra Mắt", "Hãy gọi tôi là", danhsachNhomWhoAmI);
		System.out.println(sanKhauRaMat);
		
		System.out.println("Sau vòng Who am i. Số điểm bình chọn của khán giả có như sau." + "\n");
		
		TuanHung.setDiemBinhChon(1260);
		BangKieu.setDiemBinhChon(470);
		TuLong.setDiemBinhChon(830);
		HongSon.setDiemBinhChon(390);
		
		KayTran.setDiemBinhChon(1100);
		Soobin.setDiemBinhChon(1190);
		Cuongseven.setDiemBinhChon(440);
		KienUng.setDiemBinhChon(230);
		
		
		
		System.out.println(g1);
		System.out.println("-------------------------------------");
		System.out.println(g2);
		
		System.out.println("-------------------------------------");
		System.out.println("Và đây là điểm đầy đủ: " + "\n");
		
		TuanHung.setDiemcuaKhangia(180);
		BangKieu.setDiemcuaKhangia(130);
		TuLong.setDiemcuaKhangia(160);
		HongSon.setDiemcuaKhangia(130);
		
		KayTran.setDiemcuaKhangia(520);
		Soobin.setDiemcuaKhangia(480);
		Cuongseven.setDiemcuaKhangia(230);
		KienUng.setDiemcuaKhangia(260);
		
		AnhTai maxDiemBinhChon = Collections.max(danhsach1);
		maxDiemBinhChon.setFirePowerScore(300);
		
		AnhTai maxDiemBinhChon2 = Collections.max(danhsach2);
		maxDiemBinhChon2.setFirePowerScore(300);
		
		System.out.println(g1);
		System.out.println("-------------------------------------");
		System.out.println(g2);
		System.out.println("-------------------------------------");
		System.out.println("-------------------------------------");
		System.out.println("-------------------------------------");
		
		
		System.out.println("Đây là danh sách thi vòng công diễn 1" + "\n");
		ArrayList<AnhTai> ds1 = new ArrayList<AnhTai>();
		ds1.add(STrongTrongHieu);
		ds1.add(LienBinhPhat);
		ds1.add(NguyenTranDuyNhat);
		ds1.add(TuanHung);
		
		ArrayList<AnhTai> ds2 = new ArrayList<AnhTai>();
		ds2.add(ThanhTrung);
		ds2.add(HaLe);
		ds2.add(DoHoangHiep);
		ds2.add(QuocThien);
		ds2.add(KienUng);
		
		ArrayList<AnhTai> ds3 = new ArrayList<AnhTai>();
		ds3.add(PhamKhanhHung);
		ds3.add(TruongTheVinh);
		ds3.add(JunPham);
		ds3.add(BBTran);
		ds3.add(HuyR);
		
		ArrayList<AnhTai> ds4 = new ArrayList<AnhTai>();
		ds4.add(TienLuat);
		ds4.add(DinhTienDat);
		ds4.add(Rhymastic);
		
		ArrayList<AnhTai> ds5 = new ArrayList<AnhTai>();
		ds5.add(Soobin);
		ds5.add(Cuongseven);
		ds5.add(TuLong);
		
		ArrayList<AnhTai> ds6 = new ArrayList<AnhTai>();
		ds6.add(BangKieu);
		ds6.add(HongSon);
		ds6.add(StSonThach);
		ds6.add(Binz);
		
		ArrayList<AnhTai> ds7 = new ArrayList<AnhTai>();
		ds7.add(PhanDinhTung);
		ds7.add(NekoLe);
		ds7.add(KayTran);
		ds7.add(TangPhuc);
		ds7.add(DangKhoi);

		ArrayList<AnhTai> ds8 = new ArrayList<AnhTai>();
		ds8.add(ThienMinh);
		ds8.add(BuiCongNam);
		ds8.add(DuyKhanh);
		ds8.add(ThanhDuy);
		
		BaiHat baihat1 = new BaiHat("Ba kể con nghe & Dưới ánh đèn sân khấu", "Nguyễn Hải Phong, Hứa Kim Tuyền,", null, null);
		HashMap<ArrayList<AnhTai>, BaiHat> baihatnhom1 = new HashMap<ArrayList<AnhTai>, BaiHat>();
		baihatnhom1.put(ds1, baihat1);
		
		BaiHat baihat2 = new BaiHat("Một lần dang dở & Đi qua cầu vồng", "Nhật Ngân, Mặc Thế Nhân", null, null);
		HashMap<ArrayList<AnhTai>, BaiHat> baihatnhom2 = new HashMap<ArrayList<AnhTai>, BaiHat>();
		baihatnhom2.put(ds2, baihat2);
		
		
		BaiHat baihat3 = new BaiHat("Vợ người ta & Chuyện ba người", "Phan Mạnh Quỳnh, Quốc Dũng", null, null);
		HashMap<ArrayList<AnhTai>, BaiHat> baihatnhom3 = new HashMap<ArrayList<AnhTai>, BaiHat>();
		baihatnhom3.put(ds3, baihat3);
		
		BaiHat baihat4 = new BaiHat("Lột xác & Chuyện nhỏ", "Nguyễn Hải Phong, Tuấn Khanh", null, null);
		HashMap<ArrayList<AnhTai>, BaiHat> baihatnhom4 = new HashMap<ArrayList<AnhTai>, BaiHat>();
		baihatnhom4.put(ds4, baihat4);
		
		BaiHat baihat5 = new BaiHat("Trống cơm", "Dân ca Bắc Bộ", "Charles, APJ", null);
		HashMap<ArrayList<AnhTai>, BaiHat> baihatnhom5 = new HashMap<ArrayList<AnhTai>, BaiHat>();
		baihatnhom5.put(ds5, baihat5);
		
		
		BaiHat baihat6 = new BaiHat("Tỉnh thức sau giấc ngủ đông", "Kai Đinh, Grey D", "Bin Z", null);
		HashMap<ArrayList<AnhTai>, BaiHat> baihatnhom6 = new HashMap<ArrayList<AnhTai>, BaiHat>();
		baihatnhom6.put(ds6, baihat6);
		
		BaiHat baihat7 = new BaiHat("Dịu dàng đến từng phút giây & Bước đến bên em", "Lương Bằng Quang, Khắc Hưng", "Neko Lê", "Kay Trần");
		HashMap<ArrayList<AnhTai>, BaiHat> baihatnhom7 = new HashMap<ArrayList<AnhTai>, BaiHat>();
		baihatnhom7.put(ds7, baihat7);
	
		
		BaiHat baihat8 = new BaiHat("Áo mùa đông & Trở về", "Đỗ Nhuận, Dương Thụ", " Bùi Công Nam", null);
		HashMap<ArrayList<AnhTai>, BaiHat> baihatnhom8 = new HashMap<ArrayList<AnhTai>, BaiHat>();
		baihatnhom8.put(ds8, baihat8);
	
		Group damme = new Group("Đam mê", baihatnhom1,0);
		Group hat = new Group("Hát", baihatnhom2,0);
		Group nguHanh = new Group("Ngũ hành", baihatnhom3,0);
		Group taiSinh = new Group("Tái sinh", baihatnhom4,0);
		Group saoSang = new Group("Sao sáng", baihatnhom5,0);
		Group xuanHaThuDong = new Group("Xuân hạ thu đông", baihatnhom6,0);
		Group kk = new Group("KK", baihatnhom7,0);
		Group xuongRong = new Group("Xương rồng", baihatnhom8,0);
		
		ArrayList<Group> danhsachCongDien1 = new ArrayList<Group>();
		danhsachCongDien1.add(damme);
		danhsachCongDien1.add(hat);
		danhsachCongDien1.add(nguHanh);
		danhsachCongDien1.add(taiSinh);
		danhsachCongDien1.add(saoSang);
		danhsachCongDien1.add(xuanHaThuDong);
		danhsachCongDien1.add(kk);
		danhsachCongDien1.add(xuongRong);
		
		CongDien congdien1 = new CongDien("CD1", "Người thiếu niên thuở nào", danhsachCongDien1);
		for (Group group : danhsachCongDien1) {
			System.out.println(group.getBaihatnhom());
		}
		
		damme.setDiemCuoiCung(760);
		hat.setDiemCuoiCung(650);
		nguHanh.setDiemCuoiCung(1660);
		taiSinh.setDiemCuoiCung(900);
		saoSang.setDiemCuoiCung(1490);
		xuanHaThuDong.setDiemCuoiCung(1680);
		kk.setDiemCuoiCung(1060);
		xuongRong.setDiemCuoiCung(1750);
		
		Group.findTwoGroupsWithLowestScores(danhsachCongDien1);
		
			
	ArrayList<AnhTai> ds1v2 = new ArrayList<AnhTai>();
	ds1v2.add(PhanDinhTung);
	ds1v2.add(NguyenTranDuyNhat);
	ds1v2.add(TangPhuc);
	ds1v2.add(LienBinhPhat);
	ds1v2.add(STrongTrongHieu);
	ds1v2.add(KayTran);
	
	ArrayList<AnhTai> ds2v2 = new ArrayList<AnhTai>();
	ds2v2.add(BangKieu);
	ds2v2.add(ThanhDuy);
	ds2v2.add(BuiCongNam);
	ds2v2.add(Binz);
	ds2v2.add(ThienMinh);
	ds2v2.add(DuyKhanh);
	
	ArrayList<AnhTai> ds3v2 = new ArrayList<AnhTai>();
	ds3v2.add(JunPham);
	ds3v2.add(HuyR);
	ds3v2.add(HaLe);
	ds3v2.add(TruongTheVinh);
	ds3v2.add(KienUng);
	ds3v2.add(BBTran);
	
	ArrayList<AnhTai> ds4v2 = new ArrayList<AnhTai>();
	ds4v2.add(TuLong);
	ds4v2.add(DinhTienDat);
	ds4v2.add(QuocThien);
	ds4v2.add(Cuongseven);
	ds4v2.add(Rhymastic);
	ds4v2.add(Soobin);
	
	BaiHat baihatn1v2 = new BaiHat("Giàu sang", "Rhymastic", null, null);
	BaiHat baihatn2v2 = new BaiHat("Dẫu có lỗi lầm", "Hồ Hoài Anh", null, null);
	BaiHat baihatn3v2 = new BaiHat("Tình yêu ngủ quêng", "Hoàng Tôn", null, null);
	BaiHat baihatn4v2 = new BaiHat("Chợt nghe bước em về", "Quốc Vượng", null, null);
	BaiHat baihatn5v2 = new BaiHat("Những kẻ mộng mơ", "Nguyễn Bảo Trọng", null, null);
	BaiHat baihatn6v2 = new BaiHat("Bao tiền một mớ bình yên?", "14 Casper", null, null);
	BaiHat baihatn7v2 = new BaiHat("Gót hồng Cao gót", "(ảo Phúc, Soobin,", null, null);
	BaiHat baihatn8v2 = new BaiHat("Nếu một mai tôi bay lên trời", "Hứa Kim Tuyền", null, null);
	
	HashMap<ArrayList<AnhTai>, BaiHat> baihatN1v2 = new HashMap<ArrayList<AnhTai>, BaiHat>();
	baihatN1v4.put(ds1v2, baihatn1v2);
			
	HashMap<ArrayList<AnhTai>, BaiHat> baihatN2v2 = new HashMap<ArrayList<AnhTai>, BaiHat>();
	baihatN2v4.put(ds2v2, baihatn2v2);
			
	HashMap<ArrayList<AnhTai>, BaiHat> baihatN3v2 = new HashMap<ArrayList<AnhTai>, BaiHat>();
	baihatN3v4.put(ds3v2, baihatn3v2);
			
	HashMap<ArrayList<AnhTai>, BaiHat> baihatN4v2 = new HashMap<ArrayList<AnhTai>, BaiHat>();
	baihatN4v4.put(ds4v2, baihatn4v2);
		
	BangKieu.setFirePowerScore(90);
	TuLong.setFirePowerScore(120);
	PhanDinhTung.setFirePowerScore(170);
	HuyR.setFirePowerScore(40);
	NguyenTranDuyNhat.setFirePowerScore(270);
	LienBinhPhat.setFirePowerScore(230);
	KayTran.setFirePowerScore(130);
	
	List<AnhTai> anhTaiList1 = new ArrayList<>();
    anhTaiList1.add(PhanDinhTung);
    anhTaiList1.add(NguyenTranDuyNhat);
    anhTaiList1.add(TangPhuc);
    anhTaiList1.add(LienBinhPhat);
    anhTaiList1.add(STrongTrongHieu);
    anhTaiList1.add(KayTran);
    anhTaiList1.add(BangKieu);
    anhTaiList1.add(ThanhDuy);
    anhTaiList1.add(BuiCongNam);
    anhTaiList1.add(Binz);
    anhTaiList1.add(ThienMinh);
    anhTaiList1.add(DuyKhanh);
    anhTaiList1.add(JunPham);
    anhTaiList1.add(HuyR);
    anhTaiList1.add(HaLe);
    anhTaiList1.add(TruongTheVinh);
    anhTaiList1.add(KienUng);
    anhTaiList1.add(BBTran);
    anhTaiList1.add(TuLong);
    anhTaiList1.add(DinhTienDat);
    anhTaiList1.add(QuocThien);
    anhTaiList1.add(Cuongseven);
    anhTaiList1.add(Rhymastic);
    anhTaiList1.add(Soobin);
	
    AnhTai.removeTwoLowestFirePower(anhTaiList1);
    
   
    System.out.println("Danh sách còn lại:");
    for (AnhTai anhTai : anhTaiList1) {
        System.out.println(anhTai.getName() + " - Điểm hỏa lực: " + anhTai.getFirePowerScore());
    }		
			vog4
		ArrayList<AnhTai> ds1v4 = new ArrayList<AnhTai>();
	ds1v4.add(NekoLe);
	ds1v4.add(TangPhuc);
	ds1v4.add(ThienMinh);
	ds1v4.add(BBTran);
	ds1v4.add(StSonThach);
	ds1v4.add(KayTran);
	ds1v4.add(BuiCongNam);
	ArrayList<AnhTai> ds2v4 = new ArrayList<AnhTai>();
	ds2v4.add(DinhTienDat);
	ds2v4.add(TienLuat);
	ds2v4.add(QuocThien);
	ds2v4.add(Binz);
	ds2v4.add(Rhymastic);
	ds2v4.add(DuyKhanh);
	ArrayList<AnhTai> ds3v4 = new ArrayList<AnhTai>();
	ds3v4.add(BangKieu);
	ds3v4.add(PhanDinhTung);
	ds3v4.add(PhamKhanhHung);
	ds3v4.add(TruongTheVinh);
	ds3v4.add(DoHoangHiep);
	ds3v4.add(NguyenTranDuyNhat);
	ArrayList<AnhTai> ds4v4 = new ArrayList<AnhTai>();
	ds4v4.add(TuLong);
	ds4v4.add(TuanHung);
	ds4v4.add(DangKhoi);
	ds4v4.add(ThanhDuy);
	ds4v4.add(Cuongseven);
	ds4v4.add(JunPham);
	ds4v4.add(STrongTrongHieu);
	ds4v4.add(Soobin);
	
	BaiHat baihatn1v4 = new BaiHat("Mưa trên phố Huế", "Minh Kỳ", null, null);
	BaiHat baihatn2v4 = new BaiHat("Đào liễu", "Cheo Co", null, null);
	BaiHat baihatn3v4 = new BaiHat("Dạ cổ hoài lang", "Cao Văn Lầu", null, null);
	BaiHat baihatn4v4 = new BaiHat("Chiếc khăn piêu", "Doãn Nho", null, null);
	
	HashMap<ArrayList<AnhTai>, BaiHat> baihatN1v4 = new HashMap<ArrayList<AnhTai>, BaiHat>();
	baihatN1v4.put(ds1v4, baihatn1v4);
	HashMap<ArrayList<AnhTai>, BaiHat> baihatN2v4 = new HashMap<ArrayList<AnhTai>, BaiHat>();
	baihatN2v4.put(ds2v4, baihatn2v4);
	HashMap<ArrayList<AnhTai>, BaiHat> baihatN3v4 = new HashMap<ArrayList<AnhTai>, BaiHat>();
	baihatN3v4.put(ds3v4, baihatn3v4);
	HashMap<ArrayList<AnhTai>, BaiHat> baihatN4v4 = new HashMap<ArrayList<AnhTai>, BaiHat>();
	baihatN4v4.put(ds4v4, baihatn4v4);
    }	
	}
}
