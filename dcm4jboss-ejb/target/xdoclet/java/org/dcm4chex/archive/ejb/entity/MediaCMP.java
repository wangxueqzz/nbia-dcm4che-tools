/*
 * Generated by XDoclet - Do not edit!
 */
package org.dcm4chex.archive.ejb.entity;

/**
 * CMP layer for Media.
 * @xdoclet-generated at ${TODAY}
 * @copyright The XDoclet Team
 * @author XDoclet
 * @version 2.17.3
 */
public abstract class MediaCMP
   extends org.dcm4chex.archive.ejb.entity.MediaBean
   implements javax.ejb.EntityBean
{

   public void ejbLoad() 
   {
   }

   public void ejbStore() 
   {
   }

   public void ejbActivate() 
   {
   }

   public void ejbPassivate() 
   {

   }

   public void setEntityContext(javax.ejb.EntityContext ctx) 
   {
   }

   public void unsetEntityContext() 
   {
   }

   public void ejbRemove() throws javax.ejb.RemoveException
   {

   }

   public abstract java.lang.Long getPk() ;

   public abstract void setPk( java.lang.Long pk ) ;

   public abstract java.sql.Timestamp getCreatedTime() ;

   public abstract void setCreatedTime( java.sql.Timestamp createdTime ) ;

   public abstract java.sql.Timestamp getUpdatedTime() ;

   public abstract void setUpdatedTime( java.sql.Timestamp updatedTime ) ;

   public abstract java.lang.String getFilesetId() ;

   public abstract void setFilesetId( java.lang.String filesetId ) ;

   public abstract java.lang.String getFilesetIuid() ;

   public abstract void setFilesetIuid( java.lang.String filesetIuid ) ;

   public abstract java.lang.String getMediaCreationRequestIuid() ;

   public abstract void setMediaCreationRequestIuid( java.lang.String mediaCreationRequestIuid ) ;

   public abstract long getMediaUsage() ;

   public abstract void setMediaUsage( long mediaUsage ) ;

   public abstract int getMediaStatus() ;

   public abstract void setMediaStatus( int mediaStatus ) ;

   public abstract java.lang.String getMediaStatusInfo() ;

   public abstract void setMediaStatusInfo( java.lang.String mediaStatusInfo ) ;

}
