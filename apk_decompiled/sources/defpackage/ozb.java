package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ozb extends xn5 {
    public final hzb f;

    public ozb(hzb hzbVar) {
        hzbVar.getClass();
        this.f = hzbVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && ozb.class == obj.getClass() && x44.r(this.f, ((ozb) obj).f);
    }

    public final int hashCode() {
        return this.f.hashCode() - 31;
    }

    public final String toString() {
        return "InProgress(latestEvent=" + this.f + ", direction=-1)";
    }
}
