package defpackage;

import android.os.RemoteException;

/* JADX INFO: loaded from: classes2.dex */
public final class fnj implements mnj {
    public final /* synthetic */ int a;
    public final /* synthetic */ x7b b;

    public /* synthetic */ fnj(x7b x7bVar, int i) {
        this.a = i;
        this.b = x7bVar;
    }

    @Override // defpackage.mnj
    public final int a() {
        switch (this.a) {
            case 0:
                return 4;
            default:
                return 5;
        }
    }

    @Override // defpackage.mnj
    public final void b() {
        int i = this.a;
        x7b x7bVar = this.b;
        switch (i) {
            case 0:
                lrb lrbVar = (lrb) x7bVar.a;
                lrbVar.getClass();
                try {
                    exk exkVar = (exk) lrbVar.G;
                    exkVar.L(exkVar.H(), 12);
                } catch (RemoteException e) {
                    poc.q(e);
                    return;
                }
                break;
            default:
                lrb lrbVar2 = (lrb) x7bVar.a;
                lrbVar2.getClass();
                try {
                    exk exkVar2 = (exk) lrbVar2.G;
                    exkVar2.L(exkVar2.H(), 3);
                } catch (RemoteException e2) {
                    poc.q(e2);
                }
                break;
        }
    }
}
