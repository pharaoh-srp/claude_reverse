package defpackage;

import com.anthropic.claude.analytics.events.ChatEvents$AddAttachment;
import com.anthropic.claude.analytics.events.ChatEvents$UploadSource;
import com.anthropic.claude.configs.flags.UploadConfig;

/* JADX INFO: loaded from: classes2.dex */
public final class zj7 extends vp4 {
    public String E;
    public dk7 F;
    public ChatEvents$AddAttachment G;
    public ChatEvents$UploadSource H;
    public Integer I;
    public zy7 J;
    public UploadConfig K;
    public gub L;
    public bae M;
    public int N;
    public int O;
    public /* synthetic */ Object P;
    public final /* synthetic */ ck7 Q;
    public int R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zj7(ck7 ck7Var, vp4 vp4Var) {
        super(vp4Var);
        this.Q = ck7Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.P = obj;
        this.R |= Integer.MIN_VALUE;
        return this.Q.g(null, null, null, null, null, null, null, this);
    }
}
