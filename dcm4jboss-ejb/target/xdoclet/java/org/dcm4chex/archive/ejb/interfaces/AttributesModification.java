/*
 * Generated by XDoclet - Do not edit!
 */
package org.dcm4chex.archive.ejb.interfaces;

/**
 * Remote interface for AttributesModification.
 * @xdoclet-generated at ${TODAY}
 * @copyright The XDoclet Team
 * @author XDoclet
 * @version 2.17.3
 */
public interface AttributesModification
   extends javax.ejb.EJBObject
{

   public boolean modifyAttributes( org.dcm4che.data.Dataset attrs,java.util.Date time,java.lang.String system,java.lang.String reason,boolean updateOriginalAttributesSeq,int entityNotFoundErrorCode )
      throws org.dcm4che.net.DcmServiceException, java.rmi.RemoteException;

   public boolean moveStudyToPatient( org.dcm4che.data.Dataset attrs,org.dcm4chex.archive.common.PatientMatching matching,boolean create )
      throws javax.ejb.FinderException, javax.ejb.RemoveException, javax.ejb.CreateException, java.rmi.RemoteException;

}
