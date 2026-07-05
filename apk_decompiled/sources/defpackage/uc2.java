package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class uc2 extends vp4 {
    public uub E;
    public Iterator F;
    public float G;
    public int H;
    public /* synthetic */ Object I;
    public final /* synthetic */ vc2 J;
    public int K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uc2(vc2 vc2Var, vp4 vp4Var) {
        super(vp4Var);
        this.J = vc2Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.I = obj;
        this.K |= Integer.MIN_VALUE;
        return this.J.d(null, MTTypesetterKt.kLineSkipLimitMultiplier, this);
    }
}
