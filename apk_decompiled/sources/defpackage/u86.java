package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class u86 implements mee {
    public final bz7 E;
    public v86 F;

    public u86(bz7 bz7Var) {
        this.E = bz7Var;
    }

    @Override // defpackage.mee
    public final void a() {
    }

    @Override // defpackage.mee
    public final void b() {
        v86 v86Var = this.F;
        if (v86Var != null) {
            v86Var.a();
        }
        this.F = null;
    }

    @Override // defpackage.mee
    public final void g() {
        this.F = (v86) this.E.invoke(fd9.l);
    }
}
