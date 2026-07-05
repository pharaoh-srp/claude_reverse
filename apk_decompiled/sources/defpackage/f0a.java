package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f0a implements zy7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ g0a F;

    public /* synthetic */ f0a(g0a g0aVar, int i) {
        this.E = i;
        this.F = g0aVar;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.E;
        g0a g0aVar = this.F;
        switch (i) {
            case 0:
                return Float.valueOf(g0aVar.T.b());
            case 1:
                return Float.valueOf(g0aVar.T.d());
            default:
                return Float.valueOf(g0aVar.T.a() - g0aVar.T.c());
        }
    }
}
