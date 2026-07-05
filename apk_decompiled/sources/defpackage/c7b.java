package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public class c7b {
    public final long a;

    static {
        new c7b(new xm7());
        tpi.w(0);
        tpi.w(1);
        tpi.w(2);
        tpi.w(3);
        tpi.w(4);
        tpi.w(5);
        tpi.w(6);
        tpi.w(7);
    }

    public c7b(xm7 xm7Var) {
        String str = tpi.a;
        this.a = xm7Var.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c7b) && this.a == ((c7b) obj).a;
    }

    public final int hashCode() {
        long j = this.a;
        return ((int) (j ^ (j >>> 32))) * 923521;
    }
}
