package defpackage;

import androidx.compose.foundation.layout.b;
import com.anthropic.claude.R;
import com.anthropic.claude.code.remote.bottomsheet.a;
import com.anthropic.claude.tool.model.Tool;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ay3 implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ int F;
    public final /* synthetic */ Object G;

    public /* synthetic */ ay3(int i, jm3 jm3Var) {
        this.E = 6;
        this.F = i;
        this.G = jm3Var;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        int i2 = this.F;
        Object obj3 = this.G;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                a.r((mnc) obj3, (ld4) obj, x44.p0(i2 | 1));
                break;
            case 1:
                ((Integer) obj2).intValue();
                wsk.b((cte) obj3, (ld4) obj, x44.p0(i2 | 1));
                break;
            case 2:
                zw9 zw9Var = (zw9) obj3;
                ld4 ld4Var = (ld4) obj;
                int iIntValue = ((Integer) obj2).intValue();
                e18 e18Var = (e18) ld4Var;
                if (e18Var.Q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ra9 ra9VarC = zw9Var.b.m.c(i2);
                    ((vw9) ra9VarC.c).d.i(ax9.a, Integer.valueOf(i2 - ra9VarC.a), e18Var, 6);
                } else {
                    e18Var.T();
                }
                break;
            case 3:
                ((Integer) obj2).getClass();
                ((tqh) obj3).B(i2, x44.p0(49), (ld4) obj);
                break;
            case 4:
                aoc aocVar = (aoc) obj3;
                ld4 ld4Var2 = (ld4) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                e18 e18Var2 = (e18) ld4Var2;
                if (e18Var2.Q(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                    ra9 ra9VarC2 = aocVar.b.w().c(i2);
                    ((ync) ra9VarC2.c).b.i(doc.a, Integer.valueOf(i2 - ra9VarC2.a), e18Var2, 0);
                } else {
                    e18Var2.T();
                }
                break;
            case 5:
                ((Integer) obj2).getClass();
                hvk.c((Tool) obj3, (ld4) obj, x44.p0(i2 | 1));
                break;
            case 6:
                jm3 jm3Var = (jm3) obj3;
                ld4 ld4Var3 = (ld4) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                e18 e18Var3 = (e18) ld4Var3;
                if (e18Var3.Q(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    cxe cxeVarA = axe.a(ko0.a, lja.Q, e18Var3, 48);
                    int iHashCode = Long.hashCode(e18Var3.T);
                    hyc hycVarL = e18Var3.l();
                    fqb fqbVar = fqb.E;
                    iqb iqbVarE = kxk.E(e18Var3, fqbVar);
                    dd4.e.getClass();
                    re4 re4Var = cd4.b;
                    e18Var3.e0();
                    if (e18Var3.S) {
                        e18Var3.k(re4Var);
                    } else {
                        e18Var3.n0();
                    }
                    d4c.i0(e18Var3, cd4.f, cxeVarA);
                    d4c.i0(e18Var3, cd4.e, hycVarL);
                    d4c.i0(e18Var3, cd4.g, Integer.valueOf(iHashCode));
                    d4c.h0(e18Var3, cd4.h);
                    d4c.i0(e18Var3, cd4.d, iqbVarE);
                    iv1.b(ud0.e, null, null, ef2.F, gm3.a(e18Var3).c, e18Var3, 3120, 4);
                    kxk.g(e18Var3, b.t(fqbVar, 8.0f));
                    tjh.b(d4c.f0(R.plurals.workflow_chip_text, i2, new Object[]{Integer.valueOf(i2)}, e18Var3), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, jm3Var.g, e18Var3, 0, 0, 131070);
                    e18Var3.p(true);
                } else {
                    e18Var3.T();
                }
                break;
            case 7:
                List<List> list = (List) obj3;
                ld4 ld4Var4 = (ld4) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                e18 e18Var4 = (e18) ld4Var4;
                if (e18Var4.Q(1 & iIntValue4, (iIntValue4 & 3) != 2)) {
                    for (List list2 : list) {
                        if (list2.size() != i2) {
                            sz6.j("Check failed.");
                        } else {
                            e18Var4.a0(-387907143);
                            Iterator it = list2.iterator();
                            while (it.hasNext()) {
                                ((pz7) it.next()).invoke(e18Var4, 0);
                            }
                            e18Var4.p(false);
                        }
                    }
                } else {
                    e18Var4.T();
                }
                break;
            case 8:
                ((Integer) obj2).intValue();
                p5h.g((pz7) obj3, (ld4) obj, x44.p0(i2 | 1));
                break;
            default:
                ((Integer) obj2).intValue();
                ktk.e((rvh) obj3, (ld4) obj, x44.p0(i2 | 1));
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ ay3(tqh tqhVar, int i, int i2) {
        this.E = 3;
        this.G = tqhVar;
        this.F = i;
    }

    public /* synthetic */ ay3(Object obj, int i, int i2) {
        this.E = i2;
        this.G = obj;
        this.F = i;
    }
}
