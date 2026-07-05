package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class lqc {
    public final icd a;
    public final icd b;
    public final efk c;
    public boolean d;
    public float e;

    public lqc() {
        icd icdVar = icd.a;
        this.a = icdVar;
        this.b = icdVar;
        this.c = bqc.a;
        this.d = false;
        this.e = Float.NaN;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lqc)) {
            return false;
        }
        lqc lqcVar = (lqc) obj;
        return x44.r(this.a, lqcVar.a) && x44.r(this.b, lqcVar.b) && x44.r(this.c, lqcVar.c) && this.d == lqcVar.d && va6.b(this.e, lqcVar.e);
    }

    public final int hashCode() {
        return Float.hashCode(this.e) + fsh.p((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31, this.d);
    }

    public final String toString() {
        return "PaneScaffoldParentDataImpl(preferredWidthInternal=" + this.a + ", preferredHeightInternal=" + this.b + ", paneMargins=" + this.c + ", isAnimatedPane=" + this.d + ", minTouchTargetSize=" + ((Object) va6.c(this.e)) + ')';
    }
}
