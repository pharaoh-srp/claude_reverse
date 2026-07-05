package defpackage;

import com.anthropic.claude.code.ui.SessionInputData;

/* JADX INFO: loaded from: classes2.dex */
public final class lsf extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ psf F;
    public final /* synthetic */ String G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lsf(psf psfVar, String str, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.F = psfVar;
        this.G = str;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        int i = this.E;
        String str = this.G;
        psf psfVar = this.F;
        switch (i) {
            case 0:
                return new lsf(psfVar, str, tp4Var, 0);
            default:
                return new lsf(psfVar, str, tp4Var, 1);
        }
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        l45 l45Var = (l45) obj;
        tp4 tp4Var = (tp4) obj2;
        switch (i) {
            case 0:
                return ((lsf) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
            default:
                ((lsf) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
                return ieiVar;
        }
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        int i = this.E;
        String str = this.G;
        psf psfVar = this.F;
        switch (i) {
            case 0:
                sf5.h0(obj);
                return psf.a(psfVar, str);
            default:
                sf5.h0(obj);
                amg amgVarC = psfVar.c(str);
                SessionInputData sessionInputDataA = psf.a(psfVar, str);
                if (sessionInputDataA != null) {
                    amgVarC.n(null, new qsf(sessionInputDataA.getInputText(), sessionInputDataA.getComments(), sessionInputDataA.getPendingAskUserQuestionSelections(), sessionInputDataA.getSubmittedAskUserQuestionAnswers()));
                }
                return iei.a;
        }
    }
}
