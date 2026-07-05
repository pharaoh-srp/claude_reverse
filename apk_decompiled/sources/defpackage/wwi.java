package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class wwi {
    public final int a;
    public final long b;

    public wwi(int i, long j) {
        if (i == 0) {
            throw null;
        }
        this.a = i;
        this.b = j;
    }

    public final qh9 a() {
        qh9 qh9Var = new qh9();
        qh9Var.o("state", new vh9(fsh.m(this.a)));
        qh9Var.p(Long.valueOf(this.b), "start");
        return qh9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wwi)) {
            return false;
        }
        wwi wwiVar = (wwi) obj;
        return this.a == wwiVar.a && this.b == wwiVar.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (sq6.F(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PageState(state=");
        int i = this.a;
        sb.append(i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "null" : "TERMINATED" : "FROZEN" : "HIDDEN" : "PASSIVE" : "ACTIVE");
        sb.append(", start=");
        sb.append(this.b);
        sb.append(")");
        return sb.toString();
    }
}
