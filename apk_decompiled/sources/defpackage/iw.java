package defpackage;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class iw extends vp4 {
    public List E;
    public ybg F;
    public z9e G;
    public Iterator H;
    public String I;
    public /* synthetic */ Object J;
    public final /* synthetic */ jw K;
    public int L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iw(jw jwVar, vp4 vp4Var) {
        super(vp4Var);
        this.K = jwVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.J = obj;
        this.L |= Integer.MIN_VALUE;
        return this.K.b(null, null, this);
    }
}
