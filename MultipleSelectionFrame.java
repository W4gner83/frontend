// Fig. 12.25: MultipleSelectionFrame.java
// JList that allows multiple selections.
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class MultipleSelectionFrame extends JFrame 
{
   private final JList<String> colorJList; // list to hold color names
   private final JList<String> copyJList;
   private final JList<String> copyJList2;  // a cópia 3 do JList
   private JButton copyJButton;
   private JButton copyJButton2; // cópia 2 d JButton

   private static final String[] colorNames = {"Black", "Blue", "Cyan",
      "Dark Gray", "Gray", "Green", "Light Gray", "Magenta", "Orange", 
      "Pink", "Red", "White", "Yellow"};

   // MultipleSelectionFrame constructor
   public MultipleSelectionFrame()
   {
      super("Multiple Selection Lists");
      setLayout(new FlowLayout());

      colorJList = new JList<String>(colorNames); // list of color names
      colorJList.setVisibleRowCount(5); // show five rows
      colorJList.setSelectionMode(
         ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
      add(new JScrollPane(colorJList)); // add list with scrollpane

      copyJButton = new JButton("Copy >>>"); 
      copyJButton.addActionListener(
         new ActionListener() // anonymous inner class 
         {  
            // handle button event
            @Override
            public void actionPerformed(ActionEvent event)
            {
               // place selected values in copyJList
               copyJList.setListData(
                  colorJList.getSelectedValuesList().toArray(
                     new String[0]));
            }
         } 
      ); 

      add(copyJButton); // add copy button to JFrame

      copyJList = new JList<String>(); // list to hold copied color names
      copyJList.setVisibleRowCount(5); // show 5 rows
      copyJList.setFixedCellWidth(100); // set width
      copyJList.setFixedCellHeight(15); // set height
      copyJList.setSelectionMode(
         ListSelectionModel.SINGLE_INTERVAL_SELECTION);
      add(new JScrollPane(copyJList)); // add list with scrollpane

      copyJButton2 = new JButton("Copy >>>"); 
      copyJButton2.addActionListener(
         new ActionListener() // anonymous inner class 
         {  
            // handle button event
            @Override
            public void actionPerformed(ActionEvent event)
            {
               // place selected values in copyJList
               copyJList2.setListData(
                  colorJList.getSelectedValuesList().toArray(
                     new String[0]));
            }
         } 
      ); 

      add(copyJButton2); // add copy button to JFrame

      copyJList2 = new JList<String>(); // list to hold copied color names
      copyJList2.setVisibleRowCount(5); // show 5 rows
      copyJList2.setFixedCellWidth(100); // set width
      copyJList2.setFixedCellHeight(15); // set height
      copyJList2.setSelectionMode(
         ListSelectionModel.SINGLE_INTERVAL_SELECTION);
      add(new JScrollPane(copyJList2)); // add list with scrollpane
      
   } 
} // end class MultipleSelectionFrame


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
