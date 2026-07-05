package defpackage;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class zi9 extends vp4 {
    public bp5 E;
    public aj9 F;
    public LinkedHashMap G;
    public String H;
    public int I;
    public /* synthetic */ Object J;
    public final /* synthetic */ aj9 K;
    public int L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zi9(aj9 aj9Var, vd1 vd1Var) {
        super(vd1Var);
        this.K = aj9Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.J = obj;
        this.L |= Integer.MIN_VALUE;
        return aj9.a(this.K, null, this);
    }
}
