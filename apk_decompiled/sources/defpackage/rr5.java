package defpackage;

import android.net.TrafficStats;
import android.net.Uri;
import androidx.media3.datasource.HttpDataSource$HttpDataSourceException;
import com.pvporbit.freetype.FreeTypeConstants;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class rr5 extends wd1 {
    public final int I;
    public final int J;
    public final epk K;
    public final epk L;
    public ug5 M;
    public HttpURLConnection N;
    public InputStream O;
    public boolean P;
    public int Q;
    public long R;
    public long S;

    public rr5(int i, int i2, epk epkVar) {
        super(true);
        this.I = i;
        this.J = i2;
        this.K = epkVar;
        this.L = new epk(20);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0142  */
    @Override // defpackage.tg5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long b(defpackage.ug5 r27) throws androidx.media3.datasource.HttpDataSource$HttpDataSourceException {
        /*
            Method dump skipped, instruction units count: 473
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rr5.b(ug5):long");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.tg5
    public final void close() {
        try {
            InputStream inputStream = this.O;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    String str = tpi.a;
                    throw new HttpDataSource$HttpDataSourceException(e, 2000, 3);
                }
            }
        } finally {
            this.O = null;
            s();
            if (this.P) {
                this.P = false;
                n();
            }
            this.N = null;
            this.M = null;
            TrafficStats.clearThreadStatsTag();
        }
    }

    @Override // defpackage.tg5
    public final Map i() {
        HttpURLConnection httpURLConnection = this.N;
        return httpURLConnection == null ? aee.K : new qr5(httpURLConnection.getHeaderFields());
    }

    @Override // defpackage.tg5
    public final Uri m() {
        HttpURLConnection httpURLConnection = this.N;
        if (httpURLConnection != null) {
            return Uri.parse(httpURLConnection.getURL().toString());
        }
        ug5 ug5Var = this.M;
        if (ug5Var != null) {
            return ug5Var.a;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0028 A[Catch: IOException -> 0x0032, TRY_LEAVE, TryCatch #0 {IOException -> 0x0032, blocks: (B:5:0x0004, B:7:0x000d, B:10:0x0017, B:11:0x001d, B:14:0x0028), top: B:19:0x0004 }] */
    @Override // defpackage.og5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int read(byte[] r7, int r8, int r9) throws androidx.media3.datasource.HttpDataSource$HttpDataSourceException {
        /*
            r6 = this;
            if (r9 != 0) goto L4
            r6 = 0
            return r6
        L4:
            long r0 = r6.R     // Catch: java.io.IOException -> L32
            r2 = -1
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r3 = -1
            if (r2 == 0) goto L1d
            long r4 = r6.S     // Catch: java.io.IOException -> L32
            long r0 = r0 - r4
            r4 = 0
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 != 0) goto L17
            goto L27
        L17:
            long r4 = (long) r9     // Catch: java.io.IOException -> L32
            long r0 = java.lang.Math.min(r4, r0)     // Catch: java.io.IOException -> L32
            int r9 = (int) r0     // Catch: java.io.IOException -> L32
        L1d:
            java.io.InputStream r0 = r6.O     // Catch: java.io.IOException -> L32
            java.lang.String r1 = defpackage.tpi.a     // Catch: java.io.IOException -> L32
            int r7 = r0.read(r7, r8, r9)     // Catch: java.io.IOException -> L32
            if (r7 != r3) goto L28
        L27:
            return r3
        L28:
            long r8 = r6.S     // Catch: java.io.IOException -> L32
            long r0 = (long) r7     // Catch: java.io.IOException -> L32
            long r8 = r8 + r0
            r6.S = r8     // Catch: java.io.IOException -> L32
            r6.j(r7)     // Catch: java.io.IOException -> L32
            return r7
        L32:
            r6 = move-exception
            java.lang.String r7 = defpackage.tpi.a
            r7 = 2
            androidx.media3.datasource.HttpDataSource$HttpDataSourceException r6 = androidx.media3.datasource.HttpDataSource$HttpDataSourceException.a(r6, r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rr5.read(byte[], int, int):int");
    }

    public final void s() {
        HttpURLConnection httpURLConnection = this.N;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e) {
                ysj.k("DefaultHttpDataSource", "Unexpected error while disconnecting", e);
            }
        }
    }

    public final HttpURLConnection t(URL url, int i, byte[] bArr, long j, long j2, boolean z, boolean z2, Map map) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(this.I);
        httpURLConnection.setReadTimeout(this.J);
        HashMap map2 = new HashMap();
        epk epkVar = this.K;
        if (epkVar != null) {
            map2.putAll(epkVar.s());
        }
        map2.putAll(this.L.s());
        map2.putAll(map);
        for (Map.Entry entry : map2.entrySet()) {
            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        String strA = ws8.a(j, j2);
        if (strA != null) {
            httpURLConnection.setRequestProperty("Range", strA);
        }
        httpURLConnection.setRequestProperty("Accept-Encoding", z ? "gzip" : "identity");
        httpURLConnection.setInstanceFollowRedirects(z2);
        httpURLConnection.setDoOutput(bArr != null);
        httpURLConnection.setRequestMethod(ug5.a(i));
        if (bArr == null) {
            httpURLConnection.connect();
            return httpURLConnection;
        }
        httpURLConnection.setFixedLengthStreamingMode(bArr.length);
        httpURLConnection.connect();
        OutputStream outputStream = httpURLConnection.getOutputStream();
        outputStream.write(bArr);
        outputStream.close();
        return httpURLConnection;
    }

    public final void u(long j) throws IOException {
        if (j == 0) {
            return;
        }
        byte[] bArr = new byte[FreeTypeConstants.FT_LOAD_MONOCHROME];
        while (j > 0) {
            int iMin = (int) Math.min(j, 4096L);
            InputStream inputStream = this.O;
            String str = tpi.a;
            int i = inputStream.read(bArr, 0, iMin);
            if (Thread.currentThread().isInterrupted()) {
                throw new HttpDataSource$HttpDataSourceException(new InterruptedIOException(), 2000, 1);
            }
            if (i == -1) {
                throw new HttpDataSource$HttpDataSourceException(2008);
            }
            j -= (long) i;
            j(i);
        }
    }
}
