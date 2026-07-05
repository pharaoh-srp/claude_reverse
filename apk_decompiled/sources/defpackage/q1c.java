package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class q1c {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    public q1c(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q1c)) {
            return false;
        }
        q1c q1cVar = (q1c) obj;
        return this.a == q1cVar.a && this.b == q1cVar.b && this.c == q1cVar.c && this.d == q1cVar.d && this.e == q1cVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + fsh.p(fsh.p(fsh.p(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NetworkState(isConnected=");
        sb.append(this.a);
        sb.append(", isValidated=");
        sb.append(this.b);
        sb.append(", isMetered=");
        sb.append(this.c);
        sb.append(", isNotRoaming=");
        sb.append(this.d);
        sb.append(", isBlocked=");
        return y6a.p(sb, this.e, ')');
    }
}
