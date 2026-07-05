package defpackage;

import com.anthropic.claude.bell.tts.f;

/* JADX INFO: loaded from: classes2.dex */
public final class s2h extends vp4 {
    public byte[] E;
    public dae F;
    public Object G;
    public f H;
    public dae I;
    public int J;
    public int K;
    public int L;
    public long M;
    public /* synthetic */ Object N;
    public final /* synthetic */ t2h O;
    public int P;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s2h(t2h t2hVar, tp4 tp4Var) {
        super(tp4Var);
        this.O = t2hVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.N = obj;
        this.P |= Integer.MIN_VALUE;
        return this.O.g(null, this);
    }
}
