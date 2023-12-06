
package capapresentacion;

import capadominio.TextPrompt;
import capaaplicacion.RegistrarMedicoServicio;
import capadominio.Medico;
import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
        
public class VentanaRegistrarMedico extends javax.swing.JDialog {
    
    private RegistrarMedicoServicio registrarMedicoServicio;
    private Medico medico;
    
    public VentanaRegistrarMedico(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        inicializarNuevoMedico();
        setLocationRelativeTo(null);
        jPanel2.setBackground(new Color(135, 186, 227 ,190));
        TextPrompt holdidD = new TextPrompt("     ID",txtmedico_id);
        TextPrompt holdnombres = new TextPrompt("  Nombres",txtnombres);
        TextPrompt holdapellidos = new TextPrompt("  Apellidos",txtapellidos);
        TextPrompt holdcorreo = new TextPrompt("  Correo Electronico",txtcorreo);
        TextPrompt holdatenciones = new TextPrompt("  N° Atenciones",txtatenciones);
        TextPrompt holdespera = new TextPrompt("  Tiempo Espera",txtespera);
        TextPrompt holdedadm = new TextPrompt("  Edad",txtedadm);
        TextPrompt holdDNI = new TextPrompt("  DNI",txtdnim);
        TextPrompt holdcelular = new TextPrompt("  Celular",txtcelularm);
        
        
         // Agregar validación a los campos de texto
        txtmedico_id.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                soloNumeros(evt);
            }
        });
        
       txtcorreo.addKeyListener(new java.awt.event.KeyAdapter() {
    public void keyTyped(java.awt.event.KeyEvent evt) {
        soloLetrasYCorreo(evt, txtcorreo);
    }
});

        
         txtdnim.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                soloNumeros(evt);
            }
        });
           txtcelularm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                soloNumeros(evt);
            }
        });
           
        txtatenciones.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                soloNumeros(evt);
            }
        });
        
        txtespera.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                soloNumeros(evt);
            }
        });
        
        txtedadm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                soloNumeros(evt);
            }
        });
        
         txtnombres.addKeyListener(new java.awt.event.KeyAdapter() {
    public void keyTyped(java.awt.event.KeyEvent evt) {
        soloLetras(evt, txtnombres);
    }
});

txtapellidos.addKeyListener(new java.awt.event.KeyAdapter() {
    public void keyTyped(java.awt.event.KeyEvent evt) {
        soloLetras(evt, txtapellidos);
    }
});

 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        botonGuardarMedico = new javax.swing.JButton();
        cboespe = new javax.swing.JComboBox<>();
        txtmedico_id = new javax.swing.JTextField();
        txtnombres = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtapellidos = new javax.swing.JTextField();
        txtatenciones = new javax.swing.JTextField();
        txtcorreo = new javax.swing.JTextField();
        txtespera = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtdnim = new javax.swing.JTextField();
        txtedadm = new javax.swing.JTextField();
        txtcelularm = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(760, 600));
        getContentPane().setLayout(null);

        botonGuardarMedico.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        botonGuardarMedico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8_Save_32px.png"))); // NOI18N
        botonGuardarMedico.setText("GUARDAR");
        botonGuardarMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGuardarMedicoActionPerformed(evt);
            }
        });

        cboespe.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cboespe.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Medicina General", "Pediatria", "Ginecologia", "Obstetricia", "Odontología" }));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Especialidad: ");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("REGISTRO DE MÉDICO");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtnombres, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtcorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(txtdnim, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(102, 102, 102)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtatenciones, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtapellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtedadm, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtcelularm, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 8, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(txtmedico_id, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4)
                                .addGap(60, 60, 60))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(txtespera, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(97, 97, 97))))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(cboespe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botonGuardarMedico)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(251, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(txtmedico_id, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtnombres, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtapellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtcorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtatenciones, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtdnim, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(txtedadm))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtcelularm, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 27, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtespera, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cboespe, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(botonGuardarMedico)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(60, 70, 640, 470);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/medicofond (1).jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 750, 570);

        pack();
    }// </editor-fold>//GEN-END:initComponents

        private void inicializarNuevoMedico() {
        registrarMedicoServicio = new RegistrarMedicoServicio();
        medico = new Medico();
        txtmedico_id.requestFocus();
        txtmedico_id.setText("");
        txtnombres.setText("");
        txtapellidos.setText("");
        jLabel2.setText("");
        txtcorreo.setText("");
        cboespe.addItem("");
        txtatenciones.setText("");
        txtespera.setText("");
        txtdnim.setText("");
        txtedadm.setText("");
        txtcelularm.setText("");
    }
    private void botonGuardarMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGuardarMedicoActionPerformed
        try {
            capturarDatosDelDoctor();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error de ingreso de datos", "Advertenia", JOptionPane.WARNING_MESSAGE);
            return;
        }
        try {
            guardarmedico();
            inicializarNuevoMedico();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Advertenia", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_botonGuardarMedicoActionPerformed
    
    private void guardarmedico() throws Exception {
        registrarMedicoServicio.guardarmedico(medico);
        JOptionPane.showMessageDialog(this, "Se guardo los datos del medico", "Información", JOptionPane.INFORMATION_MESSAGE);        
    }
    
       private void capturarDatosDelDoctor() throws NumberFormatException {
        medico.setMedico_id(txtmedico_id.getText().trim());
        medico.setNombresMedico(txtnombres.getText().trim());
        medico.setApellidosMedico(txtapellidos.getText().trim());
        medico.setCorreoElectronicoMedico(txtcorreo.getText().trim());
        medico.setTipoespecialidadMedico(cboespe.getSelectedItem().toString());
        medico.setNumeroMaximodeAtencionesPorMedico(Integer.parseInt(txtatenciones.getText().trim()));
        medico.setTiempoEsperaMedico(Integer.parseInt(txtespera.getText().trim()));
        medico.setDNIMedico(txtdnim.getText().trim());
        medico.setEdadMedico(Integer.parseInt(txtedadm.getText().trim()));
        medico.setCelularMedico(txtcelularm.getText().trim());
    }
        
    private void soloNumeros(java.awt.event.KeyEvent evt) {
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) {
            evt.consume();
        }
    }

     private void soloLetras(java.awt.event.KeyEvent evt, javax.swing.JTextField field) {
    char c = evt.getKeyChar();
    if (!(Character.isLetter(c) || c == KeyEvent.VK_SPACE || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE)) {
        evt.consume();
    }
}

     private void soloLetrasYCorreo(java.awt.event.KeyEvent evt, javax.swing.JTextField field) {
    char c = evt.getKeyChar();
    if (!(Character.isLetter(c) || c == '@' || c == KeyEvent.VK_SPACE || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE)) {
        evt.consume();
    }
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonGuardarMedico;
    private javax.swing.JComboBox<String> cboespe;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtapellidos;
    private javax.swing.JTextField txtatenciones;
    private javax.swing.JTextField txtcelularm;
    private javax.swing.JTextField txtcorreo;
    private javax.swing.JTextField txtdnim;
    private javax.swing.JTextField txtedadm;
    private javax.swing.JTextField txtespera;
    private javax.swing.JTextField txtmedico_id;
    private javax.swing.JTextField txtnombres;
    // End of variables declaration//GEN-END:variables
}
