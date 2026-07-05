package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class mf0 implements nf0 {
    public final Throwable a;

    public mf0(Throwable th) {
        this.a = th;
    }

    public final Throwable a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mf0) && this.a.equals(((mf0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Exception(throwable=" + this.a + ")";
    }
}
