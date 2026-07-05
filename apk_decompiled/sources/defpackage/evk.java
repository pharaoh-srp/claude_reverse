package defpackage;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class evk implements Runnable {
    public final /* synthetic */ String E;
    public final /* synthetic */ String F;
    public final /* synthetic */ long G;
    public final /* synthetic */ Bundle H;
    public final /* synthetic */ boolean I;
    public final /* synthetic */ boolean J;
    public final /* synthetic */ boolean K;
    public final /* synthetic */ jsk L;

    public evk(jsk jskVar, String str, String str2, long j, Bundle bundle, boolean z, boolean z2, boolean z3) {
        this.E = str;
        this.F = str2;
        this.G = j;
        this.H = bundle;
        this.I = z;
        this.J = z2;
        this.K = z3;
        this.L = jskVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.L.V0(this.E, this.F, this.G, this.H, this.I, this.J, this.K);
    }
}
