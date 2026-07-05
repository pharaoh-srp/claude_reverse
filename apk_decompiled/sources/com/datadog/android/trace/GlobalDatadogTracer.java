package com.datadog.android.trace;

import defpackage.mdj;
import defpackage.xk5;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/datadog/android/trace/GlobalDatadogTracer;", "", "Lxk5;", "getOrNull", "()Lxk5;", "dd-sdk-android-trace_release"}, k = 1, mv = {1, 8, 0}, xi = mdj.f)
public final class GlobalDatadogTracer {
    public static final GlobalDatadogTracer INSTANCE = new GlobalDatadogTracer();
    public static final AtomicReference a = new AtomicReference();

    public final xk5 getOrNull() {
        return (xk5) a.get();
    }
}
