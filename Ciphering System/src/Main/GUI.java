
package Main;

import CipherImplementation.HillCipher.HillCipher;
import CipherImplementation.PlayFair.PlayFair;
import CipherImplementation.RailFence.Rail_Fence;
import CipherImplementation.Vigenere.Caeser;
import CipherImplementation.Vigenere.VigenereAutoKey;
import CipherImplementation.Vigenere.VigenereWithReapeatingKey;
import File.FileInputOutput;
import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JOptionPane;


//User Defined Exception Concept***
class Handle_Exception extends Exception{  
    public Handle_Exception(String msg){
        super(msg);
    }   
}
public class GUI extends javax.swing.JFrame {

   
    public GUI() {
        initComponents();
        this.setTitle("Ciphering system");
        Text_RadioButton.setSelected(true);
        jTextField3.setEditable(false);
        jTextField3.setBackground(Color.GRAY);
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jFileChooser1 = new javax.swing.JFileChooser();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        File_RadioButton = new javax.swing.JRadioButton();
        Text_RadioButton = new javax.swing.JRadioButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        Enc_Button = new javax.swing.JButton();
        Dec_Button = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName(""); // NOI18N

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("W E L C O M E    T O    C I P H E R I N G    S Y S T E M ");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Caeser Cipher", "Hill Cipher", "PlayFair Cipher", "RailFence Cipher", "Vigenere Auto Key Cipher", "Vigenere Repeating Key Cipher" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Ciphering Algorithm");

