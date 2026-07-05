package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* JADX INFO: loaded from: classes.dex */
public final class a20 implements PointerInputEventHandler {
    public final /* synthetic */ int E;
    public final /* synthetic */ Object F;

    public /* synthetic */ a20(int i, Object obj) {
        this.E = i;
        this.F = obj;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(e8d e8dVar, tp4 tp4Var) {
        int i = this.E;
        tp4 tp4Var2 = null;
        iei ieiVar = iei.a;
        m45 m45Var = m45.E;
        Object obj = this.F;
        switch (i) {
            case 0:
                Object objF = pok.f(e8dVar, new z10((b20) obj, tp4Var2, 0), tp4Var);
                return objF == m45Var ? objF : ieiVar;
            case 1:
                Object objF2 = pok.f(e8dVar, new ug1((sug) obj, tp4Var2, 6), tp4Var);
                return objF2 == m45Var ? objF2 : ieiVar;
            case 2:
                Object objN = fd9.N(new zn((vfh) obj, e8dVar, tp4Var2, 29), tp4Var);
                return objN == m45Var ? objN : ieiVar;
            default:
                zhh zhhVar = (zhh) obj;
                Object objE = vkc.e(e8dVar, zhhVar.B, zhhVar.A, tp4Var);
                return objE == m45Var ? objE : ieiVar;
        }
    }
}
