package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ubg implements fcg {
    public final vt6 a;
    public final String b;

    public ubg(vt6 vt6Var) {
        vt6Var.getClass();
        this.a = vt6Var;
        this.b = "";
    }

    @Override // defpackage.fcg
    public final String a() {
        return this.b;
    }

    @Override // defpackage.fcg
    public final String b() {
        return null;
    }

    @Override // defpackage.fcg
    public final boolean c() {
        return true;
    }

    public final vt6 d() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ubg)) {
            return false;
        }
        ubg ubgVar = (ubg) obj;
        return x44.r(this.a, ubgVar.a) && this.b.equals(ubgVar.b);
    }

    @Override // defpackage.fcg
    public final tbg getDuration() {
        return this.a instanceof mt6 ? tbg.F : tbg.E;
    }

    public final int hashCode() {
        return kgh.l(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "SnackbarErrorVisuals(errorMessage=" + this.a + ", message=" + this.b + ", actionLabel=null)";
    }
}
