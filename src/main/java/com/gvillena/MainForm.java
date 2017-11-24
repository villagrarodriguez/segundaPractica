/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gvillena;

import com.google.gson.Gson;
import com.google.gson.stream.JsonWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.AbstractListModel;
import javax.swing.DefaultListModel;
import javax.swing.ListModel;
import javax.swing.SpinnerListModel;

/**
 *
 * @author alumno
 */
public class MainForm extends javax.swing.JFrame {

    ArrayList<TelefonoMovil> ListaTelefonosMoviles;
    ArrayList<PlanPostPago> ListaPlanesPostPago;
                
    
    private void test() {            
        
        
        // Lista de Planes Post Pago
        ArrayList<PlanPostPago> listaPlanes = new ArrayList<PlanPostPago>();
        
        // Declaracion 
        PlanPostPago plan01; 
        PlanPostPago plan02; 
        PlanPostPago plan03; 
        
        // Inicializacion
        plan01 = new PlanPostPago();        
        plan02 = new PlanPostPago();
        plan03 = new PlanPostPago();
        
        // CLARO MAX 99        
        plan01.setCodigoPlan("CMX99");
        plan01.setNombrePlan("Claro MAX 99");
        plan01.setInternet(500);
        plan01.setMinutos(1000);        
        plan01.setRpc(10000);   
        plan01.setSms(500);
        
        // CLARO MAX 149        
        plan02.setCodigoPlan("CMX149");
        plan02.setNombrePlan("Claro MAX 149");
        plan02.setInternet(1000);
        plan02.setMinutos(3000);        
        plan02.setRpcIlimitado(true);        
        plan02.setSms(1000);
        
        // CLARO MAX 189        
        plan03.setCodigoPlan("CMX189");
        plan03.setNombrePlan("Claro MAX 189");
        plan03.setInternet(3000);
        plan03.setMinutosIlimitado(true);
        plan03.setRpcIlimitado(true);        
        plan03.setSmsIlimitado(true);        
        
        listaPlanes.add(plan01);
        listaPlanes.add(plan02);
        listaPlanes.add(plan03);
        
        for (PlanPostPago listaPlan : listaPlanes) 
        {
            System.out.println("NOMBRE PLAN: " + listaPlan.getNombrePlan());
        }
                
        Gson gson = new Gson();        
        String json = gson.toJson(listaPlanes);
        System.out.println(json);        
        
        JsonWriter writer;
        try         
        {
            writer = new JsonWriter(new FileWriter("D:\\jsonPlanes.txt"));
            writer.jsonValue(json);
            writer.flush();
        } catch (IOException ex) {
            Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
        }        
    }
                
