package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class bqf {
    public final String a;
    public final String b;

    public bqf(String str, String str2) {
        str.getClass();
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bqf)) {
            return false;
        }
        bqf bqfVar = (bqf) obj;
        return x44.r(this.a, bqfVar.a) && x44.r(this.b, bqfVar.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return ij0.l("PendingWorkflowLaunch(toolUseId=", this.a, ", name=", this.b, ")");
    }
}
