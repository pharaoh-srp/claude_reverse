package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class pc5 implements z5i {
    public final b11 a;
    public final sx8 b;
    public final int c;

    public pc5(b11 b11Var, sx8 sx8Var, int i) {
        this.a = b11Var;
        this.b = sx8Var;
        this.c = i;
        if (i > 0) {
            return;
        }
        sz6.p("durationMillis must be > 0.");
        throw null;
    }

    @Override // defpackage.z5i
    public final void a() {
        this.a.getClass();
        sx8 sx8Var = this.b;
        if (sx8Var.b() != null) {
            mr9.x();
            return;
        }
        boolean z = sx8Var instanceof hxg;
        ic5 ic5Var = new ic5(sx8Var.a().r, this.c, (z && ((hxg) sx8Var).g) ? false : true);
        if (z) {
            quk.e(ic5Var);
        } else if (sx8Var instanceof eu6) {
            quk.e(ic5Var);
        } else {
            wg6.i();
        }
    }
}
