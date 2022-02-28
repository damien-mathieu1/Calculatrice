import javax.swing.*;

public class Calculatrice extends JFrame {
	public Calculatrice() 
    {
		/*Création de la fenetre de la calculatrice*/
		setTitle("Calculatrice");
	      setSize(300, 400);
	      // Définir la disposition par défaut sur null
	      setLayout(null);
	      // Créer les boutons
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



	      // Définir la position et la taille des boutons
	      btn0.setBounds(70,300,65,30);
	      add(btn0);
	      btn1.setBounds(5,265,60,30);
	      add(btn1);
	      btn2.setBounds(70,265,65,30);
	      add(btn2);
	      btn3.setBounds(140,265,65,30);
	      add(btn3);
	      btn4.setBounds(5,230,60,30);
	      add(btn4);
	      btn5.setBounds(70,230,65,30);
	      add(btn5);
	      btn6.setBounds(140,230,65,30);
	      add(btn6);
	      btn7.setBounds(5,195,60,30);
	      add(btn7);
	      btn8.setBounds(70,195,65,30);
	      add(btn8);
	      btn9.setBounds(140,195,65,30);
	      add(btn9);
	      btnv.setBounds(140,300,65,30);
	      add(btnv);
	      égal.setBounds(210,300,70,30);
	      add(égal);
	      plus.setBounds(210,265,70,30);
	      add(plus);
	      moins.setBounds(210,230,70,30);
	      add(moins);
	      fois.setBounds(210,195,70,30);
	      add(fois);
	      
	      //Test GITHUB
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
}
