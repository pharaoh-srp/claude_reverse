package defpackage;

import com.anthropic.claude.bell.BellModelSheetDestination;
import com.anthropic.claude.core.logging.EmptyDestination;
import com.anthropic.claude.project.knowledge.ProjectKnowledgeBottomSheetDestination;
import com.anthropic.claude.tasks.ui.TasksBottomSheetDestination;

/* JADX INFO: loaded from: classes3.dex */
public final class zl1 implements zy7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ rwe F;
    public final /* synthetic */ bga G;

    public /* synthetic */ zl1(rwe rweVar, EmptyDestination emptyDestination, int i) {
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
                rweVar.E.m(new fv(4, new BellModelSheetDestination[]{bgaVar}), new a2g(12));
                break;
            case 1:
                rweVar.E.m(new jga(26, new ProjectKnowledgeBottomSheetDestination[]{bgaVar}), new nmd(3));
                break;
            default:
                rweVar.E.m(new jga(29, new TasksBottomSheetDestination[]{bgaVar}), new hyf(28));
                break;
        }
        return ieiVar;
    }
}
