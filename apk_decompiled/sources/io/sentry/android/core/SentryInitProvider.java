package io.sentry.android.core;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.ProviderInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import defpackage.sz6;
import io.sentry.r5;
import io.sentry.t4;
import io.sentry.t5;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class SentryInitProvider extends v0 {
    @Override // android.content.ContentProvider
    public final void attachInfo(Context context, ProviderInfo providerInfo) {
        if (SentryInitProvider.class.getName().equals(providerInfo.authority)) {
            sz6.j("An applicationId is required to fulfill the manifest placeholder.");
        } else {
            super.attachInfo(context, providerInfo);
        }
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        Bundle bundle;
        t tVar = new t(3);
        Context context = getContext();
        if (context == null) {
            tVar.h(t5.FATAL, "App. Context from ContentProvider is null", new Object[0]);
            return false;
        }
        try {
            ApplicationInfo applicationInfo = Build.VERSION.SDK_INT >= 33 ? (ApplicationInfo) p0.d.a(context) : (ApplicationInfo) p0.e.a(context);
            bundle = applicationInfo != null ? applicationInfo.metaData : null;
        } catch (Throwable th) {
            tVar.d(t5.ERROR, "Failed to read auto-init from android manifest metadata.", th);
        }
        boolean zG = bundle != null ? p0.g(bundle, tVar, "io.sentry.auto-init", true) : true;
        if (zG) {
            if (context.getPackageName().endsWith(".test")) {
                try {
                    Iterator<ActivityManager.AppTask> it = ((ActivityManager) context.getSystemService("activity")).getAppTasks().iterator();
                    while (it.hasNext()) {
                        ComponentName component = it.next().getTaskInfo().baseIntent.getComponent();
                        if (component != null && component.getClassName().equals("androidx.compose.ui.tooling.PreviewActivity")) {
                            break;
                        }
                    }
                } catch (Throwable unused) {
                }
                j1.b(context, tVar, new io.sentry.b2(6));
                r5.d().a("AutoInit");
            } else {
                j1.b(context, tVar, new io.sentry.b2(6));
                r5.d().a("AutoInit");
            }
        }
        return true;
    }

    @Override // android.content.ContentProvider
    public final void shutdown() {
        t4.d();
    }
}
