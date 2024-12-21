package BaiGiuaKy;

import java.util.List;

public class AnhTai implements Comparable<AnhTai>{
	private String name;
	private String stageNage;
	private String yearOfBirth;
	private int soNamHoatDong;
	private List<String> listOfJob;
	private double score;
	private double firePowerScore;
	private int eliminatedRound;
	private List<CongDien> listOfCongDien;
	private List<Group> listOfGroup;
	private int diemBinhChon;
	private double diemcuaKhangia;
	/**
	 * @param name
	 * @param stageNage
	 * @param yearOfBirth
	 * @param listOfJob
	 * @param score
	 * @param firePowerScore
	 * @param eliminatedRound
	 * @param listOfCongDien
	 * @param listOfGroup
	 */
	public AnhTai(String name, String stageNage, String yearOfBirth, int soNamHoatDong, int diemBinhChon, double fire, double score, double sodiemkhangia) {
		this.name = name;
		this.stageNage = stageNage;
		this.yearOfBirth = yearOfBirth;
		this.soNamHoatDong = soNamHoatDong;
		this.diemBinhChon = diemBinhChon;
		this.firePowerScore = fire;
		this.score = score;
		this.diemcuaKhangia = sodiemkhangia;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStageNage() {
		return stageNage;
	}
	public void setStageNage(String stageNage) {
		this.stageNage = stageNage;
	}
	public String getYearOfBirth() {
		return yearOfBirth;
	}
	public void setYearOfBirth(String yearOfBirth) {
		this.yearOfBirth = yearOfBirth;
	}
	public int getNamHoatDong() {
		return soNamHoatDong;
	}
	public void setNamHoatDong(int soNamHoatDong) {
		this.soNamHoatDong = soNamHoatDong;
	}
	public List<String> getListOfJob() {
		return listOfJob;
	}
	public void setListOfJob(List<String> listOfJob) {
		this.listOfJob = listOfJob;
	}
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}
	public double getFirePowerScore() {
		return firePowerScore;
	}
	public void setFirePowerScore(double firePowerScore) {
		this.firePowerScore = firePowerScore;
	}
	public int getEliminatedRound() {
		return eliminatedRound;
	}
	public void setEliminatedRound(int eliminatedRound) {
		this.eliminatedRound = eliminatedRound;
	}
	public List<CongDien> getListOfCongDien() {
		return listOfCongDien;
	}
	public void setListOfCongDien(List<CongDien> listOfCongDien) {
		this.listOfCongDien = listOfCongDien;
	}
	public List<Group> getListOfGroup() {
		return listOfGroup;
	}
	public void setListOfGroup(List<Group> listOfGroup) {
		this.listOfGroup = listOfGroup;
	}
	
	public int getSoNamHoatDong() {
		return soNamHoatDong;
	}
	public void setSoNamHoatDong(int soNamHoatDong) {
		this.soNamHoatDong = soNamHoatDong;
	}
	public int getDiemBinhChon() {
		return diemBinhChon;
	}
	public void setDiemBinhChon(int diemBinhChon) {
		this.diemBinhChon = diemBinhChon;
	}
	
	public double getDiemcuaKhangia() {
		return diemcuaKhangia;
	}
	public void setDiemcuaKhangia(double diemcuaKhangia) {
		this.diemcuaKhangia = diemcuaKhangia;
	}
	@Override
	public String toString() {
		double x;
		x = firePowerScore + diemcuaKhangia;
		return "Anh tài: " + name + "\n" + "Năm sinh: " + yearOfBirth + "\n" + "Số năm hoạt động: " + soNamHoatDong + "\n" + "Số điểm bình chọn: " + diemBinhChon + "\n" + "Số hỏa lực: " + firePowerScore + "\n" + "Số điểm hỏa lực cá nhân: " + x + "\n";
		
	}
	@Override
	public int compareTo(AnhTai other) {
		// TODO Auto-generated method stub
		return Integer.compare(this.diemBinhChon, other.diemBinhChon);
	}
	
}
