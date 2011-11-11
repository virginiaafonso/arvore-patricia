/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package google;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 *
 * @author RMOTTA
 */
public class Arquivo {
    
    public String fasta;
    
    static public void le_entrada()
    {
        Arvore ap = new Arvore();
        try
        {
            int i;
            FileInputStream fis = new FileInputStream("entrada.txt");
            BufferedReader d = new BufferedReader(new InputStreamReader(fis, "UTF-8"));

            String nomeArq="" ;
            String n = d.readLine().replace('﻿',' ').trim();

            Integer a = Integer.parseInt(n);
            for(i=0;i<a;i++)
            {
                nomeArq = d.readLine();
                FileInputStream fisArquivo = new FileInputStream(nomeArq);
                BufferedReader arquivo = new BufferedReader(new InputStreamReader(fisArquivo, "UTF-8"));
                
                String conteudo = "";
                while(arquivo.ready())//.readLine()!=null)
                {
                    conteudo += arquivo.readLine()+" ";                    
                }
                
                conteudo = conteudo.toLowerCase();
                conteudo = conteudo.replace(',', ' ');
                conteudo = conteudo.replace('.', ' ');
                conteudo = conteudo.replace('?', ' ');
                conteudo = conteudo.replace('!', ' ');
                conteudo = conteudo.replace('-', ' ');
                conteudo = conteudo.replace('\"', ' ');
                conteudo = conteudo.replace(':', ' ');
                conteudo = conteudo.replace("   ", " ");
                conteudo = conteudo.replace("  ", " ");
                
                String vetor[] = conteudo.split(" ");
                int j,k;
                for(j=0;j<vetor.length;j++)
                {
                    int c = 20-vetor[j].length();
                    for(k=0;k<c;k++)
                        vetor[j]+=" ";
                    
                    String bin = Arquivo.StrToBin(vetor[j]);
                    NoValor nv = new NoValor(bin,vetor[j],nomeArq);
                    
                    
                    char array[] = new char[20];
                    
                }

                int r = 5;
            }
        }
        catch (FileNotFoundException e) {}
        catch (IOException e) {}

    }
    
    static public String StrToBin(String s)
    {
        byte[] bytes = s.getBytes();
        StringBuilder binary = new StringBuilder();
        for(byte b: bytes)
        {
           int val = b;
           for(int i=0;i < 8; i++)
           {
               binary.append((val & 128) == 0? 0 : 1);
               val <<= 1;
           }

        }
        return binary.toString();
    }
}
