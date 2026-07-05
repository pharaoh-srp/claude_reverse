package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class zl9 extends am9 {
    public final jh3 a;

    public zl9(jh3 jh3Var) {
        this.a = jh3Var;
    }

    public final int a() {
        return this.a.b;
    }

    public final gh3 b() {
        return this.a.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zl9) && this.a.equals(((zl9) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "NormalClass(value=" + this.a + ')';
    }
}
