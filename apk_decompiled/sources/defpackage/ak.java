package defpackage;

import com.anthropic.claude.sessions.api.b;

/* JADX INFO: loaded from: classes3.dex */
public final class ak extends vp4 {
    public String E;
    public String F;
    public /* synthetic */ Object G;
    public final /* synthetic */ b H;
    public int I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ak(b bVar, vp4 vp4Var) {
        super(vp4Var);
        this.H = bVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.G = obj;
        this.I |= Integer.MIN_VALUE;
        return this.H.s(null, null, null, false, null, false, false, this);
    }
}
