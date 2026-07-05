package defpackage;

import com.anthropic.claude.code.remote.i;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class tvh implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ rvh F;
    public final /* synthetic */ i G;
    public final /* synthetic */ i4g H;
    public final /* synthetic */ bz7 I;
    public final /* synthetic */ int J;

    public /* synthetic */ tvh(rvh rvhVar, i iVar, i4g i4gVar, bz7 bz7Var, int i, int i2) {
        this.E = i2;
        this.F = rvhVar;
        this.G = iVar;
        this.H = i4gVar;
        this.I = bz7Var;
        this.J = i;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        int i2 = this.J;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iP0 = x44.p0(i2 | 1);
                ktk.o(this.F, this.G, this.H, this.I, (ld4) obj, iP0);
                break;
            default:
                ((Integer) obj2).getClass();
                int iP02 = x44.p0(i2 | 1);
                ktk.m(this.F, this.G, this.H, this.I, (ld4) obj, iP02);
                break;
        }
        return ieiVar;
    }
}
