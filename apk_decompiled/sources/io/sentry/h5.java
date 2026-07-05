package io.sentry;

import com.pvporbit.freetype.FreeTypeConstants;
import defpackage.ij0;
import defpackage.mj5;
import defpackage.sz6;
import io.sentry.exception.SentryEnvelopeException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
public final class h5 {
    public static final Charset d = Charset.forName("UTF-8");
    public final i5 a;
    public final Callable b;
    public byte[] c;

    public h5(i5 i5Var, byte[] bArr) {
        this.a = i5Var;
        this.c = bArr;
        this.b = null;
    }

    public static void a(long j, long j2, String str) throws SentryEnvelopeException {
        if (j > j2) {
            throw new SentryEnvelopeException(String.format("Dropping attachment with filename '%s', because the size of the passed bytes with %d bytes is bigger than the maximum allowed attachment size of %d bytes.", str, Long.valueOf(j), Long.valueOf(j2)));
        }
    }

    public static h5 b(long j, a aVar, a1 a1Var, n1 n1Var) {
        io.sentry.internal.debugmeta.c cVar = new io.sentry.internal.debugmeta.c(new e5(j, aVar, a1Var, n1Var));
        return new h5(new i5(s5.Attachment, new d5(cVar, 2), aVar.e, aVar.d, aVar.f), new d5(cVar, 3));
    }

    public static h5 c(n1 n1Var, io.sentry.clientreport.b bVar) {
        p.v("ISerializer is required.", n1Var);
        io.sentry.internal.debugmeta.c cVar = new io.sentry.internal.debugmeta.c(new mj5(n1Var, 6, bVar));
        return new h5(new i5(s5.resolve(bVar), new d5(cVar, 9), "application/json", null, null), new d5(cVar, 10));
    }

    public static h5 d(n1 n1Var, w4 w4Var) {
        p.v("ISerializer is required.", n1Var);
        p.v("SentryEvent is required.", w4Var);
        io.sentry.internal.debugmeta.c cVar = new io.sentry.internal.debugmeta.c(new mj5(n1Var, 5, w4Var));
        return new h5(new i5(s5.resolve(w4Var), new d5(cVar, 6), "application/json", null, null), new d5(cVar, 8));
    }

    public static h5 e(n1 n1Var, y5 y5Var) {
        p.v("ISerializer is required.", n1Var);
        io.sentry.internal.debugmeta.c cVar = new io.sentry.internal.debugmeta.c(new mj5(n1Var, 8, y5Var));
        return new h5(new i5(s5.Log, new d5(cVar, 0), "application/vnd.sentry.items.log+json", (String) null, (String) null, (String) null, Integer.valueOf(y5Var.E.size())), new d5(cVar, 1));
    }

    public static h5 f(n1 n1Var, c6 c6Var) {
        p.v("ISerializer is required.", n1Var);
        io.sentry.internal.debugmeta.c cVar = new io.sentry.internal.debugmeta.c(new mj5(n1Var, 4, c6Var));
        return new h5(new i5(s5.TraceMetric, new d5(cVar, 7), "application/vnd.sentry.items.trace-metric+json", (String) null, (String) null, (String) null, Integer.valueOf(c6Var.E.size())), new d5(cVar, 13));
    }

