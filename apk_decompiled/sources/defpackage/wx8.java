package defpackage;

import androidx.compose.foundation.layout.b;
import com.anthropic.claude.R;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class wx8 implements pz7 {
    public final /* synthetic */ int E = 1;
    public final /* synthetic */ int F;
    public final /* synthetic */ int G;
    public final /* synthetic */ Object H;

    public /* synthetic */ wx8(int i, int i2, int i3, iqb iqbVar) {
        this.F = i;
        this.G = i2;
        this.H = iqbVar;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        int i2 = this.G;
        int i3 = this.F;
        Object obj3 = this.H;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                fuk.m(i3, x44.p0(1 | i2), (ld4) obj, (iqb) obj3);
                break;
            case 1:
                ((Integer) obj2).getClass();
                b5j.a(i3, i2, x44.p0(1), (ld4) obj, (iqb) obj3);
                break;
            default:
                jm3 jm3Var = (jm3) obj3;
                ld4 ld4Var = (ld4) obj;
                int iIntValue = ((Integer) obj2).intValue();
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(1 & iIntValue, (iIntValue & 3) != 2)) {
                    e18Var.T();
                } else {
                    tjh.b(d4c.j0(R.string.session_pill_diff, e18Var), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, jm3Var.h, e18Var, 0, 0, 131070);
                    kxk.g(e18Var, b.t(fqb.E, 8.0f));
                    e18Var.a0(-1522260755);
                    xsc.a(i3, i2, jm3Var.h, e18Var, 0);
                    e18Var.p(false);
                }
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ wx8(int i, int i2, iqb iqbVar) {
        this.F = i;
        this.H = iqbVar;
        this.G = i2;
    }

    public /* synthetic */ wx8(jm3 jm3Var, int i, int i2) {
        this.H = jm3Var;
        this.F = i;
        this.G = i2;
    }
}
