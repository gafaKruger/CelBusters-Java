/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.Controller;
import spiceblock.CellBusters;
import Model.BMP;
import java.awt.Dimension;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @Autores: Samuel Blum Vorpagel - Rafael Fiori Kruger
 */
public class PainelPrincipal extends javax.swing.JFrame {

    private BMP b, aux, aux2;
    private boolean OPLogicasaberto, LimiarAberto;
    private OPLogicasControlador opl;
    private Controller control;

    public PainelPrincipal(Controller C) {
        initComponents();
        OPLogicasaberto = false;
        LimiarAberto = false;
        botaoSalvar.setEnabled(false);
    }

    public void resetBMP(BMP bmp) {
        this.b = bmp;
        initComponents();
        LimiarAberto = false;
        OPLogicasaberto = false;
    }

    private imagemPanel getImagemPanel1() {
        return imagemPanel1;
    }

    private void setImagemPanel1(imagemPanel img) {
        this.imagemPanel1 = img;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        imagemPanel1 = new View.imagemPanel();
        botaoInverter = new javax.swing.JButton();
        botaoSalvar = new javax.swing.JButton();
        botaoTonsCinza = new javax.swing.JButton();
        botao24Para8 = new javax.swing.JButton();
        botaoAbrir = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        botaoLimiarizacao = new javax.swing.JButton();
        botaoPassaAlta = new javax.swing.JButton();
        botaoOpLogicas = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        botaoSegmentacao = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CellBuster");
        setBackground(new java.awt.Color(255, 255, 255));

        jScrollPane1.setBorder(javax.swing.BorderFactory.createTitledBorder("Imagem"));

        javax.swing.GroupLayout imagemPanel1Layout = new javax.swing.GroupLayout(imagemPanel1);
        imagemPanel1.setLayout(imagemPanel1Layout);
        imagemPanel1Layout.setHorizontalGroup(
            imagemPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 726, Short.MAX_VALUE)
        );
        imagemPanel1Layout.setVerticalGroup(
            imagemPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 464, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(imagemPanel1);

        botaoInverter.setText("Negativo");
        botaoInverter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoInverterActionPerformed(evt);
            }
        });

        botaoSalvar.setText("Salvar");
        botaoSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSalvarActionPerformed(evt);
            }
        });

        botaoTonsCinza.setText("Tons de Cinza");
        botaoTonsCinza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoTonsCinzaActionPerformed(evt);
            }
        });

        botao24Para8.setText("24 para 8");
        botao24Para8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao24Para8ActionPerformed(evt);
            }
        });

        botaoAbrir.setText("Abrir");
        botaoAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAbrirActionPerformed(evt);
            }
        });

        botaoLimiarizacao.setText("Limiarização");
        botaoLimiarizacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoLimiarizacaoActionPerformed(evt);
            }
        });

        botaoPassaAlta.setText("Passa-Alta");
        botaoPassaAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoPassaAltaActionPerformed(evt);
            }
        });

        botaoOpLogicas.setText("Operações Lógicas");
        botaoOpLogicas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoOpLogicasActionPerformed(evt);
            }
        });

        botaoSegmentacao.setText("Segmentação");
        botaoSegmentacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSegmentacaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(botaoInverter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botaoSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botaoTonsCinza, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botao24Para8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botaoAbrir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator1)
                    .addComponent(botaoLimiarizacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botaoPassaAlta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botaoOpLogicas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator2)
                    .addComponent(botaoSegmentacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 745, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 449, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(botaoAbrir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botaoSalvar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botaoTonsCinza)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botaoInverter)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botao24Para8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botaoLimiarizacao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botaoPassaAlta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botaoOpLogicas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botaoSegmentacao)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botaoInverterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoInverterActionPerformed
        if (b != null) {
            this.b.getMp().imgNegativa();
            this.getImagemPanel1().setImagem(b);
            this.getImagemPanel1().reset();
            this.getImagemPanel1().update();
        } else {
            JOptionPane.showMessageDialog(rootPane, "Nenhuma imagem aberta!", null, JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_botaoInverterActionPerformed

    private void botaoSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSalvarActionPerformed
        JFileChooser arquivo = new JFileChooser();
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("*.BMP", "bmp");
        arquivo.setFileFilter(filtro);
        int retorno = arquivo.showSaveDialog(null);
        if (retorno == arquivo.APPROVE_OPTION) {
            try {
                File f = arquivo.getSelectedFile();
                RandomAccessFile rf = new RandomAccessFile(f, "rw");
                rf.write(this.b.save());
                rf.close();
            } catch (IOException ex) {
                Logger.getLogger(PainelPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_botaoSalvarActionPerformed

    private void botaoTonsCinzaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoTonsCinzaActionPerformed
        if (b != null) {
            this.b.getMp().grayScale();
            this.getImagemPanel1().setImagem(b);
            this.getImagemPanel1().reset();
            this.getImagemPanel1().update();
        } else {
            JOptionPane.showMessageDialog(rootPane, "Nenhuma imagem aberta!", null, JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_botaoTonsCinzaActionPerformed

    private void botao24Para8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao24Para8ActionPerformed
        if (b != null) {
            BMP bt = new BMP(this.b.convert24to8(b));
            b = bt;
            this.getImagemPanel1().setImagem(b);
            this.getImagemPanel1().reset();
            this.getImagemPanel1().update();
        } else {
            JOptionPane.showMessageDialog(rootPane, "Nenhuma imagem aberta!", null, JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_botao24Para8ActionPerformed

    public void do24to8() {
        BMP bt = new BMP(this.b.convert24to8(b));
        b = bt;
    }

    private void botaoAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAbrirActionPerformed
        JFileChooser arquivo = new JFileChooser();
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("*.BMP", "bmp");
        arquivo.setFileFilter(filtro);
        int retorno = arquivo.showOpenDialog(null);
        if (retorno == arquivo.APPROVE_OPTION) {
            String nomeImg;
            try {
                File f = arquivo.getSelectedFile();
                RandomAccessFile rf = new RandomAccessFile(f, "r");
                byte[] b = new byte[(int) rf.length()];
                rf.read(b);
                rf.close();
                this.b = new BMP(b);
                this.aux = new BMP(b.clone());
                this.aux2 = new BMP(b.clone());
            } catch (IOException ex) {
                Logger.getLogger(CellBusters.class.getName()).log(Level.SEVERE, null, ex);
            }
            nomeImg = arquivo.getSelectedFile().getName();
            this.getImagemPanel1().setImagem(this.b);
            this.getImagemPanel1().reset();
            this.getImagemPanel1().update();
            this.setTitle("CellBuster - " + nomeImg);
            botaoSalvar.setEnabled(true);
        }
    }//GEN-LAST:event_botaoAbrirActionPerformed

    private void botaoSegmentacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSegmentacaoActionPerformed
        if (b != null) {
            this.aux.getMp().preProceso();
            this.aux.getMp().fechamento(5);
            this.aux.getMp().abertura(1);
            this.aux.getMp().fechamento(5);
            this.aux.getMp().abertura(1);

            this.aux2.getMp().preProceso();
            this.aux2.getMp().fechamento(5);
            this.aux2.getMp().abertura(1);
            this.aux2.getMp().fechamento(5);
            this.aux2.getMp().abertura(1);
            this.aux2.getMp().erosao();
            this.aux2.getMp().erosao();
            this.aux2.getMp().opXOR(aux.getMp());
            this.aux2.getMp().opOR(b.getMp());

            this.aux.getMp().opOR(b.getMp());
            this.aux.getMp().opXOR(aux2.getMp());
            JanelaImgs mascara = new JanelaImgs(aux);
            JanelaImgs combinacao = new JanelaImgs(aux2);
            mascara.getImagem().setImagem(aux);
            mascara.getImagem().reset();
            mascara.getImagem().update();
            combinacao.getImagem().setImagem(aux2);
            combinacao.getImagem().reset();
            combinacao.getImagem().update();
            mascara.setTitle("Visualização: Máscara");
            mascara.setVisible(true);
            combinacao.setTitle("Visualização: Combinação");
            combinacao.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(rootPane, "Nenhuma imagem aberta!", null, JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_botaoSegmentacaoActionPerformed

    public void setOPLogicasAberto() {
        if (OPLogicasaberto) {
            OPLogicasaberto = false;
        } else {
            OPLogicasaberto = true;
        }
    }

    private void botaoOpLogicasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoOpLogicasActionPerformed
        if (!OPLogicasaberto) {
            opl = new OPLogicasControlador(this);
            opl.setVisible(true);
            OPLogicasaberto = true;
        }
    }//GEN-LAST:event_botaoOpLogicasActionPerformed

    public void setLimiarAberto() {
        if (LimiarAberto) {
            LimiarAberto = false;
        } else {
            LimiarAberto = true;
        }
    }

    public void fazerLimiarizacao(int type, int _lim) {
        getImagemPanel1().getImagem().getMp().Limiarizar(type, _lim);
    }

    private void botaoLimiarizacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoLimiarizacaoActionPerformed
        if (imagemPanel1.getImagem() != null) {
            SetLimiar lm = new SetLimiar(this);
            lm.setVisible(true);
            LimiarAberto = true;
        } else {
            JOptionPane.showMessageDialog(rootPane, "Nenhuma imagem aberta!", null, JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_botaoLimiarizacaoActionPerformed

    private void botaoPassaAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoPassaAltaActionPerformed
        if (b != null) {
            this.getImagemPanel1().getImagem().getMp().sobel();
            AtualizaImagem();
        } else {
            JOptionPane.showMessageDialog(rootPane, "Nenhuma imagem aberta!", null, JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_botaoPassaAltaActionPerformed

    void AtualizaImagem() {
        this.getImagemPanel1().setImagem(this.b);
        this.getImagemPanel1().reset();
        this.getImagemPanel1().update();
    }

    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botao24Para8;
    private javax.swing.JButton botaoAbrir;
    private javax.swing.JButton botaoInverter;
    private javax.swing.JButton botaoLimiarizacao;
    private javax.swing.JButton botaoOpLogicas;
    private javax.swing.JButton botaoPassaAlta;
    private javax.swing.JButton botaoSalvar;
    private javax.swing.JButton botaoSegmentacao;
    private javax.swing.JButton botaoTonsCinza;
    private View.imagemPanel imagemPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables

}