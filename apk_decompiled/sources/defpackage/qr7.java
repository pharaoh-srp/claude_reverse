package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class qr7 implements kp7 {
    public final /* synthetic */ kp7 E;
    public final /* synthetic */ cve F;
    public final /* synthetic */ boolean G;
    public final /* synthetic */ bz7 H;

    public qr7(kp7 kp7Var, cve cveVar, boolean z, bz7 bz7Var) {
        this.E = kp7Var;
        this.F = cveVar;
        this.G = z;
        this.H = bz7Var;
    }

    @Override // defpackage.kp7
    public final Object a(lp7 lp7Var, tp4 tp4Var) {
        Object objA = this.E.a(new pr7(lp7Var, this.F, this.G, this.H), tp4Var);
        return objA == m45.E ? objA : iei.a;
    }
}
