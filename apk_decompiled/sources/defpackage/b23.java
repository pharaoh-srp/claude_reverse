package defpackage;

import com.anthropic.claude.analytics.events.ChatMessageActionEvents$ActionSource;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class b23 implements zy7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ bl2 F;

    public /* synthetic */ b23(bl2 bl2Var, int i) {
        this.E = i;
        this.F = bl2Var;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.E;
        iei ieiVar = iei.a;
        bl2 bl2Var = this.F;
        switch (i) {
            case 0:
                bl2Var.a.invoke(ChatMessageActionEvents$ActionSource.LONG_PRESS);
                break;
            default:
                bl2Var.a.invoke(ChatMessageActionEvents$ActionSource.FOOTER_ACTION_BAR);
                break;
        }
        return ieiVar;
    }
}
