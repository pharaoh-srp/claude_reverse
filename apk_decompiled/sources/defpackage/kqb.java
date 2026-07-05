package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* JADX INFO: loaded from: classes3.dex */
public final class kqb implements PointerInputEventHandler {
    public final /* synthetic */ dui E;
    public final /* synthetic */ pz7 F;
    public final /* synthetic */ bz7 G;

    public kqb(dui duiVar, pz7 pz7Var, bz7 bz7Var) {
        this.E = duiVar;
        this.F = pz7Var;
        this.G = bz7Var;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(e8d e8dVar, tp4 tp4Var) {
        Object objP1 = ((e0h) e8dVar).p1(new ug1(this.E, this.F, this.G, null, 3), tp4Var);
        return objP1 == m45.E ? objP1 : iei.a;
    }
}