    /**
     * Creates new form MainForm
     */
    public MainForm() {
        
        initComponents();

        // Inicializando
        ListaTelefonosMoviles = new ArrayList<TelefonoMovil>();
        ListaPlanesPostPago = new ArrayList<PlanPostPago>();                                      
                
        String jsonClaro = "";
        String jsonPlanes = "";
        
        Scanner scannerClaro;
        Scanner scannerPlanes;
                
        // 2
        try 
        {
            scannerClaro = new Scanner(new FileReader("D:\\jsonClaro.txt"));                                    
            scannerPlanes = new Scanner(new FileReader("D:\\jsonPlanes.txt"));
            
            StringBuilder sbClaro = new StringBuilder();                         
            
            while (scannerClaro.hasNext()) {                
                sbClaro.append(scannerClaro.next());
            }
            
            StringBuilder sbPlanes = new StringBuilder();            
            while (scannerPlanes.hasNext()) {
                sbPlanes.append(scannerPlanes.next());                
            }
            
            jsonClaro = sbClaro.toString();
            jsonPlanes = sbPlanes.toString();
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        // 
        Gson gson = new Gson();
        
        // 
        TelefonoMovil[] listaClaro = null;
        PlanPostPago[] listaPlanes = null;
        
        //
        listaClaro = gson.fromJson(jsonClaro, TelefonoMovil[].class);         
        listaPlanes = gson.fromJson(jsonPlanes, PlanPostPago[].class);         
        
        // 
        for (int i = 0; i < listaClaro.length; i++) {                        
            ListaTelefonosMoviles.add(listaClaro[i]);
        }
        
        //
        for (int i = 0; i < listaPlanes.length; i++) {                        
            ListaPlanesPostPago.add(listaPlanes[i]);
        }        
        
        // 
        for (PlanPostPago listaPlan : ListaPlanesPostPago) {                        
            
            System.out.println("");
            System.out.println("CODIGO      : " + listaPlan.getCodigoPlan());
            System.out.println("NOMBRE      : " + listaPlan.getNombrePlan());
            System.out.println("INTERNET    : " + listaPlan.getInternet());
            System.out.println("MINUTOS     : " + listaPlan.getMinutos());
            System.out.println("RPC         : " + listaPlan.getRpc());
            System.out.println("SMS         : " + listaPlan.getSms());            
            System.out.println("");
            
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
        java.awt.GridBagConstraints gridBagConstraints;

        buttonGroup1 = new javax.swing.ButtonGroup();
        pblEquiposMovilles = new javax.swing.JScrollPane();
        lstEquiposMoviles = new javax.swing.JList();
        lblTEquiposMoviles = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        spPlanesPostpago = new javax.swing.JSpinner();
        lblDescripcion = new javax.swing.JLabel();
        plCaracteristicas = new javax.swing.JPanel();
        plPantalla = new javax.swing.JPanel();
        lblPantallaImg = new javax.swing.JLabel();
        lblPantalla = new javax.swing.JLabel();
        lblTPantalla = new javax.swing.JLabel();
        plCamara = new javax.swing.JPanel();
        lblCamara = new javax.swing.JLabel();
        lblTCamara = new javax.swing.JLabel();
        lblCamaraImg = new javax.swing.JLabel();
        plProcesador = new javax.swing.JPanel();
        lblProcesador = new javax.swing.JLabel();
        lblTProcesador = new javax.swing.JLabel();
        lblProcesadorImg = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        plBeneficiosPlan = new javax.swing.JPanel();
        plMinutos = new javax.swing.JPanel();
        lblMinutosT = new javax.swing.JLabel();
        lblMinutos = new javax.swing.JLabel();
        plInternet = new javax.swing.JPanel();
        lblInternetT = new javax.swing.JLabel();
        lblInternet = new javax.swing.JLabel();
        plRPC = new javax.swing.JPanel();
        lblRPCT = new javax.swing.JLabel();
        lblRPC = new javax.swing.JLabel();
        plSMS = new javax.swing.JPanel();
        lblSMST = new javax.swing.JLabel();
        lblSMS = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        lstEquiposMoviles.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        lstEquiposMoviles.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstEquiposMovilesValueChanged(evt);
            }
        });
        pblEquiposMovilles.setViewportView(lstEquiposMoviles);

