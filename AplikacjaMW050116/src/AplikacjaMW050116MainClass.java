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

public class AplikacjaMW050116MainClass {

	private JFrame frmNoTitleYet;
	private JTextField textField;
	private JPanel panelMainMenu;
	private JPanel panelMenuMap;
	private JPanel panelMenuInfo;
	private JLabel label;
	private JLabel lblNewLabel;

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
		
		textField = new JTextField();
		textField.setForeground(new Color(0, 255, 255));
		textField.setBounds(161, 61, 298, 241);
		textField.setBorder(null);
		textField.setOpaque(false);
		panelMainMenu.add(textField);
		textField.setColumns(10);
		
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
		lblNewLabel.setIcon(new ImageIcon(AplikacjaMW050116MainClass.class.getResource("/resources/tlo_640_480.jpg")));
		lblNewLabel.setBounds(0, 0, 640, 480);
		panelMainMenu.add(lblNewLabel);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(AplikacjaMW050116MainClass.class.getResource("/resources/tlo_640_480.jpg")));
		label.setBounds(0, 0, 640, 480);
		
		JButton btnHauntedMines = new JButton("Haunted Mines");
		btnHauntedMines.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent arg0) {
				label.setIcon(new ImageIcon(AplikacjaMW050116MainClass.class.getResource("/resources/Haunted Mines_640_480.jpg")));
			}
			public void mouseExited(MouseEvent e) {
				label.setIcon(new ImageIcon(AplikacjaMW050116MainClass.class.getResource("/resources/tlo_640_480.jpg")));
			}
		});
		btnHauntedMines.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblNewLabel.setIcon(new ImageIcon(AplikacjaMW050116MainClass.class.getResource("/resources/Haunted Mines_640_480.jpg")));
				panelMenuMap.setVisible(false);
				panelMainMenu.setVisible(true);
				btnChooseMap.setText("Haunted Mines");
			}
		});
		btnHauntedMines.setBounds(10, 11, 109, 23);
		transparentButton(btnHauntedMines);
		panelMenuMap.add(btnHauntedMines);
		
		JButton btnTowersOfDoom = new JButton("Towers of Doom");
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
}