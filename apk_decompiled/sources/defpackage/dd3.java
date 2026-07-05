package defpackage;

import com.anthropic.claude.api.chat.ChatConversationWithNestedMessage;
import com.anthropic.claude.api.result.ApiResult;

/* JADX INFO: loaded from: classes2.dex */
public final class dd3 extends vp4 {
    public String E;
    public bz7 F;
    public dae G;
    public z9e H;
    public ApiResult I;
    public lf0 J;
    public ChatConversationWithNestedMessage K;
    public boolean L;
    public boolean M;
    public boolean N;
    public boolean O;
    public boolean P;
    public int Q;
    public /* synthetic */ Object R;
    public final /* synthetic */ vd3 S;
    public int T;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dd3(vd3 vd3Var, vp4 vp4Var) {
        super(vp4Var);
        this.S = vd3Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.R = obj;
        this.T |= Integer.MIN_VALUE;
        return this.S.e(null, false, false, false, null, this);
    }
}
