package defpackage;

import com.anthropic.claude.api.model.Badge;
import com.anthropic.claude.api.model.ModelSelectorEntry;
import com.anthropic.claude.types.strings._ServerLocalizedString;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class d32 implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ boolean F;
    public final /* synthetic */ long G;
    public final /* synthetic */ Object H;

    public /* synthetic */ d32(String str, boolean z, long j) {
        this.E = 0;
        this.F = z;
        this.G = j;
        this.H = str;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        long j;
        tkh tkhVar;
        cpc cpcVar;
        String localizedText;
        _ServerLocalizedString message;
        String localizedText2;
        tkh tkhVar2;
        tkh tkhVar3;
        int i = this.E;
        iei ieiVar = iei.a;
        boolean z = this.F;
        Object obj3 = this.H;
        switch (i) {
            case 0:
                String str = (String) obj3;
                ld4 ld4Var = (ld4) obj;
                int iIntValue = ((Integer) obj2).intValue();
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(1 & iIntValue, (iIntValue & 3) != 2)) {
                    e18Var.T();
                } else {
                    tkh tkhVar4 = ((jm3) gm3.c(e18Var).e.E).i;
                    if (z) {
                        e18Var.a0(232580245);
                        e18Var.p(false);
                        j = this.G;
                    } else {
                        e18Var.a0(232581238);
                        long j2 = gm3.a(e18Var).O;
                        e18Var.p(false);
                        j = j2;
                    }
                    tjh.b(str, null, j, 0L, null, null, null, 0L, null, null, 0L, 2, false, 2, 0, null, tkhVar4, e18Var, 0, 24960, 110586);
                }
                break;
            case 1:
                ModelSelectorEntry modelSelectorEntry = (ModelSelectorEntry) obj3;
                ld4 ld4Var2 = (ld4) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                e18 e18Var2 = (e18) ld4Var2;
                if (!e18Var2.Q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    e18Var2.T();
                } else {
                    cxe cxeVarA = axe.a(new ho0(8.0f, true, new sz6(1)), lja.Q, e18Var2, 54);
                    int iHashCode = Long.hashCode(e18Var2.T);
                    hyc hycVarL = e18Var2.l();
                    iqb iqbVarE = kxk.E(e18Var2, fqb.E);
                    dd4.e.getClass();
                    re4 re4Var = cd4.b;
                    e18Var2.e0();
                    if (e18Var2.S) {
                        e18Var2.k(re4Var);
                    } else {
                        e18Var2.n0();
                    }
                    d4c.i0(e18Var2, cd4.f, cxeVarA);
                    d4c.i0(e18Var2, cd4.e, hycVarL);
                    d4c.i0(e18Var2, cd4.g, Integer.valueOf(iHashCode));
                    d4c.h0(e18Var2, cd4.h);
                    d4c.i0(e18Var2, cd4.d, iqbVarE);
                    String displayName = modelSelectorEntry.getDisplayName();
                    if (z) {
                        e18Var2.a0(-2035473520);
                        tkhVar = ((jm3) gm3.c(e18Var2).e.E).f;
                        e18Var2.p(false);
                    } else {
                        e18Var2.a0(-2035380396);
                        tkhVar = ((jm3) gm3.c(e18Var2).e.E).e;
                        e18Var2.p(false);
                    }
                    tjh.b(displayName, null, this.G, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, tkhVar, e18Var2, 0, 24960, 110586);
                    Badge badge = modelSelectorEntry.getBadge();
                    String string = null;
                    if (badge == null || (message = badge.getMessage()) == null || (localizedText2 = message.getLocalizedText()) == null || !(!bsg.I0(localizedText2))) {
                        badge = null;
                    }
                    if (badge == null) {
                        e18Var2.a0(-2035039738);
                        e18Var2.p(false);
                    } else {
                        e18Var2.a0(-2035039737);
                        jl3 jl3VarA = gm3.a(e18Var2);
                        int i2 = g32.a[badge.getVariant().ordinal()];
                        if (i2 == 1) {
                            cpcVar = new cpc(new d54(jl3VarA.q), new d54(jl3VarA.N));
                        } else if (i2 == 2) {
                            cpcVar = new cpc(new d54(d54.b(0.1f, jl3VarA.k)), new d54(jl3VarA.j));
                        } else if (i2 != 3) {
                            wg6.i();
                        } else {
                            cpcVar = new cpc(new d54(d54.b(0.1f, jl3VarA.Q)), new d54(jl3VarA.Q));
                        }
                        long j3 = ((d54) cpcVar.E).a;
                        long j4 = ((d54) cpcVar.F).a;
                        _ServerLocalizedString message2 = badge.getMessage();
                        if (message2 != null && (localizedText = message2.getLocalizedText()) != null) {
                            string = bsg.k1(localizedText).toString();
                        }
                        if (string == null) {
                            string = "";
                        }
                        zmk.f(string, null, null, j3, j4, new qnc(8.0f, 2.0f, 8.0f, 2.0f), null, xve.a, ((jm3) gm3.c(e18Var2).e.E).l, e18Var2, 196608, 70);
                        e18Var2.p(false);
                    }
                    e18Var2.p(true);
                }
                break;
            case 2:
                zb0 zb0Var = (zb0) obj3;
                ld4 ld4Var3 = (ld4) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                e18 e18Var3 = (e18) ld4Var3;
                if (!e18Var3.Q(1 & iIntValue3, (iIntValue3 & 3) != 2)) {
                    e18Var3.T();
                } else {
                    if (z) {
                        e18Var3.a0(41951380);
                        tkhVar2 = (tkh) ((wk) gm3.c(e18Var3).e.F).h;
                    } else {
                        e18Var3.a0(41952911);
                        tkhVar2 = (tkh) ((wk) gm3.c(e18Var3).e.F).f;
                    }
                    e18Var3.p(false);
                    tjh.c(zb0Var, null, this.G, 0L, 0L, null, 0L, 0, false, 0, 0, null, null, tkhVar2, e18Var3, 0, 0, 262138);
                }
                break;
            default:
                gnd gndVar = (gnd) obj3;
                ld4 ld4Var4 = (ld4) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                e18 e18Var4 = (e18) ld4Var4;
                if (!e18Var4.Q(1 & iIntValue4, (iIntValue4 & 3) != 2)) {
                    e18Var4.T();
                } else {
                    String strJ0 = d4c.j0(hnd.b(gndVar), e18Var4);
                    if (z) {
                        e18Var4.a0(-1663661965);
                        tkhVar3 = ((jm3) gm3.c(e18Var4).e.E).h;
                        e18Var4.p(false);
                    } else {
                        e18Var4.a0(-1663581737);
                        tkhVar3 = ((jm3) gm3.c(e18Var4).e.E).g;
                        e18Var4.p(false);
                    }
                    tjh.b(strJ0, null, this.G, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, tkhVar3, e18Var4, 0, 0, 131066);
                }
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ d32(Object obj, boolean z, long j, int i) {
        this.E = i;
        this.H = obj;
        this.F = z;
        this.G = j;
    }

    public /* synthetic */ d32(boolean z, zb0 zb0Var, long j) {
        this.E = 2;
        this.F = z;
        this.H = zb0Var;
        this.G = j;
    }
}
