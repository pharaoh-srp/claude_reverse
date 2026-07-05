package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class z40 extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public int F;
    public /* synthetic */ Object G;
    public final /* synthetic */ pz7[] H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z40(pz7[] pz7VarArr, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.H = pz7VarArr;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        int i = this.E;
        pz7[] pz7VarArr = this.H;
        switch (i) {
            case 0:
                z40 z40Var = new z40(pz7VarArr, tp4Var, 0);
                z40Var.G = obj;
                return z40Var;
            default:
                z40 z40Var2 = new z40(pz7VarArr, tp4Var, 1);
                z40Var2.G = obj;
                return z40Var2;
        }
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        l45 l45Var = (l45) obj;
        tp4 tp4Var = (tp4) obj2;
        switch (i) {
        }
        return ((z40) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        int i2 = 0;
        pz7[] pz7VarArr = this.H;
        m45 m45Var = m45.E;
        switch (i) {
            case 0:
                int i3 = this.F;
                if (i3 == 0) {
                    sf5.h0(obj);
                    l45 l45Var = (l45) this.G;
                    ArrayList arrayList = new ArrayList(pz7VarArr.length);
                    int length = pz7VarArr.length;
                    while (i2 < length) {
                        arrayList.add(gb9.D(l45Var, null, null, pz7VarArr[i2], 3));
                        i2++;
                    }
                    this.F = 1;
                    if (nvk.s(arrayList, this) == m45Var) {
                    }
                } else if (i3 != 1) {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    sf5.h0(obj);
                }
                break;
            default:
                int i4 = this.F;
                if (i4 == 0) {
                    sf5.h0(obj);
                    l45 l45Var2 = (l45) this.G;
                    ArrayList arrayList2 = new ArrayList(pz7VarArr.length);
                    int length2 = pz7VarArr.length;
                    while (i2 < length2) {
                        arrayList2.add(gb9.D(l45Var2, null, null, pz7VarArr[i2], 3));
                        i2++;
                    }
                    this.F = 1;
                    if (nvk.s(arrayList2, this) == m45Var) {
                    }
                } else if (i4 != 1) {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    sf5.h0(obj);
                }
                break;
        }
        return m45Var;
    }
}
