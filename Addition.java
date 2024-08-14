// Fig. 12.2: Addition.java
// Addition program that uses JOptionPane for input and output.
import javax.swing.JOptionPane; // import é a declaração, javax a biblioteca, ponto a invocação e o JOption a classe

public class Addition // declaração da classe, méódo ou variável
{
   public static void main(String[] args) // declaração de classe que vai iniciar o bloco do código
   {
      // obtain user input from JOptionPane input dialogs
      String firstNumber = // String é a classe de texto, FirstNumber é a variável
         JOptionPane.showInputDialog("Digite o primeiro número"); // JOptionPane é a classe para a criação da caixa de diálogo e o ponto invoca o showInputDialog que exibe a caixa solicitada
      String secondNumber =
         JOptionPane.showInputDialog("Digite o segundo número"); // JOptionPane é a classe para a criação da caixa de diálogo e o ponto invoca o showInputDialog que e

      // convert String inputs to int values for use in a calculation
      int number1 = Integer.parseInt(firstNumber); // int é o tipo, number1 a variável, o sinal de igual uma operação, o Integer classe de número inteiro, o ponto invoca a função e parseInt a função de conversão de string para número inteiro 
      int number2 = Integer.parseInt(secondNumber); //int é o tipo, number1 a variável, o sinal de igual uma operação, o Integer classe de número inteiro, o ponto invoca a função e parseInt a função de conversão de string para número inteiro 

      int sum = number1 + number2; // add numbers // int é o tipo, sum o método, igual é o operador de atribuição, number 1 e number 2 as variáveis

      // display result in a JOptionPane message dialog
      JOptionPane.showMessageDialog(null, "A soma dos números é" + sum, //JOptionPane é a classe para a criação da caixa de diálogo e o ponto invoca o showInputDialog 
      //que exibe a caixa solicitada, a frase entre aspas o texto (string), o sinal de + neste caso um contatenador e a vígula um separador
      
         "Soma dos dois inteiros", JOptionPane.PLAIN_MESSAGE); // frase entre aspas o string, JOptionPane é a classe para a criação da caixa de diálogo, o ponto para invocar o PLAIN_MESSAGE (screamcase)
   } 
} // end class Addition


/**************************************************************************
 * (C) Copyright 1992-2014 by Deitel & Associates, Inc. and               *
 * Pearson Education, Inc. All Rights Reserved.                           *
 *                                                                        *
 * DISCLAIMER: The authors and publisher of this book have used their     *
 * best efforts in preparing the book. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 *************************************************************************/
