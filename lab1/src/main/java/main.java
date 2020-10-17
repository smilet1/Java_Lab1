/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Максим Усков
 */
public class main {
    public static void main(String[] args) {
        ListLab N= new ListLab(10);
        N.add(5);
        N.add("e");
        N.printAll();
        N.delete(2);
        System.out.print("\n"+N.get(2));
        System.out.print("\n"+N.amountElem());
        
    }
}
