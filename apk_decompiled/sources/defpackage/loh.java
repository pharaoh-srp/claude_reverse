package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class loh implements zy7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ moh F;

    public /* synthetic */ loh(moh mohVar, int i) {
        this.E = i;
        this.F = mohVar;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.E;
        moh mohVar = this.F;
        switch (i) {
            case 0:
                return new g79(mohVar.g);
            default:
                fj0 fj0Var = mohVar.e;
                return Boolean.valueOf(fj0Var != null ? ((Boolean) ((lsc) fj0Var.F).getValue()).booleanValue() : false);
        }
    }
}
