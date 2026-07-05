package com.datadog.android.profiling;

import android.app.ActivityManager;
import android.app.ApplicationStartInfo;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.net.Uri;
import com.agog.mathdisplay.render.MTTypesetterKt;
import defpackage.ajd;
import defpackage.cjd;
import defpackage.hz1;
import defpackage.iz1;
import defpackage.jz1;
import defpackage.lz1;
import defpackage.mq5;
import defpackage.q28;
import defpackage.tk5;
import defpackage.tn5;
import defpackage.u0h;
import defpackage.um6;
import defpackage.w44;
import java.security.SecureRandom;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class DdProfilingContentProvider extends ContentProvider {
    public final jz1 E;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ DdProfilingContentProvider(jz1 jz1Var, int i, mq5 mq5Var) {
        if ((i & 1) != 0) {
            jz1.a.getClass();
            jz1Var = iz1.b;
        }
        this(jz1Var);
    }

    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        uri.getClass();
        return 0;
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        uri.getClass();
        return null;
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        uri.getClass();
        return null;
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        Set<String> set;
        String str;
        Set<String> stringSet;
        List historicalProcessStartReasons;
        ApplicationStartInfo applicationStartInfoA;
        Context context = getContext();
        if (context == null || !((hz1) this.E).j) {
            return true;
        }
        lz1 lz1Var = lz1.P;
        tk5 tk5VarD = lz1Var.D(context);
        synchronized (tk5VarD) {
            set = um6.E;
            str = null;
            try {
                stringSet = ((SharedPreferences) tk5VarD.F).getStringSet("dd_profiling_enabled", set);
            } catch (ClassCastException unused) {
                stringSet = null;
            }
            Set<String> set2 = stringSet;
            if (set2 != null) {
                set = set2;
            }
        }
        if (set.isEmpty()) {
            return true;
        }
        Object systemService = context.getSystemService("activity");
        ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
        Integer numValueOf = (activityManager == null || (historicalProcessStartReasons = activityManager.getHistoricalProcessStartReasons(1)) == null || (applicationStartInfoA = tn5.a(w44.N0(historicalProcessStartReasons))) == null) ? null : Integer.valueOf(applicationStartInfoA.getReason());
        if (numValueOf != null && numValueOf.intValue() == 6) {
            str = "launcher";
        } else if (numValueOf != null && numValueOf.intValue() == 11) {
            str = "start_activity";
        } else if (numValueOf != null && numValueOf.intValue() == 7) {
            str = "recents";
        }
        if (str == null) {
            return true;
        }
        q28 q28Var = new q28(lz1Var.C(context));
        float fFloatValue = q28Var.s().floatValue();
        if (fFloatValue != MTTypesetterKt.kLineSkipLimitMultiplier && (fFloatValue == 100.0f || ((SecureRandom) ((u0h) q28Var.G).getValue()).nextFloat() * 100.0f <= fFloatValue)) {
            ajd ajdVar = cjd.a;
            Map mapSingletonMap = Collections.singletonMap("app_start_info", str);
            mapSingletonMap.getClass();
            cjd.b(context, mapSingletonMap, set);
        }
        ((SharedPreferences) lz1Var.D(context).F).edit().remove("dd_profiling_sample_rate").apply();
        return true;
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        uri.getClass();
        return null;
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        uri.getClass();
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DdProfilingContentProvider() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public DdProfilingContentProvider(jz1 jz1Var) {
        jz1Var.getClass();
        this.E = jz1Var;
    }
}
