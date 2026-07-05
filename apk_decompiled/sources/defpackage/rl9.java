package defpackage;

import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: loaded from: classes.dex */
public final class rl9 extends ts9 implements zy7 {
    public final /* synthetic */ int F;
    public final /* synthetic */ ul9 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rl9(ul9 ul9Var, int i) {
        super(0);
        this.F = i;
        this.G = ul9Var;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.F;
        ul9 ul9Var = this.G;
        switch (i) {
            case 0:
                ece eceVar = ul9Var.j;
                wn9[] wn9VarArr = ul9.l;
                wn9 wn9Var = wn9VarArr[14];
                Object objA = eceVar.a();
                objA.getClass();
                ece eceVar2 = ul9Var.k;
                wn9 wn9Var2 = wn9VarArr[15];
                Object objA2 = eceVar2.a();
                objA2.getClass();
                return w44.a1((Collection) objA, (Collection) objA2);
            case 1:
                ece eceVar3 = ul9Var.f;
                wn9[] wn9VarArr2 = ul9.l;
                wn9 wn9Var3 = wn9VarArr2[10];
                Object objA3 = eceVar3.a();
                objA3.getClass();
                ece eceVar4 = ul9Var.h;
                wn9 wn9Var4 = wn9VarArr2[12];
                Object objA4 = eceVar4.a();
                objA4.getClass();
                return w44.a1((Collection) objA3, (Collection) objA4);
            case 2:
                ece eceVar5 = ul9Var.g;
                wn9[] wn9VarArr3 = ul9.l;
                wn9 wn9Var5 = wn9VarArr3[11];
                Object objA5 = eceVar5.a();
                objA5.getClass();
                ece eceVar6 = ul9Var.i;
                wn9 wn9Var6 = wn9VarArr3[13];
                Object objA6 = eceVar6.a();
                objA6.getClass();
                return w44.a1((Collection) objA5, (Collection) objA6);
            case 3:
                return vpi.d(ul9Var.a());
            case 4:
                ece eceVar7 = ul9Var.f;
                wn9[] wn9VarArr4 = ul9.l;
                wn9 wn9Var7 = wn9VarArr4[10];
                Object objA7 = eceVar7.a();
                objA7.getClass();
                ece eceVar8 = ul9Var.g;
                wn9 wn9Var8 = wn9VarArr4[11];
                Object objA8 = eceVar8.a();
                objA8.getClass();
                return w44.a1((Collection) objA7, (Collection) objA8);
            case 5:
                fab fabVarK0 = ul9Var.a().k0();
                fabVarK0.getClass();
                Collection collectionP = cok.p(fabVarK0, null, 3);
                ArrayList<bo5> arrayList = new ArrayList();
                for (Object obj : collectionP) {
                    if (!m06.m((bo5) obj)) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                for (bo5 bo5Var : arrayList) {
                    qqb qqbVar = bo5Var instanceof qqb ? (qqb) bo5Var : null;
                    Class clsJ = qqbVar != null ? vpi.j(qqbVar) : null;
                    xl9 xl9Var = clsJ != null ? new xl9(clsJ) : null;
                    if (xl9Var != null) {
                        arrayList2.add(xl9Var);
                    }
                }
                return arrayList2;
            default:
                Collection<qqb> collectionO = ul9Var.a().O();
                collectionO.getClass();
                ArrayList arrayList3 = new ArrayList();
                for (qqb qqbVar2 : collectionO) {
                    qqbVar2.getClass();
                    Class clsJ2 = vpi.j(qqbVar2);
                    xl9 xl9Var2 = clsJ2 != null ? new xl9(clsJ2) : null;
                    if (xl9Var2 != null) {
                        arrayList3.add(xl9Var2);
                    }
                }
                return arrayList3;
        }
    }
}
