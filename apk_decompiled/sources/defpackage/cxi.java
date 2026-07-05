package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class cxi {
    public final int a;
    public final int b;

    public cxi(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cxi)) {
            return false;
        }
        cxi cxiVar = (cxi) obj;
        return this.a == cxiVar.a && this.b == cxiVar.b;
    }

    public final int hashCode() {
        int i = this.a;
        int iF = (i == 0 ? 0 : sq6.F(i)) * 31;
        int i2 = this.b;
        return iF + (i2 != 0 ? sq6.F(i2) : 0);
    }

    public final String toString() {
        return "Profiling(status=" + fsh.G(this.a) + ", errorReason=" + fsh.F(this.b) + ")";
    }
}
