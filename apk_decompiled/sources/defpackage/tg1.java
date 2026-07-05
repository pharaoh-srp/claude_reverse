package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* JADX INFO: loaded from: classes2.dex */
public final class tg1 implements PointerInputEventHandler {
    public final /* synthetic */ int E;
    public final /* synthetic */ l2i F;

    public /* synthetic */ tg1(l2i l2iVar, int i) {
        this.E = i;
        this.F = l2iVar;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(e8d e8dVar, tp4 tp4Var) {
        int i = this.E;
        iei ieiVar = iei.a;
        m45 m45Var = m45.E;
        tp4 tp4Var2 = null;
        l2i l2iVar = this.F;
        switch (i) {
            case 0:
                Object objN = fd9.N(new sg1(e8dVar, l2iVar, tp4Var2, 0), tp4Var);
                return objN == m45Var ? objN : ieiVar;
            default:
                Object objN2 = fd9.N(new sg1(e8dVar, l2iVar, tp4Var2, 1), tp4Var);
                return objN2 == m45Var ? objN2 : ieiVar;
        }
    }
}
