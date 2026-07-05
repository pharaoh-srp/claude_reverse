package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class eb8 {
    public final String a;
    public final boolean b;

    public eb8(String str, boolean z) {
        str.getClass();
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eb8)) {
            return false;
        }
        eb8 eb8Var = (eb8) obj;
        return x44.r(this.a, eb8Var.a) && this.b == eb8Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "GroupSummarySegment(label=" + this.a + ", hasFailure=" + this.b + ")";
    }
}
