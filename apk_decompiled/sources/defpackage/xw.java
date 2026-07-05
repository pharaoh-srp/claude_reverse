package defpackage;

import com.anthropic.claude.code.remote.e;
import com.anthropic.claude.project.details.g;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class xw implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ boolean F;
    public final /* synthetic */ zy7 G;
    public final /* synthetic */ iqb H;
    public final /* synthetic */ int I;
    public final /* synthetic */ int J;

    public /* synthetic */ xw(int i, int i2, zy7 zy7Var, iqb iqbVar, boolean z) {
        this.E = 3;
        this.G = zy7Var;
        this.F = z;
        this.H = iqbVar;
        this.I = i;
        this.J = i2;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        int i2 = this.I;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                npk.a(x44.p0(i2 | 1), this.J, (ld4) obj, this.G, this.H, this.F);
                break;
            case 1:
                ((Integer) obj2).getClass();
                e.d(x44.p0(i2 | 1), this.J, (ld4) obj, this.G, this.H, this.F);
                break;
            case 2:
                ((Integer) obj2).getClass();
                g.a(x44.p0(i2 | 1), this.J, (ld4) obj, this.G, this.H, this.F);
                break;
            default:
                ((Integer) obj2).getClass();
                thk.b(x44.p0(i2 | 1), this.J, (ld4) obj, this.G, this.H, this.F);
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ xw(boolean z, zy7 zy7Var, iqb iqbVar, int i, int i2, int i3) {
        this.E = i3;
        this.F = z;
        this.G = zy7Var;
        this.H = iqbVar;
        this.I = i;
        this.J = i2;
    }
}
