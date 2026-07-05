package defpackage;

import com.anthropic.claude.chat.bottomsheet.model.b;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class dpb implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ String F;
    public final /* synthetic */ long G;
    public final /* synthetic */ long H;
    public final /* synthetic */ iqb I;
    public final /* synthetic */ int J;
    public final /* synthetic */ int K;

    public /* synthetic */ dpb(String str, long j, long j2, iqb iqbVar, int i, int i2, int i3) {
        this.E = i3;
        this.F = str;
        this.G = j;
        this.H = j2;
        this.I = iqbVar;
        this.J = i;
        this.K = i2;
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
                kpb.c(this.F, this.G, this.H, this.I, (ld4) obj, iP0, this.K);
                break;
            default:
                ((Integer) obj2).getClass();
                int iP02 = x44.p0(i2 | 1);
                b.c(this.F, this.G, this.H, this.I, (ld4) obj, iP02, this.K);
                break;
        }
        return ieiVar;
    }
}
