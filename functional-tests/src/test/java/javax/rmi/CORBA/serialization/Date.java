/*
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS HEADER.
 * 
 * Copyright (c) 1997-2018 Oracle and/or its affiliates. All rights reserved.
 * Copyright (c) 1998 IBM Corp. All rights reserved.
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
 * file and include the License file at packager/legal/LICENSE.txt.
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

package javax.rmi.CORBA.serialization;

/**
* Date.java
* Generated by the IDL-to-Java compiler (portable), version "3.0"
* from java/util/Date.idl
* 01 June 1999 20:22:16 o'clock GMT+00:00
*/

public abstract class Date implements javax.rmi.CORBA.serialization.Cloneable, org.omg.CORBA.portable.CustomValue 
{
  private static String[] _truncatable_ids = {
    DateHelper.id ()
  };

  public String[] _truncatable_ids() {
    return _truncatable_ids;
  }

  public abstract long UTC (int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

  public abstract boolean after (Date arg0);

  public abstract boolean before (Date arg0);

  public abstract boolean _equals (org.omg.CORBA.Any arg0);

  public abstract int date ();

  public abstract void date (int newDate);

  public abstract int day ();

  public abstract int hours ();

  public abstract void hours (int newHours);

  public abstract int minutes ();

  public abstract void minutes (int newMinutes);

  public abstract int month ();

  public abstract void month (int newMonth);

  public abstract int seconds ();

  public abstract void seconds (int newSeconds);

  public abstract long time ();

  public abstract void time (long newTime);

  public abstract int timezoneOffset ();

  public abstract int year ();

  public abstract void year (int newYear);

  public abstract int _hashCode ();

  public abstract long parse (String arg0);

  public abstract String toGMTString ();

  public abstract String toLocaleString ();

  public abstract String _toString ();

} // class Date
