/*
 * Generated by XDoclet - Do not edit!
 */
package org.dcm4chex.archive.ejb.interfaces;

/**
 * Local home interface for VerifyingObserver.
 * @xdoclet-generated at ${TODAY}
 * @copyright The XDoclet Team
 * @author XDoclet
 * @version 2.17.3
 */
public interface VerifyingObserverLocalHome
   extends javax.ejb.EJBLocalHome
{
   public static final String COMP_NAME="java:comp/env/ejb/VerifyingObserverLocal";
   public static final String JNDI_NAME="ejb/VerifyingObserver";

   public org.dcm4chex.archive.ejb.interfaces.VerifyingObserverLocal create(org.dcm4che.data.Dataset item)
      throws javax.ejb.CreateException;

   public java.util.Collection findAll()
      throws javax.ejb.FinderException;

   public org.dcm4chex.archive.ejb.interfaces.VerifyingObserverLocal findByPrimaryKey(java.lang.Long pk)
      throws javax.ejb.FinderException;

}
