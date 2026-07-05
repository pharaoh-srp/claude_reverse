package defpackage;

import com.anthropic.claude.api.tasks.TaskResponse;
import com.anthropic.claude.types.strings.ChatId;
import com.anthropic.claude.types.strings.TaskId;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class r9h implements zy7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ bz7 F;
    public final /* synthetic */ TaskResponse G;

    public /* synthetic */ r9h(bz7 bz7Var, TaskResponse taskResponse, int i) {
        this.E = i;
        this.F = bz7Var;
        this.G = taskResponse;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.E;
        iei ieiVar = iei.a;
        TaskResponse taskResponse = this.G;
        bz7 bz7Var = this.F;
        switch (i) {
            case 0:
                bz7Var.invoke(TaskId.m1128boximpl(taskResponse.m450getUuidFxcw9s()));
                break;
            default:
                bz7Var.invoke(ChatId.m978boximpl(taskResponse.m449getConversation_uuidRjYBDck()));
                break;
        }
        return ieiVar;
    }
}
