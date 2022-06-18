package br.inatel.C206.ProjetoFinal.Controle;

import br.inatel.C206.ProjetoFinal.Sorvetes.SorvetePrincipal;

import java.io.*;
import java.util.ArrayList;

public class Arquivo {

    public void escrever(SorvetePrincipal a1) {

        OutputStream os = null;
        OutputStreamWriter osr = null;
        BufferedWriter bw = null;
        String linhaEscrever;

        try {
            os = new FileOutputStream("Arquivo.txt", true); //salvar no arquivo
            osr = new OutputStreamWriter(os); //conversor
            bw = new BufferedWriter(osr); //o q vai digitar

            bw.write("----Pedido----");
            bw.newLine();
            bw.write(a1.sabor + "\n");
            bw.write(a1.quantidadeDeBolas + "\n");

        } catch (Exception e) {
            System.out.println(e);
        } finally {
            try {
                bw.close();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }


    public ArrayList<SorvetePrincipal> ler() {

        InputStream is = null;
        InputStreamReader isr = null;
        BufferedReader br = null;
        ArrayList<SorvetePrincipal> acheiNoArquivo = new ArrayList<>();
        String linhaLer;

        try {

            is = new FileInputStream("Arquivo.txt");
            isr = new InputStreamReader(is);
            br = new BufferedReader(isr);

            linhaLer = br.readLine();
            while(linhaLer != null) {
                if(linhaLer.contains("Sorvete")) {
                    SorvetePrincipal aux = new SorvetePrincipal();
                    aux.sabor= br.readLine();
                    aux.quantidadeDeBolas = Integer.parseInt(br.readLine());

                    acheiNoArquivo.add(aux);
                }
                linhaLer = br.readLine();
            }
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            try {
                br.close();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        return acheiNoArquivo;
    }

}
