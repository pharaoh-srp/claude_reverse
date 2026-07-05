package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class j75 implements zy7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ k75 F;

    public /* synthetic */ j75(k75 k75Var, int i) {
        this.E = i;
        this.F = k75Var;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.E;
        k75 k75Var = this.F;
        switch (i) {
            case 0:
                return Boolean.valueOf(!bsg.I0((String) k75Var.j.getValue()));
            default:
                gb9.D(k75Var.a, null, null, new b9(k75Var, null, 14), 3);
                return iei.a;
        }
    }
}
