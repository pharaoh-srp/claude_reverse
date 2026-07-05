package defpackage;

import com.anthropic.claude.chat.bottomsheet.CollapsedToolsSheetDestination;
import com.anthropic.claude.chat.bottomsheet.tool.approval.appuse.MobileAppUseDestination;
import com.anthropic.claude.core.logging.EmptyDestination;

/* JADX INFO: loaded from: classes2.dex */
public final class k44 implements zy7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ rwe F;
    public final /* synthetic */ bga G;
    public final /* synthetic */ zy7 H;

    public /* synthetic */ k44(rwe rweVar, EmptyDestination emptyDestination, zy7 zy7Var, int i) {
        this.E = i;
        this.F = rweVar;
        this.G = emptyDestination;
        this.H = zy7Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.zy7
    public final Object a() {
        int i = this.E;
        iei ieiVar = iei.a;
        zy7 zy7Var = this.H;
        bga bgaVar = this.G;
        rwe rweVar = this.F;
        switch (i) {
            case 0:
                rweVar.E.m(new fv(28, new CollapsedToolsSheetDestination[]{bgaVar}), new tj3(26));
                zy7Var.a();
                break;
            default:
                rweVar.E.m(new jga(13, new MobileAppUseDestination[]{bgaVar}), new ppa(12));
                zy7Var.a();
                break;
        }
        return ieiVar;
    }
}
