package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class lp0 extends il4 {
    public final bz7 b;

    public lp0(bz7 bz7Var, List list) {
        super(list);
        this.b = bz7Var;
    }

    @Override // defpackage.il4
    public final yr9 a(tqb tqbVar) {
        xh3 xh3VarA;
        tqbVar.getClass();
        yr9 yr9Var = (yr9) this.b.invoke(tqbVar);
        if (!or9.x(yr9Var) && (((xh3VarA = yr9Var.O().a()) == null || or9.q(xh3VarA) == null) && !or9.A(yr9Var, okg.V.i()) && !or9.A(yr9Var, okg.W.i()) && !or9.A(yr9Var, okg.X.i()))) {
            or9.A(yr9Var, okg.Y.i());
        }
        return yr9Var;
    }
}
