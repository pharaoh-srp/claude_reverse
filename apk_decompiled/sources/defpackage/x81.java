package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class x81 extends q0c {
    public final p0c a;
    public final o0c b;

    public x81(p0c p0cVar, o0c o0cVar) {
        this.a = p0cVar;
        this.b = o0cVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof q0c) {
            q0c q0cVar = (q0c) obj;
            p0c p0cVar = this.a;
            if (p0cVar != null ? p0cVar.equals(((x81) q0cVar).a) : ((x81) q0cVar).a == null) {
                o0c o0cVar = this.b;
                if (o0cVar != null ? o0cVar.equals(((x81) q0cVar).b) : ((x81) q0cVar).b == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        p0c p0cVar = this.a;
        int iHashCode = ((p0cVar == null ? 0 : p0cVar.hashCode()) ^ 1000003) * 1000003;
        o0c o0cVar = this.b;
        return iHashCode ^ (o0cVar != null ? o0cVar.hashCode() : 0);
    }

    public final String toString() {
        return "NetworkConnectionInfo{networkType=" + this.a + ", mobileSubtype=" + this.b + "}";
    }
}
