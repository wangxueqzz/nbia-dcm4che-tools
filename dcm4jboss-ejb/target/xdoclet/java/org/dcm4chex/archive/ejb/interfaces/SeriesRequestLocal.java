/*
 * Generated by XDoclet - Do not edit!
 */
package org.dcm4chex.archive.ejb.interfaces;

/**
 * Local interface for SeriesRequest.
 * @xdoclet-generated at ${TODAY}
 * @copyright The XDoclet Team
 * @author XDoclet
 * @version 2.17.3
 */
public interface SeriesRequestLocal
   extends javax.ejb.EJBLocalObject
{
   /**
    * Auto-generated Primary Key
    */
   public java.lang.Long getPk(  ) ;

   /**
    * Accession Number
    */
   public java.lang.String getAccessionNumber(  ) ;

   public java.lang.String getRequestingPhysician(  ) ;

   public java.lang.String getRequestingPhysicianFamilyNameSoundex(  ) ;

   public void setRequestingPhysicianFamilyNameSoundex( java.lang.String name ) ;

   public java.lang.String getRequestingPhysicianGivenNameSoundex(  ) ;

   public void setRequestingPhysicianGivenNameSoundex( java.lang.String name ) ;

   public org.dcm4chex.archive.ejb.interfaces.SeriesLocal getSeries(  ) ;

}
