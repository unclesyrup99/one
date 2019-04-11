/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lightshow;

import java.util.ArrayList;
import javax.swing.*;

/**
 *
 * @author clatulip
 */
public class LightFrame extends javax.swing.JFrame {

    // ArrayList to store the nine light panels
    private ArrayList<JPanel> panels = new ArrayList<>();
    
    /**
     * Creates new GUI form LightFrame
     */
    public LightFrame() {
        initComponents();
        createPanelArray();
    }

    private void createPanelArray() {
        // add each panel to the ArrayList
        panels.add(TopLeftPanel);
        panels.add(TopCenterPanel);
        panels.add(TopRightPanel);
        panels.add(RightMiddlePanel);
        panels.add(BottomRightPanel);
        panels.add(BottomMiddlePanel);
        panels.add(BottomLeftPanel);
        panels.add(LeftMiddlePanel);
        panels.add(CenterPanel);
    }
    
    /**
     * Returns the panel at index in the list of panels
     * @param index int
     * @return the specified JPanel
     */
    public JPanel getPanel(int index) {
        // return a panel, so it's color can be changed
        // make sure index is within bounds
        if (index > panels.size()) return null;
        
        return panels.get(index);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        BeatlesPicLabel = new javax.swing.JLabel();
        TopLeftPanel = new javax.swing.JPanel();
        TopCenterPanel = new javax.swing.JPanel();
        TopRightPanel = new javax.swing.JPanel();
        RightMiddlePanel = new javax.swing.JPanel();
        BottomRightPanel = new javax.swing.JPanel();
        BottomMiddlePanel = new javax.swing.JPanel();
        BottomLeftPanel = new javax.swing.JPanel();
        LeftMiddlePanel = new javax.swing.JPanel();
        CenterPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLayeredPane1.setOpaque(true);

        BeatlesPicLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lightshow/beatles_outline.png"))); // NOI18N

        TopLeftPanel.setBackground(new java.awt.Color(0, 153, 153));

        javax.swing.GroupLayout TopLeftPanelLayout = new javax.swing.GroupLayout(TopLeftPanel);
        TopLeftPanel.setLayout(TopLeftPanelLayout);
        TopLeftPanelLayout.setHorizontalGroup(
            TopLeftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        TopLeftPanelLayout.setVerticalGroup(
            TopLeftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        TopCenterPanel.setBackground(new java.awt.Color(255, 0, 255));

        javax.swing.GroupLayout TopCenterPanelLayout = new javax.swing.GroupLayout(TopCenterPanel);
        TopCenterPanel.setLayout(TopCenterPanelLayout);
        TopCenterPanelLayout.setHorizontalGroup(
            TopCenterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        TopCenterPanelLayout.setVerticalGroup(
            TopCenterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        TopRightPanel.setBackground(new java.awt.Color(102, 102, 255));

        javax.swing.GroupLayout TopRightPanelLayout = new javax.swing.GroupLayout(TopRightPanel);
        TopRightPanel.setLayout(TopRightPanelLayout);
        TopRightPanelLayout.setHorizontalGroup(
            TopRightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        TopRightPanelLayout.setVerticalGroup(
            TopRightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        RightMiddlePanel.setBackground(new java.awt.Color(255, 153, 0));

        javax.swing.GroupLayout RightMiddlePanelLayout = new javax.swing.GroupLayout(RightMiddlePanel);
        RightMiddlePanel.setLayout(RightMiddlePanelLayout);
        RightMiddlePanelLayout.setHorizontalGroup(
            RightMiddlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        RightMiddlePanelLayout.setVerticalGroup(
            RightMiddlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        BottomRightPanel.setBackground(new java.awt.Color(0, 204, 204));

        javax.swing.GroupLayout BottomRightPanelLayout = new javax.swing.GroupLayout(BottomRightPanel);
        BottomRightPanel.setLayout(BottomRightPanelLayout);
        BottomRightPanelLayout.setHorizontalGroup(
            BottomRightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        BottomRightPanelLayout.setVerticalGroup(
            BottomRightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        BottomMiddlePanel.setBackground(new java.awt.Color(255, 102, 102));

        javax.swing.GroupLayout BottomMiddlePanelLayout = new javax.swing.GroupLayout(BottomMiddlePanel);
        BottomMiddlePanel.setLayout(BottomMiddlePanelLayout);
        BottomMiddlePanelLayout.setHorizontalGroup(
            BottomMiddlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        BottomMiddlePanelLayout.setVerticalGroup(
            BottomMiddlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        BottomLeftPanel.setBackground(new java.awt.Color(153, 255, 153));

        javax.swing.GroupLayout BottomLeftPanelLayout = new javax.swing.GroupLayout(BottomLeftPanel);
        BottomLeftPanel.setLayout(BottomLeftPanelLayout);
        BottomLeftPanelLayout.setHorizontalGroup(
            BottomLeftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        BottomLeftPanelLayout.setVerticalGroup(
            BottomLeftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        LeftMiddlePanel.setBackground(new java.awt.Color(51, 0, 255));

        javax.swing.GroupLayout LeftMiddlePanelLayout = new javax.swing.GroupLayout(LeftMiddlePanel);
        LeftMiddlePanel.setLayout(LeftMiddlePanelLayout);
        LeftMiddlePanelLayout.setHorizontalGroup(
            LeftMiddlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        LeftMiddlePanelLayout.setVerticalGroup(
            LeftMiddlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        CenterPanel.setBackground(new java.awt.Color(255, 255, 153));

        javax.swing.GroupLayout CenterPanelLayout = new javax.swing.GroupLayout(CenterPanel);
        CenterPanel.setLayout(CenterPanelLayout);
        CenterPanelLayout.setHorizontalGroup(
            CenterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        CenterPanelLayout.setVerticalGroup(
            CenterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LeftMiddlePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BottomLeftPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TopLeftPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TopCenterPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CenterPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BottomMiddlePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BottomRightPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RightMiddlePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TopRightPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(BeatlesPicLabel)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TopCenterPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TopRightPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TopLeftPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LeftMiddlePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RightMiddlePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CenterPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BottomRightPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BottomMiddlePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BottomLeftPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(7, Short.MAX_VALUE))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(BeatlesPicLabel)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jLayeredPane1.setLayer(BeatlesPicLabel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(TopLeftPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(TopCenterPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(TopRightPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(RightMiddlePanel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(BottomRightPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(BottomMiddlePanel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(BottomLeftPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(LeftMiddlePanel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(CenterPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BeatlesPicLabel;
    private javax.swing.JPanel BottomLeftPanel;
    private javax.swing.JPanel BottomMiddlePanel;
    private javax.swing.JPanel BottomRightPanel;
    private javax.swing.JPanel CenterPanel;
    private javax.swing.JPanel LeftMiddlePanel;
    private javax.swing.JPanel RightMiddlePanel;
    private javax.swing.JPanel TopCenterPanel;
    private javax.swing.JPanel TopLeftPanel;
    private javax.swing.JPanel TopRightPanel;
    private javax.swing.JLayeredPane jLayeredPane1;
    // End of variables declaration//GEN-END:variables
}
