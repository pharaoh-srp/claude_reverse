package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class fp5 implements hba {
    public final /* synthetic */ int E = 0;
    public final /* synthetic */ yui F;

    public /* synthetic */ fp5(kx kxVar, yui yuiVar) {
        this.F = yuiVar;
    }

    @Override // defpackage.hba
    public final void invoke(Object obj) {
        int i = this.E;
        yui yuiVar = this.F;
        switch (i) {
            case 0:
                q7b q7bVar = (q7b) obj;
                qb5 qb5Var = q7bVar.p;
                if (qb5Var != null) {
                    jw7 jw7Var = (jw7) qb5Var.E;
                    if (jw7Var.w == -1) {
                        iw7 iw7VarA = jw7Var.a();
                        iw7VarA.u = yuiVar.a;
                        iw7VarA.v = yuiVar.b;
                        q7bVar.p = new qb5((Object) new jw7(iw7VarA), qb5Var.F, false);
                    }
                }
                int i2 = yuiVar.a;
                break;
            default:
                ((u6d) obj).a(yuiVar);
                break;
        }
    }

    public /* synthetic */ fp5(yui yuiVar) {
        this.F = yuiVar;
    }
}
