// Tie class generated by rmic, do not edit.
// Contents subject to change without notice.

package com.ibm.commerce.extension.objects;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Object;
import java.lang.String;
import java.lang.Throwable;
import java.rmi.Remote;
import java.sql.Timestamp;
import java.util.Enumeration;
import javax.ejb.CreateException;
import javax.ejb.EJBMetaData;
import javax.ejb.FinderException;
import javax.ejb.Handle;
import javax.ejb.HomeHandle;
import javax.ejb.RemoveException;
import javax.rmi.CORBA.Tie;
import javax.rmi.CORBA.Util;
import org.omg.CORBA.BAD_OPERATION;
import org.omg.CORBA.ORB;
import org.omg.CORBA.SystemException;
import org.omg.CORBA.portable.Delegate;
import org.omg.CORBA.portable.InputStream;
import org.omg.CORBA.portable.OutputStream;
import org.omg.CORBA.portable.ResponseHandler;
import org.omg.CORBA.portable.UnknownException;

public class _EJSRemoteCMPXaddressRelationHome_0c064b7f_Tie extends org.omg.CORBA_2_3.portable.ObjectImpl implements Tie {
    
    private EJSRemoteCMPXaddressRelationHome_0c064b7f target = null;
    private ORB orb = null;
    
    private static final String[] _type_ids = {
        "RMI:com.ibm.commerce.extension.objects.XaddressRelationHome:0000000000000000", 
        "RMI:javax.ejb.EJBHome:0000000000000000", 
        "RMI:javax.ejb.EJBObject:0000000000000000", 
        "RMI:com.ibm.websphere.csi.CSIServant:0000000000000000", 
        "RMI:com.ibm.websphere.csi.TransactionalObject:0000000000000000"
    };
    
    public void setTarget(Remote target) {
        this.target = (EJSRemoteCMPXaddressRelationHome_0c064b7f) target;
    }
    
    public Remote getTarget() {
        return target;
    }
    
    public org.omg.CORBA.Object thisObject() {
        return this;
    }
    
    public void deactivate() {
        if (orb != null) {
            orb.disconnect(this);
            _set_delegate(null);
        }
    }
    
    public ORB orb() {
        return _orb();
    }
    
    public void orb(ORB orb) {
        orb.connect(this);
    }
    
    public void _set_delegate(Delegate del) {
        super._set_delegate(del);
        if (del != null)
            orb = _orb();
        else
            orb = null;
    }
    
    public String[] _ids() { 
        return _type_ids;
    }
    
    public OutputStream _invoke(String method, InputStream _in, ResponseHandler reply) throws SystemException {
        try {
            org.omg.CORBA_2_3.portable.InputStream in = 
                (org.omg.CORBA_2_3.portable.InputStream) _in;
            switch (method.length()) {
                case 11: 
                    if (method.equals("findbyRrcId")) {
                        return findbyRrcId(in, reply);
                    }
                case 14: 
                    if (method.equals("findbyBillToId")) {
                        return findbyBillToId(in, reply);
                    }
                case 15: 
                    if (method.equals("_get_homeHandle")) {
                        return _get_homeHandle(in, reply);
                    }
                case 16: 
                    if (method.equals("_get_EJBMetaData")) {
                        return _get_EJBMetaData(in, reply);
                    } else if (method.equals("findByPrimaryKey")) {
                        return findByPrimaryKey(in, reply);
                    }
                case 24: 
                    if (method.equals("remove__java_lang_Object")) {
                        return remove__java_lang_Object(in, reply);
                    } else if (method.equals("remove__javax_ejb_Handle")) {
                        return remove__javax_ejb_Handle(in, reply);
                    }
                case 54: 
                    if (method.equals("create__java_lang_Long__java_lang_Long__java_lang_Long")) {
                        return create__java_lang_Long__java_lang_Long__java_lang_Long(in, reply);
                    }
                case 173: 
                    if (method.equals("create__java_lang_Long__CORBA_WStringValue__java_lang_Long__CORBA_WStringValue__java_lang_Long__CORBA_WStringValue__java_sql_Timestamp__java_sql_Timestamp__java_lang_Integer")) {
                        return create__java_lang_Long__CORBA_WStringValue__java_lang_Long__CORBA_WStringValue__java_lang_Long__CORBA_WStringValue__java_sql_Timestamp__java_sql_Timestamp__java_lang_Integer(in, reply);
                    }
            }
            throw new BAD_OPERATION();
        } catch (SystemException ex) {
            throw ex;
        } catch (Throwable ex) {
            throw new UnknownException(ex);
        }
    }
    
