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
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.swing.*;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import java.net.URL;
import java.net.URLConnection;

public class COVID_InformationApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
        SWING_tester st = new SWING_tester();
        JSOUP_tester jst = new JSOUP_tester();
        
        String msg = jst.soupCall();
        
        URL url = new URL(msg);
        URLConnection connection = url.openConnection();
        InputStreamReader input = new InputStreamReader(connection.getInputStream());
        BufferedReader buff = new BufferedReader(input);
        String content = buff.readLine();
        st.swingCall(content);
    }
    
}