    public static h5 g(final v3 v3Var, final n1 n1Var, final e1 e1Var) {
        final File file = v3Var.O;
        io.sentry.internal.debugmeta.c cVar = new io.sentry.internal.debugmeta.c(new Callable() { // from class: io.sentry.g5
            @Override // java.util.concurrent.Callable
            public final Object call() throws SentryEnvelopeException {
                n1 n1Var2 = n1Var;
                File file2 = file;
                v3 v3Var2 = v3Var;
                if (file2 != null) {
                    if (!file2.exists()) {
                        throw new SentryEnvelopeException(ij0.j("Dropping profile chunk, because the file '", file2.getName(), "' doesn't exists"));
                    }
                    if ("java".equals(v3Var2.J)) {
                        a3 a3Var = a3.a;
                        e1 e1Var2 = e1Var;
                        if (a3Var == e1Var2) {
                            throw new SentryEnvelopeException("No ProfileConverter available, dropping chunk.");
                        }
                        try {
                            file2.getAbsolutePath();
                            ((a3) e1Var2).getClass();
                            v3Var2.Q = new io.sentry.protocol.profiling.a();
                        } catch (Exception e) {
                            throw new SentryEnvelopeException("Profile conversion failed", e);
                        }
                    } else {
                        try {
                            String str = new String(io.sentry.vendor.a.a(p.t(52428800L, file2.getPath())), "US-ASCII");
                            if (str.isEmpty()) {
                                throw new SentryEnvelopeException("Profiling trace file is empty");
                            }
                            v3Var2.P = str;
                        } catch (UnsupportedEncodingException e2) {
                            sz6.h(e2);
                            return null;
                        }
                    }
                }
                try {
                    try {
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        try {
                            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, h5.d));
                            try {
                                n1Var2.a(v3Var2, bufferedWriter);
                                byte[] byteArray = byteArrayOutputStream.toByteArray();
                                bufferedWriter.close();
                                byteArrayOutputStream.close();
                                return byteArray;
                            } finally {
                            }
                        } catch (Throwable th) {
                            try {
                                byteArrayOutputStream.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    } finally {
                        if (file2 != null) {
                            file2.delete();
                        }
                    }
                } catch (IOException e3) {
                    throw new SentryEnvelopeException("Failed to serialize profile chunk\n" + e3.getMessage());
                }
            }
        });
        return new h5(new i5(s5.ProfileChunk, new d5(cVar, 14), "application-json", file != null ? file.getName() : null, (String) null, v3Var.J, (Integer) null), new d5(cVar, 15));
    }

    public static h5 h(y3 y3Var, long j, n1 n1Var) {
        File file = y3Var.E;
        io.sentry.internal.debugmeta.c cVar = new io.sentry.internal.debugmeta.c(new e5(file, j, y3Var, n1Var));
        return new h5(new i5(s5.Profile, new d5(cVar, 4), "application-json", file.getName(), null), new d5(cVar, 5));
    }

