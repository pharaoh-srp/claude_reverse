package com.lyft.kronos.internal.ntp;

import android.os.SystemClock;
import com.pvporbit.freetype.FreeTypeConstants;
import defpackage.grc;
import defpackage.k2e;
import defpackage.rdg;
import defpackage.unb;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    public final unb a;

    public a(unb unbVar, k2e k2eVar, k2e k2eVar2) {
        this.a = unbVar;
    }

    public static void a(byte b, byte b2, int i, long j) throws IOException {
        if (b == 3) {
            final String str = "unsynchronized server";
            throw new IOException(str) { // from class: com.lyft.kronos.internal.ntp.SntpClient$InvalidServerReplyException
            };
        }
        if (b2 != 4 && b2 != 5) {
            final String strP = grc.p(b2, "untrusted mode: ");
            throw new IOException(strP) { // from class: com.lyft.kronos.internal.ntp.SntpClient$InvalidServerReplyException
            };
        }
        if (i == 0 || i > 15) {
            final String strP2 = grc.p(i, "untrusted stratum: ");
            throw new IOException(strP2) { // from class: com.lyft.kronos.internal.ntp.SntpClient$InvalidServerReplyException
            };
        }
        if (j != 0) {
            return;
        }
        final String str2 = "zero transmitTime";
        throw new IOException(str2) { // from class: com.lyft.kronos.internal.ntp.SntpClient$InvalidServerReplyException
        };
    }

    public static long b(byte[] bArr, int i) {
        int i2 = bArr[i];
        int i3 = bArr[i + 1];
        int i4 = bArr[i + 2];
        int i5 = bArr[i + 3];
        if ((i2 & FreeTypeConstants.FT_LOAD_PEDANTIC) == 128) {
            i2 = (i2 & 127) + FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if ((i3 & FreeTypeConstants.FT_LOAD_PEDANTIC) == 128) {
            i3 = (i3 & 127) + FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if ((i4 & FreeTypeConstants.FT_LOAD_PEDANTIC) == 128) {
            i4 = (i4 & 127) + FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if ((i5 & FreeTypeConstants.FT_LOAD_PEDANTIC) == 128) {
            i5 = (i5 & 127) + FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        return (((long) i2) << 24) + (((long) i3) << 16) + (((long) i4) << 8) + ((long) i5);
    }

    public static long c(byte[] bArr, int i) {
        long jB = b(bArr, i);
        return ((b(bArr, i + 4) * 1000) / 4294967296L) + ((jB - 2208988800L) * 1000);
    }

    public final rdg d(Long l, String str) throws Throwable {
        DatagramSocket datagramSocket = null;
        try {
            str.getClass();
            InetAddress byName = InetAddress.getByName(str);
            byName.getClass();
            DatagramSocket datagramSocket2 = new DatagramSocket();
            try {
                datagramSocket2.setSoTimeout(l.intValue());
                byte[] bArr = new byte[48];
                DatagramPacket datagramPacket = new DatagramPacket(bArr, 48, byName, 123);
                bArr[0] = 27;
                long jCurrentTimeMillis = System.currentTimeMillis();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                long j = jCurrentTimeMillis / 1000;
                long j2 = jCurrentTimeMillis - (j * 1000);
                bArr[40] = (byte) (r12 >> 24);
                bArr[41] = (byte) (r12 >> 16);
                bArr[42] = (byte) (r12 >> 8);
                bArr[43] = (byte) (j + 2208988800L);
                long j3 = (j2 * 4294967296L) / 1000;
                bArr[44] = (byte) (j3 >> 24);
                bArr[45] = (byte) (j3 >> 16);
                bArr[46] = (byte) (j3 >> 8);
                bArr[47] = (byte) (Math.random() * 255.0d);
                datagramSocket2.send(datagramPacket);
                byte[] bArrCopyOf = Arrays.copyOf(bArr, 48);
                datagramSocket2.receive(new DatagramPacket(bArrCopyOf, bArrCopyOf.length));
                long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                long j4 = (jElapsedRealtime2 - jElapsedRealtime) + jCurrentTimeMillis;
                byte b = bArrCopyOf[0];
                int i = bArrCopyOf[1] & 255;
                long jC = c(bArrCopyOf, 24);
                long jC2 = c(bArrCopyOf, 32);
                long jC3 = c(bArrCopyOf, 40);
                a((byte) ((b >> 6) & 3), (byte) (b & 7), i, jC3);
                rdg rdgVar = new rdg(j4, jElapsedRealtime2, ((jC3 - j4) + (jC2 - jC)) / 2, this.a);
                datagramSocket2.close();
                return rdgVar;
            } catch (Throwable th) {
                th = th;
                datagramSocket = datagramSocket2;
                if (datagramSocket != null) {
                    datagramSocket.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
