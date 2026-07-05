package defpackage;

import com.anthropic.claude.tasks.ui.TasksBottomSheetDestination;
import com.anthropic.claude.types.strings.TaskId;

/* JADX INFO: loaded from: classes.dex */
public final class l83 implements bz7 {
    public final /* synthetic */ t4g E;

    public l83(t4g t4gVar) {
        this.E = t4gVar;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        String strM1134unboximpl = ((TaskId) obj).m1134unboximpl();
        strM1134unboximpl.getClass();
        this.E.d(new TasksBottomSheetDestination.TaskDetail(strM1134unboximpl, null));
        return iei.a;
    }
}
