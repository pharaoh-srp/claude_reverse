package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class eo1 extends vp4 {
    public im2 E;
    public z9e F;
    public z9e G;
    public z9e H;
    public ArrayList I;
    public ArrayList J;
    public String K;
    public /* synthetic */ Object L;
    public final /* synthetic */ go1 M;
    public int N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eo1(go1 go1Var, vp4 vp4Var) {
        super(vp4Var);
        this.M = go1Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.L = obj;
        this.N |= Integer.MIN_VALUE;
        return this.M.b(null, this);
    }
}
