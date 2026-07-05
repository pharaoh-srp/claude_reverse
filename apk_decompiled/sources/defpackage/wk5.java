package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class wk5 extends ef5 {
    public final ef5 b;

    public wk5(ef5 ef5Var) {
        this.b = ef5Var;
    }

    @Override // defpackage.ef5
    public final String b() {
        return this.b.b();
    }

    @Override // defpackage.ef5
    public final String c() {
        return this.b.c();
    }

    @Override // defpackage.ef5
    public final long d() {
        return this.b.d();
    }

    @Override // defpackage.ef5
    public final long e() {
        return this.b.e();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wk5) && this.b.equals(((wk5) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // defpackage.ef5
    public final String toString() {
        String string = this.b.toString();
        string.getClass();
        return string;
    }
}
