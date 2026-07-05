package defpackage;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class jf2 implements pz7 {
    public final /* synthetic */ int E = 1;
    public final /* synthetic */ String F;
    public final /* synthetic */ iqb G;
    public final /* synthetic */ long H;
    public final /* synthetic */ int I;
    public final /* synthetic */ Object J;
    public final /* synthetic */ Object K;

    public /* synthetic */ jf2(bpc bpcVar, String str, zy7 zy7Var, iqb iqbVar, long j, int i, int i2) {
        this.J = bpcVar;
        this.F = str;
        this.K = zy7Var;
        this.G = iqbVar;
        this.H = j;
        this.I = i2;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) throws IOException {
        int i = this.E;
        iei ieiVar = iei.a;
        Object obj3 = this.K;
        Object obj4 = this.J;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iP0 = x44.p0(this.I | 1);
                thk.a(this.F, this.G, (nf2) obj4, (tkh) obj3, this.H, (ld4) obj, iP0);
                break;
            default:
                ((Integer) obj2).getClass();
                int iP02 = x44.p0(9);
                cjk.f((bpc) obj4, this.F, (zy7) obj3, this.G, this.H, (ld4) obj, iP02, this.I);
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ jf2(String str, iqb iqbVar, nf2 nf2Var, tkh tkhVar, long j, int i) {
        this.F = str;
        this.G = iqbVar;
        this.J = nf2Var;
        this.K = tkhVar;
        this.H = j;
        this.I = i;
    }
}
