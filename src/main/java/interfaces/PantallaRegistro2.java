package interfaces;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PantallaRegistro2 extends JPanel{
	private Ventana ventana;
	private JTextField txtEdad;
	private JTextField txtPeso;
	private JTextField txtAlt;
	
	public PantallaRegistro2(Ventana v) {
		this.ventana=v;
		setLayout(null);
		
		JLabel lblEdad = new JLabel("Edad");
		lblEdad.setBounds(80, 27, 30, 14);
		add(lblEdad);
		
		JLabel lblPeso = new JLabel("Peso (Kg)");
		lblPeso.setBounds(80, 72, 57, 14);
		add(lblPeso);
		
		JLabel lblAltura = new JLabel("Altura (cm)");
		lblAltura.setBounds(74, 119, 77, 14);
		add(lblAltura);
		
		JLabel lblAlergias = new JLabel("Alergias");
		lblAlergias.setBounds(64, 191, 50, 14);
		add(lblAlergias);
		
		JCheckBox chckbxLactosa = new JCheckBox("Lactosa");
		chckbxLactosa.setBounds(120, 170, 81, 23);
		add(chckbxLactosa);
		
		JCheckBox chckbxPescado = new JCheckBox("Pescado");
		chckbxPescado.setBounds(203, 170, 87, 23);
		add(chckbxPescado);
		
		JCheckBox chckbxHuevo = new JCheckBox("Huevo");
		chckbxHuevo.setBounds(292, 170, 70, 23);
		add(chckbxHuevo);
		
		JCheckBox chckbxCacahuete = new JCheckBox("Cacahuete");
		chckbxCacahuete.setBounds(120, 205, 87, 23);
		add(chckbxCacahuete);
		
		JCheckBox chckbxMarisco = new JCheckBox("Marisco");
		chckbxMarisco.setBounds(203, 205, 87, 23);
		add(chckbxMarisco);
		
		JCheckBox chckbxSoja = new JCheckBox("Soja");
		chckbxSoja.setBounds(292, 205, 63, 23);
		add(chckbxSoja);
		
		txtEdad = new JTextField();
		txtEdad.setBounds(187, 24, 86, 20);
		add(txtEdad);
		txtEdad.setColumns(10);
		
		txtPeso = new JTextField();
		txtPeso.setBounds(187, 69, 86, 20);
		add(txtPeso);
		txtPeso.setColumns(10);
		
		txtAlt = new JTextField();
		txtAlt.setColumns(10);
		txtAlt.setBounds(187, 116, 86, 20);
		add(txtAlt);
		
		JButton btnRegF = new JButton("Finalizar");
		btnRegF.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ventana.cambiarAPantalla(PantallaLoguin.class);
			}
		});
		btnRegF.setBounds(187, 252, 89, 23);
		add(btnRegF);
		
	}
}
