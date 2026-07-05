package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* JADX INFO: loaded from: classes2.dex */
public final class ag1 implements PointerInputEventHandler {
    public final /* synthetic */ int E;
    public final /* synthetic */ sih F;

    public /* synthetic */ ag1(sih sihVar, int i) {
        this.E = i;
        this.F = sihVar;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(e8d e8dVar, tp4 tp4Var) {
        int i = this.E;
        m45 m45Var = m45.E;
        sih sihVar = this.F;
        iei ieiVar = iei.a;
        switch (i) {
            case 0:
                sihVar.getClass();
                Object objN = fd9.N(new hih(null, e8dVar, sihVar), tp4Var);
                if (objN != m45Var) {
                    objN = ieiVar;
                }
                return objN == m45Var ? objN : ieiVar;
            case 1:
                sihVar.getClass();
                Object objN2 = fd9.N(new c3b(sihVar, e8dVar, true, null), tp4Var);
                if (objN2 != m45Var) {
                    objN2 = ieiVar;
                }
                return objN2 == m45Var ? objN2 : ieiVar;
            default:
                sihVar.getClass();
                Object objN3 = fd9.N(new c3b(sihVar, e8dVar, false, null), tp4Var);
                if (objN3 != m45Var) {
                    objN3 = ieiVar;
                }
                return objN3 == m45Var ? objN3 : ieiVar;
        }
    }
}
