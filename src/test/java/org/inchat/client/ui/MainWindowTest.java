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
package org.inchat.client.ui;

import java.io.File;
import org.inchat.common.Config;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

public class MainWindowTest {

    private final String CONFIG_FILE = "MainWidow.conf";
    private MainWindow mainWindow;

    @Before
    public void setUp() {
        cleanUp();
        Config.createDefaultConfig(CONFIG_FILE);
        Config.loadConfig(CONFIG_FILE);
        mainWindow = new MainWindow();
    }

    @After
    public void cleanUp() {
        File configFile = new File(CONFIG_FILE);
        configFile.delete();
    }

    @Test
    public void testSetPositionOnNewSetting() {
        assertTrue(mainWindow.getX() > 0);
        assertTrue(mainWindow.getY() > 0);
    }

    @Test
    public void testSetOfProfileSpecificValuesOnNewSetting() {
        assertTrue(mainWindow.usernameButton.getText().isEmpty());
    }

    @Test
    public void testSetOfProfileSpecificValuesOnExistingSetting() {
        Config.setProperty(Config.Key.participantName, "spock");
        mainWindow = new MainWindow();
        assertEquals("spock", mainWindow.usernameButton.getText());
    }

    @Test
    public void testInitMenu() {
        assertTrue(mainWindow.menu.getX() > 0);
        assertTrue(mainWindow.menu.getY() > 0);
    }

}
