package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ghe implements i4a {
    public final /* synthetic */ y3a E;
    public final /* synthetic */ dae F;
    public final /* synthetic */ l45 G;
    public final /* synthetic */ y3a H;
    public final /* synthetic */ ua2 I;
    public final /* synthetic */ jxb J;
    public final /* synthetic */ pz7 K;

    public ghe(y3a y3aVar, dae daeVar, l45 l45Var, y3a y3aVar2, ua2 ua2Var, jxb jxbVar, pz7 pz7Var) {
        this.E = y3aVar;
        this.F = daeVar;
        this.G = l45Var;
        this.H = y3aVar2;
        this.I = ua2Var;
        this.J = jxbVar;
        this.K = pz7Var;
    }

    @Override // defpackage.i4a
    public final void d(m4a m4aVar, y3a y3aVar) {
        y3a y3aVar2 = this.E;
        dae daeVar = this.F;
        tp4 tp4Var = null;
        if (y3aVar == y3aVar2) {
            daeVar.E = gb9.D(this.G, null, null, new zw(this.J, this.K, tp4Var, 18), 3);
            return;
        }
        if (y3aVar == this.H) {
            lf9 lf9Var = (lf9) daeVar.E;
            if (lf9Var != null) {
                lf9Var.d(null);
            }
            daeVar.E = null;
        }
        if (y3aVar == y3a.ON_DESTROY) {
            this.I.resumeWith(iei.a);
        }
    }
}
