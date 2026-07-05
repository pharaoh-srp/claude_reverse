package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.settings.internal.e;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class s99 implements rz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ fk0 F;

    public /* synthetic */ s99(fk0 fk0Var, int i) {
        this.E = i;
        this.F = fk0Var;
    }

    @Override // defpackage.rz7
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.E;
        fqb fqbVar = fqb.E;
        lz1 lz1Var = jd4.a;
        iei ieiVar = iei.a;
        fk0 fk0Var = this.F;
        switch (i) {
            case 0:
                ld4 ld4Var = (ld4) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((s64) obj).getClass();
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(iIntValue & 1, (iIntValue & 17) != 16)) {
                    e18Var.T();
                } else {
                    boolean zBooleanValue = ((Boolean) fk0Var.g.getValue()).booleanValue();
                    boolean zH = e18Var.h(fk0Var);
                    Object objN = e18Var.N();
                    if (zH || objN == lz1Var) {
                        objN = new rn6(fk0Var, 3);
                        e18Var.k0(objN);
                    }
                    e.f("Show jank overlay", zBooleanValue, (bz7) objN, null, "Floating overlay showing per-state UI jank stats. Tap to expand, drag to reposition. Toggle off then on to reset.", null, null, e18Var, 6, 104);
                }
                break;
            case 1:
                dxe dxeVar = (dxe) obj;
                ld4 ld4Var2 = (ld4) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                dxeVar.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= ((e18) ld4Var2).f(dxeVar) ? 4 : 2;
                }
                e18 e18Var2 = (e18) ld4Var2;
                if (!e18Var2.Q(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    e18Var2.T();
                } else {
                    tjh.b("Network simulation", dxeVar.a(fqbVar, 1.0f, true), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, e18Var2, 6, 0, 262140);
                    d8a d8aVarE = x44.E();
                    if (((Boolean) fk0Var.w.getValue()).booleanValue()) {
                        d8aVarE.add("slow");
                    }
                    if (fk0Var.i() > 0) {
                        d8aVarE.add(fk0Var.i() + "% fail");
                    }
                    if (fk0Var.k() > 0) {
                        d8aVarE.add(fk0Var.k() + "% upload fail");
                    }
                    if (fk0Var.j() > 0) {
                        d8aVarE.add("+" + fk0Var.j() + "ms");
                    }
                    d8a d8aVarV = x44.v(d8aVarE);
                    if (!d8aVarV.isEmpty()) {
                        e18Var2.a0(-1204966427);
                        tjh.b(w44.S0(d8aVarV, ", ", null, null, null, 62), null, gm3.a(e18Var2).y, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var2).e.E).i, e18Var2, 0, 0, 131066);
                        e18Var2.p(false);
                    } else {
                        e18Var2.a0(-1204690775);
                        e18Var2.p(false);
                    }
                }
                break;
            default:
                mnc mncVar = (mnc) obj;
                ld4 ld4Var3 = (ld4) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                mncVar.getClass();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= ((e18) ld4Var3).f(mncVar) ? 4 : 2;
                }
                e18 e18Var3 = (e18) ld4Var3;
                if (!e18Var3.Q(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    e18Var3.T();
                } else {
                    iqb iqbVarL = gb9.L(gb9.I(mpk.b0(fqbVar, mpk.Y(e18Var3), true), mncVar), 16.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 2);
                    q64 q64VarA = p64.a(ko0.c, lja.S, e18Var3, 0);
                    int iHashCode = Long.hashCode(e18Var3.T);
                    hyc hycVarL = e18Var3.l();
                    iqb iqbVarE = kxk.E(e18Var3, iqbVarL);
                    dd4.e.getClass();
                    re4 re4Var = cd4.b;
                    e18Var3.e0();
                    if (e18Var3.S) {
                        e18Var3.k(re4Var);
                    } else {
                        e18Var3.n0();
                    }
                    d4c.i0(e18Var3, cd4.f, q64VarA);
                    d4c.i0(e18Var3, cd4.e, hycVarL);
                    d4c.i0(e18Var3, cd4.g, Integer.valueOf(iHashCode));
                    d4c.h0(e18Var3, cd4.h);
                    d4c.i0(e18Var3, cd4.d, iqbVarE);
                    boolean zBooleanValue2 = ((Boolean) fk0Var.w.getValue()).booleanValue();
                    qnc qncVarB = gb9.b(MTTypesetterKt.kLineSkipLimitMultiplier, 8.0f, 1);
                    boolean zH2 = e18Var3.h(fk0Var);
                    Object objN2 = e18Var3.N();
                    if (zH2 || objN2 == lz1Var) {
                        objN2 = new rn6(fk0Var, 6);
                        e18Var3.k0(objN2);
                    }
                    e.f("Simulate slow networking", zBooleanValue2, (bz7) objN2, null, null, null, qncVarB, e18Var3, 1769478, 24);
                    tjh.b("80% 2-4s delay, 15% 11-15s, 5% timeout", null, gm3.a(e18Var3).N, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var3).e.E).i, e18Var3, 6, 0, 131066);
                    int i2 = fk0Var.i();
                    boolean zH3 = e18Var3.h(fk0Var);
                    Object objN3 = e18Var3.N();
                    if (zH3 || objN3 == lz1Var) {
                        objN3 = new rn6(fk0Var, 7);
                        e18Var3.k0(objN3);
                    }
                    bz7 bz7Var = (bz7) objN3;
                    String str = fk0Var.i() == 0 ? "Off" : fk0Var.i() + "%";
                    List list = p1c.a;
                    p1c.b("Request failure rate", i2, bz7Var, str, list, "Percentage of all network requests that fail with a simulated SocketTimeoutException", null, e18Var3, 196614);
                    int iK = fk0Var.k();
                    boolean zH4 = e18Var3.h(fk0Var);
                    Object objN4 = e18Var3.N();
                    if (zH4 || objN4 == lz1Var) {
                        objN4 = new rn6(fk0Var, 8);
                        e18Var3.k0(objN4);
                    }
                    p1c.b("Upload failure rate", iK, (bz7) objN4, fk0Var.k() == 0 ? "Off" : fk0Var.k() + "%", list, "Additional failure rate for file uploads (stacks with the general rate)", null, e18Var3, 196614);
                    int iJ = fk0Var.j();
                    boolean zH5 = e18Var3.h(fk0Var);
                    Object objN5 = e18Var3.N();
                    if (zH5 || objN5 == lz1Var) {
                        objN5 = new rn6(fk0Var, 9);
                        e18Var3.k0(objN5);
                    }
                    p1c.b("Extra request latency", iJ, (bz7) objN5, fk0Var.j() != 0 ? fk0Var.j() + "ms" : "Off", p1c.b, "Added to all network requests", null, e18Var3, 196614);
                    e18Var3.p(true);
                }
                break;
        }
        return ieiVar;
    }
}
