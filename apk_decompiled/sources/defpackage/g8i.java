package defpackage;

import com.anthropic.claude.api.trusteddevice.ReattestChallengeResponse;
import java.security.Signature;

/* JADX INFO: loaded from: classes2.dex */
public final class g8i extends vp4 {
    public String E;
    public Signature F;
    public ReattestChallengeResponse G;
    public /* synthetic */ Object H;
    public final /* synthetic */ j8i I;
    public int J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g8i(j8i j8iVar, vp4 vp4Var) {
        super(vp4Var);
        this.I = j8iVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.H = obj;
        this.J |= Integer.MIN_VALUE;
        return this.I.i(this);
    }
}
