package defpackage;

import com.anthropic.claude.conway.h;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class r50 implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ boolean F;
    public final /* synthetic */ zy7 G;
    public final /* synthetic */ iqb H;
    public final /* synthetic */ int I;

    public /* synthetic */ r50(iqb iqbVar, zy7 zy7Var, boolean z, int i) {
        this.E = 0;
        this.H = iqbVar;
        this.G = zy7Var;
        this.F = z;
        this.I = i;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        int i2 = this.I;
        iqb iqbVar = this.H;
        zy7 zy7Var = this.G;
        boolean z = this.F;
        ld4 ld4Var = (ld4) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                rqk.g(x44.p0(i2 | 1), ld4Var, zy7Var, iqbVar, z);
                break;
            case 1:
                jwk.g(x44.p0(i2 | 1), ld4Var, zy7Var, iqbVar, z);
                break;
            case 2:
                h.e(x44.p0(i2 | 1), ld4Var, zy7Var, iqbVar, z);
                break;
            case 3:
                t3c.f(x44.p0(i2 | 1), ld4Var, zy7Var, iqbVar, z);
                break;
            case 4:
                unk.h(x44.p0(i2 | 1), ld4Var, zy7Var, iqbVar, z);
                break;
            default:
                gjk.d(x44.p0(i2 | 1), ld4Var, zy7Var, iqbVar, z);
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ r50(int i, int i2, zy7 zy7Var, iqb iqbVar, boolean z) {
        this.E = i2;
        this.F = z;
        this.G = zy7Var;
        this.H = iqbVar;
        this.I = i;
    }
}
