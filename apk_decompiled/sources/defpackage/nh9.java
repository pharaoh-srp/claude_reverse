package defpackage;

import java.lang.annotation.Annotation;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
public abstract class nh9 {
    public static final a5 a = new a5(17);

    public static final int a(SerialDescriptor serialDescriptor, bg9 bg9Var, String str) {
        serialDescriptor.getClass();
        bg9Var.getClass();
        str.getClass();
        d(bg9Var, serialDescriptor);
        int iD = serialDescriptor.d(str);
        if (iD != -3 || !bg9Var.a.i) {
            return iD;
        }
        efe efeVar = bg9Var.c;
        vc8 vc8Var = new vc8(serialDescriptor, 4, bg9Var);
        efeVar.getClass();
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) efeVar.F;
        Map map = (Map) concurrentHashMap.get(serialDescriptor);
        a5 a5Var = a;
        Object obj = map != null ? map.get(a5Var) : null;
        Object objA = obj != null ? obj : null;
        if (objA == null) {
            objA = vc8Var.a();
            Object concurrentHashMap2 = concurrentHashMap.get(serialDescriptor);
            if (concurrentHashMap2 == null) {
                concurrentHashMap2 = new ConcurrentHashMap(2);
                concurrentHashMap.put(serialDescriptor, concurrentHashMap2);
            }
            ((Map) concurrentHashMap2).put(a5Var, objA);
        }
        Integer num = (Integer) ((Map) objA).get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    public static final int b(SerialDescriptor serialDescriptor, bg9 bg9Var, String str, String str2) {
        serialDescriptor.getClass();
        bg9Var.getClass();
        str.getClass();
        int iA = a(serialDescriptor, bg9Var, str);
        if (iA != -3) {
            return iA;
        }
        throw new SerializationException(serialDescriptor.a() + " does not contain element with name '" + str + '\'' + str2);
    }

    public static final boolean c(bg9 bg9Var, SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        bg9Var.getClass();
        if (bg9Var.a.b) {
            return true;
        }
        List annotations = serialDescriptor.getAnnotations();
        if ((annotations instanceof Collection) && annotations.isEmpty()) {
            return false;
        }
        Iterator it = annotations.iterator();
        while (it.hasNext()) {
            if (((Annotation) it.next()) instanceof hh9) {
                return true;
            }
        }
        return false;
    }

    public static final void d(bg9 bg9Var, SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        bg9Var.getClass();
        x44.r(serialDescriptor.getKind(), vsg.l);
    }
}
