package defpackage;

import androidx.health.platform.client.proto.a0;
import androidx.health.platform.client.proto.n;
import androidx.health.platform.client.proto.p;
import androidx.health.platform.client.proto.q;
import androidx.health.platform.client.proto.y;
import java.nio.charset.Charset;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class oud {
    public static final oud c = new oud();
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    public final poj a = new poj(3);

    public final d7f a(Class cls) {
        rc7 rc7Var;
        d7f d7fVarW;
        Class cls2;
        Charset charset = s89.a;
        if (cls == null) {
            mr9.h("messageType");
            return null;
        }
        ConcurrentHashMap concurrentHashMap = this.b;
        d7f d7fVar = (d7f) concurrentHashMap.get(cls);
        if (d7fVar != null) {
            return d7fVar;
        }
        poj pojVar = this.a;
        pojVar.getClass();
        Class cls3 = y.a;
        if (!n.class.isAssignableFrom(cls) && (cls2 = y.a) != null && !cls2.isAssignableFrom(cls)) {
            sz6.p("Message classes must extend GeneratedMessage or GeneratedMessageLite");
            return null;
        }
        d2e d2eVarA = ((cqa) pojVar.E).a(cls);
        if ((d2eVarA.d & 2) == 2) {
            if (n.class.isAssignableFrom(cls)) {
                d7fVarW = new q(y.c, wc7.a, d2eVarA.a);
            } else {
                a0 a0Var = y.b;
                rc7 rc7Var2 = wc7.b;
                if (rc7Var2 == null) {
                    sz6.j("Protobuf runtime is not correctly loaded.");
                    return null;
                }
                d7fVarW = new q(a0Var, rc7Var2, d2eVarA.a);
            }
        } else if (n.class.isAssignableFrom(cls)) {
            s2c s2cVar = x2c.b;
            c9a c9aVar = f9a.b;
            uei ueiVar = y.c;
            rc7 rc7Var3 = sq6.F(d2eVarA.a()) != 1 ? wc7.a : null;
            jsa jsaVar = osa.b;
            if (!(d2eVarA instanceof d2e)) {
                int[] iArr = p.m;
                mr9.o();
                return null;
            }
            d7fVarW = p.w(d2eVarA, s2cVar, c9aVar, ueiVar, rc7Var3, jsaVar);
        } else {
            s2c s2cVar2 = x2c.a;
            c9a c9aVar2 = f9a.a;
            a0 a0Var2 = y.b;
            if (sq6.F(d2eVarA.a()) != 1) {
                rc7 rc7Var4 = wc7.b;
                if (rc7Var4 == null) {
                    sz6.j("Protobuf runtime is not correctly loaded.");
                    return null;
                }
                rc7Var = rc7Var4;
            } else {
                rc7Var = null;
            }
            jsa jsaVar2 = osa.a;
            if (!(d2eVarA instanceof d2e)) {
                int[] iArr2 = p.m;
                mr9.o();
                return null;
            }
            d7fVarW = p.w(d2eVarA, s2cVar2, c9aVar2, a0Var2, rc7Var, jsaVar2);
        }
        d7f d7fVar2 = (d7f) concurrentHashMap.putIfAbsent(cls, d7fVarW);
        return d7fVar2 != null ? d7fVar2 : d7fVarW;
    }
}
