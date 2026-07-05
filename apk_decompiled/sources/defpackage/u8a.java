package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class u8a implements zy7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ fj0 F;

    public /* synthetic */ u8a(fj0 fj0Var, int i) {
        this.E = i;
        this.F = fj0Var;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.E;
        fj0 fj0Var = this.F;
        switch (i) {
            case 0:
                return fj0Var.x();
            case 1:
                return Float.valueOf(((gff) fj0Var.E).M.h());
            default:
                return fj0Var.x();
        }
    }
}
