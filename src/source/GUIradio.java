package source;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUIradio extends DriveRadio{

	private JPanel contentPane;
	private JTextField txtEmisora;
	private JLabel lblOnOff;
	private JFrame frame; 
	private JLabel lblFrecuencia;
	private JLabel lblOpcion;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUIradio window = new GUIradio();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	
	public GUIradio(){
		initialize();
	}
	
	
	private void initialize(){
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(100, 100, 520, 369);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		frame.setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnOnOff = new JButton("ON/OFF");
		btnOnOff.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ON_OFF();
				if (encendido==false){
					lblOnOff.setText("Apagado");
					txtEmisora.setText("");
					lblFrecuencia.setText("");
					
				}
				else {
					lblOnOff.setText("Encendido");
					if (tipoEmisora ==false){
						emisora = 530;
						txtEmisora.setText(String.valueOf(emisora));
						lblFrecuencia.setText("AM");						
					}
					else {
						emisora = 87.9;
						txtEmisora.setText(String.valueOf(emisora));
						lblFrecuencia.setText("FM");
					}
					
				}
				
			}
		});
		btnOnOff.setBounds(10, 11, 89, 23);
		contentPane.add(btnOnOff);
		
		JButton btn1 = new JButton("1");
		btn1.setBounds(46, 127, 89, 23);
		contentPane.add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.setBounds(150, 127, 89, 23);
		contentPane.add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.setBounds(265, 127, 89, 23);
		contentPane.add(btn3);
		
		JButton btn4 = new JButton("4");
		btn4.setBounds(379, 127, 89, 23);
		contentPane.add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.setBounds(46, 163, 89, 23);
		contentPane.add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.setBounds(150, 163, 89, 23);
		contentPane.add(btn6);
		
		JButton btn7 = new JButton("7");
		btn7.setBounds(265, 163, 89, 23);
		contentPane.add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.setBounds(379, 163, 89, 23);
		contentPane.add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.setBounds(46, 197, 89, 23);
		contentPane.add(btn9);
		
		JButton btn10 = new JButton("10");
		btn10.setBounds(150, 197, 89, 23);
		contentPane.add(btn10);
		
		JButton btn11 = new JButton("11");
		btn11.setBounds(265, 197, 89, 23);
		contentPane.add(btn11);
		
		JButton btn12 = new JButton("12");
		btn12.setBounds(379, 197, 89, 23);
		contentPane.add(btn12);
		
		JButton btnAmFm = new JButton("AM/FM");
		btnAmFm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AM_FM();
				if (encendido==true){
					if (tipoEmisora==true){
						lblFrecuencia.setText("FM");
						txtEmisora.setText(String.valueOf(emisora));
					}
					else {
						lblFrecuencia.setText("AM");
						txtEmisora.setText(String.valueOf(emisora));
					}
				}
				else {}
			}
		});
		btnAmFm.setBounds(20, 271, 89, 48);
		contentPane.add(btnAmFm);
		
		JButton btnForw = new JButton(">>");
		btnForw.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Cambio_de_Emisora(true);
				txtEmisora.setText(String.valueOf(emisora));		
			}
		});
		btnForw.setBounds(367, 59, 67, 35);
		contentPane.add(btnForw);
		
		JButton btnBack = new JButton("<<");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Cambio_de_Emisora(false);
				txtEmisora.setText(String.valueOf(emisora));				
			}
			
		});
		btnBack.setBounds(150, 59, 67, 35);
		contentPane.add(btnBack);
		
		JButton btnGuardar = new JButton("Guardar/Seleccionar");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Guardar_Seleccion();
				if (guardarSeleccionar == true){
					lblOpcion.setText("SELECCIONANDO");

				}
				else {
					lblOpcion.setText("GUARDANDO");
				}
				
			}
		});
		btnGuardar.setBounds(172, 272, 137, 46);
		contentPane.add(btnGuardar);
		
		lblOpcion = new JLabel("");
		lblOpcion.setBounds(172, 247, 124, 14);
		contentPane.add(lblOpcion);
		
		lblFrecuencia = new JLabel("");
		lblFrecuencia.setBounds(20, 242, 89, 23);
		contentPane.add(lblFrecuencia);
		
		txtEmisora = new JTextField();
		txtEmisora.setEditable(false);
		txtEmisora.setBounds(227, 59, 127, 35);
		contentPane.add(txtEmisora);
		txtEmisora.setColumns(10);
		
		lblOnOff = new JLabel("OFF");
		lblOnOff.setBounds(10, 40, 89, 14);
		contentPane.add(lblOnOff);
		
		JLabel lblEmisora = new JLabel("EMISORA");
		lblEmisora.setBounds(257, 34, 86, 14);
		contentPane.add(lblEmisora);
	}
}
