package defpackage;

import com.anthropic.claude.api.chat.messages.ApiHelpline;

/* JADX INFO: loaded from: classes2.dex */
public final class jm2 extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public /* synthetic */ Object F;
    public final /* synthetic */ dae G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jm2(dae daeVar, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.G = daeVar;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        int i = this.E;
        dae daeVar = this.G;
        switch (i) {
            case 0:
                jm2 jm2Var = new jm2(daeVar, tp4Var, 0);
                jm2Var.F = obj;
                return jm2Var;
            case 1:
                jm2 jm2Var2 = new jm2(daeVar, tp4Var, 1);
                jm2Var2.F = obj;
                return jm2Var2;
            case 2:
                jm2 jm2Var3 = new jm2(daeVar, tp4Var, 2);
                jm2Var3.F = obj;
                return jm2Var3;
            default:
                jm2 jm2Var4 = new jm2(daeVar, tp4Var, 3);
                jm2Var4.F = obj;
                return jm2Var4;
        }
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        switch (i) {
            case 0:
                ((jm2) create((im2) obj, (tp4) obj2)).invokeSuspend(ieiVar);
                return ieiVar;
            case 1:
                ((jm2) create((im2) obj, (tp4) obj2)).invokeSuspend(ieiVar);
                return ieiVar;
            case 2:
                return ((jm2) create((mqg) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            default:
                return ((jm2) create((ri4) obj, (tp4) obj2)).invokeSuspend(ieiVar);
        }
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        dae daeVar = this.G;
        Object obj2 = this.F;
        switch (i) {
            case 0:
                sf5.h0(obj);
                daeVar.E = (im2) obj2;
                return ieiVar;
            case 1:
                sf5.h0(obj);
                ApiHelpline apiHelpline = ((im2) obj2).i;
                if (apiHelpline != null) {
                    daeVar.E = apiHelpline;
                }
                return ieiVar;
            case 2:
                mqg mqgVar = (mqg) obj2;
                sf5.h0(obj);
                return Boolean.valueOf((mqgVar == null || mqgVar.equals(daeVar.E)) ? false : true);
            default:
                sf5.h0(obj);
                return Boolean.valueOf(((ri4) obj2).b.equals(daeVar.E));
        }
    }
}
