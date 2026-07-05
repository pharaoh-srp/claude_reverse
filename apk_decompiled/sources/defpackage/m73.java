package defpackage;

import com.anthropic.claude.chat.bottomsheet.model.ModelSelectorBottomSheetDestination;
import com.anthropic.claude.chat.bottomsheet.options.ChatOptionsBottomSheetDestination;
import com.anthropic.claude.core.logging.EmptyDestination;
import com.anthropic.claude.tasks.ui.TasksBottomSheetDestination;

/* JADX INFO: loaded from: classes.dex */
public final class m73 implements zy7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ rwe F;
    public final /* synthetic */ bga G;

    public /* synthetic */ m73(rwe rweVar, EmptyDestination emptyDestination, int i) {
        this.E = i;
        this.F = rweVar;
        this.G = emptyDestination;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.zy7
    public final Object a() {
        int i = this.E;
        iei ieiVar = iei.a;
        bga bgaVar = this.G;
        rwe rweVar = this.F;
        switch (i) {
            case 0:
                rweVar.E.m(new fv(14, new ChatOptionsBottomSheetDestination[]{bgaVar}), new p23(9));
                break;
            case 1:
                rweVar.E.m(new fv(15, new ModelSelectorBottomSheetDestination[]{bgaVar}), new p23(10));
                break;
            default:
                rweVar.E.m(new fv(16, new TasksBottomSheetDestination[]{bgaVar}), new p23(11));
                break;
        }
        return ieiVar;
    }
}
