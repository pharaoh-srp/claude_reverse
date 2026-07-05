package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class vu2 implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ pz7 F;

    public /* synthetic */ vu2(int i, pz7 pz7Var) {
        this.E = i;
        this.F = pz7Var;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        c5f c5fVar;
        int i = this.E;
        fqb fqbVar = fqb.E;
        iei ieiVar = iei.a;
        pz7 pz7Var = this.F;
        switch (i) {
            case 0:
                ld4 ld4Var = (ld4) obj;
                int iIntValue = ((Integer) obj2).intValue();
                e18 e18Var = (e18) ld4Var;
                if (e18Var.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    pz7Var.invoke(e18Var, 0);
                } else {
                    e18Var.T();
                }
                return ieiVar;
            case 1:
                ld4 ld4Var2 = (ld4) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                e18 e18Var2 = (e18) ld4Var2;
                if (e18Var2.Q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    iqb iqbVarN = gb9.N(fqb.E, 8.0f, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, 14);
                    o5b o5bVarD = dw1.d(lja.G, false);
                    int iHashCode = Long.hashCode(e18Var2.T);
                    hyc hycVarL = e18Var2.l();
                    iqb iqbVarE = kxk.E(e18Var2, iqbVarN);
                    dd4.e.getClass();
                    re4 re4Var = cd4.b;
                    e18Var2.e0();
                    if (e18Var2.S) {
                        e18Var2.k(re4Var);
                    } else {
                        e18Var2.n0();
                    }
                    d4c.i0(e18Var2, cd4.f, o5bVarD);
                    d4c.i0(e18Var2, cd4.e, hycVarL);
                    d4c.i0(e18Var2, cd4.g, Integer.valueOf(iHashCode));
                    d4c.h0(e18Var2, cd4.h);
                    d4c.i0(e18Var2, cd4.d, iqbVarE);
                    if (pz7Var == null) {
                        e18Var2.a0(-1536359400);
                    } else {
                        e18Var2.a0(1751555337);
                        pz7Var.invoke(e18Var2, 0);
                    }
                    e18Var2.p(false);
                    e18Var2.p(true);
                } else {
                    e18Var2.T();
                }
                return ieiVar;
            case 2:
                uqc uqcVar = (uqc) obj;
                uqc uqcVar2 = (uqc) obj2;
                uqcVar.getClass();
                pz7Var.invoke(uqcVar.a, uqcVar2 != null ? uqcVar2.a : null);
                return ieiVar;
            case 3:
                y4f y4fVar = (y4f) obj;
                List list = (List) pz7Var.invoke(y4fVar, obj2);
                List list2 = list;
                int size = list2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    Object obj3 = list.get(i2);
                    if (obj3 != null && (c5fVar = y4fVar.F) != null && !c5fVar.d(obj3)) {
                        throw new IllegalArgumentException(("item at index " + i2 + " can't be saved: " + obj3).toString());
                    }
                }
                if (list2.isEmpty()) {
                    return null;
                }
                return new ArrayList(list2);
            case 4:
                ld4 ld4Var3 = (ld4) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                e18 e18Var3 = (e18) ld4Var3;
                if (e18Var3.Q(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    o5b o5bVarD2 = dw1.d(lja.G, false);
                    int iHashCode2 = Long.hashCode(e18Var3.T);
                    hyc hycVarL2 = e18Var3.l();
                    iqb iqbVarE2 = kxk.E(e18Var3, fqbVar);
                    dd4.e.getClass();
                    re4 re4Var2 = cd4.b;
                    e18Var3.e0();
                    if (e18Var3.S) {
                        e18Var3.k(re4Var2);
                    } else {
                        e18Var3.n0();
                    }
                    d4c.i0(e18Var3, cd4.f, o5bVarD2);
                    d4c.i0(e18Var3, cd4.e, hycVarL2);
                    d4c.i0(e18Var3, cd4.g, Integer.valueOf(iHashCode2));
                    d4c.h0(e18Var3, cd4.h);
                    d4c.i0(e18Var3, cd4.d, iqbVarE2);
                    sq6.B(0, pz7Var, e18Var3, true);
                } else {
                    e18Var3.T();
                }
                return ieiVar;
            case 5:
                ld4 ld4Var4 = (ld4) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                e18 e18Var4 = (e18) ld4Var4;
                if (e18Var4.Q(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    o5b o5bVarD3 = dw1.d(lja.G, false);
                    int iHashCode3 = Long.hashCode(e18Var4.T);
                    hyc hycVarL3 = e18Var4.l();
                    iqb iqbVarE3 = kxk.E(e18Var4, fqbVar);
                    dd4.e.getClass();
                    re4 re4Var3 = cd4.b;
                    e18Var4.e0();
                    if (e18Var4.S) {
                        e18Var4.k(re4Var3);
                    } else {
                        e18Var4.n0();
                    }
                    d4c.i0(e18Var4, cd4.f, o5bVarD3);
                    d4c.i0(e18Var4, cd4.e, hycVarL3);
                    d4c.i0(e18Var4, cd4.g, Integer.valueOf(iHashCode3));
                    d4c.h0(e18Var4, cd4.h);
                    d4c.i0(e18Var4, cd4.d, iqbVarE3);
                    sq6.B(0, pz7Var, e18Var4, true);
                } else {
                    e18Var4.T();
                }
                return ieiVar;
            case 6:
                ld4 ld4Var5 = (ld4) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                e18 e18Var5 = (e18) ld4Var5;
                if (e18Var5.Q(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    o5b o5bVarD4 = dw1.d(lja.G, false);
                    int iHashCode4 = Long.hashCode(e18Var5.T);
                    hyc hycVarL4 = e18Var5.l();
                    iqb iqbVarE4 = kxk.E(e18Var5, fqbVar);
                    dd4.e.getClass();
                    re4 re4Var4 = cd4.b;
                    e18Var5.e0();
                    if (e18Var5.S) {
                        e18Var5.k(re4Var4);
                    } else {
                        e18Var5.n0();
                    }
                    d4c.i0(e18Var5, cd4.f, o5bVarD4);
                    d4c.i0(e18Var5, cd4.e, hycVarL4);
                    d4c.i0(e18Var5, cd4.g, Integer.valueOf(iHashCode4));
                    d4c.h0(e18Var5, cd4.h);
                    d4c.i0(e18Var5, cd4.d, iqbVarE4);
                    sq6.B(0, pz7Var, e18Var5, true);
                } else {
                    e18Var5.T();
                }
                return ieiVar;
            case 7:
                ld4 ld4Var6 = (ld4) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                e18 e18Var6 = (e18) ld4Var6;
                if (e18Var6.Q(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    o5b o5bVarD5 = dw1.d(lja.G, false);
                    int iHashCode5 = Long.hashCode(e18Var6.T);
                    hyc hycVarL5 = e18Var6.l();
                    iqb iqbVarE5 = kxk.E(e18Var6, fqbVar);
                    dd4.e.getClass();
                    re4 re4Var5 = cd4.b;
                    e18Var6.e0();
                    if (e18Var6.S) {
                        e18Var6.k(re4Var5);
                    } else {
                        e18Var6.n0();
                    }
                    d4c.i0(e18Var6, cd4.f, o5bVarD5);
                    d4c.i0(e18Var6, cd4.e, hycVarL5);
                    d4c.i0(e18Var6, cd4.g, Integer.valueOf(iHashCode5));
                    d4c.h0(e18Var6, cd4.h);
                    d4c.i0(e18Var6, cd4.d, iqbVarE5);
                    sq6.B(0, pz7Var, e18Var6, true);
                } else {
                    e18Var6.T();
                }
                return ieiVar;
            default:
                ld4 ld4Var7 = (ld4) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                e18 e18Var7 = (e18) ld4Var7;
                if (e18Var7.Q(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    iqb iqbVarL = zni.L(fqbVar, "Container");
                    o5b o5bVarD6 = dw1.d(lja.G, true);
                    int iHashCode6 = Long.hashCode(e18Var7.T);
                    hyc hycVarL6 = e18Var7.l();
                    iqb iqbVarE6 = kxk.E(e18Var7, iqbVarL);
                    dd4.e.getClass();
                    re4 re4Var6 = cd4.b;
                    e18Var7.e0();
                    if (e18Var7.S) {
                        e18Var7.k(re4Var6);
                    } else {
                        e18Var7.n0();
                    }
                    d4c.i0(e18Var7, cd4.f, o5bVarD6);
                    d4c.i0(e18Var7, cd4.e, hycVarL6);
                    d4c.i0(e18Var7, cd4.g, Integer.valueOf(iHashCode6));
                    d4c.h0(e18Var7, cd4.h);
                    d4c.i0(e18Var7, cd4.d, iqbVarE6);
                    sq6.B(0, pz7Var, e18Var7, true);
                } else {
                    e18Var7.T();
                }
                return ieiVar;
        }
    }
}
