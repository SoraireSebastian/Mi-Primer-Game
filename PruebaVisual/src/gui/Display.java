package gui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JLabel;

public class Display extends JFrame{

	JFrame d; //DECLARO UNA VARIABLE DE TIPO JFrame PARA ELLO LA CLASE DEBE EREDAD DE JFrame
	JButton btn1,btn2; //DECLARO UNA VARIABLE DE TIPO BOTON 
	
	public Display() { //CREAO UN CONSTRUCTOR POR DEFECTO 
		
		//EL PRIMER PARAMETRO ES EL FORMULARIO O VENTANA DONDE SE MUETRA EL MENSAJE 
		//EL SEGUNDO EL MENSAJE A MOSTRAR 
		//TERCERO EL TITULO DE LA VENTANA DEL MENSAJE
		//CUARTO EL TIPO DE ICONO QUE ACOMPAÑA EL MENSAJE 
		
		JOptionPane.showMessageDialog(this, "Bienvenido \nVersion 1.0","Bienvenido",JOptionPane.INFORMATION_MESSAGE);//MUEESTRA UN CARTEL DE AVISO 
		 
		
		d = new JFrame(); 
		
		d.setVisible(true);//PERMITE CREAR UNA VENTANA 
		
		d.setBounds(400, 400, 400, 400);//PERMITE SELECCIONAR EL TAMAÑO DE LA VENTANA LOS PRIMEROS 2 PARAMETROS PERMITEN MOVER LA VENTANA EN LOS EJERS X y Y DONDE SE MOSTRARARA LA VENTANA
		
		d.setDefaultCloseOperation(EXIT_ON_CLOSE); //PERMITE DETENER LA EJECUCION CUANDO SE CIERRA LA VENTANA 
		
		d.setTitle("Ventana Prestar dinero");//PERMITE PONER UN TITULO A LA VENTANA 
		
		//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		/**
		 * METODO PERMITE MANIPULAR EL FOCO LA VENTANA CUANDO MINIMINIZA O SE ABRE LA APLICACION
		 */
		
		d.addFocusListener(new FocusListener() { //SE DEBE IMPORTAR LA CLASE FOCUSLISTENER Y LUEGO IMPLEMENTAR SUS METODOS 

			@Override
			public void focusGained(FocusEvent e) { //
				System.out.println("Foco Activo");//CUANDO ENCONTRAMOS EL FOCO MOSTRARA UN CARTEL EN CONSOLA
				
			}

			@Override
			public void focusLost(FocusEvent e) { //CUANDO SE MINIMINIZA LA APP
				d.requestFocus(); //CUANDO OTRA APLICACION SE SOBREPONE ,EN LA BARRA DE TAREAS LA VENTANA MIIMIZADA TITILARA 
				
			}
			
			
		});
		//////////////////////////////////////////////////////////////////////////////////
		/**
		 * METODO PERMITE CONTROLAR LOS EVENTOS DEL MAUSE
		 */
		d.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent e) {//CUANDO HACEMOS CLICK
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mousePressed(MouseEvent e) {//CUNDO MANTENEMOS PRESIONADO
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {//CUANDO SE LEVANTA EL BOTON DEL  MAUSE
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {//CUANDO SE MUEVE EL MOUSE
				System.out.println("Se movió el mouse");
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			
		});
		d.setLayout(null);//PARA PODER VER EL BOTON EN PANTALLA
		
		/////////////////////////////////////////////////////////////////////////////////////////////////////
		btn1 = new JButton();//INSTANCIO EL BOTON
		btn1.setBounds(70, 200, 60, 20);// PRIMEROS PARAMETROS POSICION EN LOS EJES XyY ,ANCHO ,ALTO
		btn1.setText("SI");
		btn1.setBackground(Color.green);//CAMBIAR EL COLOR DEL BOTON
		/**
		 * METODO QUE REALIZA UN EVENTO AL HACER CLICK EN EL BOTON
		 */
		btn1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "SABÍA QUE ACEPTARIAS ");
				
			}
			
		});
		///////////////////////////////////////////////////////
		btn2= new JButton();
		btn2.setBounds(250, 200, 60, 20);// PRIMEROS PARAMETROS POSICION EN LOS EJES XyY ,ANCHO ,ALTO
		btn2.setText("NO");
		btn2.setBackground(Color.red);//CAMBIAR EL COLOR DEL BOTON
		btn2.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent e) {     
						}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				Random r = new Random();
				// r.nextInt(300) GENERA UNA POSICION(NUMERO) ENTRE LOS EJES X y Y DE ACUERDO EN EL PARAMETRO    
				btn2.setBounds(r.nextInt(300),r.nextInt(300), 60,20);
				
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		});
			
		d.add(btn1);//AGREGO EL BOTON A LA VENTANA
		d.add(btn2);
		
		JLabel texto = new JLabel("¿Queres prestarme plata?");
		texto.setBounds(129, 95, 150, 60);
		d.add(texto);
		
		
	}
}
