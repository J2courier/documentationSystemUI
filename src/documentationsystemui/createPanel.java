/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package documentationsystemui;

/**
 *
 * @author ADMIN
 */
import javax.swing.*;
import java.awt.*;
public class createPanel {
    public static JPanel panel(Color color, LayoutManager layout, Dimension size){
        JPanel panel = new JPanel();
        panel.setBackground(color);
        panel.setLayout(layout);
        panel.setPreferredSize(size);
        return panel;
    }
}
//usage of this is JPanel yourPanelName = createPanel.panel(Color.BLACK, new BorderLaytout);