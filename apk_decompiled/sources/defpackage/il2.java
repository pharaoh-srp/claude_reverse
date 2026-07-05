package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class il2 implements zy7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ n78 F;

    public /* synthetic */ il2(n78 n78Var, int i) {
        this.E = i;
        this.F = n78Var;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.E;
        n78 n78Var = this.F;
        switch (i) {
            case 0:
                return Boolean.valueOf(((t53) n78Var.F).I0() || ((t53) n78Var.F).G0());
            default:
                t53 t53Var = (t53) n78Var.F;
                x0a x0aVar = t53Var.l0;
                if (!x0aVar.h().k.isEmpty() && !x0aVar.j.a() && (!((Boolean) t53Var.m0.getValue()).booleanValue() || !x0aVar.d())) {
                    z = true;
                }
                return Boolean.valueOf(z);
        }
    }
}
