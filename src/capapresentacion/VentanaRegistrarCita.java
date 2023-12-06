
package capapresentacion;

import capaaplicacion.RegistrarCitaServicio;
import capadominio.Cita;
import capadominio.Horario;
import capadominio.Paciente;
import capadominio.Medico;
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class VentanaRegistrarCita extends javax.swing.JDialog {
    private transient Cita cita;
    private transient RegistrarCitaServicio registrarCitaServicio;
    private transient Horario horarioSelec;
    
   private DefaultTableModel modelo = new DefaultTableModel();
    private String[] nombreColumnas = {"Codigo", "Fecha", "Hora Inicio", "Hora Fin", "Id Medico", "Estado", "Especialidad", "Turno"};
    
  
    
    public VentanaRegistrarCita(java.awt.Frame parent, boolean modal) throws Exception {
        super(parent, modal);
        initComponents();
        inicializarNuevacita();
          try {
            inicializarNuevacita();
        } catch (Exception e) {
            // Manejo de excepciones al inicializar la cita
            JOptionPane.showMessageDialog(this, "Error al inicializar la cita", "Error", JOptionPane.ERROR_MESSAGE);
        }
        setLocationRelativeTo(null);
        
        
                 // Agregar validación a los campos de texto
        txtcita_id.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                soloNumeros(evt);
            }
        });
         
        modelo.setColumnIdentifiers(nombreColumnas);
        try {
            ArrayList<Horario> lista = registrarCitaServicio.mostrarHorario();
                   
            Object[][] datos = new Object[lista.size()][8];
            for (int i = 0; i < lista.size(); i++) {
                Horario x = lista.get(i);
                datos[i][0] = x.getCodigo();
                datos[i][1] = x.getFecha();
                datos[i][2] = x.getHoraInicio();
                datos[i][3] = x.getHoraFin();
                datos[i][4] = x.getMedico_id();
                datos[i][5] = x.getEstado();
                datos[i][6] = x.getMedico_especialidad();
                datos[i][7] = x.getTurno();
            }
            modelo.setDataVector(datos, nombreColumnas);
            Tabla.setModel(modelo);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        
    }

        @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        citamedica = new javax.swing.JLabel();
        datos = new javax.swing.JPanel();
        citaid = new javax.swing.JLabel();
        txtcita_id = new java.awt.TextField();
        estadocita = new javax.swing.JLabel();
        txtxestadocita = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        nombreapellidos = new javax.swing.JLabel();
        dnipaciente = new javax.swing.JLabel();
        txtdniP = new java.awt.TextField();
        txtnombre_paciente = new java.awt.TextField();
        btnBuscarPaciente = new javax.swing.JButton();
        costototal = new javax.swing.JPanel();
        pago = new javax.swing.JLabel();
        txtpago = new java.awt.TextField();
        btnCalcular = new javax.swing.JButton();
        pagotarjeta = new javax.swing.JLabel();
        cbpagotarje = new javax.swing.JComboBox<>();
        btnRegistrar = new javax.swing.JButton();
        filtro = new javax.swing.JPanel();
        cbespecialidad = new javax.swing.JComboBox<>();
        especialidad = new javax.swing.JLabel();
        btnbuscarhorario = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        txtIDhorario = new javax.swing.JTextField();
        codigohorario = new javax.swing.JLabel();
        txtfechaH = new javax.swing.JTextField();
        fecha = new javax.swing.JLabel();
        txtHora = new javax.swing.JTextField();
        hora = new javax.swing.JLabel();
        txtIDmedicoH = new javax.swing.JTextField();
        medicoid = new javax.swing.JLabel();
        txtTurno = new javax.swing.JTextField();
        turno = new javax.swing.JLabel();
        btnSeleccionar = new javax.swing.JButton();

        jLabel3.setText("Cita ID:");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconImage(null);

        jPanel5.setBackground(new java.awt.Color(104, 104, 205));

        citamedica.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        citamedica.setText("Gestionar Cita Medica");

        datos.setBackground(new java.awt.Color(204, 255, 255));
        datos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos"));

        citaid.setText("Cita ID:");

        txtcita_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcita_idActionPerformed(evt);
            }
        });

        estadocita.setText("Estado:");

        txtxestadocita.setEditable(false);

        javax.swing.GroupLayout datosLayout = new javax.swing.GroupLayout(datos);
        datos.setLayout(datosLayout);
        datosLayout.setHorizontalGroup(
            datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(datosLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(citaid, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(estadocita, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtxestadocita, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                    .addComponent(txtcita_id, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        datosLayout.setVerticalGroup(
            datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(datosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtcita_id, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(citaid, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(estadocita, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtxestadocita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos del paciente"));

        nombreapellidos.setText("Nombre y Apellidos:");

        dnipaciente.setText("DNI Paciente");

        btnBuscarPaciente.setBackground(new java.awt.Color(0, 204, 204));
        btnBuscarPaciente.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnBuscarPaciente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8_Search_40px.png"))); // NOI18N
        btnBuscarPaciente.setText("Buscar");
        btnBuscarPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarPacienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnBuscarPaciente)
                .addGap(52, 52, 52))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(dnipaciente)
                        .addGap(23, 23, 23)
                        .addComponent(txtdniP, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(nombreapellidos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                        .addComponent(txtnombre_paciente, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(201, 201, 201))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(btnBuscarPaciente))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dnipaciente)
                            .addComponent(txtdniP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtnombre_paciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombreapellidos))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        costototal.setBackground(new java.awt.Color(204, 255, 255));
        costototal.setBorder(javax.swing.BorderFactory.createTitledBorder("Costo Total"));

        pago.setText("Pago:");

        txtpago.setEnabled(false);
        txtpago.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        btnCalcular.setText("Calcular ");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        pagotarjeta.setText("Pago con Tarjeta");

        cbpagotarje.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Si", "No" }));

        javax.swing.GroupLayout costototalLayout = new javax.swing.GroupLayout(costototal);
        costototal.setLayout(costototalLayout);
        costototalLayout.setHorizontalGroup(
            costototalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(costototalLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(costototalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(costototalLayout.createSequentialGroup()
                        .addComponent(pagotarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbpagotarje, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(costototalLayout.createSequentialGroup()
                        .addComponent(pago)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtpago, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addComponent(btnCalcular)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        costototalLayout.setVerticalGroup(
            costototalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, costototalLayout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(costototalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pagotarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbpagotarje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(costototalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCalcular)
                    .addComponent(pago)
                    .addComponent(txtpago, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );

        btnRegistrar.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8_Save_32px.png"))); // NOI18N
        btnRegistrar.setText("REGISTRAR");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        filtro.setBackground(new java.awt.Color(204, 255, 255));
        filtro.setBorder(javax.swing.BorderFactory.createTitledBorder("Filtro"));

        cbespecialidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar..", "Medicina General", "Odontología", "Ginecologia", "Obstetricia", "Pediatria", "Cardiologia" }));

        especialidad.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        especialidad.setText("Especialidad :");

        btnbuscarhorario.setBackground(new java.awt.Color(0, 204, 204));
        btnbuscarhorario.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnbuscarhorario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8_Search_40px.png"))); // NOI18N
        btnbuscarhorario.setText("Buscar");
        btnbuscarhorario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarhorarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout filtroLayout = new javax.swing.GroupLayout(filtro);
        filtro.setLayout(filtroLayout);
        filtroLayout.setHorizontalGroup(
            filtroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(filtroLayout.createSequentialGroup()
                .addGroup(filtroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(filtroLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(especialidad))
                    .addGroup(filtroLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(cbespecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(filtroLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(btnbuscarhorario)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        filtroLayout.setVerticalGroup(
            filtroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(filtroLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(especialidad)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbespecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(btnbuscarhorario)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        Tabla.setToolTipText("");
        jScrollPane1.setViewportView(Tabla);

        codigohorario.setText("Id Horario");

        fecha.setText("Fecha");

        hora.setText("Hora");

        medicoid.setText("Id Medico");

        turno.setText("Turno");

        btnSeleccionar.setText("Seleccionar");
        btnSeleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(costototal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(txtIDhorario, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(txtfechaH, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(txtHora, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtIDmedicoH, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(txtTurno))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 623, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(codigohorario)
                        .addGap(58, 58, 58)
                        .addComponent(fecha)
                        .addGap(94, 94, 94)
                        .addComponent(hora)
                        .addGap(76, 76, 76)
                        .addComponent(medicoid)
                        .addGap(78, 78, 78)
                        .addComponent(turno)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(214, 214, 214)
                        .addComponent(btnRegistrar)
                        .addContainerGap(344, Short.MAX_VALUE))))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(352, 352, 352)
                        .addComponent(citamedica))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(datos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(filtro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSeleccionar))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(citamedica, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSeleccionar)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(codigohorario)
                                    .addComponent(fecha)
                                    .addComponent(hora)
                                    .addComponent(medicoid)
                                    .addComponent(turno))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtIDhorario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtfechaH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(286, 286, 286)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtIDmedicoH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTurno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addComponent(btnRegistrar))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(datos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(filtro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(costototal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(254, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
     
     private void inicializarNuevacita() {
        cita = new Cita();
        horarioSelec = new Horario();
        txtcita_id.requestFocus();
        txtcita_id.setText("");
        cbpagotarje.setSelectedItem("");
        cbespecialidad.setSelectedItem("");
        txtpago.setText("");
        txtdniP.setText("");
        txtnombre_paciente.setText("");
        txtIDhorario.setText("");
        txtfechaH.setText("");
        txtHora.setText("");
        txtIDmedicoH.setText("");
        txtxestadocita.setText("Pendiente");
        txtTurno.setText("");
        btnRegistrar.setEnabled(false);        
         try {
        registrarCitaServicio = new RegistrarCitaServicio();
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Error al inicializar el servicio de registro de cita.", "Error", JOptionPane.ERROR_MESSAGE);
        // Manejo de la excepción
    }
    }
     
    private void txtcita_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcita_idActionPerformed
      
    }//GEN-LAST:event_txtcita_idActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
      try {
            capturarDatosDelacita();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error de ingreso de datos", "Advertenia", JOptionPane.WARNING_MESSAGE);
            return;
        }
        try {
            guardarcita();
            inicializarNuevacita();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Advertenia", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnBuscarPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarPacienteActionPerformed
        String dniDelPaciente = txtdniP.getText().trim();
        try {
            Paciente paciente = registrarCitaServicio.buscarPaciente(dniDelPaciente);
            cita.setPaciente(paciente);
            txtnombre_paciente.setText(paciente.getNombrePaciente()+" "+paciente.getApellidosPaciente());
               activarBotonRegistrar();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Advertencia", JOptionPane.WARNING_MESSAGE);
            txtnombre_paciente.setText("");
            txtdniP.requestFocus();
        }
    }//GEN-LAST:event_btnBuscarPacienteActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        String especialidad=cbespecialidad.getSelectedItem().toString();
        String pagotarjeta=cbpagotarje.getSelectedItem().toString();
        int edadDelPaciente = cita.getPaciente().getEdadPaciente();
        cita.calcularElCostoDelTipoDeEspecialidadPorElTipoDePago(especialidad, pagotarjeta);
        txtpago.setText(String.valueOf(cita.calcularElCostoDelTipoDeEspecialidadPorElTipoDePago(especialidad, pagotarjeta)));
    }//GEN-LAST:event_btnCalcularActionPerformed
   
    private void btnbuscarhorarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarhorarioActionPerformed

         String especialidadDelMedico = cbespecialidad.getSelectedItem().toString();


        modelo.setColumnIdentifiers(nombreColumnas);
        try {
            ArrayList<Horario> lista = registrarCitaServicio.buscarHorario(especialidadDelMedico);
            Object[][] datos = new Object[lista.size()][8];
            for (int i = 0; i < lista.size(); i++) {
                Horario x = lista.get(i);
                datos[i][0] = x.getCodigo();
                datos[i][1] = x.getFecha();
                datos[i][2] = x.getHoraInicio();
                datos[i][3] = x.getHoraFin();
                datos[i][4] = x.getMedico_id();
                datos[i][5] = x.getEstado();
                datos[i][6] = x.getMedico_especialidad();
                datos[i][7] = x.getTurno();
            }
            modelo.setDataVector(datos, nombreColumnas);
            
            activarBotonRegistrar();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_btnbuscarhorarioActionPerformed

    private void btnSeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionarActionPerformed
     //codigo,fecha,horainicio,horafin,medico_id,estado,medico_especialidad,turno
      int i = Tabla.getSelectedRow();
        if (i != -1) {
            horarioSelec.setCodigo(modelo.getValueAt(i, 0).toString());
            horarioSelec.setFecha(modelo.getValueAt(i, 1).toString());
            horarioSelec.setHoraInicio(modelo.getValueAt(i, 2).toString());
            horarioSelec.setHoraFin(modelo.getValueAt(i, 3).toString());
            horarioSelec.setMedico_id(modelo.getValueAt(i, 4).toString());
            horarioSelec.setEstado(modelo.getValueAt(i, 5).toString());
            horarioSelec.setMedico_especialidad(modelo.getValueAt(i, 6).toString());
            horarioSelec.setTurno(modelo.getValueAt(i, 7).toString());
            
        } else {
            JOptionPane.showMessageDialog(null, "Debes Seleccionar un elemento");
        }
        txtIDhorario.setText(horarioSelec.getCodigo());
        txtfechaH.setText(horarioSelec.getFecha());
        txtHora.setText(" "+horarioSelec.getHoraInicio()+" - "+horarioSelec.getHoraFin());
        txtIDmedicoH.setText(horarioSelec.getMedico_id());
        txtTurno.setText(horarioSelec.getTurno());
    }//GEN-LAST:event_btnSeleccionarActionPerformed
    
    private void guardarcita() throws  Exception, HeadlessException{
        registrarCitaServicio.guardarcita(cita);
        JOptionPane.showMessageDialog(this, "Se guardo los datos de la cita", "Información", JOptionPane.INFORMATION_MESSAGE);        
    }
         
       private void capturarDatosDelacita() throws NumberFormatException {
        cita.setCodigocita(txtcita_id.getText().trim());
        cita.setEstado_cita(txtxestadocita.getText().trim());
        cita.setHoraCita(txtHora.getText().trim());
        cita.setIdhorarioDeCita(txtIDhorario.getText().trim());
        cita.setFechaCita(txtfechaH.getText().trim());
        cita.setIdmedicoCita(txtIDmedicoH.getText().trim());
        cita.setTurnoCita(txtTurno.getText().trim());
        cita.setPagoCita(Double.parseDouble(txtpago.getText().trim()));
        
       }
       //HABILITAR BOTON REGISTRAR
       private void activarBotonRegistrar() {
        btnRegistrar.setEnabled(cita.getPaciente() != null);
    }
          private void soloNumeros(java.awt.event.KeyEvent evt) {
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))) {
            evt.consume();
        }
    }
   
       
       
        public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        Cita cita = new Cita();
        Paciente paciente = new Paciente();
        Medico medico = new Medico();
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaRegistrarCita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaRegistrarCita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaRegistrarCita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaRegistrarCita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                VentanaRegistrarCita dialog = null;
                try {
                    dialog = new VentanaRegistrarCita(new javax.swing.JFrame(), true);
                } catch (Exception ex) {
                    Logger.getLogger(VentanaRegistrarCita.class.getName()).log(Level.SEVERE, null, ex);
                }
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabla;
    private javax.swing.JButton btnBuscarPaciente;
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnSeleccionar;
    private javax.swing.JButton btnbuscarhorario;
    private javax.swing.JComboBox<String> cbespecialidad;
    private javax.swing.JComboBox<String> cbpagotarje;
    private javax.swing.JLabel citaid;
    private javax.swing.JLabel citamedica;
    private javax.swing.JLabel codigohorario;
    private javax.swing.JPanel costototal;
    private javax.swing.JPanel datos;
    private javax.swing.JLabel dnipaciente;
    private javax.swing.JLabel especialidad;
    private javax.swing.JLabel estadocita;
    private javax.swing.JLabel fecha;
    private javax.swing.JPanel filtro;
    private javax.swing.JLabel hora;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel medicoid;
    private javax.swing.JLabel nombreapellidos;
    private javax.swing.JLabel pago;
    private javax.swing.JLabel pagotarjeta;
    private javax.swing.JLabel turno;
    private javax.swing.JTextField txtHora;
    private javax.swing.JTextField txtIDhorario;
    private javax.swing.JTextField txtIDmedicoH;
    private javax.swing.JTextField txtTurno;
    private java.awt.TextField txtcita_id;
    private java.awt.TextField txtdniP;
    private javax.swing.JTextField txtfechaH;
    private java.awt.TextField txtnombre_paciente;
    private java.awt.TextField txtpago;
    private javax.swing.JTextField txtxestadocita;
    // End of variables declaration//GEN-END:variables
}
