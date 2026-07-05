package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class bfa {
    public final Object a;
    public final zy7 b;

    public bfa(Object obj, zy7 zy7Var) {
        this.a = obj;
        this.b = zy7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && bfa.class == obj.getClass() && this.a.equals(((bfa) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
