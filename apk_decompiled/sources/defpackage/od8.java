package defpackage;

import androidx.compose.foundation.layout.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class od8 implements sz7 {
    public final /* synthetic */ List E;
    public final /* synthetic */ boolean F;
    public final /* synthetic */ mk4 G;
    public final /* synthetic */ py3 H;
    public final /* synthetic */ f7 I;
    public final /* synthetic */ List J;

    public od8(List list, boolean z, mk4 mk4Var, py3 py3Var, f7 f7Var, List list2) {
        this.E = list;
        this.F = z;
        this.G = mk4Var;
        this.H = py3Var;
        this.I = f7Var;
        this.J = list2;
    }

    @Override // defpackage.sz7
    public final Object i(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        px9 px9Var = (px9) obj;
        int iIntValue = ((Number) obj2).intValue();
        ld4 ld4Var = (ld4) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        if ((iIntValue2 & 6) == 0) {
            i = (((e18) ld4Var).f(px9Var) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= ((e18) ld4Var).d(iIntValue) ? 32 : 16;
        }
        e18 e18Var = (e18) ld4Var;
        if (e18Var.Q(i & 1, (i & 147) != 146)) {
            n18 n18Var = (n18) this.E.get(iIntValue);
            e18Var.a0(1011937632);
            mk4 mk4Var = this.G;
            boolean zF = e18Var.f(mk4Var) | e18Var.h(n18Var);
            Object objN = e18Var.N();
            lz1 lz1Var = jd4.a;
            if (zF || objN == lz1Var) {
                objN = new z04(mk4Var, 18, n18Var);
                e18Var.k0(objN);
            }
            bz7 bz7Var = (bz7) objN;
            py3 py3Var = this.H;
            boolean zF2 = e18Var.f(py3Var) | e18Var.h(n18Var);
            Object objN2 = e18Var.N();
            if (zF2 || objN2 == lz1Var) {
                objN2 = new p4(py3Var, 21, n18Var);
                e18Var.k0(objN2);
            }
            zy7 zy7Var = (zy7) objN2;
            f7 f7Var = this.I;
            boolean zF3 = e18Var.f(f7Var) | e18Var.h(n18Var);
            Object objN3 = e18Var.N();
            if (zF3 || objN3 == lz1Var) {
                objN3 = new p4(f7Var, 22, n18Var);
                e18Var.k0(objN3);
            }
            zy7 zy7Var2 = (zy7) objN3;
            iqb iqbVarA = px9.a(px9Var, fqb.E, null, null, 7);
            qnc qncVar = qf2.a;
            float f = MTTypesetterKt.kLineSkipLimitMultiplier;
            iqb iqbVarL = gb9.L(iqbVarA, 12.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 2);
            if (iIntValue > 0) {
                f = 2.0f;
            }
            iqb iqbVarC = b.c(gb9.N(iqbVarL, MTTypesetterKt.kLineSkipLimitMultiplier, f, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, 13), 1.0f);
            int size = this.J.size();
            tf2.E.getClass();
            pd8.c(n18Var, this.F, bz7Var, zy7Var, zy7Var2, ybi.p(iqbVarC, qf2.b(hj6.L(iIntValue, size), e18Var, 48)), e18Var, 8);
            e18Var.p(false);
        } else {
            e18Var.T();
        }
        return iei.a;
    }
}
