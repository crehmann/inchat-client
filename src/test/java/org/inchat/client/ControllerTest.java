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
package org.inchat.client;

import java.io.File;
import javax.swing.ListModel;
import static org.easymock.EasyMock.*;
import org.inchat.client.ui.MainWindow;
import org.inchat.client.ui.MainWindowTest;
import org.inchat.common.Config;
import org.inchat.common.Contact;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;

public class ControllerTest {

    private Controller controller;
    private Model model;
    private Contact contact;

    @Before
    public void setUp() {
        controller = new Controller();
        model = createMock(Model.class);
        contact = createMock(Contact.class);
    }

    @Test
    public void testChangeUsername() {
        String username = "Timmeeee";
        String filename = "username.conf";
        File configFile = new File(filename);
        configFile.delete();

        Config.createDefaultConfig(filename);
        Config.loadConfig(filename);
        MainWindow mainWindow = new MainWindow();
        AppTest.setAppMainWindow(mainWindow);
        controller.changeUsername(username);

        testChangeUsernameOnWritingConfigProperty(username);
        testChangeUsernameOnUpdatingGui(username);

        configFile.delete();
    }

    private void testChangeUsernameOnWritingConfigProperty(String username) {
        assertEquals(username, Config.getProperty(Config.Key.participantName));
    }

    private void testChangeUsernameOnUpdatingGui(String username) {
        assertEquals(username, MainWindowTest.getUsernameButton().getText());
    }

    @Test
    public void testAddContactOnInvocingModelOnNull() {
        model.addContact(anyObject(Contact.class));
        expectLastCall().once();
        replay(model);

        AppTest.setAppMdoel(model);
        controller.addContact(null); // should just invoke model

        verify(model);
    }

    @Test
    public void testAddContactOnInvocingModel() {
        model.addContact(anyObject(Contact.class));
        expectLastCall().once();
        replay(model, contact);

        AppTest.setAppMdoel(model);
        controller.addContact(contact);

        verify(model);
    }
}
