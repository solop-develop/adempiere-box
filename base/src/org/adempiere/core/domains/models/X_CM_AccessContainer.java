/******************************************************************************
 * Product: ADempiere ERP & CRM Smart Business Solution                       *
 * Copyright (C) 2006-2017 ADempiere Foundation, All Rights Reserved.         *
 * This program is free software, you can redistribute it and/or modify it    *
 * under the terms version 2 of the GNU General Public License as published   *
 * or (at your option) any later version.										*
 * by the Free Software Foundation. This program is distributed in the hope   *
 * that it will be useful, but WITHOUT ANY WARRANTY, without even the implied *
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.           *
 * See the GNU General Public License for more details.                       *
 * You should have received a copy of the GNU General Public License along    *
 * with this program, if not, write to the Free Software Foundation, Inc.,    *
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA.                     *
 * For the text or an alternative of this public license, you may reach us    *
 * or via info@adempiere.net or http://www.adempiere.net/license.html         *
 *****************************************************************************/
/** Generated Model - DO NOT CHANGE */
package org.adempiere.core.domains.models;

import java.sql.ResultSet;
import java.util.Properties;

import org.compiere.model.I_Persistent;
import org.compiere.model.MTable;
import org.compiere.model.PO;
import org.compiere.model.POInfo;

/** Generated Model for CM_AccessContainer
 *  @author Adempiere (generated) 
 *  @version Release 3.9.2 - $Id$ */
public class X_CM_AccessContainer extends PO implements I_CM_AccessContainer, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20191120L;

    /** Standard Constructor */
    public X_CM_AccessContainer (Properties ctx, int CM_AccessContainer_ID, String trxName)
    {
      super (ctx, CM_AccessContainer_ID, trxName);
      /** if (CM_AccessContainer_ID == 0)
        {
			setCM_AccessProfile_ID (0);
			setCM_Container_ID (0);
        } */
    }

    /** Load Constructor */
    public X_CM_AccessContainer (Properties ctx, ResultSet rs, String trxName)
    {
      super (ctx, rs, trxName);
    }

    /** AccessLevel
      * @return 6 - System - Client 
      */
    protected int get_AccessLevel()
    {
      return accessLevel.intValue();
    }

    /** Load Meta Data */
    protected POInfo initPO (Properties ctx)
    {
      POInfo poi = POInfo.getPOInfo (ctx, Table_ID, get_TrxName());
      return poi;
    }

    public String toString()
    {
      StringBuffer sb = new StringBuffer ("X_CM_AccessContainer[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	public org.adempiere.core.domains.models.I_CM_AccessProfile getCM_AccessProfile() throws RuntimeException
    {
		return (org.adempiere.core.domains.models.I_CM_AccessProfile)MTable.get(getCtx(), org.adempiere.core.domains.models.I_CM_AccessProfile.Table_Name)
			.getPO(getCM_AccessProfile_ID(), get_TrxName());	}

	/** Set Web Access Profile.
		@param CM_AccessProfile_ID 
		Web Access Profile
	  */
	public void setCM_AccessProfile_ID (int CM_AccessProfile_ID)
	{
		if (CM_AccessProfile_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_CM_AccessProfile_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_CM_AccessProfile_ID, Integer.valueOf(CM_AccessProfile_ID));
	}

	/** Get Web Access Profile.
		@return Web Access Profile
	  */
	public int getCM_AccessProfile_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_CM_AccessProfile_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.adempiere.core.domains.models.I_CM_Container getCM_Container() throws RuntimeException
    {
		return (org.adempiere.core.domains.models.I_CM_Container)MTable.get(getCtx(), org.adempiere.core.domains.models.I_CM_Container.Table_Name)
			.getPO(getCM_Container_ID(), get_TrxName());	}

	/** Set Web Container.
		@param CM_Container_ID 
		Web Container contains content like images, text etc.
	  */
	public void setCM_Container_ID (int CM_Container_ID)
	{
		if (CM_Container_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_CM_Container_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_CM_Container_ID, Integer.valueOf(CM_Container_ID));
	}

	/** Get Web Container.
		@return Web Container contains content like images, text etc.
	  */
	public int getCM_Container_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_CM_Container_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Immutable Universally Unique Identifier.
		@param UUID 
		Immutable Universally Unique Identifier
	  */
	public void setUUID (String UUID)
	{
		set_Value (COLUMNNAME_UUID, UUID);
	}

	/** Get Immutable Universally Unique Identifier.
		@return Immutable Universally Unique Identifier
	  */
	public String getUUID () 
	{
		return (String)get_Value(COLUMNNAME_UUID);
	}
}