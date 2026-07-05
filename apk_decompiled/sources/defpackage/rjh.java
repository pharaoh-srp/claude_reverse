package defpackage;

import androidx.compose.foundation.layout.b;
import com.anthropic.claude.R;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class rjh implements rz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ Object F;
    public final /* synthetic */ Object G;
    public final /* synthetic */ Object H;
    public final /* synthetic */ qz7 I;
    public final /* synthetic */ Object J;

    public /* synthetic */ rjh(Object obj, Object obj2, Object obj3, qz7 qz7Var, Object obj4, int i) {
        this.E = i;
        this.F = obj;
        this.G = obj2;
        this.H = obj3;
        this.I = qz7Var;
        this.J = obj4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.rz7
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        iei ieiVar;
        String strN;
        float f;
        int i = this.E;
        iei ieiVar2 = iei.a;
        int i2 = 0;
        int i3 = 1;
        Object obj4 = this.J;
        qz7 qz7Var = this.I;
        Object obj5 = this.H;
        Object obj6 = this.G;
        Object obj7 = this.F;
        switch (i) {
            case 0:
                Map map = (Map) obj7;
                cte cteVar = (cte) obj6;
                zb0 zb0Var = (zb0) obj5;
                bz7 bz7Var = (bz7) qz7Var;
                mte mteVar = (mte) obj4;
                qw1 qw1Var = (qw1) obj;
                ld4 ld4Var = (ld4) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                qw1Var.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= ((e18) ld4Var).f(qw1Var) ? 4 : 2;
                }
                e18 e18Var = (e18) ld4Var;
                if (e18Var.Q(iIntValue & 1, (iIntValue & 19) != 18)) {
                    long j = qw1Var.b;
                    cz5 cz5Var = (cz5) e18Var.j(ve4.h);
                    e18Var.a0(1916225193);
                    LinkedHashMap linkedHashMap = new LinkedHashMap(tta.d0(map.size()));
                    Iterator it = map.entrySet().iterator();
                    while (true) {
                        boolean zHasNext = it.hasNext();
                        int i4 = i3;
                        Object obj8 = jd4.a;
                        if (zHasNext) {
                            Map.Entry entry = (Map.Entry) it.next();
                            Object key = entry.getKey();
                            final k39 k39Var = (k39) entry.getValue();
                            Iterator it2 = it;
                            iei ieiVar3 = ieiVar2;
                            final long jB = sl4.b(i2, rl4.h(j), i2, rl4.g(j), 5);
                            e18Var.a0(-1990137059);
                            Object objN = e18Var.N();
                            if (objN == obj8) {
                                bz7 bz7Var2 = k39Var.a;
                                Object lscVar = new lsc(bz7Var2 != null ? (g79) bz7Var2.invoke(cz5Var) : null, a5.N);
                                e18Var.k0(lscVar);
                                objN = lscVar;
                            }
                            final nwb nwbVar = (nwb) objN;
                            g79 g79Var = (g79) nwbVar.getValue();
                            boolean z = i2;
                            long jT = g79Var != null ? cz5Var.T((int) (g79Var.a >> 32)) : eve.B(z ? 1 : 0);
                            g79 g79Var2 = (g79) nwbVar.getValue();
                            final cz5 cz5Var2 = cz5Var;
                            t39 t39Var = new t39(new f3d(jT, k39Var.b, g79Var2 != null ? cz5Var.T((int) (g79Var2.a & 4294967295L)) : eve.B(i4)), fd9.q0(-877544637, new rz7() { // from class: l39
                                @Override // defpackage.rz7
                                public final Object invoke(Object obj9, Object obj10, Object obj11) {
                                    String str = (String) obj9;
                                    ld4 ld4Var2 = (ld4) obj10;
                                    int iIntValue2 = ((Integer) obj11).intValue();
                                    str.getClass();
                                    if ((iIntValue2 & 6) == 0) {
                                        iIntValue2 |= ((e18) ld4Var2).f(str) ? 4 : 2;
                                    }
                                    e18 e18Var2 = (e18) ld4Var2;
                                    if (e18Var2.Q(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                                        long j2 = jB;
                                        boolean zE = e18Var2.e(j2);
                                        Object objN2 = e18Var2.N();
                                        if (zE || objN2 == jd4.a) {
                                            objN2 = new m39(j2, nwbVar);
                                            e18Var2.k0(objN2);
                                        }
                                        o5b o5bVar = (o5b) objN2;
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
                                        d4c.i0(e18Var2, cd4.f, o5bVar);
                                        d4c.i0(e18Var2, cd4.e, hycVarL);
                                        d4c.i0(e18Var2, cd4.g, Integer.valueOf(iHashCode));
                                        d4c.h0(e18Var2, cd4.h);
                                        d4c.i0(e18Var2, cd4.d, iqbVarE);
                                        k39Var.c.i(cz5Var2, str, e18Var2, Integer.valueOf((iIntValue2 << 3) & 112));
                                        e18Var2.p(true);
                                    } else {
                                        e18Var2.T();
                                    }
                                    return iei.a;
                                }
                            }, e18Var));
                            e18Var.p(z);
                            linkedHashMap.put(key, t39Var);
                            it = it2;
                            i2 = z ? 1 : 0;
                            cz5Var = cz5Var2;
                            i3 = i4;
                            ieiVar2 = ieiVar3;
                        } else {
                            ieiVar = ieiVar2;
                            boolean z2 = i2;
                            e18Var.p(z2);
                            if (e18Var.j(p6a.a) != null) {
                                mr9.o();
                                return null;
                            }
                            e18Var.a0(-1140711909);
                            Object obj9 = (eli) e18Var.j(ve4.t);
                            e18Var.p(z2);
                            boolean zF = e18Var.f(zb0Var) | e18Var.f(mteVar);
                            Object objN2 = e18Var.N();
                            Object obj10 = objN2;
                            if (zF || objN2 == obj8) {
                                Object ojhVar = new ojh(zb0Var, mteVar, 2);
                                e18Var.k0(ojhVar);
                                obj10 = ojhVar;
                            }
                            bz7 bz7Var3 = (bz7) obj10;
                            boolean zF2 = e18Var.f(zb0Var) | e18Var.f(mteVar);
                            Object objN3 = e18Var.N();
                            Object obj11 = objN3;
                            if (zF2 || objN3 == obj8) {
                                Object ojhVar2 = new ojh(zb0Var, mteVar, 3);
                                e18Var.k0(ojhVar2);
                                obj11 = ojhVar2;
                            }
                            bz7 bz7Var4 = (bz7) obj11;
                            boolean zH = e18Var.h(obj9);
                            Object objN4 = e18Var.N();
                            Object obj12 = objN4;
                            if (zH || objN4 == obj8) {
                                Object xqcVar = new xqc(3, obj9);
                                e18Var.k0(xqcVar);
                                obj12 = xqcVar;
                            }
                            bte.a(cteVar, zb0Var, null, bz7Var, linkedHashMap, bz7Var3, bz7Var4, (bz7) obj12, e18Var, 0, 2);
                        }
                    }
                } else {
                    ieiVar = ieiVar2;
                    e18Var.T();
                }
                return ieiVar;
            default:
                String str = (String) obj7;
                String str2 = (String) obj6;
                zy7 zy7Var = (zy7) obj5;
                zy7 zy7Var2 = (zy7) qz7Var;
                zy7 zy7Var3 = (zy7) obj4;
                ld4 ld4Var2 = (ld4) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((s64) obj).getClass();
                e18 e18Var2 = (e18) ld4Var2;
                if (e18Var2.Q(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    fqb fqbVar = fqb.E;
                    iqb iqbVarJ = gb9.J(yfd.p(b.c(fqbVar, 1.0f), gm3.a(e18Var2).n, xve.b(8.0f)), 16.0f);
                    q64 q64VarA = p64.a(ko0.c, lja.T, e18Var2, 48);
                    int iHashCode = Long.hashCode(e18Var2.T);
                    hyc hycVarL = e18Var2.l();
                    iqb iqbVarE = kxk.E(e18Var2, iqbVarJ);
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
                    tjh.b(d4c.j0(R.string.chat_refusal_notice_header, e18Var2), null, gm3.a(e18Var2).M, 0L, null, null, null, 0L, null, new fdh(3), 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var2).e.E).d, e18Var2, 0, 0, 130042);
                    kxk.g(e18Var2, b.e(fqbVar, 12.0f));
                    String strC1 = str != null ? bsg.c1(str, "Claude ", str) : null;
                    if (str2 != null && strC1 != null) {
                        e18Var2.a0(513840949);
                        strN = d4c.k0(R.string.chat_refusal_notice_body_retry, new Object[]{strC1, str2}, e18Var2);
                        e18Var2.p(false);
                    } else if (strC1 != null) {
                        e18Var2.a0(513849610);
                        strN = d4c.k0(R.string.chat_refusal_notice_body_with_model, new Object[]{strC1}, e18Var2);
                        e18Var2.p(false);
                    } else {
                        strN = vb7.n(e18Var2, 513856175, R.string.chat_refusal_notice_body, e18Var2, false);
                    }
                    tjh.b(strN, null, gm3.a(e18Var2).M, 0L, null, null, null, 0L, null, new fdh(3), 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var2).e.E).g, e18Var2, 0, 0, 130042);
                    kxk.g(e18Var2, b.e(fqbVar, 16.0f));
                    e12 e12Var = e12.a;
                    if (str2 != null) {
                        e18Var2.a0(-1249917348);
                        f = 8.0f;
                        dtj.a(d4c.k0(R.string.chat_refusal_button_retry_with_model, new Object[]{str2}, e18Var2), b.c(fqbVar, 1.0f), false, null, e12Var, null, 0L, zy7Var, e18Var2, 24624, 108);
                        e18Var2.p(false);
                    } else {
                        f = 8.0f;
                        e18Var2.a0(-1249447140);
                        dtj.a(d4c.j0(R.string.chat_refusal_button_new_chat, e18Var2), b.c(fqbVar, 1.0f), false, null, e12Var, null, 0L, zy7Var2, e18Var2, 24624, 108);
                        e18Var2.p(false);
                    }
                    dtj.a(gid.p(f, R.string.chat_refusal_button_let_us_know, e18Var2, e18Var2, fqbVar), b.c(fqbVar, 1.0f), false, null, f12.a, null, 0L, zy7Var3, e18Var2, 24624, 108);
                    e18Var2.p(true);
                } else {
                    e18Var2.T();
                }
                return ieiVar2;
        }
    }
}
