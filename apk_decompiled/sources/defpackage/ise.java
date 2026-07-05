package defpackage;

import android.app.Activity;

/* JADX INFO: loaded from: classes2.dex */
public final class ise extends vp4 {
    public Activity E;
    public ire F;
    public /* synthetic */ Object G;
    public final /* synthetic */ jse H;
    public int I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ise(jse jseVar, vp4 vp4Var) {
        super(vp4Var);
        this.H = jseVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.G = obj;
        this.I |= Integer.MIN_VALUE;
        return this.H.a(null, this);
    }
}
