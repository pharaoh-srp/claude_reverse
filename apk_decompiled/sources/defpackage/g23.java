package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class g23 implements lp7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ x0a F;
    public final /* synthetic */ nwb G;

    public /* synthetic */ g23(x0a x0aVar, nwb nwbVar, int i) {
        this.E = i;
        this.F = x0aVar;
        this.G = nwbVar;
    }

    @Override // defpackage.lp7
    public final Object g(Object obj, tp4 tp4Var) {
        int i = this.E;
        nwb nwbVar = this.G;
        x0a x0aVar = this.F;
        switch (i) {
            case 0:
                v79 v79Var = (v79) obj;
                if (v79Var instanceof ad6) {
                    xe4 xe4Var = z23.a;
                    nwbVar.setValue(Boolean.FALSE);
                } else if (((v79Var instanceof bd6) || (v79Var instanceof zc6)) && !x0aVar.d()) {
                    xe4 xe4Var2 = z23.a;
                    nwbVar.setValue(Boolean.TRUE);
                }
                return iei.a;
            default:
                ((Boolean) obj).getClass();
                xe4 xe4Var3 = z23.a;
                return x0a.k(x0aVar, ((Number) nwbVar.getValue()).intValue(), tp4Var);
        }
    }
}
