import java.awt.*;
import javax.swing.*;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.text.DecimalFormat;


public class UsaGer extends JFrame {
	
	private JPanel contentPane;
	
	private JTextField tfFahrenheit;
	private JTextField tfCelsius;
	
	private JTextField tfMiles;
	private JTextField tfKm;
	
	private JTextField tfGallon;
	private JTextField tfLiter;
	
	private JTextField tfFoot;
	private JTextField tfCm;
	
	private JTextField tfOz;
	private JTextField tfMl;
	
	//Launch the application
	
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
		} catch (Throwable e) {
			e.printStackTrace();
		}
		EventQueue.invokeLater(new Runnable() {
			public void run() {
			  try  {
				UsaGer frame = new UsaGer();
				frame.setVisible(true);
			} catch (Exception e) {
				e.printStackTrace();
			  }
		    }
	    });	
    }
	
	//Launch frame
	public UsaGer(){
		setTitle("Umrechnung Metrics USA");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100,100,600,700);
		contentPane=new JPanel();
		contentPane.setBorder(new EmptyBorder(5,5,5,5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//Miles in km
		
		JLabel lblMiles = new JLabel("Miles");
		lblMiles.setBounds(10,11,157,14);
		contentPane.add(lblMiles);
		
		tfMiles = new JTextField();
		tfMiles.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent  e) {
				if(e.getKeyCode() == KeyEvent.VK_ENTER) {
					umrechnenMiles();
				}
			}
		});
		tfMiles.setBounds(10,31,200,20);
		contentPane.add(tfMiles);
		tfMiles.setColumns(10);
		
		JLabel lblKm = new JLabel("Kilometer");
		lblKm.setBounds(10,62,82,14);
		contentPane.add(lblKm);
		
		tfKm = new JTextField("km");
		tfKm.setEditable(false);
		tfKm.setBounds(10,82,200,20);
		contentPane.add(tfKm);
		tfKm.setColumns(10);
		
		JButton btnUmrechnenMiles = new JButton("Umrechnen");
		btnUmrechnenMiles.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				umrechnenMiles();
			}
		});
		btnUmrechnenMiles.setBounds(220,30,109,23);
		contentPane.add(btnUmrechnenMiles);
		
		JButton btnEnde = new JButton("Ende");
		btnEnde.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				System.exit(0);
			}
		});
		btnEnde.setBounds(220,585,109,23);
		contentPane.add(btnEnde);
	
	
	//Gallons in Liter
	JLabel lblGallons = new JLabel("Gallons");
		lblGallons.setBounds(10,122,57,14);
		contentPane.add(lblGallons);
		
		tfGallon = new JTextField();
		tfGallon.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent  e) {
				if(e.getKeyCode() == KeyEvent.VK_ENTER) {
					umrechnenGallon();
				}
			}
		});		
		tfGallon.setBounds(10,142,200,20);
		contentPane.add(tfGallon);
		tfGallon.setColumns(10);
		
		JLabel lblLiter = new JLabel("Liter");
		lblLiter.setBounds(10,173,82,14);
		contentPane.add(lblLiter);
		
		tfLiter = new JTextField("liter");
		tfLiter.setEditable(false);
		tfLiter.setBounds(10,193,200,20);
		contentPane.add(tfLiter);
		tfLiter.setColumns(10);
		
		JButton btnUmrechnenGallon = new JButton("Umrechnen");
		btnUmrechnenGallon.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				umrechnenGallon();
			}
		});
		btnUmrechnenGallon.setBounds(220,141,109,23);
		contentPane.add(btnUmrechnenGallon);
	
	//Foot in cm
		
		JLabel lblFoot = new JLabel("Foot");
		lblFoot.setBounds(10,344,157,14);
		contentPane.add(lblFoot);
		
		tfFoot = new JTextField();
		tfFoot.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent  e) {
				if(e.getKeyCode() == KeyEvent.VK_ENTER) {
					umrechnenFoot();
				}
			}
		});
		tfFoot.setBounds(10,364,200,20);
		contentPane.add(tfFoot);
		tfFoot.setColumns(10);
		
		JLabel lblCentimeter = new JLabel("Zentimeter");
		lblCentimeter.setBounds(10,395,82,14);
		contentPane.add(lblCentimeter);
		
		tfCm = new JTextField("cm");
		tfCm.setEditable(false);
		tfCm.setBounds(10,415,200,20);
		contentPane.add(tfCm);
		tfCm.setColumns(10);
		
		JButton btnUmrechnenFoot = new JButton("Umrechnen");
		btnUmrechnenFoot.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				umrechnenFoot();
			}
		});
		btnUmrechnenFoot.setBounds(220,363,109,23);
		contentPane.add(btnUmrechnenFoot);

	//oz in Ml
		
		JLabel lblOz = new JLabel("Unzen Oz");
		lblOz.setBounds(10,233,157,14);
		contentPane.add(lblOz);
		
		tfOz = new JTextField();
		tfOz.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent  e) {
				if(e.getKeyCode() == KeyEvent.VK_ENTER) {
					umrechnenOz();
				}
			}
		});
		tfOz.setBounds(10,253,200,20);
		contentPane.add(tfOz);
		tfOz.setColumns(10);
		
		JLabel lblMl = new JLabel("Milliliter");
		lblMl.setBounds(10,284,82,14);
		contentPane.add(lblMl);
		
		tfMl = new JTextField("ml");
		tfMl.setEditable(false);
		tfMl.setBounds(10,304,200,20);
		contentPane.add(tfMl);
		tfMl.setColumns(10);
		
		JButton btnUmrechnenOz = new JButton("Umrechnen");
		btnUmrechnenOz.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				umrechnenOz();
			}
		});
		btnUmrechnenOz.setBounds(220,252,109,23);
		contentPane.add(btnUmrechnenOz);
		
		//Fahrenheit in Celsius
		JLabel lblFahrenheit = new JLabel("Grad Fahrenheit");
		lblFahrenheit.setBounds(10,455,157,14);
		contentPane.add(lblFahrenheit);
		
		tfFahrenheit = new JTextField();
		tfFahrenheit.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()==KeyEvent.VK_ENTER) {
					umrechnenFahrenheit();
				}
			}
		});
		tfFahrenheit.setBounds(10,475,200,20);
		contentPane.add(tfFahrenheit);
		tfFahrenheit.setColumns(10);
		
		JLabel lblCelsius = new JLabel("Grad Celsius");
		lblCelsius.setBounds(10,506,82,14);
		contentPane.add(lblCelsius);
		
		tfCelsius = new JTextField("celsius");
		tfCelsius.setEditable(false);
		tfCelsius.setBounds(10,526,200,20);
		contentPane.add(tfCelsius);
		tfCelsius.setColumns(10);
		
		JButton btnUmrechnen = new JButton("Umrechnen");
		btnUmrechnen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				umrechnenFahrenheit();
			}
		});
		btnUmrechnen.setBounds(220,474,109,23);
		contentPane.add(btnUmrechnen);		
		
		//Bildobjekt American Flag erzeugen
		Icon bild = new ImageIcon("flagAmerica.png");
		JLabel lblflagAmerica = new JLabel(bild);
		lblflagAmerica.setBounds(220,30,260,185);
		contentPane.add(lblflagAmerica);
	}
	
	
	
	private void umrechnenMiles(){
		double  miles, km;
		miles = Double.parseDouble(tfMiles.getText());
		km = miles * 1.60934;
		DecimalFormat  f = new  DecimalFormat("#0.00");
		tfKm.setText(f.format(km));
		tfMiles.requestFocus();
		tfMiles.selectAll();
		}	
	
	private void umrechnenGallon(){
		double  gallon, liter;
		gallon = Double.parseDouble(tfGallon.getText());
		liter = gallon * 3.78541;
		DecimalFormat  f = new  DecimalFormat("#0.00");
		tfLiter.setText(f.format(liter));
		tfGallon.requestFocus();
		tfGallon.selectAll();
		}
	
	private void umrechnenOz() {
		double oz, ml;
		oz = Double.parseDouble(tfOz.getText());
		ml = oz * 29.5735;
		DecimalFormat f = new DecimalFormat("#0.00");
		tfMl.setText(f.format(ml));
		tfOz.requestFocus();
		tfOz.selectAll();
		}
		
	private void umrechnenFoot(){
		double ft, cm;
		ft = Double.parseDouble(tfFoot.getText());
		cm = ft * 30.48;
		DecimalFormat f = new DecimalFormat("#0.00");
		tfCm.setText(f.format(cm));
		tfFoot.requestFocus();
		tfFoot.selectAll();
		}
		
	private void umrechnenFahrenheit() {
		double fahrenheit, celsius;
		fahrenheit = Double.parseDouble(tfFahrenheit.getText());
		celsius = (fahrenheit-32)*5/9;
		DecimalFormat f = new DecimalFormat("#0.00");
		tfCelsius.setText(f.format(celsius));
		tfFahrenheit.requestFocus();
		tfFahrenheit.selectAll();
	}
}
