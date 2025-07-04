package IGU;

import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import logica.Empleado;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import IGU.Menu;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.HashSet;
import java.util.Set;        

import logica.Maquinaria;
import logica.Sucursal;
import logica.Pais;

public class cargarEmpleados extends javax.swing.JFrame {
    String documento;
    String nomPais;
    String nombre;
    String apellido;
    String puestoLaboral;
    String sueldo;
    
    int idMaquina = 0;
    int idSucursal = 0;
    int idPais = 0;
    
    ArrayList <Empleado> listaDeEmpleados = new ArrayList<>();
    
    
    
    public cargarEmpleados() {
        initComponents();
        cargarOpcionesComboMaquinaria();
        cargarOpcionesUbicacionSucursal();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNombreEmpleado = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtPuestoLaboral = new javax.swing.JTextField();
        txtSueldo = new javax.swing.JTextField();
        btnAgregarEmpleado = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        cbxMaquinaria = new javax.swing.JComboBox<>();
        cbxUbicacionSucursal = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtDocumento = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtPais = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        btnVolver = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(240, 240, 240));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 2, 24)); // NOI18N
        jLabel1.setText("Cargar Empleados");

        jLabel2.setText("Nombre");

        jLabel3.setText("Apellido");

        jLabel4.setText("Puesto Laboral");

        jLabel5.setText("Sueldo");

        txtApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidoActionPerformed(evt);
            }
        });

        txtPuestoLaboral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPuestoLaboralActionPerformed(evt);
            }
        });

        txtSueldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSueldoActionPerformed(evt);
            }
        });

        btnAgregarEmpleado.setBackground(new java.awt.Color(34, 70, 36));
        btnAgregarEmpleado.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarEmpleado.setText("Agregar Empleado");
        btnAgregarEmpleado.setBorder(null);
        btnAgregarEmpleado.setBorderPainted(false);
        btnAgregarEmpleado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregarEmpleado.setFocusPainted(false);
        btnAgregarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarEmpleadoActionPerformed(evt);
            }
        });

        btnNuevo.setBackground(new java.awt.Color(34, 70, 36));
        btnNuevo.setForeground(new java.awt.Color(255, 255, 255));
        btnNuevo.setText("Nuevo");
        btnNuevo.setBorder(null);
        btnNuevo.setBorderPainted(false);
        btnNuevo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNuevo.setFocusPainted(false);
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        cbxMaquinaria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbxMaquinaria.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxMaquinariaItemStateChanged(evt);
            }
        });
        cbxMaquinaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxMaquinariaActionPerformed(evt);
            }
        });

        cbxUbicacionSucursal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel6.setText("Maquinaria");

        jLabel7.setText("Sucursal");

        jLabel9.setText("Documento");

        jLabel10.setText("País");

        txtPais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPaisActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(179, 179, 179)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnAgregarEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtSueldo)
                                    .addComponent(txtPuestoLaboral, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(67, 67, 67)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNombreEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(67, 67, 67)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtDocumento)
                            .addComponent(txtPais, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 109, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(56, 56, 56)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(cbxMaquinaria, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(77, 77, 77))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(cbxUbicacionSucursal, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(100, 100, 100))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbxMaquinaria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(79, 79, 79))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPais, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(cbxUbicacionSucursal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 10, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNombreEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPuestoLaboral, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSueldo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(77, 77, 77)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregarEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42))
        );

        jPanel2.setBackground(new java.awt.Color(34, 70, 46));

        btnVolver.setBackground(new java.awt.Color(36, 70, 46));
        btnVolver.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnVolver.setForeground(new java.awt.Color(255, 255, 255));
        btnVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/flecha-izquierda.png"))); // NOI18N
        btnVolver.setText("Volver");
        btnVolver.setBorder(null);
        btnVolver.setBorderPainted(false);
        btnVolver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVolver.setFocusPainted(false);
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/administración2.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnVolver, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnVolver)
                .addGap(38, 38, 38))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
