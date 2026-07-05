package defpackage;

import java.io.InterruptedIOException;
import java.net.Socket;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;
import okio.Source;

/* JADX INFO: loaded from: classes.dex */
public abstract class blj {
    public static final TimeZone a;
    public static final String b;

    static {
        TimeZone timeZone = TimeZone.getTimeZone("GMT");
        timeZone.getClass();
        a = timeZone;
        b = bsg.T0(bsg.R0(hdc.class.getName(), "okhttp3."), "Client");
    }

    public static final boolean a(vs8 vs8Var, vs8 vs8Var2) {
        vs8Var.getClass();
        vs8Var2.getClass();
        return x44.r(vs8Var.d, vs8Var2.d) && vs8Var.e == vs8Var2.e && x44.r(vs8Var.a, vs8Var2.a);
    }

    public static final int b(long j, TimeUnit timeUnit) {
        timeUnit.getClass();
        if (j < 0) {
            mr9.f("timeout".concat(" < 0"));
            return 0;
        }
        long millis = timeUnit.toMillis(j);
        if (millis > 2147483647L) {
            mr9.q("timeout".concat(" too large"));
            return 0;
        }
        if (millis != 0 || j <= 0) {
            return (int) millis;
        }
        mr9.q("timeout".concat(" too small"));
        return 0;
    }

    public static final int c(long j) {
        if (uh6.l(j)) {
            mr9.f("duration".concat(" < 0"));
            return 0;
        }
        long jF = uh6.f(j);
        if (jF > 2147483647L) {
            mr9.q("duration".concat(" too large"));
            return 0;
        }
        if (jF != 0 || j <= 0) {
            return (int) jF;
        }
        mr9.q("duration".concat(" too small"));
        return 0;
    }

    public static final void d(Socket socket) {
        socket.getClass();
        try {
            socket.close();
        } catch (AssertionError e) {
            throw e;
        } catch (RuntimeException e2) {
            if (!x44.r(e2.getMessage(), "bio == null")) {
                throw e2;
            }
        } catch (Exception unused) {
        }
    }

    public static final String e(String str, Object... objArr) {
        Locale locale = Locale.US;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        return String.format(locale, str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
    }

    public static final long f(pqe pqeVar) {
        String strA = pqeVar.J.a("Content-Length");
        if (strA == null) {
            return -1L;
        }
        byte[] bArr = zkj.a;
        try {
            return Long.parseLong(strA);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    public static final Charset g(BufferedSource bufferedSource, Charset charset) {
        bufferedSource.getClass();
        charset.getClass();
        int iN0 = bufferedSource.N0(zkj.b);
        if (iN0 == -1) {
            return charset;
        }
        if (iN0 == 0) {
            return dj2.a;
        }
        if (iN0 == 1) {
            return dj2.b;
        }
        if (iN0 == 2) {
            Charset charset2 = dj2.a;
            Charset charset3 = dj2.e;
            if (charset3 != null) {
                return charset3;
            }
            Charset charsetForName = Charset.forName("UTF-32LE");
            charsetForName.getClass();
            dj2.e = charsetForName;
            return charsetForName;
        }
        if (iN0 == 3) {
            return dj2.c;
        }
        if (iN0 != 4) {
            mr9.u();
            return null;
        }
        Charset charset4 = dj2.a;
        Charset charset5 = dj2.f;
        if (charset5 != null) {
            return charset5;
        }
        Charset charsetForName2 = Charset.forName("UTF-32BE");
        charsetForName2.getClass();
        dj2.f = charsetForName2;
        return charsetForName2;
    }

    public static final boolean h(Source source, int i) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        timeUnit.getClass();
        long jNanoTime = System.nanoTime();
        long jE = source.l().getA() ? source.l().e() - jNanoTime : Long.MAX_VALUE;
        source.l().f(Math.min(jE, timeUnit.toNanos(i)) + jNanoTime);
        try {
            Buffer buffer = new Buffer();
            while (source.A0(buffer, 8192L) != -1) {
                buffer.c();
            }
            if (jE == Long.MAX_VALUE) {
                source.l().c();
                return true;
            }
            source.l().f(jNanoTime + jE);
            return true;
        } catch (InterruptedIOException unused) {
            if (jE == Long.MAX_VALUE) {
                source.l().c();
                return false;
            }
            source.l().f(jNanoTime + jE);
            return false;
        } catch (Throwable th) {
            if (jE == Long.MAX_VALUE) {
                source.l().c();
            } else {
                source.l().f(jNanoTime + jE);
            }
            throw th;
        }
    }

    public static final wg8 i(List list) {
        ArrayList arrayList = new ArrayList(20);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            tg8 tg8Var = (tg8) it.next();
            ByteString byteString = tg8Var.a;
            ByteString byteString2 = tg8Var.b;
            String strT = byteString.t();
            String strT2 = byteString2.t();
            arrayList.add(strT);
            arrayList.add(bsg.k1(strT2).toString());
        }
        return new wg8((String[]) arrayList.toArray(new String[0]));
    }

    public static final String j(vs8 vs8Var, boolean z) {
        vs8Var.getClass();
        int i = vs8Var.e;
        String strN = vs8Var.d;
        if (bsg.u0(strN, ":", false)) {
            strN = grc.n(']', "[", strN);
        }
        if (!z) {
            String str = vs8Var.a;
            str.getClass();
            if (i == (str.equals("http") ? 80 : str.equals("https") ? 443 : -1)) {
                return strN;
            }
        }
        return strN + ':' + i;
    }

    public static final List k(List list) {
        list.getClass();
        if (list.isEmpty()) {
            return lm6.E;
        }
        if (list.size() == 1) {
            List listSingletonList = Collections.singletonList(list.get(0));
            listSingletonList.getClass();
            return listSingletonList;
        }
        Object[] array = list.toArray();
        array.getClass();
        List listAsList = Arrays.asList(array);
        listAsList.getClass();
        List listUnmodifiableList = Collections.unmodifiableList(listAsList);
        listUnmodifiableList.getClass();
        return listUnmodifiableList;
    }

    public static final List l(Object[] objArr) {
        if (objArr == null || objArr.length == 0) {
            return lm6.E;
        }
        if (objArr.length == 1) {
            List listSingletonList = Collections.singletonList(objArr[0]);
            listSingletonList.getClass();
            return listSingletonList;
        }
        List listUnmodifiableList = Collections.unmodifiableList(mp0.l0((Object[]) objArr.clone()));
        listUnmodifiableList.getClass();
        return listUnmodifiableList;
    }
}
