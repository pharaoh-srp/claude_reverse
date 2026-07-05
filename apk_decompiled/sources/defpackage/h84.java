package defpackage;

import com.anthropic.claude.api.chat.messages.CompactionStatus;

/* JADX INFO: loaded from: classes2.dex */
public final class h84 extends xzg implements pz7 {
    public int E;
    public final /* synthetic */ k84 F;
    public final /* synthetic */ a80 G;
    public final /* synthetic */ hsc H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h84(k84 k84Var, a80 a80Var, hsc hscVar, tp4 tp4Var) {
        super(2, tp4Var);
        this.F = k84Var;
        this.G = a80Var;
        this.H = hscVar;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        return new h84(this.F, this.G, this.H, tp4Var);
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        return ((h84) create((l45) obj, (tp4) obj2)).invokeSuspend(iei.a);
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        int i = this.E;
        if (i == 0) {
            sf5.h0(obj);
            k84 k84Var = this.F;
            if ((k84Var != null ? k84Var.a : null) != CompactionStatus.Status.COMPLETE) {
                Float f = new Float(this.H.h());
                z8i z8iVarN = kxk.N(150, 0, wi6.d, 2);
                this.E = 1;
                Object objC = a80.c(this.G, f, z8iVarN, null, this, 12);
                m45 m45Var = m45.E;
                if (objC == m45Var) {
                    return m45Var;
                }
            }
        } else {
            if (i != 1) {
                sz6.j("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            sf5.h0(obj);
        }
        return iei.a;
    }
}
