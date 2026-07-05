package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class f18 implements ie4 {
    public final fe4 E;

    public f18(fe4 fe4Var) {
        this.E = fe4Var;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f18) {
            return this.E.equals(((f18) obj).E);
        }
        return false;
    }

    public final int hashCode() {
        return this.E.hashCode() * 31;
    }
}
