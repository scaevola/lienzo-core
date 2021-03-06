/*
   Copyright (c) 2014 Ahome' Innovation Technologies. All rights reserved.

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
 */

package com.ait.lienzo.shared.core.types;

import java.util.List;

/**
 * Enum to create a type safe set of values for {@link Text} Alignment. 
 */
public enum TextBaseLine implements EnumWithValue
{
    ALPHABETIC("alphabetic"), BOTTOM("bottom"), HANGING("hanging"), IDEOGRAPHIC("ideographic"), MIDDLE("middle"), TOP("top");

    private final String m_value;

    private TextBaseLine(String value)
    {
        m_value = value;
    }

    @Override
    public final String getValue()
    {
        return m_value;
    }

    @Override
    public final String toString()
    {
        return m_value;
    }

    public static final TextBaseLine lookup(String key)
    {
        return Statics.lookup(key, TextBaseLine.values(), ALPHABETIC);
    }

    public static final List<String> getKeys()
    {
        return Statics.getKeys(TextBaseLine.values());
    }

    public static final List<TextBaseLine> getValues()
    {
        return Statics.getValues(TextBaseLine.values());
    }
}
