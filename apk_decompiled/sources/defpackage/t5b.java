package defpackage;

import android.adservices.measurement.MeasurementManager;
import android.content.Context;
import android.net.Uri;
import android.view.InputEvent;

/* JADX INFO: loaded from: classes2.dex */
public final class t5b {
    public final MeasurementManager a;

    public t5b(Context context) {
        context.getClass();
        Object systemService = context.getSystemService((Class<Object>) nh8.j());
        systemService.getClass();
        this.a = nh8.d(systemService);
    }

    public Object a(vy5 vy5Var, tp4<? super iei> tp4Var) {
        new ua2(1, zni.I(tp4Var)).t();
        nh8.o();
        throw null;
    }

    public Object b(tp4<? super Integer> tp4Var) {
        ua2 ua2Var = new ua2(1, zni.I(tp4Var));
        ua2Var.t();
        this.a.getMeasurementApiStatus(new ao0(1), new wp4(ua2Var));
        return ua2Var.r();
    }

    public Object c(Uri uri, InputEvent inputEvent, tp4<? super iei> tp4Var) {
        ua2 ua2Var = new ua2(1, zni.I(tp4Var));
        ua2Var.t();
        this.a.registerSource(uri, inputEvent, new ao0(1), new wp4(ua2Var));
        Object objR = ua2Var.r();
        return objR == m45.E ? objR : iei.a;
    }

    public Object d(Uri uri, tp4<? super iei> tp4Var) {
        ua2 ua2Var = new ua2(1, zni.I(tp4Var));
        ua2Var.t();
        this.a.registerTrigger(uri, new ao0(1), new wp4(ua2Var));
        Object objR = ua2Var.r();
        return objR == m45.E ? objR : iei.a;
    }

    public Object e(f7j f7jVar, tp4<? super iei> tp4Var) {
        new ua2(1, zni.I(tp4Var)).t();
        nh8.B();
        throw null;
    }

    public Object f(g7j g7jVar, tp4<? super iei> tp4Var) {
        new ua2(1, zni.I(tp4Var)).t();
        nh8.D();
        throw null;
    }
}
