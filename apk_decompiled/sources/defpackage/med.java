package defpackage;

import com.anthropic.claude.api.chat.MessageBlobFile;

/* JADX INFO: loaded from: classes2.dex */
public final class med extends vp4 {
    public MessageBlobFile E;
    public /* synthetic */ Object F;
    public final /* synthetic */ ned G;
    public int H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public med(ned nedVar, vp4 vp4Var) {
        super(vp4Var);
        this.G = nedVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.F = obj;
        this.H |= Integer.MIN_VALUE;
        return this.G.b(null, null, this);
    }
}
