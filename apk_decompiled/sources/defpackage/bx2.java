package defpackage;

import com.anthropic.claude.chat.input.files.a;

/* JADX INFO: loaded from: classes2.dex */
public final class bx2 extends vp4 {
    public /* synthetic */ Object E;
    public final /* synthetic */ a F;
    public int G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bx2(a aVar, vp4 vp4Var) {
        super(vp4Var);
        this.F = aVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.E = obj;
        this.G |= Integer.MIN_VALUE;
        return a.o(this.F, null, null, null, null, this);
    }
}
