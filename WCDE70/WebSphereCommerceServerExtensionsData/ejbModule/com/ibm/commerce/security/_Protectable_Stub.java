// Stub class generated by rmic, do not edit.
// Contents subject to change without notice.

package com.ibm.commerce.security;

import java.lang.Exception;
import java.lang.Long;
import java.lang.Object;
import java.lang.String;
import java.lang.Throwable;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.UnexpectedException;
import javax.rmi.CORBA.Stub;
import javax.rmi.CORBA.Util;
import org.omg.CORBA.SystemException;
import org.omg.CORBA.portable.ApplicationException;
import org.omg.CORBA.portable.OutputStream;
import org.omg.CORBA.portable.RemarshalException;
import org.omg.CORBA.portable.ServantObject;
import org.omg.CORBA_2_3.portable.InputStream;

public class _Protectable_Stub extends Stub implements Protectable,
Remote {
    
    private static final String[] _type_ids = {
        "RMI:com.ibm.commerce.security.Protectable:0000000000000000"
    };
    
    public String[] _ids() { 
        return _type_ids;
    }
    
    public boolean fulfills(Long arg0, String arg1) throws RemoteException, Exception {
        while(true) {
            if (!Util.isLocal(this)) {
                InputStream in = null;
                try {
                    try {
                        org.omg.CORBA_2_3.portable.OutputStream out = 
                            (org.omg.CORBA_2_3.portable.OutputStream)
                            _request("fulfills", true);
                        out.write_value(arg0,Long.class);
                        out.write_value(arg1,String.class);
                        in = (InputStream)_invoke(out);
                        return in.read_boolean();
                    } catch (ApplicationException ex) {
                        in = (InputStream) ex.getInputStream();
                        String id = in.read_string();
                        if (id.equals("IDL:java/lang/Ex:1.0")) {
                            throw (Exception) in.read_value(Exception.class);
                        }
                        throw new UnexpectedException(id);
                    } catch (RemarshalException ex) {
                        continue;
                    }
                } catch (SystemException ex) {
                    throw Util.mapSystemException(ex);
                } finally {
                    _releaseReply(in);
                }
            } else {
                ServantObject so = _servant_preinvoke("fulfills",com.ibm.commerce.security.Protectable.class);
                if (so == null) {
                    continue;
                }
                try {
                    Object[] copies = Util.copyObjects(new Object[]{arg0,arg1},_orb());
                    Long arg0Copy = (Long) copies[0];
                    String arg1Copy = (String) copies[1];
                    return ((com.ibm.commerce.security.Protectable)so.servant).fulfills(arg0Copy, arg1Copy);
                } catch (Throwable ex) {
                    Throwable exCopy = (Throwable)Util.copyObject(ex,_orb());
                    if (exCopy instanceof Exception) {
                        throw (Exception)exCopy;
                    }
                    throw Util.wrapException(exCopy);
                } finally {
                    _servant_postinvoke(so);
                }
            }
        }
    }
    
    public Long getOwner() throws Exception, RemoteException {
        while(true) {
            if (!Util.isLocal(this)) {
                InputStream in = null;
                try {
                    try {
                        OutputStream out = _request("getOwner", true);
                        in = (InputStream)_invoke(out);
                        return (Long) in.read_value(Long.class);
                    } catch (ApplicationException ex) {
                        in = (InputStream) ex.getInputStream();
                        String id = in.read_string();
                        if (id.equals("IDL:java/lang/Ex:1.0")) {
                            throw (Exception) in.read_value(Exception.class);
                        }
                        throw new UnexpectedException(id);
                    } catch (RemarshalException ex) {
                        continue;
                    }
                } catch (SystemException ex) {
                    throw Util.mapSystemException(ex);
                } finally {
                    _releaseReply(in);
                }
            } else {
                ServantObject so = _servant_preinvoke("getOwner",com.ibm.commerce.security.Protectable.class);
                if (so == null) {
                    continue;
                }
                try {
                    Long result = ((com.ibm.commerce.security.Protectable)so.servant).getOwner();
                    return (Long)Util.copyObject(result,_orb());
                } catch (Throwable ex) {
                    Throwable exCopy = (Throwable)Util.copyObject(ex,_orb());
                    if (exCopy instanceof Exception) {
                        throw (Exception)exCopy;
                    }
                    throw Util.wrapException(exCopy);
                } finally {
                    _servant_postinvoke(so);
                }
            }
        }
    }
}
