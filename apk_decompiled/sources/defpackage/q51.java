package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class q51 extends s51 {
    public final int a;
    public final String b;

    public q51(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final int a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q51)) {
            return false;
        }
        q51 q51Var = (q51) obj;
        return this.a == q51Var.a && this.b.equals(q51Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "BtSco(deviceId=" + this.a + ", name=" + this.b + ")";
    }
}
