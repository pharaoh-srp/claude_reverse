package defpackage;

import android.os.Bundle;

/* JADX INFO: loaded from: classes3.dex */
public final class p6k extends h6k {
    public final /* synthetic */ int I;
    public final /* synthetic */ j6k J;
    public final /* synthetic */ Object K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p6k(j6k j6kVar, Exception exc) {
        super(j6kVar, false);
        this.I = 2;
        this.K = exc;
        this.J = j6kVar;
    }

    @Override // defpackage.h6k
    public final void a() {
        switch (this.I) {
            case 0:
                u4k u4kVar = this.J.g;
                dgj.v(u4kVar);
                u4kVar.setUserProperty("fcm", "_ln", new cbc(this.K), true, this.E);
                break;
            case 1:
                u4k u4kVar2 = this.J.g;
                dgj.v(u4kVar2);
                u4kVar2.setConditionalUserProperty((Bundle) this.K, this.E);
                break;
            default:
                u4k u4kVar3 = this.J.g;
                dgj.v(u4kVar3);
                u4kVar3.logHealthData(5, "Error with data collection. Data lost.", new cbc((Exception) this.K), new cbc(null), new cbc(null));
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p6k(j6k j6kVar, Object obj, int i) {
        super(j6kVar, true);
        this.I = i;
        this.K = obj;
        this.J = j6kVar;
    }
}
