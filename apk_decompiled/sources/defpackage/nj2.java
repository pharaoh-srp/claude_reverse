package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* JADX INFO: loaded from: classes3.dex */
public final class nj2 implements PointerInputEventHandler {
    public final /* synthetic */ int E;
    public final /* synthetic */ nwb F;
    public final /* synthetic */ nwb G;

    public /* synthetic */ nj2(nwb nwbVar, nwb nwbVar2, int i) {
        this.E = i;
        this.F = nwbVar;
        this.G = nwbVar2;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(e8d e8dVar, tp4 tp4Var) {
        int i = this.E;
        nwb nwbVar = this.G;
        nwb nwbVar2 = this.F;
        switch (i) {
            case 0:
                return x4h.f(e8dVar, null, new mj2(nwbVar2, nwbVar, 0), null, null, tp4Var, 13);
            default:
                return pok.f(e8dVar, new yc9(nwbVar2, nwbVar, null), tp4Var);
        }
    }
}
