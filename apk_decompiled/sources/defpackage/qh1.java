package defpackage;

import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class qh1 {
    public final rzd a;
    public final pl9 b;
    public final rzd c;
    public final pz7 d;
    public final kq9 e;
    public List f;
    public p92 g;

    public qh1(rzd rzdVar, pl9 pl9Var, rzd rzdVar2, pz7 pz7Var, kq9 kq9Var) {
        rzdVar.getClass();
        pl9Var.getClass();
        this.a = rzdVar;
        this.b = pl9Var;
        this.c = rzdVar2;
        this.d = pz7Var;
        this.e = kq9Var;
        this.f = lm6.E;
        this.g = new p92(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        obj.getClass();
        qh1 qh1Var = (qh1) obj;
        return x44.r(this.b, qh1Var.b) && x44.r(this.c, qh1Var.c) && x44.r(this.a, qh1Var.a);
    }

    public final int hashCode() {
        rzd rzdVar = this.c;
        int iHashCode = rzdVar != null ? rzdVar.hashCode() : 0;
        return this.a.hashCode() + ((this.b.hashCode() + (iHashCode * 31)) * 31);
    }

    public final String toString() throws IOException {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        sb.append(this.e);
        sb.append(": '");
        sq6.D(this.b, sb, '\'');
        rzd rzdVar = this.c;
        if (rzdVar != null) {
            sb.append(",qualifier:");
            sb.append(rzdVar);
        }
        mrg mrgVar = dpf.K;
        rzd rzdVar2 = this.a;
        if (!x44.r(rzdVar2, mrgVar)) {
            sb.append(",scope:");
            sb.append(rzdVar2);
        }
        if (!this.f.isEmpty()) {
            sb.append(",binds:");
            w44.R0(this.f, sb, ",", null, null, new ph1(0), 60);
        }
        sb.append(']');
        return sb.toString();
    }
}
