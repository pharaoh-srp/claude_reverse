package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.ProfilingResult;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes3.dex */
public final class cxc implements ajd {
    public final ExecutorService E;
    public CancellationSignal F;
    public volatile long I;
    public volatile long J;
    public volatile String K;
    public volatile h99 M;
    public final AtomicReference H = new AtomicReference(um6.E);
    public volatile int O = 4;
    public final LinkedHashSet L = new LinkedHashSet();
    public final ConcurrentHashMap N = new ConcurrentHashMap();
    public final axc G = new Consumer() { // from class: axc
        @Override // java.util.function.Consumer
        public final void accept(Object obj) {
            String str;
            String resultFilePath;
            cxc cxcVar = this.a;
            ProfilingResult profilingResult = (ProfilingResult) obj;
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j = (cxcVar.J > 0 ? cxcVar.J : jCurrentTimeMillis) - cxcVar.I;
            long j2 = cxcVar.J > 0 ? jCurrentTimeMillis - cxcVar.J : 0L;
            if (profilingResult.getErrorCode() == 0 && (resultFilePath = profilingResult.getResultFilePath()) != null) {
                long j3 = cxcVar.I;
                String tag = profilingResult.getTag();
                if (tag == null) {
                    tag = "";
                }
                dxc dxcVar = new dxc(j3, jCurrentTimeMillis, tag, resultFilePath);
                ConcurrentHashMap concurrentHashMap = cxcVar.N;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : concurrentHashMap.entrySet()) {
                    if (((Set) cxcVar.H.get()).contains(entry.getKey())) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                Iterator it = linkedHashMap.entrySet().iterator();
                while (it.hasNext()) {
                    jjd jjdVar = ((gjd) ((Map.Entry) it.next()).getValue()).a;
                    jjdVar.J = dxcVar;
                    jjdVar.d();
                    jjdVar.E.p(new hjd(jjdVar, 0), "profiling", true);
                }
            }
            cxcVar.H.set(um6.E);
            int i = cxcVar.O;
            String str2 = cxcVar.K;
            if (i == 1) {
                str = "application_launch";
            } else if (i == 2) {
                str = "rum_operation";
            } else if (i == 3) {
                str = "continuous";
            } else {
                if (i != 4) {
                    throw null;
                }
                str = "unknown";
            }
            bxc bxcVar = new bxc(str, str2, profilingResult.getErrorCode(), profilingResult.getErrorMessage(), profilingResult.getResultFilePath(), j, j2, cxcVar.J > 0 ? "manual" : profilingResult.getErrorCode() == 0 ? "timeout" : "error");
            h99 h99Var = cxcVar.M;
            if (h99Var != null) {
                cxcVar.b(h99Var, bxcVar);
            } else {
                synchronized (cxcVar.L) {
                    cxcVar.L.add(bxcVar);
                }
            }
        }
    };

    /* JADX WARN: Type inference failed for: r1v5, types: [axc] */
    public cxc(uu5 uu5Var, ExecutorService executorService) {
        this.E = executorService;
    }

