package CapStone2;

import javax.swing.*;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
public class Graphics extends javax.swing.JFrame {
    public Graphics() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    public void initComponents() {
        javax.swing.JLabel gallows;
        javax.swing.JLabel liveMan;
        javax.swing.JLabel manDead;
        javax.swing.JLabel singleNoose;
        javax.swing.JLabel stoolAllOver;
        javax.swing.JLabel stoolTippedSide;
        javax.swing.JLabel uprightStool;

        manDead = new javax.swing.JLabel();
        stoolTippedSide = new javax.swing.JLabel();
        stoolAllOver = new javax.swing.JLabel();
        singleNoose = new javax.swing.JLabel();
        liveMan = new javax.swing.JLabel();
        uprightStool = new javax.swing.JLabel();
        gallows = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);


            manDead.setIcon(new javax.swing.ImageIcon(getClass().getResource("/src/images/aaaaadeadman.png"))); // NOI18N
            manDead.setText("manDead");
            manDead.addComponentListener(new java.awt.event.ComponentAdapter() {
                public void componentHidden(java.awt.event.ComponentEvent evt) {
                    manDeadComponentHidden(evt);
                }
                private void manDeadComponentHidden(ComponentEvent evt) {
                    manDead.setVisible(false);
                    if (Hangman.MAXERRORS == 0) {
                        manDead.setVisible(true);
                        liveMan.setVisible(false);
                    }
                }
            });
            getContentPane().add(manDead);
            manDead.setBounds(210, 130, 130, 290);

            stoolTippedSide.setIcon(new javax.swing.ImageIcon(getClass().getResource("/src/images/smallstool2.png"))); // NOI18N
            stoolTippedSide.setText("stoolTippedSide");
            stoolTippedSide.addComponentListener(new java.awt.event.ComponentAdapter() {
                public void componentHidden(java.awt.event.ComponentEvent evt) {
                    stoolTippedSideComponentHidden(evt);
                }

                private void stoolTippedSideComponentHidden(ComponentEvent evt) {
                    stoolTippedSide.setVisible(false);
                    if (Hangman.MAXERRORS == 1) {
                        stoolTippedSide.setVisible(true);
                        uprightStool.setVisible(false);
                    }
                }
            });
                getContentPane().add(stoolTippedSide);
                stoolTippedSide.setBounds(230, 360, 130, 120);

                stoolAllOver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/src/images/smallstool3.png"))); // NOI18N
                stoolAllOver.setText("stoolover");
                stoolAllOver.addComponentListener(new java.awt.event.ComponentAdapter() {
                    public void componentHidden(java.awt.event.ComponentEvent evt) {
                        stoolAllOverComponentHidden(evt);
                    }
                    private void stoolAllOverComponentHidden(ComponentEvent evt) {
                        stoolAllOver.setVisible(false);
                        if (Hangman.MAXERRORS == 2) {
                            stoolAllOver.setVisible(true);
                            stoolTippedSide.setVisible(false);
                        }
                    }
                });
                    getContentPane().add(stoolAllOver);
                    stoolAllOver.setBounds(320, 360, 100, 100);


                    singleNoose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/src/images/aanoose.png"))); // NOI18N
                    singleNoose.setText("noose");
                    singleNoose.addComponentListener(new java.awt.event.ComponentAdapter() {
                        public void componentHidden(java.awt.event.ComponentEvent evt) {
                            singleNooseComponentHidden(evt);
                        }
                         private void singleNooseComponentHidden(ComponentEvent evt) {
                            singleNoose.setVisible(false);
                            if (Hangman.MAXERRORS == 3) {
                                singleNoose.setVisible(true);
                            }
                        }
                    });
                    getContentPane().add(singleNoose);
                    singleNoose.setBounds(260, 40, 50, 210);

                    liveMan.setIcon(new javax.swing.ImageIcon(getClass().getResource("//src/images//images/aaman.png"))); // NOI18N
                    liveMan.setText("man");
                    liveMan.addComponentListener(new java.awt.event.ComponentAdapter() {
                        public void componentHidden(java.awt.event.ComponentEvent evt) {
                            liveManComponentHidden(evt);
                        }
                        private void liveManComponentHidden(ComponentEvent evt) {
                            liveMan.setVisible(false);
                            if (Hangman.MAXERRORS == 4) {
                                liveMan.setVisible(true);
                            }
                        }
                    });
                    getContentPane().add(liveMan);
                    liveMan.setBounds(240, 150, 100, 260);

                    uprightStool.setIcon(new javax.swing.ImageIcon(getClass().getResource("/src/images//smallstool1.png"))); // NOI18N
                    uprightStool.setText("stool");
                    uprightStool.addComponentListener(new java.awt.event.ComponentAdapter() {
                        public void componentHidden(java.awt.event.ComponentEvent evt) {
                            uprightStoolComponentHidden(evt);
                        }

                        private void uprightStoolComponentHidden(ComponentEvent evt) {
                            uprightStool.setVisible(false);
                            if (Hangman.MAXERRORS == 5) {
                                uprightStool.setVisible(true);
                            }
                        }
                    });
                    getContentPane().add(uprightStool);
                    uprightStool.setBounds(240, 380, 80, 80);


                    gallows.setIcon(new javax.swing.ImageIcon(getClass().getResource("/src/images/aagallows.png"))); // NOI18N
                    gallows.setText("Gallows");
                    gallows.addComponentListener(new java.awt.event.ComponentAdapter() {
                        public void componentHidden(java.awt.event.ComponentEvent evt) {
                            gallowsComponentHidden(evt);
                        }
                        private void gallowsComponentHidden(ComponentEvent evt) {
                            gallows.setVisible(true);
                        }
                    });
                    getContentPane().add(gallows);
                    gallows.setBounds(60, 10, 480, 470);

                    pack();
                }
            }