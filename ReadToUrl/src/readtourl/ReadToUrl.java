/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package readtourl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 *
 * @author Deus Vult
 */
public class ReadToUrl {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String http_url = "http://copernicorp.com/doc.json";
        URL url;
        try {
            url = new URL(http_url);
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");
            con.setRequestProperty("Content-Type", "application/json");
            System.out.println("Atributos:\n"
                    + "Tamaño del contenido: "+con.getContentLength()+"\n"
                            + "Código/Estado: "+con.getResponseCode()+"/"+con.getResponseMessage()+"\n"
                                    + "Tipo del contenido: "+con.getContentType()+"\n\n");
            
            print_content(con);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void print_content(HttpURLConnection con) {
        if (con != null) {
            BufferedReader br;
            try {

                System.out.println("Contenido leído: ");
                br = new BufferedReader(new InputStreamReader(con.getInputStream()));

                String input;

                while ((input = br.readLine()) != null) {
                    System.out.println(input);
                }
                br.close();

            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }

}
