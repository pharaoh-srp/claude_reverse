package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class dy9 {
    public final sxb a;
    public final vd9 b;

    public dy9(sxb sxbVar, vd9 vd9Var) {
        sxbVar.getClass();
        this.a = sxbVar;
        this.b = vd9Var;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dy9) {
            return x44.r(this.a, ((dy9) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
