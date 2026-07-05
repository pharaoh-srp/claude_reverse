package defpackage;

import com.anthropic.claude.connector.auth.b;

/* JADX INFO: loaded from: classes2.dex */
public final class mi4 extends vp4 {
    public String E;
    public pz7 F;
    public /* synthetic */ Object G;
    public final /* synthetic */ b H;
    public int I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mi4(b bVar, vp4 vp4Var) {
        super(vp4Var);
        this.H = bVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.G = obj;
        this.I |= Integer.MIN_VALUE;
        return this.H.d(null, null, null, this);
    }
}
