package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* JADX INFO: loaded from: classes2.dex */
public final class sl1 implements PointerInputEventHandler {
    public final /* synthetic */ int E;
    public final /* synthetic */ fn1 F;

    public /* synthetic */ sl1(fn1 fn1Var, int i) {
        this.E = i;
        this.F = fn1Var;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(e8d e8dVar, tp4 tp4Var) {
        int i = this.E;
        fn1 fn1Var = this.F;
        switch (i) {
            case 0:
                return x4h.f(e8dVar, null, null, null, new sk1(fn1Var, 1), tp4Var, 7);
            default:
                return x4h.f(e8dVar, null, null, null, new sk1(fn1Var, 2), tp4Var, 7);
        }
    }
}
