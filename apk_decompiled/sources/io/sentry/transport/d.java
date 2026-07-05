package io.sentry.transport;

import defpackage.lf5;
import io.sentry.t5;
import io.sentry.t6;
import io.sentry.w6;
import io.sentry.y;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Authenticator;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;
import java.util.zip.GZIPOutputStream;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes.dex */
public final class d {
    public static final Charset e = Charset.forName("UTF-8");
    public final Proxy a;
    public final y b;
    public final w6 c;
    public final lf5 d;

    public d(w6 w6Var, y yVar, lf5 lf5Var) {
        Proxy proxy;
        this.b = yVar;
        this.c = w6Var;
        this.d = lf5Var;
        t6 proxy2 = w6Var.getProxy();
        if (proxy2 != null) {
            try {
                proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress(proxy2.a(), Integer.parseInt(proxy2.c())));
            } catch (NumberFormatException e2) {
                this.c.getLogger().b(t5.ERROR, e2, "Failed to parse Sentry Proxy port: " + proxy2.c() + ". Proxy is ignored", new Object[0]);
                proxy = null;
            }
        } else {
            proxy = null;
        }
        this.a = proxy;
        if (proxy == null || w6Var.getProxy() == null) {
            return;
        }
        String strD = w6Var.getProxy().d();
        String strB = w6Var.getProxy().b();
        if (strD == null || strB == null) {
            return;
        }
        Authenticator.setDefault(new k(strD, strB));
    }

    public static void a(HttpURLConnection httpURLConnection) {
        try {
            httpURLConnection.getInputStream().close();
        } catch (IOException unused) {
        } finally {
            httpURLConnection.disconnect();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0045 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String b(java.net.HttpURLConnection r4) {
        /*
            java.io.InputStream r4 = r4.getErrorStream()     // Catch: java.io.IOException -> L4e
            java.io.BufferedReader r0 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L38
            java.io.InputStreamReader r1 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L38
            java.nio.charset.Charset r2 = io.sentry.transport.d.e     // Catch: java.lang.Throwable -> L38
            r1.<init>(r4, r2)     // Catch: java.lang.Throwable -> L38
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L38
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L24
            r1.<init>()     // Catch: java.lang.Throwable -> L24
            r2 = 1
        L16:
            java.lang.String r3 = r0.readLine()     // Catch: java.lang.Throwable -> L24
            if (r3 == 0) goto L2b
            if (r2 != 0) goto L26
            java.lang.String r2 = "\n"
            r1.append(r2)     // Catch: java.lang.Throwable -> L24
            goto L26
        L24:
            r1 = move-exception
            goto L3a
        L26:
            r1.append(r3)     // Catch: java.lang.Throwable -> L24
            r2 = 0
            goto L16
        L2b:
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L24
            r0.close()     // Catch: java.lang.Throwable -> L38
            if (r4 == 0) goto L37
            r4.close()     // Catch: java.io.IOException -> L4e
        L37:
            return r1
        L38:
            r0 = move-exception
            goto L43
        L3a:
            r0.close()     // Catch: java.lang.Throwable -> L3e
            goto L42
        L3e:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch: java.lang.Throwable -> L38
        L42:
            throw r1     // Catch: java.lang.Throwable -> L38
        L43:
            if (r4 == 0) goto L4d
            r4.close()     // Catch: java.lang.Throwable -> L49
            goto L4d
        L49:
            r4 = move-exception
            r0.addSuppressed(r4)     // Catch: java.io.IOException -> L4e
        L4d:
            throw r0     // Catch: java.io.IOException -> L4e
        L4e:
            java.lang.String r4 = "Failed to obtain error message while analyzing send failure."
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.transport.d.b(java.net.HttpURLConnection):java.lang.String");
    }

    public final io.sentry.config.a c(HttpURLConnection httpURLConnection) {
        w6 w6Var = this.c;
        try {
            try {
                int responseCode = httpURLConnection.getResponseCode();
                e(httpURLConnection, responseCode);
                if (responseCode == 200) {
                    w6Var.getLogger().h(t5.DEBUG, "Envelope sent successfully.", new Object[0]);
                    return q.c;
                }
                if (responseCode == 413) {
                    w6Var.getLogger().h(t5.ERROR, "Envelope was discarded by the server because it was too large. Consider reducing the size of events, breadcrumbs, or attachments. You can use the `SentryOptions.onOversizedEvent` callback to customize how oversized events are handled.", new Object[0]);
                } else {
                    w6Var.getLogger().h(t5.ERROR, "Request failed, API returned %s", Integer.valueOf(responseCode));
                }
                if (w6Var.isDebug()) {
                    w6Var.getLogger().h(t5.ERROR, "%s", b(httpURLConnection));
                }
                return io.sentry.config.a.m(responseCode);
            } catch (IOException e2) {
                w6Var.getLogger().b(t5.ERROR, e2, "Error reading and logging the response stream", new Object[0]);
                a(httpURLConnection);
                return io.sentry.config.a.l();
            }
        } finally {
            a(httpURLConnection);
        }
    }

    public final io.sentry.config.a d(io.sentry.internal.debugmeta.c cVar) {
        w6 w6Var = this.c;
        w6Var.getSocketTagger().e();
        y yVar = this.b;
        URL url = (URL) yVar.F;
        Proxy proxy = this.a;
        HttpURLConnection httpURLConnection = (HttpURLConnection) (proxy == null ? url.openConnection() : url.openConnection(proxy));
        for (Map.Entry entry : ((HashMap) yVar.G).entrySet()) {
            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Content-Type", "application/x-sentry-envelope");
        httpURLConnection.setRequestProperty("Accept", "application/json");
        httpURLConnection.setRequestProperty("Connection", "close");
        httpURLConnection.setConnectTimeout(w6Var.getConnectionTimeoutMillis());
        httpURLConnection.setReadTimeout(w6Var.getReadTimeoutMillis());
        SSLSocketFactory sslSocketFactory = w6Var.getSslSocketFactory();
        if ((httpURLConnection instanceof HttpsURLConnection) && sslSocketFactory != null) {
            ((HttpsURLConnection) httpURLConnection).setSSLSocketFactory(sslSocketFactory);
        }
        httpURLConnection.connect();
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                try {
                    w6Var.getSerializer().e(cVar, gZIPOutputStream);
                    gZIPOutputStream.close();
                    if (outputStream != null) {
                        outputStream.close();
                    }
                } finally {
                }
            } finally {
            }
        } finally {
            try {
            } finally {
            }
        }
        return c(httpURLConnection);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ea A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(java.net.HttpURLConnection r19, int r20) {
        /*
            Method dump skipped, instruction units count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.transport.d.e(java.net.HttpURLConnection, int):void");
    }
}
