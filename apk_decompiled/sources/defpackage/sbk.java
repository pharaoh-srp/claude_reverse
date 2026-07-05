package defpackage;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class sbk extends h6k {
    public final /* synthetic */ String I;
    public final /* synthetic */ String J;
    public final /* synthetic */ Bundle K;
    public final /* synthetic */ boolean L;
    public final /* synthetic */ j6k M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sbk(j6k j6kVar, String str, String str2, Bundle bundle, boolean z) {
        super(j6kVar, true);
        this.I = str;
        this.J = str2;
        this.K = bundle;
        this.L = z;
        this.M = j6kVar;
    }

    @Override // defpackage.h6k
    public final void a() {
        long j = this.E;
        u4k u4kVar = this.M.g;
        dgj.v(u4kVar);
        u4kVar.logEvent(this.I, this.J, this.K, this.L, true, j);
    }
}
