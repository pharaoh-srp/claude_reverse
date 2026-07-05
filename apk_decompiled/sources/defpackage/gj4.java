package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class gj4 extends vp4 {
    public g56 E;
    public ArrayList F;
    public cj4 G;
    public /* synthetic */ Object H;
    public final /* synthetic */ ij4 I;
    public int J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gj4(ij4 ij4Var, vp4 vp4Var) {
        super(vp4Var);
        this.I = ij4Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.H = obj;
        this.J |= Integer.MIN_VALUE;
        return this.I.b(null, null, this);
    }
}
