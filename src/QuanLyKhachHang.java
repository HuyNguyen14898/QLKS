/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MyAdmin
 */
public class QuanLyKhachHang {
    
    private final int MAKH;
    private final String HOTEN;
    private final String MSDINHDANH;
    private final  String NGAYSINH;
    private final boolean GT;

    public QuanLyKhachHang(int maKH, String tenKH, String msDD, String NS, boolean gt) {
        this.MAKH=maKH;
        this.HOTEN=tenKH;
        this.MSDINHDANH=msDD;
        this.NGAYSINH=NS;
        this.GT=gt;
    }

    public int getMAKH()
    {
     return MAKH;
    }
    public String getHOTEN()
    {
        return HOTEN;
    }
    public  String getNgaysinh()
    {
        return NGAYSINH;
    }
    public String getMSDINHDANH()
    {
        return MSDINHDANH;
    }
    public boolean getGT()
    {
        return GT;
    }
    
    
}
