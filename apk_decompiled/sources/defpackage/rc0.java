package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class rc0 {
    public static final LinkedHashMap c;
    public final bf9 a;
    public final ConcurrentHashMap b;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (nc0 nc0Var : nc0.values()) {
            String str = nc0Var.E;
            if (linkedHashMap.get(str) == null) {
                linkedHashMap.put(str, nc0Var);
            }
        }
        c = linkedHashMap;
    }

    public rc0(bf9 bf9Var) {
        bf9Var.getClass();
        this.a = bf9Var;
        this.b = new ConcurrentHashMap();
    }

    public static ArrayList a(Object obj, boolean z) {
        jc0 jc0Var = (jc0) obj;
        jc0Var.getClass();
        Map mapF = jc0Var.f();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : mapF.entrySet()) {
            b54.t0(arrayList, (!z || x44.r((sxb) entry.getKey(), mj9.b)) ? j((il4) entry.getValue()) : lm6.E);
        }
        return arrayList;
    }

    public static Object c(Object obj, ww7 ww7Var) {
        for (Object obj2 : e(obj)) {
            if (x44.r(d(obj2), ww7Var)) {
                return obj2;
            }
        }
        return null;
    }

    public static ww7 d(Object obj) {
        jc0 jc0Var = (jc0) obj;
        jc0Var.getClass();
        return jc0Var.e();
    }

    public static Iterable e(Object obj) {
        wc0 annotations;
        jc0 jc0Var = (jc0) obj;
        jc0Var.getClass();
        qqb qqbVarD = o06.d(jc0Var);
        return (qqbVarD == null || (annotations = qqbVarD.getAnnotations()) == null) ? lm6.E : annotations;
    }

    public static boolean f(Object obj, ww7 ww7Var) {
        Iterable iterableE = e(obj);
        if ((iterableE instanceof Collection) && ((Collection) iterableE).isEmpty()) {
            return false;
        }
        Iterator it = iterableE.iterator();
        while (it.hasNext()) {
            if (x44.r(d(it.next()), ww7Var)) {
                return true;
            }
        }
        return false;
    }

    public static List j(il4 il4Var) {
        if (!(il4Var instanceof lp0)) {
            return il4Var instanceof mq6 ? x44.W(((mq6) il4Var).c().c()) : lm6.E;
        }
        Iterable iterable = (Iterable) ((lp0) il4Var).b();
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            b54.t0(arrayList, j((il4) it.next()));
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0121  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.ef9 b(defpackage.ef9 r14, defpackage.wc0 r15) {
        /*
            Method dump skipped, instruction units count: 421
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rc0.b(ef9, wc0):ef9");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0094, code lost:
    
        if (r9.equals("ALWAYS") != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x009d, code lost:
    
        if (r9.equals("UNKNOWN") == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00a6, code lost:
    
        if (r9.equals("NEVER") == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00af, code lost:
    
        if (r9.equals("MAYBE") == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00dd, code lost:
    
        if (r0.equals(defpackage.nj9.b()) != false) goto L57;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.q9c g(java.lang.Object r9, boolean r10) {
        /*
            Method dump skipped, instruction units count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rc0.g(java.lang.Object, boolean):q9c");
    }

    public final iie h(Object obj) {
        String str;
        bf9 bf9Var = this.a;
        iie iieVar = (iie) bf9Var.a.c.get(d(obj));
        if (iieVar != null) {
            return iieVar;
        }
        Object objC = c(obj, oc0.d());
        if (objC == null || (str = (String) w44.M0(a(objC, false))) == null) {
            return null;
        }
        iie iieVar2 = bf9Var.a.b;
        if (iieVar2 != null) {
            return iieVar2;
        }
        int iHashCode = str.hashCode();
        if (iHashCode == -2137067054) {
            if (str.equals("IGNORE")) {
                return iie.IGNORE;
            }
            return null;
        }
        if (iHashCode == -1838656823) {
            if (str.equals("STRICT")) {
                return iie.STRICT;
            }
            return null;
        }
        if (iHashCode == 2656902 && str.equals("WARN")) {
            return iie.WARN;
        }
        return null;
    }

    public final Object i(Object obj) {
        Object objI;
        obj.getClass();
        if (!this.a.a.d) {
            if (w44.G0(oc0.b(), d(obj)) || f(obj, oc0.f())) {
                return obj;
            }
            if (f(obj, oc0.g())) {
                qqb qqbVarD = o06.d((jc0) obj);
                qqbVarD.getClass();
                ConcurrentHashMap concurrentHashMap = this.b;
                Object obj2 = concurrentHashMap.get(qqbVarD);
                if (obj2 != null) {
                    return obj2;
                }
                Iterator it = e(obj).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        objI = null;
                        break;
                    }
                    objI = i(it.next());
                    if (objI != null) {
                        break;
                    }
                }
                if (objI != null) {
                    Object objPutIfAbsent = concurrentHashMap.putIfAbsent(qqbVarD, objI);
                    return objPutIfAbsent == null ? objI : objPutIfAbsent;
                }
            }
        }
        return null;
    }
}
