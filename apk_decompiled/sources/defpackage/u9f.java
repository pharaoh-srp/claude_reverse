package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class u9f implements zy7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ z9f F;

    public /* synthetic */ u9f(z9f z9fVar, int i) {
        this.E = i;
        this.F = z9fVar;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.E;
        z9f z9fVar = this.F;
        switch (i) {
            case 0:
                return Boolean.valueOf(z9fVar.R);
            default:
                jt7 jt7Var = z9fVar.t0;
                if (!jt7Var.E.R) {
                    return null;
                }
                ft7 ft7VarU1 = jt7Var.u1();
                if (!ft7VarU1.a()) {
                    return null;
                }
                if (ft7VarU1.b()) {
                    return jt7Var.s1(null);
                }
                jt7 jt7VarH = ((ts7) yfd.X(jt7Var).getFocusOwner()).h();
                if (jt7VarH != null) {
                    return jt7VarH.s1(yfd.V(jt7Var));
                }
                return null;
        }
    }
}