        lblTEquiposMoviles.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblTEquiposMoviles.setText("EQUIPOS DISPONIBLES");

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 40)); // NOI18N
        jLabel1.setText("TIENDA CLARO");

        spPlanesPostpago.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
        spPlanesPostpago.setModel(new javax.swing.SpinnerListModel(new String[] {"Claro MAX 99", "Claro MAX 149", "Claro MAX 189"}));
        spPlanesPostpago.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spPlanesPostpagoStateChanged(evt);
            }
        });

        lblDescripcion.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        lblDescripcion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDescripcion.setText("TELEFONO MOVIL");

        plPantalla.setPreferredSize(new java.awt.Dimension(250, 159));
        plPantalla.setLayout(new java.awt.GridBagLayout());

        lblPantallaImg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPantallaImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon-pantalla.png"))); // NOI18N
        lblPantallaImg.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 3, 0, 3);
        plPantalla.add(lblPantallaImg, gridBagConstraints);

        lblPantalla.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        lblPantalla.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPantalla.setText("-");
        lblPantalla.setFocusable(false);
        lblPantalla.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        plPantalla.add(lblPantalla, gridBagConstraints);

        lblTPantalla.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblTPantalla.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblTPantalla.setText("PANTALLA");
        lblTPantalla.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblTPantalla.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        plPantalla.add(lblTPantalla, gridBagConstraints);

        plCaracteristicas.add(plPantalla);

        plCamara.setPreferredSize(new java.awt.Dimension(250, 159));
        plCamara.setLayout(new java.awt.GridBagLayout());

        lblCamara.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        lblCamara.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCamara.setText("-");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 6, 0, 6);
        plCamara.add(lblCamara, gridBagConstraints);

        lblTCamara.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblTCamara.setText("CAMARA");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        plCamara.add(lblTCamara, gridBagConstraints);

        lblCamaraImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon-camara.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.insets = new java.awt.Insets(0, 12, 0, 12);
        plCamara.add(lblCamaraImg, gridBagConstraints);

        plCaracteristicas.add(plCamara);

        plProcesador.setPreferredSize(new java.awt.Dimension(250, 159));
        plProcesador.setLayout(new java.awt.GridBagLayout());

        lblProcesador.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        lblProcesador.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblProcesador.setText("-");
        lblProcesador.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(0, 6, 0, 0);
        plProcesador.add(lblProcesador, gridBagConstraints);

        lblTProcesador.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblTProcesador.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTProcesador.setText("PROCESADOR");
        lblTProcesador.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 5);
        plProcesador.add(lblTProcesador, gridBagConstraints);

        lblProcesadorImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon-procesador.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 5);
        plProcesador.add(lblProcesadorImg, gridBagConstraints);

        plCaracteristicas.add(plProcesador);

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel2.setText("¡Elige el mejor plan para ti!");

        java.awt.GridBagLayout plBeneficiosPlanLayout = new java.awt.GridBagLayout();
        plBeneficiosPlanLayout.columnWidths = new int[] {0, 4, 0};
        plBeneficiosPlanLayout.rowHeights = new int[] {0, 4, 0};
        plBeneficiosPlan.setLayout(plBeneficiosPlanLayout);

        plMinutos.setLayout(new java.awt.BorderLayout());

        lblMinutosT.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblMinutosT.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMinutosT.setText("MINUTOS");
        plMinutos.add(lblMinutosT, java.awt.BorderLayout.CENTER);

        lblMinutos.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblMinutos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMinutos.setText("Ilimitado");
        plMinutos.add(lblMinutos, java.awt.BorderLayout.PAGE_START);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(21, 29, 21, 29);
        plBeneficiosPlan.add(plMinutos, gridBagConstraints);

        plInternet.setLayout(new java.awt.BorderLayout());

        lblInternetT.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblInternetT.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInternetT.setText("INTERNET");
        plInternet.add(lblInternetT, java.awt.BorderLayout.PAGE_END);

        lblInternet.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblInternet.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInternet.setText("Ilimitado");
        plInternet.add(lblInternet, java.awt.BorderLayout.PAGE_START);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(21, 29, 21, 29);
        plBeneficiosPlan.add(plInternet, gridBagConstraints);

        plRPC.setLayout(new java.awt.BorderLayout());

        lblRPCT.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblRPCT.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRPCT.setText("RPC");
        plRPC.add(lblRPCT, java.awt.BorderLayout.CENTER);

        lblRPC.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblRPC.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRPC.setText("Ilimitado");
        plRPC.add(lblRPC, java.awt.BorderLayout.PAGE_START);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(21, 29, 21, 29);
        plBeneficiosPlan.add(plRPC, gridBagConstraints);

        plSMS.setLayout(new java.awt.BorderLayout());

        lblSMST.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblSMST.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSMST.setText("SMS");
        plSMS.add(lblSMST, java.awt.BorderLayout.CENTER);

        lblSMS.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblSMS.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSMS.setText("Ilimitado");
        plSMS.add(lblSMS, java.awt.BorderLayout.PAGE_START);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(21, 29, 21, 29);
        plBeneficiosPlan.add(plSMS, gridBagConstraints);

        jLabel3.setText("Precio:");

        jLabel4.setText("S/.2700");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pblEquiposMovilles, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTEquiposMoviles))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(154, 154, 154)
                                        .addComponent(jLabel2))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(spPlanesPostpago, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(149, 149, 149)
                                                .addComponent(jLabel3)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabel4)))
                                        .addGap(30, 30, 30)
                                        .addComponent(plBeneficiosPlan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(plCaracteristicas, javax.swing.GroupLayout.PREFERRED_SIZE, 790, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(204, 204, 204)
                                .addComponent(lblDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 436, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addComponent(lblTEquiposMoviles)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pblEquiposMovilles, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(plCaracteristicas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(337, 337, 337))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(plBeneficiosPlan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(spPlanesPostpago, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(40, 40, 40)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel4))))
                                .addGap(117, 117, 117))))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        
        //
        DefaultListModel<String> listaEquiposClaroModel = new DefaultListModel<String>();                
        for (TelefonoMovil telefonoMovil : ListaTelefonosMoviles) {
            listaEquiposClaroModel.addElement(telefonoMovil.getDescripcion());
        }                                
        lstEquiposMoviles.setModel(listaEquiposClaroModel);                
        
        //
        ArrayList<String> listaPlanesString = new ArrayList<String>();        
        for (PlanPostPago planPostPago : ListaPlanesPostPago) {
            listaPlanesString.add(planPostPago.getNombrePlan());
        }
        spPlanesPostpago.setModel(new SpinnerListModel(listaPlanesString));           
        
    }//GEN-LAST:event_formWindowOpened

    private void lstEquiposMovilesValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstEquiposMovilesValueChanged
        
        if (!evt.getValueIsAdjusting()) {
            int indiceSeleccionado = lstEquiposMoviles.getSelectedIndex();
            if (indiceSeleccionado != -1) {
                
                TelefonoMovil telMovSel = ListaTelefonosMoviles.get(indiceSeleccionado);                
                
                String descripcion = telMovSel.getDescripcion();
                String pantalla = telMovSel.getPantalla();
                String camara = telMovSel.getCamara();
                String procesador = telMovSel.getProcesador();
                
                lblDescripcion.setText(descripcion);
                lblPantalla.setText(pantalla);
                lblCamara.setText(camara);
                lblProcesador.setText(procesador);
                        
            }
        }
        

