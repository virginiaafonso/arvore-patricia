/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package google;

/**
 *
 * @author RMOTTA
 */
public class No {
    
    No dir;
    No esq;
    int posicao;
    String bin;
    String chave;
    No atual;
    No pai;
    
    public void caminha(){
        int i;
        if(this.chave==null){//é nó de caminho
            if(this.posicao==0)
                this.esq.caminha();
            else
                this.dir.caminha();
        }
        else{//é nó de valor
            char a[] = atual.bin.toCharArray();
            char b[] = this.bin.toCharArray();
            
            if(a[this.posicao]==b[this.posicao]){//cria novo nó
                for(i=this.posicao+1;i<a.length;i++)
                {
                    if(a[i]!=b[i]) break;
                }
                if(a[i]==0)//novo no, com a na esquerda
                {
                    No novo = new No();
                    
                    novo.esq=atual;
                    novo.dir=this;
                    
                    if(b[this.pai.posicao]==0)this.pai.esq=novo;
                    else this.pai.dir=novo;
                    
                }
                else{//novo no, com a na direita
                    
                    No novo = new No();
                    
                    novo.dir=atual;
                    novo.esq=this;
                    
                    if(b[this.pai.posicao]==0)this.pai.dir=novo;
                    else this.pai.esq=novo;
                    
                }   
            }
        }
            
        /*
        if(c[this.posicao]==0)
            this.esq.caminha();
        else
            this.dir.caminha();
         * 
         */
    }

    
}
