/*
 * Generated by XDoclet - Do not edit!
 */
package org.dcm4chex.archive.ejb.interfaces;

/**
 * Local home interface for FileSystem.
 * @xdoclet-generated at ${TODAY}
 * @copyright The XDoclet Team
 * @author XDoclet
 * @version 2.17.3
 */
public interface FileSystemLocalHome
   extends javax.ejb.EJBLocalHome
{
   public static final String COMP_NAME="java:comp/env/ejb/FileSystemLocal";
   public static final String JNDI_NAME="ejb/FileSystem";

   public org.dcm4chex.archive.ejb.interfaces.FileSystemLocal create(org.dcm4chex.archive.ejb.interfaces.FileSystemDTO dto)
      throws javax.ejb.CreateException;

   public java.util.Collection findAll()
      throws javax.ejb.FinderException;

   public org.dcm4chex.archive.ejb.interfaces.FileSystemLocal findByDirectoryPath(java.lang.String path)
      throws javax.ejb.FinderException;

   public org.dcm4chex.archive.ejb.interfaces.FileSystemLocal findByGroupIdAndDirectoryPath(java.lang.String groupID, java.lang.String path)
      throws javax.ejb.FinderException;

   public java.util.Collection findByLikeDirectoryPath(java.lang.String path, int availability, int status)
      throws javax.ejb.FinderException;

   public java.util.Collection findByGroupId(java.lang.String groupID)
      throws javax.ejb.FinderException;

   public java.util.Collection findByGroupIdAndStatus(java.lang.String groupID, int status)
      throws javax.ejb.FinderException;

   public java.util.Collection findRWByGroupId(java.lang.String groupID)
      throws javax.ejb.FinderException;

   public java.util.Collection findByRetrieveAET(java.lang.String aet)
      throws javax.ejb.FinderException;

   public java.util.Collection findByRetrieveAETAndAvailabilityAndStatus(java.lang.String aet, int availability, int status)
      throws javax.ejb.FinderException;

   public java.util.Collection findByRetrieveAETAndAvailabilityAndStatus2(java.lang.String aet, int availability, int status, int alt)
      throws javax.ejb.FinderException;

   public org.dcm4chex.archive.ejb.interfaces.FileSystemLocal findByPrimaryKey(java.lang.Long pk)
      throws javax.ejb.FinderException;

   public long sizeOfFilesCreatedAfter(java.lang.Long pk , java.sql.Timestamp createdAfter) 
      throws javax.ejb.FinderException;
   /**
    * Get all available distinct retrieve AETs registered with file systems
    */
   public java.util.Collection allRetrieveAETs() 
      throws javax.ejb.FinderException;

   public java.sql.Timestamp minCreatedTimeOnFsWithFileStatus(java.lang.String dirPath , int status) 
      throws javax.ejb.FinderException;

}
