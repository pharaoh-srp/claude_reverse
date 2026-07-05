package defpackage;

import com.anthropic.claude.api.experience.Experience;

/* JADX INFO: loaded from: classes2.dex */
public final class r53 extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public int F;
    public final /* synthetic */ t53 G;
    public final /* synthetic */ Experience H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r53(t53 t53Var, Experience experience, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.G = t53Var;
        this.H = experience;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        int i = this.E;
        Experience experience = this.H;
        t53 t53Var = this.G;
        switch (i) {
            case 0:
                return new r53(t53Var, experience, tp4Var, 0);
            default:
                return new r53(t53Var, experience, tp4Var, 1);
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
        return ((r53) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        Experience experience = this.H;
        t53 t53Var = this.G;
        m45 m45Var = m45.E;
        switch (i) {
            case 0:
                int i2 = this.F;
                if (i2 == 0) {
                    sf5.h0(obj);
                    x97 x97Var = t53Var.K;
                    String id = experience.getId();
                    this.F = 1;
                    if (x97Var.f(x97Var.m, "android-chat-input-banner", id, this) == m45Var) {
                    }
                } else if (i2 != 1) {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    sf5.h0(obj);
                }
                break;
            default:
                int i3 = this.F;
                if (i3 == 0) {
                    sf5.h0(obj);
                    x97 x97Var2 = t53Var.K;
                    String id2 = experience.getId();
                    this.F = 1;
                    if (x97.j(x97Var2, id2, this) == m45Var) {
                    }
                } else if (i3 != 1) {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    sf5.h0(obj);
                }
                break;
        }
        return m45Var;
    }
}
