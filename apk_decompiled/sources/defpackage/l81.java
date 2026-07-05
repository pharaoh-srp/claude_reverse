package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class l81 extends yo3 {
    public final xo3 a;
    public final lz b;

    public l81(xo3 xo3Var, h81 h81Var) {
        this.a = xo3Var;
        this.b = h81Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof yo3) {
            yo3 yo3Var = (yo3) obj;
            xo3 xo3Var = this.a;
            if (xo3Var != null ? xo3Var.equals(((l81) yo3Var).a) : ((l81) yo3Var).a == null) {
                lz lzVar = this.b;
                if (lzVar != null ? lzVar.equals(((l81) yo3Var).b) : ((l81) yo3Var).b == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        xo3 xo3Var = this.a;
        int iHashCode = ((xo3Var == null ? 0 : xo3Var.hashCode()) ^ 1000003) * 1000003;
        lz lzVar = this.b;
        return iHashCode ^ (lzVar != null ? lzVar.hashCode() : 0);
    }

    public final String toString() {
        return "ClientInfo{clientType=" + this.a + ", androidClientInfo=" + this.b + "}";
    }
}
