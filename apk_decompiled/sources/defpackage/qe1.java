package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qe1 implements cje {
    public final lf9 E;

    public /* synthetic */ qe1(lf9 lf9Var) {
        this.E = lf9Var;
    }

    public static final /* synthetic */ qe1 c(lf9 lf9Var) {
        return new qe1(lf9Var);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof qe1) {
            return this.E.equals(((qe1) obj).E);
        }
        return false;
    }

    public final int hashCode() {
        return this.E.hashCode();
    }

    public final String toString() {
        return "BaseRequestDelegate(job=" + this.E + ")";
    }
}
