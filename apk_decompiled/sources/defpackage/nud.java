package defpackage;

import androidx.glance.appwidget.protobuf.f;
import androidx.glance.appwidget.protobuf.h;
import androidx.glance.appwidget.protobuf.i;
import androidx.glance.appwidget.protobuf.j;
import androidx.glance.appwidget.protobuf.k;
import androidx.glance.appwidget.protobuf.m;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class nud {
    public static final nud c = new nud();
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    public final ive a = new ive(3);

    public final c7f a(Class cls) {
        qc7 qc7Var;
        c7f c7fVarW;
        Class cls2;
        r89.a("messageType", cls);
        ConcurrentHashMap concurrentHashMap = this.b;
        c7f c7fVar = (c7f) concurrentHashMap.get(cls);
        if (c7fVar != null) {
            return c7fVar;
        }
        ive iveVar = this.a;
        iveVar.getClass();
        Class cls3 = j.a;
        if (!f.class.isAssignableFrom(cls) && (cls2 = j.a) != null && !cls2.isAssignableFrom(cls)) {
            sz6.p("Message classes must extend GeneratedMessage or GeneratedMessageLite");
            return null;
        }
        c2e c2eVarA = ((bqa) iveVar.F).a(cls);
        if ((c2eVarA.d & 2) == 2) {
            if (f.class.isAssignableFrom(cls)) {
                c7fVarW = new i(j.c, vc7.a, c2eVarA.a);
            } else {
                k kVar = j.b;
                qc7 qc7Var2 = vc7.b;
                if (qc7Var2 == null) {
                    sz6.j("Protobuf runtime is not correctly loaded.");
                    return null;
                }
                c7fVarW = new i(kVar, qc7Var2, c2eVarA.a);
            }
        } else if (f.class.isAssignableFrom(cls)) {
            r2c r2cVar = w2c.b;
            b9a b9aVar = e9a.b;
            m mVar = j.c;
            qc7 qc7Var3 = sq6.F(c2eVarA.a()) != 1 ? vc7.a : null;
            isa isaVar = nsa.b;
            if (!(c2eVarA instanceof c2e)) {
                int[] iArr = h.n;
                mr9.o();
                return null;
            }
            c7fVarW = h.w(c2eVarA, r2cVar, b9aVar, mVar, qc7Var3, isaVar);
        } else {
            r2c r2cVar2 = w2c.a;
            b9a b9aVar2 = e9a.a;
            k kVar2 = j.b;
            if (sq6.F(c2eVarA.a()) != 1) {
                qc7 qc7Var4 = vc7.b;
                if (qc7Var4 == null) {
                    sz6.j("Protobuf runtime is not correctly loaded.");
                    return null;
                }
                qc7Var = qc7Var4;
            } else {
                qc7Var = null;
            }
            isa isaVar2 = nsa.a;
            if (!(c2eVarA instanceof c2e)) {
                int[] iArr2 = h.n;
                mr9.o();
                return null;
            }
            c7fVarW = h.w(c2eVarA, r2cVar2, b9aVar2, kVar2, qc7Var, isaVar2);
        }
        c7f c7fVar2 = (c7f) concurrentHashMap.putIfAbsent(cls, c7fVarW);
        return c7fVar2 != null ? c7fVar2 : c7fVarW;
    }
}
