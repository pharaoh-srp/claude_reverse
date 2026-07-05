package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class mq6 extends il4 {
    public final gh3 b;
    public final sxb c;

    public mq6(gh3 gh3Var, sxb sxbVar) {
        super(new cpc(gh3Var, sxbVar));
        this.b = gh3Var;
        this.c = sxbVar;
    }

    @Override // defpackage.il4
    public final yr9 a(tqb tqbVar) {
        tqbVar.getClass();
        gh3 gh3Var = this.b;
        qqb qqbVarT = kxk.t(tqbVar, gh3Var);
        j7g j7gVarW = null;
        if (qqbVarT != null) {
            if (!m06.n(qqbVarT, 3)) {
                qqbVarT = null;
            }
            if (qqbVarT != null) {
                j7gVarW = qqbVarT.W();
            }
        }
        if (j7gVarW != null) {
            return j7gVarW;
        }
        String string = gh3Var.toString();
        String str = this.c.E;
        str.getClass();
        return nu6.c(mu6.ERROR_ENUM_TYPE, string, str);
    }

    public final sxb c() {
        return this.c;
    }

    @Override // defpackage.il4
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.b.i());
        sb.append('.');
        sb.append(this.c);
        return sb.toString();
    }
}
