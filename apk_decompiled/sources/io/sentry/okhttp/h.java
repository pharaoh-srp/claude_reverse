package io.sentry.okhttp;

import com.anthropic.claude.api.login.VerifyMagicLinkRequest;
import defpackage.de7;
import defpackage.dj2;
import defpackage.f89;
import defpackage.kie;
import defpackage.p8b;
import defpackage.pqe;
import defpackage.rqe;
import defpackage.tie;
import defpackage.wg8;
import defpackage.x44;
import io.sentry.a1;
import io.sentry.h1;
import io.sentry.m;
import io.sentry.n0;
import io.sentry.n4;
import io.sentry.p;
import io.sentry.r5;
import io.sentry.t5;
import io.sentry.w6;
import java.nio.charset.Charset;
import java.util.LinkedHashMap;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class h implements f89 {
    public final h1 E;

    static {
        r5.d().b("maven:io.sentry:sentry-okhttp", "8.43.1");
    }

    public h() {
        x44.W(new de7(500, 599));
        x44.W(w6.DEFAULT_PROPAGATION_TARGETS);
        this.E = n4.a;
        p.a("OkHttp");
    }

    public static io.sentry.internal.debugmeta.c a(h hVar, pqe pqeVar) {
        Charset charsetA;
        pqeVar.getClass();
        a1 logger = hVar.E.r().getLogger();
        logger.getClass();
        rqe rqeVar = pqeVar.K;
        if (rqeVar != null) {
            try {
                p8b p8bVarE = rqeVar.e();
                String str = p8bVarE != null ? p8bVarE.a : null;
                byte[] bArrC = pqeVar.d(153601L).c();
                String strName = (p8bVarE == null || (charsetA = p8bVarE.a(dj2.a)) == null) ? null : charsetA.name();
                if (strName == null) {
                    strName = "UTF-8";
                }
                return io.sentry.util.c.b(bArrC, str, strName, logger);
            } catch (Exception e) {
                logger.h(t5.ERROR, "Failed to read http response body for Network Details: " + e.getMessage(), new Object[0]);
            }
        }
        return null;
    }

    public static LinkedHashMap d(wg8 wg8Var) {
        wg8Var.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int size = wg8Var.size();
        for (int i = 0; i < size; i++) {
            String strE = wg8Var.e(i);
            String strK = wg8Var.k(i);
            String str = (String) linkedHashMap.get(strE);
            if (str != null) {
                linkedHashMap.put(strE, str + "; " + strK);
            } else {
                linkedHashMap.put(strE, strK);
            }
        }
        return linkedHashMap;
    }

    public final void b(kie kieVar, Integer num, pqe pqeVar, long j, io.sentry.util.network.e eVar) {
        rqe rqeVar;
        String str = kieVar.a.i;
        String str2 = kieVar.b;
        io.sentry.g gVar = new io.sentry.g();
        m mVarS = p.s(str);
        gVar.I = "http";
        gVar.K = "http";
        String str3 = (String) mVarS.b;
        if (str3 != null) {
            gVar.c("url", str3);
        }
        gVar.c(VerifyMagicLinkRequest.Credentials.DISCRIMINATOR, str2.toUpperCase(Locale.ROOT));
        String str4 = (String) mVarS.c;
        if (str4 != null) {
            gVar.c("http.query", str4);
        }
        String str5 = (String) mVarS.d;
        if (str5 != null) {
            gVar.c("http.fragment", str5);
        }
        Long lValueOf = null;
        if (num != null) {
            gVar.c("status_code", num);
            gVar.M = io.sentry.util.d.a(num.intValue()) ? t5.WARNING : io.sentry.util.d.b(num.intValue()) ? t5.ERROR : null;
        }
        tie tieVar = kieVar.d;
        Long lValueOf2 = tieVar != null ? Long.valueOf(tieVar.contentLength()) : null;
        if (lValueOf2 != null && lValueOf2.longValue() != -1) {
            gVar.c("http.request_content_length", Long.valueOf(lValueOf2.longValue()));
        }
        if (pqeVar != null && (rqeVar = pqeVar.K) != null) {
            lValueOf = Long.valueOf(rqeVar.d());
        }
        if (lValueOf != null && lValueOf.longValue() != -1) {
            gVar.c("http.response_content_length", Long.valueOf(lValueOf.longValue()));
        }
        n0 n0Var = new n0();
        n0Var.d("okHttp:request", kieVar);
        if (pqeVar != null) {
            n0Var.d("okHttp:response", pqeVar);
        }
        if (eVar != null) {
            n0Var.d("sentry:replayNetworkDetails", eVar);
        }
        gVar.c("http.start_timestamp", Long.valueOf(j));
        gVar.c("http.end_timestamp", Long.valueOf(System.currentTimeMillis()));
        this.E.j(gVar, n0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:126:0x026f A[Catch: all -> 0x01cb, TRY_ENTER, TryCatch #5 {all -> 0x01cb, blocks: (B:84:0x01c5, B:126:0x026f, B:127:0x0277), top: B:152:0x00fc }] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00fa A[EDGE_INSN: B:162:0x00fa->B:58:0x00fa BREAK  A[LOOP:0: B:41:0x00c0->B:163:0x00c0], PHI: r10
      0x00fa: PHI (r10v17 ??) = (r10v21 ??), (r10v1 ??), (r10v22 ??) binds: [B:48:0x00d7, B:166:0x00fa, B:162:0x00fa] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.util.Iterator] */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v20, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v21 */
    /* JADX WARN: Type inference failed for: r10v22, types: [boolean] */
    /* JADX WARN: Type inference failed for: r10v23 */
    /* JADX WARN: Type inference failed for: r10v24 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7, types: [java.lang.Integer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v12 */
    /* JADX WARN: Type inference failed for: r17v13 */
    /* JADX WARN: Type inference failed for: r17v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r17v7 */
    /* JADX WARN: Type inference failed for: r17v8, types: [pqe] */
    /* JADX WARN: Type inference failed for: r17v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r23v0, types: [io.sentry.okhttp.h, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v17, types: [pqe] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v30 */
    /* JADX WARN: Type inference failed for: r2v4, types: [pqe] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r4v6, types: [pqe] */
    /* JADX WARN: Type inference failed for: r4v7, types: [pqe] */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v8, types: [io.sentry.p1] */
    /* JADX WARN: Type inference failed for: r6v9 */
    @Override // defpackage.f89
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.pqe c(defpackage.v4e r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 760
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.okhttp.h.c(v4e):pqe");
    }
}
