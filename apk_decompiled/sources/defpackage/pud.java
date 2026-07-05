package defpackage;

import com.google.crypto.tink.shaded.protobuf.f;
import com.google.crypto.tink.shaded.protobuf.h;
import com.google.crypto.tink.shaded.protobuf.i;
import com.google.crypto.tink.shaded.protobuf.j;
import com.google.crypto.tink.shaded.protobuf.k;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class pud {
    public static final pud c = new pud();
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    public final ive a = new ive(4);

    public final e7f a(Class cls) {
        e7f e7fVarB;
        Class cls2;
        t89.a("messageType", cls);
        ConcurrentHashMap concurrentHashMap = this.b;
        e7f e7fVar = (e7f) concurrentHashMap.get(cls);
        if (e7fVar != null) {
            return e7fVar;
        }
        ive iveVar = this.a;
        iveVar.getClass();
        Class cls3 = j.a;
        if (!f.class.isAssignableFrom(cls) && (cls2 = j.a) != null && !cls2.isAssignableFrom(cls)) {
            sz6.p("Message classes must extend GeneratedMessageV3 or GeneratedMessageLite");
            return null;
        }
        e2e e2eVarA = ((dqa) iveVar.F).a(cls);
        if ((e2eVarA.d & 2) == 2) {
            if (f.class.isAssignableFrom(cls)) {
                e7fVarB = new i(j.d, xc7.a, e2eVarA.a);
            } else {
                k kVar = j.b;
                sc7 sc7Var = xc7.b;
                if (sc7Var == null) {
                    sz6.j("Protobuf runtime is not correctly loaded.");
                    return null;
                }
                e7fVarB = new i(kVar, sc7Var, e2eVarA.a);
            }
        } else if (f.class.isAssignableFrom(cls)) {
            e7fVarB = (e2eVarA.d & 1) == 1 ? h.B(e2eVarA, y2c.b, z8a.b, j.d, xc7.a, psa.b) : h.B(e2eVarA, y2c.b, z8a.b, j.d, null, psa.b);
        } else if ((e2eVarA.d & 1) == 1) {
            t2c t2cVar = y2c.a;
            w8a w8aVar = z8a.a;
            k kVar2 = j.b;
            sc7 sc7Var2 = xc7.b;
            if (sc7Var2 == null) {
                sz6.j("Protobuf runtime is not correctly loaded.");
                return null;
            }
            e7fVarB = h.B(e2eVarA, t2cVar, w8aVar, kVar2, sc7Var2, psa.a);
        } else {
            e7fVarB = h.B(e2eVarA, y2c.a, z8a.a, j.c, null, psa.a);
        }
        e7f e7fVar2 = (e7f) concurrentHashMap.putIfAbsent(cls, e7fVarB);
        return e7fVar2 != null ? e7fVar2 : e7fVarB;
    }
}
