package guis;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import lib.Libreria;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Main extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JButton btnBorrar;
	private JButton btnProcesar;
	private JLabel lblNewLabel;
	private JScrollPane scrollPane;
	private JTextArea textArea;
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Main() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 788, 610);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNewLabel = new JLabel("Ingreso texto");
		lblNewLabel.setBounds(10, 11, 82, 14);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(90, 8, 532, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		btnProcesar = new JButton("Procesar");
		btnProcesar.addActionListener(this);
		btnProcesar.setBounds(673, 7, 89, 23);
		contentPane.add(btnProcesar);
		
		btnBorrar = new JButton("Borrar");
		btnBorrar.addActionListener(this);
		btnBorrar.setBounds(673, 41, 89, 23);
		contentPane.add(btnBorrar);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 81, 752, 479);
		contentPane.add(scrollPane);
		
		textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnProcesar) {
			actionPerformedBtnProcesar(e);
		}
		if (e.getSource() == btnBorrar) {
			actionPerformedBtnBorrar(e);
		}
	}
	protected void actionPerformedBtnBorrar(ActionEvent e) {
		
	}
	protected void actionPerformedBtnProcesar(ActionEvent e) {
		String txt = textField.getText();
		
		textArea.setText("El texto validado es: " + Libreria.textoValido(txt) + "\n");
		textArea.append("Longitud de texto valido: " + Libreria.logitudTextoValido(txt) + "\n");
		textArea.append("Primer carácter: " + Libreria.primeraLetra(txt) + "\n");
		textArea.append("Ultima carácter: " + Libreria.ultimaLetra(txt) + "\n\n");
		
		
		textArea.append("texto ajustado: " + Libreria.ajustarEspacios(txt) + "\n");
		textArea.append("longitud de texto ajustado: " + Libreria.logitudTextoAjustado(txt) + "\n");
		textArea.append("cantidad de palabras: " + Libreria.cantidadPalabras(txt) + "\n");
		textArea.append("texto en minúsculas: " + Libreria.textoMinuscula(txt) + "\n");
		textArea.append("texto en minúsculas: " + Libreria.textoMayuscula(txt) + "\n");
		textArea.append("espacios por guiones: " + Libreria.espacionPorGuiones(txt) + "\n");
		textArea.append("posición del primer espacio: " + Libreria.posicionPrimerEspacio(txt) + "\n");
		textArea.append("primera palabra: " + Libreria.primeraPalabra(txt) + "\n");
		textArea.append("posición del primer espacio: " + Libreria.posicionUltimoEspacio(txt) + "\n");
		textArea.append("primera palabra: " + Libreria.ultimaPalabra(txt) + "\n");
		
		textArea.append("texto sin la primera palabra: " + Libreria.sinPrimeraPalabra(txt) + "\n");
		textArea.append("texto sin la ultima palabra: " + Libreria.sinUltimaPalabra(txt) + "\n");
		textArea.append("primera palabra al final: " + Libreria.primeraPalabraAlFinal(txt) + "\n");
		textArea.append("ultima palabra al inicio: " + Libreria.ultimaPalabraAlInicio(txt) + "\n");
	}
}
