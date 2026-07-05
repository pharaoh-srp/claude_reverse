package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class xjd implements Runnable {
    public final /* synthetic */ int E;
    public final /* synthetic */ ekd F;

    public /* synthetic */ xjd(ekd ekdVar, int i) {
        this.E = i;
        this.F = ekdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.E;
        ekd ekdVar = this.F;
        switch (i) {
            case 0:
                ekdVar.o0 = true;
                break;
            case 1:
                ekdVar.u();
                break;
            default:
                if (!ekdVar.u0) {
                    r7b r7bVar = ekdVar.V;
                    r7bVar.getClass();
                    r7bVar.i(ekdVar);
                }
                break;
        }
    }
}
