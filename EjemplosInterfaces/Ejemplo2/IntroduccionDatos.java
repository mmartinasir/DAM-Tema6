package Ejemplo2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.sun.xml.internal.ws.api.model.wsdl.editable.EditableWSDLBoundFault;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.SwingConstants;

public class IntroduccionDatos extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IntroduccionDatos frame = new IntroduccionDatos();
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
	public IntroduccionDatos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		ButtonGroup sexo = new ButtonGroup();
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setFont(new Font("Arial", Font.BOLD, 20));
		lblNombre.setBounds(12, 14, 93, 15);
		contentPane.add(lblNombre);
		
		JLabel lblEdad = new JLabel("Edad:");
		lblEdad.setFont(new Font("Arial", Font.BOLD, 20));
		lblEdad.setBounds(12, 75, 93, 15);
		contentPane.add(lblEdad);
		
		JLabel lblSexo = new JLabel("Sexo:");
		lblSexo.setFont(new Font("Arial", Font.BOLD, 20));
		lblSexo.setBounds(12, 145, 93, 15);
		contentPane.add(lblSexo);
		
		textField = new JTextField();
		textField.setBounds(108, 12, 114, 24);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40"}));
		comboBox.setBounds(108, 71, 49, 24);
		contentPane.add(comboBox);
		
		JRadioButton rdbtnHombre = new JRadioButton("Hombre");
		rdbtnHombre.setBounds(108, 121, 149, 23);
		contentPane.add(rdbtnHombre);
		
		JRadioButton rdbtnMujer = new JRadioButton("Mujer");
		rdbtnMujer.setBounds(108, 158, 149, 23);
		contentPane.add(rdbtnMujer);
		
		sexo.add(rdbtnHombre);
		sexo.add(rdbtnMujer);
		
		JCheckBox chckbxcasado = new JCheckBox("¿Casado?");
		chckbxcasado.setFont(new Font("Arial", Font.BOLD, 20));
		chckbxcasado.setBounds(12, 206, 129, 23);
		contentPane.add(chckbxcasado);
		
		JPanel panel = new JPanel();
		panel.setBounds(253, 47, 183, 182);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnGuardar = new JButton("Guardar\n");
		btnGuardar.setBounds(105, 245, 117, 25);
		contentPane.add(btnGuardar);
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				System.out.println("Prueba");
				
				JLabel lblMostrarEdad = new JLabel("Edad:");
				lblMostrarEdad.setBounds(0, 39, 70, 15);
				panel.add(lblMostrarEdad);
				
				JLabel lblEdadMostrada = new JLabel(""+comboBox.getSelectedItem());
				lblEdadMostrada.setBounds(74, 39, 70, 15);
				panel.add(lblEdadMostrada);
				
				JLabel lblMostrarSexo = new JLabel("Sexo:");
				lblMostrarSexo.setBounds(0, 66, 70, 15);
				panel.add(lblMostrarSexo);
				
				if (sexo.getSelection() == rdbtnHombre) {
					JLabel lblSexoMostrado = new JLabel("Hombre");
					lblSexoMostrado.setHorizontalAlignment(SwingConstants.TRAILING);
					lblSexoMostrado.setBounds(74, 66, 70, 15);
					panel.add(lblSexoMostrado);
				} else {
					JLabel lblSexoMostrado = new JLabel("Hombre");
					lblSexoMostrado.setHorizontalAlignment(SwingConstants.TRAILING);
					lblSexoMostrado.setBounds(74, 66, 70, 15);
					panel.add(lblSexoMostrado);
				}
				
				JLabel lblMostrarCasado = new JLabel("¿Casado?");
				lblMostrarCasado.setBounds(0, 97, 70, 15);
				panel.add(lblMostrarCasado);
				
				if (chckbxcasado.isSelected()) {
					JLabel lblCasadoMostrado = new JLabel("Sí");
					lblCasadoMostrado.setBounds(74, 97, 70, 15);
					panel.add(lblCasadoMostrado);

				} else {
					JLabel lblCasadoMostrado = new JLabel("No");
					lblCasadoMostrado.setBounds(74, 97, 70, 15);
					panel.add(lblCasadoMostrado);

				}
				
			}
		});
		
		JButton btnSalir = new JButton("Salir\n");
		btnSalir.setBounds(237, 245, 117, 25);
		contentPane.add(btnSalir);
		
	}
}
