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

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SWING_tester {
    JFrame frame;
    
    public void swingCall(String msg){
        frame = new JFrame("Switch Example Simple");
        
        frame.setSize(1000, 1000);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel jp = new JPanel();
        frame.add(jp);
        JLabel jl = new JLabel(msg);
        
        jp.add(jl);
        
        frame.setVisible(true);
    }
}
