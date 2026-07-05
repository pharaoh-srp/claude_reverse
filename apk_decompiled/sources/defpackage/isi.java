package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class isi {
    public final sb0 a;
    public final vi6 b;

    public isi(sb0 sb0Var, vi6 vi6Var) {
        this.a = sb0Var;
        this.b = vi6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof isi)) {
            return false;
        }
        isi isiVar = (isi) obj;
        return x44.r(this.a, isiVar.a) && x44.r(this.b, isiVar.b);
    }

    public final int hashCode() {
        return Integer.hashCode(0) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "VectorizedKeyframeSpecElementInfo(vectorValue=" + this.a + ", easing=" + this.b + ", arcMode=ArcMode(value=0))";
    }
}
