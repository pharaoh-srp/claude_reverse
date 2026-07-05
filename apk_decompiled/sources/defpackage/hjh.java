package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class hjh {
    public static final hjh c = new hjh(eve.B(0), eve.B(0));
    public final long a;
    public final long b;

    public hjh(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hjh)) {
            return false;
        }
        hjh hjhVar = (hjh) obj;
        return clh.a(this.a, hjhVar.a) && clh.a(this.b, hjhVar.b);
    }

    public final int hashCode() {
        dlh[] dlhVarArr = clh.b;
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "TextIndent(firstLine=" + ((Object) clh.d(this.a)) + ", restLine=" + ((Object) clh.d(this.b)) + ')';
    }
}
