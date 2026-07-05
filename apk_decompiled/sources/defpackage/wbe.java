package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes3.dex */
public final class wbe extends sbe {
    public final Object a;

    public wbe(Object obj) {
        obj.getClass();
        this.a = obj;
    }

    @Override // defpackage.sbe
    public final Member c() throws IllegalAccessException, InvocationTargetException {
        Object obj = this.a;
        obj.getClass();
        qb5 qb5Var = vwk.a;
        Method method = null;
        if (qb5Var == null) {
            Class<?> cls = obj.getClass();
            boolean z = false;
            try {
                qb5Var = new qb5(cls.getMethod("getType", null), cls.getMethod("getAccessor", null), z);
            } catch (NoSuchMethodException unused) {
                qb5Var = new qb5(method, method, z);
            }
            vwk.a = qb5Var;
        }
        Method method2 = (Method) qb5Var.F;
        if (method2 != null) {
            Object objInvoke = method2.invoke(obj, null);
            objInvoke.getClass();
            method = (Method) objInvoke;
        }
        if (method != null) {
            return method;
        }
        throw new NoSuchMethodError("Can't find `getAccessor` method");
    }

    public final xbe j() throws IllegalAccessException, InvocationTargetException {
        Object obj = this.a;
        obj.getClass();
        qb5 qb5Var = vwk.a;
        Class cls = null;
        if (qb5Var == null) {
            Class<?> cls2 = obj.getClass();
            boolean z = false;
            try {
                qb5Var = new qb5(cls2.getMethod("getType", null), cls2.getMethod("getAccessor", null), z);
            } catch (NoSuchMethodException unused) {
                qb5Var = new qb5(cls, cls, z);
            }
            vwk.a = qb5Var;
        }
        Method method = (Method) qb5Var.E;
        if (method != null) {
            Object objInvoke = method.invoke(obj, null);
            objInvoke.getClass();
            cls = (Class) objInvoke;
        }
        if (cls != null) {
            return new mbe(cls);
        }
        throw new NoSuchMethodError("Can't find `getType` method");
    }
}
