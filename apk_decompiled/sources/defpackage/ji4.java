package defpackage;

import android.content.Context;
import com.anthropic.claude.connector.auth.b;

/* JADX INFO: loaded from: classes3.dex */
public final class ji4 extends vp4 {
    public String E;
    public Context F;
    public c4a G;
    public si4 H;
    public String I;
    public String J;
    public hxb K;
    public /* synthetic */ Object L;
    public final /* synthetic */ b M;
    public int N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ji4(b bVar, vp4 vp4Var) {
        super(vp4Var);
        this.M = bVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.L = obj;
        this.N |= Integer.MIN_VALUE;
        return this.M.a(null, null, null, null, null, null, this);
    }
}
