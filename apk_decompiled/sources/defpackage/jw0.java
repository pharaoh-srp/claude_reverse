package defpackage;

import com.anthropic.claude.tasks.ui.q;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class jw0 implements pz7 {
    public final /* synthetic */ int E = 1;
    public final /* synthetic */ String F;
    public final /* synthetic */ boolean G;
    public final /* synthetic */ boolean H;
    public final /* synthetic */ bz7 I;
    public final /* synthetic */ zy7 J;
    public final /* synthetic */ iqb K;
    public final /* synthetic */ int L;

    public /* synthetic */ jw0(String str, boolean z, boolean z2, bz7 bz7Var, zy7 zy7Var, iqb iqbVar, int i) {
        this.F = str;
        this.G = z;
        this.H = z2;
        this.I = bz7Var;
        this.J = zy7Var;
        this.K = iqbVar;
        this.L = i;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        int i2 = this.L;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                huk.d(x44.p0(i2 | 1), (ld4) obj, this.J, this.I, this.K, this.F, this.G, this.H);
                break;
            default:
                ((Integer) obj2).getClass();
                q.g(x44.p0(i2 | 1), (ld4) obj, this.J, this.I, this.K, this.F, this.G, this.H);
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ jw0(boolean z, boolean z2, String str, bz7 bz7Var, zy7 zy7Var, iqb iqbVar, int i) {
        this.G = z;
        this.H = z2;
        this.F = str;
        this.I = bz7Var;
        this.J = zy7Var;
        this.K = iqbVar;
        this.L = i;
    }
}
