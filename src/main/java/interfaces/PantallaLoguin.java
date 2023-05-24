package interfaces;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JToggleButton;
import javax.swing.JCheckBox;
import javax.swing.JScrollBar;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.SystemColor;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PantallaLoguin extends JPanel{
	private JTextField txtEmailUs;
	private JTextField TextoPregunta;
	private JPasswordField passwordField;
	private Ventana ventana;
	
	public PantallaLoguin(Ventana v) {
		this.ventana=v;
		setBackground(new Color(30, 144, 255));
		setLayout(null);
		
		txtEmailUs = new JTextField();
		txtEmailUs.setBounds(201, 187, 186, 20);
		add(txtEmailUs);
		txtEmailUs.setColumns(10);
		
		JButton btnEnter = new JButton("Enter");
		btnEnter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnEnter.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String usuario=txtEmailUs.getText();
				String contraseña=new String (passwordField.getPassword());
			}
		});
		btnEnter.setBounds(227, 273, 134, 23);
		add(btnEnter);
		
		JButton btnRegistrar = new JButton("Registrar");
		btnRegistrar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ventana.cambiarAPantalla(PantallaRegistro.class);
			}
		});
		btnRegistrar.setBounds(227, 307, 134, 23);
		add(btnRegistrar);
		
		TextoPregunta = new JTextField();
		TextoPregunta.setHorizontalAlignment(SwingConstants.CENTER);
		TextoPregunta.setBackground(new Color(112, 158, 145));
		TextoPregunta.setFont(new Font("Palatino Linotype", Font.BOLD, 23));
		TextoPregunta.setText("¿QUIEN ERES?");
		TextoPregunta.setBounds(183, 107, 219, 37);
		add(TextoPregunta);
		TextoPregunta.setColumns(10);
		
		JLabel PasswordLb = new JLabel("Password");
		PasswordLb.setBounds(136, 233, 67, 14);
		add(PasswordLb);
		
		JLabel EmailLb = new JLabel("Email");
		EmailLb.setHorizontalAlignment(SwingConstants.CENTER);
		EmailLb.setBounds(148, 190, 46, 14);
		add(EmailLb);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(201, 230, 186, 20);
		add(passwordField);
	}
}

