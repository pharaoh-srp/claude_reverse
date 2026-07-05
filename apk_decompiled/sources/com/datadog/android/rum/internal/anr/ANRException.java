package com.datadog.android.rum.internal.anr;

import defpackage.mdj;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lcom/datadog/android/rum/internal/anr/ANRException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "dd-sdk-android-rum_release"}, k = 1, mv = {1, 8, 0}, xi = mdj.f)
public final class ANRException extends Exception {
    public ANRException(Thread thread) {
        setStackTrace(thread.getStackTrace());
    }
}
