package defpackage;

import android.view.View;
import com.anthropic.claude.bell.api.VoiceSelection;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class a5j implements lp7 {
    public final /* synthetic */ List E;
    public final /* synthetic */ pl3 F;
    public final /* synthetic */ View G;
    public final /* synthetic */ nwb H;
    public final /* synthetic */ nwb I;
    public final /* synthetic */ nwb J;

    public a5j(List list, pl3 pl3Var, View view, nwb nwbVar, nwb nwbVar2, nwb nwbVar3) {
        this.E = list;
        this.F = pl3Var;
        this.G = view;
        this.H = nwbVar;
        this.I = nwbVar2;
        this.J = nwbVar3;
    }

    @Override // defpackage.lp7
    public final Object g(Object obj, tp4 tp4Var) {
        dhg dhgVar = (dhg) w44.O0(((Number) obj).intValue(), this.E);
        iei ieiVar = iei.a;
        if (dhgVar != null) {
            String str = dhgVar.a;
            vve vveVar = b5j.a;
            if (!VoiceSelection.m576equalsimpl0(str, ((VoiceSelection) this.H.getValue()).m579unboximpl())) {
                this.F.c(this.G);
                ((bz7) this.I.getValue()).invoke(VoiceSelection.m573boximpl(str));
                ((pz7) this.J.getValue()).invoke(dhgVar, new Float(1.0f));
                return ieiVar;
            }
        }
        return ieiVar;
    }
}
