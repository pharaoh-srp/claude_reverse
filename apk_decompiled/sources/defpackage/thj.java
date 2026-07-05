package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class thj {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;

    public thj(int i, int i2, int i3, int i4, int i5) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
    }

    public final int a() {
        return this.a + this.b + this.d + this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof thj)) {
            return false;
        }
        thj thjVar = (thj) obj;
        return this.a == thjVar.a && this.b == thjVar.b && this.c == thjVar.c && this.d == thjVar.d && this.e == thjVar.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + vb7.c(this.d, vb7.c(this.c, vb7.c(this.b, Integer.hashCode(this.a) * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sbV = vb7.v("WorkflowAgentCounts(done=", ", running=", this.a, this.b, ", stalled=");
        qy1.k(this.c, this.d, ", error=", ", pending=", sbV);
        return vb7.l(this.e, ")", sbV);
    }
}
