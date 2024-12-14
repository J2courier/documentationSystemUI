/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package documentationsystemui;


import javax.swing.*;
import java.awt.*;
import javax.swing.border.Border;
import java.awt.event.MouseAdapter; //for scroll event
import java.awt.event.MouseEvent;   //mouse hover event
import java.awt.event.ActionEvent;  //for click event
import java.awt.event.ActionListener;//for click event
public class DocumentationSystemUI extends JFrame{

    public DocumentationSystemUI () {
        setSize(1800, 900); //setting sizes (WIDTH, HEIGHT)
        setTitle("UI"); //setting a title
        setLayout(new BorderLayout()); //Border Layout Uses NORTH, SOUTH, EAST, WEST, CENTER alignment, any of them will occupy spaces but still can set sizes each component
        setMinimumSize(new Dimension (1000, 900));
        setDefaultCloseOperation(EXIT_ON_CLOSE); //exit on close will terminate the program from running
    }
        
    
    public static void main(String[] args) {
        new DocumentationSystemUI().setVisible(true);
    }
    
}
