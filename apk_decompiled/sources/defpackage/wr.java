package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class wr {
    public final vr a;
    public final vr b;
    public final vr c;

    public wr(vr vrVar, vr vrVar2, vr vrVar3) {
        vrVar.getClass();
        vrVar2.getClass();
        vrVar3.getClass();
        this.a = vrVar;
        this.b = vrVar2;
        this.c = vrVar3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wr)) {
            return false;
        }
        wr wrVar = (wr) obj;
        return x44.r(this.a, wrVar.a) && x44.r(this.b, wrVar.b) && x44.r(this.c, wrVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "AggregateMetricsInfo(averageMetric=" + this.a + ", minMetric=" + this.b + ", maxMetric=" + this.c + ')';
    }
}
