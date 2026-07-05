package defpackage;

import com.anthropic.claude.api.chat.messages.g;
import com.anthropic.claude.api.chat.messages.h;
import com.anthropic.claude.types.strings.MessageId;

/* JADX INFO: loaded from: classes2.dex */
public final class a93 implements zy7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ bl2 F;
    public final /* synthetic */ uhd G;

    public /* synthetic */ a93(bl2 bl2Var, uhd uhdVar, int i) {
        this.E = i;
        this.F = bl2Var;
        this.G = uhdVar;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.E;
        iei ieiVar = iei.a;
        uhd uhdVar = this.G;
        bl2 bl2Var = this.F;
        switch (i) {
            case 0:
                bl2Var.k.invoke(MessageId.m1051boximpl(uhdVar.a), h.a);
                break;
            default:
                bl2Var.k.invoke(MessageId.m1051boximpl(uhdVar.a), g.a);
                break;
        }
        return ieiVar;
    }
}
