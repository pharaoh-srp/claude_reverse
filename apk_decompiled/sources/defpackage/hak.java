package defpackage;

import android.app.Activity;

/* JADX INFO: loaded from: classes3.dex */
public final class hak extends h6k {
    public final /* synthetic */ int I = 1;
    public final /* synthetic */ n4k J;
    public final /* synthetic */ Object K;
    public final /* synthetic */ Object L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hak(af7 af7Var, Activity activity, n4k n4kVar) {
        super((j6k) af7Var.F, true);
        this.K = activity;
        this.J = n4kVar;
        this.L = af7Var;
    }

    @Override // defpackage.h6k
    public final void a() {
        switch (this.I) {
            case 0:
                u4k u4kVar = ((j6k) this.L).g;
                dgj.v(u4kVar);
                u4kVar.getMaxUserProperties((String) this.K, this.J);
                break;
            default:
                u4k u4kVar2 = ((j6k) ((af7) this.L).F).g;
                dgj.v(u4kVar2);
                u4kVar2.onActivitySaveInstanceState(new cbc((Activity) this.K), this.J, this.F);
                break;
        }
    }

    @Override // defpackage.h6k
    public void b() {
        switch (this.I) {
            case 0:
                this.J.f(null);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hak(j6k j6kVar, String str, n4k n4kVar) {
        super(j6kVar, true);
        this.K = str;
        this.J = n4kVar;
        this.L = j6kVar;
    }
}
