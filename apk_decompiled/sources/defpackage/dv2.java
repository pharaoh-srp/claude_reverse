package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* JADX INFO: loaded from: classes.dex */
public final class dv2 implements PointerInputEventHandler {
    public final /* synthetic */ on8 E;
    public final /* synthetic */ pn8 F;
    public final /* synthetic */ nwb G;

    public dv2(on8 on8Var, pn8 pn8Var, nwb nwbVar) {
        this.E = on8Var;
        this.F = pn8Var;
        this.G = nwbVar;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(e8d e8dVar, tp4 tp4Var) {
        return pok.f(e8dVar, new cv2(this.E, this.F, this.G, null, 0), tp4Var);
    }
}
