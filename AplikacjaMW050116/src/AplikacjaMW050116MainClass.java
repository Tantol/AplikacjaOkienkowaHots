import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JComboBox;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.ContainerAdapter;
import java.awt.event.ContainerEvent;
import javax.swing.JList;
import javax.swing.JTextPane;

import Maps.MapList;
import Maps.*;

import javax.swing.DropMode;
import java.awt.Font;

public class AplikacjaMW050116MainClass {

	private JFrame frmNoTitleYet;
	private JPanel panelMainMenu;
	private JPanel panelMenuMap;
	private JPanel panelMenuInfo;
	private JLabel label;
	private JLabel lblNewLabel;
	private ImageIcon labelImage;
	private ImageIcon lblNewLabelImage;
	private JComboBox comboBox_2;
	private Object wiaderko=null;
	private int lastButton=0;
	private int lastButtonMap=0;
	private JButton btnDONE;
	private JLabel labelButtonDONE;

	/**
	 * Launch the application.
	 */
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AplikacjaMW050116MainClass window = new AplikacjaMW050116MainClass();
					window.frmNoTitleYet.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AplikacjaMW050116MainClass() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmNoTitleYet = new JFrame();
		frmNoTitleYet.setResizable(false);
		frmNoTitleYet.setIconImage(Toolkit.getDefaultToolkit().getImage(AplikacjaMW050116MainClass.class.getResource("/resources/Coin.png")));
		frmNoTitleYet.setTitle("No title, yet... Alpha 0.1v");
		frmNoTitleYet.setBounds(100, 100, 640, 480);
		frmNoTitleYet.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmNoTitleYet.getContentPane().setLayout(new CardLayout(0, 0));
		
		JPanel panelMainMenu = new JPanel();
		panelMainMenu.setBackground(new Color(255, 255, 255));
		frmNoTitleYet.getContentPane().add(panelMainMenu, "name_470410867574927");
		panelMainMenu.setLayout(null);
		panelMainMenu.setVisible(true);
		
		JPanel panelMenuMap = new JPanel();
		frmNoTitleYet.getContentPane().add(panelMenuMap, "name_470412964365977");
		panelMenuMap.setVisible(false);
		
		JPanel panelMenuInfo = new JPanel();
		frmNoTitleYet.getContentPane().add(panelMenuInfo, "name_470414835695040");
		panelMenuInfo.setLayout(null);
		
