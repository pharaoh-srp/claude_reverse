package defpackage;

import com.anthropic.claude.code.remote.c;

/* JADX INFO: loaded from: classes2.dex */
public final class sz3 extends vp4 {
    public /* synthetic */ Object E;
    public final /* synthetic */ c F;
    public int G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sz3(c cVar, vp4 vp4Var) {
        super(vp4Var);
        this.F = cVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.E = obj;
        this.G |= Integer.MIN_VALUE;
        return c.O(this.F, this);
    }
}