    @Override // defpackage.ajd
    public final void a(String str) {
        str.getClass();
        if (((Set) this.H.get()).contains(str)) {
            CancellationSignal cancellationSignal = this.F;
            if (cancellationSignal != null) {
                cancellationSignal.cancel();
            }
            this.J = System.currentTimeMillis();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(defpackage.h99 r12, defpackage.bxc r13) {
        /*
            r11 = this;
            qs7 r0 = defpackage.qs7.d0
            cpc r1 = new cpc
            java.lang.String r2 = "metric_type"
            java.lang.String r3 = "profiling session"
            r1.<init>(r2, r3)
            int r2 = r13.c
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            cpc r3 = new cpc
            java.lang.String r4 = "error_code"
            r3.<init>(r4, r2)
            java.lang.String r2 = r13.a
            cpc r4 = new cpc
            java.lang.String r5 = "start_reason"
            r4.<init>(r5, r2)
            long r5 = r13.f
            java.lang.Long r2 = java.lang.Long.valueOf(r5)
            cpc r5 = new cpc
            java.lang.String r6 = "duration"
            r5.<init>(r6, r2)
            long r6 = r13.g
            java.lang.Long r2 = java.lang.Long.valueOf(r6)
            cpc r6 = new cpc
            java.lang.String r7 = "callback_delay_ms"
            r6.<init>(r7, r2)
            java.lang.String r2 = r13.d
            cpc r7 = new cpc
            java.lang.String r8 = "error_message"
            r7.<init>(r8, r2)
            java.lang.String r2 = r13.e
            h99 r11 = r11.M
            if (r11 == 0) goto L62
            if (r2 == 0) goto L5a
            java.io.File r8 = new java.io.File
            r8.<init>(r2)
            long r8 = defpackage.fd9.i0(r8, r11)
            java.lang.Long r11 = java.lang.Long.valueOf(r8)
            goto L5b
        L5a:
            r11 = 0
        L5b:
            if (r11 == 0) goto L62
            long r8 = r11.longValue()
            goto L64
        L62:
            r8 = 0
        L64:
            java.lang.Long r11 = java.lang.Long.valueOf(r8)
            cpc r8 = new cpc
            java.lang.String r2 = "file_size"
            r8.<init>(r2, r11)
            java.lang.String r11 = r13.h
            cpc r9 = new cpc
            java.lang.String r2 = "stopped_reason"
            r9.<init>(r2, r11)
            java.lang.String r11 = r13.b
            cpc r10 = new cpc
            java.lang.String r13 = "app_start_info"
            r10.<init>(r13, r11)
            cpc[] r11 = new defpackage.cpc[]{r3, r4, r5, r6, r7, r8, r9, r10}
            java.util.Map r11 = defpackage.sta.h0(r11)
            cpc r13 = new cpc
            java.lang.String r2 = "profiling_session"
            r13.<init>(r2, r11)
            r11 = 5120(0x1400, float:7.175E-42)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            cpc r2 = new cpc
            java.lang.String r3 = "buffer_size"
            r2.<init>(r3, r11)
            r11 = 201(0xc9, float:2.82E-43)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            cpc r3 = new cpc
            java.lang.String r4 = "sampling_frequency"
            r3.<init>(r4, r11)
            cpc[] r11 = new defpackage.cpc[]{r2, r3}
            java.util.Map r11 = defpackage.sta.h0(r11)
            cpc r2 = new cpc
            java.lang.String r3 = "profiling_config"
            r2.<init>(r3, r11)
            cpc[] r11 = new defpackage.cpc[]{r1, r13, r2}
            java.util.Map r11 = defpackage.sta.h0(r11)
            r13 = 1120403456(0x42c80000, float:100.0)
            defpackage.dch.J(r12, r0, r11, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cxc.b(h99, bxc):void");
    }

    @Override // defpackage.ajd
    public final void d(String str, gjd gjdVar) {
        str.getClass();
        this.N.put(str, gjdVar);
    }

    @Override // defpackage.ajd
    public final void e(Context context, Map map, Set set) {
        AtomicReference atomicReference = this.H;
        um6 um6Var = um6.E;
        while (!atomicReference.compareAndSet(um6Var, set)) {
            if (atomicReference.get() != um6Var) {
                return;
            }
        }
        this.I = System.currentTimeMillis();
        this.J = 0L;
        this.O = 1;
        this.K = (String) map.get("app_start_info");
        CancellationSignal cancellationSignal = new CancellationSignal();
        this.F = cancellationSignal;
        Bundle bundle = new Bundle();
        bundle.putInt("KEY_FREQUENCY_HZ", 201);
        bundle.putInt("KEY_SIZE_KB", 5120);
        bundle.putInt("KEY_DURATION_MS", yr6.INVALID_OWNERSHIP);
        bs.d(context.getSystemService(bs.e())).requestProfiling(3, bundle, "application_launch", cancellationSignal, this.E, this.G);
    }

    @Override // defpackage.ajd
    public final void h(h99 h99Var) {
        this.M = h99Var;
        if (h99Var != null) {
            synchronized (this.L) {
                try {
                    Iterator it = this.L.iterator();
                    while (it.hasNext()) {
                        b(h99Var, (bxc) it.next());
                    }
                    this.L.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // defpackage.ajd
    public final void l(String str) {
        str.getClass();
        this.N.remove(str);
    }

    @Override // defpackage.ajd
    public final boolean n(String str) {
        str.getClass();
        return ((Set) this.H.get()).contains(str);
    }
}
