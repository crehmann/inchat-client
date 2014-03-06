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

import org.inchat.client.App;
import org.inchat.common.Config;

public class IdentityPanel extends javax.swing.JPanel {
    
    private static final long serialVersionUID = 1L;
    
    public IdentityPanel() {
        initComponents();
        loadName();
    }
    
    private void loadName() {
        nameTextField.setText(Config.getProperty(Config.Key.participantName));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nameLabel = new javax.swing.JLabel();
        nameTextField = new javax.swing.JTextField();
        keyMaterialLabel = new javax.swing.JLabel();
        publicKeyLabel = new javax.swing.JLabel();
        publicKeyTextField = new javax.swing.JTextField();
        privateKeyLabel = new javax.swing.JLabel();
        privateKeyTextField = new javax.swing.JTextField();
        decryptPrivateKeyButton = new javax.swing.JButton();
        connectionLabel = new javax.swing.JLabel();
        serverUrlLabel = new javax.swing.JLabel();
        serverUrlTextField = new javax.swing.JTextField();

        nameLabel.setText("Your Name:");

        nameTextField.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                nameTextFieldPropertyChange(evt);
            }
        });

        keyMaterialLabel.setFont(new java.awt.Font("Ubuntu", 1, 13)); // NOI18N
        keyMaterialLabel.setText("Key Material");

        publicKeyLabel.setText("Public Key:");

        publicKeyTextField.setEditable(false);

        privateKeyLabel.setText("Private Key:");

        privateKeyTextField.setEditable(false);
        privateKeyTextField.setFont(new java.awt.Font("Ubuntu", 2, 13)); // NOI18N
        privateKeyTextField.setText("encrypted");

        decryptPrivateKeyButton.setText("Decrypt...");
        decryptPrivateKeyButton.setEnabled(false);

        connectionLabel.setFont(new java.awt.Font("Ubuntu", 1, 13)); // NOI18N
        connectionLabel.setText("Connection");

        serverUrlLabel.setText("Server URL:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(nameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nameTextField))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(keyMaterialLabel)
                    .addComponent(connectionLabel))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(privateKeyLabel)
                            .addComponent(publicKeyLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(privateKeyTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(decryptPrivateKeyButton))
                            .addComponent(publicKeyTextField)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(serverUrlLabel)
                        .addGap(18, 18, 18)
                        .addComponent(serverUrlTextField))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLabel)
                    .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(keyMaterialLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(publicKeyLabel)
                    .addComponent(publicKeyTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(privateKeyLabel)
                    .addComponent(privateKeyTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(decryptPrivateKeyButton))
                .addGap(18, 18, 18)
                .addComponent(connectionLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(serverUrlLabel)
                    .addComponent(serverUrlTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(142, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void nameTextFieldPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_nameTextFieldPropertyChange
        String name = nameTextField.getText().trim();
        
        if (isNameValid(name)) {
            App.getController().changeName(name);
        }
    }//GEN-LAST:event_nameTextFieldPropertyChange
    
    boolean isNameValid(String name) {
        if (name == null) {
            return false;
        }
        
        String trimmedName = name.trim();
        return !trimmedName.isEmpty() && trimmedName.equals(name);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel connectionLabel;
    private javax.swing.JButton decryptPrivateKeyButton;
    private javax.swing.JLabel keyMaterialLabel;
    private javax.swing.JLabel nameLabel;
    javax.swing.JTextField nameTextField;
    private javax.swing.JLabel privateKeyLabel;
    private javax.swing.JTextField privateKeyTextField;
    private javax.swing.JLabel publicKeyLabel;
    private javax.swing.JTextField publicKeyTextField;
    private javax.swing.JLabel serverUrlLabel;
    private javax.swing.JTextField serverUrlTextField;
    // End of variables declaration//GEN-END:variables
}
