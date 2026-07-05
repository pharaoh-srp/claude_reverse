package defpackage;

import com.anthropic.claude.analytics.events.ChatMessageActionEvents$ActionSource;
import com.anthropic.claude.types.strings.MessageId;

/* JADX INFO: loaded from: classes.dex */
public final class a83 implements rz7 {
    public final /* synthetic */ l45 E;
    public final /* synthetic */ op3 F;
    public final /* synthetic */ qi3 G;
    public final /* synthetic */ t53 H;

    public a83(l45 l45Var, op3 op3Var, qi3 qi3Var, t53 t53Var) {
        this.E = l45Var;
        this.F = op3Var;
        this.G = qi3Var;
        this.H = t53Var;
    }

    @Override // defpackage.rz7
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ChatMessageActionEvents$ActionSource chatMessageActionEvents$ActionSource = (ChatMessageActionEvents$ActionSource) obj;
        String strM1057unboximpl = ((MessageId) obj2).m1057unboximpl();
        String str = (String) obj3;
        chatMessageActionEvents$ActionSource.getClass();
        strM1057unboximpl.getClass();
        str.getClass();
        gb9.D(this.E, null, null, new b9(this.F, this.G, this.H, chatMessageActionEvents$ActionSource, strM1057unboximpl, str, null, 5), 3);
        return iei.a;
    }
}
