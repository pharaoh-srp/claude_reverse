package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* JADX INFO: loaded from: classes2.dex */
public final class vhf implements PointerInputEventHandler {
    public final /* synthetic */ int E;
    public final /* synthetic */ zeh F;

    public /* synthetic */ vhf(zeh zehVar, int i) {
        this.E = i;
        this.F = zehVar;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(e8d e8dVar, tp4 tp4Var) {
        int i = this.E;
        iei ieiVar = iei.a;
        m45 m45Var = m45.E;
        zeh zehVar = this.F;
        switch (i) {
            case 0:
                Object objC = jik.c(e8dVar, zehVar, tp4Var);
                return objC == m45Var ? objC : ieiVar;
            default:
                Object objC2 = jik.c(e8dVar, zehVar, tp4Var);
                return objC2 == m45Var ? objC2 : ieiVar;
        }
    }
}
