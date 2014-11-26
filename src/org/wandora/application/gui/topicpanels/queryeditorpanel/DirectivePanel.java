/*
 * WANDORA
 * Knowledge Extraction, Management, and Publishing Application
 * http://wandora.org
 * 
 * Copyright (C) 2004-2014 Wandora Team
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 * 
 */

package org.wandora.application.gui.topicpanels.queryeditorpanel;

import org.wandora.query2.DirectiveUIHints;

/**
 *
 * @author olli
 */


public class DirectivePanel extends javax.swing.JPanel {

    /**
     * Creates new form DirectivePanel
     */
    public DirectivePanel() {
        initComponents();
    }

    public DirectivePanel(DirectiveUIHints hints){
        this();
        setDirective(hints);
    }
    
    public void setDirective(DirectiveUIHints hints){
        this.directiveLabel.setText(hints.getLabel());
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

        directiveLabel = new javax.swing.JLabel();
        constructorComboBox = new javax.swing.JComboBox();
        constructorParametersScroll = new javax.swing.JScrollPane();
        constructorParameters = new javax.swing.JPanel();
        addAddonButton = new javax.swing.JButton();
        addonComboBox = new javax.swing.JComboBox();
        addonPanel = new javax.swing.JPanel();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        setLayout(new java.awt.GridBagLayout());

        directiveLabel.setText("Directive label");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        add(directiveLabel, gridBagConstraints);

        constructorComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                constructorComboBoxActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        add(constructorComboBox, gridBagConstraints);

        constructorParameters.setLayout(new java.awt.GridBagLayout());
        constructorParametersScroll.setViewportView(constructorParameters);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        add(constructorParametersScroll, gridBagConstraints);

        addAddonButton.setText("Add addon");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        add(addAddonButton, gridBagConstraints);

        addonComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addonComboBoxActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        add(addonComboBox, gridBagConstraints);

        addonPanel.setLayout(new java.awt.GridBagLayout());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        add(addonPanel, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void constructorComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_constructorComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_constructorComboBoxActionPerformed

    private void addonComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addonComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addonComboBoxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addAddonButton;
    private javax.swing.JComboBox addonComboBox;
    private javax.swing.JPanel addonPanel;
    private javax.swing.JComboBox constructorComboBox;
    private javax.swing.JPanel constructorParameters;
    private javax.swing.JScrollPane constructorParametersScroll;
    private javax.swing.JLabel directiveLabel;
    // End of variables declaration//GEN-END:variables
}