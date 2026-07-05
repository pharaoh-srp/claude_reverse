package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class dt6 {
    public final int a;
    public final int b;

    public dt6(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dt6)) {
            return false;
        }
        dt6 dt6Var = (dt6) obj;
        return this.a == dt6Var.a && this.b == dt6Var.b;
    }

    public final int hashCode() {
        int i = this.a;
        int iF = (i == 0 ? 0 : sq6.F(i)) * 31;
        int i2 = this.b;
        return iF + (i2 != 0 ? sq6.F(i2) : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Profiling(status=");
        String str = "null";
        int i = this.a;
        sb.append(i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "ERROR" : "STOPPED" : "RUNNING" : "STARTING");
        sb.append(", errorReason=");
        int i2 = this.b;
        if (i2 == 1) {
            str = "NOT_SUPPORTED_BY_BROWSER";
        } else if (i2 == 2) {
            str = "FAILED_TO_LAZY_LOAD";
        } else if (i2 == 3) {
            str = "MISSING_DOCUMENT_POLICY_HEADER";
        } else if (i2 == 4) {
            str = "UNEXPECTED_EXCEPTION";
        }
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }
}
