package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class dsh extends esh {
    @Override // defpackage.esh, defpackage.hsh
    /* JADX INFO: renamed from: m */
    public final esh f() {
        super.f();
        this.g = null;
        return this;
    }

    public final String toString() {
        String str = this.f ? "/>" : ">";
        n31 n31Var = this.g;
        if (n31Var == null || n31Var.size() <= 0) {
            return "<" + n() + str;
        }
        return "<" + n() + " " + this.g.toString() + str;
    }
}