        buttonGroup1.add(File_RadioButton);
        File_RadioButton.setText("FILE");
        File_RadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                File_RadioButtonActionPerformed(evt);
            }
        });

        buttonGroup1.add(Text_RadioButton);
        Text_RadioButton.setText("TEXT");
        Text_RadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Text_RadioButtonActionPerformed(evt);
            }
        });

        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        Enc_Button.setText("Encrypt");
        Enc_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Enc_ButtonActionPerformed(evt);
            }
        });

        Dec_Button.setText("Decrypt");
        Dec_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Dec_ButtonActionPerformed(evt);
            }
        });

        jLabel3.setText("Key");

        jLabel4.setText("Plain Text ");

        jLabel5.setText("Output Text");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(68, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(File_RadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)
                                .addComponent(Text_RadioButton))
                            .addComponent(jTextField2)
                            .addComponent(jTextField3)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(Enc_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(57, 57, 57)
                                .addComponent(Dec_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(File_RadioButton)
                    .addComponent(Text_RadioButton))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Dec_Button)
                    .addComponent(Enc_Button))
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void Enc_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Enc_ButtonActionPerformed


        
        String Text;
        if(File_RadioButton.isSelected())
            Text = FileInputOutput.Data;
        else
            Text = jTextField2.getText();
        boolean flag = false;
        try {
        if ( jTextField2.getText().equals("") && !File_RadioButton.isSelected()){
            
            throw new Handle_Exception("Please Enter all Info." );
        }
        if (jTextField1.getText().equals("")){
            
            flag = true;      
        }
        if (  String.valueOf(jComboBox1.getSelectedItem()).equals("Caeser Cipher")){
            Caeser C ;
                
            if (flag)
               C  = new Caeser (Text); 
            else
                C  = new Caeser (Text ,jTextField1.getText()); 
            jTextField3.setText(C.Encrypt());
            jTextField1.setText(C.getKey());
  
        }
        else if (  String.valueOf(jComboBox1.getSelectedItem()).equals("Hill Cipher")){
            
            HillCipher C;
            if (flag)
            {
                C = new HillCipher (Text);
                JOptionPane.showMessageDialog(this, "No key was given,\nA valid key is generated", "Info", JOptionPane.INFORMATION_MESSAGE);
                jTextField3.setText(C.Encrypt());
                jTextField1.setText(C.getKey());
            }
            else
            {
                String tempHill=jTextField1.getText();
                if(tempHill.length()!=4)
                {
                    JOptionPane.showMessageDialog(this, "Key Size Must Be Equal To \"4\".", "Error", JOptionPane.ERROR_MESSAGE);
                }
                else
                {
                    C = new HillCipher (Text ,tempHill);
                    if(!tempHill.equals(C.getKey()))
                    {
                        JOptionPane.showMessageDialog(this, "The given key is invalid,\nA valid key is generated", "Info", JOptionPane.INFORMATION_MESSAGE);
                    }
                    jTextField3.setText(C.Encrypt());
                    jTextField1.setText(C.getKey());
                }
            }
     
        }
        else if (  String.valueOf(jComboBox1.getSelectedItem()).equals("PlayFair Cipher")){
            
            PlayFair C;
            if (flag)
                C  = new PlayFair (Text); 
            else
                 C  = new PlayFair (Text ,jTextField1.getText()); 
            jTextField3.setText(C.Encrypt());
            jTextField1.setText(C.getKey());

        }
        else if (  String.valueOf(jComboBox1.getSelectedItem()).equals("RailFence Cipher")){

            Rail_Fence C;
            if(!flag){
                try
                {
                    int tempInteger=Integer.valueOf(jTextField1.getText());
                    if(!(tempInteger>1))
                    {
                        throw new Handle_Exception("Number of Rails Must Exceed \"1\"");
                    }
                    C  = new Rail_Fence (Text ,tempInteger);
                    jTextField3.setText(C.Encrypt());
                    jTextField1.setText(C.getKey());
                } catch(NumberFormatException E) {
                    JOptionPane.showMessageDialog(this, "Invalid Data Type", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
            else
                 throw new Handle_Exception("Please Enter a Key." );
            
         
        }
        else if (  String.valueOf(jComboBox1.getSelectedItem()).equals("Vigenere Auto Key Cipher")){
                        
            VigenereAutoKey C;
            if (flag)
                C  = new VigenereAutoKey (Text); 
            else
                 C  = new VigenereAutoKey (Text ,jTextField1.getText()); 
            jTextField3.setText(C.Encrypt());
            jTextField1.setText(C.getKey());
     
        }
        else if (  String.valueOf(jComboBox1.getSelectedItem()).equals("Vigenere Repeating Key Cipher")){
            
            
            VigenereWithReapeatingKey C;
            if (flag)
                C  = new VigenereWithReapeatingKey (Text); 
            else
                 C  = new VigenereWithReapeatingKey (Text ,jTextField1.getText()); 
            jTextField3.setText(C.Encrypt());
            jTextField1.setText(C.getKey());
        
        }
        if(File_RadioButton.isSelected())
        {
            FileInputOutput.SaveToFile("Result.txt", jTextField3.getText());
            JOptionPane.showMessageDialog(this,"Result.txt has been updated" , "Info", JOptionPane.INFORMATION_MESSAGE);

        }
        }
        catch(Handle_Exception e){
            
            JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

        
    }//GEN-LAST:event_Enc_ButtonActionPerformed

    private void File_RadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_File_RadioButtonActionPerformed
        
        jTextField2.setVisible(false);
        jTextField3.setVisible(false);
        jLabel4.setVisible(false);
        jLabel5.setVisible(false);
        jFileChooser1.showOpenDialog(new JFrame());
        String path = jFileChooser1.getSelectedFile().getAbsolutePath();
        FileInputOutput.LoadFromFile(path);
        //String f = jFileChooser1.;
        //jFileChooser1.setDialogTitle("Choose a directory to save your file: ");
        // jFileChooser1.setFileSelectionMode(jFileChooser1.DIRECTORIES_ONLY);
    }//GEN-LAST:event_File_RadioButtonActionPerformed

    private void Text_RadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Text_RadioButtonActionPerformed
        
        jTextField2.setVisible(true);
        jTextField3.setVisible(true);
        jLabel4.setVisible(true);
        jLabel5.setVisible(true);
        
    }//GEN-LAST:event_Text_RadioButtonActionPerformed

    private void Dec_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Dec_ButtonActionPerformed
       
        String Text;
        if(File_RadioButton.isSelected())
            Text = FileInputOutput.Data;
        else
            Text = jTextField2.getText();
        boolean flag = false;
        try {
        if ( jTextField2.getText().equals("") && !File_RadioButton.isSelected()){
            
            throw new Handle_Exception("Please Enter all Info." );
        }
        if (jTextField1.getText().equals("")){
            
            flag = true;      
        }
        if (  String.valueOf(jComboBox1.getSelectedItem()).equals("Caeser Cipher")){
            Caeser C ;
            if (flag)
               throw new Handle_Exception("Please Enter a Key." );
            else
                C  = new Caeser (Text ,jTextField1.getText()); 
            jTextField3.setText(C.Decrypt());
  
        }
        else if (  String.valueOf(jComboBox1.getSelectedItem()).equals("Hill Cipher")){
            
            HillCipher C;
            if (flag)
               throw new Handle_Exception("Please Enter a Key." );
            else
            {
                String tempHill=jTextField1.getText();
                if(tempHill.length()!=4)
                {
                    JOptionPane.showMessageDialog(this, "Key Size Must Be Equal To \"4\".", "Error", JOptionPane.ERROR_MESSAGE);
                }
                else
                {
                    String currnetKey=jTextField1.getText();
                    C = new HillCipher (Text ,tempHill);
                    if(!currnetKey.equals(C.getKey()))
                    {
                        JOptionPane.showMessageDialog(this, "Invalid key!\nKey must generate an invertible matrix,\n" +
                                "with a non-zero determinant", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                    else
                    {
                        jTextField1.setText(C.getKey());
                        jTextField3.setText(C.Decrypt());
                    }
                }
            }
        }
        else if (  String.valueOf(jComboBox1.getSelectedItem()).equals("PlayFair Cipher")){
            
            PlayFair C;
            if (flag)
               throw new Handle_Exception("Please Enter a Key." );
            else
                 C  = new PlayFair (Text ,jTextField1.getText()); 
            jTextField3.setText(C.Decrypt());

        }
        else if (  String.valueOf(jComboBox1.getSelectedItem()).equals("RailFence Cipher")){
       
            Rail_Fence C;
            if (flag)
               throw new Handle_Exception("Please Enter a Key." );
            else
            {
                try
                {
                    int tempInteger=Integer.valueOf(jTextField1.getText());
                    if(!(tempInteger>1))
                    {
                        throw new Handle_Exception("Number of Rails Must Exceed \"1\"");
                    }
                    C  = new Rail_Fence (Text ,tempInteger);
                    jTextField3.setText(C.Decrypt());
                } catch(NumberFormatException E) {
                    JOptionPane.showMessageDialog(this, "Invalid Data Type", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }

         
        }
        else if (  String.valueOf(jComboBox1.getSelectedItem()).equals("Vigenere Auto Key Cipher")){
                        
            VigenereAutoKey C;
            if (flag)
               throw new Handle_Exception("Please Enter a Key." );
            else
                 C  = new VigenereAutoKey (Text ,jTextField1.getText()); 
            //jTextField3.setText(C.Decrypt());
            jTextField3.setText(C.Decrypt2());


        }
        else if (  String.valueOf(jComboBox1.getSelectedItem()).equals("Vigenere Repeating Key Cipher")){
            
            
            VigenereWithReapeatingKey C;
            if (flag)
               throw new Handle_Exception("Please Enter a Key." );
            else
                 C  = new VigenereWithReapeatingKey (Text ,jTextField1.getText()); 
            jTextField3.setText(C.Decrypt());
        
        }
        if(File_RadioButton.isSelected())
        {
            FileInputOutput.SaveToFile("Result.txt", jTextField3.getText());
            JOptionPane.showMessageDialog(this,"Result.txt has been updated" , "Info", JOptionPane.INFORMATION_MESSAGE);
        }
        }
        catch(Handle_Exception e){
            
            JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_Dec_ButtonActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        if(String.valueOf(jComboBox1.getSelectedItem()).equals("RailFence Cipher"))
        {
            JOptionPane.showMessageDialog(this, "(For there to be enough movement of letters, the length of the message\n needs to be at least twice the key, but preferably 3 times the key).", "Info", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Dec_Button;
    private javax.swing.JButton Enc_Button;
    private javax.swing.JRadioButton File_RadioButton;
    private javax.swing.JRadioButton Text_RadioButton;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
