package defpackage;

import android.os.CancellationSignal;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class zc4 implements CancellationSignal.OnCancelListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ zc4(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.os.CancellationSignal.OnCancelListener
    public final void onCancel() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((fkg) obj).d(null);
                break;
            case 1:
                zhh zhhVar = (zhh) obj;
                if (zhhVar != null) {
                    m2a m2aVar = zhhVar.d;
                    if (m2aVar != null) {
                        m2aVar.e(kkh.b);
                    }
                    m2a m2aVar2 = zhhVar.d;
                    if (m2aVar2 != null) {
                        m2aVar2.f(kkh.b);
                    }
                }
                break;
            default:
                i5i i5iVar = (i5i) obj;
                yih yihVar = i5iVar.a;
                k6e k6eVar = i5iVar.b;
                yihVar.b.a().D();
                dfh dfhVar = yihVar.b;
                dfhVar.K = null;
                i5iVar.l(dfhVar);
                yih.a(yihVar, k6eVar, true, cgh.E);
                yihVar.f(true);
                break;
        }
    }
}
