package defpackage;

import com.anthropic.claude.R;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class jmb implements pz7 {
    public final /* synthetic */ int E = 0;
    public final /* synthetic */ boolean F;
    public final /* synthetic */ boolean G;
    public final /* synthetic */ int H;

    public /* synthetic */ jmb(boolean z, int i, boolean z2) {
        this.F = z;
        this.H = i;
        this.G = z2;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        String strN;
        long j;
        int i = this.E;
        iei ieiVar = iei.a;
        int i2 = this.H;
        boolean z = this.G;
        boolean z2 = this.F;
        switch (i) {
            case 0:
                ld4 ld4Var = (ld4) obj;
                int iIntValue = ((Integer) obj2).intValue();
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(1 & iIntValue, (iIntValue & 3) != 2)) {
                    e18Var.T();
                } else {
                    if (z2) {
                        e18Var.a0(854178098);
                        strN = d4c.f0(R.plurals.calendars_selected_count, i2, new Object[]{Integer.valueOf(i2)}, e18Var);
                        e18Var.p(false);
                    } else {
                        strN = vb7.n(e18Var, 854406072, R.string.calendars_unavailable, e18Var, false);
                    }
                    String str = strN;
                    tkh tkhVar = ((jm3) gm3.c(e18Var).e.E).g;
                    if (z) {
                        e18Var.a0(-110978955);
                        j = gm3.a(e18Var).y;
                    } else {
                        e18Var.a0(-110977869);
                        j = gm3.a(e18Var).N;
                    }
                    e18Var.p(false);
                    tjh.b(str, null, j, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, tkhVar, e18Var, 0, 0, 131066);
                }
                break;
            default:
                ((Integer) obj2).intValue();
                ghk.d(z2, z, (ld4) obj, x44.p0(1 | i2));
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ jmb(boolean z, boolean z2, int i) {
        this.F = z;
        this.G = z2;
        this.H = i;
    }
}
