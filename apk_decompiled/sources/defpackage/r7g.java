package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class r7g implements dxe {
    @Override // defpackage.dxe
    public final iqb a(iqb iqbVar, float f, boolean z) {
        iqbVar.getClass();
        if (f <= 0.0d) {
            z29.a("invalid weight; must be greater than zero");
        }
        if (f > Float.MAX_VALUE) {
            f = Float.MAX_VALUE;
        }
        return iqbVar.B(new hw9(f, z));
    }

    @Override // defpackage.dxe
    public final iqb b(iqb iqbVar, wo1 wo1Var) {
        iqbVar.getClass();
        return iqbVar.B(new sti(wo1Var));
    }
}
