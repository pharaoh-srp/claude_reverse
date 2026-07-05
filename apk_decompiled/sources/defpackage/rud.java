package defpackage;

import com.google.protobuf.d;
import com.google.protobuf.e;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class rud {
    public static final rud c = new rud();
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    public final gmf a = new gmf(1);

    public final f7f a(Class cls) {
        f7f f7fVarU;
        Class cls2;
        u89.a("messageType", cls);
        ConcurrentHashMap concurrentHashMap = this.b;
        f7f f7fVar = (f7f) concurrentHashMap.get(cls);
        if (f7fVar != null) {
            return f7fVar;
        }
        gmf gmfVar = this.a;
        gmfVar.getClass();
        Class cls3 = j7f.a;
        if (!v28.class.isAssignableFrom(cls) && (cls2 = j7f.a) != null && !cls2.isAssignableFrom(cls)) {
            sz6.p("Message classes must extend GeneratedMessageV3 or GeneratedMessageLite");
            return null;
        }
        f2e f2eVarA = ((eqa) gmfVar.F).a(cls);
        if ((f2eVarA.d & 2) == 2) {
            if (v28.class.isAssignableFrom(cls)) {
                f7fVarU = mib.h(j7f.d, yc7.a, f2eVarA.a);
            } else {
                e eVar = j7f.b;
                tc7 tc7Var = yc7.b;
                if (tc7Var == null) {
                    sz6.j("Protobuf runtime is not correctly loaded.");
                    return null;
                }
                f7fVarU = mib.h(eVar, tc7Var, f2eVarA.a);
            }
        } else if (v28.class.isAssignableFrom(cls)) {
            f7fVarU = (f2eVarA.d & 1) == 1 ? d.u(f2eVarA, z2c.b, a9a.b, j7f.d, yc7.a, qsa.b) : d.u(f2eVarA, z2c.b, a9a.b, j7f.d, null, qsa.b);
        } else if ((f2eVarA.d & 1) == 1) {
            u2c u2cVar = z2c.a;
            v8a v8aVar = a9a.a;
            e eVar2 = j7f.b;
            tc7 tc7Var2 = yc7.b;
            if (tc7Var2 == null) {
                sz6.j("Protobuf runtime is not correctly loaded.");
                return null;
            }
            f7fVarU = d.u(f2eVarA, u2cVar, v8aVar, eVar2, tc7Var2, qsa.a);
        } else {
            f7fVarU = d.u(f2eVarA, z2c.a, a9a.a, j7f.c, null, qsa.a);
        }
        f7f f7fVar2 = (f7f) concurrentHashMap.putIfAbsent(cls, f7fVarU);
        return f7fVar2 != null ? f7fVar2 : f7fVarU;
    }
}
