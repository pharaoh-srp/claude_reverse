package defpackage;

import com.anthropic.claude.api.chat.ChatMessage;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class tz2 extends vp4 {
    public ChatMessage E;
    public List F;
    public /* synthetic */ Object G;
    public final /* synthetic */ uz2 H;
    public int I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tz2(uz2 uz2Var, vp4 vp4Var) {
        super(vp4Var);
        this.H = uz2Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.G = obj;
        this.I |= Integer.MIN_VALUE;
        return uz2.a(this.H, null, false, false, this);
    }
}
