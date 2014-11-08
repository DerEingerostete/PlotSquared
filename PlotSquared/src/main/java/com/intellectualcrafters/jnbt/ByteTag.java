////////////////////////////////////////////////////////////////////////////////////////////////////
// PlotSquared - A plot manager and world generator for the Bukkit API                             /
// Copyright (c) 2014 IntellectualSites/IntellectualCrafters                                       /
//                                                                                                 /
// This program is free software; you can redistribute it and/or modify                            /
// it under the terms of the GNU General Public License as published by                            /
// the Free Software Foundation; either version 3 of the License, or                               /
// (at your option) any later version.                                                             /
//                                                                                                 /
// This program is distributed in the hope that it will be useful,                                 /
// but WITHOUT ANY WARRANTY; without even the implied warranty of                                  /
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the                                   /
// GNU General Public License for more details.                                                    /
//                                                                                                 /
// You should have received a copy of the GNU General Public License                               /
// along with this program; if not, write to the Free Software Foundation,                         /
// Inc., 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301  USA                               /
//                                                                                                 /
// You can contact us via: support@intellectualsites.com                                           /
////////////////////////////////////////////////////////////////////////////////////////////////////

package com.intellectualcrafters.jnbt;

/**
 * The {@code TAG_Byte} tag.
 */
public final class ByteTag extends Tag {

    private final byte value;

    /**
     * Creates the tag with an empty name.
     *
     * @param value the value of the tag
     */
    public ByteTag(final byte value) {
        super();
        this.value = value;
    }

    /**
     * Creates the tag.
     *
     * @param name  the name of the tag
     * @param value the value of the tag
     */
    public ByteTag(final String name, final byte value) {
        super(name);
        this.value = value;
    }

    @Override
    public Byte getValue() {
        return this.value;
    }

    @Override
    public String toString() {
        final String name = getName();
        String append = "";
        if ((name != null) && !name.equals("")) {
            append = "(\"" + this.getName() + "\")";
        }
        return "TAG_Byte" + append + ": " + this.value;
    }

}
