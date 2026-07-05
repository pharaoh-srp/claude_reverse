package defpackage;

import android.content.Context;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class i30 extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ Object F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i30(Object obj, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.F = obj;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        int i = this.E;
        Object obj2 = this.F;
        switch (i) {
            case 0:
                return new i30((l4) obj2, tp4Var, 0);
            case 1:
                return new i30((t53) obj2, tp4Var, 1);
            case 2:
                return new i30((hi4) obj2, tp4Var, 2);
            case 3:
                return new i30((fca) obj2, tp4Var, 3);
            case 4:
                return new i30((hj) obj2, tp4Var, 4);
            case 5:
                return new i30((Context) obj2, tp4Var, 5);
            case 6:
                return new i30((md9) obj2, tp4Var, 6);
            default:
                tp4Var.getClass();
                return new i30((lpg) obj2, tp4Var, 7);
        }
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        switch (i) {
            case 0:
                ((i30) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
                break;
            case 1:
                ((i30) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
                break;
            case 2:
                ((i30) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
                break;
            case 3:
                ((i30) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
                break;
            case 4:
                ((i30) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
                break;
            case 5:
                break;
            case 6:
                ((i30) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
                break;
            default:
                ((i30) create(obj, (tp4) obj2)).invokeSuspend(ieiVar);
                break;
        }
        return ieiVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        fkg fkgVar;
        int i = this.E;
        iei ieiVar = iei.a;
        Object obj2 = this.F;
        switch (i) {
            case 0:
                sf5.h0(obj);
                ((l4) obj2).a();
                break;
            case 1:
                sf5.h0(obj);
                t53 t53Var = (t53) obj2;
                t53Var.c2.setValue(Boolean.valueOf(mwa.s(t53Var.c)));
                break;
            case 2:
                sf5.h0(obj);
                hi4 hi4Var = (hi4) obj2;
                fkg fkgVar2 = hi4Var.d;
                if ((fkgVar2 == null || !fkgVar2.c()) && ((fkgVar = hi4Var.e) == null || !fkgVar.c())) {
                    hi4Var.a.b();
                }
                break;
            case 3:
                sf5.h0(obj);
                ((fca) obj2).R();
                break;
            case 4:
                sf5.h0(obj);
                ((hj) obj2).d();
                break;
            case 5:
                sf5.h0(obj);
                break;
            case 6:
                sf5.h0(obj);
                ((md9) obj2).k.setValue(Boolean.FALSE);
                Iterator it = xah.a.iterator();
                while (it.hasNext()) {
                    ((fch) it.next()).a();
                }
                break;
            default:
                sf5.h0(obj);
                b54.w0(lxe.K, ((lpg) obj2).b);
                break;
        }
        return ieiVar;
    }
}
