/*
 * Generated by XDoclet - Do not edit!
 */
package org.dcm4chex.archive.ejb.interfaces;

/**
 * Home interface for PrivateManager.
 * @xdoclet-generated at ${TODAY}
 * @copyright The XDoclet Team
 * @author XDoclet
 * @version 2.17.3
 */
public interface PrivateManagerHome
   extends javax.ejb.EJBHome
{
   public static final String COMP_NAME="java:comp/env/ejb/PrivateManager";
   public static final String JNDI_NAME="ejb/PrivateManager";

   public org.dcm4chex.archive.ejb.interfaces.PrivateManager create()
      throws javax.ejb.CreateException,java.rmi.RemoteException;

}
