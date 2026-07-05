package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ht4 implements zy7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ l45 F;
    public final /* synthetic */ x0a G;

    public /* synthetic */ ht4(l45 l45Var, x0a x0aVar, int i) {
        this.E = i;
        this.F = l45Var;
        this.G = x0aVar;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.E;
        iei ieiVar = iei.a;
        x0a x0aVar = this.G;
        l45 l45Var = this.F;
        switch (i) {
            case 0:
                gb9.D(l45Var, null, null, new nt4(x0aVar, (tp4) null, 0), 3);
                break;
            case 1:
                gb9.D(l45Var, null, null, new nt4(x0aVar, (tp4) null, 1), 3);
                break;
            default:
                gb9.D(l45Var, null, null, new nt4(x0aVar, (tp4) null, 2), 3);
                break;
        }
        return ieiVar;
    }
}
