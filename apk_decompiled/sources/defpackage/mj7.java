package defpackage;

import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public final class mj7 extends vp4 {
    public ai5 E;
    public hxb F;
    public File G;
    public lk7 H;
    public int I;
    public /* synthetic */ Object J;
    public final /* synthetic */ nj7 K;
    public int L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mj7(nj7 nj7Var, vp4 vp4Var) {
        super(vp4Var);
        this.K = nj7Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.J = obj;
        this.L |= Integer.MIN_VALUE;
        return this.K.b(null, this);
    }
}
