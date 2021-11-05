
package frompdftojpg;

/**
 *
 * @author jeff
 */

import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.filechooser.FileNameExtensionFilter;


import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.rendering.PDFRenderer;

public class Main extends javax.swing.JFrame {

    //global variable
    File pdfFile; //archivo PDF
    File destinationDir; //archivo destino
    JFileChooser pathFinder; //ruta de PDF
    JFileChooser destination;  //ruta destino
    
    public Main() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Convertidor de PDF a JPG");
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnSelectFile = new javax.swing.JButton();
        btnConvert = new javax.swing.JButton();
        selectedFile = new javax.swing.JLabel();
        btnDestination = new javax.swing.JButton();
        dwBar = new javax.swing.JProgressBar();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        destinationPath = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Convertir de PDF a JPG");

        btnSelectFile.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnSelectFile.setText("Seleccione un archivo");
        btnSelectFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectFileActionPerformed(evt);
            }
        });

        btnConvert.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnConvert.setText("Convertir");
        btnConvert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConvertActionPerformed(evt);
            }
        });

        btnDestination.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnDestination.setText("Guardar en...");
        btnDestination.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDestinationActionPerformed(evt);
            }
        });

        dwBar.setMaximum(10000);

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel2.setText("Developed by Jeff MC 2021");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/jpg.png"))); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pdf.png"))); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/right-arrow.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btnSelectFile)
                    .addComponent(btnConvert)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(selectedFile, javax.swing.GroupLayout.PREFERRED_SIZE, 531, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDestination)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(destinationPath, javax.swing.GroupLayout.PREFERRED_SIZE, 531, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dwBar, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(166, 166, 166)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addComponent(btnSelectFile)
                .addGap(19, 19, 19)
                .addComponent(selectedFile, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btnDestination)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(destinationPath, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnConvert)
                .addGap(36, 36, 36)
                .addComponent(dwBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSelectFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelectFileActionPerformed

        pathFinder =  new JFileChooser();
        //solo permite adjuntar archivos PDF
        FileNameExtensionFilter filter = new FileNameExtensionFilter("PDF Files", "pdf");
        pathFinder.setFileFilter(filter);
        
        pathFinder.showOpenDialog(null);
        pdfFile = pathFinder.getSelectedFile();
        
        //muestra la ruta en el label
        if(pdfFile != null )
            selectedFile.setText("Archivo PDF: " + pdfFile.toString());
        
        
    }//GEN-LAST:event_btnSelectFileActionPerformed

    private void btnConvertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConvertActionPerformed
        if (pdfFile == null || destinationDir == null) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un archivo PDF e indicar la ruta de las imágenes", "ERROR", JOptionPane.ERROR_MESSAGE);
        } else {
            try {
                for(int i=0; i<= 10000; i++){
                    dwBar.setValue(i);
                    dwBar.setString("Convirtiendo...");
                    dwBar.setStringPainted(true);
                }
                dwBar.setString("Completado");
                
//convertir a JPG
                PDDocument doc = PDDocument.load(pdfFile);

                PDFRenderer renderer = new PDFRenderer(doc);
                String fileName = pdfFile.getName().replace(".pdf", "");
                for (int i = 0; i < doc.getNumberOfPages(); i++) {

                    //ruta a exportar
                    File fileTemp = new File(destinationDir + "/ " + fileName + "_img" + i + ".jpg"); // jpg or png
                    BufferedImage image = renderer.renderImageWithDPI(i, 200);

                    ImageIO.write(image, "JPEG", fileTemp); // JPEG or PNG
                }
                
                JOptionPane.showMessageDialog(null, "Imágenes exportadas en la ruta: " + destinationDir, "Imágenes creadas", JOptionPane.INFORMATION_MESSAGE);
                doc.close();
                //clean labels
                destinationPath.setText("");
                selectedFile.setText("");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error: " + e);
            }

        }
          
    }//GEN-LAST:event_btnConvertActionPerformed

    private void btnDestinationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDestinationActionPerformed
        
        destination =  new JFileChooser();
        //solo permite seleccionar directorios
        destination.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        destination.setAcceptAllFileFilterUsed(false);
        destination.showDialog(null, "Save");
        
        
        destinationDir = destination.getSelectedFile();
        //muestra la ruta en el label
        if(destinationPath != null)
            destinationPath.setText("Exportar a: " + destinationDir);
    }//GEN-LAST:event_btnDestinationActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConvert;
    private javax.swing.JButton btnDestination;
    private javax.swing.JButton btnSelectFile;
    private javax.swing.JLabel destinationPath;
    private javax.swing.JProgressBar dwBar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel selectedFile;
    // End of variables declaration//GEN-END:variables
}
