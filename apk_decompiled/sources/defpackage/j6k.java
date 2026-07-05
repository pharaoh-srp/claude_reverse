package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class j6k {
    public static volatile j6k h;
    public final String a = "FA";
    public final ql8 b = ql8.G;
    public final ExecutorService c;
    public final gmf d;
    public int e;
    public boolean f;
    public volatile u4k g;

    public j6k(Context context, Bundle bundle) {
        int i = 1;
        lu5 lu5Var = new lu5(1);
        lu5Var.b = Executors.defaultThreadFactory();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), lu5Var);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.c = Executors.unconfigurableExecutorService(threadPoolExecutor);
        this.d = new gmf(3, this);
        new ArrayList();
        try {
            String strB = bmk.b(context);
            Resources resources = context.getResources();
            if (TextUtils.isEmpty(strB)) {
                strB = bmk.b(context);
            }
            int identifier = resources.getIdentifier("google_app_id", "string", strB);
            String string = null;
            if (identifier != 0) {
                try {
                    string = resources.getString(identifier);
                } catch (Resources.NotFoundException unused) {
                }
            }
            if (string != null) {
                try {
                    Class.forName("com.google.firebase.analytics.FirebaseAnalytics", false, j6k.class.getClassLoader());
                } catch (ClassNotFoundException unused2) {
                    this.f = true;
                    Log.w(this.a, "Disabling data collection. Found google_app_id in strings.xml but Google Analytics for Firebase is missing. Remove this value or add Google Analytics for Firebase to resume data collection.");
                    return;
                }
            }
        } catch (IllegalStateException unused3) {
        }
        c(new u6k(this, context, bundle));
        Application application = (Application) context.getApplicationContext();
        if (application == null) {
            Log.w(this.a, "Unable to register lifecycle notifications. Application null.");
        } else {
            application.registerActivityLifecycleCallbacks(new af7(i, this));
        }
    }

    public static j6k a(Context context, Bundle bundle) {
        dgj.v(context);
        if (h == null) {
            synchronized (j6k.class) {
                try {
                    if (h == null) {
                        h = new j6k(context, bundle);
                    }
                } finally {
                }
            }
        }
        return h;
    }

    public final void b(Exception exc, boolean z, boolean z2) {
        this.f |= z;
        String str = this.a;
        if (z) {
            Log.w(str, "Data collection startup failed. No data will be collected.", exc);
            return;
        }
        if (z2) {
            c(new p6k(this, exc));
        }
        Log.w(str, "Error with data collection. Data lost.", exc);
    }

    public final void c(h6k h6kVar) {
        this.c.execute(h6kVar);
    }
}
