package defpackage;

import io.sentry.e0;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import okio.BufferedSource;
import okio.ByteString;
import okio.RealBufferedSource;

/* JADX INFO: loaded from: classes.dex */
public final class cs8 implements Closeable {
    public static final Logger H;
    public final BufferedSource E;
    public final bs8 F;
    public final sp8 G;

    static {
        Logger logger = Logger.getLogger(rr8.class.getName());
        logger.getClass();
        H = logger;
    }

    public cs8(RealBufferedSource realBufferedSource) {
        realBufferedSource.getClass();
        this.E = realBufferedSource;
        bs8 bs8Var = new bs8(realBufferedSource);
        this.F = bs8Var;
        this.G = new sp8(bs8Var);
    }

    public final boolean c(boolean z, yr8 yr8Var) throws Exception {
        int iM;
        int i;
        Object[] array;
        try {
            this.E.I0(9L);
            iM = zkj.m(this.E);
        } catch (EOFException unused) {
        }
        if (iM > 16384) {
            xh6.c(grc.p(iM, "FRAME_SIZE_ERROR: "));
            return false;
        }
        int i2 = this.E.readByte() & 255;
        byte b = this.E.readByte();
        int i3 = b & 255;
        int i4 = this.E.readInt();
        int i5 = Integer.MAX_VALUE & i4;
        int i6 = 1;
        if (i2 != 8) {
            Logger logger = H;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(rr8.b(true, i5, iM, i2, i3));
            }
        }
        if (z && i2 != 4) {
            e0.e("Expected a SETTINGS frame but was ", rr8.a(i2));
            return false;
        }
        xr6 xr6Var = null;
        int i7 = 2;
        switch (i2) {
            case 0:
                d(yr8Var, iM, i3, i5);
                return true;
            case 1:
                f(yr8Var, iM, i3, i5);
                return true;
            case 2:
                if (iM != 5) {
                    xh6.c(grc.u("TYPE_PRIORITY length: ", iM, " != 5"));
                    return false;
                }
                if (i5 == 0) {
                    xh6.c("TYPE_PRIORITY streamId == 0");
                    return false;
                }
                BufferedSource bufferedSource = this.E;
                bufferedSource.readInt();
                bufferedSource.readByte();
                return true;
            case 3:
                if (iM != 4) {
                    xh6.c(grc.u("TYPE_RST_STREAM length: ", iM, " != 4"));
                    return false;
                }
                if (i5 == 0) {
                    xh6.c("TYPE_RST_STREAM streamId == 0");
                    return false;
                }
                int i8 = this.E.readInt();
                xr6.F.getClass();
                xr6[] xr6VarArrValues = xr6.values();
                int length = xr6VarArrValues.length;
                int i9 = 0;
                while (true) {
                    if (i9 < length) {
                        xr6 xr6Var2 = xr6VarArrValues[i9];
                        if (xr6Var2.E == i8) {
                            xr6Var = xr6Var2;
                        } else {
                            i9++;
                        }
                    }
                }
                if (xr6Var == null) {
                    xh6.c(grc.p(i8, "TYPE_RST_STREAM unexpected error code: "));
                    return false;
                }
                zr8 zr8Var = (zr8) yr8Var.G;
                if (i5 != 0 && (i4 & 1) == 0) {
                    m7h.b(zr8Var.M, zr8Var.G + '[' + i5 + "] onReset", 0L, new ur8(zr8Var, i5, xr6Var, i6), 6);
                    return true;
                }
                gs8 gs8VarE = zr8Var.e(i5);
                if (gs8VarE != null) {
                    synchronized (gs8VarE) {
                        if (gs8VarE.g() == null) {
                            gs8VarE.P = xr6Var;
                            gs8VarE.notifyAll();
                        }
                        break;
                    }
                    return true;
                }
                return true;
            case 4:
                BufferedSource bufferedSource2 = this.E;
                if (i5 != 0) {
                    xh6.c("TYPE_SETTINGS streamId != 0");
                    return false;
                }
                if ((b & 1) != 0) {
                    if (iM != 0) {
                        xh6.c("FRAME_SIZE_ERROR ack frame should be empty!");
                        return false;
                    }
                    return true;
                }
                if (iM % 6 != 0) {
                    xh6.c(grc.p(iM, "TYPE_SETTINGS length % 6 != 0: "));
                    return false;
                }
                dyf dyfVar = new dyf();
                z69 z69VarA0 = wd6.A0(wd6.H0(0, iM), 6);
                int i10 = z69VarA0.E;
                int i11 = z69VarA0.F;
                int i12 = z69VarA0.G;
                if ((i12 > 0 && i10 <= i11) || (i12 < 0 && i11 <= i10)) {
                    while (true) {
                        short s = bufferedSource2.readShort();
                        byte[] bArr = zkj.a;
                        int i13 = s & 65535;
                        i = bufferedSource2.readInt();
                        if (i13 != 2) {
                            if (i13 != 4) {
                                if (i13 == 5 && (i < 16384 || i > 16777215)) {
                                }
                            } else if (i < 0) {
                                xh6.c("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1");
                                return false;
                            }
                        } else if (i != 0 && i != 1) {
                            xh6.c("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1");
                            return false;
                        }
                        dyfVar.b(i13, i);
                        if (i10 != i11) {
                            i10 += i12;
                        }
                    }
                    xh6.c(grc.p(i, "PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: "));
                    return false;
                }
                zr8 zr8Var2 = (zr8) yr8Var.G;
                m7h.b(zr8Var2.L, ij0.m(new StringBuilder(), zr8Var2.G, " applyAndAckSettings"), 0L, new vc8(yr8Var, i7, dyfVar), 6);
                return true;
            case 5:
                i(yr8Var, iM, i3, i5);
                return true;
            case 6:
                if (iM != 8) {
                    xh6.c(grc.p(iM, "TYPE_PING length != 8: "));
                    return false;
                }
                if (i5 != 0) {
                    xh6.c("TYPE_PING streamId != 0");
                    return false;
                }
                int i14 = this.E.readInt();
                int i15 = this.E.readInt();
                i = (b & 1) != 0 ? 1 : 0;
                zr8 zr8Var3 = (zr8) yr8Var.G;
                if (i == 0) {
                    m7h.b(zr8Var3.L, ij0.m(new StringBuilder(), ((zr8) yr8Var.G).G, " ping"), 0L, new lg6((zr8) yr8Var.G, i14, i15, i6), 6);
                    return true;
                }
                synchronized (zr8Var3) {
                    try {
                        if (i14 == 1) {
                            zr8Var3.Q++;
                        } else if (i14 == 2) {
                            zr8Var3.S++;
                        } else if (i14 == 3) {
                            zr8Var3.notifyAll();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return true;
            case 7:
                if (iM < 8) {
                    xh6.c(grc.p(iM, "TYPE_GOAWAY length < 8: "));
                    return false;
                }
                if (i5 != 0) {
                    xh6.c("TYPE_GOAWAY streamId != 0");
                    return false;
                }
                int i16 = this.E.readInt();
                int i17 = this.E.readInt();
                int i18 = iM - 8;
                xr6.F.getClass();
                xr6[] xr6VarArrValues2 = xr6.values();
                int length2 = xr6VarArrValues2.length;
                int i19 = 0;
                while (true) {
                    if (i19 < length2) {
                        xr6 xr6Var3 = xr6VarArrValues2[i19];
                        if (xr6Var3.E == i17) {
                            xr6Var = xr6Var3;
                        } else {
                            i19++;
                        }
                    }
                }
                if (xr6Var == null) {
                    xh6.c(grc.p(i17, "TYPE_GOAWAY unexpected error code: "));
                    return false;
                }
                ByteString byteStringT = ByteString.H;
                if (i18 > 0) {
                    byteStringT = this.E.t(i18);
                }
                byteStringT.getClass();
                byteStringT.e();
                zr8 zr8Var4 = (zr8) yr8Var.G;
                synchronized (zr8Var4) {
                    array = zr8Var4.F.values().toArray(new gs8[0]);
                    zr8Var4.J = true;
                }
                gs8[] gs8VarArr = (gs8[]) array;
                int length3 = gs8VarArr.length;
                while (i < length3) {
                    gs8 gs8Var = gs8VarArr[i];
                    if (gs8Var.E > i16 && gs8Var.h()) {
                        xr6 xr6Var4 = xr6.REFUSED_STREAM;
                        synchronized (gs8Var) {
                            if (gs8Var.g() == null) {
                                gs8Var.P = xr6Var4;
                                gs8Var.notifyAll();
                            }
                        }
                        ((zr8) yr8Var.G).e(gs8Var.E);
                    }
                    i++;
                }
                return true;
            case 8:
                try {
                    if (iM != 4) {
                        throw new IOException("TYPE_WINDOW_UPDATE length !=4: " + iM);
                    }
                    long j = ((long) this.E.readInt()) & 2147483647L;
                    if (j == 0) {
                        throw new IOException("windowSizeIncrement was 0");
                    }
                    Logger logger2 = H;
                    if (logger2.isLoggable(Level.FINE)) {
                        logger2.fine(rr8.c(i5, iM, j, true));
                    }
                    zr8 zr8Var5 = (zr8) yr8Var.G;
                    if (i5 == 0) {
                        synchronized (zr8Var5) {
                            zr8Var5.Z += j;
                            zr8Var5.notifyAll();
                        }
                        return true;
                    }
                    gs8 gs8VarD = zr8Var5.d(i5);
                    if (gs8VarD != null) {
                        synchronized (gs8VarD) {
                            gs8VarD.I += j;
                            if (j > 0) {
                                gs8VarD.notifyAll();
                            }
                            break;
                        }
                        return true;
                    }
                    return true;
                } catch (Exception e) {
                    H.fine(rr8.b(true, i5, iM, 8, i3));
                    throw e;
                }
            default:
                this.E.skip(iM);
                return true;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.E.close();
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x011e, code lost:
    
        if (r6 == false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0120, code lost:
    
        r9.j(defpackage.wg8.F, true);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(defpackage.yr8 r19, int r20, int r21, int r22) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 313
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cs8.d(yr8, int, int, int):void");
    }

    public final List e(int i, int i2, int i3, int i4) throws IOException {
        bs8 bs8Var = this.F;
        bs8Var.H = i;
        bs8Var.I = i2;
        bs8Var.F = i3;
        bs8Var.G = i4;
        sp8 sp8Var = this.G;
        RealBufferedSource realBufferedSource = sp8Var.d;
        while (!realBufferedSource.F()) {
            byte b = realBufferedSource.readByte();
            byte[] bArr = zkj.a;
            int i5 = b & 255;
            if (i5 == 128) {
                xh6.c("index == 0");
                return null;
            }
            if ((b & 128) == 128) {
                int iF = sp8Var.f(i5, 127);
                int i6 = iF - 1;
                if (i6 >= 0) {
                    tg8[] tg8VarArr = up8.a;
                    if (i6 <= tg8VarArr.length - 1) {
                        sp8Var.a(tg8VarArr[i6]);
                    }
                }
                int length = sp8Var.f + 1 + (i6 - up8.a.length);
                if (length >= 0) {
                    tg8[] tg8VarArr2 = sp8Var.e;
                    if (length < tg8VarArr2.length) {
                        tg8 tg8Var = tg8VarArr2[length];
                        tg8Var.getClass();
                        sp8Var.a(tg8Var);
                    }
                }
                xh6.c(grc.p(iF, "Header index too large "));
                return null;
            }
            if (i5 == 64) {
                tg8[] tg8VarArr3 = up8.a;
                ByteString byteStringE = sp8Var.e();
                up8.a(byteStringE);
                sp8Var.d(new tg8(byteStringE, sp8Var.e()));
            } else if ((b & 64) == 64) {
                sp8Var.d(new tg8(sp8Var.c(sp8Var.f(i5, 63) - 1), sp8Var.e()));
            } else if ((b & 32) == 32) {
                int iF2 = sp8Var.f(i5, 31);
                sp8Var.a = iF2;
                if (iF2 < 0 || iF2 > 4096) {
                    throw new IOException("Invalid dynamic table size update " + sp8Var.a);
                }
                int i7 = sp8Var.h;
                if (iF2 < i7) {
                    if (iF2 == 0) {
                        tg8[] tg8VarArr4 = sp8Var.e;
                        mp0.z0(0, tg8VarArr4.length, null, tg8VarArr4);
                        sp8Var.f = sp8Var.e.length - 1;
                        sp8Var.g = 0;
                        sp8Var.h = 0;
                    } else {
                        sp8Var.b(i7 - iF2);
                    }
                }
            } else if (i5 == 16 || i5 == 0) {
                tg8[] tg8VarArr5 = up8.a;
                ByteString byteStringE2 = sp8Var.e();
                up8.a(byteStringE2);
                sp8Var.a(new tg8(byteStringE2, sp8Var.e()));
            } else {
                sp8Var.a(new tg8(sp8Var.c(sp8Var.f(i5, 15) - 1), sp8Var.e()));
            }
        }
        ArrayList arrayList = sp8Var.b;
        List listP1 = w44.p1(arrayList);
        arrayList.clear();
        sp8Var.c = 0L;
        return listP1;
    }

    public final void f(yr8 yr8Var, int i, int i2, int i3) throws IOException {
        int i4;
        int i5;
        if (i3 == 0) {
            xh6.c("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
            return;
        }
        boolean z = false;
        int i6 = 1;
        boolean z2 = (i2 & 1) != 0;
        if ((i2 & 8) != 0) {
            byte b = this.E.readByte();
            byte[] bArr = zkj.a;
            i4 = b & 255;
        } else {
            i4 = 0;
        }
        if ((i2 & 32) != 0) {
            BufferedSource bufferedSource = this.E;
            bufferedSource.readInt();
            bufferedSource.readByte();
            byte[] bArr2 = zkj.a;
            i5 = i - 5;
        } else {
            i5 = i;
        }
        List listE = e(v40.G(i5, i2, i4), i4, i2, i3);
        zr8 zr8Var = (zr8) yr8Var.G;
        if (i3 != 0 && (i3 & 1) == 0) {
            z = true;
        }
        if (z) {
            m7h.b(zr8Var.M, zr8Var.G + '[' + i3 + "] onHeaders", 0L, new ur8(zr8Var, i3, listE, z2), 6);
            return;
        }
        synchronized (zr8Var) {
            gs8 gs8VarD = zr8Var.d(i3);
            if (gs8VarD != null) {
                gs8VarD.j(blj.i(listE), z2);
                return;
            }
            if (zr8Var.J) {
                return;
            }
            if (i3 <= zr8Var.H) {
                return;
            }
            if (i3 % 2 == zr8Var.I % 2) {
                return;
            }
            gs8 gs8Var = new gs8(i3, zr8Var, false, z2, blj.i(listE));
            zr8Var.H = i3;
            zr8Var.F.put(Integer.valueOf(i3), gs8Var);
            m7h.b(zr8Var.K.d(), zr8Var.G + '[' + i3 + "] onStream", 0L, new vc8(zr8Var, i6, gs8Var), 6);
        }
    }

    public final void i(yr8 yr8Var, int i, int i2, int i3) throws IOException {
        int i4;
        if (i3 == 0) {
            xh6.c("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
            return;
        }
        int i5 = 0;
        if ((i2 & 8) != 0) {
            byte b = this.E.readByte();
            byte[] bArr = zkj.a;
            i4 = b & 255;
        } else {
            i4 = 0;
        }
        int i6 = this.E.readInt() & Integer.MAX_VALUE;
        List listE = e(v40.G(i - 4, i2, i4), i4, i2, i3);
        zr8 zr8Var = (zr8) yr8Var.G;
        synchronized (zr8Var) {
            if (zr8Var.d0.contains(Integer.valueOf(i6))) {
                zr8Var.n(i6, xr6.PROTOCOL_ERROR);
                return;
            }
            zr8Var.d0.add(Integer.valueOf(i6));
            m7h.b(zr8Var.M, zr8Var.G + '[' + i6 + "] onRequest", 0L, new ur8(zr8Var, i6, listE, i5), 6);
        }
    }
}
