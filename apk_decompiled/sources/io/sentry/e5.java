package io.sentry;

import defpackage.ij0;
import defpackage.mj5;
import defpackage.sz6;
import io.sentry.exception.SentryEnvelopeException;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class e5 implements Callable {
    public final /* synthetic */ int E = 0;
    public final /* synthetic */ long F;
    public final /* synthetic */ n1 G;
    public final /* synthetic */ Object H;
    public final /* synthetic */ Object I;

    public /* synthetic */ e5(long j, a aVar, a1 a1Var, n1 n1Var) {
        this.H = aVar;
        this.F = j;
        this.G = n1Var;
        this.I = a1Var;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() throws SentryEnvelopeException {
        byte[] bArr;
        int i = this.E;
        byte[] bArr2 = null;
        n1 n1Var = this.G;
        Object obj = this.I;
        long j = this.F;
        Object obj2 = this.H;
        switch (i) {
            case 0:
                a aVar = (a) obj2;
                a1 a1Var = (a1) obj;
                byte[] bArr3 = aVar.a;
                String str = aVar.d;
                if (bArr3 != null) {
                    h5.a(bArr3.length, j, str);
                    return bArr3;
                }
                io.sentry.protocol.k0 k0Var = aVar.b;
                if (k0Var != null) {
                    Charset charset = io.sentry.util.f.a;
                    try {
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        try {
                            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, io.sentry.util.f.a));
                            try {
                                n1Var.a(k0Var, bufferedWriter);
                                byte[] byteArray = byteArrayOutputStream.toByteArray();
                                bufferedWriter.close();
                                byteArrayOutputStream.close();
                                bArr2 = byteArray;
                            } finally {
                                try {
                                    break;
                                } catch (Throwable th) {
                                }
                            }
                        } finally {
                            try {
                                break;
                            } catch (Throwable th2) {
                            }
                        }
                    } catch (Throwable th3) {
                        a1Var.d(t5.ERROR, "Could not serialize serializable", th3);
                    }
                    if (bArr2 != null) {
                        h5.a(bArr2.length, j, str);
                        return bArr2;
                    }
                } else {
                    mj5 mj5Var = aVar.c;
                    if (mj5Var != null && (bArr = (byte[]) mj5Var.call()) != null) {
                        h5.a(bArr.length, j, str);
                        return bArr;
                    }
                }
                throw new SentryEnvelopeException(ij0.j("Couldn't attach the attachment ", str, ".\nPlease check that either bytes, serializable, path or provider is set."));
            default:
                File file = (File) obj2;
                y3 y3Var = (y3) obj;
                if (!file.exists()) {
                    throw new SentryEnvelopeException(ij0.j("Dropping profiling trace data, because the file '", file.getName(), "' doesn't exists"));
                }
                try {
                    String str2 = new String(io.sentry.vendor.a.a(p.t(j, file.getPath())), "US-ASCII");
                    if (str2.isEmpty()) {
                        throw new SentryEnvelopeException("Profiling trace file is empty");
                    }
                    y3Var.f0 = str2;
                    try {
                        y3Var.P = (List) y3Var.F.call();
                        break;
                    } catch (Throwable unused) {
                    }
                    try {
                        try {
                            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                            try {
                                BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream2, h5.d));
                                try {
                                    n1Var.a(y3Var, bufferedWriter2);
                                    byte[] byteArray2 = byteArrayOutputStream2.toByteArray();
                                    bufferedWriter2.close();
                                    byteArrayOutputStream2.close();
                                    return byteArray2;
                                } finally {
                                    try {
                                        break;
                                    } catch (Throwable th4) {
                                    }
                                }
                            } catch (Throwable th5) {
                                try {
                                    byteArrayOutputStream2.close();
                                    break;
                                } catch (Throwable th6) {
                                    th5.addSuppressed(th6);
                                }
                                throw th5;
                            }
                        } finally {
                            file.delete();
                        }
                    } catch (IOException e) {
                        throw new SentryEnvelopeException("Failed to serialize profiling trace data\n" + e.getMessage());
                    }
                } catch (UnsupportedEncodingException e2) {
                    sz6.h(e2);
                    return null;
                }
        }
    }

    public /* synthetic */ e5(File file, long j, y3 y3Var, n1 n1Var) {
        this.H = file;
        this.F = j;
        this.I = y3Var;
        this.G = n1Var;
    }
}
