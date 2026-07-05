package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class tuf implements fvf {
    public final String a;
    public final boolean b;

    public tuf(String str, boolean z) {
        str.getClass();
        this.a = str;
        this.b = z;
    }

    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tuf)) {
            return false;
        }
        tuf tufVar = (tuf) obj;
        return x44.r(this.a, tufVar.a) && this.b == tufVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "PlanApprovalResolved(toolUseId=" + this.a + ", approved=" + this.b + ")";
    }
}
