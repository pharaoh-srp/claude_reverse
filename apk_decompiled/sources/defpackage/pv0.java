package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* JADX INFO: loaded from: classes3.dex */
public final class pv0 implements PointerInputEventHandler {
    public final /* synthetic */ int E;
    public final /* synthetic */ nwb F;
    public final /* synthetic */ hsc G;
    public final /* synthetic */ bz7 H;
    public final /* synthetic */ kdg I;
    public final /* synthetic */ isc J;

    public pv0(int i, nwb nwbVar, hsc hscVar, bz7 bz7Var, kdg kdgVar, isc iscVar) {
        this.E = i;
        this.F = nwbVar;
        this.G = hscVar;
        this.H = bz7Var;
        this.I = kdgVar;
        this.J = iscVar;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(e8d e8dVar, tp4 tp4Var) {
        int i = this.E;
        nwb nwbVar = this.F;
        hsc hscVar = this.G;
        ov0 ov0Var = new ov0(i, nwbVar, hscVar, 0);
        bz7 bz7Var = this.H;
        kdg kdgVar = this.I;
        return nc6.e(e8dVar, ov0Var, new he(3, nwbVar, bz7Var, kdgVar, hscVar), new k6(nwbVar, 17, hscVar), new uo(this.J, e8dVar, kdgVar, hscVar, nwbVar, 4), tp4Var);
    }
}
