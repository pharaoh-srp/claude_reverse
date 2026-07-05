package defpackage;

import io.sentry.w6;
import java.io.IOException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.chromium.net.CronetEngine;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UrlRequest;

/* JADX INFO: loaded from: classes3.dex */
public final class sb5 implements f89, AutoCloseable {
    public final cke E;
    public final ConcurrentHashMap F = new ConcurrentHashMap();
    public final ScheduledThreadPoolExecutor G;

    public sb5(cke ckeVar) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        this.G = scheduledThreadPoolExecutor;
        this.E = ckeVar;
        scheduledThreadPoolExecutor.scheduleAtFixedRate(new fc(11, this), 500L, 500L, TimeUnit.MILLISECONDS);
    }

    public static qb5 d(CronetEngine cronetEngine) {
        qb5 qb5Var = new qb5();
        qb5Var.F = null;
        cronetEngine.getClass();
        qb5Var.E = cronetEngine;
        fd9.E(qb5.class.equals(qb5.class));
        return qb5Var;
    }

    @Override // defpackage.f89
    public final pqe c(v4e v4eVar) throws IOException {
        UploadDataProvider vieVar = null;
        if (v4eVar.a.V) {
            xh6.c("Canceled");
            return null;
        }
        kie kieVar = v4eVar.e;
        cke ckeVar = this.E;
        int i = v4eVar.g;
        int i2 = v4eVar.h;
        bdc bdcVar = new bdc(i, ckeVar.e);
        CronetEngine cronetEngine = ckeVar.a;
        vs8 vs8Var = kieVar.a;
        wg8 wg8Var = kieVar.c;
        UrlRequest.Builder builderAllowDirectExecutor = cronetEngine.newUrlRequestBuilder(vs8Var.i, bdcVar, y46.E).allowDirectExecutor();
        builderAllowDirectExecutor.setHttpMethod(kieVar.b);
        for (int i3 = 0; i3 < wg8Var.size(); i3++) {
            builderAllowDirectExecutor.addHeader(wg8Var.e(i3), wg8Var.k(i3));
        }
        tie tieVar = kieVar.d;
        if (tieVar != null) {
            if (wg8Var.a("Content-Length") == null && tieVar.contentLength() != -1) {
                builderAllowDirectExecutor.addHeader("Content-Length", String.valueOf(tieVar.contentLength()));
            }
            if (tieVar.contentLength() != 0) {
                if (wg8Var.a("Content-Type") != null || tieVar.contentType() == null) {
                    builderAllowDirectExecutor.addHeader("Content-Type", "application/octet-stream");
                } else {
                    builderAllowDirectExecutor.addHeader("Content-Type", tieVar.contentType().a);
                }
                mvd mvdVar = ckeVar.d;
                long jContentLength = tieVar.contentLength();
                if (jContentLength == -1 || jContentLength > w6.MAX_EVENT_SIZE_BYTES) {
                    vieVar = new vie(tieVar, new jji(), (ExecutorService) ((xzd) mvdVar.G).F, i2);
                } else {
                    Object obj = mvdVar.F;
                    long jContentLength2 = tieVar.contentLength();
                    if (jContentLength2 < 0 || jContentLength2 > w6.MAX_EVENT_SIZE_BYTES) {
                        xh6.c(vb7.m(jContentLength2, "Expected definite length less than 1048576but got "));
                    } else {
                        vieVar = new uie(jContentLength2, tieVar);
                    }
                }
                builderAllowDirectExecutor.setUploadDataProvider(vieVar, ckeVar.b);
            }
        }
        UrlRequest urlRequestBuild = builderAllowDirectExecutor.build();
        ro6 ro6Var = new ro6(urlRequestBuild, new lrb(ckeVar, kieVar, bdcVar));
        this.F.put(v4eVar.a, urlRequestBuild);
        try {
            urlRequestBuild.start();
            return e(v4eVar.a, ro6Var.P());
        } catch (IOException | RuntimeException e) {
            this.F.remove(v4eVar.a);
            throw e;
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.G.shutdown();
    }

    public final pqe e(f4e f4eVar, pqe pqeVar) {
        rqe rqeVar = pqeVar.K;
        rqeVar.getClass();
        if (rqeVar instanceof rb5) {
            return pqeVar;
        }
        nqe nqeVarC = pqeVar.c();
        nqeVarC.g = new rb5(this, rqeVar, f4eVar);
        return nqeVarC.a();
    }
}
