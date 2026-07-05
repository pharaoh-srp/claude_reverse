package com.google.firebase.analytics;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import defpackage.dgj;
import defpackage.ez1;
import defpackage.j6k;
import defpackage.pl7;
import defpackage.pmf;
import defpackage.tyj;
import defpackage.w6k;
import defpackage.xl7;
import defpackage.yl7;
import defpackage.zwk;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes.dex */
public final class FirebaseAnalytics {
    public static volatile FirebaseAnalytics b;
    public final j6k a;

    public FirebaseAnalytics(j6k j6kVar) {
        dgj.v(j6kVar);
        this.a = j6kVar;
    }

    public static FirebaseAnalytics getInstance(Context context) {
        if (b == null) {
            synchronized (FirebaseAnalytics.class) {
                try {
                    if (b == null) {
                        b = new FirebaseAnalytics(j6k.a(context, null));
                    }
                } finally {
                }
            }
        }
        return b;
    }

    public static zwk getScionFrontendApiImplementation(Context context, Bundle bundle) {
        j6k j6kVarA = j6k.a(context, bundle);
        if (j6kVarA == null) {
            return null;
        }
        return new tyj(j6kVarA);
    }

    public final String getFirebaseInstanceId() {
        try {
            Object obj = xl7.m;
            return (String) ez1.s(((xl7) pl7.c().b(yl7.class)).c(), 30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            pmf.m(e);
            return null;
        } catch (ExecutionException e2) {
            pmf.m(e2.getCause());
            return null;
        } catch (TimeoutException unused) {
            throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
        }
    }

    @Deprecated
    public final void setCurrentScreen(Activity activity, String str, String str2) {
        j6k j6kVar = this.a;
        j6kVar.getClass();
        j6kVar.c(new w6k(j6kVar, activity, str, str2));
    }
}
