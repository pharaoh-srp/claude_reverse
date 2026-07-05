package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class bjd {
    public final a2h a;

    public bjd(a2h a2hVar) {
        this.a = a2hVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bjd) && x44.r(this.a, ((bjd) obj).a);
    }

    public final int hashCode() {
        a2h a2hVar = this.a;
        if (a2hVar == null) {
            return 0;
        }
        return a2hVar.hashCode();
    }

    public final String toString() {
        return "TTID(rumContext=" + this.a + ")";
    }

    public /* synthetic */ bjd() {
        this(null);
    }
}
