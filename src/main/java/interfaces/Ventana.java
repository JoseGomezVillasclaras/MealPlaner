package interfaces;
import javax.swing.JFrame;

public class Ventana extends JFrame{
	public Ventana() {
		this.setSize(600, 500);
		this.setTitle("MealPlaner");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setContentPane(new PantallaLoguin(this));
		this.setVisible(true);
	}
	
	public void cambiarAPantalla(Class<?>clase) {
		this.getContentPane().setVisible(false);
		if(clase.equals(PantallaLoguin.class)) {
			this.setContentPane(new PantallaLoguin(this));
		}
		if(clase.equals(PantallaRegistro.class)) {
			this.setContentPane(new PantallaRegistro(this));
		}
		if(clase.equals(PantallaRegistro2.class)) {
			this.setContentPane(new PantallaRegistro2(this));
		}
		this.getContentPane().setVisible(true);
	}
}
