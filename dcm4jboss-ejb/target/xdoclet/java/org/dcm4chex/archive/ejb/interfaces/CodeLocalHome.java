/*
 * Generated by XDoclet - Do not edit!
 */
package org.dcm4chex.archive.ejb.interfaces;

/**
 * Local home interface for Code.
 * @xdoclet-generated at ${TODAY}
 * @copyright The XDoclet Team
 * @author XDoclet
 * @version 2.17.3
 */
public interface CodeLocalHome
   extends javax.ejb.EJBLocalHome
{
   public static final String COMP_NAME="java:comp/env/ejb/CodeLocal";
   public static final String JNDI_NAME="ejb/Code";

   public org.dcm4chex.archive.ejb.interfaces.CodeLocal create(java.lang.String value , java.lang.String designator , java.lang.String version , java.lang.String meaning)
      throws javax.ejb.CreateException;

   public java.util.Collection findAll()
      throws javax.ejb.FinderException;

   public java.util.Collection findByValueAndDesignator(java.lang.String value, java.lang.String designator)
      throws javax.ejb.FinderException;

   public org.dcm4chex.archive.ejb.interfaces.CodeLocal findByPrimaryKey(java.lang.Long pk)
      throws javax.ejb.FinderException;

}