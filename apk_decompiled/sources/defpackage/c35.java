package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* JADX INFO: loaded from: classes2.dex */
public final class c35 implements PointerInputEventHandler {
    public final /* synthetic */ int E;
    public final /* synthetic */ Object F;
    public final /* synthetic */ Object G;

    public /* synthetic */ c35(Object obj, int i, Object obj2) {
        this.E = i;
        this.F = obj;
        this.G = obj2;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(e8d e8dVar, tp4 tp4Var) {
        int i = this.E;
        iei ieiVar = iei.a;
        m45 m45Var = m45.E;
        Object obj = this.G;
        Object obj2 = this.F;
        switch (i) {
            case 0:
                Object objN = fd9.N(new qq0(e8dVar, (zeh) obj2, (zhh) obj, (tp4) null, 14), tp4Var);
                return objN == m45Var ? objN : ieiVar;
            case 1:
                Object objF = pok.f(e8dVar, new f((String) obj2, (gt0) obj, null, 2), tp4Var);
                return objF == m45Var ? objF : ieiVar;
            case 2:
                return pok.f(e8dVar, new f((l45) obj2, (gkj) obj, null, 4), tp4Var);
            case 3:
                Object objF2 = pok.f(e8dVar, new akj(new lpa((bz7) obj2, 10, (pz7) obj), null), tp4Var);
                if (objF2 != m45Var) {
                    objF2 = ieiVar;
                }
                return objF2 == m45Var ? objF2 : ieiVar;
            case 4:
                Object objE = vkc.e(e8dVar, (hw1) obj2, (zhf) obj, tp4Var);
                return objE == m45Var ? objE : ieiVar;
            case 5:
                Object objF3 = pok.f(e8dVar, new f((mif) obj2, (rhf) obj, null, 7), tp4Var);
                return objF3 == m45Var ? objF3 : ieiVar;
            default:
                Object objN2 = fd9.N(new ba9(e8dVar, (zub) obj2, (mag) obj, null, 23), tp4Var);
                return objN2 == m45Var ? objN2 : ieiVar;
        }
    }
}
