package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* JADX INFO: loaded from: classes3.dex */
public final class u6e implements PointerInputEventHandler {
    public final /* synthetic */ boolean E;
    public final /* synthetic */ boolean F;
    public final /* synthetic */ bz7 G;
    public final /* synthetic */ String H;
    public final /* synthetic */ isc I;

    public u6e(boolean z, boolean z2, bz7 bz7Var, String str, isc iscVar) {
        this.E = z;
        this.F = z2;
        this.G = bz7Var;
        this.H = str;
        this.I = iscVar;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(e8d e8dVar, tp4 tp4Var) {
        return x4h.f(e8dVar, null, null, null, new rb2(e8dVar, this.E, this.F, this.G, this.H, this.I), tp4Var, 7);
    }
}
