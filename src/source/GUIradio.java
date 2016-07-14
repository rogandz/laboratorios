package source;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
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
				//Cambiar el estado de encendido
				ON_OFF();
				if (encendido==false){
					lblOnOff.setText("Apagado");
					txtEmisora.setText("");
					lblFrecuencia.setText("");
					
				}
				else {
					lblOnOff.setText("Encendido");
					//Inicializar con valores predeterminados 
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
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				//Verificar si esta seleccionando o guardando y que tipo de emisora esta utilizando
				if ((guardarSeleccionar==false)&&(tipoEmisora==false)){
					if (vectorAM[1]==0.0){
						JOptionPane.showMessageDialog(null, "No hay nada guardado");
					}
					else{
					emisora=vectorAM[1];
					txtEmisora.setText(String.valueOf(emisora));
					}
				}
				if ((guardarSeleccionar==false)&&(tipoEmisora==true)){
					if (vectorAM[1]==0.0){
						JOptionPane.showMessageDialog(null,"No hay nada guardado");
					}
					else{
					emisora=vectorFM[1];
					txtEmisora.setText(String.valueOf(emisora));
					}
				}
				
				if ((guardarSeleccionar==true)&&(tipoEmisora==false)){
					vectorAM[1]=emisora;
				}
				
				if ((guardarSeleccionar==true)&&(tipoEmisora==true)){
					vectorFM[1]=emisora;
				}
				guardarSeleccionar=false;
			}
		});
		btn1.setBounds(46, 127, 89, 23);
		contentPane.add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Verificar si esta seleccionando o guardando y que tipo de emisora esta utilizando
				if ((guardarSeleccionar==false)&&(tipoEmisora==false)){
					if (vectorAM[2]==0.0){
						JOptionPane.showMessageDialog(null, "No hay nada guardado");
					}
					else{
					emisora=vectorAM[2];
					txtEmisora.setText(String.valueOf(emisora));
					}
				}
				if ((guardarSeleccionar==false)&&(tipoEmisora==true)){
					if (vectorAM[2]==0.0){
						JOptionPane.showMessageDialog(null,"No hay nada guardado");
					}
					else{
					emisora=vectorFM[2];
					txtEmisora.setText(String.valueOf(emisora));
					}
				}
				
				if ((guardarSeleccionar==true)&&(tipoEmisora==false)){
					vectorAM[2]=emisora;
				}
				
				if ((guardarSeleccionar==true)&&(tipoEmisora==true)){
					vectorFM[2]=emisora;
				}
				guardarSeleccionar=false;
			}
		});
		btn2.setBounds(150, 127, 89, 23);
		contentPane.add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Verificar si esta seleccionando o guardando y que tipo de emisora esta utilizando
				if ((guardarSeleccionar==false)&&(tipoEmisora==false)){
					if (vectorAM[3]==0.0){
						JOptionPane.showMessageDialog(null, "No hay nada guardado");
					}
					else{
					emisora=vectorAM[3];
					txtEmisora.setText(String.valueOf(emisora));
					}
				}
				if ((guardarSeleccionar==false)&&(tipoEmisora==true)){
					if (vectorAM[3]==0.0){
						JOptionPane.showMessageDialog(null,"No hay nada guardado");
					}
					else{
					emisora=vectorFM[3];
					txtEmisora.setText(String.valueOf(emisora));
					}
				}
				
				if ((guardarSeleccionar==true)&&(tipoEmisora==false)){
					vectorAM[3]=emisora;
				}
				
				if ((guardarSeleccionar==true)&&(tipoEmisora==true)){
					vectorFM[3]=emisora;
				}
				guardarSeleccionar=false;
			}
		});
		btn3.setBounds(265, 127, 89, 23);
		contentPane.add(btn3);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Verificar si esta seleccionando o guardando y que tipo de emisora esta utilizando
				if ((guardarSeleccionar==false)&&(tipoEmisora==false)){
					if (vectorAM[4]==0.0){
						JOptionPane.showMessageDialog(null, "No hay nada guardado");
					}
					else{
					emisora=vectorAM[4];
					txtEmisora.setText(String.valueOf(emisora));
					}
				}
				if ((guardarSeleccionar==false)&&(tipoEmisora==true)){
					if (vectorAM[4]==0.0){
						JOptionPane.showMessageDialog(null,"No hay nada guardado");
					}
					else{
					emisora=vectorFM[4];
					txtEmisora.setText(String.valueOf(emisora));
					}
				}
				
				if ((guardarSeleccionar==true)&&(tipoEmisora==false)){
					vectorAM[4]=emisora;
				}
				
				if ((guardarSeleccionar==true)&&(tipoEmisora==true)){
					vectorFM[4]=emisora;
				}
				guardarSeleccionar=false;
			}
		});
		btn4.setBounds(379, 127, 89, 23);
		contentPane.add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Verificar si esta seleccionando o guardando y que tipo de emisora esta utilizando
				if ((guardarSeleccionar==false)&&(tipoEmisora==false)){
					if (vectorAM[5]==0.0){
						JOptionPane.showMessageDialog(null, "No hay nada guardado");
					}
					else{
					emisora=vectorAM[5];
					txtEmisora.setText(String.valueOf(emisora));
					}
				}
				if ((guardarSeleccionar==false)&&(tipoEmisora==true)){
					if (vectorAM[5]==0.0){
						JOptionPane.showMessageDialog(null,"No hay nada guardado");
					}
					else{
					emisora=vectorFM[5];
					txtEmisora.setText(String.valueOf(emisora));
					}
				}
				
				if ((guardarSeleccionar==true)&&(tipoEmisora==false)){
					vectorAM[5]=emisora;
				}
				
				if ((guardarSeleccionar==true)&&(tipoEmisora==true)){
					vectorFM[5]=emisora;
				}
				guardarSeleccionar=false;
			}
		});
		btn5.setBounds(46, 163, 89, 23);
		contentPane.add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Verificar si esta seleccionando o guardando y que tipo de emisora esta utilizando
				if ((guardarSeleccionar==false)&&(tipoEmisora==false)){
					if (vectorAM[6]==0.0){
						JOptionPane.showMessageDialog(null, "No hay nada guardado");
					}
					else{
					emisora=vectorAM[6];
					txtEmisora.setText(String.valueOf(emisora));
					}
				}
				if ((guardarSeleccionar==false)&&(tipoEmisora==true)){
					if (vectorAM[6]==0.0){
						JOptionPane.showMessageDialog(null,"No hay nada guardado");
					}
					else{
					emisora=vectorFM[6];
					txtEmisora.setText(String.valueOf(emisora));
					}
				}
				
				if ((guardarSeleccionar==true)&&(tipoEmisora==false)){
					vectorAM[6]=emisora;
				}
				
				if ((guardarSeleccionar==true)&&(tipoEmisora==true)){
					vectorFM[6]=emisora;
				}
				guardarSeleccionar=false;
			}
		});
		btn6.setBounds(150, 163, 89, 23);
		contentPane.add(btn6);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Verificar si esta seleccionando o guardando y que tipo de emisora esta utilizando
				if ((guardarSeleccionar==false)&&(tipoEmisora==false)){
					if (vectorAM[7]==0.0){
						JOptionPane.showMessageDialog(null, "No hay nada guardado");
					}
					else{
					emisora=vectorAM[7];
					txtEmisora.setText(String.valueOf(emisora));
					}
				}
				if ((guardarSeleccionar==false)&&(tipoEmisora==true)){
					if (vectorAM[7]==0.0){
						JOptionPane.showMessageDialog(null,"No hay nada guardado");
					}
					else{
					emisora=vectorFM[7];
					txtEmisora.setText(String.valueOf(emisora));
					}
				}
				
				if ((guardarSeleccionar==true)&&(tipoEmisora==false)){
					vectorAM[7]=emisora;
				}
				
				if ((guardarSeleccionar==true)&&(tipoEmisora==true)){
					vectorFM[7]=emisora;
				}
				guardarSeleccionar=false;
			}
		});
		btn7.setBounds(265, 163, 89, 23);
		contentPane.add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Verificar si esta seleccionando o guardando y que tipo de emisora esta utilizando
				if ((guardarSeleccionar==false)&&(tipoEmisora==false)){
					if (vectorAM[8]==0.0){
						JOptionPane.showMessageDialog(null, "No hay nada guardado");
					}
					else{
					emisora=vectorAM[8];
					txtEmisora.setText(String.valueOf(emisora));
					}
				}
				if ((guardarSeleccionar==false)&&(tipoEmisora==true)){
					if (vectorAM[8]==0.0){
						JOptionPane.showMessageDialog(null,"No hay nada guardado");
					}
					else{
					emisora=vectorFM[8];
					txtEmisora.setText(String.valueOf(emisora));
					}
				}
				
				if ((guardarSeleccionar==true)&&(tipoEmisora==false)){
					vectorAM[8]=emisora;
				}
				
				if ((guardarSeleccionar==true)&&(tipoEmisora==true)){
					vectorFM[8]=emisora;
				}
				guardarSeleccionar=false;
			}
		});
		btn8.setBounds(379, 163, 89, 23);
		contentPane.add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Verificar si esta seleccionando o guardando y que tipo de emisora esta utilizando
				if ((guardarSeleccionar==false)&&(tipoEmisora==false)){
					if (vectorAM[9]==0.0){
						JOptionPane.showMessageDialog(null, "No hay nada guardado");
					}
					else{
					emisora=vectorAM[9];
					txtEmisora.setText(String.valueOf(emisora));
					}
				}
				if ((guardarSeleccionar==false)&&(tipoEmisora==true)){
					if (vectorAM[9]==0.0){
						JOptionPane.showMessageDialog(null,"No hay nada guardado");
					}
					else{
					emisora=vectorFM[9];
					txtEmisora.setText(String.valueOf(emisora));
					}
				}
				
				if ((guardarSeleccionar==true)&&(tipoEmisora==false)){
					vectorAM[9]=emisora;
				}
				
				if ((guardarSeleccionar==true)&&(tipoEmisora==true)){
					vectorFM[9]=emisora;
				}
				guardarSeleccionar=false;
			}
		});
		btn9.setBounds(46, 197, 89, 23);
		contentPane.add(btn9);
		
		JButton btn10 = new JButton("10");
		btn10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Verificar si esta seleccionando o guardando y que tipo de emisora esta utilizando
				if ((guardarSeleccionar==false)&&(tipoEmisora==false)){
					if (vectorAM[10]==0.0){
						JOptionPane.showMessageDialog(null, "No hay nada guardado");
					}
					else{
					emisora=vectorAM[10];
					txtEmisora.setText(String.valueOf(emisora));
					}
				}
				if ((guardarSeleccionar==false)&&(tipoEmisora==true)){
					if (vectorAM[10]==0.0){
						JOptionPane.showMessageDialog(null,"No hay nada guardado");
					}
					else{
					emisora=vectorFM[10];
					txtEmisora.setText(String.valueOf(emisora));
					}
				}
				
				if ((guardarSeleccionar==true)&&(tipoEmisora==false)){
					vectorAM[10]=emisora;
				}
				
				if ((guardarSeleccionar==true)&&(tipoEmisora==true)){
					vectorFM[10]=emisora;
				}
				guardarSeleccionar=false;
			}
		});
		btn10.setBounds(150, 197, 89, 23);
		contentPane.add(btn10);
		
		JButton btn11 = new JButton("11");
		btn11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Verificar si esta seleccionando o guardando y que tipo de emisora esta utilizando
				if ((guardarSeleccionar==false)&&(tipoEmisora==false)){
					if (vectorAM[11]==0.0){
						JOptionPane.showMessageDialog(null, "No hay nada guardado");
					}
					else{
					emisora=vectorAM[11];
					txtEmisora.setText(String.valueOf(emisora));
					}
				}
				if ((guardarSeleccionar==false)&&(tipoEmisora==true)){
					if (vectorAM[11]==0.0){
						JOptionPane.showMessageDialog(null,"No hay nada guardado");
					}
					else{
					emisora=vectorFM[11];
					txtEmisora.setText(String.valueOf(emisora));
					}
				}
				
				if ((guardarSeleccionar==true)&&(tipoEmisora==false)){
					vectorAM[11]=emisora;
				}
				
				if ((guardarSeleccionar==true)&&(tipoEmisora==true)){
					vectorFM[11]=emisora;
				}
				guardarSeleccionar=false;
								
			}
		});
		btn11.setBounds(265, 197, 89, 23);
		contentPane.add(btn11);
		
		JButton btn12 = new JButton("12");
		btn12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Verificar si esta seleccionando o guardando y que tipo de emisora esta utilizando
				if ((guardarSeleccionar==false)&&(tipoEmisora==false)){
					if (vectorAM[0]==0.0){
						JOptionPane.showMessageDialog(null, "No hay nada guardado");
					}
					else{
					emisora=vectorAM[0];
					txtEmisora.setText(String.valueOf(emisora));
					}
				}
				if ((guardarSeleccionar==false)&&(tipoEmisora==true)){
					if (vectorAM[0]==0.0){
						JOptionPane.showMessageDialog(null,"No hay nada guardado");
					}
					else{
					emisora=vectorFM[0];
					txtEmisora.setText(String.valueOf(emisora));
					}
				}
				
				if ((guardarSeleccionar==true)&&(tipoEmisora==false)){
					vectorAM[0]=emisora;
				}
				
				if ((guardarSeleccionar==true)&&(tipoEmisora==true)){
					vectorFM[0]=emisora;
				}
				guardarSeleccionar=false;
			}
		});
		btn12.setBounds(379, 197, 89, 23);
		contentPane.add(btn12);
		
		JButton btnAmFm = new JButton("AM/FM");
		btnAmFm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AM_FM();
				
				//Verificar si esta encendido el radio para poder cambiar el tipo de frecuencia
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
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Verificar si estas encendido 
				if (encendido==false){
					
				}
				else{
				Guardar_Seleccion();
				}
			}
		});
		btnGuardar.setBounds(229, 240, 137, 46);
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
