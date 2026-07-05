package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ml9 extends ts9 implements zy7 {
    public final /* synthetic */ int F;
    public final /* synthetic */ ol9 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ml9(ol9 ol9Var, int i) {
        super(0);
        this.F = i;
        this.G = ol9Var;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i;
        int i2 = this.F;
        int i3 = 0;
        ol9 ol9Var = this.G;
        switch (i2) {
            case 0:
                int size = (ol9Var.isSuspend() ? 1 : 0) + ol9Var.getParameters().size();
                int size2 = (ol9Var.getParameters().size() + 31) / 32;
                Object[] objArr = new Object[size + size2 + 1];
                for (in9 in9Var : ol9Var.getParameters()) {
                    if (in9Var.m()) {
                        fo9 fo9VarL = in9Var.l();
                        ww7 ww7Var = vpi.a;
                        yr9 yr9Var = fo9VarL.E;
                        if (yr9Var == null || !g39.b(yr9Var)) {
                            objArr[in9Var.i()] = vpi.e(skk.i(in9Var.l()));
                        }
                    }
                    if (in9Var.o()) {
                        objArr[in9Var.i()] = ol9.p(in9Var.l());
                    }
                }
                for (int i4 = 0; i4 < size2; i4++) {
                    objArr[size + i4] = 0;
                }
                return objArr;
            case 1:
                return vpi.d(ol9Var.t());
            case 2:
                e92 e92VarT = ol9Var.t();
                ArrayList arrayList = new ArrayList();
                if (ol9Var.v()) {
                    i = 0;
                } else {
                    l6e l6eVarG = vpi.g(e92VarT);
                    if (l6eVarG != null) {
                        arrayList.add(new in9(ol9Var, 0, gn9.E, new nl9(l6eVarG, 0)));
                        i = 1;
                    } else {
                        i = 0;
                    }
                    l6e l6eVarS = e92VarT.S();
                    if (l6eVarS != null) {
                        arrayList.add(new in9(ol9Var, i, gn9.F, new nl9(l6eVarS, 1)));
                        i++;
                    }
                }
                int size3 = e92VarT.I().size();
                while (i3 < size3) {
                    arrayList.add(new in9(ol9Var, i, gn9.G, new zf5(i3, e92VarT)));
                    i3++;
                    i++;
                }
                if (ol9Var.u() && (e92VarT instanceof ud9) && arrayList.size() > 1) {
                    a54.s0(arrayList, new g67(11));
                }
                arrayList.trimToSize();
                return arrayList;
            case 3:
                yr9 returnType = ol9Var.t().getReturnType();
                returnType.getClass();
                return new fo9(returnType, new v01(19, ol9Var));
            default:
                List typeParameters = ol9Var.t().getTypeParameters();
                typeParameters.getClass();
                List<qai> list = typeParameters;
                ArrayList arrayList2 = new ArrayList(x44.y(list, 10));
                for (qai qaiVar : list) {
                    qaiVar.getClass();
                    arrayList2.add(new go9(ol9Var, qaiVar));
                }
                return arrayList2;
        }
    }
}
