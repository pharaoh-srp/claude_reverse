package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* JADX INFO: loaded from: classes.dex */
public final class zo4 implements PointerInputEventHandler {
    public final /* synthetic */ int E;
    public final /* synthetic */ bz7 F;

    public /* synthetic */ zo4(int i, bz7 bz7Var) {
        this.E = i;
        this.F = bz7Var;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(e8d e8dVar, tp4 tp4Var) {
        int i = this.E;
        iei ieiVar = iei.a;
        m45 m45Var = m45.E;
        bz7 bz7Var = this.F;
        switch (i) {
            case 0:
                Object objS = osk.s(e8dVar, bz7Var, tp4Var);
                return objS == m45Var ? objS : ieiVar;
            default:
                Object objP1 = ((e0h) e8dVar).p1(new vte(1, null, bz7Var), tp4Var);
                return objP1 == m45Var ? objP1 : ieiVar;
        }
    }
}
