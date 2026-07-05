package defpackage;

import com.anthropic.claude.analytics.events.ChatEvents$AddContextButtonPressed;
import com.anthropic.claude.analytics.events.ChatEvents$ModelSelectorSheetSource;
import com.anthropic.claude.chat.bottomsheet.model.ModelSelectorBottomSheetDestination;
import com.anthropic.claude.chat.bottomsheet.options.ChatOptionsBottomSheetDestination;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l63 implements zy7 {
    public final /* synthetic */ int E = 1;
    public final /* synthetic */ t53 F;
    public final /* synthetic */ nwb G;
    public final /* synthetic */ t4g H;

    public /* synthetic */ l63(t53 t53Var, nwb nwbVar, t4g t4gVar) {
        this.F = t53Var;
        this.G = nwbVar;
        this.H = t4gVar;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.E;
        iei ieiVar = iei.a;
        t4g t4gVar = this.H;
        nwb nwbVar = this.G;
        t53 t53Var = this.F;
        switch (i) {
            case 0:
                if (((fn1) nwbVar.getValue()) != null) {
                    t53Var.g0.n(ChatEvents$ModelSelectorSheetSource.VOICE_CONTROLS);
                    t4gVar.d(ModelSelectorBottomSheetDestination.SelectModel.INSTANCE);
                }
                break;
            default:
                t53Var.w.e(new ChatEvents$AddContextButtonPressed(t53Var.d.e, Boolean.valueOf(t53Var.a1())), ChatEvents$AddContextButtonPressed.Companion.serializer());
                nwbVar.setValue(((Boolean) t53Var.A.e.getValue()).booleanValue() ? u4g.E : u4g.F);
                t4gVar.d(ChatOptionsBottomSheetDestination.AddToChat.INSTANCE);
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ l63(t53 t53Var, t4g t4gVar, nwb nwbVar) {
        this.F = t53Var;
        this.H = t4gVar;
        this.G = nwbVar;
    }
}
