package defpackage;

import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.shaded.protobuf.a;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes3.dex */
public abstract class tde {
    public static final AtomicReference a;
    public static final ConcurrentHashMap b;
    public static final ConcurrentHashMap c;
    public static final ConcurrentHashMap d;

    static {
        Logger.getLogger(tde.class.getName());
        a = new AtomicReference(new zo9());
        b = new ConcurrentHashMap();
        c = new ConcurrentHashMap();
        new ConcurrentHashMap();
        d = new ConcurrentHashMap();
    }

    public static synchronized void a(String str, Map map, boolean z) {
        if (z) {
            try {
                ConcurrentHashMap concurrentHashMap = c;
                if (concurrentHashMap.containsKey(str) && !((Boolean) concurrentHashMap.get(str)).booleanValue()) {
                    throw new GeneralSecurityException("New keys are already disallowed for key type " + str);
                }
            } finally {
            }
        }
        if (z) {
            if (((zo9) a.get()).a.containsKey(str)) {
                for (Map.Entry entry : map.entrySet()) {
                    if (!d.containsKey(entry.getKey())) {
                        throw new GeneralSecurityException("Attempted to register a new key template " + ((String) entry.getKey()) + " from an existing key manager of type " + str);
                    }
                }
            } else {
                for (Map.Entry entry2 : map.entrySet()) {
                    if (d.containsKey(entry2.getKey())) {
                        throw new GeneralSecurityException("Attempted overwrite of a registered key template " + ((String) entry2.getKey()));
                    }
                }
            }
        }
    }

    public static Object b(ybi ybiVar, Class cls) throws GeneralSecurityException {
        qfd qfdVar = (qfd) zvb.b.a.get();
        qfdVar.getClass();
        pfd pfdVar = new pfd(ybiVar.getClass(), cls);
        HashMap map = qfdVar.a;
        if (map.containsKey(pfdVar)) {
            return ((ifd) map.get(pfdVar)).b.c(ybiVar);
        }
        poc.k(pfdVar, " available", "No PrimitiveConstructor for ");
        return null;
    }

    public static Object c(String str, k22 k22Var, Class cls) throws GeneralSecurityException {
        zo9 zo9Var = (zo9) a.get();
        zo9Var.getClass();
        yo9 yo9VarA = zo9Var.a(str);
        Set setKeySet = yo9VarA.a.b.keySet();
        yf yfVar = yo9VarA.a;
        if (!setKeySet.contains(cls)) {
            StringBuilder sb = new StringBuilder("Primitive type ");
            sb.append(cls.getName());
            sb.append(" not supported by key manager of type ");
            sb.append(yfVar.getClass());
            sb.append(", supported primitives: ");
            Set<Class> setKeySet2 = yfVar.b.keySet();
            StringBuilder sb2 = new StringBuilder();
            boolean z = true;
            for (Class cls2 : setKeySet2) {
                if (!z) {
                    sb2.append(", ");
                }
                sb2.append(cls2.getCanonicalName());
                z = false;
            }
            sb.append(sb2.toString());
            throw new GeneralSecurityException(sb.toString());
        }
        try {
            if (!yfVar.b.keySet().contains(cls) && !Void.class.equals(cls)) {
                throw new IllegalArgumentException("Given internalKeyMananger " + yfVar.toString() + " does not support primitive class " + cls.getName());
            }
            try {
                a aVarH = yfVar.h(k22Var);
                if (Void.class.equals(cls)) {
                    throw new GeneralSecurityException("Cannot create a primitive for Void");
                }
                yfVar.i(aVarH);
                wf wfVar = (wf) yfVar.b.get(cls);
                if (wfVar != null) {
                    return wfVar.a(aVarH);
                }
                sz6.i(cls.getCanonicalName(), " not supported.", "Requested primitive class ");
                return null;
            } catch (InvalidProtocolBufferException e) {
                throw new GeneralSecurityException("Failures parsing proto of type ".concat(yfVar.a.getName()), e);
            }
        } catch (IllegalArgumentException e2) {
            throw new GeneralSecurityException("Primitive type not supported", e2);
        }
    }

    public static Object d(String str, byte[] bArr) {
        g22 g22Var = k22.F;
        return c(str, k22.e(bArr, 0, bArr.length), lf.class);
    }

    public static synchronized ro9 e(fp9 fp9Var) {
        ro6 ro6Var;
        yf yfVar = ((zo9) a.get()).a(fp9Var.B()).a;
        ro6Var = new ro6(yfVar, yfVar.c);
        if (!((Boolean) c.get(fp9Var.B())).booleanValue()) {
            throw new GeneralSecurityException("newKey-operation not permitted for key type " + fp9Var.B());
        }
        return ro6Var.a0(fp9Var.C());
    }

    public static synchronized void f(yf yfVar, boolean z) {
        try {
            AtomicReference atomicReference = a;
            zo9 zo9Var = new zo9((zo9) atomicReference.get());
            zo9Var.b(yfVar);
            String strF = yfVar.f();
            a(strF, z ? yfVar.g().l() : Collections.EMPTY_MAP, z);
            if (!((zo9) atomicReference.get()).a.containsKey(strF)) {
                b.put(strF, new bm4());
                if (z) {
                    g(strF, yfVar.g().l());
                }
            }
            c.put(strF, Boolean.valueOf(z));
            atomicReference.set(zo9Var);
        } catch (Throwable th) {
            throw th;
        }
    }

    public static void g(String str, Map map) {
        bmc bmcVar;
        for (Map.Entry entry : map.entrySet()) {
            String str2 = (String) entry.getKey();
            byte[] bArrE = ((a) ((ip9) entry.getValue()).a).e();
            int i = ((ip9) entry.getValue()).b;
            ep9 ep9VarD = fp9.D();
            ep9VarD.f();
            fp9.w((fp9) ep9VarD.F, str);
            g22 g22VarE = k22.e(bArrE, 0, bArrE.length);
            ep9VarD.f();
            fp9.x((fp9) ep9VarD.F, g22VarE);
            int iF = sq6.F(i);
            if (iF == 0) {
                bmcVar = bmc.TINK;
            } else if (iF == 1) {
                bmcVar = bmc.LEGACY;
            } else if (iF == 2) {
                bmcVar = bmc.RAW;
            } else {
                if (iF != 3) {
                    sz6.p("Unknown output prefix type");
                    return;
                }
                bmcVar = bmc.CRUNCHY;
            }
            ep9VarD.f();
            fp9.y((fp9) ep9VarD.F, bmcVar);
            d.put(str2, new gp9((fp9) ep9VarD.b()));
        }
    }

    public static synchronized void h(wfd wfdVar) {
        zvb zvbVar = zvb.b;
        synchronized (zvbVar) {
            epk epkVar = new epk((qfd) zvbVar.a.get());
            epkVar.w(wfdVar);
            zvbVar.a.set(new qfd(epkVar));
        }
    }
}
