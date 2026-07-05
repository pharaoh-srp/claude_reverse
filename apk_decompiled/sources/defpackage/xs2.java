package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class xs2 extends vp4 {
    public zs2 E;
    public ArrayList F;
    public /* synthetic */ Object G;
    public final /* synthetic */ zs2 H;
    public int I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xs2(zs2 zs2Var, vp4 vp4Var) {
        super(vp4Var);
        this.H = zs2Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.G = obj;
        this.I |= Integer.MIN_VALUE;
        return zs2.a(this.H, null, null, this);
    }
}
