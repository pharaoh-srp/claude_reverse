package defpackage;

import androidx.compose.foundation.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.pvporbit.freetype.FreeTypeConstants;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ntj {
    public static final ta4 a = new ta4(-813572856, false, new m14(19));
    public static final cm4 b = new cm4();

    public static final void a(bpc bpcVar, final vxc vxcVar, zy7 zy7Var, zy7 zy7Var2, iqb iqbVar, ld4 ld4Var, int i) {
        e18 e18Var;
        bpcVar.getClass();
        vxcVar.getClass();
        zy7Var.getClass();
        zy7Var2.getClass();
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(-2097080750);
        final int i2 = 2;
        int i3 = i | (e18Var2.h(bpcVar) ? 4 : 2) | (e18Var2.f(vxcVar) ? 32 : 16) | (e18Var2.h(zy7Var) ? 256 : FreeTypeConstants.FT_LOAD_PEDANTIC) | (e18Var2.h(zy7Var2) ? 2048 : FreeTypeConstants.FT_LOAD_NO_RECURSE);
        final int i4 = 0;
        final int i5 = 1;
        if (e18Var2.Q(i3 & 1, (i3 & 9363) != 9362)) {
            qnc qncVar = qf2.a;
            iqb iqbVarP = ybi.p(iqbVar, qf2.c(e18Var2));
            boolean z = ((i3 & 896) == 256) | ((i3 & 112) == 32) | ((i3 & 7168) == 2048);
            Object objN = e18Var2.N();
            if (z || objN == jd4.a) {
                objN = new hya(vxcVar, zy7Var2, zy7Var, 11);
                e18Var2.k0(objN);
            }
            e18Var = e18Var2;
            ybi.b(fd9.q0(1557559419, new lpa(bpcVar, 18, vxcVar), e18Var2), fd9.q0(-1975526566, new pz7() { // from class: uxc
                /* JADX WARN: Removed duplicated region for block: B:47:0x0110  */
                /* JADX WARN: Removed duplicated region for block: B:49:0x0121  */
                @Override // defpackage.pz7
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object invoke(java.lang.Object r32, java.lang.Object r33) {
                    /*
                        Method dump skipped, instruction units count: 562
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.uxc.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
                }
            }, e18Var2), b.c(iqbVarP, false, null, null, null, (zy7) objN, 15), fd9.q0(-451763944, new pz7() { // from class: uxc
                /* JADX WARN: Removed duplicated region for block: B:47:0x0110  */
                /* JADX WARN: Removed duplicated region for block: B:49:0x0121  */
                @Override // defpackage.pz7
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object invoke(java.lang.Object r32, java.lang.Object r33) {
                    /*
                        Method dump skipped, instruction units count: 562
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.uxc.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
                }
            }, e18Var2), fd9.q0(310117367, new pz7() { // from class: uxc
                /* JADX WARN: Removed duplicated region for block: B:47:0x0110  */
                /* JADX WARN: Removed duplicated region for block: B:49:0x0121  */
                @Override // defpackage.pz7
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object invoke(java.lang.Object r32, java.lang.Object r33) {
                    /*
                        Method dump skipped, instruction units count: 562
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.uxc.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
                }
            }, e18Var2), 0L, qncVar, MTTypesetterKt.kLineSkipLimitMultiplier, null, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, false, null, null, e18Var, 27702, 0, 16288);
        } else {
            e18Var = e18Var2;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new uo((Object) bpcVar, (Object) vxcVar, (Object) zy7Var, (Object) zy7Var2, (Object) iqbVar, i, 29);
        }
    }

    public static byte[] b(byte[]... bArr) throws GeneralSecurityException {
        int length = 0;
        for (byte[] bArr2 : bArr) {
            if (length > Integer.MAX_VALUE - bArr2.length) {
                rl7.j("exceeded size limit");
                return null;
            }
            length += bArr2.length;
        }
        byte[] bArr3 = new byte[length];
        int length2 = 0;
        for (byte[] bArr4 : bArr) {
            System.arraycopy(bArr4, 0, bArr3, length2, bArr4.length);
            length2 += bArr4.length;
        }
        return bArr3;
    }

    public static final ArrayList c(ArrayList arrayList, Collection collection, h08 h08Var) {
        yr9 yr9VarF;
        collection.getClass();
        arrayList.size();
        collection.size();
        ArrayList<cpc> arrayListV1 = w44.v1(arrayList, collection);
        ArrayList arrayList2 = new ArrayList(x44.y(arrayListV1, 10));
        for (cpc cpcVar : arrayListV1) {
            yr9 yr9Var = (yr9) cpcVar.E;
            eri eriVar = (eri) cpcVar.F;
            int i = eriVar.J;
            wc0 annotations = eriVar.getAnnotations();
            sxb name = eriVar.getName();
            name.getClass();
            boolean zP0 = eriVar.P0();
            boolean z = eriVar.L;
            boolean z2 = eriVar.M;
            if (eriVar.N != null) {
                int i2 = o06.a;
                tqb tqbVarD = m06.d(h08Var);
                tqbVarD.getClass();
                yr9VarF = tqbVarD.f().f(yr9Var);
            } else {
                yr9VarF = null;
            }
            yr9 yr9Var2 = yr9VarF;
            neg negVarD = eriVar.d();
            negVarD.getClass();
            arrayList2.add(new eri(h08Var, null, i, annotations, name, yr9Var, zP0, z, z2, yr9Var2, negVarD));
        }
        return arrayList2;
    }

    public static void d(lrb lrbVar) {
        zf zfVar;
        ArrayList arrayList = new ArrayList();
        yqb yqbVar = yqb.b;
        Iterator it = ((ConcurrentMap) lrbVar.F).values().iterator();
        while (it.hasNext()) {
            for (sfd sfdVar : (List) it.next()) {
                int iOrdinal = sfdVar.d.ordinal();
                if (iOrdinal == 1) {
                    zfVar = zf.W;
                } else if (iOrdinal == 2) {
                    zfVar = zf.X;
                } else {
                    if (iOrdinal != 3) {
                        sz6.j("Unknown key status");
                        return;
                    }
                    zfVar = zf.Y;
                }
                int i = sfdVar.f;
                String strSubstring = sfdVar.g;
                if (strSubstring.startsWith("type.googleapis.com/google.crypto.")) {
                    strSubstring = strSubstring.substring(34);
                }
                arrayList.add(new zqb(zfVar, i, strSubstring, sfdVar.e.name()));
            }
        }
        sfd sfdVar2 = (sfd) lrbVar.G;
        Integer numValueOf = sfdVar2 != null ? Integer.valueOf(sfdVar2.f) : null;
        if (numValueOf != null) {
            try {
                int iIntValue = numValueOf.intValue();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    if (((zqb) it2.next()).b == iIntValue) {
                    }
                }
                throw new GeneralSecurityException("primary key ID is not present in entries");
            } catch (GeneralSecurityException e) {
                pmf.m(e);
                return;
            }
        }
        Collections.unmodifiableList(arrayList);
    }

    public static final ny9 e(qqb qqbVar) {
        qqb qqbVar2;
        xh3 xh3VarA;
        qqbVar.getClass();
        int i = o06.a;
        Iterator it = qqbVar.W().O().b().iterator();
        while (true) {
            if (!it.hasNext()) {
                qqbVar2 = null;
                break;
            }
            yr9 yr9Var = (yr9) it.next();
            if (!or9.w(yr9Var)) {
                xh3VarA = yr9Var.O().a();
                if (m06.n(xh3VarA, 1) || m06.n(xh3VarA, 3)) {
                    break;
                }
            }
        }
        xh3VarA.getClass();
        qqbVar2 = (qqb) xh3VarA;
        if (qqbVar2 == null) {
            return null;
        }
        fab fabVarB0 = qqbVar2.b0();
        ny9 ny9Var = fabVarB0 instanceof ny9 ? (ny9) fabVarB0 : null;
        return ny9Var == null ? e(qqbVar2) : ny9Var;
    }

    public static long f(double d) {
        fd9.C("not a normal value", h(d));
        int exponent = Math.getExponent(d);
        long jDoubleToRawLongBits = Double.doubleToRawLongBits(d) & 4503599627370495L;
        return exponent == -1023 ? jDoubleToRawLongBits << 1 : jDoubleToRawLongBits | 4503599627370496L;
    }

    public static kw9 g() {
        return yb5.w(w1a.E, new m99(4));
    }

    public static boolean h(double d) {
        return Math.getExponent(d) <= 1023;
    }

    public static final wu8 i(z3g z3gVar, ld4 ld4Var) {
        z3gVar.getClass();
        return vz8.G(z3gVar.d, z3gVar.b, 0L, ld4Var, 12);
    }

    public static final void j(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i) {
        if (i < 0 || byteBuffer2.remaining() < i || byteBuffer3.remaining() < i || byteBuffer.remaining() < i) {
            sz6.p("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
            return;
        }
        for (int i2 = 0; i2 < i; i2++) {
            byteBuffer.put((byte) (byteBuffer2.get() ^ byteBuffer3.get()));
        }
    }

    public static final byte[] k(int i, int i2, int i3, byte[] bArr, byte[] bArr2) {
        if (i3 < 0 || bArr.length - i3 < i || bArr2.length - i3 < i2) {
            sz6.p("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
            return null;
        }
        byte[] bArr3 = new byte[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            bArr3[i4] = (byte) (bArr[i4 + i] ^ bArr2[i4 + i2]);
        }
        return bArr3;
    }

    public static final byte[] l(byte[] bArr, byte[] bArr2) {
        if (bArr.length == bArr2.length) {
            return k(0, 0, bArr.length, bArr, bArr2);
        }
        sz6.p("The lengths of x and y should match.");
        return null;
    }
}
