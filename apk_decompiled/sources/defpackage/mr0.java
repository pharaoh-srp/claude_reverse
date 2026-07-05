package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class mr0 {
    public final oq0 a;
    public final String b;

    public mr0(oq0 oq0Var, String str) {
        this.a = oq0Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mr0)) {
            return false;
        }
        mr0 mr0Var = (mr0) obj;
        return this.a == mr0Var.a && this.b.equals(mr0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ArtifactLink(env=" + this.a + ", viewerUrl=" + this.b + ")";
    }
}
