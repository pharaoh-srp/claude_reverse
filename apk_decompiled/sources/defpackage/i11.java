package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class i11 {
    public final k20 a;

    public i11(k20 k20Var) {
        this.a = k20Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i11) && x44.r(this.a, ((i11) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }

    public final String toString() {
        return "Key(font=" + this.a + ", loaderKey=null)";
    }
}
