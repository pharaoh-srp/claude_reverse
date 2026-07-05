package defpackage;

import com.anthropic.claude.api.tasks.TaskResponse;

/* JADX INFO: loaded from: classes3.dex */
public final class u9h extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public int F;
    public /* synthetic */ Object G;
    public final /* synthetic */ l5h H;
    public final /* synthetic */ TaskResponse I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u9h(l5h l5hVar, TaskResponse taskResponse, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.H = l5hVar;
        this.I = taskResponse;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        int i = this.E;
        TaskResponse taskResponse = this.I;
        l5h l5hVar = this.H;
        switch (i) {
            case 0:
                u9h u9hVar = new u9h(l5hVar, taskResponse, tp4Var, 0);
                u9hVar.G = obj;
                return u9hVar;
            default:
                u9h u9hVar2 = new u9h(l5hVar, taskResponse, tp4Var, 1);
                u9hVar2.G = obj;
                return u9hVar2;
        }
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        String str = (String) obj;
        tp4 tp4Var = (tp4) obj2;
        switch (i) {
        }
        return ((u9h) create(str, tp4Var)).invokeSuspend(ieiVar);
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        int i = this.E;
        TaskResponse taskResponse = this.I;
        l5h l5hVar = this.H;
        m45 m45Var = m45.E;
        switch (i) {
            case 0:
                String str = (String) this.G;
                int i2 = this.F;
                if (i2 == 0) {
                    sf5.h0(obj);
                    String strM450getUuidFxcw9s = taskResponse.m450getUuidFxcw9s();
                    this.G = null;
                    this.F = 1;
                    Object objO = l5hVar.O(strM450getUuidFxcw9s, str, this);
                    if (objO == m45Var) {
                    }
                } else if (i2 != 1) {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    sf5.h0(obj);
                }
                break;
            default:
                String str2 = (String) this.G;
                int i3 = this.F;
                if (i3 == 0) {
                    sf5.h0(obj);
                    String strM450getUuidFxcw9s2 = taskResponse.m450getUuidFxcw9s();
                    this.G = null;
                    this.F = 1;
                    Object objO2 = l5hVar.O(strM450getUuidFxcw9s2, str2, this);
                    if (objO2 == m45Var) {
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
