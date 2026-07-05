package defpackage;

import android.content.Context;
import android.location.Location;

/* JADX INFO: loaded from: classes3.dex */
public final class bni extends vp4 {
    public Context E;
    public Location F;
    public int G;
    public boolean H;
    public /* synthetic */ Object I;
    public final /* synthetic */ w9h J;
    public int K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bni(w9h w9hVar, vp4 vp4Var) {
        super(vp4Var);
        this.J = w9hVar;
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        this.I = obj;
        this.K |= Integer.MIN_VALUE;
        return this.J.g(null, null, this);
    }
}
