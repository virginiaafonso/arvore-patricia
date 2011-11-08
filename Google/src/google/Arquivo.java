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

        try
        {
            int i;
            FileInputStream fis = new FileInputStream("entrada.txt");
            BufferedReader d = new BufferedReader(new InputStreamReader(fis, "UTF-8"));

            String line="" ;
            String n = d.readLine().replace('﻿',' ').trim();

            Integer a = Integer.parseInt(n);
            for(i=0;i<a;i++)
            {
                line = d.readLine();
                FileInputStream fisArquivo = new FileInputStream(line);
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

                int r = 5;
            }
        }
        catch (FileNotFoundException e) {}
        catch (IOException e) {}

    }
}
