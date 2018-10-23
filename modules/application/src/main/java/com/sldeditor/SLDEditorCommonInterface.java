/*
 * SLD Editor - The Open Source Java SLD Editor
 *
 * Copyright (C) 2018, SCISYS UK Limited
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
 */

package com.sldeditor;

import com.sldeditor.common.SLDDataInterface;
import java.net.URL;
import java.util.List;

/** @author ward_r */
public interface SLDEditorCommonInterface {

    /**
     * Open URL.
     *
     * @param url the url
     * @return the list
     */
    List<SLDDataInterface> openURL(URL url);

    /**
     * Populate the application with the SLD.
     *
     * @param sldData the sld data
     */
    void populate(SLDDataInterface sldData);
}
