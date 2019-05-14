package interfaces;

import CRUD.Car;
import CRUD.strCar;
import config.Config;
import exceptions.expIdNotExist;
import java.awt.Color;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Index extends javax.swing.JFrame {

    
    Car cars = new Car();
    
    boolean update = false;
    int filter = 1;

    public Index() throws IOException {
        initComponents();
        lblTitle.setText(Config.getName());
        
        cars.loadFromFile();
        if(cars.getList().size() >= 0) {
            refreshTable();
            setTotalServices();
            setTotalEarnings();
            cleanForm();
        }
        
        btnAddNew.setVisible(false);
        comboFilter.setSelectedIndex(3);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlRight = new javax.swing.JPanel();
        pnlStats = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txtEarnings = new javax.swing.JTextField();
        txtCountServices = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        pnlForm = new javax.swing.JPanel();
        lblForm = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtClientName = new javax.swing.JTextField();
        txtColor = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtPayment = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        comboStatus = new javax.swing.JComboBox();
        btnSave = new javax.swing.JButton();
        btnAddNew = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        pnlLeft = new javax.swing.JPanel();
        pnlFilter = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        comboFilter = new javax.swing.JComboBox();
        pnlContent = new javax.swing.JPanel();
        scrollList = new javax.swing.JScrollPane();
        tableList = new javax.swing.JTable();
        jSeparator2 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlRight.setBackground(new java.awt.Color(254, 254, 254));
        pnlRight.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(232, 232, 232)));
        pnlRight.setMaximumSize(new java.awt.Dimension(333, 32767));

        pnlStats.setBackground(new java.awt.Color(254, 254, 254));
        pnlStats.setMaximumSize(new java.awt.Dimension(288, 179));
        pnlStats.setMinimumSize(new java.awt.Dimension(288, 179));
        pnlStats.setPreferredSize(new java.awt.Dimension(288, 179));
        pnlStats.setRequestFocusEnabled(false);

        jLabel6.setText("Ingresos:");

        txtEarnings.setBackground(new java.awt.Color(254, 254, 254));
        txtEarnings.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        txtEarnings.setText("  $ 0.0");
        txtEarnings.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(233, 233, 233)));

        txtCountServices.setBackground(new java.awt.Color(254, 254, 254));
        txtCountServices.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        txtCountServices.setText("  0");
        txtCountServices.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(233, 233, 233)));

        jLabel8.setText("Total de Servicios:");

        javax.swing.GroupLayout pnlStatsLayout = new javax.swing.GroupLayout(pnlStats);
        pnlStats.setLayout(pnlStatsLayout);
        pnlStatsLayout.setHorizontalGroup(
            pnlStatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlStatsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlStatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtEarnings)
                    .addComponent(txtCountServices, javax.swing.GroupLayout.DEFAULT_SIZE, 351, Short.MAX_VALUE)
                    .addGroup(pnlStatsLayout.createSequentialGroup()
                        .addGroup(pnlStatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlStatsLayout.setVerticalGroup(
            pnlStatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlStatsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(10, 10, 10)
                .addComponent(txtEarnings, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(10, 10, 10)
                .addComponent(txtCountServices, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pnlForm.setBackground(new java.awt.Color(254, 254, 254));
        pnlForm.setBorder(null);
        pnlForm.setMaximumSize(new java.awt.Dimension(333, 32767));

        lblForm.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        lblForm.setText("Agregar Automóvil");

        jLabel2.setText("Nombre del Cliente:");

        jLabel3.setText("Color:");

        jLabel4.setText("Costo:");

        jLabel5.setText("Estado del auto:");

        comboStatus.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "En Cola", "Trabajando", "Entregado" }));

        btnSave.setBackground(new java.awt.Color(127, 212, 150));
        btnSave.setForeground(new java.awt.Color(254, 254, 254));
        btnSave.setText("Guardar");
        btnSave.setBorder(null);
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnAddNew.setBackground(new java.awt.Color(1, 1, 1));
        btnAddNew.setForeground(new java.awt.Color(254, 254, 254));
        btnAddNew.setText("Agregar Nuevo");
        btnAddNew.setBorder(null);
        btnAddNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddNewActionPerformed(evt);
            }
        });

        jLabel1.setText("ID:");

        txtId.setEditable(false);
        txtId.setBackground(new java.awt.Color(254, 254, 254));
        txtId.setText("1");

        javax.swing.GroupLayout pnlFormLayout = new javax.swing.GroupLayout(pnlForm);
        pnlForm.setLayout(pnlFormLayout);
        pnlFormLayout.setHorizontalGroup(
            pnlFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFormLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtClientName)
                    .addComponent(txtColor)
                    .addComponent(txtPayment)
                    .addComponent(comboStatus, 0, 349, Short.MAX_VALUE)
                    .addGroup(pnlFormLayout.createSequentialGroup()
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAddNew, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlFormLayout.createSequentialGroup()
                        .addGroup(pnlFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblForm)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addGroup(pnlFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlFormLayout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addGap(0, 0, 0)))
                .addContainerGap())
        );
        pnlFormLayout.setVerticalGroup(
            pnlFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFormLayout.createSequentialGroup()
                .addComponent(lblForm)
                .addGap(18, 18, 18)
                .addGroup(pnlFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtClientName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPayment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comboStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(pnlFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddNew, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jSeparator1.setBackground(new java.awt.Color(232, 232, 232));
        jSeparator1.setForeground(new java.awt.Color(254, 254, 254));

        javax.swing.GroupLayout pnlRightLayout = new javax.swing.GroupLayout(pnlRight);
        pnlRight.setLayout(pnlRightLayout);
        pnlRightLayout.setHorizontalGroup(
            pnlRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRightLayout.createSequentialGroup()
                .addGroup(pnlRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(pnlForm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(pnlStats, javax.swing.GroupLayout.DEFAULT_SIZE, 375, Short.MAX_VALUE))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0))
        );
        pnlRightLayout.setVerticalGroup(
            pnlRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRightLayout.createSequentialGroup()
                .addComponent(pnlStats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlForm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlLeft.setBackground(new java.awt.Color(254, 254, 254));

        pnlFilter.setBackground(new java.awt.Color(254, 254, 254));
        pnlFilter.setMaximumSize(new java.awt.Dimension(32767, 179));
        pnlFilter.setMinimumSize(new java.awt.Dimension(0, 179));
        pnlFilter.setPreferredSize(new java.awt.Dimension(619, 180));

        lblTitle.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        lblTitle.setText("Car Wash");

        jLabel7.setText("Filtro:");

        comboFilter.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "En Cola", "Trabajando", "Entregado", "Todos" }));
        comboFilter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboFilterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlFilterLayout = new javax.swing.GroupLayout(pnlFilter);
        pnlFilter.setLayout(pnlFilterLayout);
        pnlFilterLayout.setHorizontalGroup(
            pnlFilterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFilterLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlFilterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlFilterLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboFilter, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlFilterLayout.setVerticalGroup(
            pnlFilterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFilterLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                .addGroup(pnlFilterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(comboFilter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pnlContent.setBackground(new java.awt.Color(254, 254, 254));

        tableList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Cliente", "Color Auto", "Costo", "Estado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableList.setRowHeight(30);
        tableList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableListMouseClicked(evt);
            }
        });
        scrollList.setViewportView(tableList);

        javax.swing.GroupLayout pnlContentLayout = new javax.swing.GroupLayout(pnlContent);
        pnlContent.setLayout(pnlContentLayout);
        pnlContentLayout.setHorizontalGroup(
            pnlContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlContentLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollList, javax.swing.GroupLayout.DEFAULT_SIZE, 595, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlContentLayout.setVerticalGroup(
            pnlContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlContentLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollList, javax.swing.GroupLayout.DEFAULT_SIZE, 433, Short.MAX_VALUE)
                .addContainerGap())
        );

        jSeparator2.setBackground(new java.awt.Color(232, 232, 232));
        jSeparator2.setForeground(new java.awt.Color(254, 254, 254));

        javax.swing.GroupLayout pnlLeftLayout = new javax.swing.GroupLayout(pnlLeft);
        pnlLeft.setLayout(pnlLeftLayout);
        pnlLeftLayout.setHorizontalGroup(
            pnlLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlFilter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlContent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        pnlLeftLayout.setVerticalGroup(
            pnlLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLeftLayout.createSequentialGroup()
                .addComponent(pnlFilter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pnlContent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(pnlLeft, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(pnlRight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlRight, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlLeft, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /// SAVE
    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        if (emptyForm()) {
            alert("Formulario Vacio", "Intenta de nuevo...");
            return;
        } 
        
        if (update) {
            try {
                updateCar();
            } catch (expIdNotExist ex) {
                Logger.getLogger(Index.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(Index.class.getName()).log(Level.SEVERE, null, ex);
            }
            refreshTable();
            cleanForm();
        } else {
            saveCar();
            refreshTable();
        }
        
    }//GEN-LAST:event_btnSaveActionPerformed

    private void tableListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableListMouseClicked
            int iRow = tableList.rowAtPoint(evt.getPoint());
            int iCol = tableList.columnAtPoint(evt.getPoint());
            if (tableList.getValueAt(iRow, iCol) != null) {
                int id = Integer.parseInt((tableList.getValueAt(iRow, 0)).toString().replace(" ", ""));
                setFormCar(id);
            }
            
            isUpdate(true);
    }//GEN-LAST:event_tableListMouseClicked

    private void btnAddNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddNewActionPerformed
        isUpdate(false);
        emptyForm();
    }//GEN-LAST:event_btnAddNewActionPerformed

    private void comboFilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboFilterActionPerformed
        this.filter = comboFilter.getSelectedIndex()+1;
        refreshTable();
    }//GEN-LAST:event_comboFilterActionPerformed

    public void saveCar() {
        strCar car = new strCar(
                cars.getNextId(), 
                txtClientName.getText(), 
                txtColor.getText(), 
                Double.parseDouble(txtPayment.getText()), 
                (comboStatus.getSelectedIndex()+1));
        cars.create(car);
        try {
            cars.saveToFile();
        } catch (IOException ex) {
            System.out.println("could not save");
            Logger.getLogger(Index.class.getName()).log(Level.SEVERE, null, ex);
        }
        setTotalServices();
        setTotalEarnings();
        cleanForm();
    }
    
    public void updateCar() throws expIdNotExist, IOException {
        int id = Integer.parseInt(txtId.getText());
        strCar updated = cars.searchId(id);
        updated.setNameClient(txtClientName.getText());
        updated.setColorCar(txtColor.getText());
        updated.setPayment(Double.parseDouble(txtPayment.getText()));
        updated.setStatus((comboStatus.getSelectedIndex()+1));
        
        cars.update(updated);
        cars.saveToFile();
        setTotalServices();
        setTotalEarnings();
        
        
        isUpdate(false);
    }
    
    public void refreshTable() {
        int count = 0;
        
        for (strCar x : cars.getList()) {
            if (x.getStatus() == this.filter || this.filter == 4) count ++;
        }
        
        String matrix[][] = new String[count][5]; 
        
        int i = 0;
        for (strCar x: cars.getList()) {
            // FILTER
            if (x.getStatus() == this.filter || this.filter == 4) {
                matrix[i][0] = " "+x.getId();
                matrix[i][1] = " "+x.getNameClient();
                matrix[i][2] = " "+x.getColorCar();
                matrix[i][3] = " $"+x.getPayment();
                matrix[i][4] = " "+getStatus(x.getStatus());
                i++;
            }
        }
        
        tableList.setModel(new javax.swing.table.DefaultTableModel(
                matrix,
                new String[] {
                    "ID", "Cliente", "Color Carro", "Costo", "Estado"
                }
        ));
    }
    
    public String getStatus(int num) {
        String status = "";
        switch(num) {
            case 1: 
                status = "En Cola";
                break;
            case 2: 
                status = "Trabajando";
                break;
            case 3: 
                status = "Entregado";
                break;
        }
        return status;
    }
    
    public strCar searchCar(int id){
        strCar x = cars.searchId(id);
        return x;
    }
    
    public void setFormCar(int id){
        strCar car = searchCar(id);
        if (car == null){
            alert("ID no existe", "Error..");
            return;
        }
        
        txtId.setText(car.getId()+"");
        txtClientName.setText(car.getNameClient());
        txtColor.setText(car.getColorCar());
        txtPayment.setText(car.getPayment()+"");
        comboStatus.setSelectedIndex(car.getStatus()-1);
    }
    
    public boolean emptyForm() {
        if ((txtClientName.getText()).replace(" ", "") == "" || (txtClientName.getText()).isEmpty()) return true;
        if ((txtColor.getText()).replace(" ", "") == ""|| (txtColor.getText()).isEmpty()) return true;
        if ((txtPayment.getText()).replace(" ", "") == ""|| (txtPayment.getText()).isEmpty()) return true;
        
        return false;
    }
    
    public void cleanForm(){
        if (cars.getList().size() < 1) return; 
        int lastId = cars.getList().get(cars.getList().size()-1).getId()+1;
        txtId.setText((lastId)+"");
        txtClientName.setText("");
        txtColor.setText("");
        txtPayment.setText("");
        comboStatus.setSelectedIndex(0);
    }
    
    public void setTotalEarnings(){
        double total = 0;
        for (strCar x : cars.getList()) {
            total += x.getPayment();
        }
        txtEarnings.setText("  $"+total);
    }
    public void setTotalServices(){
        txtCountServices.setText("  "+cars.getList().size());
    }
    
    public void isUpdate(boolean bool) {
        if (bool) {
            lblForm.setText("Actualizar Automóvil");
            btnSave.setText("Actualizar");
            btnSave.setBackground(new Color(79,179,245));
            btnAddNew.setVisible(true); 
        } else {
            lblForm.setText("Agregar Automóvil");
            btnSave.setText("Guardar");
            btnSave.setBackground(new Color(127,212,150)); 
            btnAddNew.setVisible(false); 
            cleanForm();
        }
        update = bool;
    }
    
    public void alert(String message, String title){
        JOptionPane.showMessageDialog(null, message, title, 0);
    }

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
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Index().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(Index.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddNew;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox comboFilter;
    private javax.swing.JComboBox comboStatus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblForm;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JPanel pnlContent;
    private javax.swing.JPanel pnlFilter;
    private javax.swing.JPanel pnlForm;
    private javax.swing.JPanel pnlLeft;
    private javax.swing.JPanel pnlRight;
    private javax.swing.JPanel pnlStats;
    private javax.swing.JScrollPane scrollList;
    private javax.swing.JTable tableList;
    private javax.swing.JTextField txtClientName;
    private javax.swing.JTextField txtColor;
    private javax.swing.JTextField txtCountServices;
    private javax.swing.JTextField txtEarnings;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtPayment;
    // End of variables declaration//GEN-END:variables
}
