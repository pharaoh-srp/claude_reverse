package defpackage;

import android.net.Uri;
import androidx.media3.datasource.DataSourceException;
import androidx.media3.datasource.HttpDataSource$HttpDataSourceException;
import androidx.media3.datasource.HttpDataSource$InvalidResponseCodeException;
import com.pvporbit.freetype.FreeTypeConstants;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes2.dex */
public final class idc extends wd1 {
    public final t82 I;
    public final epk J;
    public final epk K;
    public ug5 L;
    public pqe M;
    public InputStream N;
    public boolean O;
    public long P;
    public long Q;

    static {
        k7b.a("media3.datasource.okhttp");
    }

    public idc(t82 t82Var, epk epkVar) {
        super(true);
        t82Var.getClass();
        this.I = t82Var;
        this.K = epkVar;
        this.J = new epk(20);
    }

    public static pqe t(v82 v82Var) throws IOException {
        exf exfVar = new exf();
        f4e f4eVar = (f4e) v82Var;
        f4eVar.d(new ax5(25, exfVar));
        try {
            return (pqe) exfVar.get();
        } catch (InterruptedException unused) {
            f4eVar.cancel();
            throw new InterruptedIOException();
        } catch (ExecutionException e) {
            throw new IOException(e);
        }
    }

    @Override // defpackage.tg5
    public final long b(ug5 ug5Var) throws HttpDataSource$HttpDataSourceException {
        vs8 vs8VarC;
        this.L = ug5Var;
        this.Q = 0L;
        this.P = 0L;
        q();
        long j = ug5Var.e;
        int i = ug5Var.b;
        long j2 = ug5Var.f;
        String string = ug5Var.a.toString();
        string.getClass();
        try {
            us8 us8Var = new us8();
            us8Var.h(null, string);
            vs8VarC = us8Var.c();
        } catch (IllegalArgumentException unused) {
            vs8VarC = null;
        }
        if (vs8VarC == null) {
            throw new HttpDataSource$HttpDataSourceException("Malformed URL", 1004);
        }
        jie jieVar = new jie();
        jieVar.a = vs8VarC;
        HashMap map = new HashMap();
        epk epkVar = this.K;
        if (epkVar != null) {
            map.putAll(epkVar.s());
        }
        map.putAll(this.J.s());
        map.putAll(ug5Var.d);
        for (Map.Entry entry : map.entrySet()) {
            jieVar.d((String) entry.getKey(), (String) entry.getValue());
        }
        String strA = ws8.a(j, j2);
        if (strA != null) {
            jieVar.a("Range", strA);
        }
        if ((ug5Var.g & 1) != 1) {
            jieVar.a("Accept-Encoding", "identity");
        }
        byte[] bArr = ug5Var.c;
        jieVar.e(ug5.a(i), bArr != null ? tie.create(bArr) : i == 2 ? tie.create(tpi.b) : null);
        try {
            pqe pqeVarT = t(this.I.a(new kie(jieVar)));
            this.M = pqeVarT;
            rqe rqeVar = pqeVarT.K;
            rqeVar.getClass();
            this.N = rqeVar.G0().M0();
            int i2 = pqeVarT.H;
            if (pqeVarT.U) {
                rqeVar.e();
                long j3 = (i2 != 200 || j == 0) ? 0L : j;
                if (j2 != -1) {
                    this.P = j2;
                } else {
                    long jD = rqeVar.d();
                    this.P = jD != -1 ? jD - j3 : -1L;
                }
                this.O = true;
                r(ug5Var);
                try {
                    u(j3);
                    return this.P;
                } catch (HttpDataSource$HttpDataSourceException e) {
                    s();
                    throw e;
                }
            }
            if (i2 == 416 && j == ws8.b(pqeVarT.J.a("Content-Range"))) {
                this.O = true;
                r(ug5Var);
                if (j2 != -1) {
                    return j2;
                }
                return 0L;
            }
            try {
                InputStream inputStream = this.N;
                inputStream.getClass();
                w12.b(inputStream);
            } catch (IOException unused2) {
                String str = tpi.a;
            }
            TreeMap treeMapH = pqeVarT.J.h();
            s();
            throw new HttpDataSource$InvalidResponseCodeException(i2, i2 == 416 ? new DataSourceException(2008) : null, treeMapH);
        } catch (IOException e2) {
            throw HttpDataSource$HttpDataSourceException.a(e2, 1);
        }
    }

    @Override // defpackage.tg5
    public final void close() {
        if (this.O) {
            this.O = false;
            n();
            s();
        }
        this.M = null;
        this.L = null;
    }

    @Override // defpackage.tg5
    public final Map i() {
        pqe pqeVar = this.M;
        return pqeVar == null ? Collections.EMPTY_MAP : pqeVar.J.h();
    }

    @Override // defpackage.tg5
    public final Uri m() {
        pqe pqeVar = this.M;
        if (pqeVar != null) {
            return Uri.parse(pqeVar.E.a.i);
        }
        ug5 ug5Var = this.L;
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
            long r0 = r6.P     // Catch: java.io.IOException -> L32
            r2 = -1
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r3 = -1
            if (r2 == 0) goto L1d
            long r4 = r6.Q     // Catch: java.io.IOException -> L32
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
            java.io.InputStream r0 = r6.N     // Catch: java.io.IOException -> L32
            java.lang.String r1 = defpackage.tpi.a     // Catch: java.io.IOException -> L32
            int r7 = r0.read(r7, r8, r9)     // Catch: java.io.IOException -> L32
            if (r7 != r3) goto L28
        L27:
            return r3
        L28:
            long r8 = r6.Q     // Catch: java.io.IOException -> L32
            long r0 = (long) r7     // Catch: java.io.IOException -> L32
            long r8 = r8 + r0
            r6.Q = r8     // Catch: java.io.IOException -> L32
            r6.j(r7)     // Catch: java.io.IOException -> L32
            return r7
        L32:
            r6 = move-exception
            java.lang.String r7 = defpackage.tpi.a
            r7 = 2
            androidx.media3.datasource.HttpDataSource$HttpDataSourceException r6 = androidx.media3.datasource.HttpDataSource$HttpDataSourceException.a(r6, r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.idc.read(byte[], int, int):int");
    }

    public final void s() {
        pqe pqeVar = this.M;
        if (pqeVar != null) {
            rqe rqeVar = pqeVar.K;
            rqeVar.getClass();
            rqeVar.close();
        }
        this.N = null;
    }

    public final void u(long j) throws HttpDataSource$HttpDataSourceException {
        if (j == 0) {
            return;
        }
        byte[] bArr = new byte[FreeTypeConstants.FT_LOAD_MONOCHROME];
        while (j > 0) {
            try {
                int iMin = (int) Math.min(j, 4096L);
                InputStream inputStream = this.N;
                String str = tpi.a;
                int i = inputStream.read(bArr, 0, iMin);
                if (Thread.currentThread().isInterrupted()) {
                    throw new InterruptedIOException();
                }
                if (i == -1) {
                    throw new HttpDataSource$HttpDataSourceException(2008);
                }
                j -= (long) i;
                j(i);
            } catch (IOException e) {
                if (!(e instanceof HttpDataSource$HttpDataSourceException)) {
                    throw new HttpDataSource$HttpDataSourceException(2000);
                }
                throw ((HttpDataSource$HttpDataSourceException) e);
            }
        }
    }
}
