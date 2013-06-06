/*
 * Generated by XDoclet - Do not edit!
 */
package org.dcm4chex.archive.ejb.interfaces;

/**
 * Local home interface for Issuer.
 * @xdoclet-generated at ${TODAY}
 * @copyright The XDoclet Team
 * @author XDoclet
 * @version 2.17.3
 */
public interface IssuerLocalHome
   extends javax.ejb.EJBLocalHome
{
   public static final String COMP_NAME="java:comp/env/ejb/IssuerLocal";
   public static final String JNDI_NAME="ejb/Issuer";

   public org.dcm4chex.archive.ejb.interfaces.IssuerLocal create(java.lang.String id , java.lang.String uid , java.lang.String type)
      throws javax.ejb.CreateException;

   public org.dcm4chex.archive.ejb.interfaces.IssuerLocal findByLocalNamespaceEntityID(java.lang.String id)
      throws javax.ejb.FinderException;

   public org.dcm4chex.archive.ejb.interfaces.IssuerLocal findByUniversalEntityID(java.lang.String uid, java.lang.String type)
      throws javax.ejb.FinderException;

   public org.dcm4chex.archive.ejb.interfaces.IssuerLocal findByPrimaryKey(java.lang.Long pk)
      throws javax.ejb.FinderException;

}
