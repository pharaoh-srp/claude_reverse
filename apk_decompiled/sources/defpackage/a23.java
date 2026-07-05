package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a23 implements zy7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ x0a F;

    public /* synthetic */ a23(x0a x0aVar, int i) {
        this.E = i;
        this.F = x0aVar;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.E;
        x0a x0aVar = this.F;
        switch (i) {
            case 0:
                return Integer.valueOf(x0aVar.h().q);
            case 1:
                return Boolean.valueOf(x0aVar.d());
            default:
                return Integer.valueOf(x0aVar.h().n);
        }
    }
}
