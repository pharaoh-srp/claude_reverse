package defpackage;

import com.anthropic.claude.app.ClaudeAppDestination;
import com.anthropic.router.panes.Panes;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zj3 implements bz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ ClaudeAppDestination.Detail.Chat F;
    public final /* synthetic */ zqc G;

    public /* synthetic */ zj3(ClaudeAppDestination.Detail.Chat chat, zqc zqcVar, int i) {
        this.E = i;
        this.F = chat;
        this.G = zqcVar;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.E;
        ClaudeAppDestination.Detail.Chat chat = this.F;
        zqc zqcVar = this.G;
        List main = lm6.E;
        ye3 ye3Var = ye3.E;
        switch (i) {
            case 0:
                Panes panes = (Panes) obj;
                lsc lscVar = zqcVar.F;
                panes.getClass();
                if (chat instanceof ClaudeAppDestination.List) {
                    List listW = x44.W(chat);
                    if (((te3) lscVar.getValue()).d != ye3Var) {
                        main = panes.getDetails();
                    }
                    return Panes.copy$default(panes, listW, main, null, null, 12, null);
                }
                if (((te3) lscVar.getValue()).d != ye3Var) {
                    main = panes.getMain();
                }
                return Panes.copy$default(panes, main, x44.W(chat), null, null, 12, null);
            case 1:
                Panes panes2 = (Panes) obj;
                lsc lscVar2 = zqcVar.F;
                panes2.getClass();
                if (chat instanceof ClaudeAppDestination.List) {
                    List listW2 = x44.W(chat);
                    if (((te3) lscVar2.getValue()).d != ye3Var) {
                        main = panes2.getDetails();
                    }
                    return Panes.copy$default(panes2, listW2, main, null, null, 12, null);
                }
                if (((te3) lscVar2.getValue()).d != ye3Var) {
                    main = panes2.getMain();
                }
                return Panes.copy$default(panes2, main, x44.W(chat), null, null, 12, null);
            default:
                Panes panes3 = (Panes) obj;
                lsc lscVar3 = zqcVar.F;
                panes3.getClass();
                if (chat instanceof ClaudeAppDestination.List) {
                    List listW3 = x44.W(chat);
                    if (((te3) lscVar3.getValue()).d != ye3Var) {
                        main = panes3.getDetails();
                    }
                    return Panes.copy$default(panes3, listW3, main, null, null, 12, null);
                }
                if (((te3) lscVar3.getValue()).d != ye3Var) {
                    main = panes3.getMain();
                }
                return Panes.copy$default(panes3, main, x44.W(chat), null, null, 12, null);
        }
    }
}
