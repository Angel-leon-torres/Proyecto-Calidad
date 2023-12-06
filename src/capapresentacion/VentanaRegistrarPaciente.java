
package capapresentacion;

import capadominio.TextPrompt;
import capaaplicacion.RegistrarPacienteServicio;
import capadominio.Paciente;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.HeadlessException;
import javax.swing.JOptionPane;

public class VentanaRegistrarPaciente extends javax.swing.JDialog {

    private RegistrarPacienteServicio registrarPacienteServicio;
    private Paciente paciente;
    
    public VentanaRegistrarPaciente(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        inicializarNuevoPaciente();
        setLocationRelativeTo(null);
        
         jPanel1.setBackground(new Color(135, 186, 227 ,190));
        TextPrompt holdidp = new TextPrompt("   ID",txt_paciente_id);
        TextPrompt holddni = new TextPrompt("   DNI",txtdni);
        TextPrompt holdmomb = new TextPrompt("   NOMBRES  ",txtnombres);
        TextPrompt holdape = new TextPrompt("   APELLIDOS  ",txtapellidos);
        TextPrompt holdedad = new TextPrompt("  EDAD  ",txtedad);
        TextPrompt holdcell = new TextPrompt("   N° CELULAR  ",txtcelular);
        
           // Agregar validación a los campos de texto
        txt_paciente_id.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                soloNumeros(evt);
            }
        });
        
        txtdni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                soloNumeros(evt);
            }
        });
        
        txtedad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                soloNumeros(evt);
            }
        });
        
        txtcelular.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                soloNumeros(evt);
            }
        });
        
        txtnombres.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                soloLetras(evt);
            }
        });
        
        txtapellidos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                soloLetras(evt);
            }
        });   
        
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        cboguardar = new java.awt.Button();
        txt_paciente_id = new javax.swing.JTextField();
        txtdni = new javax.swing.JTextField();
        txtnombres = new javax.swing.JTextField();
        txtapellidos = new javax.swing.JTextField();
        txtedad = new javax.swing.JTextField();
        txtcelular = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(668, 519));
        getContentPane().setLayout(null);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cboguardar.setLabel("GUARDAR");
        cboguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboguardarActionPerformed(evt);
            }
        });
        jPanel1.add(cboguardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 300, -1, -1));
        jPanel1.add(txt_paciente_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 100, 30));
        jPanel1.add(txtdni, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 160, 200, 40));
        jPanel1.add(txtnombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 100, 200, 40));
        jPanel1.add(txtapellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 200, 40));
        jPanel1.add(txtedad, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, 90, 30));
        jPanel1.add(txtcelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 230, 150, 40));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("REGISTRAR PACIENTE");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, -1, -1));

        getContentPane().add(jPanel1);
        jPanel1.setBounds(40, 60, 560, 360);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pacientefond (1) (1).jpg"))); // NOI18N
        getContentPane().add(jLabel8);
        jLabel8.setBounds(0, 0, 690, 490);

        pack();
    }// </editor-fold>//GEN-END:initComponents
     private void inicializarNuevoPaciente() {
        registrarPacienteServicio = new RegistrarPacienteServicio();
        paciente = new Paciente();
        txt_paciente_id.requestFocus();
        txt_paciente_id.setText("");
        txtdni.setText("");
        txtnombres.setText("");
        txtapellidos.setText("");
        txtedad.setText("");
        txtcelular.setText("");
    }
    private void cboguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboguardarActionPerformed
        try {
            capturarDatosDelPaciente();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error de ingreso de datos", "Advertenia", JOptionPane.WARNING_MESSAGE);
            return;
        }
        try {
            guardarpaciente();
            inicializarNuevoPaciente();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Advertenia", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_cboguardarActionPerformed

      private void guardarpaciente() throws Exception {
      registrarPacienteServicio.guardarpaciente(paciente);
      JOptionPane.showMessageDialog(this, "Se guardo los datos del paciente", "Información", JOptionPane.INFORMATION_MESSAGE);        
    }
      
       private void capturarDatosDelPaciente() throws NumberFormatException {
       paciente.setPaciente_id(txt_paciente_id.getText().trim());
       paciente.setNombrePaciente(txtnombres.getText().trim());
       paciente.setApellidosPaciente(txtapellidos.getText().trim());
       paciente.setDNIPaciente(txtdni.getText().trim());
       paciente.setEdadPaciente(Integer.parseInt(txtedad.getText().trim()));
       paciente.setCelularPaciente(Integer.parseInt(txtcelular.getText().trim()));
    }
       
        private void soloNumeros(java.awt.event.KeyEvent evt) {
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) {
            evt.consume();
        }
    }

    private void soloLetras(java.awt.event.KeyEvent evt) {
        char c = evt.getKeyChar();
        if (!(Character.isLetter(c) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE) || Character.isWhitespace(c))) {
            evt.consume();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button cboguardar;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txt_paciente_id;
    private javax.swing.JTextField txtapellidos;
    private javax.swing.JTextField txtcelular;
    private javax.swing.JTextField txtdni;
    private javax.swing.JTextField txtedad;
    private javax.swing.JTextField txtnombres;
    // End of variables declaration//GEN-END:variables
}
