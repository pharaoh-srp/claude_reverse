package defpackage;

import com.anthropic.claude.settings.internal.e;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class iv0 implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ zy7 F;
    public final /* synthetic */ iqb G;
    public final /* synthetic */ ta4 H;
    public final /* synthetic */ int I;
    public final /* synthetic */ int J;

    public /* synthetic */ iv0(zy7 zy7Var, iqb iqbVar, ta4 ta4Var, int i, int i2, int i3) {
        this.E = i3;
        this.F = zy7Var;
        this.G = iqbVar;
        this.H = ta4Var;
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
                int iP0 = x44.p0(i2 | 1);
                euk.b(this.F, this.G, this.H, (ld4) obj, iP0, this.J);
                break;
            default:
                ((Integer) obj2).getClass();
                int iP02 = x44.p0(i2 | 1);
                e.d(this.F, this.G, this.H, (ld4) obj, iP02, this.J);
                break;
        }
        return ieiVar;
    }
}
