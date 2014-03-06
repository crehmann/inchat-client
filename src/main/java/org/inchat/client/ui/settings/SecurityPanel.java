/*
 * Copyright (C) 2013, 2014 inchat.org
 *
 * This file is part of inchat-client.
 *
 * inchat-client is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * inchat-client is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.inchat.client.ui.settings;

/**
 * Shows the contents of the Security tab in the {@link SettingsWindow}.
 */
public class SecurityPanel extends javax.swing.JPanel {

    private static final long serialVersionUID = 1L;

    public SecurityPanel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        masterPasswordLabel = new javax.swing.JLabel();
        askForPasswordRadioButton = new javax.swing.JRadioButton();
        keyRingRadioButton = new javax.swing.JRadioButton();
        storeUnencryptedRadioButton = new javax.swing.JRadioButton();

        masterPasswordLabel.setFont(new java.awt.Font("Ubuntu", 1, 13)); // NOI18N
        masterPasswordLabel.setText("Master Password");

        askForPasswordRadioButton.setText("Ask for the password at the application start");
        askForPasswordRadioButton.setEnabled(false);

        keyRingRadioButton.setText("Use system key ring");
        keyRingRadioButton.setEnabled(false);

        storeUnencryptedRadioButton.setSelected(true);
        storeUnencryptedRadioButton.setText("Store password unencrypted on this device");
        storeUnencryptedRadioButton.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(masterPasswordLabel)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(askForPasswordRadioButton)
                    .addComponent(keyRingRadioButton)
                    .addComponent(storeUnencryptedRadioButton))
                .addContainerGap(87, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(masterPasswordLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(askForPasswordRadioButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(keyRingRadioButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(storeUnencryptedRadioButton)
                .addGap(0, 188, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton askForPasswordRadioButton;
    private javax.swing.JRadioButton keyRingRadioButton;
    private javax.swing.JLabel masterPasswordLabel;
    private javax.swing.JRadioButton storeUnencryptedRadioButton;
    // End of variables declaration//GEN-END:variables
}
