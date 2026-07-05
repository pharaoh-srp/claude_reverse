package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class fje {
    public final int a;
    public final Integer b;

    public fje(int i, Integer num) {
        this.a = i;
        this.b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fje)) {
            return false;
        }
        fje fjeVar = (fje) obj;
        return this.a == fjeVar.a && x44.r(this.b, fjeVar.b);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.a) * 31;
        Integer num = this.b;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "RequestExecutionContext(attemptNumber=" + this.a + ", previousResponseCode=" + this.b + ")";
    }
}
