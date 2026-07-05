package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class lj implements oj {
    public final yk a;

    public lj(yk ykVar) {
        this.a = ykVar;
    }

    public final yk a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lj) && this.a.equals(((lj) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Msg(message=" + this.a + ")";
    }
}
