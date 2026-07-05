package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class oih implements zy7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ sih F;

    public /* synthetic */ oih(sih sihVar, int i) {
        this.E = i;
        this.F = sihVar;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.E;
        iei ieiVar = iei.a;
        sih sihVar = this.F;
        switch (i) {
            case 0:
                sihVar.i();
                break;
            case 1:
                break;
            case 2:
                sihVar.B();
                break;
            default:
                zy7 zy7Var = sihVar.m;
                if (zy7Var != null) {
                    zy7Var.a();
                }
                break;
        }
        return ieiVar;
    }
}
