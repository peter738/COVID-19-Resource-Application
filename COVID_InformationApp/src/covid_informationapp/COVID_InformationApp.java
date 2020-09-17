/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package covid_informationapp;

/**
 *
 * @author ramir
 */
import java.io.IOException;

import javax.swing.*;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class COVID_InformationApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
        // TODO code application logic here
        String url = "https://www.google.com/";
        Document document = Jsoup.connect(url).get();
        System.out.println(document.title());
    }
    
}
