package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* JADX INFO: loaded from: classes2.dex */
public final class io3 implements PointerInputEventHandler {
    public final /* synthetic */ int E;
    public final /* synthetic */ zy7 F;

    public /* synthetic */ io3(int i, zy7 zy7Var) {
        this.E = i;
        this.F = zy7Var;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(e8d e8dVar, tp4 tp4Var) {
        int i = this.E;
        iei ieiVar = iei.a;
        m45 m45Var = m45.E;
        zy7 zy7Var = this.F;
        switch (i) {
            case 0:
                return x4h.f(e8dVar, null, new kw0(3, zy7Var), new ho3(3, null, 0), null, tp4Var, 9);
            case 1:
                Object objP1 = ((e0h) e8dVar).p1(new z10(zy7Var, null, 2), tp4Var);
                return objP1 == m45Var ? objP1 : ieiVar;
            case 2:
                return x4h.f(e8dVar, new kw0(10, zy7Var), null, null, null, tp4Var, 14);
            default:
                Object objF = x4h.f(e8dVar, null, null, null, new kw0(16, zy7Var), tp4Var, 7);
                return objF == m45Var ? objF : ieiVar;
        }
    }
}
