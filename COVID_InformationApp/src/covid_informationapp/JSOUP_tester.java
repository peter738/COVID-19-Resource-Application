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
import org.jsoup.select.Elements;

public class JSOUP_tester {
    
    public String soupCall() throws IOException{
        String url = "https://www.opendataphilly.org/dataset/covid-cases/resource/cdf4a96d-3655-49bc-8490-2a73260a29a7";
        Document document = Jsoup.connect(url).get();
        Elements cvsURL = document.select("a.resource-url-analytics");
        String link = cvsURL.attr("href");
        return link;
    }
}

