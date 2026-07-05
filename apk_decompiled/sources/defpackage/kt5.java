package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* JADX INFO: loaded from: classes.dex */
public final class kt5 implements PointerInputEventHandler {
    public static final kt5 F = new kt5(0);
    public static final kt5 G = new kt5(1);
    public static final kt5 H = new kt5(2);
    public static final kt5 I = new kt5(3);
    public static final kt5 J = new kt5(4);
    public final /* synthetic */ int E;

    public /* synthetic */ kt5(int i) {
        this.E = i;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(e8d e8dVar, tp4 tp4Var) {
        int i = this.E;
        iei ieiVar = iei.a;
        switch (i) {
            case 1:
                Object objP1 = ((e0h) e8dVar).p1(new mf4(), tp4Var);
                if (objP1 == m45.E) {
                }
                break;
        }
        return x4h.f(e8dVar, null, null, null, new r2i(10), tp4Var, 7);
    }
}
