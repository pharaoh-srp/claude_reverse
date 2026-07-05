package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* JADX INFO: loaded from: classes3.dex */
public final class nv0 implements PointerInputEventHandler {
    public final /* synthetic */ int E;
    public final /* synthetic */ nwb F;

    public nv0(int i, nwb nwbVar) {
        this.E = i;
        this.F = nwbVar;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(e8d e8dVar, tp4 tp4Var) {
        return pok.f(e8dVar, new mv0(this.E, null, this.F), tp4Var);
    }
}
