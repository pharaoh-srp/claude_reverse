package defpackage;

import androidx.compose.foundation.layout.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.anthropic.claude.design.icon.a;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class yv implements rz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ boolean F;

    public /* synthetic */ yv(boolean z, int i) {
        this.E = i;
        this.F = z;
    }

    @Override // defpackage.rz7
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.E;
        eo0 eo0Var = ko0.c;
        fqb fqbVar = fqb.E;
        boolean z = this.F;
        iei ieiVar = iei.a;
        switch (i) {
            case 0:
                px9 px9Var = (px9) obj;
                ld4 ld4Var = (ld4) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                px9Var.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= ((e18) ld4Var).f(px9Var) ? 4 : 2;
                }
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(iIntValue & 1, (iIntValue & 19) != 18)) {
                    e18Var.T();
                } else {
                    vo1 vo1Var = lja.T;
                    iqb iqbVarB = px9.b(px9Var);
                    qnc qncVar = j9a.a;
                    iqb iqbVarL = gb9.L(iqbVarB, 16.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 2);
                    q64 q64VarA = p64.a(eo0Var, vo1Var, e18Var, 48);
                    int iHashCode = Long.hashCode(e18Var.T);
                    hyc hycVarL = e18Var.l();
                    iqb iqbVarE = kxk.E(e18Var, iqbVarL);
                    dd4.e.getClass();
                    re4 re4Var = cd4.b;
                    e18Var.e0();
                    if (e18Var.S) {
                        e18Var.k(re4Var);
                    } else {
                        e18Var.n0();
                    }
                    d4c.i0(e18Var, cd4.f, q64VarA);
                    d4c.i0(e18Var, cd4.e, hycVarL);
                    d4c.i0(e18Var, cd4.g, Integer.valueOf(iHashCode));
                    d4c.h0(e18Var, cd4.h);
                    d4c.i0(e18Var, cd4.d, iqbVarE);
                    if (1.0f <= 0.0d) {
                        z29.a("invalid weight; must be greater than zero");
                    }
                    kxk.g(e18Var, new hw9(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true));
                    if (z) {
                        e18Var.a0(234058756);
                        pvj.b(a.a(ud0.h, e18Var), d4c.j0(R.string.empty_state_no_archived_projects, e18Var), gb9.J(fqbVar, 16.0f), null, e18Var, 392, 8);
                        e18Var.p(false);
                    } else {
                        e18Var.a0(234369345);
                        fhk.c(gb9.J(fqbVar, 16.0f), null, e18Var, 6, 2);
                        e18Var.p(false);
                    }
                    if (2.0f <= 0.0d) {
                        z29.a("invalid weight; must be greater than zero");
                    }
                    kxk.g(e18Var, new hw9(2.0f <= Float.MAX_VALUE ? 2.0f : Float.MAX_VALUE, true));
                    e18Var.p(true);
                }
                break;
            case 1:
                ld4 ld4Var2 = (ld4) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((ia0) obj).getClass();
                e18 e18Var2 = (e18) ld4Var2;
                if (!e18Var2.Q(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    e18Var2.T();
                } else {
                    ckk.a(this.F, null, null, false, null, e18Var2, 48, 60);
                }
                break;
            case 2:
                px9 px9Var2 = (px9) obj;
                ld4 ld4Var3 = (ld4) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                px9Var2.getClass();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= ((e18) ld4Var3).f(px9Var2) ? 4 : 2;
                }
                e18 e18Var3 = (e18) ld4Var3;
                iqb iqbVarA = fqbVar;
                if (!e18Var3.Q(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    e18Var3.T();
                } else {
                    if (z) {
                        iqbVarA = px9.a(px9Var2, fqbVar, null, null, 2);
                    }
                    us2.d(gb9.L(iqbVarA.B(e93.a), MTTypesetterKt.kLineSkipLimitMultiplier, 12.0f, 1), e18Var3, 0);
                }
                break;
            case 3:
                ld4 ld4Var4 = (ld4) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((dxe) obj).getClass();
                e18 e18Var4 = (e18) ld4Var4;
                if (!e18Var4.Q(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    e18Var4.T();
                } else {
                    tjh.b(d4c.j0(z ? R.string.ccr_session_list_load_more_retry : R.string.ccr_session_list_load_more, e18Var4), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var4).e.E).g, e18Var4, 0, 0, 131070);
                }
                break;
            default:
                ld4 ld4Var5 = (ld4) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                ((px9) obj).getClass();
                e18 e18Var5 = (e18) ld4Var5;
                if (!e18Var5.Q(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    e18Var5.T();
                } else {
                    iqb iqbVarN = gb9.N(gb9.L(b.c(fqbVar, 1.0f), 24.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 2), MTTypesetterKt.kLineSkipLimitMultiplier, 40.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 20.0f, 5);
                    q64 q64VarA2 = p64.a(eo0Var, lja.S, e18Var5, 0);
                    int iHashCode2 = Long.hashCode(e18Var5.T);
                    hyc hycVarL2 = e18Var5.l();
                    iqb iqbVarE2 = kxk.E(e18Var5, iqbVarN);
                    dd4.e.getClass();
                    re4 re4Var2 = cd4.b;
                    e18Var5.e0();
                    if (e18Var5.S) {
                        e18Var5.k(re4Var2);
                    } else {
                        e18Var5.n0();
                    }
                    d4c.i0(e18Var5, cd4.f, q64VarA2);
                    d4c.i0(e18Var5, cd4.e, hycVarL2);
                    d4c.i0(e18Var5, cd4.g, Integer.valueOf(iHashCode2));
                    d4c.h0(e18Var5, cd4.h);
                    d4c.i0(e18Var5, cd4.d, iqbVarE2);
                    tjh.b(d4c.j0(z ? R.string.ccr_onboarding_environment_title : R.string.ccr_onboarding_environment_title_create, e18Var5), null, gm3.a(e18Var5).M, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var5).e.E).b, e18Var5, 0, 0, 131066);
                    tjh.b(gid.p(8.0f, R.string.ccr_onboarding_environment_description, e18Var5, e18Var5, fqbVar), null, gm3.a(e18Var5).N, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var5).e.E).g, e18Var5, 0, 0, 131066);
                    e18Var5.p(true);
                }
                break;
        }
        return ieiVar;
    }
}
