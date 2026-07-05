package defpackage;

import com.anthropic.claude.bell.tts.d;

/* JADX INFO: loaded from: classes2.dex */
public final class c2h extends vp4 {
    public /* synthetic */ Object E;
    public final /* synthetic */ d F;
    public int G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2h(d dVar, vp4 vp4Var) {
        super(vp4Var);
        this.F = dVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.E = obj;
        this.G |= Integer.MIN_VALUE;
        return d.q(this.F, this);
    }
}
