package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class zzg implements PointerInputEventHandler, zz7 {
    public final /* synthetic */ pz7 E;

    public zzg(pz7 pz7Var) {
        this.E = pz7Var;
    }

    @Override // defpackage.zz7
    public final qz7 d() {
        return this.E;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof PointerInputEventHandler) || !(obj instanceof zz7)) {
            return false;
        }
        return x44.r(this.E, ((zz7) obj).d());
    }

    public final int hashCode() {
        return this.E.hashCode();
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final /* synthetic */ Object invoke(e8d e8dVar, tp4 tp4Var) {
        return this.E.invoke(e8dVar, tp4Var);
    }
}
