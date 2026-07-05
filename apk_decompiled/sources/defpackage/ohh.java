package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* JADX INFO: loaded from: classes.dex */
public final class ohh implements PointerInputEventHandler {
    public final /* synthetic */ l45 E;
    public final /* synthetic */ nwb F;
    public final /* synthetic */ zub G;
    public final /* synthetic */ nwb H;

    public ohh(l45 l45Var, nwb nwbVar, zub zubVar, nwb nwbVar2) {
        this.E = l45Var;
        this.F = nwbVar;
        this.G = zubVar;
        this.H = nwbVar2;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(e8d e8dVar, tp4 tp4Var) {
        Object objE = x4h.e(e8dVar, new nhh(this.E, this.F, this.G, null), new shf(7, this.H), tp4Var);
        return objE == m45.E ? objE : iei.a;
    }
}
