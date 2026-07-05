package defpackage;

import com.anthropic.claude.api.tasks.TaskResponse;
import com.anthropic.claude.tasks.ui.TasksBottomSheetDestination;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class q9h implements zy7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ t4g F;
    public final /* synthetic */ TaskResponse G;

    public /* synthetic */ q9h(t4g t4gVar, TaskResponse taskResponse, int i) {
        this.E = i;
        this.F = t4gVar;
        this.G = taskResponse;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.E;
        iei ieiVar = iei.a;
        TaskResponse taskResponse = this.G;
        t4g t4gVar = this.F;
        switch (i) {
            case 0:
                t4gVar.d(new TasksBottomSheetDestination.EventInspector(taskResponse.m450getUuidFxcw9s(), null));
                break;
            default:
                t4gVar.d(new TasksBottomSheetDestination.EventInspector(taskResponse.m450getUuidFxcw9s(), null));
                break;
        }
        return ieiVar;
    }
}
