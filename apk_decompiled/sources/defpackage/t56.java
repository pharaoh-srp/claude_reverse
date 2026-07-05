package defpackage;

import androidx.compose.foundation.layout.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.anthropic.claude.api.tasks.TaskSessionEvent;
import com.anthropic.claude.api.tasks.f;
import com.anthropic.claude.design.icon.a;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.json.JsonObject;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class t56 implements rz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ List F;
    public final /* synthetic */ nwb G;

    public /* synthetic */ t56(List list, nwb nwbVar, int i) {
        this.E = i;
        this.F = list;
        this.G = nwbVar;
    }

    @Override // defpackage.rz7
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean z;
        boolean z2;
        int i;
        int i2 = this.E;
        iei ieiVar = iei.a;
        lz1 lz1Var = jd4.a;
        nwb nwbVar = this.G;
        List<s56> list = this.F;
        switch (i2) {
            case 0:
                ld4 ld4Var = (ld4) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((s64) obj).getClass();
                e18 e18Var = (e18) ld4Var;
                if (e18Var.Q(iIntValue & 1, (iIntValue & 17) != 16)) {
                    for (s56 s56Var : list) {
                        String str = s56Var.b;
                        ud0 ud0Var = s56Var.a;
                        ud0 ud0Var2 = ud0.d;
                        bpc bpcVarA = a.a(ud0Var, e18Var);
                        boolean zF = e18Var.f(nwbVar) | e18Var.f(s56Var);
                        Object objN = e18Var.N();
                        if (zF || objN == lz1Var) {
                            objN = new w95(s56Var, 12, nwbVar);
                            e18Var.k0(objN);
                        }
                        uuj.a(str, bpcVarA, (zy7) objN, null, null, false, null, null, null, null, 0, 0, e18Var, 64, 4088);
                    }
                } else {
                    e18Var.T();
                }
                return ieiVar;
            case 1:
                ld4 ld4Var2 = (ld4) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((px9) obj).getClass();
                e18 e18Var2 = (e18) ld4Var2;
                if (e18Var2.Q(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    String strJ0 = d4c.j0(R.string.ccr_environment_network_access_label, e18Var2);
                    tkh tkhVar = ((jm3) gm3.c(e18Var2).e.E).f;
                    long j = gm3.a(e18Var2).M;
                    fqb fqbVar = fqb.E;
                    float f = 1.0f;
                    tjh.b(strJ0, gb9.K(b.c(fqbVar, 1.0f), 32.0f, 8.0f), j, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, tkhVar, e18Var2, 0, 0, 131064);
                    e18 e18Var3 = e18Var2;
                    float f2 = 16.0f;
                    iqb iqbVarT = ez1.t(yfd.p(xn5.V(gb9.L(b.c(fqbVar, 1.0f), 16.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 2), xve.b(12.0f)), gm3.a(e18Var3).p, zni.b), 1.0f, gm3.a(e18Var3).v, xve.b(12.0f));
                    q64 q64VarA = p64.a(ko0.c, lja.S, e18Var3, 0);
                    int iHashCode = Long.hashCode(e18Var3.T);
                    hyc hycVarL = e18Var3.l();
                    iqb iqbVarE = kxk.E(e18Var3, iqbVarT);
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
                    e18Var3.a0(240430877);
                    int i3 = 0;
                    for (Object obj4 : list) {
                        int i4 = i3 + 1;
                        if (i3 < 0) {
                            x44.n0();
                            throw null;
                        }
                        m0c m0cVar = (m0c) obj4;
                        boolean z3 = m0cVar == ((m0c) nwbVar.getValue());
                        if (m0cVar == m0c.E) {
                            z = z3;
                            z2 = true;
                        } else {
                            z = z3;
                            z2 = false;
                        }
                        boolean zD = e18Var3.d(m0cVar.ordinal());
                        Object objN2 = e18Var3.N();
                        if (zD || objN2 == lz1Var) {
                            objN2 = new w95(m0cVar, 15, nwbVar);
                            e18Var3.k0(objN2);
                        }
                        e18 e18Var4 = e18Var3;
                        vtk.b(m0cVar, z, z2, (zy7) objN2, b.c(fqbVar, f), e18Var4, 24576);
                        e18Var3 = e18Var4;
                        if (i3 < list.size() - 1) {
                            e18Var3.a0(-570204400);
                            iuj.e(null, MTTypesetterKt.kLineSkipLimitMultiplier, gm3.a(e18Var3).v, e18Var3, 0, 3);
                            e18Var3.p(false);
                        } else {
                            e18Var3.a0(-570021810);
                            e18Var3.p(false);
                        }
                        f2 = 16.0f;
                        i3 = i4;
                        f = 1.0f;
                    }
                    e18Var3.p(false);
                    e18Var3.p(true);
                    kxk.g(e18Var3, b.e(fqbVar, f2));
                } else {
                    e18Var2.T();
                }
                return ieiVar;
            default:
                ld4 ld4Var3 = (ld4) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((px9) obj).getClass();
                e18 e18Var5 = (e18) ld4Var3;
                if (e18Var5.Q(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    List list2 = list;
                    if ((list2 instanceof Collection) && list2.isEmpty()) {
                        i = 0;
                    } else {
                        Iterator it = list2.iterator();
                        i = 0;
                        while (it.hasNext()) {
                            TaskSessionEvent taskSessionEvent = ((u7h) it.next()).c;
                            JsonObject jsonObject = f.a;
                            taskSessionEvent.getClass();
                            if (f.c(taskSessionEvent) != null && (i = i + 1) < 0) {
                                x44.m0();
                                throw null;
                            }
                        }
                    }
                    if (i > 0) {
                        e18Var5.a0(2142049365);
                        boolean zBooleanValue = ((Boolean) nwbVar.getValue()).booleanValue();
                        boolean zF2 = e18Var5.f(nwbVar);
                        Object objN3 = e18Var5.N();
                        if (zF2 || objN3 == lz1Var) {
                            objN3 = new lxf(10, nwbVar);
                            e18Var5.k0(objN3);
                        }
                        p5h.f(i, 0, e18Var5, (zy7) objN3, zBooleanValue);
                        e18Var5.p(false);
                    } else {
                        e18Var5.a0(2142265590);
                        e18Var5.p(false);
                    }
                } else {
                    e18Var5.T();
                }
                return ieiVar;
        }
    }
}
