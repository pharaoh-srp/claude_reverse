package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class qe5 {
    public final qzd a;
    public final boolean b;

    public qe5(qzd qzdVar, boolean z) {
        this.a = qzdVar;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof qe5) {
            qe5 qe5Var = (qe5) obj;
            if (qe5Var.a.equals(this.a) && qe5Var.b == this.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.valueOf(this.b).hashCode() ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }
}
