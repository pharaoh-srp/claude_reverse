package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class nr7 implements dxe {
    public static final nr7 a = new nr7();

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
