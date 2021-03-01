/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contatore;



/**
 *
 * @author 39334
 */
public class Contatore {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        Thread t1=new Thread(new Conta("contatore1",10));
        Thread t2=new Thread(new Conta("contatore2",1));
        Thread t3=new Thread(new Conta("contatore3",5));
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.NORM_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        Thread.sleep(5000);
        
        
    }
    
}
