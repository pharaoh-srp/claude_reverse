package defpackage;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ge implements zy7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ l4h F;

    public /* synthetic */ ge(l4h l4hVar, int i) {
        this.E = i;
        this.F = l4hVar;
    }

    @Override // defpackage.zy7
    public final Object a() throws IOException {
        int i = this.E;
        iei ieiVar = iei.a;
        l4h l4hVar = this.F;
        switch (i) {
            case 0:
                if (l4hVar != null) {
                    l4hVar.a();
                }
                break;
            default:
                l4hVar.a();
                break;
        }
        return ieiVar;
    }
}
