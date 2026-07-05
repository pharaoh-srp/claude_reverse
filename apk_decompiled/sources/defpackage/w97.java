package defpackage;

import com.anthropic.claude.api.result.ApiResult;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class w97 extends vp4 {
    public k87 E;
    public z9e F;
    public ApiResult G;
    public Iterator H;
    public /* synthetic */ Object I;
    public final /* synthetic */ x97 J;
    public int K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w97(x97 x97Var, vp4 vp4Var) {
        super(vp4Var);
        this.J = x97Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.I = obj;
        this.K |= Integer.MIN_VALUE;
        return this.J.k(null, null, null, null, this);
    }
}
