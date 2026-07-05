package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class fxe implements dxe {
    public static final fxe a = new fxe();

    @Override // defpackage.dxe
    public final iqb a(iqb iqbVar, float f, boolean z) {
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
        return iqbVar.B(new sti(wo1Var));
    }
}
