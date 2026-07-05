package defpackage;

import com.anthropic.claude.code.remote.bottomsheet.a;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class cy3 implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ boolean F;
    public final /* synthetic */ boolean G;
    public final /* synthetic */ Object H;
    public final /* synthetic */ int I;
    public final /* synthetic */ Object J;

    public /* synthetic */ cy3(boolean z, boolean z2, zy7 zy7Var, mnc mncVar, int i) {
        this.E = 1;
        this.F = z;
        this.G = z2;
        this.H = zy7Var;
        this.J = mncVar;
        this.I = i;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        Object obj3 = this.J;
        iei ieiVar = iei.a;
        int i2 = this.I;
        Object obj4 = this.H;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iP0 = x44.p0(i2 | 1);
                a.g((rvh) obj3, this.F, this.G, (zy7) obj4, (ld4) obj, iP0);
                break;
            case 1:
                ((Integer) obj2).intValue();
                int iP02 = x44.p0(i2 | 1);
                xuk.b(this.F, this.G, (zy7) obj4, (mnc) obj3, (ld4) obj, iP02);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int iP03 = x44.p0(i2 | 1);
                vsj.a(this.J, this.F, this.G, (zy7) obj4, (ld4) obj, iP03);
                break;
            default:
                ((Integer) obj2).getClass();
                int iP04 = x44.p0(i2 | 1);
                grk.b(this.F, this.G, (bz7) obj3, (iqb) obj4, (ld4) obj, iP04);
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ cy3(Object obj, boolean z, boolean z2, zy7 zy7Var, int i, int i2) {
        this.E = i2;
        this.J = obj;
        this.F = z;
        this.G = z2;
        this.H = zy7Var;
        this.I = i;
    }

    public /* synthetic */ cy3(boolean z, boolean z2, bz7 bz7Var, iqb iqbVar, int i) {
        this.E = 3;
        this.F = z;
        this.G = z2;
        this.J = bz7Var;
        this.H = iqbVar;
        this.I = i;
    }
}
