/*
 * Generated by XDoclet - Do not edit!
 */
package org.dcm4chex.archive.ejb.interfaces;

/**
 * Local interface for UPS.
 * @xdoclet-generated at ${TODAY}
 * @copyright The XDoclet Team
 * @author XDoclet
 * @version 2.17.3
 */
public interface UPSLocal
   extends javax.ejb.EJBLocalObject
{
   /**
    * Auto-generated Primary Key
    */
   public java.lang.Long getPk(  ) ;

   public java.lang.String getSopInstanceUID(  ) ;

   public java.lang.String getTransactionUID(  ) ;

   public void setTransactionUID( java.lang.String iuid ) ;

   public java.lang.String getAdmissionID(  ) ;

   public java.lang.String getIssuerOfAdmissionIDLocalNamespaceEntityID(  ) ;

   public java.lang.String getIssuerOfAdmissionIDUniversialEntityID(  ) ;

   public java.lang.String getProcedureStepLabel(  ) ;

   public java.lang.String getWorklistLabel(  ) ;

   public java.sql.Timestamp getScheduledStartDateTime(  ) ;

   public java.sql.Timestamp getExpectedCompletionDateTime(  ) ;

   public int getStateAsInt(  ) ;

   public java.sql.Timestamp getCreatedTime(  ) ;

   public java.sql.Timestamp getUpdatedTime(  ) ;

   public void setPatient( org.dcm4chex.archive.ejb.interfaces.PatientLocal patient ) ;

   public org.dcm4chex.archive.ejb.interfaces.PatientLocal getPatient(  ) ;

   public java.util.Collection getRefRequests(  ) ;

   public java.util.Collection getSubscriptions(  ) ;

   public org.dcm4che.data.Dataset getAttributes(  ) ;

   public boolean updateState( int newState ) ;

   public void setAttributes( org.dcm4che.data.Dataset ds ) ;

   public void updateAttributes( org.dcm4che.data.Dataset newAttrs ) ;

}
