package defpackage;

import com.anthropic.claude.chat.bottomsheet.model.b;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class jrb implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ t53 F;
    public final /* synthetic */ t4g G;
    public final /* synthetic */ zy7 H;
    public final /* synthetic */ i4g I;
    public final /* synthetic */ int J;

    public /* synthetic */ jrb(t53 t53Var, t4g t4gVar, zy7 zy7Var, i4g i4gVar, int i, int i2) {
        this.E = i2;
        this.F = t53Var;
        this.G = t4gVar;
        this.H = zy7Var;
        this.I = i4gVar;
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
                krb.a(this.F, this.G, this.H, this.I, (ld4) obj, iP0);
                break;
            default:
                ((Integer) obj2).getClass();
                int iP02 = x44.p0(i2 | 1);
                b.e(this.F, this.G, this.H, this.I, (ld4) obj, iP02);
                break;
        }
        return ieiVar;
    }
}
