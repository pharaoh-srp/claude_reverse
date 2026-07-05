package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class j0a extends u00 {
    public final l94 l;
    public wub m;

    public j0a(bz7 bz7Var) {
        super(18);
        this.l = new l94();
        bz7Var.invoke(this);
    }

    public static /* synthetic */ void V(j0a j0aVar, Object obj, Object obj2, rz7 rz7Var, int i) {
        if ((i & 1) != 0) {
            obj = null;
        }
        if ((i & 2) != 0) {
            obj2 = null;
        }
        j0aVar.U(obj, obj2, rz7Var);
    }

    public static /* synthetic */ void X(j0a j0aVar, int i, bz7 bz7Var, ta4 ta4Var, int i2) {
        if ((i2 & 2) != 0) {
            bz7Var = null;
        }
        j0aVar.W(i, bz7Var, be5.N, ta4Var);
    }

    public final void U(Object obj, Object obj2, rz7 rz7Var) {
        int i = 1;
        this.l.a(1, new i0a(obj != null ? new tz9(i, obj) : null, new tz9(i, obj2), new ta4(-857469575, true, new a40(2, rz7Var))));
    }

    public final void W(int i, bz7 bz7Var, bz7 bz7Var2, ta4 ta4Var) {
        this.l.a(i, new i0a(bz7Var, bz7Var2, ta4Var));
    }

    public final void Y(String str, String str2, ta4 ta4Var) {
        wub wubVar = this.m;
        if (wubVar == null) {
            wubVar = new wub();
            this.m = wubVar;
        }
        l94 l94Var = this.l;
        wubVar.a(l94Var.b);
        U(str, str2, new ta4(-1588696110, true, new ik4(ta4Var, l94Var.b, 1)));
    }

    @Override // defpackage.u00
    public final l94 w() {
        return this.l;
    }
}
