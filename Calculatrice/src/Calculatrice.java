import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Calculatrice extends JFrame implements ActionListener {
    //Variable que l'on va utiliser pour la calculatrice
	double num1=0,num2=0,res=0;
	char opérateur;
	
	JTextField textfield = new JTextField();
     // Créer les boutons en dehors du constructeur calculatrice 
    //pour pouvoir les utiliser dans d'autres classes.
    JButton btn0 = new JButton("0");
    JButton btn1 = new JButton("1");
    JButton btn2 = new JButton("2");
    JButton btn3 = new JButton("3");
    JButton btn4 = new JButton("4");
    JButton btn5 = new JButton("5");
    JButton btn6 = new JButton("6");
    JButton btn7 = new JButton("7");
    JButton btn8 = new JButton("8");
    JButton btn9 = new JButton("9");
    JButton btnv = new JButton(",");
    JButton égal = new JButton("=");
    JButton plus = new JButton("+");
    JButton moins = new JButton("-");
    JButton fois = new JButton("x");
    JButton div = new JButton("/");
    JButton del = new JButton("DEL");
    JButton clear = new JButton("C");
    JButton carré = new JButton("x²");
    JButton signe = new JButton("+/-");

    
    //Liste des boutons pour faire des boucles lors des actionsListener.
    JButton[] Nombreliste = new JButton[10];

	public Calculatrice() 
    {
		/*Création de la fenetre de la calculatrice*/
		setTitle("Calculatrice");
	      setSize(300, 400);
	      // Définir la disposition par défaut sur null
	      setLayout(null);
	      


	      // Définir la position et la taille des boutons 1 par 1 
	      // manière de faire très trivialle il aurait été possible de faire des boucles pour instancier chaque boutons
	      // On peut remarquer que le même paterne se répète
	      
	      btn0.setBounds(70,300,65,30);
	      add(btn0);
	      btn0.addActionListener(this);
	      btn0.setFocusable(false);
	      Nombreliste[0]=btn0;
	      
	      btn1.setBounds(5,265,60,30);
	      add(btn1);
	      btn1.addActionListener(this);
	      btn1.setFocusable(false);
	      Nombreliste[1]=btn1;
	      
	      btn2.setBounds(70,265,65,30);
	      add(btn2);
	      btn2.addActionListener(this);
	      btn2.setFocusable(false);
	      Nombreliste[2]=btn2;
	      
	      btn3.setBounds(140,265,65,30);
	      add(btn3);
	      btn3.addActionListener(this);
	      btn3.setFocusable(false);
	      Nombreliste[3]=btn3;
	      
	      btn4.setBounds(5,230,60,30);
	      add(btn4);
	      btn4.addActionListener(this);
	      btn4.setFocusable(false);
	      Nombreliste[4]=btn4;
	      
	      btn5.setBounds(70,230,65,30);
	      add(btn5);
	      btn5.addActionListener(this);
	      btn5.setFocusable(false);
	      Nombreliste[5]=btn5;
	      
	      btn6.setBounds(140,230,65,30);
	      add(btn6);
	      btn6.addActionListener(this);
	      btn6.setFocusable(false);
	      Nombreliste[6]=btn6;
	      
	      btn7.setBounds(5,195,60,30);
	      add(btn7);
	      btn7.addActionListener(this);
	      btn7.setFocusable(false);
	      Nombreliste[7]=btn7;
	      
	      btn8.setBounds(70,195,65,30);
	      add(btn8);
	      btn8.addActionListener(this);
	      btn8.setFocusable(false);
	      Nombreliste[8]=btn8;
	      
	      btn9.setBounds(140,195,65,30);
	      add(btn9);
	      btn9.addActionListener(this);
	      btn9.setFocusable(false);
	      Nombreliste[9]=btn9;
	      
	      btnv.setBounds(140,300,65,30);
	      add(btnv);
	      btnv.addActionListener(this);
	      btnv.setFocusable(false);
	      
	      égal.setBounds(210,300,70,30);
	      add(égal);
	      égal.addActionListener(this);
	      égal.setFocusable(false);
	      
	      plus.setBounds(210,265,70,30);
	      add(plus);
	      plus.addActionListener(this);
	      plus.setFocusable(false);

	      moins.setBounds(210,230,70,30);
	      add(moins);
	      moins.addActionListener(this);
	      moins.setFocusable(false);

	      fois.setBounds(210,195,70,30);
	      add(fois);
	      fois.addActionListener(this);
	      fois.setFocusable(false);
	      
	      div.setBounds(210,160,70,30);
	      add(div);
	      div.addActionListener(this);
	      div.setFocusable(false);

	      carré.setBounds(140,160,65,30);
	      add(carré);
	      carré.addActionListener(this);
	      carré.setFocusable(false);

	      clear.setBounds(70,160,65,30);
	      add(clear);
	      clear.addActionListener(this);
	      clear.setFocusable(false);

	      del.setBounds(5,160,60,30);
	      add(del);
	      del.addActionListener(this);
	      del.setFocusable(false);

	      signe.setBounds(5,300,60,30);
	      add(signe);
	      signe.addActionListener(this);
	      signe.setFocusable(false);
	      
	      //TextField qui va afficher ce que l'on écrit
	      textfield.setBounds(35,50,220,60);
	      add(textfield);
	      textfield.setEditable(false);
	      
	      //Ferme la fenetre lors d'un click sur la croix de la fenetre
	      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      
	      setLocationRelativeTo(null);
	      //afficher la fenetre JFrame
	      setVisible(true);
	      
        
    }
	public static void main(String[] args) {
		//Instancier la calculatrice pour afficher l'interface
        Calculatrice a = new Calculatrice();
    }
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		for(int i=0;i<10;i++) {
			if(e.getSource() == Nombreliste[i]) {
				//getText() renvoie la valeur du textfield donc quand je rentre 8 une fois ça affiche 8 car 
				//ça concatène rien avec 8 puis si j'écris 9 ça renvoie la valeur qui était dans le textfield
				//puis ça concatène la valeur que l'on vient de cliquer donc 9
				textfield.setText(textfield.getText().concat(String.valueOf(i)));

			}

		}
		//si l'action est le bouton virgule, met une virgule après le chiffre courant 
		if (e.getSource()==btnv) {
			textfield.setText(textfield.getText().concat("."));
		}
		//si l'action est le bouton addition, ajoute le nombre courant à un autre
		if (e.getSource()==plus) {
			num1= Double.parseDouble(textfield.getText());
			opérateur = '+';
			textfield.setText("");
		}
		if (e.getSource()==moins) {
			num1= Double.parseDouble(textfield.getText());
			opérateur = '-';
			textfield.setText("");
		}
		if (e.getSource()==fois) {
			num1= Double.parseDouble(textfield.getText());
			opérateur = '*';
			textfield.setText("");
		}
		if (e.getSource()==div) {
			num1= Double.parseDouble(textfield.getText());
			opérateur = '/';
			textfield.setText("");
		}
		if (e.getSource()==carré) {
			num1= Double.parseDouble(textfield.getText());
			num1 = num1 *num1;
			textfield.setText(""+num1);
		}
		if(e.getSource()==égal) {
			num2=Double.parseDouble(textfield.getText());
			switch(opérateur) {
			case'+' :
				res=num1+num2;
				break;
			case '-' :
				res=num1-num2;
				break;
			case '*' :
				res= num1 * num2;
				break;
			case '/' :
				res=num1/num2;
				break;
			}
			textfield.setText(String.valueOf(res));
			num1=res;
		}
		if(e.getSource()==clear) {
			num1=0;
			num2=0;
			res=0;
			textfield.setText("");
		}
		if(e.getSource()==del) {
			String string = textfield.getText();
			textfield.setText("");
			for (int i =0; i<string.length()-1;i++) {
				textfield.setText(textfield.getText()+string.charAt(i));
			}
		}
		
		if(e.getSource()==signe) {
			double var = Double.parseDouble(textfield.getText());
			var*=-1;
			textfield.setText(String.valueOf(var));
		}
	}
}
