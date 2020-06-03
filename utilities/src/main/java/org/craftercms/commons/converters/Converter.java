/*
 * Copyright (C) 2007-2020 Crafter Software Corporation. All Rights Reserved.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License version 3 as published by
 * the Free Software Foundation.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.craftercms.commons.converters;

/**
 * Converts objects of S type to T type.
 *
 * @author avasquez
 */
public interface Converter<S, T> {

    /**
     * Returns the class of the objects this converter converts from.
     */
    Class<?> getSourceClass();

    /**
     * Returns the class of the objects this converter converts to.
     */
    Class<?> getTargetClass();

    /**
     * Converts the source object from S type to T type.
     *
     * @param source the object to convert
     *
     * @return the converted object
     */
    T convert(S source);

}