//        
//        if (!evt.getValueIsAdjusting()) {
//            if (btnClaro.isSelected()) {                
//                switch (lstEquiposMoviles.getSelectedIndex()) {
//                    case 0:
//                        System.out.println("CLARO 0");
//                        lblPantalla.setText("4.3\"");
//                        lblCamara.setText("6MP");
//                        lblProcesador.setText("1.3GHz");       
//                        lblDescripcion.setText("Galaxy S7 (Claro)");
//                        break;
//                    case 1:
//                        System.out.println("CLARO 1");
//                        lblPantalla.setText("6.2\"");
//                        lblCamara.setText("8MP");
//                        lblProcesador.setText("2.3GHz");                                                
//                        lblDescripcion.setText("iPhone 7 (Claro)");
//                        break;
//                    case 2:
//                        System.out.println("CLARO 2");
//                        lblPantalla.setText("7.3\"");
//                        lblCamara.setText("10MP");
//                        lblProcesador.setText("2.7GHz");                                                
//                        lblDescripcion.setText("LG k8 (Claro)");
//                        break;                    
//                }
//            }
//            else if (btnMovistar.isSelected())
//            {
//                switch (lstEquiposMoviles.getSelectedIndex()) {
//                    case 0:
//                        System.out.println("MOVISTAR 0");
//                        lblPantalla.setText("6.3\"");
//                        lblCamara.setText("5MP");
//                        lblProcesador.setText("1.7GHz");                                                
//                        lblDescripcion.setText("Galaxy S7 (Movistar)");
//                        break;
//                    case 1:
//                        System.out.println("MOVISTAR 1");
//                        lblPantalla.setText("4.3\"");
//                        lblCamara.setText("4MP");
//                        lblProcesador.setText("2.2GHz");                                                
//                        lblDescripcion.setText("iPhone 7 (Movistar)");
//                        break;
//                    case 2:
//                        System.out.println("MOVISTAR 2");
//                        lblPantalla.setText("5.1\"");
//                        lblCamara.setText("7MP");
//                        lblProcesador.setText("1.2GHz");          
//                        lblDescripcion.setText("LG k8 (Movistar)");
//                        break;                    
//                }
//            }
//        }
        
        
    }//GEN-LAST:event_lstEquiposMovilesValueChanged

    private void spPlanesPostpagoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spPlanesPostpagoStateChanged
                
        String planSeleccionado = String.valueOf(spPlanesPostpago.getValue());        
        
        for (PlanPostPago planPostPago : ListaPlanesPostPago) {
            if (planPostPago.getNombrePlan().equals(planSeleccionado)) {
                lblMinutos.setText(planPostPago.getMinutos());
                lblInternet.setText(planPostPago.getInternet());
                lblRPC.setText(planPostPago.getRpc());                
                lblSMS.setText(planPostPago.getSms());                        
            }
        }
        
                
        
    }//GEN-LAST:event_spPlanesPostpagoStateChanged

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
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblCamara;
    private javax.swing.JLabel lblCamaraImg;
    private javax.swing.JLabel lblDescripcion;
    private javax.swing.JLabel lblInternet;
    private javax.swing.JLabel lblInternetT;
    private javax.swing.JLabel lblMinutos;
    private javax.swing.JLabel lblMinutosT;
    private javax.swing.JLabel lblPantalla;
    private javax.swing.JLabel lblPantallaImg;
    private javax.swing.JLabel lblProcesador;
    private javax.swing.JLabel lblProcesadorImg;
    private javax.swing.JLabel lblRPC;
    private javax.swing.JLabel lblRPCT;
    private javax.swing.JLabel lblSMS;
    private javax.swing.JLabel lblSMST;
    private javax.swing.JLabel lblTCamara;
    private javax.swing.JLabel lblTEquiposMoviles;
    private javax.swing.JLabel lblTPantalla;
    private javax.swing.JLabel lblTProcesador;
    private javax.swing.JList lstEquiposMoviles;
    private javax.swing.JScrollPane pblEquiposMovilles;
    private javax.swing.JPanel plBeneficiosPlan;
    private javax.swing.JPanel plCamara;
    private javax.swing.JPanel plCaracteristicas;
    private javax.swing.JPanel plInternet;
    private javax.swing.JPanel plMinutos;
    private javax.swing.JPanel plPantalla;
    private javax.swing.JPanel plProcesador;
    private javax.swing.JPanel plRPC;
    private javax.swing.JPanel plSMS;
    private javax.swing.JSpinner spPlanesPostpago;
    // End of variables declaration//GEN-END:variables

    
}
