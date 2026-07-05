package defpackage;

import com.anthropic.claude.connector.auth.b;

/* JADX INFO: loaded from: classes2.dex */
public final class li4 extends vp4 {
    public ri4 E;
    public hxb F;
    public bi4 G;
    public /* synthetic */ Object H;
    public final /* synthetic */ b I;
    public int J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public li4(b bVar, vp4 vp4Var) {
        super(vp4Var);
        this.I = bVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.H = obj;
        this.J |= Integer.MIN_VALUE;
        return this.I.c(null, this);
    }
}
