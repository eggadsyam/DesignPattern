/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Egga
 */
public class BukuFisika implements BukuBuilder{
    private Buku buku = null;

    public BukuFisika() {
        buku = new Buku();
    }
 
    @Override
    public void NamaBukuBuilder() {
        buku.setNamaBuku("Fisika Kuantum");
    }
 
    @Override
    public void PenulisBukuBuilder() {
        buku.setPenulisBuku("Ridwan Abdullah");
    }
 
    @Override
    public void PenerbitBukuBuilder() {
        buku.setPenerbitBuku("Bumi Aksara");  
    }
 
    @Override
    public Buku getBuku() {
        return buku;
    }
}
