package defpackage;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class tr6 implements qd7 {
    @Override // defpackage.qd7
    public final int a() {
        return 2;
    }

    @Override // defpackage.qd7
    public final int b(c92 c92Var, c92 c92Var2, qqb qqbVar) {
        c92Var.getClass();
        c92Var2.getClass();
        if (!(c92Var2 instanceof ge9)) {
            return 4;
        }
        ge9 ge9Var = (ge9) c92Var2;
        if (!ge9Var.getTypeParameters().isEmpty()) {
            return 4;
        }
        fmc fmcVarI = gmc.i(c92Var, c92Var2);
        if ((fmcVarI != null ? fmcVarI.c() : 0) != 0) {
            return 4;
        }
        List listI = ge9Var.I();
        listI.getClass();
        l5i l5iVarB0 = bnf.b0(new c54(0, listI), f06.L);
        yr9 yr9Var = ge9Var.K;
        yr9Var.getClass();
        rn7 rn7VarX = bnf.X(mp0.m0(new ymf[]{l5iVarB0, new pp0(3, yr9Var)}));
        l6e l6eVar = ge9Var.M;
        Iterator it = bnf.X(mp0.m0(new ymf[]{rn7VarX, new c54(0, x44.Y(l6eVar != null ? ((mw9) l6eVar).getType() : null))})).iterator();
        while (true) {
            qn7 qn7Var = (qn7) it;
            if (!qn7Var.hasNext()) {
                c92 c92VarBuild = (c92) c92Var.e(new i2e().c());
                if (c92VarBuild == null) {
                    return 4;
                }
                if (c92VarBuild instanceof c7g) {
                    c7g c7gVar = (c7g) c92VarBuild;
                    if (!c7gVar.getTypeParameters().isEmpty()) {
                        c92VarBuild = c7gVar.f0().m().build();
                        c92VarBuild.getClass();
                    }
                }
                int iC = gmc.c.n(c92VarBuild, c92Var2, false).c();
                sq6.a(iC);
                return sr6.a[sq6.F(iC)] == 1 ? 1 : 4;
            }
            yr9 yr9Var2 = (yr9) qn7Var.next();
            if (!yr9Var2.H().isEmpty() && !(yr9Var2.k0() instanceof j2e)) {
                return 4;
            }
        }
    }
}
