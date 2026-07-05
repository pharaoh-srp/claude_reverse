package defpackage;

import android.os.CancellationSignal;

/* JADX INFO: loaded from: classes2.dex */
public final class l95 implements bz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ CancellationSignal F;

    public /* synthetic */ l95(CancellationSignal cancellationSignal, int i) {
        this.E = i;
        this.F = cancellationSignal;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        CancellationSignal cancellationSignal = this.F;
        switch (i) {
            case 0:
                cancellationSignal.cancel();
                break;
            case 1:
                cancellationSignal.cancel();
                break;
            default:
                cancellationSignal.cancel();
                break;
        }
        return ieiVar;
    }
}
