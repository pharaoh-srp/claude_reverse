package defpackage;

import com.anthropic.claude.types.strings.ChatId;

/* JADX INFO: loaded from: classes2.dex */
public final class uu implements zy7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ bz7 F;
    public final /* synthetic */ sx2 G;

    public /* synthetic */ uu(bz7 bz7Var, sx2 sx2Var, int i) {
        this.E = i;
        this.F = bz7Var;
        this.G = sx2Var;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.E;
        iei ieiVar = iei.a;
        sx2 sx2Var = this.G;
        bz7 bz7Var = this.F;
        switch (i) {
            case 0:
                bz7Var.invoke(ChatId.m978boximpl(sx2Var.a.m176getUuidRjYBDck()));
                break;
            case 1:
                bz7Var.invoke(sx2Var);
                break;
            default:
                bz7Var.invoke(sx2Var.a);
                break;
        }
        return ieiVar;
    }
}
