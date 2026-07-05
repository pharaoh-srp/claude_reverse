package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class gmd extends vp4 {
    public imd E;
    public ArrayList F;
    public /* synthetic */ Object G;
    public final /* synthetic */ imd H;
    public int I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gmd(imd imdVar, vp4 vp4Var) {
        super(vp4Var);
        this.H = imdVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.G = obj;
        this.I |= Integer.MIN_VALUE;
        return imd.c(this.H, null, null, this);
    }
}
