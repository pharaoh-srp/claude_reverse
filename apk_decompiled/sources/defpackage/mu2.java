package defpackage;

import androidx.compose.foundation.layout.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class mu2 implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ boolean F;
    public final /* synthetic */ zy7 G;

    public /* synthetic */ mu2(zy7 zy7Var, boolean z, int i) {
        this.E = i;
        this.G = zy7Var;
        this.F = z;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        eo0 eo0Var = ko0.c;
        fqb fqbVar = fqb.E;
        boolean z = this.F;
        iei ieiVar = iei.a;
        switch (i) {
            case 0:
                ld4 ld4Var = (ld4) obj;
                int iIntValue = ((Integer) obj2).intValue();
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    e18Var.T();
                } else {
                    ev2.i(0, e18Var, this.G, z);
                }
                break;
            case 1:
                ld4 ld4Var2 = (ld4) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                e18 e18Var2 = (e18) ld4Var2;
                if (!e18Var2.Q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    e18Var2.T();
                } else {
                    qnc qncVar = q02.a;
                    lnk.d(this.G, null, !z, null, q02.d(0L, gm3.a(e18Var2).y, 0L, e18Var2, 13), null, null, kpk.e, e18Var2, 805306368, 490);
                }
                break;
            case 2:
                ld4 ld4Var3 = (ld4) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                e18 e18Var3 = (e18) ld4Var3;
                if (!e18Var3.Q(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    e18Var3.T();
                } else {
                    trk.a(0, 4, e18Var3, this.G, null, !z);
                }
                break;
            case 3:
                ld4 ld4Var4 = (ld4) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                e18 e18Var4 = (e18) ld4Var4;
                if (!e18Var4.Q(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    e18Var4.T();
                } else {
                    vo1 vo1Var = lja.T;
                    iqb iqbVarJ = gb9.J(fqbVar, 16.0f);
                    q64 q64VarA = p64.a(eo0Var, vo1Var, e18Var4, 48);
                    int iHashCode = Long.hashCode(e18Var4.T);
                    hyc hycVarL = e18Var4.l();
                    iqb iqbVarE = kxk.E(e18Var4, iqbVarJ);
                    dd4.e.getClass();
                    re4 re4Var = cd4.b;
                    e18Var4.e0();
                    if (e18Var4.S) {
                        e18Var4.k(re4Var);
                    } else {
                        e18Var4.n0();
                    }
                    d4c.i0(e18Var4, cd4.f, q64VarA);
                    d4c.i0(e18Var4, cd4.e, hycVarL);
                    d4c.i0(e18Var4, cd4.g, Integer.valueOf(iHashCode));
                    d4c.h0(e18Var4, cd4.h);
                    d4c.i0(e18Var4, cd4.d, iqbVarE);
                    xn5.N(u00.D(R.drawable.claude_spark_icon, 0, e18Var4), null, null, null, null, MTTypesetterKt.kLineSkipLimitMultiplier, null, e18Var4, 56, 124);
                    tjh.b(gid.p(10.0f, R.string.generic_error_something_went_wrong, e18Var4, e18Var4, fqbVar), null, 0L, 0L, null, null, null, 0L, null, new fdh(3), 0L, 0, false, 0, 0, null, null, e18Var4, 0, 0, 261118);
                    kxk.g(e18Var4, b.e(fqbVar, 16.0f));
                    dxj.a("Retry", this.F, b.c(fqbVar, 1.0f), false, null, null, null, 0L, this.G, e18Var4, 390, 248);
                    e18Var4.p(true);
                }
                break;
            default:
                ld4 ld4Var5 = (ld4) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                e18 e18Var5 = (e18) ld4Var5;
                if (!e18Var5.Q(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    e18Var5.T();
                } else {
                    iqb iqbVarL = gb9.L(b.c, 24.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 2);
                    o5b o5bVarD = dw1.d(lja.G, false);
                    int iHashCode2 = Long.hashCode(e18Var5.T);
                    hyc hycVarL2 = e18Var5.l();
                    iqb iqbVarE2 = kxk.E(e18Var5, iqbVarL);
                    dd4.e.getClass();
                    re4 re4Var2 = cd4.b;
                    e18Var5.e0();
                    if (e18Var5.S) {
                        e18Var5.k(re4Var2);
                    } else {
                        e18Var5.n0();
                    }
                    z80 z80Var = cd4.f;
                    d4c.i0(e18Var5, z80Var, o5bVarD);
                    z80 z80Var2 = cd4.e;
                    d4c.i0(e18Var5, z80Var2, hycVarL2);
                    Integer numValueOf = Integer.valueOf(iHashCode2);
                    z80 z80Var3 = cd4.g;
                    d4c.i0(e18Var5, z80Var3, numValueOf);
                    bx bxVar = cd4.h;
                    d4c.h0(e18Var5, bxVar);
                    z80 z80Var4 = cd4.d;
                    d4c.i0(e18Var5, z80Var4, iqbVarE2);
                    vo1 vo1Var2 = lja.T;
                    iqb iqbVarA = nw1.a.a(fqbVar, lja.K);
                    q64 q64VarA2 = p64.a(eo0Var, vo1Var2, e18Var5, 48);
                    int iHashCode3 = Long.hashCode(e18Var5.T);
                    hyc hycVarL3 = e18Var5.l();
                    iqb iqbVarE3 = kxk.E(e18Var5, iqbVarA);
                    e18Var5.e0();
                    if (e18Var5.S) {
                        e18Var5.k(re4Var2);
                    } else {
                        e18Var5.n0();
                    }
                    d4c.i0(e18Var5, z80Var, q64VarA2);
                    d4c.i0(e18Var5, z80Var2, hycVarL3);
                    ij0.t(iHashCode3, e18Var5, z80Var3, e18Var5, bxVar);
                    d4c.i0(e18Var5, z80Var4, iqbVarE3);
                    xn5.M(j8.r0(R.drawable.claude_mobile_and_hand, e18Var5), b.o(fqbVar, 92.0f), e18Var5, 432);
                    tjh.b(gid.p(16.0f, R.string.required_update_title, e18Var5, e18Var5, fqbVar), null, gm3.a(e18Var5).M, 0L, null, null, null, 0L, null, new fdh(3), 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var5).e.E).b, e18Var5, 0, 0, 130042);
                    tjh.b(gid.p(16.0f, R.string.required_update_description, e18Var5, e18Var5, fqbVar), gb9.L(fqbVar, 16.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 2), gm3.a(e18Var5).O, 0L, null, null, null, 0L, null, new fdh(3), 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var5).e.E).g, e18Var5, 48, 0, 130040);
                    if (z) {
                        sq6.A(24.0f, -827407663, e18Var5, e18Var5, fqbVar);
                        dtj.a(d4c.j0(R.string.required_update_button, e18Var5), gb9.L(b.c(fqbVar, 1.0f), 16.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 2), false, null, null, null, 0L, this.G, e18Var5, 48, 124);
                        e18Var5.p(false);
                    } else {
                        e18Var5.a0(-827017497);
                        e18Var5.p(false);
                    }
                    e18Var5.p(true);
                    e18Var5.p(true);
                }
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ mu2(boolean z, zy7 zy7Var, int i) {
        this.E = i;
        this.F = z;
        this.G = zy7Var;
    }
}
