package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qc5 implements y5i {
    public final a11 a;
    public final tx8 b;
    public final int c;

    public qc5(a11 a11Var, tx8 tx8Var, int i) {
        this.a = a11Var;
        this.b = tx8Var;
        this.c = i;
        if (i > 0) {
            return;
        }
        sz6.p("durationMillis must be > 0.");
        throw null;
    }

    @Override // defpackage.y5i
    public final void a() {
        this.a.getClass();
        tx8 tx8Var = this.b;
        new ic5(tx8Var.a(), tx8Var.b().w, this.c, ((tx8Var instanceof ixg) && ((ixg) tx8Var).g) ? false : true);
    }
}
