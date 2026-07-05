package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class kci extends n79 {
    public final /* synthetic */ int b = 0;

    public kci(byte b) {
        super(Byte.valueOf(b));
    }

    @Override // defpackage.il4
    public final yr9 a(tqb tqbVar) {
        j7g j7gVarW;
        int i = this.b;
        mu6 mu6Var = mu6.NOT_FOUND_UNSIGNED_TYPE;
        tqbVar.getClass();
        switch (i) {
            case 0:
                qqb qqbVarT = kxk.t(tqbVar, okg.R);
                j7gVarW = qqbVarT != null ? qqbVarT.W() : null;
                return j7gVarW == null ? nu6.c(mu6Var, "UByte") : j7gVarW;
            case 1:
                qqb qqbVarT2 = kxk.t(tqbVar, okg.T);
                j7gVarW = qqbVarT2 != null ? qqbVarT2.W() : null;
                return j7gVarW == null ? nu6.c(mu6Var, "UInt") : j7gVarW;
            case 2:
                qqb qqbVarT3 = kxk.t(tqbVar, okg.U);
                j7gVarW = qqbVarT3 != null ? qqbVarT3.W() : null;
                return j7gVarW == null ? nu6.c(mu6Var, "ULong") : j7gVarW;
            default:
                qqb qqbVarT4 = kxk.t(tqbVar, okg.S);
                j7gVarW = qqbVarT4 != null ? qqbVarT4.W() : null;
                return j7gVarW == null ? nu6.c(mu6Var, "UShort") : j7gVarW;
        }
    }

    @Override // defpackage.il4
    public final String toString() {
        int i = this.b;
        Object obj = this.a;
        switch (i) {
            case 0:
                return ((Number) obj).intValue() + ".toUByte()";
            case 1:
                return ((Number) obj).intValue() + ".toUInt()";
            case 2:
                return ((Number) obj).longValue() + ".toULong()";
            default:
                return ((Number) obj).intValue() + ".toUShort()";
        }
    }

    public kci(short s) {
        super(Short.valueOf(s));
    }

    public kci(int i) {
        super(Integer.valueOf(i));
    }

    public kci(long j) {
        super(Long.valueOf(j));
    }
}
