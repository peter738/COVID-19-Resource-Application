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
        SWING_tester st = new SWING_tester();
        JSOUP_tester jst = new JSOUP_tester();
        
        String msg = jst.soupCall();
        st.swingCall(msg);
    }
    
}
