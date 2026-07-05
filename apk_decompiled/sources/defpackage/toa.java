package defpackage;

import com.anthropic.claude.types.strings.AccountId;
import com.anthropic.claude.types.strings.OrganizationId;

/* JADX INFO: loaded from: classes3.dex */
public final class toa extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public /* synthetic */ Object F;
    public final /* synthetic */ rz7 G;
    public final /* synthetic */ zy7 H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ toa(rz7 rz7Var, zy7 zy7Var, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.G = rz7Var;
        this.H = zy7Var;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        switch (this.E) {
            case 0:
                toa toaVar = new toa(this.G, this.H, tp4Var, 0);
                toaVar.F = obj;
                return toaVar;
            default:
                toa toaVar2 = new toa(this.G, this.H, tp4Var, 1);
                toaVar2.F = obj;
                return toaVar2;
        }
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        switch (i) {
            case 0:
                ((toa) create((soa) obj, (tp4) obj2)).invokeSuspend(ieiVar);
                break;
            default:
                ((toa) create((epa) obj, (tp4) obj2)).invokeSuspend(ieiVar);
                break;
        }
        return ieiVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        zy7 zy7Var = this.H;
        rz7 rz7Var = this.G;
        Object obj2 = this.F;
        switch (i) {
            case 0:
                soa soaVar = (soa) obj2;
                sf5.h0(obj);
                if (soaVar instanceof roa) {
                    roa roaVar = (roa) soaVar;
                    rz7Var.invoke(AccountId.m943boximpl(roaVar.a), OrganizationId.m1065boximpl(roaVar.b), roaVar.c);
                } else if (!(soaVar instanceof qoa)) {
                    wg6.i();
                } else {
                    zy7Var.a();
                }
                break;
            default:
                epa epaVar = (epa) obj2;
                sf5.h0(obj);
                if (epaVar instanceof dpa) {
                    dpa dpaVar = (dpa) epaVar;
                    rz7Var.invoke(AccountId.m943boximpl(dpaVar.a), OrganizationId.m1065boximpl(dpaVar.b), dpaVar.c);
                } else if (!(epaVar instanceof cpa)) {
                    wg6.i();
                } else {
                    zy7Var.a();
                }
                break;
        }
        return null;
    }
}