		JButton btnChampion_1 = new JButton();
		btnChampion_1.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent arg0) {
				btnChampion_1.setIcon(new ImageIcon(AplikacjaMW050116MainClass.class.getResource("/resources/"+(String)btnChampion_1.getName()+"_On.png")));
			}
			public void mouseExited(MouseEvent e) {
				btnChampion_1.setIcon(new ImageIcon(AplikacjaMW050116MainClass.class.getResource("/resources/"+(String)btnChampion_1.getName()+"_Off.png")));
			}
		});
		btnChampion_1.setBounds(49, 44, 100, 200);
		panelMenuInfo.add(btnChampion_1);
		
		JButton btnChampion_2 = new JButton();
		btnChampion_2.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent arg0) {
				btnChampion_2.setIcon(new ImageIcon(AplikacjaMW050116MainClass.class.getResource("/resources/"+(String)btnChampion_2.getName()+"_On.png")));
			}
			public void mouseExited(MouseEvent e) {
				btnChampion_2.setIcon(new ImageIcon(AplikacjaMW050116MainClass.class.getResource("/resources/"+(String)btnChampion_2.getName()+"_Off.png")));
			}
		});
		btnChampion_2.setBounds(159, 44, 100, 200);
		panelMenuInfo.add(btnChampion_2);
		
		JButton btnChampion_3 = new JButton();
		btnChampion_3.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent arg0) {
				btnChampion_3.setIcon(new ImageIcon(AplikacjaMW050116MainClass.class.getResource("/resources/"+(String)btnChampion_3.getName()+"_On.png")));
			}
			public void mouseExited(MouseEvent e) {
				btnChampion_3.setIcon(new ImageIcon(AplikacjaMW050116MainClass.class.getResource("/resources/"+(String)btnChampion_3.getName()+"_Off.png")));
			}
		});
		btnChampion_3.setBounds(269, 44, 100, 200);
		panelMenuInfo.add(btnChampion_3);
		
		JButton btnChampion_4 = new JButton();
		btnChampion_4.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent arg0) {
				btnChampion_4.setIcon(new ImageIcon(AplikacjaMW050116MainClass.class.getResource("/resources/"+(String)btnChampion_4.getName()+"_On.png")));
			}
			public void mouseExited(MouseEvent e) {
				btnChampion_4.setIcon(new ImageIcon(AplikacjaMW050116MainClass.class.getResource("/resources/"+(String)btnChampion_4.getName()+"_Off.png")));
			}
		});
		btnChampion_4.setBounds(379, 44, 100, 200);
		panelMenuInfo.add(btnChampion_4);
		
		JButton btnChampion_5 = new JButton();
		btnChampion_5.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent arg0) {
				btnChampion_5.setIcon(new ImageIcon(AplikacjaMW050116MainClass.class.getResource("/resources/"+(String)btnChampion_5.getName()+"_On.png")));
			}
			public void mouseExited(MouseEvent e) {
				btnChampion_5.setIcon(new ImageIcon(AplikacjaMW050116MainClass.class.getResource("/resources/"+(String)btnChampion_5.getName()+"_Off.png")));
			}
		});
		btnChampion_5.setBounds(489, 44, 100, 200);
		panelMenuInfo.add(btnChampion_5);
		
		JTextPane textPane = new JTextPane();
		textPane.setFont(new Font("Tahoma", Font.BOLD, 15));
		textPane.setEditable(false);
		textPane.setBounds(232, 13, 320, 20);
		textPane.setForeground(new Color(0, 255, 255));
		textPane.setBorder(null);
		textPane.setOpaque(false);
		textPane.setText("Choose your champion");
		panelMenuInfo.add(textPane);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(0, 0, 640, 480);
		panelMenuInfo.add(lblNewLabel_1);
		panelMenuInfo.setVisible(false);
		
		JLabel labelButtonChooseMap = new JLabel("");
		labelButtonChooseMap.setIcon(new ImageIcon(AplikacjaMW050116MainClass.class.getResource("/resources/Button_On.png")));
		labelButtonChooseMap.setBounds(233, 10, 160, 40);
		panelMainMenu.add(labelButtonChooseMap);
		
		JLabel labelButtonGetOut = new JLabel("");
		labelButtonGetOut.setIcon(new ImageIcon(AplikacjaMW050116MainClass.class.getResource("/resources/Button_On.png")));
		labelButtonGetOut.setBounds(10, 400, 160, 40);
		panelMainMenu.add(labelButtonGetOut);
		
		JLabel labelButtonDONE = new JLabel("");
		labelButtonDONE.setIcon(new ImageIcon(AplikacjaMW050116MainClass.class.getResource("/resources/Button_On.png")));
		labelButtonDONE.setBounds(226, 114, 160, 40);
		panelMainMenu.add(labelButtonDONE);
		labelButtonDONE.setVisible(false);
		
		JButton btnChooseMap = new JButton("Choose Map");
		btnChooseMap.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				labelButtonChooseMap.setIcon(new ImageIcon(AplikacjaMW050116MainClass.class.getResource("/resources/Button_Off.png")));
				}
			public void mouseExited(MouseEvent arg0) {
				labelButtonChooseMap.setIcon(new ImageIcon(AplikacjaMW050116MainClass.class.getResource("/resources/Button_On.png")));
				}
		});
		btnChooseMap.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lastButtonMap++;
				panelMenuMap.setVisible(true);
				panelMainMenu.setVisible(false);
			}
		});
		
		
		btnChooseMap.setBounds(233, 10, 160, 40);
		transparentButton(btnChooseMap);
		panelMainMenu.add(btnChooseMap);
		
		JButton btnEnd = new JButton("Get OUT!");
		btnEnd.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				labelButtonGetOut.setIcon(new ImageIcon(AplikacjaMW050116MainClass.class.getResource("/resources/Button_Off.png")));
				}
			public void mouseExited(MouseEvent arg0) {
				labelButtonGetOut.setIcon(new ImageIcon(AplikacjaMW050116MainClass.class.getResource("/resources/Button_On.png")));
				}
		});
		btnEnd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnEnd.setBounds(10, 400, 160, 40);
		transparentButton(btnEnd);
		panelMainMenu.add(btnEnd);
		
		JButton btnDONE = new JButton("DONE !!");
		btnDONE.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				labelButtonDONE.setIcon(new ImageIcon(AplikacjaMW050116MainClass.class.getResource("/resources/Button_Off.png")));
				}
			public void mouseExited(MouseEvent arg0) {
				labelButtonDONE.setIcon(new ImageIcon(AplikacjaMW050116MainClass.class.getResource("/resources/Button_On.png")));
				}
		});
		btnDONE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelMainMenu.setVisible(false);
				panelMenuInfo.setVisible(true);
				lblNewLabel_1.setIcon(lblNewLabelImage);
			}
		});
		btnDONE.setBounds(226, 114, 160, 40);
		transparentButton(btnDONE);
		panelMainMenu.add(btnDONE);
		btnDONE.setVisible(false);
		
		JTextPane textPane_1 = new JTextPane();
		textPane_1.setBounds(36, 83, 106, 20);
		textPane_1.setEditable(false);
		textPane_1.setForeground(new Color(0, 255, 255));
		textPane_1.setBorder(null);
		textPane_1.setOpaque(false);
		panelMainMenu.add(textPane_1);
		textPane_1.setVisible(false);
		
		JTextPane textPane_2 = new JTextPane();
		textPane_2.setBounds(36, 114, 106, 20);
		textPane_2.setEditable(false);
		textPane_2.setForeground(new Color(0, 255, 255));
		textPane_2.setBorder(null);
		textPane_2.setOpaque(false);
		panelMainMenu.add(textPane_2);
		textPane_2.setVisible(false);
		
		JTextPane textPane_3 = new JTextPane();
		textPane_3.setBounds(36, 145, 106, 20);
		textPane_3.setEditable(false);
		textPane_3.setForeground(new Color(0, 255, 255));
		textPane_3.setBorder(null);
		textPane_3.setOpaque(false);
		panelMainMenu.add(textPane_3);
		textPane_3.setVisible(false);
		
		JTextPane textPane_4 = new JTextPane();
		textPane_4.setBounds(36, 176, 106, 20);
		textPane_4.setEditable(false);
		textPane_4.setForeground(new Color(0, 255, 255));
		textPane_4.setBorder(null);
		textPane_4.setOpaque(false);
		panelMainMenu.add(textPane_4);
		textPane_4.setVisible(false);
		
		JTextPane textPane_5 = new JTextPane();
		textPane_5.setBounds(36, 207, 106, 20);
		textPane_5.setEditable(false);
		textPane_5.setForeground(new Color(0, 255, 255));
		textPane_5.setBorder(null);
		textPane_5.setOpaque(false);
		panelMainMenu.add(textPane_5);
		textPane_5.setVisible(false);
		
		JTextPane textPane_6 = new JTextPane();
		textPane_6 .setBounds(518, 83, 106, 20);
		textPane_6 .setEditable(false);
		textPane_6 .setForeground(new Color(0, 255, 255));
		textPane_6 .setBorder(null);
		textPane_6 .setOpaque(false);
		panelMainMenu.add(textPane_6 );
		textPane_6 .setVisible(false);
		
		JTextPane textPane_7 = new JTextPane();
		textPane_7.setBounds(518, 114, 106, 20);
		textPane_7.setEditable(false);
		textPane_7.setForeground(new Color(0, 255, 255));
		textPane_7.setBorder(null);
		textPane_7.setOpaque(false);
		panelMainMenu.add(textPane_7);
		textPane_7.setVisible(false);
		
		JTextPane textPane_8 = new JTextPane();
		textPane_8.setBounds(518, 145, 106, 20);
		textPane_8.setEditable(false);
		textPane_8.setForeground(new Color(0, 255, 255));
		textPane_8.setBorder(null);
		textPane_8.setOpaque(false);
		panelMainMenu.add(textPane_8);
		textPane_8.setVisible(false);
		
		JTextPane textPane_9 = new JTextPane();
		textPane_9.setBounds(518, 176, 106, 20);
		textPane_9.setEditable(false);
		textPane_9.setForeground(new Color(0, 255, 255));
		textPane_9.setBorder(null);
		textPane_9.setOpaque(false);
		panelMainMenu.add(textPane_9);
		textPane_9.setVisible(false);
		
		JTextPane textPane_10 = new JTextPane();
		textPane_10.setBounds(518, 207, 106, 20);
		textPane_10.setEditable(false);
		textPane_10.setForeground(new Color(0, 255, 255));
		textPane_10.setBorder(null);
		textPane_10.setOpaque(false);
		panelMainMenu.add(textPane_10);
		textPane_10.setVisible(false);
		
		/////////////
		JLabel lblNewLabel = new JLabel("");
		lblNewLabelImage=new ImageIcon(AplikacjaMW050116MainClass.class.getResource("/resources/tlo.jpg"));
		
		String[] championNamesTeam = { "Chose Character","Johanna","Artanis","Li-Li","Brightwing","Zeratul","Thrall","Jaina","Chromie","Valla","Falstad" };
		String[] championNamesEnemy = { "Chose Character","Johanna","Artanis","Li-Li","Brightwing","Zeratul","Thrall","Jaina","Chromie","Valla","Falstad" };
		JComboBox comboBox_1 = new JComboBox();
		for(String name : championNamesTeam){
			comboBox_1.addItem(name);
		}
		comboBox_1.setBounds(36, 83, 106, 20);
		comboBox_1.isEditable();
		panelMainMenu.add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		for(String name : championNamesTeam){
			comboBox_2.addItem(name);
		}
		comboBox_2.setBounds(36, 114, 106, 20);
		panelMainMenu.add(comboBox_2);
		
		JComboBox comboBox_3 = new JComboBox();
		for(String name : championNamesTeam){
			comboBox_3.addItem(name);
		}
		comboBox_3.setBounds(36, 145, 106, 20);
		panelMainMenu.add(comboBox_3);
		
		JComboBox comboBox_4 = new JComboBox();
		for(String name : championNamesTeam){
			comboBox_4.addItem(name);
		}
		comboBox_4.setBounds(36, 176, 106, 20);
		panelMainMenu.add(comboBox_4);
		
		JComboBox comboBox_5 = new JComboBox();
		for(String name : championNamesTeam){
			comboBox_5.addItem(name);
		}
		comboBox_5.setBounds(36, 207, 106, 20);
		panelMainMenu.add(comboBox_5);
		
		JComboBox comboBox_6 = new JComboBox();
		for(String name : championNamesEnemy){
			comboBox_6.addItem(name);
		}
		comboBox_6.setBounds(518, 83, 106, 20);
		panelMainMenu.add(comboBox_6);
		
		JComboBox comboBox_7 = new JComboBox();
		for(String name : championNamesEnemy){
			comboBox_7.addItem(name);
		}
		comboBox_7.setBounds(518, 114, 106, 20);
		panelMainMenu.add(comboBox_7);
		
		JComboBox comboBox_8 = new JComboBox();
		for(String name : championNamesEnemy){
			comboBox_8.addItem(name);
		}
		comboBox_8.setBounds(518, 145, 106, 20);
		panelMainMenu.add(comboBox_8);
		
		JComboBox comboBox_9 = new JComboBox();
		for(String name : championNamesEnemy){
			comboBox_9.addItem(name);
		}
		comboBox_9.setBounds(518, 176, 106, 20);
		panelMainMenu.add(comboBox_9);
		
		JComboBox comboBox_10 = new JComboBox();
		for(String name : championNamesEnemy){
			comboBox_10.addItem(name);
		}
		comboBox_10.setBounds(518, 207, 106, 20);
		panelMainMenu.add(comboBox_10);
		
		comboBox_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if((String)comboBox_1.getSelectedItem()!=championNamesTeam[0]){
					lastButton++;
				 comboBox_2.removeItem(comboBox_1.getSelectedItem());
				 comboBox_3.removeItem(comboBox_1.getSelectedItem());
				 comboBox_4.removeItem(comboBox_1.getSelectedItem());
				 comboBox_5.removeItem(comboBox_1.getSelectedItem());
				 comboBox_1.setVisible(false);
				 textPane_1.setVisible(true);
				 textPane_1.setText((String)comboBox_1.getSelectedItem());
				 btnChampion_1.setIcon(new ImageIcon(AplikacjaMW050116MainClass.class.getResource("/resources/"+(String)comboBox_1.getSelectedItem()+"_Off.png")));
				 btnChampion_1.setName((String)comboBox_1.getSelectedItem());
				}
			}
		});
		
		comboBox_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if((String)comboBox_2.getSelectedItem()!=championNamesTeam[0]){
					lastButton++;
				 comboBox_3.removeItem(comboBox_2.getSelectedItem());
				 comboBox_4.removeItem(comboBox_2.getSelectedItem());
				 comboBox_5.removeItem(comboBox_2.getSelectedItem());
				 comboBox_2.setVisible(false);
				 textPane_2.setVisible(true);
				 textPane_2.setText((String)comboBox_2.getSelectedItem());
				 btnChampion_2.setIcon(new ImageIcon(AplikacjaMW050116MainClass.class.getResource("/resources/"+(String)comboBox_2.getSelectedItem()+"_Off.png")));
				 btnChampion_2.setName((String)comboBox_2.getSelectedItem()); 
				}
			}
		});
		
		comboBox_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if((String)comboBox_3.getSelectedItem()!=championNamesTeam[0]){
					lastButton++;
				 comboBox_4.removeItem(comboBox_3.getSelectedItem());
				 comboBox_5.removeItem(comboBox_3.getSelectedItem());
				 comboBox_3.setVisible(false);
				 textPane_3.setVisible(true);
				 textPane_3.setText((String)comboBox_3.getSelectedItem());
				 btnChampion_3.setIcon(new ImageIcon(AplikacjaMW050116MainClass.class.getResource("/resources/"+(String)comboBox_3.getSelectedItem()+"_Off.png")));
				 btnChampion_3.setName((String)comboBox_3.getSelectedItem());
				}
			}
		});
		
		comboBox_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if((String)comboBox_4.getSelectedItem()!=championNamesTeam[0]){
					lastButton++;
				 comboBox_5.removeItem(comboBox_4.getSelectedItem());
				 comboBox_4.setVisible(false);
				 textPane_4.setVisible(true);
				 textPane_4.setText((String)comboBox_4.getSelectedItem());
				 btnChampion_4.setIcon(new ImageIcon(AplikacjaMW050116MainClass.class.getResource("/resources/"+(String)comboBox_4.getSelectedItem()+"_Off.png")));
				 btnChampion_4.setName((String)comboBox_4.getSelectedItem());
				}
			}
		});
		
		comboBox_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if((String)comboBox_5.getSelectedItem()!=championNamesTeam[0]){
					lastButton++;
				 comboBox_5.setVisible(false);
				 textPane_5.setVisible(true);
				 textPane_5.setText((String)comboBox_5.getSelectedItem());
				 btnChampion_5.setIcon(new ImageIcon(AplikacjaMW050116MainClass.class.getResource("/resources/"+(String)comboBox_5.getSelectedItem()+"_Off.png")));
				 btnChampion_5.setName((String)comboBox_5.getSelectedItem());
				}
			}
		});
		
		comboBox_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if((String)comboBox_6.getSelectedItem()!=championNamesTeam[0]){
					lastButton++;
				 comboBox_7.removeItem(comboBox_6.getSelectedItem());
				 comboBox_8.removeItem(comboBox_6.getSelectedItem());
				 comboBox_9.removeItem(comboBox_6.getSelectedItem());
				 comboBox_10.removeItem(comboBox_6.getSelectedItem());
				 comboBox_6.setVisible(false);
				 textPane_6.setVisible(true);
				 textPane_6.setText((String)comboBox_6.getSelectedItem());}
			}
		});
		
		comboBox_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if((String)comboBox_7.getSelectedItem()!=championNamesTeam[0]){
					lastButton++;
				 comboBox_8.removeItem(comboBox_7.getSelectedItem());
				 comboBox_9.removeItem(comboBox_7.getSelectedItem());
				 comboBox_10.removeItem(comboBox_7.getSelectedItem());
				 comboBox_7.setVisible(false);
				 textPane_7.setVisible(true);
				 textPane_7.setText((String)comboBox_7.getSelectedItem());}
			}
		});
		
		comboBox_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if((String)comboBox_8.getSelectedItem()!=championNamesTeam[0]){
					lastButton++;
				 comboBox_9.removeItem(comboBox_8.getSelectedItem());
				 comboBox_10.removeItem(comboBox_8.getSelectedItem());
				 comboBox_8.setVisible(false);
				 textPane_8.setVisible(true);
				 textPane_8.setText((String)comboBox_8.getSelectedItem());}
			}
		});
		
		comboBox_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if((String)comboBox_9.getSelectedItem()!=championNamesTeam[0]){
					lastButton++;
				 comboBox_10.removeItem(comboBox_9.getSelectedItem());
				 comboBox_9.setVisible(false);
				 textPane_9.setVisible(true);
				 textPane_9.setText((String)comboBox_9.getSelectedItem());}
			}
		});
		
		comboBox_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if((String)comboBox_10.getSelectedItem()!=championNamesTeam[0]){
					lastButton++;
				 comboBox_10.setVisible(false);
				 textPane_10.setVisible(true);
				 textPane_10.setText((String)comboBox_10.getSelectedItem());}
				if(lastButton==10&&lastButtonMap>0){btnDONE.setVisible(true); labelButtonDONE.setVisible(true);}
			}
		});
		
		////
		JLabel labelButton1 = new JLabel("");
		labelButton1.setIcon(new ImageIcon(AplikacjaMW050116MainClass.class.getResource("/resources/Button_On.png")));
		labelButton1.setBounds(480, 80, 160, 40);
		JLabel labelButton2 = new JLabel("");
		labelButton2.setIcon(new ImageIcon(AplikacjaMW050116MainClass.class.getResource("/resources/Button_On.png")));
		labelButton2.setBounds(320, 80, 160, 40);
		JLabel labelButton3 = new JLabel("");
		labelButton3.setIcon(new ImageIcon(AplikacjaMW050116MainClass.class.getResource("/resources/Button_On.png")));
		labelButton3.setBounds(160, 80, 160, 40);
		JLabel labelButton4 = new JLabel("");
		labelButton4.setIcon(new ImageIcon(AplikacjaMW050116MainClass.class.getResource("/resources/Button_On.png")));
		labelButton4.setBounds(0, 80, 160, 40);
		JLabel labelButton5 = new JLabel("");
		labelButton5.setIcon(new ImageIcon(AplikacjaMW050116MainClass.class.getResource("/resources/Button_On.png")));
		labelButton5.setBounds(480, 40, 160, 40);
		JLabel labelButton6 = new JLabel("");
		labelButton6.setIcon(new ImageIcon(AplikacjaMW050116MainClass.class.getResource("/resources/Button_On.png")));
		labelButton6.setBounds(320, 40, 160, 40);
		JLabel labelButton7 = new JLabel("");
		labelButton7.setIcon(new ImageIcon(AplikacjaMW050116MainClass.class.getResource("/resources/Button_On.png")));
		labelButton7.setBounds(160, 40, 160, 40);
		JLabel labelButton8 = new JLabel("");
		labelButton8.setIcon(new ImageIcon(AplikacjaMW050116MainClass.class.getResource("/resources/Button_On.png")));
		labelButton8.setBounds(0, 40, 160, 40);
		JLabel labelButton9 = new JLabel("");
		labelButton9.setIcon(new ImageIcon(AplikacjaMW050116MainClass.class.getResource("/resources/Button_On.png")));
		labelButton9.setBounds(480, 0, 160, 40);
		JLabel labelButton10 = new JLabel("");
		labelButton10.setIcon(new ImageIcon(AplikacjaMW050116MainClass.class.getResource("/resources/Button_On.png")));
		labelButton10.setBounds(320, 0, 160, 40);
		JLabel labelButton11 = new JLabel("");
		labelButton11.setIcon(new ImageIcon(AplikacjaMW050116MainClass.class.getResource("/resources/Button_On.png")));
		labelButton11.setBounds(160, 0, 160, 40);
		JLabel labelButton12 = new JLabel("");
		labelButton12.setIcon(new ImageIcon(AplikacjaMW050116MainClass.class.getResource("/resources/Button_On.png")));
		labelButton12.setBounds(0, 0, 160, 40);
		JLabel labelButton13 = new JLabel("");
		labelButton13.setIcon(new ImageIcon(AplikacjaMW050116MainClass.class.getResource("/resources/Button_On.png")));
		labelButton13.setBounds(10, 400, 160, 40);
		panelMenuMap.add(labelButton1);
		panelMenuMap.add(labelButton2);
		panelMenuMap.add(labelButton3);
		panelMenuMap.add(labelButton4);
		panelMenuMap.add(labelButton5);
		panelMenuMap.add(labelButton6);
		panelMenuMap.add(labelButton7);
		panelMenuMap.add(labelButton8);
		panelMenuMap.add(labelButton9);
		panelMenuMap.add(labelButton10);
		panelMenuMap.add(labelButton11);
		panelMenuMap.add(labelButton12);
		panelMenuMap.add(labelButton13);
		
		JTextPane textPane_11 = new JTextPane();
		textPane_11.setBounds(36, 52, 106, 20);
		textPane_11.setEditable(false);
		textPane_11.setForeground(new Color(0, 255, 255));
		textPane_11.setBorder(null);
		textPane_11.setOpaque(false);
		textPane_11.setText("FRIENDLY TEAM");
		panelMainMenu.add(textPane_11);
		
		JTextPane textPane_12 = new JTextPane();
		textPane_12.setBounds(518, 52, 106, 20);
		textPane_12.setEditable(false);
		textPane_12.setForeground(new Color(0, 255, 255));
		textPane_12.setBorder(null);
		textPane_12.setOpaque(false);
		textPane_12.setText("ENEMY TEAM");
		panelMainMenu.add(textPane_12);
		
		lblNewLabel.setIcon(lblNewLabelImage);
		lblNewLabel.setBounds(0, 0, 640, 480);
		panelMainMenu.add(lblNewLabel);
		
		JLabel label = new JLabel("");
		label.setBounds(0, 0, 640, 480);
		label.setIcon(new ImageIcon(AplikacjaMW050116MainClass.class.getResource("/resources/tlo.jpg")));
		
		JButton btnHauntedMines = new JButton("Haunted Mines");
		btnHauntedMines.setBounds(160, 80, 160, 40);
		btnHauntedMines.setName("Haunted Mines");
		btnHauntedMines.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent arg0) {
				addBackgroundMap(btnHauntedMines.getName());
				labelButton3.setIcon(new ImageIcon(AplikacjaMW050116MainClass.class.getResource("/resources/Button_Off.png")));
				label.setIcon(labelImage);
			}
			public void mouseExited(MouseEvent arg0) {
				addBackgroundMap(btnHauntedMines.getName());
				labelButton3.setIcon(new ImageIcon(AplikacjaMW050116MainClass.class.getResource("/resources/Button_On.png")));
				label.setIcon(labelImage);
				}
		});
		btnHauntedMines.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(lastButton==10&&lastButtonMap>0){btnDONE.setVisible(true); labelButtonDONE.setVisible(true);}
				addBackgroundMenu(btnHauntedMines.getName());
				lblNewLabel.setIcon(lblNewLabelImage);
				panelMenuMap.setVisible(false);
				panelMainMenu.setVisible(true);
				btnChooseMap.setText("Haunted Mines");
			}
		});
		panelMenuMap.setLayout(null);
		
		
		transparentButton(btnHauntedMines);
		panelMenuMap.add(btnHauntedMines);
		
		
		JButton btnTowersOfDoom = new JButton("Towers of Doom");
		btnTowersOfDoom.setBounds(320, 40, 160, 40);
		btnTowersOfDoom.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent arg0) {
				addBackgroundMap(btnTowersOfDoom.getName());
				labelButton6.setIcon(new ImageIcon(AplikacjaMW050116MainClass.class.getResource("/resources/Button_Off.png")));
				label.setIcon(labelImage);
				MapList mapy = new MapList();
				System.out.println(mapy.hauntedMines.getName());
			}
			public void mouseExited(MouseEvent arg0) {
				addBackgroundMap(btnTowersOfDoom.getName());
				labelButton6.setIcon(new ImageIcon(AplikacjaMW050116MainClass.class.getResource("/resources/Button_On.png")));
				label.setIcon(labelImage);
				}
		});
		btnTowersOfDoom.setName("Towers of Doom");
		btnTowersOfDoom.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(lastButton==10&&lastButtonMap>0){btnDONE.setVisible(true); labelButtonDONE.setVisible(true);}
				addBackgroundMenu(btnTowersOfDoom.getName());
				lblNewLabel.setIcon(lblNewLabelImage);
				panelMenuMap.setVisible(false);
				panelMainMenu.setVisible(true);
				btnChooseMap.setText("Towers of Doom");
			}
		});
		transparentButton(btnTowersOfDoom);
		panelMenuMap.add(btnTowersOfDoom);
		
		JButton btnInfernalShrines = new JButton("Infernal Shrines");
		btnInfernalShrines.setBounds(480, 40, 160, 40);
		btnInfernalShrines.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				addBackgroundMap(btnInfernalShrines.getName());
				labelButton5.setIcon(new ImageIcon(AplikacjaMW050116MainClass.class.getResource("/resources/Button_Off.png")));
				label.setIcon(labelImage);
			}
			public void mouseExited(MouseEvent arg0) {
				addBackgroundMap(btnInfernalShrines.getName());
				labelButton5.setIcon(new ImageIcon(AplikacjaMW050116MainClass.class.getResource("/resources/Button_On.png")));
				label.setIcon(labelImage);
				}
		});
		btnInfernalShrines.setName("Infernal Shrines");
		btnInfernalShrines.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(lastButton==10&&lastButtonMap>0){btnDONE.setVisible(true); labelButtonDONE.setVisible(true);}
				addBackgroundMenu(btnInfernalShrines.getName());
				lblNewLabel.setIcon(lblNewLabelImage);
				panelMenuMap.setVisible(false);
				panelMainMenu.setVisible(true);
				btnChooseMap.setText("Infernal Shrines");
			}
		});
		transparentButton(btnInfernalShrines);
		panelMenuMap.add(btnInfernalShrines);
		
		JButton btnBattlefieldOfEternity = new JButton("Battlefield of Eternity");
		btnBattlefieldOfEternity.setBounds(160, 0, 160, 40);
		btnBattlefieldOfEternity.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				addBackgroundMap(btnBattlefieldOfEternity.getName());
				labelButton11.setIcon(new ImageIcon(AplikacjaMW050116MainClass.class.getResource("/resources/Button_Off.png")));
				label.setIcon(labelImage);
			}
			public void mouseExited(MouseEvent arg0) {
				addBackgroundMap(btnBattlefieldOfEternity.getName());
				labelButton11.setIcon(new ImageIcon(AplikacjaMW050116MainClass.class.getResource("/resources/Button_On.png")));
				label.setIcon(labelImage);
				}
		});
		btnBattlefieldOfEternity.setName("Battlefield of Eternity");
		btnBattlefieldOfEternity.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(lastButton==10&&lastButtonMap>0){btnDONE.setVisible(true); labelButtonDONE.setVisible(true);}
				addBackgroundMenu(btnBattlefieldOfEternity.getName());
				lblNewLabel.setIcon(lblNewLabelImage);
				panelMenuMap.setVisible(false);
				panelMainMenu.setVisible(true);
				btnChooseMap.setText("Battlefield of Eternity");
			}
		});
		transparentButton(btnBattlefieldOfEternity);
		panelMenuMap.add(btnBattlefieldOfEternity);
		
		JButton btnTombOfThe = new JButton("Tomb of The Spider Queen");
		btnTombOfThe.setBounds(0, 0, 160, 40);
		btnTombOfThe.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				addBackgroundMap(btnTombOfThe.getName());
				labelButton12.setIcon(new ImageIcon(AplikacjaMW050116MainClass.class.getResource("/resources/Button_Off.png")));
				label.setIcon(labelImage);
			}

			public void mouseExited(MouseEvent arg0) {
				addBackgroundMap(btnTombOfThe.getName());
				labelButton12.setIcon(new ImageIcon(AplikacjaMW050116MainClass.class.getResource("/resources/Button_On.png")));
				label.setIcon(labelImage);
				}
		});
		btnTombOfThe.setName("Tomb of The Spider Quoeen");
		btnTombOfThe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(lastButton==10&&lastButtonMap>0){btnDONE.setVisible(true); labelButtonDONE.setVisible(true);}
				addBackgroundMenu(btnTombOfThe.getName());
				lblNewLabel.setIcon(lblNewLabelImage);
				panelMenuMap.setVisible(false);
				panelMainMenu.setVisible(true);
				btnChooseMap.setText("Tomb of The Spider Quoeen");
			}
		});
		

		transparentButton(btnTombOfThe);
		panelMenuMap.add(btnTombOfThe);
		
		JButton btnSkyTemple = new JButton("Sky Temple");
		btnSkyTemple.setBounds(320, 80, 160, 40);
		btnSkyTemple.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				addBackgroundMap(btnSkyTemple.getName());
				labelButton2.setIcon(new ImageIcon(AplikacjaMW050116MainClass.class.getResource("/resources/Button_Off.png")));
				label.setIcon(labelImage);
			}
			public void mouseExited(MouseEvent arg0) {
				addBackgroundMap(btnSkyTemple.getName());
				labelButton2.setIcon(new ImageIcon(AplikacjaMW050116MainClass.class.getResource("/resources/Button_On.png")));
				label.setIcon(labelImage);
				}

		});
		btnSkyTemple.setName("Sky Temple");
		btnSkyTemple.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(lastButton==10&&lastButtonMap>0){btnDONE.setVisible(true); labelButtonDONE.setVisible(true);}
				addBackgroundMenu(btnSkyTemple.getName());
				lblNewLabel.setIcon(lblNewLabelImage);
				panelMenuMap.setVisible(false);
				panelMainMenu.setVisible(true);
				btnChooseMap.setText("Sky Temple");
			}
		});
		transparentButton(btnSkyTemple);
		panelMenuMap.add(btnSkyTemple);
		
		JButton btnGardenOfTerror = new JButton("Garden of Terror");
		btnGardenOfTerror.setBounds(480, 80, 160, 40);
		btnGardenOfTerror.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				addBackgroundMap(btnGardenOfTerror.getName());
				labelButton1.setIcon(new ImageIcon(AplikacjaMW050116MainClass.class.getResource("/resources/Button_Off.png")));
				label.setIcon(labelImage);
				}
			public void mouseExited(MouseEvent arg0) {
				addBackgroundMap(btnGardenOfTerror.getName());
				labelButton1.setIcon(new ImageIcon(AplikacjaMW050116MainClass.class.getResource("/resources/Button_On.png")));
				label.setIcon(labelImage);
				}
		});
		btnGardenOfTerror.setName("Garden of Terror");
		btnGardenOfTerror.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(lastButton==10&&lastButtonMap>0){btnDONE.setVisible(true); labelButtonDONE.setVisible(true);}
				addBackgroundMenu(btnGardenOfTerror.getName());
				lblNewLabel.setIcon(lblNewLabelImage);
				panelMenuMap.setVisible(false);
				panelMainMenu.setVisible(true);
				btnChooseMap.setText("Garden of Terror");
			}
		});
		transparentButton(btnGardenOfTerror);
		panelMenuMap.add(btnGardenOfTerror);
		
		JButton btnBlackheartsBay = new JButton("Blackheart's Bay");
		btnBlackheartsBay.setBounds(320, 0, 160, 40);
		btnBlackheartsBay.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				addBackgroundMap(btnBlackheartsBay.getName());
				labelButton10.setIcon(new ImageIcon(AplikacjaMW050116MainClass.class.getResource("/resources/Button_Off.png")));
				label.setIcon(labelImage);
			}
			public void mouseExited(MouseEvent arg0) {
				addBackgroundMap(btnBlackheartsBay.getName());
				labelButton10.setIcon(new ImageIcon(AplikacjaMW050116MainClass.class.getResource("/resources/Button_On.png")));
				label.setIcon(labelImage);
				}
		});
		btnBlackheartsBay.setName("Blackheart's Bay");
		btnBlackheartsBay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(lastButton==10&&lastButtonMap>0){btnDONE.setVisible(true); labelButtonDONE.setVisible(true);}
				addBackgroundMenu(btnBlackheartsBay.getName());
				lblNewLabel.setIcon(lblNewLabelImage);
				panelMenuMap.setVisible(false);
				panelMainMenu.setVisible(true);
				btnChooseMap.setText("Blackheart's Bay");
			}
		});
		transparentButton(btnBlackheartsBay);
		panelMenuMap.add(btnBlackheartsBay);
		
		JButton btnDragonShire = new JButton("Dragon Shire");
		btnDragonShire.setBounds(0, 40, 160, 40);
		btnDragonShire.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				addBackgroundMap(btnDragonShire.getName());
				labelButton8.setIcon(new ImageIcon(AplikacjaMW050116MainClass.class.getResource("/resources/Button_Off.png")));
				label.setIcon(labelImage);
			}
			public void mouseExited(MouseEvent arg0) {
				addBackgroundMap(btnDragonShire.getName());
				labelButton8.setIcon(new ImageIcon(AplikacjaMW050116MainClass.class.getResource("/resources/Button_On.png")));
				label.setIcon(labelImage);
				}
		});
		btnDragonShire.setName("Dragon Shire");
		btnDragonShire.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(lastButton==10&&lastButtonMap>0){btnDONE.setVisible(true); labelButtonDONE.setVisible(true);}
				addBackgroundMenu(btnDragonShire.getName());
				lblNewLabel.setIcon(lblNewLabelImage);
				panelMenuMap.setVisible(false);
				panelMainMenu.setVisible(true);
				btnChooseMap.setText("Dragon Shire");
			}
		});
		transparentButton(btnDragonShire);
		panelMenuMap.add(btnDragonShire);
		
		JButton btnCursedHollow = new JButton("Cursed Hollow");
		btnCursedHollow.setBounds(0, 80, 160, 40);
		btnCursedHollow.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				addBackgroundMap(btnCursedHollow.getName());
				labelButton4.setIcon(new ImageIcon(AplikacjaMW050116MainClass.class.getResource("/resources/Button_Off.png")));
				label.setIcon(labelImage);
			}
			public void mouseExited(MouseEvent arg0) {
				addBackgroundMap(btnCursedHollow.getName());
				labelButton4.setIcon(new ImageIcon(AplikacjaMW050116MainClass.class.getResource("/resources/Button_On.png")));
				label.setIcon(labelImage);
				}
		});
		btnCursedHollow.setName("Cursed Hollow");
		btnCursedHollow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(lastButton==10&&lastButtonMap>0){btnDONE.setVisible(true); labelButtonDONE.setVisible(true);}
				addBackgroundMenu(btnCursedHollow.getName());
				lblNewLabel.setIcon(lblNewLabelImage);
				panelMenuMap.setVisible(false);
				panelMainMenu.setVisible(true);
				btnChooseMap.setText("Cursed Hollow");
			}
		});
		transparentButton(btnCursedHollow);
		panelMenuMap.add(btnCursedHollow);
		
		JButton btnBraxisHoldout = new JButton("Braxis Holdout");
		btnBraxisHoldout.setBounds(160, 40, 160, 40);
		btnBraxisHoldout.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				addBackgroundMap(btnBraxisHoldout.getName());
				labelButton7.setIcon(new ImageIcon(AplikacjaMW050116MainClass.class.getResource("/resources/Button_Off.png")));
				label.setIcon(labelImage);
			}
			public void mouseExited(MouseEvent arg0) {
				addBackgroundMap(btnBraxisHoldout.getName());
				labelButton7.setIcon(new ImageIcon(AplikacjaMW050116MainClass.class.getResource("/resources/Button_On.png")));
				label.setIcon(labelImage);
				}
		});
		btnBraxisHoldout.setName("Braxis Holdout");
		btnBraxisHoldout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(lastButton==10&&lastButtonMap>0){btnDONE.setVisible(true); labelButtonDONE.setVisible(true);}
				addBackgroundMenu(btnBraxisHoldout.getName());
				lblNewLabel.setIcon(lblNewLabelImage);
				panelMenuMap.setVisible(false);
				panelMainMenu.setVisible(true);
				btnChooseMap.setText("Braxis Holdout");
			}
		});
		transparentButton(btnBraxisHoldout);
		panelMenuMap.add(btnBraxisHoldout);
		
		JButton btnWarheadJunction = new JButton("Warhead Junction");
		btnWarheadJunction.setBounds(480, 0, 160, 40);
		btnWarheadJunction.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				addBackgroundMap(btnWarheadJunction.getName());
				labelButton9.setIcon(new ImageIcon(AplikacjaMW050116MainClass.class.getResource("/resources/Button_Off.png")));
				label.setIcon(labelImage);
			}
			public void mouseExited(MouseEvent arg0) {
				addBackgroundMap(btnWarheadJunction.getName());
				labelButton9.setIcon(new ImageIcon(AplikacjaMW050116MainClass.class.getResource("/resources/Button_On.png")));
				label.setIcon(labelImage);
				}
		});
		btnWarheadJunction.setName("Warhead Junction");
		btnWarheadJunction.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(lastButton==10&&lastButtonMap>0){btnDONE.setVisible(true); labelButtonDONE.setVisible(true);}
				addBackgroundMenu(btnWarheadJunction.getName());
				lblNewLabel.setIcon(lblNewLabelImage);
				panelMenuMap.setVisible(false);
				panelMainMenu.setVisible(true);
				btnChooseMap.setText("Warhead Junction");
				
			}
		});
		transparentButton(btnWarheadJunction);
		panelMenuMap.add(btnWarheadJunction);
		
		JButton btnExit = new JButton("Exit");

		btnExit.setBounds(10, 400, 160, 40);
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lastButtonMap--;
				panelMenuMap.setVisible(false);
				panelMainMenu.setVisible(true);
				label.setIcon(lblNewLabelImage);
			}

		});
		btnExit.addMouseListener(new MouseAdapter() {
			public void mouseExited(MouseEvent arg0) {
				labelButton13.setIcon(new ImageIcon(AplikacjaMW050116MainClass.class.getResource("/resources/Button_On.png")));
				}
			public void mouseEntered(MouseEvent e) {
				labelButton13.setIcon(new ImageIcon(AplikacjaMW050116MainClass.class.getResource("/resources/Button_Off.png")));
				}
		});
		transparentButton(btnExit);
		panelMenuMap.add(btnExit);
		panelMenuMap.add(label);
		

		

		
	
	}

	private void transparentButton(JButton name) {
		name.setForeground(new Color(0, 255, 255));
		name.setBorder(null);
		name.setBorderPainted(false);
		name.setContentAreaFilled(false);
		name.setOpaque(false);
		}
	private void transparentLabel(JLabel name) {
		}
	private void addBackgroundMap(String name){
		labelImage=new ImageIcon(AplikacjaMW050116MainClass.class.getResource("/resources/"+name+".jpg"));
	}
	
	private void addBackgroundMenu(String name){
		lblNewLabelImage=new ImageIcon(AplikacjaMW050116MainClass.class.getResource("/resources/"+name+".jpg"));
	}
}
