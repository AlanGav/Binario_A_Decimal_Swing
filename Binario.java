import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Binario{
	JFrame ventana;
	final JLabel resultado;
	JButton calcular;
	final JTextField datoBinario;
	public Binario(){
		ventana=new JFrame("Decimal a Binario");
	    datoBinario=new JTextField(8);
	    resultado=new JLabel();
		calcular=new JButton("Calcular");

		calcular.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){
					int binario=Integer.parseInt(datoBinario.getText());
					String concatenar="";
					while (binario>0) {
						int residuo=binario%2;
						concatenar=residuo+concatenar;
						binario/=2;
					}
					resultado.setText(concatenar);
				}

		});
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.setLayout(new FlowLayout());
		ventana.add(datoBinario);
		ventana.add(resultado);
		ventana.add(calcular);
		ventana.setSize(200,100);
		ventana.setVisible(true);

	}
	public static void main(String[] args) {
		new Binario();
	}
}