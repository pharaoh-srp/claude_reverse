package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class wgh {
    public final vo1 a;
    public final vo1 b;

    public wgh() {
        vo1 vo1Var = lja.S;
        this.a = vo1Var;
        this.b = vo1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wgh)) {
            return false;
        }
        wgh wghVar = (wgh) obj;
        return x44.r(this.a, wghVar.a) && x44.r(this.b, wghVar.b);
    }

    public final int hashCode() {
        return Float.hashCode(this.b.a) + vb7.b(this.a.a, Boolean.hashCode(false) * 31, 31);
    }

    public final String toString() {
        return "Attached(alwaysMinimize=false, minimizedAlignment=" + this.a + ", expandedAlignment=" + this.b + ')';
    }
}
