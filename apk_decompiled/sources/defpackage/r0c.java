package defpackage;

import com.anthropic.claude.core.telemetry.ClaudeRegionUnavailableException;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public abstract class r0c {
    public static final Set a = mp0.Z0(new String[]{"Canceled", "canceled"});
    public static final List b = x44.W("The request was canceled!");
    public static final List c = x44.X("ERR_INTERNET_DISCONNECTED", "ERR_NAME_NOT_RESOLVED", "ERR_ADDRESS_UNREACHABLE", "ERR_NETWORK_CHANGED", "ERR_CONNECTION_CLOSED", "ERR_CONNECTION_RESET", "ERR_CONNECTION_REFUSED", "ERR_CONNECTION_ABORTED", "ERR_CONNECTION_FAILED", "ERR_CONNECTION_TIMED_OUT", "ERR_TIMED_OUT", "ERR_EMPTY_RESPONSE", "ERR_QUIC_PROTOCOL_ERROR", "ERR_HTTP2_PROTOCOL_ERROR", "ERR_HTTP2_SERVER_REFUSED_STREAM", "ERR_HTTP2_PING_FAILED", "ERR_SOCKET_NOT_CONNECTED", "ERR_NETWORK_IO_SUSPENDED", "ERR_PROXY_CONNECTION_FAILED");
    public static final List d = x44.X("ERR_CERT_", "ERR_SSL_PROTOCOL_ERROR", "ERR_SSL_VERSION_OR_CIPHER_MISMATCH", "ERR_SSL_BAD_RECORD_MAC_ALERT");
    public static final List e = x44.W("Required SETTINGS preface not received");

    public static final boolean a(String str, List list) {
        if (str != null) {
            List list2 = list;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    if (bsg.u0(str, (String) it.next(), false)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final boolean b(Throwable th) {
        th.getClass();
        for (Throwable th2 : bnf.Z(new jua(24), th)) {
            if (c(th2) || (th2 instanceof ClaudeRegionUnavailableException)) {
                return true;
            }
            boolean z = th2 instanceof IOException;
            if (z && w44.G0(a, th2.getMessage())) {
                return true;
            }
            if (z && a(th2.getMessage(), b)) {
                return true;
            }
            if (z && a(th2.getMessage(), d)) {
                return true;
            }
            if (z && a(th2.getMessage(), e)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean c(java.lang.Throwable r8) {
        /*
            r8.getClass()
            boolean r0 = r8 instanceof java.net.SocketException
            r1 = 1
            if (r0 == 0) goto La
            goto Lab
        La:
            boolean r0 = r8 instanceof java.io.InterruptedIOException
            if (r0 == 0) goto L10
            goto Lab
        L10:
            boolean r0 = r8 instanceof java.io.EOFException
            if (r0 == 0) goto L16
            goto Lab
        L16:
            boolean r0 = r8 instanceof java.net.UnknownHostException
            if (r0 == 0) goto L1c
            goto Lab
        L1c:
            boolean r0 = r8 instanceof okhttp3.internal.http2.StreamResetException
            if (r0 == 0) goto L22
            goto Lab
        L22:
            boolean r0 = r8 instanceof okhttp3.internal.http2.ConnectionShutdownException
            if (r0 == 0) goto L28
            goto Lab
        L28:
            boolean r0 = r8 instanceof com.google.net.cronet.okhttptransport.CronetTimeoutException
            if (r0 == 0) goto L2e
            goto Lab
        L2e:
            boolean r0 = r8 instanceof java.io.IOException
            r2 = 24
            r3 = 0
            if (r0 == 0) goto L82
            jua r4 = new jua
            r4.<init>(r2)
            ymf r4 = defpackage.bnf.Z(r4, r8)
            java.util.Iterator r4 = r4.iterator()
        L42:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L82
            java.lang.Object r5 = r4.next()
            java.lang.Throwable r5 = (java.lang.Throwable) r5
            java.lang.String r5 = r5.getMessage()
            if (r5 == 0) goto L42
            java.util.List r6 = defpackage.r0c.c
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            boolean r7 = r6 instanceof java.util.Collection
            if (r7 == 0) goto L66
            r7 = r6
            java.util.Collection r7 = (java.util.Collection) r7
            boolean r7 = r7.isEmpty()
            if (r7 == 0) goto L66
            goto L7e
        L66:
            java.util.Iterator r6 = r6.iterator()
        L6a:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L7e
            java.lang.Object r7 = r6.next()
            java.lang.String r7 = (java.lang.String) r7
            boolean r7 = defpackage.bsg.u0(r5, r7, r3)
            if (r7 == 0) goto L6a
            r5 = r1
            goto L7f
        L7e:
            r5 = r3
        L7f:
            if (r5 != r1) goto L42
            goto Lab
        L82:
            if (r0 == 0) goto Lac
            jua r0 = new jua
            r0.<init>(r2)
            ymf r8 = defpackage.bnf.Z(r0, r8)
            java.util.Iterator r8 = r8.iterator()
        L91:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto Lac
            java.lang.Object r0 = r8.next()
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            java.lang.String r0 = r0.getMessage()
            if (r0 == 0) goto L91
            java.lang.String r2 = "UploadDataProvider"
            boolean r0 = defpackage.bsg.u0(r0, r2, r3)
            if (r0 != r1) goto L91
        Lab:
            return r1
        Lac:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r0c.c(java.lang.Throwable):boolean");
    }
}
