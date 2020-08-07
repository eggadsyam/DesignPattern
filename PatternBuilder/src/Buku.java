/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Egga
 */
public class Buku{
    private String NamaBuku,PenulisBuku, PenerbitBuku;
    
    public void setNamaBuku(String namabuku){
            this.NamaBuku = namabuku;
    }
    
    public String getNamaBuku(){
            return this.NamaBuku;
    }
    
    public void setPenulisBuku(String penulisbuku){
            this.PenulisBuku = penulisbuku;
    }
    
    public String getPenulisBuku(){
            return this.PenulisBuku;
    }
    
    public void setPenerbitBuku(String penerbitbuku){
            this.PenerbitBuku = penerbitbuku;
    }
    
    public String getPenerbitBuku(){
            return this.PenerbitBuku;
    }
    
    public String toString(){
    return "Buku "+getNamaBuku()+" penulisnya "+getPenulisBuku()+" dan penerbitnya "+getPenerbitBuku();
    }
}
