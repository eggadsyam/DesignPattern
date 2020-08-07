/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Egga
 */
public class PinjamMain {
    public static void main(String[] args) {
        PinjamController controller = new PinjamController();
        PinjamStatus info = new PinjamStatus("Susi Susanti", "belum", "Meminjam", "");
        
        System.out.println(info);
        info.setStatus("18 Juli 2020", "Meminjam", "Biologi Molekul");
  
        System.out.println("\nSimpan Aktivitas");
        System.out.println("==========================================");
        controller.Save(info);
        System.out.println(info);   
        
        info.setStatus("20 Juli 2020", "Mengembalikan", "Biologi Molekul");
        System.out.println(info);
        info.setStatus("20 Juii 2020", "Meminjam", "Cerita Malin Kundang");
        System.out.println(info);
        info.setStatus("25 Juli 2020", "Mengembalika", "Cerita Malin Kundang");
        System.out.println(info);
  
        System.out.println("==========================================");
        System.out.println("Kembalikan Aktivitas\n");
        controller.Restore(info);
        System.out.println(info);
    }
}
