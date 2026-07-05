package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class wpa implements u9d {
    public final bp4 a;
    public g79 b;
    public fu9 c;
    public g79 d;
    public y69 e;

    public wpa(bp4 bp4Var) {
        this.a = bp4Var;
    }

    @Override // defpackage.u9d
    public final long a(c79 c79Var, long j, fu9 fu9Var, long j2) {
        y69 y69Var = this.e;
        if (y69Var != null) {
            g79 g79Var = this.b;
            if ((g79Var == null ? false : g79.b(g79Var.a, j)) && this.c == fu9Var) {
                g79 g79Var2 = this.d;
                if (g79Var2 != null ? g79.b(g79Var2.a, j2) : false) {
                    return y69Var.a;
                }
            }
        }
        long jA = this.a.a(c79Var, j, fu9Var, j2);
        this.b = new g79(j);
        this.c = fu9Var;
        this.d = new g79(j2);
        this.e = new y69(jA);
        return jA;
    }
}