    public static h5 i(final n1 n1Var, final a1 a1Var, final y6 y6Var, final d4 d4Var, final boolean z) {
        final File file = y6Var.T;
        io.sentry.internal.debugmeta.c cVar = new io.sentry.internal.debugmeta.c(new Callable() { // from class: io.sentry.f5
            @Override // java.util.concurrent.Callable
            public final Object call() {
                n1 n1Var2 = n1Var;
                y6 y6Var2 = y6Var;
                File file2 = file;
                a1 a1Var2 = a1Var;
                boolean z2 = z;
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, h5.d));
                        try {
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            n1Var2.a(y6Var2, bufferedWriter);
                            linkedHashMap.put(s5.ReplayEvent.getItemType(), byteArrayOutputStream.toByteArray());
                            byteArrayOutputStream.reset();
                            d4 d4Var2 = d4Var;
                            if (d4Var2 != null) {
                                n1Var2.a(d4Var2, bufferedWriter);
                                linkedHashMap.put(s5.ReplayRecording.getItemType(), byteArrayOutputStream.toByteArray());
                                byteArrayOutputStream.reset();
                            }
                            if (file2 != null && file2.exists()) {
                                byte[] bArrT = p.t(10485760L, file2.getPath());
                                if (bArrT.length > 0) {
                                    linkedHashMap.put(s5.ReplayVideo.getItemType(), bArrT);
                                }
                            }
                            byte[] bArrQ = h5.q(linkedHashMap);
                            bufferedWriter.close();
                            byteArrayOutputStream.close();
                            if (file2 != null) {
                                if (z2) {
                                    return bArrQ;
                                }
                            }
                            return bArrQ;
                        } finally {
                        }
                    } finally {
                    }
                } catch (Throwable th) {
                    try {
                        a1Var2.d(t5.ERROR, "Could not serialize replay recording", th);
                        if (file2 == null) {
                            return null;
                        }
                        if (z2) {
                            p.e(file2.getParentFile());
                            return null;
                        }
                        file2.delete();
                        return null;
                    } finally {
                        if (file2 != null) {
                            if (z2) {
                                p.e(file2.getParentFile());
                            } else {
                                file2.delete();
                            }
                        }
                    }
                }
            }
        });
        return new h5(new i5(s5.ReplayVideo, new d5(cVar, 11), null, null, null), new d5(cVar, 12));
    }

    public static h5 j(n1 n1Var, h7 h7Var) {
        p.v("ISerializer is required.", n1Var);
        p.v("Session is required.", h7Var);
        io.sentry.internal.debugmeta.c cVar = new io.sentry.internal.debugmeta.c(new mj5(n1Var, 7, h7Var));
        return new h5(new i5(s5.Session, new d5(cVar, 16), "application/json", null, null), new d5(cVar, 17));
    }

    public static byte[] q(LinkedHashMap linkedHashMap) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byteArrayOutputStream.write((byte) (linkedHashMap.size() | FreeTypeConstants.FT_LOAD_PEDANTIC));
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                byte[] bytes = ((String) entry.getKey()).getBytes(d);
                int length = bytes.length;
                byteArrayOutputStream.write(-39);
                byteArrayOutputStream.write((byte) length);
                byteArrayOutputStream.write(bytes);
                byte[] bArr = (byte[]) entry.getValue();
                int length2 = bArr.length;
                byteArrayOutputStream.write(-58);
                byteArrayOutputStream.write(ByteBuffer.allocate(4).order(ByteOrder.BIG_ENDIAN).putInt(length2).array());
                byteArrayOutputStream.write(bArr);
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (Throwable th) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final io.sentry.clientreport.b k(n1 n1Var) throws IOException {
        i5 i5Var = this.a;
        if (i5Var == null || i5Var.I != s5.ClientReport) {
            return null;
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(l()), d));
        try {
            io.sentry.clientreport.b bVar = (io.sentry.clientreport.b) n1Var.c(bufferedReader, io.sentry.clientreport.b.class);
            bufferedReader.close();
            return bVar;
        } catch (Throwable th) {
            try {
                bufferedReader.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final byte[] l() {
        Callable callable;
        if (this.c == null && (callable = this.b) != null) {
            this.c = (byte[]) callable.call();
        }
        return this.c;
    }

    public final i5 m() {
        return this.a;
    }

    public final y5 n(n1 n1Var) throws IOException {
        i5 i5Var = this.a;
        if (i5Var == null || i5Var.I != s5.Log) {
            return null;
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(l()), d));
        try {
            y5 y5Var = (y5) n1Var.c(bufferedReader, y5.class);
            bufferedReader.close();
            return y5Var;
        } catch (Throwable th) {
            try {
                bufferedReader.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final c6 o(n1 n1Var) throws IOException {
        i5 i5Var = this.a;
        if (i5Var == null || i5Var.I != s5.TraceMetric) {
            return null;
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(l()), d));
        try {
            c6 c6Var = (c6) n1Var.c(bufferedReader, c6.class);
            bufferedReader.close();
            return c6Var;
        } catch (Throwable th) {
            try {
                bufferedReader.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final io.sentry.protocol.e0 p(n1 n1Var) throws IOException {
        i5 i5Var = this.a;
        if (i5Var == null || i5Var.I != s5.Transaction) {
            return null;
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(l()), d));
        try {
            io.sentry.protocol.e0 e0Var = (io.sentry.protocol.e0) n1Var.c(bufferedReader, io.sentry.protocol.e0.class);
            bufferedReader.close();
            return e0Var;
        } catch (Throwable th) {
            try {
                bufferedReader.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public h5(i5 i5Var, Callable callable) {
        this.a = i5Var;
        this.b = callable;
        this.c = null;
    }
}
