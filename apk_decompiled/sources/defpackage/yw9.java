package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class yw9 extends u00 {
    public static final uw8 o = new uw8(6);
    public final ix9 l;
    public final l94 m;
    public boolean n;

    public yw9(bz7 bz7Var) {
        super(18);
        this.l = new ix9(this);
        this.m = new l94();
        bz7Var.invoke(this);
    }

    public static void U(yw9 yw9Var, bz7 bz7Var, br0 br0Var, ta4 ta4Var, int i) {
        if ((i & 2) != 0) {
            bz7Var = null;
        }
        if ((i & 4) != 0) {
            br0Var = null;
        }
        byte b = 0;
        yw9Var.m.a(1, new vw9(null, bz7Var != null ? new ww9(bz7Var, b, b) : o, new tz9(1, br0Var), new ta4(-291643851, true, new xw9(ta4Var, b))));
        if (bz7Var != null) {
            yw9Var.n = true;
        }
    }

    public final void V(int i, bz7 bz7Var, bz7 bz7Var2, ta4 ta4Var) {
        this.m.a(i, new vw9(bz7Var, o, bz7Var2, ta4Var));
    }

    @Override // defpackage.u00
    public final l94 w() {
        return this.m;
    }
}
