package defpackage;

import androidx.media3.common.ParserException;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class v5j extends iqg {
    public f4i n;
    public int o;
    public boolean p;
    public om8 q;
    public fnf r;

    @Override // defpackage.iqg
    public final void a(long j) {
        this.g = j;
        this.p = j != 0;
        om8 om8Var = this.q;
        this.o = om8Var != null ? om8Var.e : 0;
    }

    @Override // defpackage.iqg
    public final long b(ssc sscVar) {
        byte b = sscVar.a[0];
        if ((b & 1) == 1) {
            return -1L;
        }
        f4i f4iVar = this.n;
        f4iVar.getClass();
        boolean z = ((r09[]) f4iVar.I)[(b >> 1) & (255 >>> (8 - f4iVar.E))].F;
        om8 om8Var = (om8) f4iVar.F;
        int i = !z ? om8Var.e : om8Var.f;
        long j = this.p ? (this.o + i) / 4 : 0;
        byte[] bArr = sscVar.a;
        int length = bArr.length;
        int i2 = sscVar.c + 4;
        if (length < i2) {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, i2);
            sscVar.K(bArrCopyOf, bArrCopyOf.length);
        } else {
            sscVar.L(i2);
        }
        byte[] bArr2 = sscVar.a;
        int i3 = sscVar.c;
        bArr2[i3 - 4] = (byte) (j & 255);
        bArr2[i3 - 3] = (byte) ((j >>> 8) & 255);
        bArr2[i3 - 2] = (byte) ((j >>> 16) & 255);
        bArr2[i3 - 1] = (byte) ((j >>> 24) & 255);
        this.p = true;
        this.o = i;
        return j;
    }

    /* JADX WARN: Type inference failed for: r1v48, types: [byte[], java.io.Serializable] */
    @Override // defpackage.iqg
    public final boolean c(ssc sscVar, long j, mvd mvdVar) throws ParserException {
        f4i f4iVar;
        int i;
        int iG;
        if (this.n != null) {
            ((jw7) mvdVar.F).getClass();
            return false;
        }
        om8 om8Var = this.q;
        int i2 = 4;
        if (om8Var == null) {
            nkk.m(1, sscVar, false);
            sscVar.r();
            int iZ = sscVar.z();
            int iR = sscVar.r();
            int iO = sscVar.o();
            if (iO <= 0) {
                iO = -1;
            }
            int iO2 = sscVar.o();
            int i3 = iO2 <= 0 ? -1 : iO2;
            sscVar.o();
            int iZ2 = sscVar.z();
            int iPow = (int) Math.pow(2.0d, iZ2 & 15);
            int iPow2 = (int) Math.pow(2.0d, (iZ2 & 240) >> 4);
            sscVar.z();
            ?? CopyOf = Arrays.copyOf(sscVar.a, sscVar.c);
            om8 om8Var2 = new om8();
            om8Var2.a = iZ;
            om8Var2.b = iR;
            om8Var2.c = iO;
            om8Var2.d = i3;
            om8Var2.e = iPow;
            om8Var2.f = iPow2;
            om8Var2.g = CopyOf;
            this.q = om8Var2;
        } else {
            fnf fnfVar = this.r;
            if (fnfVar == null) {
                this.r = nkk.g(sscVar, true, true);
            } else {
                int i4 = sscVar.c;
                byte[] bArr = new byte[i4];
                System.arraycopy(sscVar.a, 0, bArr, 0, i4);
                int i5 = om8Var.a;
                int i6 = 5;
                nkk.m(5, sscVar, false);
                int iZ3 = sscVar.z() + 1;
                dg2 dg2Var = new dg2(sscVar.a);
                int i7 = 8;
                dg2Var.o(sscVar.b * 8);
                int i8 = 0;
                while (true) {
                    int i9 = 16;
                    if (i8 < iZ3) {
                        int i10 = i7;
                        if (dg2Var.g(24) != 5653314) {
                            throw ParserException.a(null, "expected code book to start with [0x56, 0x43, 0x42] at " + ((dg2Var.d * 8) + dg2Var.e));
                        }
                        int iG2 = dg2Var.g(16);
                        int iG3 = dg2Var.g(24);
                        if (dg2Var.f()) {
                            dg2Var.o(i6);
                            int iG4 = 0;
                            while (iG4 < iG3) {
                                int i11 = 0;
                                for (int i12 = iG3 - iG4; i12 > 0; i12 >>>= 1) {
                                    i11++;
                                }
                                iG4 += dg2Var.g(i11);
                            }
                        } else {
                            boolean zF = dg2Var.f();
                            for (int i13 = 0; i13 < iG3; i13++) {
                                if (!zF) {
                                    dg2Var.o(i6);
                                } else if (dg2Var.f()) {
                                    dg2Var.o(i6);
                                }
                            }
                        }
                        int iG5 = dg2Var.g(4);
                        if (iG5 > 2) {
                            throw ParserException.a(null, "lookup type greater than 2 not decodable: " + iG5);
                        }
                        if (iG5 == 1 || iG5 == 2) {
                            dg2Var.o(32);
                            dg2Var.o(32);
                            int iG6 = dg2Var.g(4) + 1;
                            dg2Var.o(1);
                            dg2Var.o((int) ((iG5 == 1 ? iG2 != 0 ? (long) Math.floor(Math.pow(iG3, 1.0d / ((double) iG2))) : 0L : ((long) iG2) * ((long) iG3)) * ((long) iG6)));
                        }
                        i8++;
                        i7 = i10;
                        i6 = 5;
                    } else {
                        int i14 = i7;
                        int i15 = 6;
                        int iG7 = dg2Var.g(6) + 1;
                        for (int i16 = 0; i16 < iG7; i16++) {
                            if (dg2Var.g(16) != 0) {
                                throw ParserException.a(null, "placeholder of time domain transforms not zeroed out");
                            }
                        }
                        int i17 = 1;
                        int iG8 = dg2Var.g(6) + 1;
                        int i18 = 0;
                        while (true) {
                            int i19 = 3;
                            if (i18 < iG8) {
                                int iG9 = dg2Var.g(i9);
                                if (iG9 == 0) {
                                    int i20 = i14;
                                    dg2Var.o(i20);
                                    dg2Var.o(16);
                                    dg2Var.o(16);
                                    dg2Var.o(6);
                                    dg2Var.o(i20);
                                    int iG10 = dg2Var.g(4) + 1;
                                    int i21 = 0;
                                    while (i21 < iG10) {
                                        dg2Var.o(i20);
                                        i21++;
                                        i20 = 8;
                                    }
                                } else {
                                    if (iG9 != i17) {
                                        throw ParserException.a(null, "floor type greater than 1 not decodable: " + iG9);
                                    }
                                    int iG11 = dg2Var.g(5);
                                    int[] iArr = new int[iG11];
                                    int i22 = -1;
                                    for (int i23 = 0; i23 < iG11; i23++) {
                                        int iG12 = dg2Var.g(i2);
                                        iArr[i23] = iG12;
                                        if (iG12 > i22) {
                                            i22 = iG12;
                                        }
                                    }
                                    int i24 = i22 + 1;
                                    int[] iArr2 = new int[i24];
                                    int i25 = 0;
                                    while (i25 < i24) {
                                        iArr2[i25] = dg2Var.g(i19) + 1;
                                        int iG13 = dg2Var.g(2);
                                        int i26 = i14;
                                        if (iG13 > 0) {
                                            dg2Var.o(i26);
                                        }
                                        int[] iArr3 = iArr2;
                                        int i27 = 0;
                                        for (int i28 = 1; i27 < (i28 << iG13); i28 = 1) {
                                            dg2Var.o(i26);
                                            i27++;
                                            i26 = 8;
                                        }
                                        i25++;
                                        iArr2 = iArr3;
                                        i14 = 8;
                                        i19 = 3;
                                    }
                                    int[] iArr4 = iArr2;
                                    dg2Var.o(2);
                                    int iG14 = dg2Var.g(4);
                                    int i29 = 0;
                                    int i30 = 0;
                                    for (int i31 = 0; i31 < iG11; i31++) {
                                        i29 += iArr4[iArr[i31]];
                                        while (i30 < i29) {
                                            dg2Var.o(iG14);
                                            i30++;
                                        }
                                    }
                                }
                                i18++;
                                i14 = 8;
                                i15 = 6;
                                i2 = 4;
                                i9 = 16;
                                i17 = 1;
                            } else {
                                int i32 = 1;
                                int iG15 = dg2Var.g(i15) + 1;
                                int i33 = 0;
                                while (i33 < iG15) {
                                    if (dg2Var.g(16) > 2) {
                                        throw ParserException.a(null, "residueType greater than 2 is not decodable");
                                    }
                                    dg2Var.o(24);
                                    dg2Var.o(24);
                                    dg2Var.o(24);
                                    int iG16 = dg2Var.g(i15) + i32;
                                    int i34 = 8;
                                    dg2Var.o(8);
                                    int[] iArr5 = new int[iG16];
                                    for (int i35 = 0; i35 < iG16; i35++) {
                                        iArr5[i35] = ((dg2Var.f() ? dg2Var.g(5) : 0) * 8) + dg2Var.g(3);
                                    }
                                    int i36 = 0;
                                    while (i36 < iG16) {
                                        int i37 = 0;
                                        while (i37 < i34) {
                                            if ((iArr5[i36] & (1 << i37)) != 0) {
                                                dg2Var.o(i34);
                                            }
                                            i37++;
                                            i34 = 8;
                                        }
                                        i36++;
                                        i34 = 8;
                                    }
                                    i33++;
                                    i15 = 6;
                                    i32 = 1;
                                }
                                int iG17 = dg2Var.g(i15) + 1;
                                for (int i38 = 0; i38 < iG17; i38++) {
                                    int iG18 = dg2Var.g(16);
                                    if (iG18 != 0) {
                                        ysj.j("VorbisUtil", "mapping type other than 0 not supported: " + iG18);
                                    } else {
                                        if (dg2Var.f()) {
                                            i = 1;
                                            iG = dg2Var.g(4) + 1;
                                        } else {
                                            i = 1;
                                            iG = 1;
                                        }
                                        if (dg2Var.f()) {
                                            int iG19 = dg2Var.g(8) + i;
                                            for (int i39 = 0; i39 < iG19; i39++) {
                                                int i40 = i5 - 1;
                                                int i41 = 0;
                                                for (int i42 = i40; i42 > 0; i42 >>>= 1) {
                                                    i41++;
                                                }
                                                dg2Var.o(i41);
                                                int i43 = 0;
                                                while (i40 > 0) {
                                                    i43++;
                                                    i40 >>>= 1;
                                                }
                                                dg2Var.o(i43);
                                            }
                                        }
                                        if (dg2Var.g(2) != 0) {
                                            throw ParserException.a(null, "to reserved bits must be zero after mapping coupling steps");
                                        }
                                        if (iG > 1) {
                                            for (int i44 = 0; i44 < i5; i44++) {
                                                dg2Var.o(4);
                                            }
                                        }
                                        for (int i45 = 0; i45 < iG; i45++) {
                                            dg2Var.o(8);
                                            dg2Var.o(8);
                                            dg2Var.o(8);
                                        }
                                    }
                                }
                                int iG20 = dg2Var.g(6);
                                int i46 = iG20 + 1;
                                r09[] r09VarArr = new r09[i46];
                                for (int i47 = 0; i47 < i46; i47++) {
                                    boolean zF2 = dg2Var.f();
                                    dg2Var.g(16);
                                    dg2Var.g(16);
                                    dg2Var.g(8);
                                    r09VarArr[i47] = new r09(zF2, 3);
                                }
                                if (!dg2Var.f()) {
                                    throw ParserException.a(null, "framing bit after modes not set as expected");
                                }
                                int i48 = 0;
                                while (iG20 > 0) {
                                    i48++;
                                    iG20 >>>= 1;
                                }
                                f4iVar = new f4i();
                                f4iVar.F = om8Var;
                                f4iVar.G = fnfVar;
                                f4iVar.H = bArr;
                                f4iVar.I = r09VarArr;
                                f4iVar.E = i48;
                            }
                        }
                    }
                }
            }
        }
        f4iVar = null;
        this.n = f4iVar;
        if (f4iVar == null) {
            return true;
        }
        om8 om8Var3 = (om8) f4iVar.F;
        ArrayList arrayList = new ArrayList();
        arrayList.add((byte[]) om8Var3.g);
        arrayList.add((byte[]) f4iVar.H);
        gjb gjbVarF = nkk.f(nz8.r((String[]) ((fnf) f4iVar.G).F));
        iw7 iw7Var = new iw7();
        iw7Var.m = gkb.k("audio/ogg");
        iw7Var.n = gkb.k("audio/vorbis");
        iw7Var.h = om8Var3.d;
        iw7Var.i = om8Var3.c;
        iw7Var.F = om8Var3.a;
        iw7Var.G = om8Var3.b;
        iw7Var.q = arrayList;
        iw7Var.k = gjbVarF;
        mvdVar.F = new jw7(iw7Var);
        return true;
    }

    @Override // defpackage.iqg
    public final void d(boolean z) {
        super.d(z);
        if (z) {
            this.n = null;
            this.q = null;
            this.r = null;
        }
        this.o = 0;
        this.p = false;
    }
}
