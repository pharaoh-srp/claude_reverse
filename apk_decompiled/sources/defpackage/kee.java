package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class kee implements sna {
    public final /* synthetic */ int a;
    public final /* synthetic */ ua2 b;

    public /* synthetic */ kee(ua2 ua2Var, int i) {
        this.a = i;
        this.b = ua2Var;
    }

    @Override // defpackage.sna
    public final void onResult(Object obj) {
        int i = this.a;
        ua2 ua2Var = this.b;
        switch (i) {
            case 0:
                if (!ua2Var.y()) {
                    ua2Var.resumeWith(obj);
                }
                break;
            default:
                Throwable th = (Throwable) obj;
                if (!ua2Var.y()) {
                    th.getClass();
                    ua2Var.resumeWith(new hre(th));
                }
                break;
        }
    }
}
