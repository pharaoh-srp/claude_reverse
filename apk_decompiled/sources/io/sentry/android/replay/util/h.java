package io.sentry.android.replay.util;

import android.os.Build;
import defpackage.wg6;

/* JADX INFO: loaded from: classes3.dex */
public final class h {
    public static String a(f fVar) {
        String str;
        fVar.getClass();
        if (Build.VERSION.SDK_INT < 31) {
            return "";
        }
        int i = g.a[fVar.ordinal()];
        if (i == 1) {
            str = Build.SOC_MODEL;
        } else {
            if (i != 2) {
                wg6.i();
                return null;
            }
            str = Build.SOC_MANUFACTURER;
        }
        str.getClass();
        return str;
    }
}
