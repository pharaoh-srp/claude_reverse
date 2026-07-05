package defpackage;

import com.anthropic.claude.app.ClaudeAppDestination;
import com.anthropic.router.panes.Panes;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class yqc implements bz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ ClaudeAppDestination.Detail F;

    public /* synthetic */ yqc(ClaudeAppDestination.Detail detail, int i) {
        this.E = i;
        this.F = detail;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.E;
        ClaudeAppDestination.Detail detail = this.F;
        switch (i) {
            case 0:
                Panes panes = (Panes) obj;
                panes.getClass();
                return panes.getDetails().isEmpty() ? Panes.copy$default(panes, null, x44.W(detail), null, null, 13, null) : x44.r(w44.V0(panes.getDetails()), detail) ? panes : Panes.copy$default(panes, null, w44.b1(w44.J0(1, panes.getDetails()), detail), null, null, 13, null);
            default:
                Panes panes2 = (Panes) obj;
                panes2.getClass();
                return x44.r(w44.V0(panes2.getDetails()), detail) ? panes2 : Panes.copy$default(panes2, null, w44.b1(panes2.getDetails(), detail), null, null, 13, null);
        }
    }
}
