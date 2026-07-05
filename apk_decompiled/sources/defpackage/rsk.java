package defpackage;

import android.view.View;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.b;
import com.anthropic.claude.conway.protocol.UploadResult;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.shaded.protobuf.l;
import com.google.crypto.tink.shaded.protobuf.o;
import com.pvporbit.freetype.FreeTypeConstants;
import io.sentry.w6;
import java.util.Arrays;
import java.util.Locale;
import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
public abstract class rsk {
    public static final ta4 a = new ta4(418859042, false, new wb4(10));
    public static final ta4 b = new ta4(487067481, false, new wb4(11));
    public static final ta4 c = new ta4(-1377149350, false, new wb4(12));

    public static final long a(float f, boolean z, boolean z2) {
        return (((z ? 1L : 0L) | (z2 ? 2L : 0L)) & 4294967295L) | (((long) Float.floatToRawIntBits(f)) << 32);
    }

    public static final void c(final zy7 zy7Var, long j, final gnb gnbVar, ta4 ta4Var, ld4 ld4Var, int i) {
        int i2;
        gnb gnbVar2;
        final fu9 fu9Var;
        lz1 lz1Var;
        boolean z;
        boolean z2;
        long j2 = j;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-85756322);
        if ((i & 6) == 0) {
            i2 = (e18Var.h(zy7Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var.e(j2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            gnbVar2 = gnbVar;
            i2 |= e18Var.f(gnbVar2) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        } else {
            gnbVar2 = gnbVar;
        }
        if ((i & 3072) == 0) {
            i2 |= e18Var.h(ta4Var) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        int i3 = i2;
        if (e18Var.Q(i3 & 1, (i3 & 1171) != 1170)) {
            e18Var.V();
            if ((i & 1) != 0 && !e18Var.A()) {
                e18Var.T();
            }
            e18Var.q();
            View view = (View) e18Var.j(w00.f);
            cz5 cz5Var = (cz5) e18Var.j(ve4.h);
            fu9 fu9Var2 = (fu9) e18Var.j(ve4.n);
            c18 c18VarF = iuj.F(e18Var);
            nwb nwbVarZ = mpk.Z(ta4Var, e18Var);
            Object[] objArr = new Object[0];
            Object objN = e18Var.N();
            lz1 lz1Var2 = jd4.a;
            if (objN == lz1Var2) {
                objN = new ulb(16);
                e18Var.k0(objN);
            }
            UUID uuid = (UUID) iuj.I(objArr, (zy7) objN, e18Var, 48);
            boolean zF = e18Var.f(view) | e18Var.f(cz5Var);
            Object objN2 = e18Var.N();
            if (zF || objN2 == lz1Var2) {
                fu9Var = fu9Var2;
                lz1Var = lz1Var2;
                z = true;
                z2 = false;
                bnb bnbVar = new bnb(zy7Var, gnbVar2, j2, view, fu9Var, cz5Var, uuid);
                j2 = j2;
                ta4 ta4Var2 = new ta4(1379699857, true, new jj2(13, nwbVarZ));
                anb anbVar = bnbVar.M;
                anbVar.setParentCompositionContext(c18VarF);
                anbVar.O.setValue(ta4Var2);
                anbVar.P = true;
                anbVar.d();
                e18Var.k0(bnbVar);
                objN2 = bnbVar;
            } else {
                lz1Var = lz1Var2;
                fu9Var = fu9Var2;
                z = true;
                z2 = false;
            }
            final bnb bnbVar2 = (bnb) objN2;
            boolean zH = e18Var.h(bnbVar2);
            Object objN3 = e18Var.N();
            if (zH || objN3 == lz1Var) {
                objN3 = new tl8(14, bnbVar2);
                e18Var.k0(objN3);
            }
            fd9.d(bnbVar2, (bz7) objN3, e18Var);
            boolean zH2 = e18Var.h(bnbVar2) | ((i3 & 14) == 4 ? z : z2) | ((i3 & 896) == 256 ? z : z2) | (((((i3 & 112) ^ 48) <= 32 || !e18Var.e(j2)) && (i3 & 48) != 32) ? z2 : z) | e18Var.d(fu9Var.ordinal());
            Object objN4 = e18Var.N();
            if (zH2 || objN4 == lz1Var) {
                final long j3 = j2;
                zy7 zy7Var2 = new zy7() { // from class: hnb
                    @Override // defpackage.zy7
                    public final Object a() {
                        bnbVar2.h(zy7Var, gnbVar, j3, fu9Var);
                        return iei.a;
                    }
                };
                e18Var.k0(zy7Var2);
                objN4 = zy7Var2;
            }
            fd9.s((zy7) objN4, e18Var);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new ff2(zy7Var, j, gnbVar, ta4Var, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:126:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(defpackage.ta4 r25, final boolean r26, final boolean r27, defpackage.iqb r28, defpackage.zy7 r29, final defpackage.t3 r30, float r31, float r32, defpackage.mnc r33, defpackage.pz7 r34, defpackage.ld4 r35, final int r36, final int r37) {
        /*
            Method dump skipped, instruction units count: 636
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rsk.d(ta4, boolean, boolean, iqb, zy7, t3, float, float, mnc, pz7, ld4, int, int):void");
    }

    public static final void e(t3 t3Var, float f, iqb iqbVar, ld4 ld4Var, int i) {
        int i2;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-450023481);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? e18Var.f(t3Var) : e18Var.h(t3Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var.c(f) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if (e18Var.Q(i3 & 1, (i3 & 147) != 146)) {
            boolean z = t3Var instanceof pqh;
            fqb fqbVar = fqb.E;
            if (z) {
                e18Var.a0(-2056403700);
                iqb iqbVarO = b.o(fqbVar, f);
                o5b o5bVarD = dw1.d(lja.K, false);
                int iHashCode = Long.hashCode(e18Var.T);
                hyc hycVarL = e18Var.l();
                iqb iqbVarE = kxk.E(e18Var, iqbVarO);
                dd4.e.getClass();
                re4 re4Var = cd4.b;
                e18Var.e0();
                if (e18Var.S) {
                    e18Var.k(re4Var);
                } else {
                    e18Var.n0();
                }
                d4c.i0(e18Var, cd4.f, o5bVarD);
                d4c.i0(e18Var, cd4.e, hycVarL);
                d4c.i0(e18Var, cd4.g, Integer.valueOf(iHashCode));
                d4c.h0(e18Var, cd4.h);
                d4c.i0(e18Var, cd4.d, iqbVarE);
                pqh pqhVar = (pqh) t3Var;
                dw1.a(yfd.p(b.o(fqbVar, 9.0f), pqhVar.G, xve.b(pqhVar.H)), e18Var, 0);
                e18Var.p(true);
                e18Var.p(false);
            } else {
                if (!(t3Var instanceof qqh)) {
                    throw ebh.u(e18Var, 1319136042, false);
                }
                e18Var.a0(-2055909994);
                o5b o5bVarD2 = dw1.d(lja.G, false);
                int iHashCode2 = Long.hashCode(e18Var.T);
                hyc hycVarL2 = e18Var.l();
                iqb iqbVarE2 = kxk.E(e18Var, fqbVar);
                dd4.e.getClass();
                re4 re4Var2 = cd4.b;
                e18Var.e0();
                if (e18Var.S) {
                    e18Var.k(re4Var2);
                } else {
                    e18Var.n0();
                }
                d4c.i0(e18Var, cd4.f, o5bVarD2);
                d4c.i0(e18Var, cd4.e, hycVarL2);
                d4c.i0(e18Var, cd4.g, Integer.valueOf(iHashCode2));
                d4c.h0(e18Var, cd4.h);
                d4c.i0(e18Var, cd4.d, iqbVarE2);
                ((qqh) t3Var).I.invoke(new va6(f), e18Var, Integer.valueOf((i3 >> 3) & 14));
                e18Var.p(true);
                e18Var.p(false);
            }
            iqbVar = fqbVar;
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new uke(t3Var, f, iqbVar, i);
        }
    }

    public static final void f(final boolean z, final boolean z2, final t3 t3Var, final float f, ld4 ld4Var, final int i) {
        int i2;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(1711889000);
        if ((i & 6) == 0) {
            i2 = (e18Var.f(fxe.a) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var.g(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= e18Var.g(z2) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if ((i & 3072) == 0) {
            i2 |= (i & FreeTypeConstants.FT_LOAD_MONOCHROME) == 0 ? e18Var.f(t3Var) : e18Var.h(t3Var) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        if ((i & 24576) == 0) {
            i2 |= e18Var.c(f) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        }
        int i3 = 1;
        if (e18Var.Q(i2 & 1, (i2 & 9363) != 9362)) {
            cz5 cz5Var = (cz5) e18Var.j(ve4.h);
            fqb fqbVar = fqb.E;
            iqb iqbVarT = b.t(fqbVar, f);
            FillElement fillElement = b.b;
            iqb iqbVarB = iqbVarT.B(fillElement);
            boolean zF = ((57344 & i2) == 16384) | e18Var.f(cz5Var);
            Object objN = e18Var.N();
            if (zF || objN == jd4.a) {
                objN = new cv1(cz5Var, f, 5);
                e18Var.k0(objN);
            }
            iqb iqbVarB2 = iqbVarB.B(new jfj(new jke(i3, (bz7) objN)));
            q64 q64VarA = p64.a(ko0.c, lja.T, e18Var, 48);
            int iHashCode = Long.hashCode(e18Var.T);
            hyc hycVarL = e18Var.l();
            iqb iqbVarE = kxk.E(e18Var, iqbVarB2);
            dd4.e.getClass();
            re4 re4Var = cd4.b;
            e18Var.e0();
            if (e18Var.S) {
                e18Var.k(re4Var);
            } else {
                e18Var.n0();
            }
            d4c.i0(e18Var, cd4.f, q64VarA);
            d4c.i0(e18Var, cd4.e, hycVarL);
            d4c.i0(e18Var, cd4.g, Integer.valueOf(iHashCode));
            d4c.h0(e18Var, cd4.h);
            d4c.i0(e18Var, cd4.d, iqbVarE);
            e(t3Var, f, null, e18Var, (i2 >> 9) & 126);
            if (!z || z2) {
                e18Var.a0(-611744517);
                dw1.a(yfd.o(b.t(fqbVar, 1.0f).B(fillElement), (jy1) ((u0h) t3Var.F).getValue()), e18Var, 0);
                e18Var.p(false);
            } else {
                e18Var.a0(-611551356);
                e18Var.p(false);
            }
            e18Var.p(true);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new pz7() { // from class: oqh
                @Override // defpackage.pz7
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    rsk.f(z, z2, t3Var, f, (ld4) obj, x44.p0(i | 1));
                    return iei.a;
                }
            };
        }
    }

    public static final String h(cx4 cx4Var, UploadResult uploadResult) {
        String str;
        cx4Var.getClass();
        uploadResult.getClass();
        long size = uploadResult.getSize();
        if (size < 1024) {
            str = size + " B";
        } else if (size < w6.MAX_EVENT_SIZE_BYTES) {
            str = (size / 1024) + " KB";
        } else {
            str = String.format(Locale.ROOT, "%.1f MB", Arrays.copyOf(new Object[]{Double.valueOf(size / 1048576.0d)}, 1));
        }
        if (!isg.q0(cx4Var.c, "image/", false)) {
            return ij0.l("File uploaded to ", uploadResult.getPath(), " (", str, "). Read via fs.readFile or host_bash.");
        }
        return ij0.m(kgh.r("Image uploaded to ", uploadResult.getPath(), " (", str, "). Use view_image(\""), uploadResult.getPath(), "\") to see it.");
    }

    public static int i(byte[] bArr, int i, oo0 oo0Var) throws InvalidProtocolBufferException {
        int iQ = q(bArr, i, oo0Var);
        int i2 = oo0Var.a;
        if (i2 < 0) {
            throw InvalidProtocolBufferException.e();
        }
        if (i2 > bArr.length - iQ) {
            throw InvalidProtocolBufferException.g();
        }
        if (i2 == 0) {
            oo0Var.c = k22.F;
            return iQ;
        }
        oo0Var.c = k22.e(bArr, iQ, i2);
        return iQ + i2;
    }

    public static int j(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    public static long k(byte[] bArr, int i) {
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }

    public static int l(e7f e7fVar, int i, byte[] bArr, int i2, int i3, p89 p89Var, oo0 oo0Var) throws InvalidProtocolBufferException {
        Object objD = e7fVar.d();
        e7f e7fVar2 = e7fVar;
        byte[] bArr2 = bArr;
        int i4 = i3;
        oo0 oo0Var2 = oo0Var;
        int iT = t(objD, e7fVar2, bArr2, i2, i4, oo0Var2);
        e7fVar2.b(objD);
        oo0Var2.c = objD;
        p89Var.add(objD);
        while (iT < i4) {
            oo0 oo0Var3 = oo0Var2;
            int i5 = i4;
            int iQ = q(bArr2, iT, oo0Var3);
            if (i != oo0Var3.a) {
                break;
            }
            byte[] bArr3 = bArr2;
            e7f e7fVar3 = e7fVar2;
            Object objD2 = e7fVar3.d();
            iT = t(objD2, e7fVar3, bArr3, iQ, i5, oo0Var3);
            e7fVar2 = e7fVar3;
            bArr2 = bArr3;
            i4 = i5;
            oo0Var2 = oo0Var3;
            e7fVar2.b(objD2);
            oo0Var2.c = objD2;
            p89Var.add(objD2);
        }
        return iT;
    }

    public static int m(byte[] bArr, int i, oo0 oo0Var) throws InvalidProtocolBufferException {
        int iQ = q(bArr, i, oo0Var);
        int i2 = oo0Var.a;
        if (i2 < 0) {
            throw InvalidProtocolBufferException.e();
        }
        if (i2 == 0) {
            oo0Var.c = "";
            return iQ;
        }
        oo0Var.c = new String(bArr, iQ, i2, t89.a);
        return iQ + i2;
    }

    public static int n(byte[] bArr, int i, oo0 oo0Var) throws InvalidProtocolBufferException {
        int iQ = q(bArr, i, oo0Var);
        int i2 = oo0Var.a;
        if (i2 < 0) {
            throw InvalidProtocolBufferException.e();
        }
        if (i2 == 0) {
            oo0Var.c = "";
            return iQ;
        }
        oo0Var.c = o.a.l(bArr, iQ, i2);
        return iQ + i2;
    }

    public static int o(int i, byte[] bArr, int i2, int i3, l lVar, oo0 oo0Var) throws InvalidProtocolBufferException {
        if ((i >>> 3) == 0) {
            throw InvalidProtocolBufferException.a();
        }
        int i4 = i & 7;
        if (i4 == 0) {
            int iS = s(bArr, i2, oo0Var);
            lVar.d(i, Long.valueOf(oo0Var.b));
            return iS;
        }
        if (i4 == 1) {
            lVar.d(i, Long.valueOf(k(bArr, i2)));
            return i2 + 8;
        }
        if (i4 == 2) {
            int iQ = q(bArr, i2, oo0Var);
            int i5 = oo0Var.a;
            if (i5 < 0) {
                throw InvalidProtocolBufferException.e();
            }
            if (i5 > bArr.length - iQ) {
                throw InvalidProtocolBufferException.g();
            }
            if (i5 == 0) {
                lVar.d(i, k22.F);
            } else {
                lVar.d(i, k22.e(bArr, iQ, i5));
            }
            return iQ + i5;
        }
        if (i4 != 3) {
            if (i4 != 5) {
                throw InvalidProtocolBufferException.a();
            }
            lVar.d(i, Integer.valueOf(j(bArr, i2)));
            return i2 + 4;
        }
        l lVarC = l.c();
        int i6 = (i & (-8)) | 4;
        int i7 = 0;
        while (true) {
            if (i2 >= i3) {
                break;
            }
            int iQ2 = q(bArr, i2, oo0Var);
            i7 = oo0Var.a;
            if (i7 == i6) {
                i2 = iQ2;
                break;
            }
            i2 = o(i7, bArr, iQ2, i3, lVarC, oo0Var);
        }
        if (i2 > i3 || i7 != i6) {
            throw InvalidProtocolBufferException.f();
        }
        lVar.d(i, lVarC);
        return i2;
    }

    public static int p(int i, byte[] bArr, int i2, oo0 oo0Var) {
        int i3 = i & 127;
        int i4 = i2 + 1;
        byte b2 = bArr[i2];
        if (b2 >= 0) {
            oo0Var.a = i3 | (b2 << 7);
            return i4;
        }
        int i5 = i3 | ((b2 & 127) << 7);
        int i6 = i2 + 2;
        byte b3 = bArr[i4];
        if (b3 >= 0) {
            oo0Var.a = i5 | (b3 << 14);
            return i6;
        }
        int i7 = i5 | ((b3 & 127) << 14);
        int i8 = i2 + 3;
        byte b4 = bArr[i6];
        if (b4 >= 0) {
            oo0Var.a = i7 | (b4 << 21);
            return i8;
        }
        int i9 = i7 | ((b4 & 127) << 21);
        int i10 = i2 + 4;
        byte b5 = bArr[i8];
        if (b5 >= 0) {
            oo0Var.a = i9 | (b5 << 28);
            return i10;
        }
        int i11 = i9 | ((b5 & 127) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                oo0Var.a = i11;
                return i12;
            }
            i10 = i12;
        }
    }

    public static int q(byte[] bArr, int i, oo0 oo0Var) {
        int i2 = i + 1;
        byte b2 = bArr[i];
        if (b2 < 0) {
            return p(b2, bArr, i2, oo0Var);
        }
        oo0Var.a = b2;
        return i2;
    }

    public static int r(int i, byte[] bArr, int i2, int i3, p89 p89Var, oo0 oo0Var) {
        n69 n69Var = (n69) p89Var;
        int iQ = q(bArr, i2, oo0Var);
        n69Var.b(oo0Var.a);
        while (iQ < i3) {
            int iQ2 = q(bArr, iQ, oo0Var);
            if (i != oo0Var.a) {
                break;
            }
            iQ = q(bArr, iQ2, oo0Var);
            n69Var.b(oo0Var.a);
        }
        return iQ;
    }

    public static int s(byte[] bArr, int i, oo0 oo0Var) {
        int i2 = i + 1;
        long j = bArr[i];
        if (j >= 0) {
            oo0Var.b = j;
            return i2;
        }
        int i3 = i + 2;
        byte b2 = bArr[i2];
        long j2 = (j & 127) | (((long) (b2 & 127)) << 7);
        int i4 = 7;
        while (b2 < 0) {
            int i5 = i3 + 1;
            byte b3 = bArr[i3];
            i4 += 7;
            j2 |= ((long) (b3 & 127)) << i4;
            b2 = b3;
            i3 = i5;
        }
        oo0Var.b = j2;
        return i3;
    }

    public static int t(Object obj, e7f e7fVar, byte[] bArr, int i, int i2, oo0 oo0Var) throws InvalidProtocolBufferException {
        int iP = i + 1;
        int i3 = bArr[i];
        if (i3 < 0) {
            iP = p(i3, bArr, iP, oo0Var);
            i3 = oo0Var.a;
        }
        int i4 = iP;
        if (i3 < 0 || i3 > i2 - i4) {
            throw InvalidProtocolBufferException.g();
        }
        int i5 = i4 + i3;
        e7fVar.j(obj, bArr, i4, i5, oo0Var);
        oo0Var.c = obj;
        return i5;
    }

    public static boolean u(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }
}
