/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Egga
 */
public class PerpustakaanController {
    BukuBuilder bukubulider;
    public PerpustakaanController(BukuBuilder bukubulider) {
        this.bukubulider = bukubulider;
    }
 
    public void Builder(){
        bukubulider.NamaBukuBuilder();
        bukubulider.PenulisBukuBuilder();
        bukubulider.PenerbitBukuBuilder();
    }
 
    public Buku getBuku(){
        return bukubulider.getBuku();
    }
}
