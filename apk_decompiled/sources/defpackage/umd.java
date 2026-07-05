package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class umd implements bz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ wmd F;

    public /* synthetic */ umd(wmd wmdVar, int i) {
        this.E = i;
        this.F = wmdVar;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.E;
        wmd wmdVar = this.F;
        switch (i) {
            case 0:
                wmdVar.n.setValue(Boolean.FALSE);
                return iei.a;
            case 1:
                ((r4a) obj).getClass();
                vn5 vn5Var = wmdVar.d;
                long j = wmd.q;
                vn5Var.getClass();
                if (vn5Var.a.a() - vn5Var.b > j) {
                    gb9.D(wmdVar.a, null, null, new eq(wmdVar, null), 3);
                }
                return new le(24);
            default:
                String str = (String) obj;
                str.getClass();
                return Boolean.valueOf(wmdVar.j.b(str));
        }
    }
}
