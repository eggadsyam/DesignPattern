/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Egga
 */
public class PinjamController {
    private Object objMemento;
    public void Save(PinjamStatus info){
        this.objMemento = info.Save();
    }
    public void Restore(PinjamStatus info){
        info.Restore(this.objMemento);
    }
}
