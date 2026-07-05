package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class t72 implements sz7 {
    public final /* synthetic */ List E;
    public final /* synthetic */ eed F;
    public final /* synthetic */ float G;
    public final /* synthetic */ ta4 H;

    public t72(List list, eed eedVar, float f, ta4 ta4Var) {
        this.E = list;
        this.F = eedVar;
        this.G = f;
        this.H = ta4Var;
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
            Object obj5 = this.E.get(iIntValue);
            e18Var.a0(-1163034077);
            wd6.M(((Boolean) this.F.b.getValue()).booleanValue(), null, gp6.d(null, null, 15), gp6.l(null, null, 15), null, fd9.q0(61106288, new r72(this.G, this.H, obj5), e18Var), e18Var, 200064, 18);
            e18Var.p(false);
        } else {
            e18Var.T();
        }
        return iei.a;
    }
}
