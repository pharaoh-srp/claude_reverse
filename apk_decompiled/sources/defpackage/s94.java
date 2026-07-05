package defpackage;

import android.window.OnBackInvokedDispatcher;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s94 implements i4a {
    public final /* synthetic */ int E;
    public final /* synthetic */ Object F;
    public final /* synthetic */ Object G;

    public /* synthetic */ s94(Object obj, int i, Object obj2) {
        this.E = i;
        this.F = obj;
        this.G = obj2;
    }

    @Override // defpackage.i4a
    public final void d(m4a m4aVar, y3a y3aVar) {
        int i = this.E;
        Object obj = this.G;
        Object obj2 = this.F;
        switch (i) {
            case 0:
                vdc vdcVar = (vdc) obj2;
                ba4 ba4Var = (ba4) obj;
                if (y3aVar == y3a.ON_CREATE) {
                    OnBackInvokedDispatcher onBackInvokedDispatcher = ba4Var.getOnBackInvokedDispatcher();
                    onBackInvokedDispatcher.getClass();
                    vdcVar.c(onBackInvokedDispatcher);
                }
                break;
            default:
                wvb wvbVar = (wvb) obj;
                if (y3aVar == ((y3a) obj2) && !x44.r(wvbVar.e(), yxc.a)) {
                    wvbVar.b();
                    break;
                }
                break;
        }
    }
}
