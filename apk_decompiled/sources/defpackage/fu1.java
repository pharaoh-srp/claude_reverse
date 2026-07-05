package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class fu1 {
    public r20 a = null;
    public iz b = null;
    public ib2 c = null;
    public c40 d = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fu1)) {
            return false;
        }
        fu1 fu1Var = (fu1) obj;
        return x44.r(this.a, fu1Var.a) && x44.r(this.b, fu1Var.b) && x44.r(this.c, fu1Var.c) && x44.r(this.d, fu1Var.d);
    }

    public final c40 g() {
        c40 c40Var = this.d;
        if (c40Var != null) {
            return c40Var;
        }
        c40 c40VarA = f40.a();
        this.d = c40VarA;
        return c40VarA;
    }

    public final int hashCode() {
        r20 r20Var = this.a;
        int iHashCode = (r20Var == null ? 0 : r20Var.hashCode()) * 31;
        iz izVar = this.b;
        int iHashCode2 = (iHashCode + (izVar == null ? 0 : izVar.hashCode())) * 31;
        ib2 ib2Var = this.c;
        int iHashCode3 = (iHashCode2 + (ib2Var == null ? 0 : ib2Var.hashCode())) * 31;
        c40 c40Var = this.d;
        return iHashCode3 + (c40Var != null ? c40Var.hashCode() : 0);
    }

    public final String toString() {
        return "BorderCache(imageBitmap=" + this.a + ", canvas=" + this.b + ", canvasDrawScope=" + this.c + ", borderPath=" + this.d + ')';
    }
}
