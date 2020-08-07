/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Egga
 */
public class BukuMatematika implements BukuBuilder{
    private Buku buku = null;

    public BukuMatematika() {
        buku = new Buku();
    }
 
    @Override
    public void NamaBukuBuilder() {
        buku.setNamaBuku("Matematika Dasar");
    }
 
    @Override
    public void PenulisBukuBuilder() {
        buku.setPenulisBuku("Afidah Khairunnisa");
    }
 
    @Override
    public void PenerbitBukuBuilder() {
        buku.setPenerbitBuku("Rajagrafindo");  
    }
 
    @Override
    public Buku getBuku() {
        return buku;
    }
}
