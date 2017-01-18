import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
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

public class AplikacjaMW050116MainClass {

	private JFrame frmNoTitleYet;
	private JPanel panelMainMenu;
	private JPanel panelMenuMap;
	private JPanel panelMenuInfo;
	private JLabel label;
	private JLabel lblNewLabel;
	private ImageIcon labelImage;
	private ImageIcon lblNewLabelImage;

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
		frmNoTitleYet.setIconImage(Toolkit.getDefaultToolkit().getImage(AplikacjaMW050116MainClass.class.getResource("/resources/Coin_200_175.png")));
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
		panelMenuMap.setLayout(null);
		panelMenuMap.setVisible(false);
		
		JPanel panelMenuInfo = new JPanel();
		frmNoTitleYet.getContentPane().add(panelMenuInfo, "name_470414835695040");
		panelMenuInfo.setLayout(null);
		panelMenuInfo.setVisible(false);
		
		JButton btnChooseMap = new JButton("Choose Map");
		btnChooseMap.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelMenuMap.setVisible(true);
				panelMainMenu.setVisible(false);
			}
		});
		
		btnChooseMap.setBounds(226, 11, 170, 39);
		transparentButton(btnChooseMap);
		panelMainMenu.add(btnChooseMap);
		
		JButton btnEnd = new JButton("Get OUT!");
		btnEnd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnEnd.setBounds(251, 342, 106, 55);
		transparentButton(btnEnd);
		panelMainMenu.add(btnEnd);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabelImage=new ImageIcon(AplikacjaMW050116MainClass.class.getResource("/resources/tlo_640_480.jpg"));
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.addContainerListener(new ContainerAdapter() {
			@Override
			public void componentAdded(ContainerEvent arg0) {
			}
		});
		comboBox_1.setBounds(36, 83, 106, 20);
		panelMainMenu.add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(36, 114, 106, 20);
		panelMainMenu.add(comboBox_2);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setBounds(36, 145, 106, 20);
		panelMainMenu.add(comboBox_3);
		
		JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setBounds(36, 176, 106, 20);
		panelMainMenu.add(comboBox_4);
		
		JComboBox comboBox_5 = new JComboBox();
		comboBox_5.setBounds(36, 207, 106, 20);
		panelMainMenu.add(comboBox_5);
		
		JComboBox comboBox_6 = new JComboBox();
		comboBox_6.setBounds(518, 83, 106, 20);
		panelMainMenu.add(comboBox_6);
		
		JComboBox comboBox_7 = new JComboBox();
		comboBox_7.setBounds(518, 114, 106, 20);
		panelMainMenu.add(comboBox_7);
		
		JComboBox comboBox_8 = new JComboBox();
		comboBox_8.setBounds(518, 145, 106, 20);
		panelMainMenu.add(comboBox_8);
		
		JComboBox comboBox_9 = new JComboBox();
		comboBox_9.setBounds(518, 176, 106, 20);
		panelMainMenu.add(comboBox_9);
		
		JComboBox comboBox_10 = new JComboBox();
		comboBox_10.setBounds(518, 207, 106, 20);
		panelMainMenu.add(comboBox_10);
		
		lblNewLabel.setIcon(lblNewLabelImage);
		lblNewLabel.setBounds(0, 0, 640, 480);
		panelMainMenu.add(lblNewLabel);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(AplikacjaMW050116MainClass.class.getResource("/resources/tlo_640_480.jpg")));
		label.setBounds(0, 0, 640, 480);
		
		JButton btnHauntedMines = new JButton("Haunted Mines");
		btnHauntedMines.setName("Haunted Mines");
		btnHauntedMines.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent arg0) {
				addBackgroundMap(btnHauntedMines.getName());
				label.setIcon(labelImage);
			}
		});
		btnHauntedMines.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addBackgroundMenu(btnHauntedMines.getName());
				lblNewLabel.setIcon(lblNewLabelImage);
				panelMenuMap.setVisible(false);
				panelMainMenu.setVisible(true);
				btnChooseMap.setText("Haunted Mines");
			}
		});
		btnHauntedMines.setBounds(10, 11, 109, 23);
		transparentButton(btnHauntedMines);
		panelMenuMap.add(btnHauntedMines);
		
		JButton btnTowersOfDoom = new JButton("Towers of Doom");
		btnTowersOfDoom.setName("Towers of Doom");
		btnTowersOfDoom.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelMenuMap.setVisible(false);
				panelMainMenu.setVisible(true);
				btnChooseMap.setText("Towers of Doom");
			}
		});
		btnTowersOfDoom.setBounds(140, 11, 111, 23);
		transparentButton(btnTowersOfDoom);
		panelMenuMap.add(btnTowersOfDoom);
		
		JButton btnInfernalShrines = new JButton("Infernal Shrines");
		btnInfernalShrines.setName("Infernal Shrines");
		btnInfernalShrines.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelMenuMap.setVisible(false);
				panelMainMenu.setVisible(true);
				btnChooseMap.setText("Infernal Shrines");
			}
		});
		btnInfernalShrines.setBounds(270, 11, 109, 23);
		transparentButton(btnInfernalShrines);
		panelMenuMap.add(btnInfernalShrines);
		
		JButton btnBattlefieldOfEternity = new JButton("Battlefield of Eternity");
		btnBattlefieldOfEternity.setName("Battlefield of Eternity");
		btnBattlefieldOfEternity.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelMenuMap.setVisible(false);
				panelMainMenu.setVisible(true);
				btnChooseMap.setText("Battlefield of Eternity");
			}
		});
		btnBattlefieldOfEternity.setBounds(400, 11, 135, 23);
		transparentButton(btnBattlefieldOfEternity);
		panelMenuMap.add(btnBattlefieldOfEternity);
		
		JButton btnTombOfThe = new JButton("Tomb of The Spider Quoeen");
		btnTombOfThe.setName("Tomb of The Spider Quoeen");
		btnTombOfThe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelMenuMap.setVisible(false);
				panelMainMenu.setVisible(true);
				btnChooseMap.setText("Tomb of The Spider Quoeen");
			}
		});
		btnTombOfThe.setBounds(10, 45, 167, 23);
		transparentButton(btnTombOfThe);
		panelMenuMap.add(btnTombOfThe);
		
		JButton btnSkyTemple = new JButton("Sky Temple");
		btnSkyTemple.setName("Sky Temple");
		btnSkyTemple.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelMenuMap.setVisible(false);
				panelMainMenu.setVisible(true);
				btnChooseMap.setText("Sky Temple");
			}
		});
		btnSkyTemple.setBounds(187, 45, 87, 23);
		transparentButton(btnSkyTemple);
		panelMenuMap.add(btnSkyTemple);
		
		JButton btnGardenOfTerror = new JButton("Garden of Terror");
		btnGardenOfTerror.setName("Garden of Terror");
		btnGardenOfTerror.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelMenuMap.setVisible(false);
				panelMainMenu.setVisible(true);
				btnChooseMap.setText("Garden of Terror");
			}
		});
		btnGardenOfTerror.setBounds(280, 45, 113, 23);
		transparentButton(btnGardenOfTerror);
		panelMenuMap.add(btnGardenOfTerror);
		
		JButton btnBlackheartsBay = new JButton("Blackheart's Bay");
		btnBlackheartsBay.setName("Blackheart's Bay");
		btnBlackheartsBay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelMenuMap.setVisible(false);
				panelMainMenu.setVisible(true);
				btnChooseMap.setText("Blackheart's Bay");
			}
		});
		btnBlackheartsBay.setBounds(410, 45, 111, 23);
		transparentButton(btnBlackheartsBay);
		panelMenuMap.add(btnBlackheartsBay);
		
		JButton btnDragonShire = new JButton("Dragon Shire");
		btnDragonShire.setName("Dragon Shire");
		btnDragonShire.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelMenuMap.setVisible(false);
				panelMainMenu.setVisible(true);
				btnChooseMap.setText("Dragon Shire");
			}
		});
		btnDragonShire.setBounds(10, 79, 95, 23);
		transparentButton(btnDragonShire);
		panelMenuMap.add(btnDragonShire);
		
		JButton btnCursedHollow = new JButton("Cursed Hollow");
		btnCursedHollow.setName("Cursed Hollow");
		btnCursedHollow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelMenuMap.setVisible(false);
				panelMainMenu.setVisible(true);
				btnChooseMap.setText("Cursed Hollow");
			}
		});
		btnCursedHollow.setBounds(115, 79, 101, 23);
		transparentButton(btnCursedHollow);
		panelMenuMap.add(btnCursedHollow);
		
		JButton btnBraxisHoldout = new JButton("Braxis Holdout");
		btnBraxisHoldout.setName("Braxis Holdout");
		btnBraxisHoldout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelMenuMap.setVisible(false);
				panelMainMenu.setVisible(true);
				btnChooseMap.setText("Braxis Holdout");
			}
		});
		btnBraxisHoldout.setBounds(226, 79, 101, 23);
		transparentButton(btnBraxisHoldout);
		panelMenuMap.add(btnBraxisHoldout);
		
		JButton btnWarheadJunction = new JButton("Warhead Junction");
		btnWarheadJunction.setName("Warhead Junction");
		btnWarheadJunction.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelMenuMap.setVisible(false);
				panelMainMenu.setVisible(true);
				btnChooseMap.setText("Warhead Junction");
			}
		});
		btnWarheadJunction.setBounds(337, 79, 119, 23);
		transparentButton(btnWarheadJunction);
		panelMenuMap.add(btnWarheadJunction);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelMenuMap.setVisible(false);
				panelMainMenu.setVisible(true);
				label.setIcon(lblNewLabelImage);
			}
		});
		btnExit.setBounds(270, 300, 89, 23);
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
	private void addBackgroundMap(String name){
		labelImage=new ImageIcon(AplikacjaMW050116MainClass.class.getResource("/resources/"+name+"_640_480.jpg"));
	}
	
	private void addBackgroundMenu(String name){
		lblNewLabelImage=new ImageIcon(AplikacjaMW050116MainClass.class.getResource("/resources/"+name+"_640_480.jpg"));
	}
}
