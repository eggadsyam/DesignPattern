/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Egga
 */
abstract class BukuDecorator implements Buku{
    protected Buku buku = null;
    public BukuDecorator(Buku buku) {
        this.buku = buku;
    }
}
