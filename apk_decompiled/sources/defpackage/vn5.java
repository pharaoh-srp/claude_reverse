package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class vn5 {
    public static final oqb c;
    public final mn5 a;
    public long b;

    static {
        oqb oqbVar = new oqb();
        zb5 zb5Var = new zb5(9);
        ge7 ge7Var = new ge7(new qh1(dpf.K, jce.a.b(vn5.class), null, zb5Var, kq9.F));
        oqbVar.a(ge7Var);
        fd9.n0(new ir9(oqbVar, ge7Var));
        c = oqbVar;
    }

    public vn5(mn5 mn5Var) {
        this.a = mn5Var;
    }

    public final Object a(long j, bz7 bz7Var, vp4 vp4Var) {
        if (this.a.a() - this.b > uh6.f(j)) {
            return bz7Var.invoke(vp4Var);
        }
        return null;
    }

    public final void b() {
        this.b = this.a.a();
    }
}
