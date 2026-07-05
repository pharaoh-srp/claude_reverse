package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class suf implements fvf {
    public final j4d a;

    public suf(j4d j4dVar) {
        this.a = j4dVar;
    }

    public final j4d a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof suf) && this.a.equals(((suf) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "PlanApprovalRequired(approval=" + this.a + ")";
    }
}
