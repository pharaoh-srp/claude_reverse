package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class q26 {
    public static final /* synthetic */ int c = 0;
    public final int a = 0;
    public final int b = 0;

    static {
        tpi.w(0);
        tpi.w(1);
        tpi.w(2);
        tpi.w(3);
    }

    public q26(yl4 yl4Var) {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q26)) {
            return false;
        }
        q26 q26Var = (q26) obj;
        return this.a == q26Var.a && this.b == q26Var.b;
    }

    public final int hashCode() {
        return (((16337 + this.a) * 31) + this.b) * 31;
    }
}
