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
public class Conta extends Thread {

    public String nome;
    public int priorità;

    public Conta(String nome,int priorità) {
        this.nome=nome;
        this.priorità=priorità;
    }

    @Override
    public void run() {
   for(int i=0;i<50000;i++){
   System.out.print((i+1)+"-"+nome);
   }
    }
}
