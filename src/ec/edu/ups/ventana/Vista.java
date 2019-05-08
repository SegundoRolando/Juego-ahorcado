/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventana;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;


/**
 *
 * @author ASUS
 */
public class Vista extends javax.swing.JFrame {

    /**
     * Creates new form Vista
     */
    public ImageIcon img[];
    public JButton bt[];
    public String txt[];
    public int ran;
    public int err;
    public String res[];
    
    
    public Vista() {
        initComponents();
        
        img = new ImageIcon[6];
        bt = new JButton[27];
        txt = new String[20];
        
        img[6] = new ImageIcon(getClass().getResource("/ec.edu.ups.ventana/1.jpg"));
        img[1] = new ImageIcon(getClass().getResource("/ec.edu.ups.ventana/2.jpg"));
        img[2] = new ImageIcon(getClass().getResource("/ec.edu.ups.ventana/3.jpg"));
        img[3] = new ImageIcon(getClass().getResource("/ec.edu.ups.ventana/4.jpg"));
        img[4] = new ImageIcon(getClass().getResource("/ec.edu.ups.ventana/5.jpg"));
        img[5] = new ImageIcon(getClass().getResource("ec.edu.ups./6.jpg"));
        
        bt[1] = b1;
        bt[2] = b2;
        bt[3] = b3;
        bt[4] = b4;
        bt[5] = b5;
        bt[6] = b6;
        bt[7] = b7;
        bt[8] = b8;
        bt[9] = b9;
        bt[10] = b10;
        bt[11] = b11;
        bt[12] = b12;
        bt[13] = b13;
        bt[14] = b14;
        bt[15] = b15;
        bt[16] = b16;
        bt[17] = b17;
        bt[18] = b18;
        bt[19] = b19;
        bt[20] = b20;
        bt[21] = b21;
        bt[22] = b22;
        bt[23] = b23;
        bt[24] = b24;
        bt[25] = b25;
        bt[26] = b26;
        
        txt[0] = "Cuenca".toUpperCase();
        txt[1] = "Guayaquil".toUpperCase();
        txt[2] = "Universidad".toUpperCase();
        txt[3] = "Academia".toUpperCase();
        txt[4] = "Deporte".toUpperCase();
        txt[5] = "Leon".toUpperCase();
        txt[6] = "Gato".toUpperCase();
        txt[7] = "Obscuro".toUpperCase();
        txt[8] = "Anaranjado".toUpperCase();
        txt[9] = "Tulcan".toUpperCase();
        txt[10] = "Oriente".toUpperCase();
        txt[11] = "Amazonia".toUpperCase();
        txt[12] = "Paisaje".toUpperCase();
        txt[13] = "Boscada".toUpperCase();
        txt[14] = "Hermoso".toUpperCase();
        txt[15] = "Escuela".toUpperCase();
        txt[16] = "Ecuador".toUpperCase();
        txt[17] = "Quito".toUpperCase();
        txt[18] = "Politecnica".toUpperCase();
        txt[19] = "Salesiana".toUpperCase();
        for (int i = 1; i < 27; i++) {
            bt[i].addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    checarLetra(e);
                }
            });
        }
        iniciar();
       
    }
    public void iniciar() {
        err = 0;
        b.setIcon(img[0]);
        panel1.setText("");
      
        for (int i = 1; i < 27; i++) {
            bt[i].setEnabled(true);
        }
       
        ran = (int) 0 + (int) (Math.random() * ((txt.length - 1) + 1));
     
        String pal[] = txt[ran].split(" ");
        res = new String[txt[ran].length() + 1];
        int j = 0;
        for (String pal1 : pal) {
            for (int i = 0; i < pal1.length(); i++) {
                panel1.setText(panel1.getText() + "_ ");
                res[j++] = "_";
            }
            panel1.setText(panel1.getText() + "\n");
            res[j++] = " ";
            
        }
    }

    
    public void checarLetra(ActionEvent e) {
        JButton bt1 = (JButton) e.getSource();
        char c[];
        
        for (int i = 1; i < 27; i++) {
            if (bt1 == bt[i]) {
                
                c = Character.toChars(64 + i);
                
                boolean esta = false;
                for (int j = 0; j < txt[ran].length(); j++) {
                    if (c[0] == txt[ran].charAt(j)) {
                        res[j] = c[0] + "";
                        esta = true;
                    }
                }
              
                if (esta) {
                    panel1.setText("");
                    for (String re : res) {
                        if (" ".equals(re)) {
                            panel1.setText(panel1.getText() + "\n");
                        } else {
                            panel1.setText(panel1.getText() + re + " ");
                        }
                    }
                    
                    boolean gano = true;
                    for (String re : res) {
                        if (re.equals("_")) {
                            gano = false;
                            break;
                        }
                    }
                    
                    if (gano) {
                        JOptionPane.showMessageDialog(this, "Ganaste :3 Reclama tu premio con Alexis, Pablo o Ghadiel xD!!!");
                        iniciar();
                        return;
                    }
                  
                } else {
                    b.setIcon(img[++err]);
                   
                    if (err == 5) {
                        JOptionPane.showMessageDialog(this, "Intenta con otra palabra la respuesta es: \n" + txt[ran]);
                        iniciar();
                       
                        return;
                    }
                }
               
                bt1.setEnabled(false);
               
                break;
            }
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        iniciarb = new javax.swing.JButton();
        b = new javax.swing.JButton();
        b13 = new javax.swing.JButton();
        b14 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        b22 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        b24 = new javax.swing.JButton();
        b26 = new javax.swing.JButton();
        b1 = new javax.swing.JButton();
        b19 = new javax.swing.JButton();
        b4 = new javax.swing.JButton();
        b6 = new javax.swing.JButton();
        b7 = new javax.swing.JButton();
        b8 = new javax.swing.JButton();
        b11 = new javax.swing.JButton();
        b10 = new javax.swing.JButton();
        b12 = new javax.swing.JButton();
        b17 = new javax.swing.JButton();
        b23 = new javax.swing.JButton();
        b5 = new javax.swing.JButton();
        b18 = new javax.swing.JButton();
        b20 = new javax.swing.JButton();
        b25 = new javax.swing.JButton();
        b21 = new javax.swing.JButton();
        b9 = new javax.swing.JButton();
        b15 = new javax.swing.JButton();
        b16 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        panel1 = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        iniciarb.setText("Reiniciar");
        iniciarb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iniciarbActionPerformed(evt);
            }
        });

        b.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/img/1.png"))); // NOI18N

        b13.setBackground(new java.awt.Color(255, 255, 255));
        b13.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        b13.setText("m");

        b14.setBackground(new java.awt.Color(255, 255, 255));
        b14.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        b14.setText("n");

        b2.setBackground(new java.awt.Color(255, 255, 255));
        b2.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        b2.setText("b");

        b22.setBackground(new java.awt.Color(255, 255, 255));
        b22.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        b22.setText("v");

        b3.setBackground(new java.awt.Color(255, 255, 255));
        b3.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        b3.setText("c");
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });

        b24.setBackground(new java.awt.Color(255, 255, 255));
        b24.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        b24.setText("x");

        b26.setBackground(new java.awt.Color(255, 255, 255));
        b26.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        b26.setText("z");

        b1.setBackground(new java.awt.Color(255, 255, 255));
        b1.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        b1.setText("a");
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        b19.setBackground(new java.awt.Color(255, 255, 255));
        b19.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        b19.setText("s");

        b4.setBackground(new java.awt.Color(255, 255, 255));
        b4.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        b4.setText("d");

        b6.setBackground(new java.awt.Color(255, 255, 255));
        b6.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        b6.setText("f");
        b6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b6ActionPerformed(evt);
            }
        });

        b7.setBackground(new java.awt.Color(255, 255, 255));
        b7.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        b7.setText("g");

        b8.setBackground(new java.awt.Color(255, 255, 255));
        b8.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        b8.setText("h");
        b8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b8ActionPerformed(evt);
            }
        });

        b11.setBackground(new java.awt.Color(255, 255, 255));
        b11.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        b11.setText("k");

        b10.setBackground(new java.awt.Color(255, 255, 255));
        b10.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        b10.setText("j");

        b12.setBackground(new java.awt.Color(255, 255, 255));
        b12.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        b12.setText("l");

        b17.setBackground(new java.awt.Color(255, 255, 255));
        b17.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        b17.setText("q");
        b17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b17ActionPerformed(evt);
            }
        });

        b23.setBackground(new java.awt.Color(255, 255, 255));
        b23.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        b23.setText("w");
        b23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b23ActionPerformed(evt);
            }
        });

        b5.setBackground(new java.awt.Color(255, 255, 255));
        b5.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        b5.setText("e");

        b18.setBackground(new java.awt.Color(255, 255, 255));
        b18.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        b18.setText("r");

        b20.setBackground(new java.awt.Color(255, 255, 255));
        b20.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        b20.setText("t");

        b25.setBackground(new java.awt.Color(255, 255, 255));
        b25.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        b25.setText("y");

        b21.setBackground(new java.awt.Color(255, 255, 255));
        b21.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        b21.setText("u");

        b9.setBackground(new java.awt.Color(255, 255, 255));
        b9.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        b9.setText("i");

        b15.setBackground(new java.awt.Color(255, 255, 255));
        b15.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        b15.setText("o");

        b16.setBackground(new java.awt.Color(255, 255, 255));
        b16.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        b16.setText("p");

        panel1.setEditable(false);
        panel1.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jScrollPane1.setViewportView(panel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(b1)
                            .addComponent(b26)
                            .addComponent(b17))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(b24)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(b3))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(b23)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(b5))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(b19)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(b4))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(b6)
                            .addComponent(b22)
                            .addComponent(b18))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(b2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(b14))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(b7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(b8)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(b13)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(b11)
                                        .addGap(15, 15, 15)
                                        .addComponent(b10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(b12))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(b20)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(b25)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(b21)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(b9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(b15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(b16))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(b, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(iniciarb, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(b, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(iniciarb, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b17)
                    .addComponent(b23)
                    .addComponent(b5)
                    .addComponent(b18)
                    .addComponent(b20)
                    .addComponent(b25)
                    .addComponent(b21)
                    .addComponent(b9)
                    .addComponent(b15)
                    .addComponent(b16))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b1)
                    .addComponent(b19)
                    .addComponent(b4)
                    .addComponent(b6)
                    .addComponent(b7)
                    .addComponent(b8)
                    .addComponent(b11)
                    .addComponent(b10)
                    .addComponent(b12))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b13)
                    .addComponent(b14)
                    .addComponent(b2)
                    .addComponent(b22)
                    .addComponent(b3)
                    .addComponent(b24)
                    .addComponent(b26))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b1ActionPerformed

    private void b8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b8ActionPerformed

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b3ActionPerformed

    private void b6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b6ActionPerformed

    private void b17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b17ActionPerformed

    private void b23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b23ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b23ActionPerformed

    private void iniciarbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iniciarbActionPerformed

     iniciar();// TODO add your handling code here:
    }//GEN-LAST:event_iniciarbActionPerformed

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
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b;
    private javax.swing.JButton b1;
    private javax.swing.JButton b10;
    private javax.swing.JButton b11;
    private javax.swing.JButton b12;
    private javax.swing.JButton b13;
    private javax.swing.JButton b14;
    private javax.swing.JButton b15;
    private javax.swing.JButton b16;
    private javax.swing.JButton b17;
    private javax.swing.JButton b18;
    private javax.swing.JButton b19;
    private javax.swing.JButton b2;
    private javax.swing.JButton b20;
    private javax.swing.JButton b21;
    private javax.swing.JButton b22;
    private javax.swing.JButton b23;
    private javax.swing.JButton b24;
    private javax.swing.JButton b25;
    private javax.swing.JButton b26;
    private javax.swing.JButton b3;
    private javax.swing.JButton b4;
    private javax.swing.JButton b5;
    private javax.swing.JButton b6;
    private javax.swing.JButton b7;
    private javax.swing.JButton b8;
    private javax.swing.JButton b9;
    private javax.swing.JButton iniciarb;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane panel1;
    // End of variables declaration//GEN-END:variables
}
