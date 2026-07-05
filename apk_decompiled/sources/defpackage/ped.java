package defpackage;

import com.anthropic.claude.api.chat.MessageBlobFile;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ped implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ MessageBlobFile F;
    public final /* synthetic */ ej7 G;
    public final /* synthetic */ zy7 H;
    public final /* synthetic */ ned I;
    public final /* synthetic */ hdc J;
    public final /* synthetic */ n3f K;
    public final /* synthetic */ int L;

    public /* synthetic */ ped(MessageBlobFile messageBlobFile, ej7 ej7Var, zy7 zy7Var, ned nedVar, hdc hdcVar, n3f n3fVar, int i, int i2) {
        this.E = i2;
        this.F = messageBlobFile;
        this.G = ej7Var;
        this.H = zy7Var;
        this.I = nedVar;
        this.J = hdcVar;
        this.K = n3fVar;
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
                int iP0 = x44.p0(i2 | 1);
                kwj.f(this.F, this.G, this.H, this.I, this.J, this.K, (ld4) obj, iP0);
                break;
            default:
                ((Integer) obj2).getClass();
                int iP02 = x44.p0(i2 | 1);
                zed.a(this.F, this.G, this.H, this.I, this.J, this.K, (ld4) obj, iP02);
                break;
        }
        return ieiVar;
    }
}
