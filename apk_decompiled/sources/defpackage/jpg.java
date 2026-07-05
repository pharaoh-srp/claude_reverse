package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class jpg extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ lpg F;
    public final /* synthetic */ pl9 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jpg(lpg lpgVar, pl9 pl9Var, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.F = lpgVar;
        this.G = pl9Var;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        int i = this.E;
        pl9 pl9Var = this.G;
        lpg lpgVar = this.F;
        switch (i) {
            case 0:
                tp4Var.getClass();
                return new jpg(lpgVar, pl9Var, tp4Var, 0);
            default:
                tp4Var.getClass();
                return new jpg(lpgVar, pl9Var, tp4Var, 1);
        }
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        switch (i) {
        }
        return ((jpg) create(obj, (tp4) obj2)).invokeSuspend(ieiVar);
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        int i = this.E;
        pl9 pl9Var = this.G;
        lpg lpgVar = this.F;
        switch (i) {
            case 0:
                sf5.h0(obj);
                ArrayList arrayList = lpgVar.a;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : arrayList) {
                    if (jce.a.b(((epg) obj2).a.getClass()).equals(pl9Var)) {
                        arrayList2.add(obj2);
                    }
                }
                return arrayList2;
            default:
                sf5.h0(obj);
                ArrayList arrayList3 = lpgVar.b;
                ArrayList arrayList4 = new ArrayList();
                for (Object obj3 : arrayList3) {
                    if (x44.r(((fpg) obj3).d, pl9Var)) {
                        arrayList4.add(obj3);
                    }
                }
                return arrayList4;
        }
    }
}
