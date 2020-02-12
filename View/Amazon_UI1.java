package View;

import java.awt.Color;
import java.awt.Container;
import java.awt.EventQueue;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class Amazon_UI1 extends JFrame {
	
	public Amazon_UI1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnClothing = new JMenu("Clothing");
		menuBar.add(mnClothing);
		
		JMenuItem mntmShirt = new JMenuItem("Shirt");
		mnClothing.add(mntmShirt);
		
		JMenuItem mntmPant = new JMenuItem("Pant");
		mnClothing.add(mntmPant);
		
		JMenuItem mntmShoe = new JMenuItem("Shoe");
		mnClothing.add(mntmShoe);
		
		JMenu mnToys = new JMenu("Toys");
		menuBar.add(mnToys);
		
		JMenuItem mntmChicken = new JMenuItem("Rubber Chicken");
		mnToys.add(mntmChicken);
		
		JMenuItem mntmLegos = new JMenuItem("Lego");
		mnToys.add(mntmLegos);
		
		JMenuItem mntmStuffedAnimals = new JMenuItem("Stuffed Animal");
		mnToys.add(mntmStuffedAnimals);
		
		JMenu mnElectronics = new JMenu("Electronics");
		menuBar.add(mnElectronics);
		
		JMenuItem mntmPhone = new JMenuItem("Phone");
		mnElectronics.add(mntmPhone);
		
		JMenuItem mntmComputer = new JMenuItem("Computer");
		mnElectronics.add(mntmComputer);
		
		JMenuItem mntmTV = new JMenuItem("TV");
		mnElectronics.add(mntmTV);
		
		JMenu mnHome = new JMenu("Home");
		menuBar.add(mnHome);
		
		JMenuItem mntmFurniture = new JMenuItem("Furniture");
		mnHome.add(mntmFurniture);
		
		JMenuItem mntmPalindrom = new JMenuItem("Decor");
		mnHome.add(mntmPalindrom);
		
		JMenu Cart = new JMenu("My Cart");
		menuBar.add(Cart);
		
		JMenuItem mntmCheckout = new JMenuItem("Proceed to Checkout");
		Cart.add(mntmCheckout);
		
		
	}
	
}
