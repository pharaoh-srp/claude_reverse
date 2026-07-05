package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class xxf implements sz7 {
    public final /* synthetic */ List E;
    public final /* synthetic */ rz7 F;
    public final /* synthetic */ int G;
    public final /* synthetic */ rz7 H;
    public final /* synthetic */ Object I;
    public final /* synthetic */ bz7 J;
    public final /* synthetic */ zy7 K;
    public final /* synthetic */ List L;

    public xxf(List list, rz7 rz7Var, int i, rz7 rz7Var2, Object obj, bz7 bz7Var, zy7 zy7Var, List list2) {
        this.E = list;
        this.F = rz7Var;
        this.G = i;
        this.H = rz7Var2;
        this.I = obj;
        this.J = bz7Var;
        this.K = zy7Var;
        this.L = list2;
    }

    @Override // defpackage.sz7
    public final Object i(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        int i2;
        iei ieiVar;
        int i3;
        rz7 rz7Var;
        bz7 bz7Var;
        Object obj5;
        zy7 zy7Var;
        lz1 lz1Var;
        e18 e18Var;
        iei ieiVar2;
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
        e18 e18Var2 = (e18) ld4Var;
        boolean zQ = e18Var2.Q(i & 1, (i & 147) != 146);
        iei ieiVar3 = iei.a;
        if (!zQ) {
            e18Var2.T();
            return ieiVar3;
        }
        Object obj6 = this.E.get(iIntValue);
        e18Var2.a0(197937593);
        int i4 = (this.G >> 3) & 8;
        bpc bpcVar = (bpc) this.F.invoke(obj6, e18Var2, Integer.valueOf(i4));
        lz1 lz1Var2 = jd4.a;
        Object obj7 = this.I;
        rz7 rz7Var2 = this.H;
        zy7 zy7Var2 = this.K;
        bz7 bz7Var2 = this.J;
        if (bpcVar == null) {
            e18Var2.a0(197936909);
            e18Var2.p(false);
            e18Var = e18Var2;
            lz1Var = lz1Var2;
            ieiVar2 = null;
            i2 = iIntValue;
            ieiVar = ieiVar3;
            i3 = i4;
            obj5 = obj7;
            rz7Var = rz7Var2;
            zy7Var = zy7Var2;
            bz7Var = bz7Var2;
        } else {
            e18Var2.a0(197936910);
            String str = (String) rz7Var2.invoke(obj6, e18Var2, Integer.valueOf(i4));
            boolean zR = x44.r(obj6, obj7);
            boolean zF = e18Var2.f(bz7Var2) | e18Var2.h(obj6) | e18Var2.f(zy7Var2);
            Object objN = e18Var2.N();
            if (zF || objN == lz1Var2) {
                objN = new vxf(bz7Var2, obj6, zy7Var2, 0);
                e18Var2.k0(objN);
            }
            zy7 zy7Var3 = (zy7) objN;
            i2 = iIntValue;
            ieiVar = ieiVar3;
            i3 = i4;
            rz7Var = rz7Var2;
            bz7Var = bz7Var2;
            obj5 = obj7;
            zy7Var = zy7Var2;
            lz1Var = lz1Var2;
            rta.d(bpcVar, str, zR, null, null, null, MTTypesetterKt.kLineSkipLimitMultiplier, 0L, zy7Var3, e18Var2, 8);
            e18Var = e18Var2;
            e18Var.p(false);
            ieiVar2 = ieiVar;
        }
        if (ieiVar2 == null) {
            e18Var.a0(-1656166686);
            String str2 = (String) rz7Var.invoke(obj6, e18Var, Integer.valueOf(i3));
            boolean zR2 = x44.r(obj6, obj5);
            boolean zF2 = e18Var.f(bz7Var) | e18Var.h(obj6) | e18Var.f(zy7Var);
            Object objN2 = e18Var.N();
            if (zF2 || objN2 == lz1Var) {
                objN2 = new vxf(bz7Var, obj6, zy7Var, 1);
                e18Var.k0(objN2);
            }
            e18 e18Var3 = e18Var;
            rta.e(null, str2, zR2, null, null, null, null, null, MTTypesetterKt.kLineSkipLimitMultiplier, null, (zy7) objN2, e18Var3, 6, 0, 1016);
            e18Var = e18Var3;
            e18Var.p(false);
        } else {
            e18Var.a0(-1656183054);
            e18Var.p(false);
        }
        if (i2 == x44.M(this.L)) {
            e18Var.a0(198883216);
            grc.z(fqb.E, 8.0f, e18Var, false);
        } else {
            e18Var.a0(198975472);
            e18Var.p(false);
        }
        e18Var.p(false);
        return ieiVar;
    }
}
