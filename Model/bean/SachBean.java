package bean;

public class SachBean {
    private String maSach;
    private String tenSach;
    private String tacGia;
    private Long gia;
    private String anh;
    private String maLoai;
    
    public String getMaSach() {
        return maSach;
    }
    public SachBean(String maSach, String tenSach, String tacGia, Long gia, String anh, String maLoai) {
	super();
	this.maSach = maSach;
	this.tenSach = tenSach;
	this.tacGia = tacGia;
	this.gia = gia;
	this.anh = anh;
	this.maLoai = maLoai;
    }
    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }
    public String getTenSach() {
        return tenSach;
    }
    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }
    public String getTacGia() {
        return tacGia;
    }
    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }
    public Long getGia() {
        return gia;
    }
    public void setGia(Long gia) {
        this.gia = gia;
    }
    public String getMaLoai() {
        return maLoai;
    }
    public void setMaLoai(String maLoai) {
        this.maLoai = maLoai;
    }
    public String getAnh() {
        return anh;
    }
    public void setAnh(String anh) {
        this.anh = anh;
    }

  
}	


