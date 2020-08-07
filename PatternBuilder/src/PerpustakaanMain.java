/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Egga
 */
public class PerpustakaanMain {
    public static void main(String[] args) {
    BukuBuilder BM = new BukuMatematika();
    PerpustakaanController PC = new PerpustakaanController(BM);
    PC.Builder();
    Buku buku = PC.getBuku();
    System.out.println(buku);
  
    BukuBuilder BF = new BukuFisika();
    PC = new PerpustakaanController(BF);
    PC.Builder();
    buku = PC.getBuku();
    System.out.println(buku);
    }
}
