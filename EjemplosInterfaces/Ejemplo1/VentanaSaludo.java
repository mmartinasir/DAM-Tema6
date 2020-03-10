package Ejemplo1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class VentanaSaludo extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldNombre;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaSaludo frame = new VentanaSaludo();
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
	public VentanaSaludo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblSaludo = new JLabel("Introduzca su Nombre");
		lblSaludo.setFont(new Font("Arial", Font.BOLD, 20));
		lblSaludo.setBounds(112, 60, 226, 52);
		contentPane.add(lblSaludo);
		
		JButton btnSalir = new JButton("SALIR");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnSalir.setBounds(231, 162, 122, 25);
		contentPane.add(btnSalir);
		
		JButton btnContinuar = new JButton("SALUDA");
		btnContinuar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblSaludo.setText("Hola, "+textFieldNombre.getText());
			}
		});
		btnContinuar.setBounds(75, 162, 114, 25);
		contentPane.add(btnContinuar);
		
		textFieldNombre = new JTextField();
		textFieldNombre.setText("Tu nombre");
		textFieldNombre.setBounds(161, 115, 114, 19);
		contentPane.add(textFieldNombre);
		textFieldNombre.setColumns(10);
	}
}
