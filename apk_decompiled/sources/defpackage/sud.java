package defpackage;

import androidx.datastore.preferences.protobuf.f;
import androidx.datastore.preferences.protobuf.h;
import androidx.datastore.preferences.protobuf.i;
import androidx.datastore.preferences.protobuf.j;
import androidx.datastore.preferences.protobuf.k;
import androidx.datastore.preferences.protobuf.m;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class sud {
    public static final sud c = new sud();
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    public final tk5 a = new tk5(2);

    public final g7f a(Class cls) {
        uc7 uc7Var;
        g7f g7fVarW;
        w89.a("messageType", cls);
        ConcurrentHashMap concurrentHashMap = this.b;
        g7f g7fVar = (g7f) concurrentHashMap.get(cls);
        if (g7fVar != null) {
            return g7fVar;
        }
        tk5 tk5Var = this.a;
        tk5Var.getClass();
        Class cls2 = j.a;
        if (!f.class.isAssignableFrom(cls)) {
            Class cls3 = az.a;
            Class cls4 = j.a;
            if (cls4 != null && !cls4.isAssignableFrom(cls)) {
                sz6.p("Message classes must extend GeneratedMessage or GeneratedMessageLite");
                return null;
            }
        }
        g2e g2eVarA = ((fqa) tk5Var.F).a(cls);
        if ((g2eVarA.d & 2) == 2) {
            Class cls5 = az.a;
            if (f.class.isAssignableFrom(cls)) {
                g7fVarW = i.j(j.c, zc7.a, g2eVarA.a);
            } else {
                k kVar = j.b;
                uc7 uc7Var2 = zc7.b;
                if (uc7Var2 == null) {
                    sz6.j("Protobuf runtime is not correctly loaded.");
                    return null;
                }
                g7fVarW = i.j(kVar, uc7Var2, g2eVarA.a);
            }
        } else {
            Class cls6 = az.a;
            if (f.class.isAssignableFrom(cls)) {
                v2c v2cVar = a3c.b;
                d9a d9aVar = g9a.b;
                m mVar = j.c;
                uc7 uc7Var3 = sq6.F(g2eVarA.a()) != 1 ? zc7.a : null;
                msa msaVar = rsa.b;
                if (!(g2eVarA instanceof g2e)) {
                    int[] iArr = h.n;
                    mr9.o();
                    return null;
                }
                g7fVarW = h.w(g2eVarA, v2cVar, d9aVar, mVar, uc7Var3, msaVar);
            } else {
                v2c v2cVar2 = a3c.a;
                d9a d9aVar2 = g9a.a;
                k kVar2 = j.b;
                if (sq6.F(g2eVarA.a()) != 1) {
                    uc7 uc7Var4 = zc7.b;
                    if (uc7Var4 == null) {
                        sz6.j("Protobuf runtime is not correctly loaded.");
                        return null;
                    }
                    uc7Var = uc7Var4;
                } else {
                    uc7Var = null;
                }
                msa msaVar2 = rsa.a;
                if (!(g2eVarA instanceof g2e)) {
                    int[] iArr2 = h.n;
                    mr9.o();
                    return null;
                }
                g7fVarW = h.w(g2eVarA, v2cVar2, d9aVar2, kVar2, uc7Var, msaVar2);
            }
        }
        g7f g7fVar2 = (g7f) concurrentHashMap.putIfAbsent(cls, g7fVarW);
        return g7fVar2 != null ? g7fVar2 : g7fVarW;
    }
}
