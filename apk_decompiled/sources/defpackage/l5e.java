package defpackage;

import java.io.Closeable;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class l5e implements zy7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ dae F;

    public /* synthetic */ l5e(int i, dae daeVar) {
        this.E = i;
        this.F = daeVar;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.E;
        iei ieiVar = iei.a;
        dae daeVar = this.F;
        switch (i) {
            case 0:
                zkj.b((Closeable) daeVar.E);
                break;
            default:
                xvf xvfVar = (xvf) daeVar.E;
                if (xvfVar != null) {
                    xvfVar.r();
                }
                break;
        }
        return ieiVar;
    }
}
