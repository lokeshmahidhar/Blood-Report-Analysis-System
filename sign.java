
import com.mongodb.BasicDBObject;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
 

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vinit
 */
public class sign extends javax.swing.JFrame {

    /**
     * Creates new form sign
     */
    public sign() {
        initComponents();
        
    
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtFname = new javax.swing.JTextField();
        txtLname = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        pwdPassword1 = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lblpwd = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lblPrompt = new javax.swing.JLabel();
        pwdPassword = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Sign Up");
        setPreferredSize(new java.awt.Dimension(1275, 575));
        getContentPane().setLayout(null);

        txtFname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFnameActionPerformed(evt);
            }
        });
        getContentPane().add(txtFname);
        txtFname.setBounds(740, 160, 220, 30);
        getContentPane().add(txtLname);
        txtLname.setBounds(740, 220, 220, 30);

        txtEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtEmailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtEmailFocusLost(evt);
            }
        });
        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });
        txtEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtEmailKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtEmailKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEmailKeyTyped(evt);
            }
        });
        getContentPane().add(txtEmail);
        txtEmail.setBounds(740, 280, 220, 31);
        getContentPane().add(pwdPassword1);
        pwdPassword1.setBounds(740, 400, 220, 30);

        jLabel2.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 255));
        jLabel2.setText("LAST NAME:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(510, 210, 150, 40);

        jButton1.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 153));
        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\xyz\\Desktop\\SignUpBlueButton1.png")); // NOI18N
        jButton1.setBorder(null);
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(540, 490, 230, 40);

        jButton2.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 204));
        jButton2.setIcon(new javax.swing.ImageIcon("C:\\Users\\xyz\\Desktop\\previous (1).png")); // NOI18N
        jButton2.setBorder(null);
        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(10, 10, 80, 60);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\xyz\\Desktop\\icon-Quick-Signup-pink.png")); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(100, 130, 400, 310);

        jLabel8.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 102, 255));
        jLabel8.setText("EMAIL ID:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(510, 270, 150, 40);

        lblpwd.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        lblpwd.setForeground(new java.awt.Color(0, 102, 255));
        lblpwd.setText("PASSWORD:");
        getContentPane().add(lblpwd);
        lblpwd.setBounds(510, 330, 150, 40);

        jLabel7.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 102, 255));
        jLabel7.setText("CONFIRM P/W:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(510, 390, 190, 40);

        jLabel9.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 102, 255));
        jLabel9.setText("FIRST NAME:");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(510, 150, 150, 40);
        getContentPane().add(lblPrompt);
        lblPrompt.setBounds(990, 290, 210, 30);
        getContentPane().add(pwdPassword);
        pwdPassword.setBounds(740, 340, 220, 30);

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\xyz\\Desktop\\images (1).png")); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(470, -30, 430, 150);

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\xyz\\Desktop\\maxresdefault.jpg")); // NOI18N
        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, 0, 1280, 540);

        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(880, 470, 150, 14);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      Connect j=new Connect();
      DBCollection dbc=j.connect("login_details");
      BasicDBObject bdb=new BasicDBObject();
       String fn,ln,user,pwd;
        String u="";
       fn=txtFname.getText();
       ln=txtLname.getText();
       user=txtEmail.getText();
        pwdPassword1.selectAll();
       pwd=pwdPassword1.getSelectedText();
       
       bdb.put("Fname",fn);
       bdb.put("Lname",ln);
       bdb.put("Email",user);
       bdb.put("Password",pwd);
       DBCursor cursor=dbc.find();
      final JPanel p2=new JPanel();
        final JOptionPane jo=new JOptionPane();
       if (user.matches("^[A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})")){
        JOptionPane.showMessageDialog(p2,"registered succesfuly","success", JOptionPane.INFORMATION_MESSAGE);
        //clear();
      dbc.insert(bdb);  
      Start ap=new Start();
        ap.setVisible(true);
        this.dispose();
        }
        else {
        JOptionPane.showMessageDialog(null,"Invalid E-mail ID");
        }    
       //while(cursor.hasNext())
       
       //DBObject obj = cursor.next();                    
            //       u=(String)obj.get("Email");
       
       
        
       //dbc.insert(bdb);
     
     /* Start ap=new Start();
        ap.setVisible(true);
        this.dispose();*/
       //JOptionPane.showMessageDialog(p2,"registered succesfuly","success", JOptionPane.INFORMATION_MESSAGE);
       
       
      
        
        //JOptionPane.showMessageDialog(p2,"registered succesfuly","success", JOptionPane.INFORMATION_MESSAGE);
        //clear();

    
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Start ap=new Start();
        ap.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here: 
        
    }//GEN-LAST:event_txtEmailActionPerformed

    private void txtEmailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyTyped
        // TODO add your handling code here:
                 
            
       
        
    }//GEN-LAST:event_txtEmailKeyTyped

    private void txtEmailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyReleased
        // TODO add your handling code here:
         Connect j=new Connect();
      DBCollection dbc=j.connect("login_details");
        DBCursor cursor=dbc.find();
      
      String u="";
      String user;
       user=txtEmail.getText();
       while(cursor.hasNext())
       {
       DBObject obj = cursor.next();                    
                   u=(String)obj.get("Email"); 
        
        
        
        if(u.equals(user))
       {
       lblPrompt.setText("Username already exists");
               

       }
        else
        {
        lblPrompt.setText("");
        }
        
        }
    }//GEN-LAST:event_txtEmailKeyReleased

    private void txtFnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFnameActionPerformed

    private void txtEmailKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyPressed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtEmailKeyPressed

    private void txtEmailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmailFocusGained
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtEmailFocusGained

    private void txtEmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmailFocusLost
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtEmailFocusLost

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(sign.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(sign.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(sign.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(sign.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new sign().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblPrompt;
    private javax.swing.JLabel lblpwd;
    private javax.swing.JPasswordField pwdPassword;
    private javax.swing.JPasswordField pwdPassword1;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFname;
    private javax.swing.JTextField txtLname;
    // End of variables declaration//GEN-END:variables

    private void clear() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void addListeners() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