    private OutputStream remove__javax_ejb_Handle(org.omg.CORBA_2_3.portable.InputStream in , ResponseHandler reply) throws Throwable {
        Handle arg0 = (Handle) in.read_abstract_interface(Handle.class);
        try {
            target.remove(arg0);
        } catch (RemoveException ex) {
            String id = "IDL:javax/ejb/RemoveEx:1.0";
            org.omg.CORBA_2_3.portable.OutputStream out = 
                (org.omg.CORBA_2_3.portable.OutputStream) reply.createExceptionReply();
            out.write_string(id);
            out.write_value(ex,RemoveException.class);
            return out;
        }
        OutputStream out = reply.createReply();
        return out;
    }
    
    private OutputStream remove__java_lang_Object(org.omg.CORBA_2_3.portable.InputStream in , ResponseHandler reply) throws Throwable {
        Object arg0 = Util.readAny(in);
        try {
            target.remove(arg0);
        } catch (RemoveException ex) {
            String id = "IDL:javax/ejb/RemoveEx:1.0";
            org.omg.CORBA_2_3.portable.OutputStream out = 
                (org.omg.CORBA_2_3.portable.OutputStream) reply.createExceptionReply();
            out.write_string(id);
            out.write_value(ex,RemoveException.class);
            return out;
        }
        OutputStream out = reply.createReply();
        return out;
    }
    
    private OutputStream _get_EJBMetaData(org.omg.CORBA_2_3.portable.InputStream in , ResponseHandler reply) throws Throwable {
        EJBMetaData result = target.getEJBMetaData();
        org.omg.CORBA_2_3.portable.OutputStream out = 
            (org.omg.CORBA_2_3.portable.OutputStream) reply.createReply();
        out.write_value((Serializable)result,EJBMetaData.class);
        return out;
    }
    
    private OutputStream _get_homeHandle(org.omg.CORBA_2_3.portable.InputStream in , ResponseHandler reply) throws Throwable {
        HomeHandle result = target.getHomeHandle();
        OutputStream out = reply.createReply();
        Util.writeAbstractObject(out,result);
        return out;
    }
    
    private OutputStream create__java_lang_Long__java_lang_Long__java_lang_Long(org.omg.CORBA_2_3.portable.InputStream in , ResponseHandler reply) throws Throwable {
        Long arg0 = (Long) in.read_value(Long.class);
        Long arg1 = (Long) in.read_value(Long.class);
        Long arg2 = (Long) in.read_value(Long.class);
        XaddressRelation result;
        try {
            result = target.create(arg0, arg1, arg2);
        } catch (CreateException ex) {
            String id = "IDL:javax/ejb/CreateEx:1.0";
            org.omg.CORBA_2_3.portable.OutputStream out = 
                (org.omg.CORBA_2_3.portable.OutputStream) reply.createExceptionReply();
            out.write_string(id);
            out.write_value(ex,CreateException.class);
            return out;
        }
        OutputStream out = reply.createReply();
        Util.writeRemoteObject(out,result);
        return out;
    }
    
