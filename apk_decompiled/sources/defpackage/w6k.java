package defpackage;

import android.app.Activity;
import android.os.Bundle;

/* JADX INFO: loaded from: classes3.dex */
public final class w6k extends h6k {
    public final /* synthetic */ int I;
    public final /* synthetic */ String J;
    public final /* synthetic */ String K;
    public final /* synthetic */ j6k L;
    public final /* synthetic */ Object M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w6k(j6k j6kVar, Activity activity, String str, String str2) {
        super(j6kVar, true);
        this.I = 2;
        this.M = activity;
        this.J = str;
        this.K = str2;
        this.L = j6kVar;
    }

    @Override // defpackage.h6k
    public final void a() {
        switch (this.I) {
            case 0:
                u4k u4kVar = this.L.g;
                dgj.v(u4kVar);
                u4kVar.clearConditionalUserProperty(this.J, this.K, (Bundle) this.M);
                break;
            case 1:
                u4k u4kVar2 = this.L.g;
                dgj.v(u4kVar2);
                u4kVar2.getConditionalUserProperties(this.J, this.K, (n4k) this.M);
                break;
            default:
                u4k u4kVar3 = this.L.g;
                dgj.v(u4kVar3);
                u4kVar3.setCurrentScreen(new cbc((Activity) this.M), this.J, this.K, this.E);
                break;
        }
    }

    @Override // defpackage.h6k
    public void b() {
        switch (this.I) {
            case 1:
                ((n4k) this.M).f(null);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w6k(j6k j6kVar, String str, String str2, Object obj, int i) {
        super(j6kVar, true);
        this.I = i;
        this.J = str;
        this.K = str2;
        this.M = obj;
        this.L = j6kVar;
    }
}
