package defpackage;

import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class mk5 {
    static {
        Set setZ0 = mp0.Z0(new String[]{"x-datadog-origin", "x-datadog-parent-id", "x-datadog-trace-id", "x-datadog-tags", "x-datadog-sampling-priority"});
        Set setZ02 = mp0.Z0(new String[]{"X-B3-TraceId", "X-B3-SpanId", "X-B3-Sampled"});
        dxf.q0(dxf.p0(dxf.p0(setZ0, setZ02), mp0.Z0(new String[]{"traceparent", "tracestate"})), "b3");
    }
}
