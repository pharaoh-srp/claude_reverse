package defpackage;

import com.anthropic.claude.analytics.events.UpdateEvents$FlexibleUpdateShown;
import com.anthropic.claude.types.strings.OrganizationId;

/* JADX INFO: loaded from: classes.dex */
public final class qt9 extends xzg implements pz7 {
    public final /* synthetic */ int E = 1;
    public /* synthetic */ Object F;
    public final /* synthetic */ Object G;
    public final /* synthetic */ Object H;
    public final /* synthetic */ Object I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qt9(qi3 qi3Var, oke okeVar, xpa xpaVar, nwb nwbVar, tp4 tp4Var) {
        super(2, tp4Var);
        this.F = qi3Var;
        this.G = okeVar;
        this.H = xpaVar;
        this.I = nwbVar;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        int i = this.E;
        Object obj2 = this.I;
        Object obj3 = this.H;
        Object obj4 = this.G;
        switch (i) {
            case 0:
                return new qt9((qi3) this.F, (oke) obj4, (xpa) obj3, (nwb) obj2, tp4Var);
            default:
                qt9 qt9Var = new qt9((pz7) obj4, (bz7) obj3, (zy7) obj2, tp4Var);
                qt9Var.F = obj;
                return qt9Var;
        }
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        switch (i) {
            case 0:
                ((qt9) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
                break;
            default:
                ((qt9) create((jca) obj, (tp4) obj2)).invokeSuspend(ieiVar);
                break;
        }
        return ieiVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        Object obj2 = this.I;
        Object obj3 = this.H;
        Object obj4 = this.G;
        switch (i) {
            case 0:
                sf5.h0(obj);
                do7 do7Var = (do7) ((nwb) obj2).getValue();
                if (do7Var instanceof yn7) {
                    yn7 yn7Var = (yn7) do7Var;
                    ((qi3) this.F).e(new UpdateEvents$FlexibleUpdateShown(yn7Var.b), iv1.J(jce.b(UpdateEvents$FlexibleUpdateShown.class)));
                    ((oke) obj4).d();
                    dfk.b(yn7Var.a, (xpa) obj3, t5l.a(0).a());
                }
                return ieiVar;
            default:
                jca jcaVar = (jca) this.F;
                sf5.h0(obj);
                if (jcaVar instanceof ica) {
                    ica icaVar = (ica) jcaVar;
                    ((pz7) obj4).invoke(OrganizationId.m1065boximpl(icaVar.a), icaVar.b);
                    return ieiVar;
                }
                if (jcaVar instanceof hca) {
                    ((bz7) obj3).invoke(OrganizationId.m1065boximpl(((hca) jcaVar).a()));
                    return ieiVar;
                }
                if (jcaVar instanceof gca) {
                    ((zy7) obj2).a();
                    return ieiVar;
                }
                mr9.b();
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qt9(pz7 pz7Var, bz7 bz7Var, zy7 zy7Var, tp4 tp4Var) {
        super(2, tp4Var);
        this.G = pz7Var;
        this.H = bz7Var;
        this.I = zy7Var;
    }
}
