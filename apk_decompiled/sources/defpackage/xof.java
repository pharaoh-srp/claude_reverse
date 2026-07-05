package defpackage;

import java.io.EOFException;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;
import okio.Options;

/* JADX INFO: loaded from: classes.dex */
public final class xof {
    public static final Options d;
    public static final ByteString e;
    public final BufferedSource a;
    public final m4e b;
    public String c;

    static {
        ByteString byteString = ByteString.H;
        d = Options.Companion.b(ByteString.Companion.b("\r\n"), ByteString.Companion.b("\r"), ByteString.Companion.b("\n"), ByteString.Companion.b("data: "), ByteString.Companion.b("data:"), ByteString.Companion.b("data\r\n"), ByteString.Companion.b("data\r"), ByteString.Companion.b("data\n"), ByteString.Companion.b("id: "), ByteString.Companion.b("id:"), ByteString.Companion.b("id\r\n"), ByteString.Companion.b("id\r"), ByteString.Companion.b("id\n"), ByteString.Companion.b("event: "), ByteString.Companion.b("event:"), ByteString.Companion.b("event\r\n"), ByteString.Companion.b("event\r"), ByteString.Companion.b("event\n"), ByteString.Companion.b("retry: "), ByteString.Companion.b("retry:"));
        e = ByteString.Companion.b("\r\n");
    }

    public xof(BufferedSource bufferedSource, m4e m4eVar) {
        bufferedSource.getClass();
        this.a = bufferedSource;
        this.b = m4eVar;
    }

    public final boolean a() throws EOFException {
        String strP0 = this.c;
        Buffer buffer = new Buffer();
        while (true) {
            String strP02 = null;
            while (true) {
                BufferedSource bufferedSource = this.a;
                Options options = d;
                int iN0 = bufferedSource.N0(options);
                if (iN0 >= 0 && iN0 < 3) {
                    if (buffer.F == 0) {
                        return true;
                    }
                    this.c = strP0;
                    buffer.skip(1L);
                    String strT0 = buffer.t0();
                    m4e m4eVar = this.b;
                    ((gb9) m4eVar.G).F(m4eVar, strP02, strT0);
                    return true;
                }
                ByteString byteString = e;
                if (3 <= iN0 && iN0 < 5) {
                    buffer.B0(10);
                    bufferedSource.J(buffer, bufferedSource.L(byteString));
                    bufferedSource.N0(options);
                } else if (5 <= iN0 && iN0 < 8) {
                    buffer.B0(10);
                } else if (8 <= iN0 && iN0 < 10) {
                    strP0 = bufferedSource.p0();
                    if (strP0.length() <= 0) {
                        strP0 = null;
                    }
                } else if (10 <= iN0 && iN0 < 13) {
                    strP0 = null;
                } else if (13 <= iN0 && iN0 < 15) {
                    strP02 = bufferedSource.p0();
                    if (strP02.length() > 0) {
                    }
                } else if (15 > iN0 || iN0 >= 18) {
                    if (18 <= iN0 && iN0 < 20) {
                        String strP03 = bufferedSource.p0();
                        byte[] bArr = zkj.a;
                        try {
                            Long.parseLong(strP03);
                        } catch (NumberFormatException unused) {
                        }
                    } else {
                        if (iN0 != -1) {
                            mr9.u();
                            return false;
                        }
                        long jL = bufferedSource.L(byteString);
                        if (jL == -1) {
                            return false;
                        }
                        bufferedSource.skip(jL);
                        bufferedSource.N0(options);
                    }
                }
            }
        }
    }
}
