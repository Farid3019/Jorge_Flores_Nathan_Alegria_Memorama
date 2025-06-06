/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package jorge_flores_nathan_alegria_memorama;

import Logic.Logic;

import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.plaf.OptionPaneUI;
/**
 *
 * @author jfflo
 */
public class Memorama extends javax.swing.JFrame {
    private boolean caraUp = false;
    private Logic log = new Logic();
    private int puntaje = 0;
    private boolean primerc = false;
    private ImageIcon im1;
    private ImageIcon im2;
    private JButton[] pbtn = new JButton[2];
    
    
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Memorama.class.getName());

    /**
     * Creates new form Memorama
     */
    public Memorama() {
        initComponents();
     
        setCartas();
    }
    private void setCartas(){
        int[]numeros = log.getNumeroCartas();
        
        btnA1.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes_cartas/c"+numeros[0]+".png")));
        btnA2.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes_cartas/c"+numeros[1]+".png")));
        btnA3.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes_cartas/c"+numeros[2]+".png")));
        btnA4.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes_cartas/c"+numeros[3]+".png")));
        btnA5.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes_cartas/c"+numeros[4]+".png")));
        btnA6.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes_cartas/c"+numeros[5]+".png")));
        btnA7.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes_cartas/c"+numeros[6]+".png")));
        btnA8.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes_cartas/c"+numeros[7]+".png")));
        btnA9.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes_cartas/c"+numeros[8]+".png")));
        btnA10.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes_cartas/c"+numeros[9]+".png")));
        btnA11.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes_cartas/c"+numeros[10]+".png")));
        btnA12.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes_cartas/c"+numeros[11]+".png")));
        btnA13.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes_cartas/c"+numeros[12]+".png")));
        btnA14.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes_cartas/c"+numeros[13]+".png")));
        btnA15.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes_cartas/c"+numeros[14]+".png")));
        btnA16.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes_cartas/c"+numeros[15]+".png")));
        btnA17.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes_cartas/c"+numeros[16]+".png")));
        btnA18.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes_cartas/c"+numeros[17]+".png")));
        btnA19.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes_cartas/c"+numeros[18]+".png")));
        btnA20.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes_cartas/c"+numeros[19]+".png")));
        btnA21.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes_cartas/c"+numeros[20]+".png")));
        btnA22.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes_cartas/c"+numeros[21]+".png")));
        btnA23.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes_cartas/c"+numeros[22]+".png")));
        btnA24.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes_cartas/c"+numeros[23]+".png")));
        btnA25.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes_cartas/c"+numeros[24]+".png")));
        btnA26.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes_cartas/c"+numeros[25]+".png")));
        btnA27.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes_cartas/c"+numeros[26]+".png")));
        btnA28.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes_cartas/c"+numeros[27]+".png")));
        btnA29.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes_cartas/c"+numeros[28]+".png")));
        btnA30.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes_cartas/c"+numeros[29]+".png")));
        btnA31.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes_cartas/c"+numeros[30]+".png")));
        btnA32.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes_cartas/c"+numeros[31]+".png")));
        btnA33.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes_cartas/c"+numeros[32]+".png")));
        btnA34.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes_cartas/c"+numeros[33]+".png")));
        btnA35.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes_cartas/c"+numeros[34]+".png")));
        btnA36.setDisabledIcon(new ImageIcon(getClass().getResource("../imagenes_cartas/c"+numeros[35]+".png")));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnA1 = new javax.swing.JButton();
        btnA2 = new javax.swing.JButton();
        btnA3 = new javax.swing.JButton();
        btnA4 = new javax.swing.JButton();
        btnA5 = new javax.swing.JButton();
        btnA6 = new javax.swing.JButton();
        btnA12 = new javax.swing.JButton();
        btnA11 = new javax.swing.JButton();
        btnA10 = new javax.swing.JButton();
        btnA9 = new javax.swing.JButton();
        btnA8 = new javax.swing.JButton();
        btnA7 = new javax.swing.JButton();
        btnA18 = new javax.swing.JButton();
        btnA17 = new javax.swing.JButton();
        btnA16 = new javax.swing.JButton();
        btnA15 = new javax.swing.JButton();
        btnA14 = new javax.swing.JButton();
        btnA13 = new javax.swing.JButton();
        btnA24 = new javax.swing.JButton();
        btnA23 = new javax.swing.JButton();
        btnA22 = new javax.swing.JButton();
        btnA21 = new javax.swing.JButton();
        btnA20 = new javax.swing.JButton();
        btnA19 = new javax.swing.JButton();
        btnA30 = new javax.swing.JButton();
        btnA29 = new javax.swing.JButton();
        btnA28 = new javax.swing.JButton();
        btnA27 = new javax.swing.JButton();
        btnA26 = new javax.swing.JButton();
        btnA25 = new javax.swing.JButton();
        btnA36 = new javax.swing.JButton();
        btnA35 = new javax.swing.JButton();
        btnA34 = new javax.swing.JButton();
        btnA33 = new javax.swing.JButton();
        btnA32 = new javax.swing.JButton();
        btnA31 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Bienvenido");

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnA1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes_cartas/WhatsApp Image 2025-06-06 at 9.38.59 AM.jpeg"))); // NOI18N
        btnA1.setMaximumSize(new java.awt.Dimension(343, 512));
        btnA1.setPreferredSize(new java.awt.Dimension(65, 90));

        btnA2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes_cartas/WhatsApp Image 2025-06-06 at 9.38.59 AM.jpeg"))); // NOI18N
        btnA2.setMaximumSize(new java.awt.Dimension(343, 512));
        btnA2.setPreferredSize(new java.awt.Dimension(65, 90));

        btnA3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes_cartas/WhatsApp Image 2025-06-06 at 9.38.59 AM.jpeg"))); // NOI18N
        btnA3.setMaximumSize(new java.awt.Dimension(343, 512));
        btnA3.setPreferredSize(new java.awt.Dimension(65, 90));

        btnA4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes_cartas/WhatsApp Image 2025-06-06 at 9.38.59 AM.jpeg"))); // NOI18N
        btnA4.setMaximumSize(new java.awt.Dimension(343, 512));
        btnA4.setPreferredSize(new java.awt.Dimension(65, 90));

        btnA5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes_cartas/WhatsApp Image 2025-06-06 at 9.38.59 AM.jpeg"))); // NOI18N
        btnA5.setMaximumSize(new java.awt.Dimension(343, 512));
        btnA5.setPreferredSize(new java.awt.Dimension(65, 90));

        btnA6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes_cartas/WhatsApp Image 2025-06-06 at 9.38.59 AM.jpeg"))); // NOI18N
        btnA6.setMaximumSize(new java.awt.Dimension(343, 512));
        btnA6.setPreferredSize(new java.awt.Dimension(65, 90));

        btnA12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes_cartas/WhatsApp Image 2025-06-06 at 9.38.59 AM.jpeg"))); // NOI18N
        btnA12.setMaximumSize(new java.awt.Dimension(343, 512));
        btnA12.setPreferredSize(new java.awt.Dimension(65, 90));

        btnA11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes_cartas/WhatsApp Image 2025-06-06 at 9.38.59 AM.jpeg"))); // NOI18N
        btnA11.setMaximumSize(new java.awt.Dimension(343, 512));
        btnA11.setPreferredSize(new java.awt.Dimension(65, 90));

        btnA10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes_cartas/WhatsApp Image 2025-06-06 at 9.38.59 AM.jpeg"))); // NOI18N
        btnA10.setMaximumSize(new java.awt.Dimension(343, 512));
        btnA10.setPreferredSize(new java.awt.Dimension(65, 90));

        btnA9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes_cartas/WhatsApp Image 2025-06-06 at 9.38.59 AM.jpeg"))); // NOI18N
        btnA9.setMaximumSize(new java.awt.Dimension(343, 512));
        btnA9.setPreferredSize(new java.awt.Dimension(65, 90));

        btnA8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes_cartas/WhatsApp Image 2025-06-06 at 9.38.59 AM.jpeg"))); // NOI18N
        btnA8.setMaximumSize(new java.awt.Dimension(343, 512));
        btnA8.setPreferredSize(new java.awt.Dimension(65, 90));

        btnA7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes_cartas/WhatsApp Image 2025-06-06 at 9.38.59 AM.jpeg"))); // NOI18N
        btnA7.setMaximumSize(new java.awt.Dimension(343, 512));
        btnA7.setPreferredSize(new java.awt.Dimension(65, 90));

        btnA18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes_cartas/WhatsApp Image 2025-06-06 at 9.38.59 AM.jpeg"))); // NOI18N
        btnA18.setMaximumSize(new java.awt.Dimension(343, 512));
        btnA18.setPreferredSize(new java.awt.Dimension(65, 90));

        btnA17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes_cartas/WhatsApp Image 2025-06-06 at 9.38.59 AM.jpeg"))); // NOI18N
        btnA17.setMaximumSize(new java.awt.Dimension(343, 512));
        btnA17.setPreferredSize(new java.awt.Dimension(65, 90));

        btnA16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes_cartas/WhatsApp Image 2025-06-06 at 9.38.59 AM.jpeg"))); // NOI18N
        btnA16.setMaximumSize(new java.awt.Dimension(343, 512));
        btnA16.setPreferredSize(new java.awt.Dimension(65, 90));

        btnA15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes_cartas/WhatsApp Image 2025-06-06 at 9.38.59 AM.jpeg"))); // NOI18N
        btnA15.setMaximumSize(new java.awt.Dimension(343, 512));
        btnA15.setPreferredSize(new java.awt.Dimension(65, 90));

        btnA14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes_cartas/WhatsApp Image 2025-06-06 at 9.38.59 AM.jpeg"))); // NOI18N
        btnA14.setMaximumSize(new java.awt.Dimension(343, 512));
        btnA14.setPreferredSize(new java.awt.Dimension(65, 90));

        btnA13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes_cartas/WhatsApp Image 2025-06-06 at 9.38.59 AM.jpeg"))); // NOI18N
        btnA13.setMaximumSize(new java.awt.Dimension(343, 512));
        btnA13.setPreferredSize(new java.awt.Dimension(65, 90));

        btnA24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes_cartas/WhatsApp Image 2025-06-06 at 9.38.59 AM.jpeg"))); // NOI18N
        btnA24.setMaximumSize(new java.awt.Dimension(343, 512));
        btnA24.setPreferredSize(new java.awt.Dimension(65, 90));

        btnA23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes_cartas/WhatsApp Image 2025-06-06 at 9.38.59 AM.jpeg"))); // NOI18N
        btnA23.setMaximumSize(new java.awt.Dimension(343, 512));
        btnA23.setPreferredSize(new java.awt.Dimension(65, 90));

        btnA22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes_cartas/WhatsApp Image 2025-06-06 at 9.38.59 AM.jpeg"))); // NOI18N
        btnA22.setMaximumSize(new java.awt.Dimension(343, 512));
        btnA22.setPreferredSize(new java.awt.Dimension(65, 90));

        btnA21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes_cartas/WhatsApp Image 2025-06-06 at 9.38.59 AM.jpeg"))); // NOI18N
        btnA21.setMaximumSize(new java.awt.Dimension(343, 512));
        btnA21.setPreferredSize(new java.awt.Dimension(65, 90));

        btnA20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes_cartas/WhatsApp Image 2025-06-06 at 9.38.59 AM.jpeg"))); // NOI18N
        btnA20.setMaximumSize(new java.awt.Dimension(343, 512));
        btnA20.setPreferredSize(new java.awt.Dimension(65, 90));

        btnA19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes_cartas/WhatsApp Image 2025-06-06 at 9.38.59 AM.jpeg"))); // NOI18N
        btnA19.setMaximumSize(new java.awt.Dimension(343, 512));
        btnA19.setPreferredSize(new java.awt.Dimension(65, 90));

        btnA30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes_cartas/WhatsApp Image 2025-06-06 at 9.38.59 AM.jpeg"))); // NOI18N
        btnA30.setMaximumSize(new java.awt.Dimension(343, 512));
        btnA30.setPreferredSize(new java.awt.Dimension(65, 90));

        btnA29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes_cartas/WhatsApp Image 2025-06-06 at 9.38.59 AM.jpeg"))); // NOI18N
        btnA29.setMaximumSize(new java.awt.Dimension(343, 512));
        btnA29.setPreferredSize(new java.awt.Dimension(65, 90));

        btnA28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes_cartas/WhatsApp Image 2025-06-06 at 9.38.59 AM.jpeg"))); // NOI18N
        btnA28.setMaximumSize(new java.awt.Dimension(343, 512));
        btnA28.setPreferredSize(new java.awt.Dimension(65, 90));

        btnA27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes_cartas/WhatsApp Image 2025-06-06 at 9.38.59 AM.jpeg"))); // NOI18N
        btnA27.setMaximumSize(new java.awt.Dimension(343, 512));
        btnA27.setPreferredSize(new java.awt.Dimension(65, 90));

        btnA26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes_cartas/WhatsApp Image 2025-06-06 at 9.38.59 AM.jpeg"))); // NOI18N
        btnA26.setMaximumSize(new java.awt.Dimension(343, 512));
        btnA26.setPreferredSize(new java.awt.Dimension(65, 90));

        btnA25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes_cartas/WhatsApp Image 2025-06-06 at 9.38.59 AM.jpeg"))); // NOI18N
        btnA25.setMaximumSize(new java.awt.Dimension(343, 512));
        btnA25.setPreferredSize(new java.awt.Dimension(65, 90));

        btnA36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes_cartas/WhatsApp Image 2025-06-06 at 9.38.59 AM.jpeg"))); // NOI18N
        btnA36.setMaximumSize(new java.awt.Dimension(343, 512));
        btnA36.setPreferredSize(new java.awt.Dimension(65, 90));

        btnA35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes_cartas/WhatsApp Image 2025-06-06 at 9.38.59 AM.jpeg"))); // NOI18N
        btnA35.setMaximumSize(new java.awt.Dimension(343, 512));
        btnA35.setPreferredSize(new java.awt.Dimension(65, 90));

        btnA34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes_cartas/WhatsApp Image 2025-06-06 at 9.38.59 AM.jpeg"))); // NOI18N
        btnA34.setMaximumSize(new java.awt.Dimension(343, 512));
        btnA34.setPreferredSize(new java.awt.Dimension(65, 90));

        btnA33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes_cartas/WhatsApp Image 2025-06-06 at 9.38.59 AM.jpeg"))); // NOI18N
        btnA33.setMaximumSize(new java.awt.Dimension(343, 512));
        btnA33.setPreferredSize(new java.awt.Dimension(65, 90));

        btnA32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes_cartas/WhatsApp Image 2025-06-06 at 9.38.59 AM.jpeg"))); // NOI18N
        btnA32.setMaximumSize(new java.awt.Dimension(343, 512));
        btnA32.setPreferredSize(new java.awt.Dimension(65, 90));

        btnA31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes_cartas/WhatsApp Image 2025-06-06 at 9.38.59 AM.jpeg"))); // NOI18N
        btnA31.setMaximumSize(new java.awt.Dimension(343, 512));
        btnA31.setPreferredSize(new java.awt.Dimension(65, 90));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnA25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnA26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnA27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnA28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(btnA29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnA30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(btnA19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnA20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnA21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnA22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnA23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(12, 12, 12)
                            .addComponent(btnA24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(btnA13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnA14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnA15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnA16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnA17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnA18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(btnA1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnA2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnA3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnA4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnA5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnA6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(btnA7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnA8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnA9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnA10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnA11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnA12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnA31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnA32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnA33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnA34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnA35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnA36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 759, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnA1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnA3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnA4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnA5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnA6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnA2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnA8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnA7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnA9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnA10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnA11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnA12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnA14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnA13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnA15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnA16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnA17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnA18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnA20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnA19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnA21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnA22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnA23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnA24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(btnA30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnA29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnA28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnA27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnA26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnA25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnA36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnA35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnA34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnA33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnA32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnA31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(127, Short.MAX_VALUE))
        );

        jLabel2.setText("Intentos");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(246, 246, 246)
                .addComponent(jLabel1)
                .addGap(68, 68, 68)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(675, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new Memorama().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnA1;
    private javax.swing.JButton btnA10;
    private javax.swing.JButton btnA11;
    private javax.swing.JButton btnA12;
    private javax.swing.JButton btnA13;
    private javax.swing.JButton btnA14;
    private javax.swing.JButton btnA15;
    private javax.swing.JButton btnA16;
    private javax.swing.JButton btnA17;
    private javax.swing.JButton btnA18;
    private javax.swing.JButton btnA19;
    private javax.swing.JButton btnA2;
    private javax.swing.JButton btnA20;
    private javax.swing.JButton btnA21;
    private javax.swing.JButton btnA22;
    private javax.swing.JButton btnA23;
    private javax.swing.JButton btnA24;
    private javax.swing.JButton btnA25;
    private javax.swing.JButton btnA26;
    private javax.swing.JButton btnA27;
    private javax.swing.JButton btnA28;
    private javax.swing.JButton btnA29;
    private javax.swing.JButton btnA3;
    private javax.swing.JButton btnA30;
    private javax.swing.JButton btnA31;
    private javax.swing.JButton btnA32;
    private javax.swing.JButton btnA33;
    private javax.swing.JButton btnA34;
    private javax.swing.JButton btnA35;
    private javax.swing.JButton btnA36;
    private javax.swing.JButton btnA4;
    private javax.swing.JButton btnA5;
    private javax.swing.JButton btnA6;
    private javax.swing.JButton btnA7;
    private javax.swing.JButton btnA8;
    private javax.swing.JButton btnA9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
