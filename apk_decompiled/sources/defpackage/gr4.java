package defpackage;

import android.text.format.DateUtils;
import androidx.compose.foundation.layout.b;
import com.anthropic.claude.R;
import com.anthropic.claude.api.chat.tool.ToolDisplayContent;
import com.anthropic.claude.conway.ConwayAppScreen;
import com.anthropic.claude.conway.f;
import com.anthropic.claude.conway.h;
import com.anthropic.claude.types.strings.ProjectId;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class gr4 implements sz7 {
    public final /* synthetic */ int E = 1;
    public final /* synthetic */ Object F;
    public final /* synthetic */ Object G;
    public final /* synthetic */ Object H;
    public final /* synthetic */ Object I;
    public final /* synthetic */ Object J;
    public final /* synthetic */ Object K;

    public /* synthetic */ gr4(qi3 qi3Var, String str, ze0 ze0Var, eli eliVar, zy7 zy7Var, zbb zbbVar) {
        this.G = qi3Var;
        this.H = str;
        this.I = ze0Var;
        this.J = eliVar;
        this.F = zy7Var;
        this.K = zbbVar;
    }

    @Override // defpackage.sz7
    public final Object i(Object obj, Object obj2, Object obj3, Object obj4) {
        mnc mncVar;
        int i = this.E;
        lz1 lz1Var = jd4.a;
        fqb fqbVar = fqb.E;
        iei ieiVar = iei.a;
        Object obj5 = this.K;
        Object obj6 = this.J;
        Object obj7 = this.F;
        Object obj8 = this.I;
        Object obj9 = this.H;
        Object obj10 = this.G;
        switch (i) {
            case 0:
                us4 us4Var = (us4) obj10;
                f fVar = (f) obj9;
                dx4 dx4Var = (dx4) obj8;
                zy7 zy7Var = (zy7) obj7;
                rwe rweVar = (rwe) obj5;
                zy7 zy7Var2 = (zy7) obj6;
                ConwayAppScreen conwayAppScreen = (ConwayAppScreen) obj2;
                ld4 ld4Var = (ld4) obj3;
                int iIntValue = ((Integer) obj4).intValue();
                ((ia0) obj).getClass();
                conwayAppScreen.getClass();
                if ((iIntValue & 48) == 0) {
                    iIntValue |= (iIntValue & 64) == 0 ? ((e18) ld4Var).f(conwayAppScreen) : ((e18) ld4Var).h(conwayAppScreen) ? 32 : 16;
                }
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(iIntValue & 1, (iIntValue & 145) != 144)) {
                    e18Var.T();
                } else if (conwayAppScreen.equals(ConwayAppScreen.Chat.INSTANCE)) {
                    e18Var.a0(-273349280);
                    boolean zH = e18Var.h(rweVar);
                    Object objN = e18Var.N();
                    if (zH || objN == lz1Var) {
                        objN = new av(rweVar, 5);
                        e18Var.k0(objN);
                    }
                    us4 us4Var2 = us4.e;
                    h.c(null, us4Var, fVar, dx4Var, zy7Var, (zy7) objN, e18Var, 0);
                    e18Var.p(false);
                } else {
                    int i2 = 6;
                    if (conwayAppScreen.equals(ConwayAppScreen.System.INSTANCE)) {
                        e18Var.a0(-273336476);
                        boolean zH2 = e18Var.h(rweVar);
                        Object objN2 = e18Var.N();
                        if (zH2 || objN2 == lz1Var) {
                            objN2 = new av(rweVar, i2);
                            e18Var.k0(objN2);
                        }
                        zy7 zy7Var3 = (zy7) objN2;
                        boolean zF = e18Var.f(fVar) | e18Var.h(rweVar);
                        Object objN3 = e18Var.N();
                        if (zF || objN3 == lz1Var) {
                            objN3 = new d44(fVar, 7, rweVar);
                            e18Var.k0(objN3);
                        }
                        ysk.b(fVar, zy7Var3, (zy7) objN3, zy7Var2, null, e18Var, 0);
                        e18Var.p(false);
                    } else {
                        if (!(conwayAppScreen instanceof ConwayAppScreen.Extension)) {
                            throw ebh.u(e18Var, -273350608, false);
                        }
                        e18Var.a0(-273318669);
                        dw1.a(fqbVar, e18Var, 6);
                        e18Var.p(false);
                    }
                }
                return ieiVar;
            case 1:
                qi3 qi3Var = (qi3) obj10;
                String str = (String) obj9;
                ze0 ze0Var = (ze0) obj8;
                eli eliVar = (eli) obj6;
                zy7 zy7Var4 = (zy7) obj7;
                zbb zbbVar = (zbb) obj5;
                mnc mncVar2 = (mnc) obj2;
                ld4 ld4Var2 = (ld4) obj3;
                int iH = ebh.h((Integer) obj4, (s64) obj, mncVar2);
                if ((iH & 48) == 0) {
                    iH |= ((e18) ld4Var2).f(mncVar2) ? 32 : 16;
                }
                e18 e18Var2 = (e18) ld4Var2;
                if (e18Var2.Q(iH & 1, (iH & 145) != 144)) {
                    vo1 vo1Var = lja.U;
                    boolean zH3 = e18Var2.h(qi3Var) | e18Var2.f(str != null ? ProjectId.m1079boximpl(str) : null) | e18Var2.h(ze0Var) | e18Var2.h(eliVar) | e18Var2.f(zy7Var4);
                    Object objN4 = e18Var2.N();
                    if (zH3 || objN4 == lz1Var) {
                        mncVar = mncVar2;
                        dn dnVar = new dn((Object) qi3Var, (Object) str, (Object) ze0Var, (Object) eliVar, (Object) zy7Var4, 10);
                        e18Var2.k0(dnVar);
                        objN4 = dnVar;
                    } else {
                        mncVar = mncVar2;
                    }
                    fqb fqbVar2 = fqb.E;
                    iqb iqbVarI = gb9.I(b.c(androidx.compose.foundation.b.c(fqbVar2, false, null, null, null, (zy7) objN4, 15), 1.0f), mncVar);
                    q64 q64VarA = p64.a(ko0.c, vo1Var, e18Var2, 48);
                    int iHashCode = Long.hashCode(e18Var2.T);
                    hyc hycVarL = e18Var2.l();
                    iqb iqbVarE = kxk.E(e18Var2, iqbVarI);
                    dd4.e.getClass();
                    re4 re4Var = cd4.b;
                    e18Var2.e0();
                    if (e18Var2.S) {
                        e18Var2.k(re4Var);
                    } else {
                        e18Var2.n0();
                    }
                    d4c.i0(e18Var2, cd4.f, q64VarA);
                    d4c.i0(e18Var2, cd4.e, hycVarL);
                    d4c.i0(e18Var2, cd4.g, Integer.valueOf(iHashCode));
                    d4c.h0(e18Var2, cd4.h);
                    d4c.i0(e18Var2, cd4.d, iqbVarE);
                    kxk.g(e18Var2, b.e(fqbVar2, 8.0f));
                    CharSequence relativeTimeSpanString = DateUtils.getRelativeTimeSpanString(zbbVar.c.toInstant().toEpochMilli(), System.currentTimeMillis(), 60000L);
                    relativeTimeSpanString.getClass();
                    tjh.b(d4c.k0(R.string.memory_preview_last_updated, new Object[]{relativeTimeSpanString}, e18Var2), null, gm3.a(e18Var2).O, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var2).e.E).g, e18Var2, 0, 0, 131066);
                    tjh.b(gid.p(8.0f, R.string.memory_manage_on_web, e18Var2, e18Var2, fqbVar2), null, gm3.a(e18Var2).c, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var2).e.E).e, e18Var2, 0, 0, 131066);
                    e18Var2.p(true);
                } else {
                    e18Var2.T();
                }
                return ieiVar;
            default:
                ta4 ta4Var = (ta4) obj10;
                String str2 = (String) obj9;
                String str3 = (String) obj8;
                String str4 = (String) obj7;
                String str5 = (String) obj6;
                ToolDisplayContent toolDisplayContent = (ToolDisplayContent) obj5;
                mnc mncVar3 = (mnc) obj2;
                ld4 ld4Var3 = (ld4) obj3;
                int iH2 = ebh.h((Integer) obj4, (s64) obj, mncVar3);
                if ((iH2 & 48) == 0) {
                    iH2 |= ((e18) ld4Var3).f(mncVar3) ? 32 : 16;
                }
                e18 e18Var3 = (e18) ld4Var3;
                if (e18Var3.Q(iH2 & 1, (iH2 & 145) != 144)) {
                    htk.c(ta4Var, str2, str3, str4, str5, toolDisplayContent, b.c(fqbVar, 1.0f), mncVar3, e18Var3, ((iH2 << 18) & 29360128) | 1572864);
                } else {
                    e18Var3.T();
                }
                return ieiVar;
        }
    }

    public /* synthetic */ gr4(ta4 ta4Var, String str, String str2, String str3, String str4, ToolDisplayContent toolDisplayContent) {
        this.G = ta4Var;
        this.H = str;
        this.I = str2;
        this.F = str3;
        this.J = str4;
        this.K = toolDisplayContent;
    }

    public /* synthetic */ gr4(us4 us4Var, f fVar, dx4 dx4Var, zy7 zy7Var, rwe rweVar, zy7 zy7Var2) {
        this.G = us4Var;
        this.H = fVar;
        this.I = dx4Var;
        this.F = zy7Var;
        this.K = rweVar;
        this.J = zy7Var2;
    }
}
