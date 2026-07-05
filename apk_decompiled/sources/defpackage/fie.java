package defpackage;

import android.app.Activity;
import android.app.FragmentManager;
import android.os.Build;
import defpackage.hie;

/* JADX INFO: loaded from: classes.dex */
public abstract class fie {
    /* JADX WARN: Multi-variable type inference failed */
    public static void a(Activity activity, y3a y3aVar) {
        y3aVar.getClass();
        if (activity instanceof m4a) {
            c4a c4aVarA = ((m4a) activity).a();
            if (c4aVarA instanceof p4a) {
                ((p4a) c4aVarA).f(y3aVar);
            }
        }
    }

    public static void b(Activity activity) {
        if (Build.VERSION.SDK_INT >= 29) {
            hie.a.Companion.getClass();
            activity.registerActivityLifecycleCallbacks(new hie.a());
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new hie(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }
}
