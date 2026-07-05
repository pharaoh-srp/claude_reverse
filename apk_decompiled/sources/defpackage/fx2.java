package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class fx2 {
    public final xc3 a;

    public fx2(xc3 xc3Var) {
        this.a = xc3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fx2) && this.a == ((fx2) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Voice(controller=" + this.a + ")";
    }
}
