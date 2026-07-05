package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class oh4 implements ph4 {
    public final int a;
    public final int b;

    public oh4(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oh4)) {
            return false;
        }
        oh4 oh4Var = (oh4) obj;
        return this.a == oh4Var.a && this.b == oh4Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return vb7.q("Reconnecting(attempt=", ", maxAttempts=", this.a, this.b, ")");
    }
}
