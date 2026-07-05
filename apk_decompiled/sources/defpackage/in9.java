package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class in9 implements kl9 {
    public static final /* synthetic */ wn9[] I;
    public final ol9 E;
    public final int F;
    public final gn9 G;
    public final ece H;

    static {
        kce kceVar = jce.a;
        I = new wn9[]{kceVar.g(new mrd(kceVar.b(in9.class), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/ParameterDescriptor;")), kceVar.g(new mrd(kceVar.b(in9.class), "annotations", "getAnnotations()Ljava/util/List;"))};
    }

    public in9(ol9 ol9Var, int i, gn9 gn9Var, zy7 zy7Var) {
        this.E = ol9Var;
        this.F = i;
        this.G = gn9Var;
        this.H = csg.C(null, zy7Var);
        csg.C(null, new hn9(this, 0));
    }

    public final lrc a() {
        wn9 wn9Var = I[0];
        Object objA = this.H.a();
        objA.getClass();
        return (lrc) objA;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof in9)) {
            return false;
        }
        in9 in9Var = (in9) obj;
        return this.E.equals(in9Var.E) && this.F == in9Var.F;
    }

    public final String getName() {
        lrc lrcVarA = a();
        eri eriVar = lrcVarA instanceof eri ? (eri) lrcVarA : null;
        if (eriVar != null && !eriVar.h().v()) {
            sxb name = eriVar.getName();
            name.getClass();
            if (!name.F) {
                return name.b();
            }
        }
        return null;
    }

    public final int hashCode() {
        return Integer.hashCode(this.F) + (this.E.hashCode() * 31);
    }

    public final int i() {
        return this.F;
    }

    public final gn9 j() {
        return this.G;
    }

    public final fo9 l() {
        yr9 type = a().getType();
        type.getClass();
        return new fo9(type, new hn9(this, 1));
    }

    public final boolean m() {
        lrc lrcVarA = a();
        eri eriVar = lrcVarA instanceof eri ? (eri) lrcVarA : null;
        if (eriVar != null) {
            return o06.a(eriVar);
        }
        return false;
    }

    public final boolean o() {
        lrc lrcVarA = a();
        return (lrcVarA instanceof eri) && ((eri) lrcVarA).N != null;
    }

    public final String toString() {
        String strB;
        g06 g06Var = pce.a;
        StringBuilder sb = new StringBuilder();
        int iOrdinal = this.G.ordinal();
        if (iOrdinal == 0) {
            sb.append("instance parameter");
        } else if (iOrdinal == 2) {
            sb.append("extension receiver parameter");
        } else if (iOrdinal == 3) {
            sb.append("parameter #" + this.F + ' ' + getName());
        }
        sb.append(" of ");
        e92 e92VarT = this.E.t();
        if (e92VarT instanceof hrd) {
            strB = pce.d((hrd) e92VarT);
        } else {
            if (!(e92VarT instanceof h08)) {
                xh6.d("Illegal callable: ", e92VarT);
                return null;
            }
            strB = pce.b((h08) e92VarT);
        }
        sb.append(strB);
        return sb.toString();
    }
}
