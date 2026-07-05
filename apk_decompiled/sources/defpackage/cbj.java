package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class cbj {
    public final cej a;
    public final dad b;

    public cbj(cej cejVar, dad dadVar) {
        this.a = cejVar;
        this.b = dadVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cbj)) {
            return false;
        }
        cbj cbjVar = (cbj) obj;
        return this.a.equals(cbjVar.a) && this.b.equals(cbjVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "WindowAdaptiveInfo(windowSizeClass=" + this.a + ", windowPosture=" + this.b + ')';
    }
}
