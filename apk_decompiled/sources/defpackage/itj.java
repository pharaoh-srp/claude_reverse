package defpackage;

import androidx.compose.foundation.layout.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.pvporbit.freetype.FreeTypeConstants;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public abstract class itj {
    public static final ta4 a = new ta4(-2141418820, false, new m14(18));
    public static final ta4 b = new ta4(272509949, false, new p6(15));
    public static final xv8 c = new xv8((Object) null, (Object) null, (Object) null, 29);
    public static xv8 d;

    public static final void a(iqb iqbVar, long j, tkh tkhVar, boolean z, ld4 ld4Var, int i) {
        e18 e18Var;
        iqb iqbVar2;
        iqb iqbVar3;
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(1461756956);
        int i2 = i | 6 | (e18Var2.e(j) ? 32 : 16) | (e18Var2.f(tkhVar) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC);
        if (e18Var2.Q(i2 & 1, (i2 & 1171) != 1170)) {
            e18Var2.V();
            if ((i & 1) == 0 || e18Var2.A()) {
                iqbVar3 = fqb.E;
            } else {
                e18Var2.T();
                iqbVar3 = iqbVar;
            }
            e18Var2.q();
            String str = z ? "·" : " · ";
            Object objN = e18Var2.N();
            if (objN == jd4.a) {
                objN = new qy4(20);
                e18Var2.k0(objN);
            }
            e18Var = e18Var2;
            tjh.b(str, tjf.b(iqbVar3, false, (bz7) objN), j, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, tkhVar, e18Var, (i2 << 3) & 896, (i2 << 15) & 29360128, 131064);
            iqbVar2 = iqbVar3;
        } else {
            e18Var = e18Var2;
            e18Var.T();
            iqbVar2 = iqbVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new p50(iqbVar2, j, tkhVar, z, i);
        }
    }

    public static final void b(x3g x3gVar, bz7 bz7Var, u3g u3gVar, ld4 ld4Var, int i) {
        int i2;
        int i3;
        x3gVar.getClass();
        bz7Var.getClass();
        u3gVar.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-1655246289);
        if ((i & 6) == 0) {
            i2 = (e18Var.d(x3gVar.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var.h(bz7Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= e18Var.d(u3gVar.ordinal()) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if (e18Var.Q(i2 & 1, (i2 & 147) != 146)) {
            fqb fqbVar = fqb.E;
            iqb iqbVarP = yfd.p(ez1.t(b.c(fqbVar, 1.0f), MTTypesetterKt.kLineSkipLimitMultiplier, gm3.a(e18Var).u, gm3.b(e18Var).f), gm3.a(e18Var).n, gm3.b(e18Var).f);
            q64 q64VarA = p64.a(ko0.c, lja.S, e18Var, 0);
            int iHashCode = Long.hashCode(e18Var.T);
            hyc hycVarL = e18Var.l();
            iqb iqbVarE = kxk.E(e18Var, iqbVarP);
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
            String strJ0 = d4c.j0(R.string.share_status_private_description, e18Var);
            boolean z = x3gVar == x3g.G;
            iqb iqbVarV = xn5.V(fqbVar, xve.d(12.0f, 12.0f, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, 12));
            int i4 = i2 & 112;
            boolean z2 = i4 == 32;
            Object objN = e18Var.N();
            lz1 lz1Var = jd4.a;
            if (z2 || objN == lz1Var) {
                objN = new zb2(17, bz7Var);
                e18Var.k0(objN);
            }
            rta.e(ytk.a, strJ0, z, iqbVarV, null, null, null, null, MTTypesetterKt.kLineSkipLimitMultiplier, null, (zy7) objN, e18Var, 6, 0, 1008);
            iuj.e(null, MTTypesetterKt.kLineSkipLimitMultiplier, 0L, e18Var, 0, 7);
            e18Var.a0(-2062547617);
            int iOrdinal = u3gVar.ordinal();
            if (iOrdinal == 0) {
                i3 = R.string.share_status_org_shared_description;
            } else {
                if (iOrdinal != 1) {
                    wg6.i();
                    return;
                }
                i3 = R.string.share_status_public_description;
            }
            String strJ02 = d4c.j0(i3, e18Var);
            e18Var.p(false);
            boolean z3 = x3gVar == x3g.F;
            iqb iqbVarV2 = xn5.V(fqbVar, xve.d(MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, 12.0f, 12.0f, 3));
            ta4 ta4VarQ0 = fd9.q0(976985401, new ska(25, u3gVar), e18Var);
            boolean z4 = i4 == 32;
            Object objN2 = e18Var.N();
            if (z4 || objN2 == lz1Var) {
                objN2 = new zb2(18, bz7Var);
                e18Var.k0(objN2);
            }
            rta.e(ta4VarQ0, strJ02, z3, iqbVarV2, null, null, null, null, MTTypesetterKt.kLineSkipLimitMultiplier, null, (zy7) objN2, e18Var, 6, 0, 1008);
            e18Var.p(true);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new c3g(x3gVar, i, bz7Var, u3gVar, 1);
        }
    }

    public static byte[] c(ArrayDeque arrayDeque, int i) {
        if (arrayDeque.isEmpty()) {
            return new byte[0];
        }
        byte[] bArr = (byte[]) arrayDeque.remove();
        if (bArr.length == i) {
            return bArr;
        }
        int length = i - bArr.length;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, i);
        while (length > 0) {
            byte[] bArr2 = (byte[]) arrayDeque.remove();
            int iMin = Math.min(length, bArr2.length);
            System.arraycopy(bArr2, 0, bArrCopyOf, i - length, iMin);
            length -= iMin;
        }
        return bArrCopyOf;
    }

    public static txc d() {
        return txc.c;
    }

    public static Enum e(Class cls, String str) {
        return Enum.valueOf(cls, str);
    }

    public static final r7i f(pz7 pz7Var, d8a d8aVar, ld4 ld4Var) {
        pz7Var.getClass();
        d8aVar.getClass();
        nwb nwbVarZ = mpk.Z(pz7Var, ld4Var);
        e18 e18Var = (e18) ld4Var;
        boolean zF = e18Var.f(nwbVarZ);
        Object objN = e18Var.N();
        lz1 lz1Var = jd4.a;
        if (zF || objN == lz1Var) {
            objN = new ol5(8, nwbVarZ);
            e18Var.k0(objN);
        }
        ti7 ti7VarA = ui7.a(d8aVar, (bz7) objN, e18Var, 0, 0);
        boolean zF2 = e18Var.f(nwbVarZ);
        Object objN2 = e18Var.N();
        if (zF2 || objN2 == lz1Var) {
            objN2 = new ol5(9, nwbVarZ);
            e18Var.k0(objN2);
        }
        l4h l4hVarM = u00.M(e18Var, (bz7) objN2);
        boolean zF3 = e18Var.f(nwbVarZ);
        Object objN3 = e18Var.N();
        if (zF3 || objN3 == lz1Var) {
            objN3 = new ol5(10, nwbVarZ);
            e18Var.k0(objN3);
        }
        return new r7i(ti7VarA, l4hVarM, uuj.i(20, false, (bz7) objN3, e18Var, 6, 2));
    }

    public static byte[] g(v12 v12Var) throws IOException {
        ArrayDeque arrayDeque = new ArrayDeque(20);
        int iMin = Math.min(FreeTypeConstants.FT_LOAD_LINEAR_DESIGN, Math.max(FreeTypeConstants.FT_LOAD_PEDANTIC, Integer.highestOneBit(0) * 2));
        int i = 0;
        while (i < 2147483639) {
            int iMin2 = Math.min(iMin, 2147483639 - i);
            byte[] bArr = new byte[iMin2];
            arrayDeque.add(bArr);
            int i2 = 0;
            while (i2 < iMin2) {
                int i3 = v12Var.read(bArr, i2, iMin2 - i2);
                if (i3 == -1) {
                    return c(arrayDeque, i);
                }
                i2 += i3;
                i += i3;
            }
            long j = ((long) iMin) * ((long) (iMin < 4096 ? 4 : 2));
            iMin = j > 2147483647L ? Integer.MAX_VALUE : j < -2147483648L ? Integer.MIN_VALUE : (int) j;
        }
        if (v12Var.read() == -1) {
            return c(arrayDeque, 2147483639);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }
}
