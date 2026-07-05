package defpackage;

import android.content.Context;
import com.anthropic.claude.api.result.ApiResult;
import com.anthropic.claude.connector.auth.b;

/* JADX INFO: loaded from: classes2.dex */
public final class ni4 extends vp4 {
    public String E;
    public String F;
    public Context G;
    public si4 H;
    public pz7 I;
    public hxb J;
    public ApiResult K;
    public ApiResult L;
    public boolean M;
    public /* synthetic */ Object N;
    public final /* synthetic */ b O;
    public int P;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ni4(b bVar, vp4 vp4Var) {
        super(vp4Var);
        this.O = bVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.N = obj;
        this.P |= Integer.MIN_VALUE;
        return this.O.e(null, null, null, null, false, null, this);
    }
}
