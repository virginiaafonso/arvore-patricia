/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package google;

/**
 *
 * @author RMOTTA
 */
public class Arvore {
    
        No raiz=null;
        
        public void insert(No n){
            if(raiz==null){
               this.raiz = n;                
            }
            else{
                n.caminha();
            }
            
            
        }
}
