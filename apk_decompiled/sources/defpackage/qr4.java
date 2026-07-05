package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.anthropic.claude.conway.protocol.ConwayClientInfo;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class qr4 implements rz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ List F;

    public /* synthetic */ qr4(List list, int i) {
        this.E = i;
        this.F = list;
    }

    @Override // defpackage.rz7
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        e18 e18Var;
        fqb fqbVar;
        int i = this.E;
        iei ieiVar = iei.a;
        List<z05> list = this.F;
        switch (i) {
            case 0:
                ld4 ld4Var = (ld4) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((s64) obj).getClass();
                e18 e18Var2 = (e18) ld4Var;
                if (!e18Var2.Q(iIntValue & 1, (iIntValue & 17) != 16)) {
                    e18Var2.T();
                } else if (list.isEmpty()) {
                    e18Var2.a0(-1937947408);
                    zsk.b(d4c.j0(R.string.conway_system_capabilities_empty, e18Var2), null, e18Var2, 0);
                    e18Var2.p(false);
                } else {
                    e18Var2.a0(-1937832150);
                    int i2 = 0;
                    for (Object obj4 : list) {
                        int i3 = i2 + 1;
                        if (i2 < 0) {
                            x44.n0();
                            throw null;
                        }
                        ConwayClientInfo conwayClientInfo = (ConwayClientInfo) obj4;
                        if (i2 > 0) {
                            e18Var2.a0(-1884560116);
                            iuj.e(null, MTTypesetterKt.kLineSkipLimitMultiplier, gm3.a(e18Var2).v, e18Var2, 0, 3);
                        } else {
                            e18Var2.a0(1708231405);
                        }
                        e18Var2.p(false);
                        ask.b(conwayClientInfo, null, e18Var2, ConwayClientInfo.$stable);
                        i2 = i3;
                    }
                    e18Var2.p(false);
                }
                return ieiVar;
            case 1:
                ld4 ld4Var2 = (ld4) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                vo1 vo1Var = lja.S;
                ((ia0) obj).getClass();
                e18 e18Var3 = (e18) ld4Var2;
                if (e18Var3.Q(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    ho0 ho0Var = new ho0(8.0f, true, new sz6(1));
                    fqb fqbVar2 = fqb.E;
                    iqb iqbVarN = gb9.N(fqbVar2, 16.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 16.0f, 12.0f, 2);
                    q64 q64VarA = p64.a(ho0Var, vo1Var, e18Var3, 6);
                    int iHashCode = Long.hashCode(e18Var3.T);
                    hyc hycVarL = e18Var3.l();
                    iqb iqbVarE = kxk.E(e18Var3, iqbVarN);
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
                    e18Var3.a0(-325535954);
                    for (z05 z05Var : list) {
                        q64 q64VarA2 = p64.a(ko0.c, vo1Var, e18Var3, 0);
                        int iHashCode2 = Long.hashCode(e18Var3.T);
                        hyc hycVarL2 = e18Var3.l();
                        iqb iqbVarE2 = kxk.E(e18Var3, fqbVar2);
                        dd4.e.getClass();
                        re4 re4Var2 = cd4.b;
                        e18Var3.e0();
                        if (e18Var3.S) {
                            e18Var3.k(re4Var2);
                        } else {
                            e18Var3.n0();
                        }
                        d4c.i0(e18Var3, cd4.f, q64VarA2);
                        d4c.i0(e18Var3, cd4.e, hycVarL2);
                        d4c.i0(e18Var3, cd4.g, Integer.valueOf(iHashCode2));
                        d4c.h0(e18Var3, cd4.h);
                        d4c.i0(e18Var3, cd4.d, iqbVarE2);
                        if (z05Var.a != null) {
                            e18Var3.a0(-438937502);
                            fqb fqbVar3 = fqbVar2;
                            String str = z05Var.a;
                            tkh tkhVar = ((jm3) gm3.c(e18Var3).e.E).j;
                            long j = gm3.a(e18Var3).N;
                            e18 e18Var4 = e18Var3;
                            fqbVar = fqbVar3;
                            tjh.b(str, null, j, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, tkhVar, e18Var4, 0, 0, 131066);
                            e18Var = e18Var4;
                            e18Var.p(false);
                        } else {
                            e18Var = e18Var3;
                            fqbVar = fqbVar2;
                            e18Var.a0(-438680109);
                            e18Var.p(false);
                        }
                        e18Var.a0(-1815264692);
                        Iterator it = z05Var.b.iterator();
                        while (it.hasNext()) {
                            fqb fqbVar4 = fqbVar;
                            tjh.b((String) it.next(), gb9.N(fqbVar4, z05Var.a != null ? 12.0f : 0.0f, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, 14), gm3.a(e18Var).O, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var).e.E).i, e18Var, 0, 0, 131064);
                            fqbVar = fqbVar4;
                        }
                        fqb fqbVar5 = fqbVar;
                        e18Var.p(false);
                        e18Var.p(true);
                        e18Var3 = e18Var;
                        fqbVar2 = fqbVar5;
                    }
                    e18 e18Var5 = e18Var3;
                    e18Var5.p(false);
                    e18Var5.p(true);
                } else {
                    e18Var3.T();
                }
                return ieiVar;
            default:
                ld4 ld4Var3 = (ld4) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((s64) obj).getClass();
                e18 e18Var6 = (e18) ld4Var3;
                if (e18Var6.Q(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        pqi.f((uli) it2.next(), null, e18Var6, 0);
                    }
                } else {
                    e18Var6.T();
                }
                return ieiVar;
        }
    }
}
