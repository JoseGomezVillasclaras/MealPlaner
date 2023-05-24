package interfaces;

import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.BoxLayout;

public class PantallaRegistro extends JPanel{
	private Ventana ventana;
	private JTextField textField;
	private JPasswordField passwordField;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	
	public PantallaRegistro(Ventana v) {
		this.ventana=v;
		setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(239, 232, 240));
		add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Email");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(73, 56, 46, 14);
		panel.add(lblNewLabel);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setHorizontalAlignment(SwingConstants.CENTER);
		lblPassword.setBounds(52, 93, 77, 14);
		panel.add(lblPassword);
		
		textField = new JTextField();
		textField.setBackground(new Color(172, 247, 89));
		textField.setBounds(160, 53, 162, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBackground(new Color(172, 247, 89));
		passwordField.setBounds(160, 90, 162, 20);
		panel.add(passwordField);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(73, 238, 46, 14);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_4 = new JLabel("Registration");
		lblNewLabel_4.setForeground(new Color(255, 255, 255));
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_4.setBounds(174, 11, 126, 35);
		panel.add(lblNewLabel_4);
		
		JRadioButton rdbHombre = new JRadioButton("Hombre");
		buttonGroup.add(rdbHombre);
		rdbHombre.setBounds(160, 138, 77, 23);
		panel.add(rdbHombre);
		
		JRadioButton rdbMujer = new JRadioButton("Mujer");
		buttonGroup.add(rdbMujer);
		rdbMujer.setBounds(244, 138, 78, 23);
		panel.add(rdbMujer);
		
		JLabel lblGenero = new JLabel("Genero");
		lblGenero.setBounds(73, 142, 46, 14);
		panel.add(lblGenero);
		
		JLabel lblObget = new JLabel("Objetivo");
		lblObget.setBounds(73, 213, 46, 14);
		panel.add(lblObget);
		
		JButton btnRSiguiente = new JButton("Siguiente");
		btnRSiguiente.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ventana.cambiarAPantalla(PantallaRegistro2.class);
			}
		});
		btnRSiguiente.setBounds(317, 250, 89, 23);
		panel.add(btnRSiguiente);
		
		JRadioButton rdbtnVolumen = new JRadioButton("Volumen");
		buttonGroup_1.add(rdbtnVolumen);
		rdbtnVolumen.setBounds(160, 179, 109, 27);
		panel.add(rdbtnVolumen);
		
		JRadioButton rdbtnMantenimiento = new JRadioButton("Mantenimiento");
		buttonGroup_1.add(rdbtnMantenimiento);
		rdbtnMantenimiento.setBounds(160, 209, 109, 23);
		panel.add(rdbtnMantenimiento);
		
		JRadioButton rdbtnDefinicion = new JRadioButton("Definición");
		buttonGroup_1.add(rdbtnDefinicion);
		rdbtnDefinicion.setBounds(160, 238, 109, 23);
		panel.add(rdbtnDefinicion);
	}
}

