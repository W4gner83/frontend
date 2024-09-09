import java.awt.FlowLayout; //classe responsável por organizar as janelas de forma sequencial, vido da biblioteca awt
import javax.swing.JFrame; /*Classe que representa as janelas no sistema operacional, disponível na biblioteca swing, responsável por fornecer os componentes básicos 
                           da interface gráfica*/
import javax.swing.JLabel; // JLabel Componente que representa texto ou imagem 
import javax.swing.SwingConstants; // Constantes comuns dentro do Swing
import javax.swing.Icon; // 
import javax.swing.ImageIcon; // Manipula imagens

public class LabelFrame extends JFrame { // Classe LabelFrame, herdeira da JFrame
   private final JLabel label1; // variável criada para ser usada na classe
   private final JLabel label2; // variável criada para ser usada na classe
   private final JLabel label3; // variável criada para ser usada na classe

   public LabelFrame() // construtor
   {
      super("Testing JLabel"); // super = define o título da janela, na parte superior
      setLayout(new FlowLayout()); // define como será o layout

      label1 = new JLabel("Label with text"); // declaração de variável e = operador de atribuição
      label1.setToolTipText("This is label1");// textos das ferramentas
      add(label1); // adiciona variável do componente JLabel

      Icon bug = new ImageIcon(getClass().getResource("bug1.png")); // Icon é a definição de tipo, variável
      label2 = new JLabel("Label with text and icon", bug, // vígula dentro dos parenteses separa os parametros.
                                                           // SwingConstants.LEFT é o parametro do tipo Swingconstants
                                                           // alinhado a esquerda
            SwingConstants.LEFT);
      label2.setToolTipText("This is label2"); // o "ponto" invoca o texto de ferramenta de dicas
      add(label2);

      label3 = new JLabel(); // JLabel constructor no arguments
      label3.setText("Label with icon and text at bottom");
      label3.setIcon(bug);
      label3.setHorizontalTextPosition(SwingConstants.CENTER);
      label3.setVerticalTextPosition(SwingConstants.BOTTOM);
      label3.setToolTipText("This is label3");
      add(label3);
   }
}

/**************************************************************************
 * (C) Copyright 1992-2014 by Deitel & Associates, Inc. and *
 * Pearson Education, Inc. All Rights Reserved. *
 * *
 * DISCLAIMER: The authors and publisher of this book have used their *
 * best efforts in preparing the book. These efforts include the *
 * development, research, and testing of the theories and programs *
 * to determine their effectiveness. The authors and publisher make *
 * no warranty of any kind, expressed or implied, with regard to these *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or *
 * consequential damages in connection with, or arising out of, the *
 * furnishing, performance, or use of these programs. *
 *************************************************************************/
