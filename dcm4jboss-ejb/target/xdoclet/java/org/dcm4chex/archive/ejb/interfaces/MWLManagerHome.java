/*
 * Generated by XDoclet - Do not edit!
 */
package org.dcm4chex.archive.ejb.interfaces;

/**
 * Home interface for MWLManager.
 * @xdoclet-generated at ${TODAY}
 * @copyright The XDoclet Team
 * @author XDoclet
 * @version 2.17.3
 */
public interface MWLManagerHome
   extends javax.ejb.EJBHome
{
   public static final String COMP_NAME="java:comp/env/ejb/MWLManager";
   public static final String JNDI_NAME="ejb/MWLManager";

   public org.dcm4chex.archive.ejb.interfaces.MWLManager create()
      throws javax.ejb.CreateException,java.rmi.RemoteException;

}