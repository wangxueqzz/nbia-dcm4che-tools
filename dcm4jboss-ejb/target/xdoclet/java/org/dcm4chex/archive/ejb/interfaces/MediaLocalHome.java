/*
 * Generated by XDoclet - Do not edit!
 */
package org.dcm4chex.archive.ejb.interfaces;

/**
 * Local home interface for Media.
 * @xdoclet-generated at ${TODAY}
 * @copyright The XDoclet Team
 * @author XDoclet
 * @version 2.17.3
 */
public interface MediaLocalHome
   extends javax.ejb.EJBLocalHome
{
   public static final String COMP_NAME="java:comp/env/ejb/MediaLocal";
   public static final String JNDI_NAME="ejb/Media";

   public org.dcm4chex.archive.ejb.interfaces.MediaLocal create(java.lang.String fsIuid)
      throws javax.ejb.CreateException;

   public java.util.Collection findByStatus(int status)
      throws javax.ejb.FinderException;

   public org.dcm4chex.archive.ejb.interfaces.MediaLocal findByFilesetIuid(java.lang.String uid)
      throws javax.ejb.FinderException;

   public org.dcm4chex.archive.ejb.interfaces.MediaLocal findByPrimaryKey(java.lang.Long pk)
      throws javax.ejb.FinderException;

   public java.util.Collection listByCreatedTime(int[] status , java.sql.Timestamp after , java.sql.Timestamp before , java.lang.Integer offset , java.lang.Integer limit , boolean desc) 
      throws javax.ejb.FinderException;

   public java.util.Collection listByUpdatedTime(int[] status , java.sql.Timestamp after , java.sql.Timestamp before , java.lang.Integer offset , java.lang.Integer limit , boolean desc) 
      throws javax.ejb.FinderException;

   public int countByCreatedTime(int[] status , java.sql.Timestamp after , java.sql.Timestamp before) 
      throws javax.ejb.FinderException;

   public int countByUpdatedTime(int[] status , java.sql.Timestamp after , java.sql.Timestamp before) 
      throws javax.ejb.FinderException;

}
