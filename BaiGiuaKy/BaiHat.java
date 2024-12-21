package BaiGiuaKy;

public class BaiHat {
	private String tenBaiHat;
	private String nhacSi;
	private String hoaAmPhoiKhi;
	private String yeuCau;
	/**
	 * @param tenBaiHat
	 * @param nhacSi
	 * @param hoaAmPhoiKhi
	 * @param yeuCau
	 */
	public BaiHat(String tenBaiHat, String nhacSi, String hoaAmPhoiKhi, String yeuCau) {
		this.tenBaiHat = tenBaiHat;
		this.nhacSi = nhacSi;
		this.hoaAmPhoiKhi = hoaAmPhoiKhi;
		this.yeuCau = yeuCau;
	}
	public String getTenBaiHat() {
		return tenBaiHat;
	}
	public void setTenBaiHat(String tenBaiHat) {
		this.tenBaiHat = tenBaiHat;
	}
	public String getNhacSi() {
		return nhacSi;
	}
	public void setNhacSi(String nhacSi) {
		this.nhacSi = nhacSi;
	}
	public String getHoaAmPhoiKhi() {
		return hoaAmPhoiKhi;
	}
	public void setHoaAmPhoiKhi(String hoaAmPhoiKhi) {
		this.hoaAmPhoiKhi = hoaAmPhoiKhi;
	}
	public String getYeuCau() {
		return yeuCau;
	}
	public void setYeuCau(String yeuCau) {
		this.yeuCau = yeuCau;
	}
	@Override
	public String toString() {
		return "BaiHat [tenBaiHat=" + tenBaiHat + ", nhacSi=" + nhacSi + ", hoaAmPhoiKhi=" + hoaAmPhoiKhi + ", yeuCau="
				+ yeuCau + "]" + "\n" + "\n";
	}
	
}
