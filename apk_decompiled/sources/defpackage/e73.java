package defpackage;

import com.anthropic.claude.analytics.events.ChatEvents$ModelSelectorSheetSource;
import com.anthropic.claude.api.tasks.TaskResponse;
import com.anthropic.claude.chat.bottomsheet.model.ModelSelectorBottomSheetDestination;
import com.anthropic.claude.tasks.ui.TasksBottomSheetDestination;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e73 implements zy7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ t53 F;
    public final /* synthetic */ t4g G;

    public /* synthetic */ e73(t53 t53Var, t4g t4gVar, int i) {
        this.E = i;
        this.F = t53Var;
        this.G = t4gVar;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.E;
        iei ieiVar = iei.a;
        t4g t4gVar = this.G;
        t53 t53Var = this.F;
        switch (i) {
            case 0:
                TaskResponse taskResponse = (TaskResponse) w44.g1((List) t53Var.t1.getValue());
                t4gVar.d(taskResponse != null ? new TasksBottomSheetDestination.TaskDetail(taskResponse.m450getUuidFxcw9s(), null) : TasksBottomSheetDestination.TaskList.INSTANCE);
                break;
            default:
                t53Var.g0.n(ChatEvents$ModelSelectorSheetSource.CHAT_INPUT);
                t4gVar.d(ModelSelectorBottomSheetDestination.SelectModel.INSTANCE);
                break;
        }
        return ieiVar;
    }
}
