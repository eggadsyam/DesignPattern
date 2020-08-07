/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Egga
 */
public class StatusBuku extends BukuDecorator{
    public StatusBuku(Buku buku){
        super(buku);
    }
    
    @Override
    public void detailBuku(){
        this.buku.detailBuku();
        this.statusBuku();
    }
    
    private void statusBuku(){
        System.out.println("Status Dipinjam");
    }
}
