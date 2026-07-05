package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class i10 implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ iqb F;
    public final /* synthetic */ int G;

    public /* synthetic */ i10(int i, int i2, iqb iqbVar) {
        this.E = 0;
        this.F = iqbVar;
        this.G = i2;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        int i2 = this.G;
        iqb iqbVar = this.F;
        ld4 ld4Var = (ld4) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                l10.b(x44.p0(1), i2, ld4Var, iqbVar);
                break;
            case 1:
                ur0.d(iqbVar, ld4Var, x44.p0(i2 | 1));
                break;
            case 2:
                ltk.d(iqbVar, ld4Var, x44.p0(i2 | 1));
                break;
            case 3:
                puj.a(iqbVar, ld4Var, x44.p0(i2 | 1));
                break;
            case 4:
                tm3.b(iqbVar, ld4Var, x44.p0(i2 | 1));
                break;
            case 5:
                opk.d(i2, x44.p0(1), ld4Var, iqbVar);
                break;
            case 6:
                ne5.c(i2, x44.p0(1), ld4Var, iqbVar);
                break;
            case 7:
                usj.a(i2, x44.p0(1), ld4Var, iqbVar);
                break;
            case 8:
                euk.l(iqbVar, ld4Var, x44.p0(i2 | 1));
                break;
            default:
                xjk.h(iqbVar, ld4Var, x44.p0(i2 | 1));
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ i10(int i, int i2, int i3, iqb iqbVar) {
        this.E = i3;
        this.G = i;
        this.F = iqbVar;
    }

    public /* synthetic */ i10(iqb iqbVar, int i, int i2, byte b) {
        this.E = i2;
        this.F = iqbVar;
        this.G = i;
    }
}
