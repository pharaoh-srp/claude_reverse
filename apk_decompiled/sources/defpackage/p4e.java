package defpackage;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes2.dex */
public final class p4e extends vp4 {
    public s4e E;
    public re1 F;
    public kx8 G;
    public rz6 H;
    public Bitmap I;
    public /* synthetic */ Object J;
    public final /* synthetic */ s4e K;
    public int L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p4e(s4e s4eVar, vp4 vp4Var) {
        super(vp4Var);
        this.K = s4eVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.J = obj;
        this.L |= Integer.MIN_VALUE;
        return s4e.a(this.K, null, 0, this);
    }
}
