package defpackage;

import android.content.Context;
import androidx.compose.foundation.layout.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.anthropic.claude.api.account.Organization;
import com.anthropic.claude.api.chat.ChatFeedbackType;
import com.anthropic.claude.types.strings.ChatId;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class gs2 implements sz7 {
    public final /* synthetic */ int E = 0;
    public final /* synthetic */ boolean F;
    public final /* synthetic */ boolean G;
    public final /* synthetic */ boolean H;
    public final /* synthetic */ Object I;
    public final /* synthetic */ Object J;

    public /* synthetic */ gs2(cs2 cs2Var, boolean z, String str, boolean z2, boolean z3) {
        this.I = cs2Var;
        this.F = z;
        this.J = str;
        this.G = z2;
        this.H = z3;
    }

    @Override // defpackage.sz7
    public final Object i(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean z;
        int i = this.E;
        iei ieiVar = iei.a;
        fqb fqbVar = fqb.E;
        lz1 lz1Var = jd4.a;
        final boolean z2 = this.G;
        Object obj5 = this.J;
        Object obj6 = this.I;
        boolean z3 = this.F;
        switch (i) {
            case 0:
                final cs2 cs2Var = (cs2) obj6;
                final String str = (String) obj5;
                mnc mncVar = (mnc) obj2;
                ld4 ld4Var = (ld4) obj3;
                int iH = ebh.h((Integer) obj4, (s64) obj, mncVar);
                if ((iH & 48) == 0) {
                    iH |= ((e18) ld4Var).f(mncVar) ? 32 : 16;
                }
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(iH & 1, (iH & 145) != 144)) {
                    e18Var.T();
                } else {
                    iqb iqbVarI = gb9.I(fqbVar, mncVar);
                    q64 q64VarA = p64.a(ko0.c, lja.S, e18Var, 0);
                    int iHashCode = Long.hashCode(e18Var.T);
                    hyc hycVarL = e18Var.l();
                    iqb iqbVarE = kxk.E(e18Var, iqbVarI);
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
                    tjh.c(zrk.j(R.string.chat_feedback_dialog_details_disclaimer_with_link, x44.W(((Boolean) cs2Var.o.getValue()).booleanValue() ? "https://privacy.anthropic.com/en/articles/7996866-how-long-do-you-store-my-organization-s-data" : "https://privacy.anthropic.com/en/articles/10023548-how-long-do-you-store-my-data"), null, new CharSequence[0], e18Var, 0, 4), null, gm3.a(e18Var).O, 0L, 0L, null, 0L, 0, false, 0, 0, null, null, ((jm3) gm3.c(e18Var).e.E).i, e18Var, 0, 0, 262138);
                    kxk.g(e18Var, b.e(fqbVar, 16.0f));
                    if (((Boolean) cs2Var.n.getValue()).booleanValue()) {
                        e18Var.a0(-169253227);
                        tjh.b(d4c.j0(R.string.generic_error_something_went_wrong_try_again, e18Var), null, gm3.a(e18Var).z, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var).e.E).i, e18Var, 0, 0, 131066);
                        grc.z(fqbVar, 16.0f, e18Var, false);
                    } else {
                        e18Var.a0(-168913994);
                        e18Var.p(false);
                    }
                    if (z3) {
                        e18Var.a0(-168850754);
                        ez1.a(gb9.J(fqbVar, 12.0f), vf2.H, 0L, e18Var, 54, 4);
                        e18Var.p(false);
                    } else {
                        e18Var.a0(-168641845);
                        String strJ0 = d4c.j0(R.string.chat_feedback_dialog_submit_feedback_button, e18Var);
                        boolean zBooleanValue = ((Boolean) cs2Var.m.getValue()).booleanValue();
                        iqb iqbVarC = b.c(fqbVar, 1.0f);
                        boolean zF = e18Var.f(cs2Var) | e18Var.f(str != null ? ChatId.m978boximpl(str) : null) | e18Var.g(z2);
                        final boolean z4 = this.H;
                        boolean zG = zF | e18Var.g(z4);
                        Object objN = e18Var.N();
                        if (zG || objN == lz1Var) {
                            objN = new zy7() { // from class: ks2
                                @Override // defpackage.zy7
                                public final Object a() {
                                    cs2 cs2Var2 = cs2Var;
                                    lsc lscVar = cs2Var2.n;
                                    String str2 = str;
                                    if (str2 == null) {
                                        lscVar.setValue(Boolean.TRUE);
                                    } else {
                                        cs2Var2.m.setValue(Boolean.TRUE);
                                        lscVar.setValue(Boolean.FALSE);
                                        gb9.D(cs2Var2.a, null, null, new bs2((ChatFeedbackType) cs2Var2.l.getValue(), ((cjh) cs2Var2.k.getValue()).a.F, z2, cs2Var2, str2, z4, (tp4) null), 3);
                                    }
                                    return iei.a;
                                }
                            };
                            e18Var.k0(objN);
                        }
                        dxj.a(strJ0, zBooleanValue, iqbVarC, false, null, null, null, 0L, (zy7) objN, e18Var, 384, 248);
                        e18Var.p(false);
                    }
                    grc.z(fqbVar, 16.0f, e18Var, true);
                }
                break;
            default:
                List list = (List) obj6;
                jkc jkcVar = (jkc) obj5;
                s64 s64Var = (s64) obj;
                zy7 zy7Var = (zy7) obj2;
                ld4 ld4Var2 = (ld4) obj3;
                int iIntValue = ((Integer) obj4).intValue();
                s64Var.getClass();
                zy7Var.getClass();
                int i2 = (iIntValue & 6) == 0 ? (((e18) ld4Var2).f(s64Var) ? 4 : 2) | iIntValue : iIntValue;
                if ((iIntValue & 48) == 0) {
                    i2 |= ((e18) ld4Var2).h(zy7Var) ? 32 : 16;
                }
                e18 e18Var2 = (e18) ld4Var2;
                if (!e18Var2.Q(i2 & 1, (i2 & 147) != 146)) {
                    e18Var2.T();
                } else {
                    Context context = (Context) e18Var2.j(w00.b);
                    if (z3) {
                        e18Var2.a0(-788863056);
                        kkc.d(d4c.j0(R.string.identity_selector_section_organizations, e18Var2), e18Var2, 0);
                        Organization organizationE = jkcVar.c.e();
                        boolean zF2 = ((i2 & 112) == 32) | e18Var2.f(jkcVar) | e18Var2.h(context);
                        Object objN2 = e18Var2.N();
                        if (zF2 || objN2 == lz1Var) {
                            objN2 = new ny4(zy7Var, jkcVar, context);
                            e18Var2.k0(objN2);
                        }
                        kkc.c(s64Var, list, organizationE, (bz7) objN2, e18Var2, i2 & 14);
                        e18Var2.p(false);
                    } else {
                        e18Var2.a0(-788006805);
                        e18Var2.p(false);
                    }
                    if (!z2) {
                        e18Var2.a0(-787437397);
                        e18Var2.p(false);
                    } else {
                        e18Var2.a0(-787949610);
                        if (z3) {
                            e18Var2.a0(-787890679);
                            iuj.e(gb9.L(fqbVar, MTTypesetterKt.kLineSkipLimitMultiplier, 4.0f, 1), 2.0f, gm3.a(e18Var2).o, e18Var2, 54, 0);
                            z = false;
                            e18Var2.p(false);
                        } else {
                            z = false;
                            e18Var2.a0(-787651669);
                            e18Var2.p(false);
                        }
                        kkc.a(s64Var, jkcVar, this.H, zy7Var, e18Var2, (i2 & 14) | ((i2 << 6) & 7168));
                        e18Var2.p(z);
                    }
                }
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ gs2(boolean z, List list, jkc jkcVar, boolean z2, boolean z3) {
        this.F = z;
        this.I = list;
        this.J = jkcVar;
        this.G = z2;
        this.H = z3;
    }
}
