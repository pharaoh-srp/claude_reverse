package defpackage;

import java.nio.ByteOrder;
import java.util.Collections;

/* JADX INFO: loaded from: classes2.dex */
public final class zm7 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final long j;
    public final i49 k;
    public final gjb l;

    public zm7(byte[] bArr, int i) {
        dg2 dg2Var = new dg2(bArr, bArr.length);
        dg2Var.m(i * 8);
        this.a = dg2Var.g(16);
        this.b = dg2Var.g(16);
        this.c = dg2Var.g(24);
        this.d = dg2Var.g(24);
        int iG = dg2Var.g(20);
        this.e = iG;
        this.f = d(iG);
        this.g = dg2Var.g(3) + 1;
        int iG2 = dg2Var.g(5) + 1;
        this.h = iG2;
        this.i = a(iG2);
        this.j = dg2Var.i(36);
        this.k = null;
        this.l = null;
    }

    public static int a(int i) {
        if (i == 8) {
            return 1;
        }
        if (i == 12) {
            return 2;
        }
        if (i == 16) {
            return 4;
        }
        if (i == 20) {
            return 5;
        }
        if (i != 24) {
            return i != 32 ? -1 : 7;
        }
        return 6;
    }

    public static int d(int i) {
        switch (i) {
            case 8000:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    public final long b() {
        long j = this.j;
        if (j == 0) {
            return -9223372036854775807L;
        }
        return (j * 1000000) / ((long) this.e);
    }

    public final jw7 c(byte[] bArr, gjb gjbVar) {
        bArr[4] = -128;
        int i = this.d;
        if (i <= 0) {
            i = -1;
        }
        gjb gjbVar2 = this.l;
        if (gjbVar2 != null) {
            gjbVar = gjbVar2.b(gjbVar);
        }
        iw7 iw7Var = new iw7();
        iw7Var.n = gkb.k("audio/flac");
        iw7Var.o = i;
        iw7Var.F = this.g;
        iw7Var.G = this.e;
        String str = tpi.a;
        iw7Var.H = tpi.s(this.h, ByteOrder.LITTLE_ENDIAN);
        iw7Var.q = Collections.singletonList(bArr);
        iw7Var.k = gjbVar;
        return new jw7(iw7Var);
    }

    public zm7(int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, i49 i49Var, gjb gjbVar) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = d(i5);
        this.g = i6;
        this.h = i7;
        this.i = a(i7);
        this.j = j;
        this.k = i49Var;
        this.l = gjbVar;
    }
}
