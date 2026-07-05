package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class di1 implements lp7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ ki1 F;

    public /* synthetic */ di1(ki1 ki1Var, int i) {
        this.E = i;
        this.F = ki1Var;
    }

    @Override // defpackage.lp7
    public final Object g(Object obj, tp4 tp4Var) {
        switch (this.E) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                this.F.t.setValue(bool);
                break;
            case 1:
                cpc cpcVar = (cpc) obj;
                String str = (String) cpcVar.E;
                String str2 = (String) cpcVar.F;
                this.F.w = new w0j(str, str2);
                break;
            default:
                s51 s51Var = (s51) obj;
                s51 s51Var2 = this.F.k;
                if (s51Var2 == null) {
                    if (s51Var != null && !s51Var.equals((s51) this.F.v.getValue())) {
                        this.F.n.r(s51Var);
                    }
                    this.F.v.setValue(s51Var);
                } else if (s51Var2.equals(s51Var)) {
                    this.F.v.setValue(s51Var);
                }
                break;
        }
        return iei.a;
    }
}
