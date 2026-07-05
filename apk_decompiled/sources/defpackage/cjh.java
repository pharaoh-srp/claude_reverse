package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class cjh {
    public static final y5f d = new y5f(new yeg(14), new lwf(15));
    public final zb0 a;
    public final long b;
    public final kkh c;

    public cjh(zb0 zb0Var, long j, kkh kkhVar) {
        kkh kkhVar2;
        this.a = zb0Var;
        this.b = mwa.u(zb0Var.F.length(), j);
        if (kkhVar != null) {
            kkhVar2 = new kkh(mwa.u(zb0Var.F.length(), kkhVar.a));
        } else {
            kkhVar2 = null;
        }
        this.c = kkhVar2;
    }

    public static cjh a(cjh cjhVar, zb0 zb0Var, long j, int i) {
        if ((i & 1) != 0) {
            zb0Var = cjhVar.a;
        }
        if ((i & 2) != 0) {
            j = cjhVar.b;
        }
        kkh kkhVar = (i & 4) != 0 ? cjhVar.c : null;
        cjhVar.getClass();
        return new cjh(zb0Var, j, kkhVar);
    }

    public static cjh b(cjh cjhVar, String str, long j, int i) {
        if ((i & 2) != 0) {
            j = cjhVar.b;
        }
        kkh kkhVar = cjhVar.c;
        cjhVar.getClass();
        return new cjh(new zb0(str), j, kkhVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cjh)) {
            return false;
        }
        cjh cjhVar = (cjh) obj;
        return kkh.c(this.b, cjhVar.b) && x44.r(this.c, cjhVar.c) && x44.r(this.a, cjhVar.a);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        int i = kkh.c;
        int iE = vb7.e(iHashCode, 31, this.b);
        kkh kkhVar = this.c;
        return iE + (kkhVar != null ? Long.hashCode(kkhVar.a) : 0);
    }

    public final String toString() {
        return "TextFieldValue(text='" + ((Object) this.a) + "', selection=" + ((Object) kkh.i(this.b)) + ", composition=" + this.c + ')';
    }

    public cjh(String str, long j, int i) {
        this(new zb0((i & 1) != 0 ? "" : str), (i & 2) != 0 ? kkh.b : j, (kkh) null);
    }
}
