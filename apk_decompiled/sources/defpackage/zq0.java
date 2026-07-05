package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class zq0 implements v86 {
    public final /* synthetic */ int a;
    public final /* synthetic */ t4f b;

    public /* synthetic */ zq0(t4f t4fVar, int i) {
        this.a = i;
        this.b = t4fVar;
    }

    @Override // defpackage.v86
    public final void a() {
        int i = this.a;
        t4f t4fVar = this.b;
        switch (i) {
            case 0:
                t4fVar.setExternalUrlHandler(null);
                t4fVar.destroy();
                break;
            case 1:
                t4fVar.setExternalUrlHandler(null);
                t4fVar.setClientRpcListener(null);
                break;
            default:
                t4fVar.setRenderProcessGoneListener(null);
                t4fVar.destroy();
                break;
        }
    }
}