    private OutputStream findByPrimaryKey(org.omg.CORBA_2_3.portable.InputStream in , ResponseHandler reply) throws Throwable {
        XaddressRelationKey arg0 = (XaddressRelationKey) in.read_value(XaddressRelationKey.class);
        XaddressRelation result;
        try {
            result = target.findByPrimaryKey(arg0);
        } catch (FinderException ex) {
            String id = "IDL:javax/ejb/FinderEx:1.0";
            org.omg.CORBA_2_3.portable.OutputStream out = 
                (org.omg.CORBA_2_3.portable.OutputStream) reply.createExceptionReply();
            out.write_string(id);
            out.write_value(ex,FinderException.class);
            return out;
        }
        OutputStream out = reply.createReply();
        Util.writeRemoteObject(out,result);
        return out;
    }
    
    private OutputStream findbyBillToId(org.omg.CORBA_2_3.portable.InputStream in , ResponseHandler reply) throws Throwable {
        Long arg0 = (Long) in.read_value(Long.class);
        Enumeration result;
        try {
            result = target.findbyBillToId(arg0);
        } catch (FinderException ex) {
            String id = "IDL:javax/ejb/FinderEx:1.0";
            org.omg.CORBA_2_3.portable.OutputStream out = 
                (org.omg.CORBA_2_3.portable.OutputStream) reply.createExceptionReply();
            out.write_string(id);
            out.write_value(ex,FinderException.class);
            return out;
        }
        org.omg.CORBA_2_3.portable.OutputStream out = 
            (org.omg.CORBA_2_3.portable.OutputStream) reply.createReply();
        out.write_value((Serializable)result,Enumeration.class);
        return out;
    }
    
    private OutputStream create__java_lang_Long__CORBA_WStringValue__java_lang_Long__CORBA_WStringValue__java_lang_Long__CORBA_WStringValue__java_sql_Timestamp__java_sql_Timestamp__java_lang_Integer(org.omg.CORBA_2_3.portable.InputStream in , ResponseHandler reply) throws Throwable {
        Long arg0 = (Long) in.read_value(Long.class);
        String arg1 = (String) in.read_value(String.class);
        Long arg2 = (Long) in.read_value(Long.class);
        String arg3 = (String) in.read_value(String.class);
        Long arg4 = (Long) in.read_value(Long.class);
        String arg5 = (String) in.read_value(String.class);
        Timestamp arg6 = (Timestamp) in.read_value(Timestamp.class);
        Timestamp arg7 = (Timestamp) in.read_value(Timestamp.class);
        Integer arg8 = (Integer) in.read_value(Integer.class);
        XaddressRelation result;
        try {
            result = target.create(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        } catch (CreateException ex) {
            String id = "IDL:javax/ejb/CreateEx:1.0";
            org.omg.CORBA_2_3.portable.OutputStream out = 
                (org.omg.CORBA_2_3.portable.OutputStream) reply.createExceptionReply();
            out.write_string(id);
            out.write_value(ex,CreateException.class);
            return out;
        }
        OutputStream out = reply.createReply();
        Util.writeRemoteObject(out,result);
        return out;
    }
    
    private OutputStream findbyRrcId(org.omg.CORBA_2_3.portable.InputStream in , ResponseHandler reply) throws Throwable {
        Long arg0 = (Long) in.read_value(Long.class);
        Enumeration result;
        try {
            result = target.findbyRrcId(arg0);
        } catch (FinderException ex) {
            String id = "IDL:javax/ejb/FinderEx:1.0";
            org.omg.CORBA_2_3.portable.OutputStream out = 
                (org.omg.CORBA_2_3.portable.OutputStream) reply.createExceptionReply();
            out.write_string(id);
            out.write_value(ex,FinderException.class);
            return out;
        }
        org.omg.CORBA_2_3.portable.OutputStream out = 
            (org.omg.CORBA_2_3.portable.OutputStream) reply.createReply();
        out.write_value((Serializable)result,Enumeration.class);
        return out;
    }
}
