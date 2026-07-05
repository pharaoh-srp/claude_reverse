package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class jc7 {
    public final Object a;
    public final int b;

    public jc7(int i, Object obj) {
        this.a = obj;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof jc7)) {
            return false;
        }
        jc7 jc7Var = (jc7) obj;
        return this.a == jc7Var.a && this.b == jc7Var.b;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.a) * 65535) + this.b;
    }
}
