package defpackage;

import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class jqc implements pz7 {
    public final /* synthetic */ int E = 0;
    public final /* synthetic */ Object F;
    public final /* synthetic */ Object G;
    public final /* synthetic */ Serializable H;
    public final /* synthetic */ Serializable I;
    public final /* synthetic */ Object J;
    public final /* synthetic */ Object K;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object M;
    public final /* synthetic */ Object N;
    public final /* synthetic */ Object O;

    public /* synthetic */ jqc(bae baeVar, bae baeVar2, bae baeVar3, bae baeVar4, eqc[] eqcVarArr, ArrayList arrayList, z9e z9eVar, bae baeVar5, z9e z9eVar2, bae baeVar6) {
        this.F = baeVar;
        this.G = baeVar2;
        this.H = baeVar3;
        this.I = baeVar4;
        this.L = eqcVarArr;
        this.M = arrayList;
        this.N = z9eVar;
        this.J = baeVar5;
        this.O = z9eVar2;
        this.K = baeVar6;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        Object obj3 = this.O;
        Object obj4 = this.N;
        Object obj5 = this.M;
        Object obj6 = this.L;
        Object obj7 = this.K;
        Object obj8 = this.J;
        Serializable serializable = this.I;
        Serializable serializable2 = this.H;
        Object obj9 = this.G;
        Object obj10 = this.F;
        switch (i) {
            case 0:
                bae baeVar = (bae) obj9;
                bae baeVar2 = (bae) serializable2;
                bae baeVar3 = (bae) serializable;
                eqc[] eqcVarArr = (eqc[]) obj6;
                ArrayList arrayList = (ArrayList) obj5;
                z9e z9eVar = (z9e) obj4;
                bae baeVar4 = (bae) obj8;
                z9e z9eVar2 = (z9e) obj3;
                bae baeVar5 = (bae) obj7;
                int iIntValue = ((Integer) obj).intValue();
                dqc dqcVar = zp3.R;
                dqc dqcVar2 = zp3.S;
                boolean z = ((bae) obj10).E < iIntValue;
                boolean z2 = baeVar.E < iIntValue;
                boolean z3 = baeVar2.E > iIntValue;
                boolean z4 = baeVar3.E > iIntValue;
                if (eqcVarArr[iIntValue].a == 1) {
                    if (z3 || z4) {
                        if (!z && !z2) {
                            z9eVar2.E = true;
                            baeVar5.E = Math.max(baeVar5.E, iIntValue);
                        } else if (!z3) {
                            z9eVar.E = true;
                            baeVar4.E = Math.min(baeVar4.E, iIntValue);
                        } else if (z) {
                            dqcVar = zp3.U;
                        } else {
                            z9eVar2.E = true;
                            baeVar5.E = Math.max(baeVar5.E, iIntValue);
                        }
                        arrayList.set(iIntValue, dqcVar);
                    } else {
                        z9eVar.E = true;
                        baeVar4.E = Math.min(baeVar4.E, iIntValue);
                    }
                    dqcVar = dqcVar2;
                    arrayList.set(iIntValue, dqcVar);
                }
                break;
            default:
                r4g r4gVar = (r4g) obj10;
                z3g z3gVar = (z3g) obj9;
                z4g z4gVar = (z4g) serializable2;
                a5g a5gVar = (a5g) serializable;
                pz7 pz7Var = (pz7) obj8;
                pz7 pz7Var2 = (pz7) obj7;
                pz7 pz7Var3 = (pz7) obj6;
                pz7 pz7Var4 = (pz7) obj5;
                rz7 rz7Var = (rz7) obj4;
                ta4 ta4Var = (ta4) obj3;
                ld4 ld4Var = (ld4) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                e18 e18Var = (e18) ld4Var;
                if (!e18Var.Q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    e18Var.T();
                } else {
                    stj.f(r4gVar, z3gVar.a, z4gVar, a5gVar, pz7Var, pz7Var2, pz7Var3, pz7Var4, rz7Var, ta4Var, e18Var, 8);
                }
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ jqc(r4g r4gVar, z3g z3gVar, z4g z4gVar, a5g a5gVar, pz7 pz7Var, pz7 pz7Var2, pz7 pz7Var3, pz7 pz7Var4, rz7 rz7Var, ta4 ta4Var) {
        this.F = r4gVar;
        this.G = z3gVar;
        this.H = z4gVar;
        this.I = a5gVar;
        this.J = pz7Var;
        this.K = pz7Var2;
        this.L = pz7Var3;
        this.M = pz7Var4;
        this.N = rz7Var;
        this.O = ta4Var;
    }
}
