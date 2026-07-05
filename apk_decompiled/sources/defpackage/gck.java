package defpackage;

import android.app.Activity;

/* JADX INFO: loaded from: classes3.dex */
public final class gck extends h6k {
    public final /* synthetic */ int I;
    public final /* synthetic */ Activity J;
    public final /* synthetic */ af7 K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gck(af7 af7Var, Activity activity, int i) {
        super((j6k) af7Var.F, true);
        this.I = i;
        switch (i) {
            case 1:
                this.J = activity;
                this.K = af7Var;
                super((j6k) af7Var.F, true);
                break;
            case 2:
                this.J = activity;
                this.K = af7Var;
                super((j6k) af7Var.F, true);
                break;
            default:
                this.J = activity;
                this.K = af7Var;
                break;
        }
    }

    @Override // defpackage.h6k
    public final void a() {
        switch (this.I) {
            case 0:
                u4k u4kVar = ((j6k) this.K.F).g;
                dgj.v(u4kVar);
                u4kVar.onActivityPaused(new cbc(this.J), this.F);
                break;
            case 1:
                u4k u4kVar2 = ((j6k) this.K.F).g;
                dgj.v(u4kVar2);
                u4kVar2.onActivityStopped(new cbc(this.J), this.F);
                break;
            default:
                u4k u4kVar3 = ((j6k) this.K.F).g;
                dgj.v(u4kVar3);
                u4kVar3.onActivityDestroyed(new cbc(this.J), this.F);
                break;
        }
    }
}
