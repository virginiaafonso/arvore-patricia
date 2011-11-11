/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package google;

import java.util.ArrayList;

/**
 *
 * @author RMOTTA
 */
public class NoValor extends No{
    String bin;
    String chave;
    ArrayList<Integer> qtde;
    ArrayList<String> arquivos;
    
    public NoValor(String bin, String chave, String nomeArq){
        this.bin = bin;
        this.chave = chave;

    }
    
    public void add (){
        this.arquivos.add("nomeArq");
        this.qtde.add(1);
    }
}
