package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class f63 implements j63 {
    public final boolean a;
    public final boolean b;
    public final e63 c;

    public f63(boolean z, boolean z2, e63 e63Var) {
        this.a = z;
        this.b = z2;
        this.c = e63Var;
    }

    public final boolean a() {
        return this.b;
    }

    public final boolean b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f63)) {
            return false;
        }
        f63 f63Var = (f63) obj;
        return this.a == f63Var.a && this.b == f63Var.b && this.c == f63Var.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + fsh.p(Boolean.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        return "SendMessageFailed(isRetry=" + this.a + ", isPartialResponse=" + this.b + ", reason=" + this.c + ")";
    }

    public /* synthetic */ f63(boolean z, boolean z2) {
        this(z, z2, e63.E);
    }
}
