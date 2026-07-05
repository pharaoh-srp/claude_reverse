package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* JADX INFO: loaded from: classes.dex */
public final class vc6 implements PointerInputEventHandler {
    public final /* synthetic */ zy7 E;
    public final /* synthetic */ zy7 F;

    public vc6(zy7 zy7Var, zy7 zy7Var2) {
        this.E = zy7Var;
        this.F = zy7Var2;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(e8d e8dVar, tp4 tp4Var) {
        Object objF = pok.f(e8dVar, new f(this.E, this.F, null, 1), tp4Var);
        return objF == m45.E ? objF : iei.a;
    }
}
