package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class nic extends ln7 {
    public static final nic d = new nic(0, 3, 1);

    @Override // defpackage.ln7
    public final void c(gjc gjcVar, hn0 hn0Var, vag vagVar, p60 p60Var, fjc fjcVar) {
        qb5 qb5VarF;
        sag sagVar = (sag) gjcVar.b(1);
        y08 y08Var = (y08) gjcVar.b(0);
        tm7 tm7Var = (tm7) gjcVar.b(2);
        vag vagVarH = sagVar.h();
        if (fjcVar != null) {
            try {
                qb5VarF = wvk.f(fjcVar, vagVar);
            } catch (Throwable th) {
                vagVarH.e(false);
                throw th;
            }
        } else {
            qb5VarF = null;
        }
        if (!tm7Var.p.Z()) {
            pd4.a("FixupList has pending fixup operations that were not realized. Were there mismatched insertNode() and endNodeInsert() calls?");
        }
        tm7Var.o.Y(hn0Var, vagVarH, p60Var, qb5VarF);
        vagVarH.e(true);
        vagVar.d();
        y08Var.getClass();
        vagVar.A(sagVar, sagVar.a(y08Var));
        vagVar.k();
    }
}
