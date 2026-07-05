package defpackage;

import com.anthropic.claude.api.tasks.TaskResponse;
import com.anthropic.claude.types.strings.TaskId;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class p9h implements bz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ pz7 F;
    public final /* synthetic */ TaskResponse G;

    public /* synthetic */ p9h(pz7 pz7Var, TaskResponse taskResponse, int i) {
        this.E = i;
        this.F = pz7Var;
        this.G = taskResponse;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        TaskResponse taskResponse = this.G;
        pz7 pz7Var = this.F;
        String str = (String) obj;
        switch (i) {
            case 0:
                str.getClass();
                pz7Var.invoke(str, TaskId.m1128boximpl(taskResponse.m450getUuidFxcw9s()));
                break;
            default:
                str.getClass();
                pz7Var.invoke(str, TaskId.m1128boximpl(taskResponse.m450getUuidFxcw9s()));
                break;
        }
        return ieiVar;
    }
}
