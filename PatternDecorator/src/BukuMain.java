/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Egga
 */
public class BukuMain {
    public static void main(String[] args) {
        Buku buku = new DetailBuku();
        buku.detailBuku();
        System.out.println("-------------------------");
        buku = new StatusBuku(buku);
        buku.detailBuku();
    }
}
