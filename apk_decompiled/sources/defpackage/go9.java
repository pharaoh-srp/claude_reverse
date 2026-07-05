package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class go9 implements dm9, cm9 {
    public static final /* synthetic */ wn9[] H;
    public final qai E;
    public final ece F = csg.C(null, new v01(24, this));
    public final ho9 G;

    static {
        kce kceVar = jce.a;
        H = new wn9[]{kceVar.g(new mrd(kceVar.b(go9.class), "upperBounds", "getUpperBounds()Ljava/util/List;"))};
    }

    public go9(ho9 ho9Var, qai qaiVar) {
        Class cls;
        xl9 xl9VarB;
        Object objE;
        this.E = qaiVar;
        if (ho9Var == null) {
            bo5 bo5VarH = qaiVar.h();
            bo5VarH.getClass();
            if (bo5VarH instanceof qqb) {
                objE = b((qqb) bo5VarH);
            } else {
                if (!(bo5VarH instanceof e92)) {
                    rl7.n("Unknown type parameter container: ", bo5VarH);
                    throw null;
                }
                bo5 bo5VarH2 = ((e92) bo5VarH).h();
                bo5VarH2.getClass();
                if (bo5VarH2 instanceof qqb) {
                    xl9VarB = b((qqb) bo5VarH2);
                } else {
                    g16 g16Var = bo5VarH instanceof g16 ? (g16) bo5VarH : null;
                    if (g16Var == null) {
                        rl7.n("Non-class callable descriptor must be deserialized: ", bo5VarH);
                        throw null;
                    }
                    d16 d16VarL = g16Var.L();
                    lk9 lk9Var = d16VarL instanceof lk9 ? (lk9) d16VarL : null;
                    bce bceVar = lk9Var != null ? lk9Var.G : null;
                    bceVar = bceVar == null ? null : bceVar;
                    if (bceVar == null || (cls = bceVar.a) == null) {
                        rl7.n("Container of deserialized member is not resolved: ", g16Var);
                        throw null;
                    }
                    xl9VarB = (xl9) jce.a.b(cls);
                }
                objE = bo5VarH.E(new poj(xl9VarB), iei.a);
            }
            objE.getClass();
            ho9Var = (ho9) objE;
        }
        this.G = ho9Var;
    }

    public static xl9 b(qqb qqbVar) {
        Class clsJ = vpi.j(qqbVar);
        xl9 xl9Var = (xl9) (clsJ != null ? jce.a.b(clsJ) : null);
        if (xl9Var != null) {
            return xl9Var;
        }
        rl7.k("Type parameter container is not resolved: ", qqbVar.h());
        return null;
    }

    public final String a() {
        String strB = this.E.getName().b();
        strB.getClass();
        return strB;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof go9)) {
            return false;
        }
        go9 go9Var = (go9) obj;
        return x44.r(this.G, go9Var.G) && a().equals(go9Var.a());
    }

    @Override // defpackage.dm9
    public final xh3 getDescriptor() {
        return this.E;
    }

    public final int hashCode() {
        return a().hashCode() + (this.G.hashCode() * 31);
    }

    public final String toString() {
        lo9 lo9Var;
        StringBuilder sb = new StringBuilder();
        int iF = sq6.F(this.E.z());
        if (iF == 0) {
            lo9Var = lo9.E;
        } else if (iF == 1) {
            lo9Var = lo9.F;
        } else {
            if (iF != 2) {
                wg6.i();
                return null;
            }
            lo9Var = lo9.G;
        }
        int iOrdinal = lo9Var.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                sb.append("in ");
            } else {
                if (iOrdinal != 2) {
                    wg6.i();
                    return null;
                }
                sb.append("out ");
            }
        }
        sb.append(a());
        return sb.toString();
    }
}
