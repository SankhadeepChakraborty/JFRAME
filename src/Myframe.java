import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Myframe extends JFrame {
  Myframe() {
    // set icon image
    ImageIcon image = new ImageIcon(
        "C:\\Users\\User01\\Documents\\login&registrationm\\Login & Registration\\src\\Media\\layers_3329359.png");
    // change icon
    this.setIconImage(image.getImage());

    // set icon image
    ImageIcon image2 = new ImageIcon(
        "C:\\Users\\User01\\Desktop\\JFRAMEbasic\\JFRAMEbasic\\src\\Media\\4d .png");
    ImageIcon image3 = new ImageIcon(
        "C:\\Users\\User01\\Desktop\\JFRAMEbasic\\JFRAMEbasic\\src\\Media\\logo-removebg-preview.png");
    Image scaleImage = image3.getImage().getScaledInstance(5, 5, Image.SCALE_DEFAULT);
    // change icon
    this.setIconImage(image.getImage());
    // change background colour of the frame
    // (1) -> r-g-b(0-255)
    // (2) -> hex code
    this.getContentPane().setBackground(new Color(255, 255, 255));
    // JLabel= a GUI display area for a string of text , an image and botton
    JLabel label = new JLabel();
    label.setText("      I AM SANKHADEEP CHAKRABORTY           ");
    label.setIcon(image2);
    label.setIcon(image3);
    label.setHorizontalAlignment(JLabel.CENTER); // set text left , center, right of image
    // label.setVerticalAlignment(JLabel.TOP); // set text top , center, bottom of
    // imageicon
    label.setForeground(new Color(0, 0, 0)); // change the text's colour
    label.setFont(new Font("MV Boli", Font.BOLD, 25));

    // This is basic entire project -basic structu
    this.setTitle("Welcome to my first frame"); // set title

    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Exit out of application

    this.setResizable(false);

    this.setSize(1000, 1000); // set x dimmension and y dimmension
    // this.setLayout(null);

    this.setVisible(true);// make frame visible
    this.add(label);

  }
}
