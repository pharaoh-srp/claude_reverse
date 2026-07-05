package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class br9 {
    public final String a;
    public final long b;

    public br9(String str, long j) {
        str.getClass();
        this.a = str;
        this.b = j;
    }

    public final String a() {
        return this.a;
    }

    public final long b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof br9)) {
            return false;
        }
        br9 br9Var = (br9) obj;
        return x44.r(this.a, br9Var.a) && this.b == br9Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sbW = vb7.w("Entry(conversationId=", this.a, ", terminalAtMs=", this.b);
        sbW.append(")");
        return sbW.toString();
    }
}
