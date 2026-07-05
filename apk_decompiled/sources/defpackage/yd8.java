package defpackage;

import com.anthropic.claude.R;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class yd8 implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ int F;
    public final /* synthetic */ int G;

    public /* synthetic */ yd8(int i, int i2, int i3) {
        this.E = 0;
        this.F = i;
        this.G = i2;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        long j;
        long j2;
        int i = this.E;
        iei ieiVar = iei.a;
        int i2 = this.G;
        int i3 = this.F;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                rrk.e(i3, i2, (ld4) obj, x44.p0(1));
                break;
            case 1:
                ld4 ld4Var = (ld4) obj;
                int iIntValue = ((Integer) obj2).intValue();
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(1 & iIntValue, (iIntValue & 3) != 2)) {
                    e18Var.T();
                } else {
                    ud0 ud0Var = ud0.P0;
                    String strJ0 = d4c.j0(R.string.recipe_decrease_servings, e18Var);
                    if (i3 > i2) {
                        e18Var.a0(-925265959);
                        j = gm3.a(e18Var).M;
                        e18Var.p(false);
                    } else {
                        e18Var.a0(-925186599);
                        j = gm3.a(e18Var).O;
                        e18Var.p(false);
                    }
                    iv1.b(ud0Var, strJ0, null, ef2.F, j, e18Var, 3072, 4);
                }
                break;
            default:
                ld4 ld4Var2 = (ld4) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                e18 e18Var2 = (e18) ld4Var2;
                if (!e18Var2.Q(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                    e18Var2.T();
                } else {
                    ud0 ud0Var2 = ud0.d;
                    String strJ02 = d4c.j0(R.string.recipe_increase_servings, e18Var2);
                    if (i3 < i2) {
                        e18Var2.a0(1867071632);
                        j2 = gm3.a(e18Var2).M;
                        e18Var2.p(false);
                    } else {
                        e18Var2.a0(1867150992);
                        j2 = gm3.a(e18Var2).O;
                        e18Var2.p(false);
                    }
                    iv1.b(ud0Var2, strJ02, null, ef2.F, j2, e18Var2, 3072, 4);
                }
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ yd8(int i, int i2, int i3, byte b) {
        this.E = i3;
        this.F = i;
        this.G = i2;
    }
}
