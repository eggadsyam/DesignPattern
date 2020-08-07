/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Egga
 */
public class PinjamStatus {
    private String namaanggota, tanggalpinjam, aksipinjam,namabuku;
    public PinjamStatus(String namaanggota,String tanggalpinjam,String aksipinjam,String namabuku) {
        this.namaanggota = namaanggota;
        this.tanggalpinjam = tanggalpinjam;
        this.aksipinjam = aksipinjam;
        this.namabuku = namabuku;
    }
    public void setStatus(String tanggalpinjam,String aksipinjam,String namabuku){
        this.tanggalpinjam = tanggalpinjam;
        this.aksipinjam = aksipinjam;
        this.namabuku = namabuku;
    }
 
    public String toString(){
        return this.namaanggota+" pada tanggal "+this.tanggalpinjam+" "+this.aksipinjam+" buku "+this.namabuku;
    }
 
    public Memento Save(){
        return new Memento(tanggalpinjam, aksipinjam, namabuku);
    }
 
    public void Restore(Object objMemento){
        Memento obj = (Memento)objMemento;
        this.tanggalpinjam = obj.tanggalpinjam;
        this.aksipinjam = obj.aksipinjam;
        this.namabuku = obj.namabuku;
    }
}
