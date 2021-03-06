/*
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS HEADER.
 * 
 * Copyright (c) 1997-2010 Oracle and/or its affiliates. All rights reserved.
 * 
 * The contents of this file are subject to the terms of either the GNU
 * General Public License Version 2 only ("GPL") or the Common Development
 * and Distribution License("CDDL") (collectively, the "License").  You
 * may not use this file except in compliance with the License.  You can
 * obtain a copy of the License at
 * https://glassfish.dev.java.net/public/CDDL+GPL_1_1.html
 * or packager/legal/LICENSE.txt.  See the License for the specific
 * language governing permissions and limitations under the License.
 * 
 * When distributing the software, include this License Header Notice in each
 * file and include the License file at glassfish/bootstrap/legal/LICENSE.txt.
 * 
 * GPL Classpath Exception:
 * Oracle designates this particular file as subject to the "Classpath"
 * exception as provided by Oracle in the GPL Version 2 section of the License
 * file that accompanied this code.
 * 
 * Modifications:
 * If applicable, add the following below the License Header, with the fields
 * enclosed by brackets [] replaced by your own identifying information:
 * "Portions Copyright [year] [name of copyright owner]"
 * 
 * Contributor(s):
 * If you wish your version of this file to be governed by only the CDDL or
 * only the GPL Version 2, indicate your decision by adding "[Contributor]
 * elects to include this software in this distribution under the [CDDL or GPL
 * Version 2] license."  If you don't indicate a single choice of license, a
 * recipient has the option to distribute your version of this file under
 * either the CDDL, the GPL Version 2 or to extend the choice of license to
 * its licensees as provided above.  However, if you add GPL Version 2 code
 * and therefore, elected the GPL Version 2 license, then the option applies
 * only if the new code is made subject to such option by the copyright
 * holder.
 */
package com.sun.org.omg.CORBA;


/**
* com/sun/org/omg/CORBA/DefinitionKindHelper.java
* Generated by the IDL-to-Java compiler (portable), version "3.0"
* from ir.idl
* Thursday, May 6, 1999 1:51:43 AM PDT
*/

// This file has been manually _CHANGED_

public final class DefinitionKindHelper
{
    private static String  _id = "IDL:omg.org/CORBA/DefinitionKind:1.0";

    public DefinitionKindHelper()
    {
    }

    // _CHANGED_
    //public static void insert (org.omg.CORBA.Any a, com.sun.org.omg.CORBA.DefinitionKind that)
    public static void insert (org.omg.CORBA.Any a, org.omg.CORBA.DefinitionKind that)
    {
        org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
        a.type (type ());
        write (out, that);
        a.read_value (out.create_input_stream (), type ());
    }

    // _CHANGED_
    //public static com.sun.org.omg.CORBA.DefinitionKind extract (org.omg.CORBA.Any a)
    public static org.omg.CORBA.DefinitionKind extract (org.omg.CORBA.Any a)
    {
        return read (a.create_input_stream ());
    }

    private static org.omg.CORBA.TypeCode __typeCode = null;
    synchronized public static org.omg.CORBA.TypeCode type ()
    {
        if (__typeCode == null)
            {
                __typeCode = org.omg.CORBA.ORB.init ().create_enum_tc (com.sun.org.omg.CORBA.DefinitionKindHelper.id (), "DefinitionKind", new String[] { "dk_none", "dk_all", "dk_Attribute", "dk_Constant", "dk_Exception", "dk_Interface", "dk_Module", "dk_Operation", "dk_Typedef", "dk_Alias", "dk_Struct", "dk_Union", "dk_Enum", "dk_Primitive", "dk_String", "dk_Sequence", "dk_Array", "dk_Repository", "dk_Wstring", "dk_Fixed", "dk_Value", "dk_ValueBox", "dk_ValueMember", "dk_Native"} );
            }
        return __typeCode;
    }

    public static String id ()
    {
        return _id;
    }

    // _CHANGED_
    //public static com.sun.org.omg.CORBA.DefinitionKind read (org.omg.CORBA.portable.InputStream istream)
    public static org.omg.CORBA.DefinitionKind read (org.omg.CORBA.portable.InputStream istream)
    {
        // _CHANGED_
        //return com.sun.org.omg.CORBA.DefinitionKind.from_int (istream.read_long ());
        return org.omg.CORBA.DefinitionKind.from_int (istream.read_long ());
    }

    // _CHANGED_
    //public static void write (org.omg.CORBA.portable.OutputStream ostream, com.sun.org.omg.CORBA.DefinitionKind value)
    public static void write (org.omg.CORBA.portable.OutputStream ostream, org.omg.CORBA.DefinitionKind value)
    {
        ostream.write_long (value.value ());
    }

}
