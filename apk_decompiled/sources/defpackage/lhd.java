package defpackage;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import androidx.lifecycle.ProcessLifecycleOwner;

/* JADX INFO: loaded from: classes.dex */
public final class lhd extends dm6 {
    final /* synthetic */ ProcessLifecycleOwner this$0;

    public static final class a extends dm6 {
        final /* synthetic */ ProcessLifecycleOwner this$0;

        public a(ProcessLifecycleOwner processLifecycleOwner) {
            this.this$0 = processLifecycleOwner;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            activity.getClass();
            this.this$0.b();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            activity.getClass();
            ProcessLifecycleOwner processLifecycleOwner = this.this$0;
            int i = processLifecycleOwner.E + 1;
            processLifecycleOwner.E = i;
            if (i == 1 && processLifecycleOwner.H) {
                processLifecycleOwner.J.f(y3a.ON_START);
                processLifecycleOwner.H = false;
            }
        }
    }

    public lhd(ProcessLifecycleOwner processLifecycleOwner) {
        this.this$0 = processLifecycleOwner;
    }

    @Override // defpackage.dm6, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        activity.getClass();
        if (Build.VERSION.SDK_INT < 29) {
            int i = hie.F;
            Fragment fragmentFindFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            fragmentFindFragmentByTag.getClass();
            ((hie) fragmentFindFragmentByTag).E = this.this$0.L;
        }
    }

    @Override // defpackage.dm6, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        activity.getClass();
        ProcessLifecycleOwner processLifecycleOwner = this.this$0;
        int i = processLifecycleOwner.F - 1;
        processLifecycleOwner.F = i;
        if (i == 0) {
            Handler handler = processLifecycleOwner.I;
            handler.getClass();
            handler.postDelayed(processLifecycleOwner.K, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        activity.getClass();
        d59.i(activity, new a(this.this$0));
    }

    @Override // defpackage.dm6, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        activity.getClass();
        ProcessLifecycleOwner processLifecycleOwner = this.this$0;
        int i = processLifecycleOwner.E - 1;
        processLifecycleOwner.E = i;
        if (i == 0 && processLifecycleOwner.G) {
            processLifecycleOwner.J.f(y3a.ON_STOP);
            processLifecycleOwner.H = true;
        }
    }
}
