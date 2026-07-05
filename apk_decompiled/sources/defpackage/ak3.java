package defpackage;

import com.anthropic.claude.analytics.events.DrawerEvents$DrawerItem;
import com.anthropic.claude.app.ClaudeAppDestination;
import com.anthropic.claude.types.strings.ChatId;

/* JADX INFO: loaded from: classes.dex */
public final class ak3 implements pz7 {
    public final /* synthetic */ zqc E;
    public final /* synthetic */ z93 F;
    public final /* synthetic */ qi3 G;
    public final /* synthetic */ l45 H;
    public final /* synthetic */ of6 I;

    public ak3(zqc zqcVar, z93 z93Var, qi3 qi3Var, l45 l45Var, of6 of6Var) {
        this.E = zqcVar;
        this.F = z93Var;
        this.G = qi3Var;
        this.H = l45Var;
        this.I = of6Var;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        String strM984unboximpl = ((ChatId) obj).m984unboximpl();
        strM984unboximpl.getClass();
        dk3.b(this.G, this.H, this.I, DrawerEvents$DrawerItem.CHAT);
        ClaudeAppDestination.Detail.Chat chat = new ClaudeAppDestination.Detail.Chat(z93.a(this.F, strM984unboximpl, null, null, 4));
        pj3 pj3Var = pj3.H;
        zqc zqcVar = this.E;
        zqcVar.E.m(new zj3(chat, zqcVar, 0), pj3Var);
        return iei.a;
    }
}
