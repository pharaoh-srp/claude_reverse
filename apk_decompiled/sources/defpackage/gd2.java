package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class gd2 extends vp4 {
    public List E;
    public uub F;
    public /* synthetic */ Object G;
    public final /* synthetic */ id2 H;
    public int I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gd2(id2 id2Var, vp4 vp4Var) {
        super(vp4Var);
        this.H = id2Var;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.G = obj;
        this.I |= Integer.MIN_VALUE;
        return this.H.a(null, null, this);
    }
}
