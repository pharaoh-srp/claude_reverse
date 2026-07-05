package defpackage;

import androidx.compose.foundation.layout.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.anthropic.claude.design.icon.a;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class nk4 implements rz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ boolean F;
    public final /* synthetic */ bz7 G;

    public /* synthetic */ nk4(int i, bz7 bz7Var, boolean z) {
        this.E = i;
        this.F = z;
        this.G = bz7Var;
    }

    @Override // defpackage.rz7
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.E;
        iei ieiVar = iei.a;
        int i2 = 1;
        switch (i) {
            case 0:
                ld4 ld4Var = (ld4) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((px9) obj).getClass();
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(iIntValue & 1, (iIntValue & 17) != 16)) {
                    e18Var.T();
                } else {
                    yhk.a(null, fd9.q0(202878289, new nk4(i2, this.G, this.F), e18Var), e18Var, 48);
                }
                break;
            case 1:
                ld4 ld4Var2 = (ld4) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((s64) obj).getClass();
                e18 e18Var2 = (e18) ld4Var2;
                if (!e18Var2.Q(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    e18Var2.T();
                } else {
                    yhk.d(a.a(ud0.X, e18Var2), d4c.j0(R.string.connector_discovery_toggle_title, e18Var2), this.F, this.G, null, zrk.i(R.string.connector_discovery_toggle_description, e18Var2), false, e18Var2, 8, 208);
                }
                break;
            default:
                ld4 ld4Var3 = (ld4) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((s64) obj).getClass();
                e18 e18Var3 = (e18) ld4Var3;
                if (!e18Var3.Q(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    e18Var3.T();
                } else {
                    wo1 wo1Var = lja.Q;
                    iqb iqbVarC = b.c(fqb.E, 1.0f);
                    vue vueVar = new vue(2);
                    boolean z = this.F;
                    iqb iqbVarK = gb9.K(kzj.h(iqbVarC, z, false, vueVar, this.G, 10), 16.0f, 14.0f);
                    cxe cxeVarA = axe.a(ko0.a, wo1Var, e18Var3, 48);
                    int iHashCode = Long.hashCode(e18Var3.T);
                    hyc hycVarL = e18Var3.l();
                    iqb iqbVarE = kxk.E(e18Var3, iqbVarK);
                    dd4.e.getClass();
                    re4 re4Var = cd4.b;
                    e18Var3.e0();
                    if (e18Var3.S) {
                        e18Var3.k(re4Var);
                    } else {
                        e18Var3.n0();
                    }
                    z80 z80Var = cd4.f;
                    d4c.i0(e18Var3, z80Var, cxeVarA);
                    z80 z80Var2 = cd4.e;
                    d4c.i0(e18Var3, z80Var2, hycVarL);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    z80 z80Var3 = cd4.g;
                    d4c.i0(e18Var3, z80Var3, numValueOf);
                    bx bxVar = cd4.h;
                    d4c.h0(e18Var3, bxVar);
                    z80 z80Var4 = cd4.d;
                    hw9 hw9VarN = kgh.n(e18Var3, iqbVarE, z80Var4, 1.0f, true);
                    q64 q64VarA = p64.a(ko0.c, lja.S, e18Var3, 0);
                    int iHashCode2 = Long.hashCode(e18Var3.T);
                    hyc hycVarL2 = e18Var3.l();
                    iqb iqbVarE2 = kxk.E(e18Var3, hw9VarN);
                    e18Var3.e0();
                    if (e18Var3.S) {
                        e18Var3.k(re4Var);
                    } else {
                        e18Var3.n0();
                    }
                    d4c.i0(e18Var3, z80Var, q64VarA);
                    d4c.i0(e18Var3, z80Var2, hycVarL2);
                    ij0.t(iHashCode2, e18Var3, z80Var3, e18Var3, bxVar);
                    d4c.i0(e18Var3, z80Var4, iqbVarE2);
                    tjh.b(d4c.j0(R.string.conway_system_developer_show_tool_calls, e18Var3), null, gm3.a(e18Var3).M, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var3).e.E).g, e18Var3, 0, 0, 131066);
                    tjh.b(d4c.j0(R.string.conway_system_developer_show_tool_calls_desc, e18Var3), null, gm3.a(e18Var3).O, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var3).e.E).i, e18Var3, 0, 0, 131066);
                    e18Var3.p(true);
                    zsk.d(z, null, false, 0L, MTTypesetterKt.kLineSkipLimitMultiplier, null, null, e18Var3, 1572864, 62);
                    e18Var3.p(true);
                }
                break;
        }
        return ieiVar;
    }
}
