package Repeticao;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;



@SuppressWarnings("serial")
public class teste extends TelaBase {
	public static void main(String[] args) {
		new teste();
	}

	private JLabel lblPeso, lblAltura, lblResultado;
	private JTextField txtPeso, txtAltura;
	private JButton btnLimpar, btnCalcular;
	private JPanel painelPrincipal, painelTopo, painelMeio, painelBaixo;

	public teste() {
		lblPeso = new JLabel("Peso: ");
		txtPeso = new JTextField(5);

		lblAltura = new JLabel("Altura");
		txtAltura = new JTextField(5);

		lblResultado = new JLabel(" ");

		btnLimpar = new JButton("Limpar");
		btnCalcular = new JButton("Calcular");

		painelPrincipal = new JPanel(new BorderLayout());
		painelPrincipal.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

		painelTopo = new JPanel(new GridLayout(2, 2));
		painelTopo.add(lblPeso);
		painelTopo.add(txtPeso);
		painelTopo.add(lblAltura);
		painelTopo.add(txtAltura);
		painelPrincipal.add(painelTopo, BorderLayout.NORTH);

		painelMeio = new JPanel();
		painelMeio.setBorder(BorderFactory.createEmptyBorder(30, 0, 0, 0));
		painelMeio.add(lblResultado);
		painelPrincipal.add(painelMeio, BorderLayout.CENTER);

		painelBaixo = new JPanel(new GridLayout(1, 2));
		painelBaixo.add(btnLimpar);
		painelBaixo.add(btnCalcular);
		painelPrincipal.add(painelBaixo, BorderLayout.SOUTH);

		this.add(painelPrincipal);
		this.setSize(350, 200);

		acaoBotoes();
	}

	private void acaoBotoes() {
		btnCalcular.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				double imc = Double.parseDouble(txtPeso.getText())
						/ (Double.parseDouble(txtAltura.getText()) * Double.parseDouble(txtAltura.getText()));
				lblResultado.setText(calcula(imc));
			}
		});

		btnLimpar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				txtAltura.setText("");
				txtPeso.setText("");
				lblResultado.setText("");
			}
		});
	}

	public String calcula(double media) {

		if (media < 17)
			return "Muito abaixo do peso";
		else if (media < 18.49)
			return "Abaixo do peso";
		else if (media < 24.99)
			return "Peso normal";
		else if (media < 29.99)
			return "Acima do peso";
		else if (media < 34.99)
			return "Obesidade I";
		else if (media < 39.99)
			return "Obesidade II (severa)";
		else
			return "Obesidade III (morbida)";
	}
}
