package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class bm9 extends il4 {
    public bm9(gh3 gh3Var, int i) {
        super(new zl9(new jh3(gh3Var, i)));
    }

    @Override // defpackage.il4
    public final yr9 a(tqb tqbVar) {
        yr9 yr9VarC;
        tqbVar.getClass();
        r9i.F.getClass();
        r9i r9iVar = r9i.G;
        or9 or9VarF = tqbVar.f();
        or9VarF.getClass();
        qqb qqbVarI = or9VarF.i(okg.P.g());
        Object obj = this.a;
        am9 am9Var = (am9) obj;
        if (am9Var instanceof yl9) {
            yr9VarC = ((yl9) obj).a;
        } else {
            if (!(am9Var instanceof zl9)) {
                wg6.i();
                return null;
            }
            jh3 jh3Var = ((zl9) obj).a;
            gh3 gh3Var = jh3Var.a;
            int i = jh3Var.b;
            qqb qqbVarT = kxk.t(tqbVar, gh3Var);
            if (qqbVarT == null) {
                yr9VarC = nu6.c(mu6.UNRESOLVED_KCLASS_CONSTANT_VALUE, gh3Var.toString(), String.valueOf(i));
            } else {
                j7g j7gVarW = qqbVarT.W();
                j7gVarW.getClass();
                fhi fhiVarE = jwk.E(j7gVarW);
                for (int i2 = 0; i2 < i; i2++) {
                    fhiVarE = tqbVar.f().h(fhiVarE);
                }
                yr9VarC = fhiVarE;
            }
        }
        return yfd.b0(r9iVar, qqbVarI, x44.W(new wai(yr9VarC)));
    }
}
