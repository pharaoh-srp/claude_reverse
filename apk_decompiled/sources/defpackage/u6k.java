package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule$LoadingException;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final class u6k extends h6k {
    public final /* synthetic */ int I = 1;
    public final /* synthetic */ Bundle J;
    public final /* synthetic */ Context K;
    public final /* synthetic */ Object L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u6k(af7 af7Var, Bundle bundle, Activity activity) {
        super((j6k) af7Var.F, true);
        this.J = bundle;
        this.K = activity;
        this.L = af7Var;
    }

    @Override // defpackage.h6k
    public final void a() {
        u4k u4kVarAsInterface;
        Bundle bundle;
        switch (this.I) {
            case 0:
                try {
                    dgj.v(this.K);
                    j6k j6kVar = (j6k) this.L;
                    try {
                        u4kVarAsInterface = q4k.asInterface(si6.c(this.K, si6.c, ModuleDescriptor.MODULE_ID).b("com.google.android.gms.measurement.internal.AppMeasurementDynamiteService"));
                    } catch (DynamiteModule$LoadingException e) {
                        j6kVar.b(e, true, false);
                        u4kVarAsInterface = null;
                    }
                    j6kVar.g = u4kVarAsInterface;
                    if (((j6k) this.L).g != null) {
                        int iA = si6.a(this.K, ModuleDescriptor.MODULE_ID);
                        y5k y5kVar = new y5k(102001L, Math.max(iA, r2), si6.d(this.K, ModuleDescriptor.MODULE_ID, false) < iA, null, null, null, this.J, bmk.b(this.K));
                        u4k u4kVar = ((j6k) this.L).g;
                        dgj.v(u4kVar);
                        u4kVar.initialize(new cbc(this.K), y5kVar, this.E);
                    } else {
                        Log.w(((j6k) this.L).a, "Failed to connect to measurement client.");
                    }
                } catch (Exception e2) {
                    ((j6k) this.L).b(e2, true, false);
                    return;
                }
                break;
            default:
                if (this.J != null) {
                    bundle = new Bundle();
                    if (this.J.containsKey("com.google.app_measurement.screen_service")) {
                        Object obj = this.J.get("com.google.app_measurement.screen_service");
                        if (obj instanceof Bundle) {
                            bundle.putBundle("com.google.app_measurement.screen_service", (Bundle) obj);
                        }
                    }
                } else {
                    bundle = null;
                }
                u4k u4kVar2 = ((j6k) ((af7) this.L).F).g;
                dgj.v(u4kVar2);
                u4kVar2.onActivityCreated(new cbc((Activity) this.K), bundle, this.F);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u6k(j6k j6kVar, Context context, Bundle bundle) {
        super(j6kVar, true);
        this.K = context;
        this.J = bundle;
        this.L = j6kVar;
    }
}
