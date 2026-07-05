package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* JADX INFO: loaded from: classes2.dex */
public final class rz9 implements PointerInputEventHandler {
    public final /* synthetic */ int E;
    public final /* synthetic */ Object F;

    public /* synthetic */ rz9(int i, Object obj) {
        this.E = i;
        this.F = obj;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(e8d e8dVar, tp4 tp4Var) {
        int i = this.E;
        iei ieiVar = iei.a;
        m45 m45Var = m45.E;
        Object obj = this.F;
        switch (i) {
            case 0:
                Object objN = fd9.N(new ix5(e8dVar, (koc) obj, null, 20), tp4Var);
                return objN == m45Var ? objN : ieiVar;
            default:
                Object objS = osk.s(e8dVar, new b2g(1, (feh) obj, feh.class, "tryShowContextMenu", "tryShowContextMenu-k-4lQ0M(J)V", 0, 8), tp4Var);
                return objS == m45Var ? objS : ieiVar;
        }
    }
}
