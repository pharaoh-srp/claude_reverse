package defpackage;

import com.anthropic.claude.bell.api.BellApiClientMessage;

/* JADX INFO: loaded from: classes2.dex */
public final class kn1 extends xzg implements pz7 {
    public int E;
    public final /* synthetic */ tn1 F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kn1(tn1 tn1Var, tp4 tp4Var) {
        super(2, tp4Var);
        this.F = tn1Var;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        return new kn1(this.F, tp4Var);
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        return ((kn1) create((l45) obj, (tp4) obj2)).invokeSuspend(iei.a);
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        tn1 tn1Var = this.F;
        ej1 ej1Var = tn1Var.s;
        int i = this.E;
        if (i == 0) {
            sf5.h0(obj);
            this.E = 1;
            Object objU = tn1Var.u(this);
            m45 m45Var = m45.E;
            if (objU == m45Var) {
                return m45Var;
            }
        } else {
            if (i != 1) {
                sz6.j("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            sf5.h0(obj);
        }
        ej1Var.b(BellApiClientMessage.Interrupt.INSTANCE);
        ej1Var.b(new BellApiClientMessage.PauseEndpointing((BellApiClientMessage.PauseEndpointing.Data) null, 1, (mq5) null));
        return iei.a;
    }
}
