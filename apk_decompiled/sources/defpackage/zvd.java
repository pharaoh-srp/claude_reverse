package defpackage;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.IDN;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import okio.ByteString;

/* JADX INFO: loaded from: classes3.dex */
public final class zvd {
    public static final ByteString b = new ByteString(Arrays.copyOf(new byte[]{42}, 1));
    public static final List c = x44.W("*");
    public static final zvd d = new zvd(new h2f());
    public final h2f a;

    public zvd(h2f h2fVar) {
        this.a = h2fVar;
    }

    public static List b(String str) {
        List listX0 = bsg.X0(str, new char[]{'.'}, 6);
        return x44.r(w44.U0(listX0), "") ? w44.J0(1, listX0) : listX0;
    }

    public final String a(String str) {
        String strG;
        String strG2;
        String strG3;
        List listX0;
        int size;
        int size2;
        String unicode = IDN.toUnicode(str);
        unicode.getClass();
        List listB = b(unicode);
        h2f h2fVar = this.a;
        AtomicBoolean atomicBoolean = (AtomicBoolean) h2fVar.b;
        if (atomicBoolean.get() || !atomicBoolean.compareAndSet(false, true)) {
            try {
                ((CountDownLatch) h2fVar.c).await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        } else {
            boolean z = false;
            while (true) {
                try {
                    try {
                        h2fVar.H();
                        break;
                    } catch (InterruptedIOException unused2) {
                        Thread.interrupted();
                        z = true;
                    } catch (IOException e) {
                        h2fVar.f = e;
                        if (z) {
                        }
                    }
                } finally {
                    if (z) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }
        if (((ByteString) h2fVar.d) == null) {
            StringBuilder sb = new StringBuilder("Unable to load ");
            sb.append(h2fVar.g);
            sb.append(" resource.");
            IllegalStateException illegalStateException = new IllegalStateException(sb.toString());
            illegalStateException.initCause((IOException) h2fVar.f);
            throw illegalStateException;
        }
        int size3 = listB.size();
        ByteString[] byteStringArr = new ByteString[size3];
        for (int i = 0; i < size3; i++) {
            ByteString byteString = ByteString.H;
            byteStringArr[i] = ByteString.Companion.b((String) listB.get(i));
        }
        int i2 = 0;
        while (true) {
            if (i2 >= size3) {
                strG = null;
                break;
            }
            ByteString byteString2 = (ByteString) h2fVar.d;
            if (byteString2 == null) {
                x44.o0("bytes");
                throw null;
            }
            strG = zl4.g(byteString2, byteStringArr, i2);
            if (strG != null) {
                break;
            }
            i2++;
        }
        if (size3 > 1) {
            ByteString[] byteStringArr2 = (ByteString[]) byteStringArr.clone();
            int length = byteStringArr2.length - 1;
            for (int i3 = 0; i3 < length; i3++) {
                byteStringArr2[i3] = b;
                ByteString byteString3 = (ByteString) h2fVar.d;
                if (byteString3 == null) {
                    x44.o0("bytes");
                    throw null;
                }
                strG2 = zl4.g(byteString3, byteStringArr2, i3);
                if (strG2 != null) {
                    break;
                }
            }
            strG2 = null;
        } else {
            strG2 = null;
        }
        if (strG2 != null) {
            int i4 = size3 - 1;
            for (int i5 = 0; i5 < i4; i5++) {
                ByteString byteString4 = (ByteString) h2fVar.e;
                if (byteString4 == null) {
                    x44.o0("exceptionBytes");
                    throw null;
                }
                strG3 = zl4.g(byteString4, byteStringArr, i5);
                if (strG3 != null) {
                    break;
                }
            }
            strG3 = null;
        } else {
            strG3 = null;
        }
        if (strG3 != null) {
            listX0 = bsg.X0("!".concat(strG3), new char[]{'.'}, 6);
        } else if (strG == null && strG2 == null) {
            listX0 = c;
        } else {
            List listX02 = lm6.E;
            List listX03 = strG != null ? bsg.X0(strG, new char[]{'.'}, 6) : listX02;
            if (strG2 != null) {
                listX02 = bsg.X0(strG2, new char[]{'.'}, 6);
            }
            listX0 = listX03.size() > listX02.size() ? listX03 : listX02;
        }
        if (listB.size() == listX0.size() && ((String) listX0.get(0)).charAt(0) != '!') {
            return null;
        }
        if (((String) listX0.get(0)).charAt(0) == '!') {
            size = listB.size();
            size2 = listX0.size();
        } else {
            size = listB.size();
            size2 = listX0.size() + 1;
        }
        return bnf.a0(bnf.U(new c54(0, b(str)), size - size2), ".");
    }
}
