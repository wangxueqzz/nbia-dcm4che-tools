/*
 * Generated by XDoclet - Do not edit!
 */
package org.dcm4chex.archive.ejb.interfaces;

/**
 * Home interface for HPStorage.
 * @xdoclet-generated at ${TODAY}
 * @copyright The XDoclet Team
 * @author XDoclet
 * @version 2.17.3
 */
public interface HPStorageHome
   extends javax.ejb.EJBHome
{
   public static final String COMP_NAME="java:comp/env/ejb/HPStorage";
   public static final String JNDI_NAME="ejb/HPStorage";

   public org.dcm4chex.archive.ejb.interfaces.HPStorage create()
      throws javax.ejb.CreateException,java.rmi.RemoteException;

}
