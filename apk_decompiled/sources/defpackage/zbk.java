package defpackage;

import android.app.Activity;

/* JADX INFO: loaded from: classes.dex */
public final class zbk extends h6k {
    public final /* synthetic */ int I;
    public final /* synthetic */ Object J;
    public final /* synthetic */ Object K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zbk(af7 af7Var, Activity activity, int i) {
        super((j6k) af7Var.F, true);
        this.I = i;
        switch (i) {
            case 1:
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
                u4k u4kVar = ((j6k) ((af7) this.K).F).g;
                dgj.v(u4kVar);
                u4kVar.onActivityStarted(new cbc((Activity) this.J), this.F);
                break;
            case 1:
                u4k u4kVar2 = ((j6k) ((af7) this.K).F).g;
                dgj.v(u4kVar2);
                u4kVar2.onActivityResumed(new cbc((Activity) this.J), this.F);
                break;
            default:
                u4k u4kVar3 = ((j6k) this.K).g;
                dgj.v(u4kVar3);
                u4kVar3.setMeasurementEnabled(((Boolean) this.J).booleanValue(), this.E);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zbk(j6k j6kVar, Boolean bool) {
        super(j6kVar, true);
        this.I = 2;
        this.J = bool;
        this.K = j6kVar;
    }
}