private ArrayList<Empleado> leerEmpleadosDesdeArchivo() {
    ArrayList<Empleado> empleadosGuardados = new ArrayList<>();
    File archivo = new File("Empleados.dat");

    if (archivo.exists()) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(archivo))) {
            empleadosGuardados = (ArrayList<Empleado>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(this, "Error al leer empleados existentes: " + e.getMessage());
        }
    }
    return empleadosGuardados;
}
    private void guardarEmpleadosEnArchivo(){
         try {
        ArrayList<Empleado> empleadosActuales = leerEmpleadosDesdeArchivo(); //lee los epleados que esta guardados en el archivo
        empleadosActuales.addAll(listaDeEmpleados); //los une si ya existen otros

        FileOutputStream fos = new FileOutputStream("Empleados.dat"); //se abre el archivo para escribir los datos
        ObjectOutputStream oos = new ObjectOutputStream(fos); //permite guardar objetos java
        oos.writeObject(empleadosActuales); //escribes los datos que estan almacenados en empleadosActuales
        oos.close();//libera recursos
        fos.close();//libera recursos

        System.out.println("Empleados guardados sin sobrescribir.");
        listaDeEmpleados.clear(); 

    } catch (IOException e) {
        JOptionPane.showMessageDialog(this, "Error al guardar empleados: " + e.getMessage());
    }
    }
    
    private void btnAgregarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarEmpleadoActionPerformed
           documento = txtDocumento.getText();
           nombre = txtNombreEmpleado.getText();
           apellido = txtApellido.getText();
           puestoLaboral = txtPuestoLaboral.getText();
           sueldo = txtSueldo.getText();
           nomPais = txtPais.getText();
           
           
          String nomMaquina = (String)cbxMaquinaria.getSelectedItem();
          String zona = (String)cbxUbicacionSucursal.getSelectedItem();
          
          
         idMaquina = idMaquina + 1;
         idSucursal = idSucursal + 1;
         idPais = idPais + 1;
         
          Maquinaria maquina = new Maquinaria(idMaquina, nomMaquina);
          Sucursal sucursal = new Sucursal(idSucursal, zona);
          Pais pais = new Pais(idPais, nomPais);
          
          String maquinaEmp = maquina.getNomMaquinaria();
          String sucursalEmp = sucursal.getZona();
          String paisEmp = pais.getNomPais();
          
            if (nombre.isEmpty()|| apellido.isEmpty()|| puestoLaboral.isEmpty()|| sueldo.isEmpty()){
                JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos.");
            }
                
                        
            
            try{
            double sueldoEmp = Double.parseDouble(sueldo);
            String mensaje = "Empleado cargado:\nDocumento: "+ documento +
                                 "\n Pais: " + paisEmp +
                                  "\nNombre: " + nombre + 
                                  "\nApellido: " + apellido + 
                                  "\nPuesto: " + puestoLaboral + 
                                  "\nSueldo: $" +sueldo +
                                  "\n Maquinaria que opera: " + maquinaEmp +
                                  "\nSucursal: " + sucursalEmp;
               JOptionPane.showMessageDialog(this, mensaje);
            Empleado emp = new Empleado(documento,paisEmp,nombre, apellido, puestoLaboral, sueldoEmp,maquinaEmp,sucursalEmp);
            listaDeEmpleados.add(emp);
            guardarEmpleadosEnArchivo();
            }catch(Exception e){
                JOptionPane.showMessageDialog(this, "Ingrese solo números en sueldo");
            }
            
    }//GEN-LAST:event_btnAgregarEmpleadoActionPerformed
private void limpiarCampos(){
    txtDocumento.setText("");
    txtPais.setText("");
    txtNombreEmpleado.setText("");
    txtApellido.setText("");
    txtPuestoLaboral.setText("");
    txtSueldo.setText("");
}
    private void txtSueldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSueldoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSueldoActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        Menu menu = new Menu();
        menu.setVisible(true);
        menu.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        limpiarCampos();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void cbxMaquinariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxMaquinariaActionPerformed
      
    }//GEN-LAST:event_cbxMaquinariaActionPerformed

    private void cbxMaquinariaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxMaquinariaItemStateChanged
       
    }//GEN-LAST:event_cbxMaquinariaItemStateChanged

    private void txtApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidoActionPerformed

    private void txtPuestoLaboralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPuestoLaboralActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPuestoLaboralActionPerformed

    private void txtPaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPaisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPaisActionPerformed
private void cargarOpcionesComboMaquinaria() {
    cbxMaquinaria.removeAllItems();
      Set<String> nombresUnicos = new HashSet<>(); 

    try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("maquinarias.dat"))) {
        while (true) {
            Maquinaria maq = (Maquinaria) ois.readObject();
            if (nombresUnicos.add(maq.getNomMaquinaria())) { 
                cbxMaquinaria.addItem(maq.getNomMaquinaria());
            }
        }
    } catch (EOFException eof) {
        // Fin del archivo, es normal, no hacer nada
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Cargar Maquinarias");
    }
}

private void cargarOpcionesUbicacionSucursal(){
    cbxUbicacionSucursal.removeAllItems();
    Set<String> zonasUnicas = new HashSet<>();

    try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("sucursales.dat"))) {
        while (true) {
            logica.Sucursal suc = (logica.Sucursal) ois.readObject();
            if (zonasUnicas.add(suc.getZona())) {
                cbxUbicacionSucursal.addItem(suc.getZona());
            }
        }
    }  catch (EOFException eof) {
        // Fin del archivo, es normal, no hacer nada
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Cargar Sucursales");
    } 
}

       

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarEmpleado;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnVolver;
    private javax.swing.JComboBox<String> cbxMaquinaria;
    private javax.swing.JComboBox<String> cbxUbicacionSucursal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtDocumento;
    private javax.swing.JTextField txtNombreEmpleado;
    private javax.swing.JTextField txtPais;
    private javax.swing.JTextField txtPuestoLaboral;
    private javax.swing.JTextField txtSueldo;
    // End of variables declaration//GEN-END:variables
}
