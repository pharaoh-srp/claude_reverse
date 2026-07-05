package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class q5i {
    public final d9i a;
    public final lsc b = mpk.P(null);
    public final /* synthetic */ a6i c;

    public q5i(a6i a6iVar, d9i d9iVar, String str) {
        this.c = a6iVar;
        this.a = d9iVar;
    }

    public final p5i a(bz7 bz7Var, bz7 bz7Var2) {
        lsc lscVar = this.b;
        p5i p5iVar = (p5i) lscVar.getValue();
        a6i a6iVar = this.c;
        if (p5iVar == null) {
            Object objInvoke = bz7Var2.invoke(a6iVar.a.q0());
            Object objInvoke2 = bz7Var2.invoke(a6iVar.a.q0());
            d9i d9iVar = this.a;
            sb0 sb0Var = (sb0) d9iVar.a().invoke(objInvoke2);
            sb0Var.d();
            v5i v5iVar = new v5i(a6iVar, objInvoke, sb0Var, d9iVar);
            p5iVar = new p5i(this, v5iVar, bz7Var, bz7Var2);
            lscVar.setValue(p5iVar);
            a6iVar.i.add(v5iVar);
        }
        p5iVar.G = bz7Var2;
        p5iVar.F = bz7Var;
        p5iVar.a(a6iVar.f());
        return p5iVar;
    }
}
