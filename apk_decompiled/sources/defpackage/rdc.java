package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class rdc extends sf5 {
    public final qdc g;
    public final m4a h;

    public rdc(m4a m4aVar, qdc qdcVar) {
        qdcVar.getClass();
        this.g = qdcVar;
        this.h = m4aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rdc)) {
            return false;
        }
        rdc rdcVar = (rdc) obj;
        return x44.r(this.g, rdcVar.g) && x44.r(this.h, rdcVar.h);
    }

    public final int hashCode() {
        int iHashCode = this.g.hashCode() * 31;
        m4a m4aVar = this.h;
        return iHashCode + (m4aVar == null ? 0 : m4aVar.hashCode());
    }

    public final String toString() {
        return "OnBackPressedCallbackInfo(callback=" + this.g + ", owner=" + this.h + ')';
    }
}
