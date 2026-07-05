package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class p5i implements wlg {
    public final v5i E;
    public bz7 F;
    public bz7 G;
    public final /* synthetic */ q5i H;

    public p5i(q5i q5iVar, v5i v5iVar, bz7 bz7Var, bz7 bz7Var2) {
        this.H = q5iVar;
        this.E = v5iVar;
        this.F = bz7Var;
        this.G = bz7Var2;
    }

    public final void a(t5i t5iVar) {
        Object objInvoke = this.G.invoke(t5iVar.c());
        boolean zG = this.H.c.g();
        v5i v5iVar = this.E;
        if (zG) {
            v5iVar.g(this.G.invoke(t5iVar.b()), objInvoke, (kl7) this.F.invoke(t5iVar));
        } else {
            v5iVar.h(objInvoke, (kl7) this.F.invoke(t5iVar));
        }
    }

    @Override // defpackage.wlg
    public final Object getValue() {
        a(this.H.c.f());
        return this.E.N.getValue();
    }
}
