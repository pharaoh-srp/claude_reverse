package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class bd4 {
    public final int a;
    public final Integer b;

    public bd4(int i, bwj bwjVar, Integer num) {
        this.a = i;
        this.b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bd4)) {
            return false;
        }
        bd4 bd4Var = (bd4) obj;
        return this.a == bd4Var.a && x44.r(null, null) && x44.r(this.b, bd4Var.b);
    }

    public final int hashCode() {
        int iHashCode = ((Integer.hashCode(this.a) * 31) + 0) * 31;
        Integer num = this.b;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        return "ComposeStackTraceFrame(groupKey=" + this.a + ", sourceInfo=" + ((Object) null) + ", groupOffset=" + this.b + ')';
    }
}
