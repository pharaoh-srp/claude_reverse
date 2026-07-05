package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.layout.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.anthropic.claude.design.icon.a;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.ArrayList;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class gtk {
    public static final ta4 a = new ta4(-651289903, false, new xb4(17));

    public static final void a(ArrayList arrayList, bz7 bz7Var, bz7 bz7Var2, boolean z, boolean z2, iqb iqbVar, yzb yzbVar, zy7 zy7Var, ld4 ld4Var, int i) {
        e18 e18Var;
        Object m50Var;
        ho0 ho0Var;
        qnc qncVar;
        bz7Var.getClass();
        bz7Var2.getClass();
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(1274942191);
        int i2 = i | (e18Var2.f(arrayList) ? 32 : 16) | (e18Var2.h(bz7Var2) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE) | (e18Var2.g(z) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN) | (e18Var2.g(z2) ? 131072 : 65536) | (e18Var2.f(iqbVar) ? FreeTypeConstants.FT_LOAD_COLOR : 524288) | (e18Var2.f(yzbVar) ? 8388608 : 4194304) | (e18Var2.h(zy7Var) ? 67108864 : 33554432);
        int i3 = 1;
        if (e18Var2.Q(i2 & 1, (38347923 & i2) != 38347922)) {
            lx9 lx9VarA = ox9.a(0, 3, e18Var2);
            Object objN = e18Var2.N();
            lz1 lz1Var = jd4.a;
            if (objN == lz1Var) {
                objN = mpk.w(new d7(6, lx9VarA));
                e18Var2.k0(objN);
            }
            wlg wlgVar = (wlg) objN;
            Object objN2 = e18Var2.N();
            if (objN2 == lz1Var) {
                objN2 = mpk.w(new vv(z2, wlgVar, i3));
                e18Var2.k0(objN2);
            }
            wlg wlgVar2 = (wlg) objN2;
            Boolean bool = (Boolean) wlgVar2.getValue();
            bool.getClass();
            boolean z3 = (i2 & 234881024) == 67108864;
            Object objN3 = e18Var2.N();
            if (z3 || objN3 == lz1Var) {
                objN3 = new nu(zy7Var, wlgVar2, 2);
                e18Var2.k0(objN3);
            }
            mwa.d(bool, null, (bz7) objN3, e18Var2, 0);
            wa8 wa8Var = new wa8(150.0f);
            qnc qncVar2 = j9a.a;
            qnc qncVar3 = new qnc(16.0f, 12.0f, 16.0f, 12.0f);
            int i4 = 1;
            ho0 ho0Var2 = new ho0(12.0f, true, new sz6(i4));
            ho0 ho0Var3 = new ho0(20.0f, true, new sz6(i4));
            iqb iqbVarI = fqb.E;
            if (yzbVar != null) {
                iqbVarI = ztj.i(iqbVarI, yzbVar, null);
            }
            iqb iqbVarB = iqbVar.B(iqbVarI);
            boolean z4 = ((57344 & i2) == 16384) | ((i2 & 112) == 32) | ((i2 & 7168) == 2048);
            Object objN4 = e18Var2.N();
            if (z4 || objN4 == lz1Var) {
                ho0Var = ho0Var2;
                qncVar = qncVar3;
                m50Var = new m50(arrayList, bz7Var, z, bz7Var2, 1);
                e18Var2.k0(m50Var);
            } else {
                m50Var = objN4;
                qncVar = qncVar3;
                ho0Var = ho0Var2;
            }
            e18Var = e18Var2;
            yuj.a(wa8Var, iqbVarB, lx9VarA, qncVar, ho0Var3, ho0Var, null, false, null, (bz7) m50Var, e18Var, 1769472, 912);
        } else {
            e18Var = e18Var2;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new er0(arrayList, bz7Var, bz7Var2, z, z2, iqbVar, yzbVar, zy7Var, i);
        }
    }

    public static final void b(z15 z15Var, ld4 ld4Var, int i) {
        e18 e18Var;
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(459977504);
        int i2 = (e18Var2.f(z15Var) ? 4 : 2) | i;
        int i3 = 0;
        if (e18Var2.Q(i2 & 1, (i2 & 3) != 2)) {
            v4g v4gVarG = iuj.G(true, null, e18Var2, 6, 2);
            boolean z = (i2 & 14) == 4;
            Object objN = e18Var2.N();
            if (z || objN == jd4.a) {
                objN = new x15(z15Var, i3);
                e18Var2.k0(objN);
            }
            e18Var = e18Var2;
            iuj.f((zy7) objN, null, v4gVarG, MTTypesetterKt.kLineSkipLimitMultiplier, false, null, gm3.a(e18Var2).o, 0L, 0L, null, null, null, fd9.q0(546420222, new nn(20, z15Var), e18Var2), e18Var, 0, 3072, 8122);
        } else {
            e18Var = e18Var2;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new y15(z15Var, i, 0);
        }
    }

    public static final void c(z15 z15Var, ld4 ld4Var, int i) {
        e18 e18Var;
        int i2;
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(1798291299);
        int i3 = i | (e18Var2.f(z15Var) ? 4 : 2);
        int i4 = 1;
        if (e18Var2.Q(i3 & 1, (i3 & 3) != 2)) {
            vo1 vo1Var = lja.T;
            ho0 ho0Var = new ho0(24.0f, true, new sz6(i4));
            fqb fqbVar = fqb.E;
            iqb iqbVarN = gb9.N(gb9.L(b.c(fqbVar, 1.0f), 24.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 2), MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, 32.0f, 7);
            q64 q64VarA = p64.a(ho0Var, vo1Var, e18Var2, 54);
            int iHashCode = Long.hashCode(e18Var2.T);
            hyc hycVarL = e18Var2.l();
            iqb iqbVarE = kxk.E(e18Var2, iqbVarN);
            dd4.e.getClass();
            re4 re4Var = cd4.b;
            e18Var2.e0();
            if (e18Var2.S) {
                e18Var2.k(re4Var);
            } else {
                e18Var2.n0();
            }
            z80 z80Var = cd4.f;
            d4c.i0(e18Var2, z80Var, q64VarA);
            z80 z80Var2 = cd4.e;
            d4c.i0(e18Var2, z80Var2, hycVarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            z80 z80Var3 = cd4.g;
            d4c.i0(e18Var2, z80Var3, numValueOf);
            bx bxVar = cd4.h;
            d4c.h0(e18Var2, bxVar);
            z80 z80Var4 = cd4.d;
            d4c.i0(e18Var2, z80Var4, iqbVarE);
            cv8.b(a.a(ud0.E0, e18Var2), null, b.o(fqbVar, 40.0f), gm3.a(e18Var2).a, e18Var2, 440, 0);
            q64 q64VarA2 = p64.a(new ho0(8.0f, true, new sz6(i4)), vo1Var, e18Var2, 54);
            int iHashCode2 = Long.hashCode(e18Var2.T);
            hyc hycVarL2 = e18Var2.l();
            iqb iqbVarE2 = kxk.E(e18Var2, fqbVar);
            e18Var2.e0();
            if (e18Var2.S) {
                e18Var2.k(re4Var);
            } else {
                e18Var2.n0();
            }
            d4c.i0(e18Var2, z80Var, q64VarA2);
            d4c.i0(e18Var2, z80Var2, hycVarL2);
            ij0.t(iHashCode2, e18Var2, z80Var3, e18Var2, bxVar);
            d4c.i0(e18Var2, z80Var4, iqbVarE2);
            tjh.b(d4c.j0(R.string.conway_webhook_confirm_title, e18Var2), null, gm3.a(e18Var2).M, 0L, null, null, null, 0L, null, new fdh(3), 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var2).e.E).f, e18Var2, 0, 0, 130042);
            tjh.b(d4c.j0(R.string.conway_webhook_confirm_body, e18Var2), null, gm3.a(e18Var2).N, 0L, null, null, null, 0L, null, new fdh(3), 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var2).e.E).g, e18Var2, 0, 0, 130042);
            tjh.b(z15Var.a, gb9.K(yfd.p(fqbVar, gm3.a(e18Var2).q, gm3.b(e18Var2).d), 12.0f, 6.0f), gm3.a(e18Var2).M, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, (tkh) ((wk) gm3.c(e18Var2).e.F).i, e18Var2, 0, 0, 131064);
            tjh.b(z15Var.b, null, gm3.a(e18Var2).O, 0L, null, null, null, 0L, null, new fdh(3), 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var2).e.E).i, e18Var2, 0, 0, 130042);
            e18Var2.p(true);
            q64 q64VarA3 = p64.a(new ho0(12.0f, true, new sz6(1)), lja.S, e18Var2, 6);
            int iHashCode3 = Long.hashCode(e18Var2.T);
            hyc hycVarL3 = e18Var2.l();
            iqb iqbVarE3 = kxk.E(e18Var2, fqbVar);
            e18Var2.e0();
            if (e18Var2.S) {
                e18Var2.k(re4Var);
            } else {
                e18Var2.n0();
            }
            d4c.i0(e18Var2, z80Var, q64VarA3);
            d4c.i0(e18Var2, z80Var2, hycVarL3);
            ij0.t(iHashCode3, e18Var2, z80Var3, e18Var2, bxVar);
            d4c.i0(e18Var2, z80Var4, iqbVarE3);
            String strJ0 = d4c.j0(R.string.conway_webhook_confirm_create, e18Var2);
            iqb iqbVarC = b.c(fqbVar, 1.0f);
            int i5 = i3 & 14;
            boolean z = i5 == 4;
            Object objN = e18Var2.N();
            lz1 lz1Var = jd4.a;
            if (z || objN == lz1Var) {
                objN = new x15(z15Var, 1);
                e18Var2.k0(objN);
            }
            dtj.a(strJ0, iqbVarC, false, null, e12.a, null, 0L, (zy7) objN, e18Var2, 24624, 108);
            String strJ02 = d4c.j0(R.string.conway_webhook_confirm_cancel, e18Var2);
            iqb iqbVarC2 = b.c(fqbVar, 1.0f);
            boolean z2 = i5 == 4;
            Object objN2 = e18Var2.N();
            if (z2 || objN2 == lz1Var) {
                objN2 = new x15(z15Var, 2);
                e18Var2.k0(objN2);
            }
            dtj.a(strJ02, iqbVarC2, false, null, f12.a, null, 0L, (zy7) objN2, e18Var2, 24624, 108);
            e18Var = e18Var2;
            i2 = 1;
            e18Var.p(true);
            e18Var.p(true);
        } else {
            e18Var = e18Var2;
            i2 = 1;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new y15(z15Var, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(final defpackage.zy7 r27, final defpackage.zy7 r28, final defpackage.iqb r29, final defpackage.zy7 r30, defpackage.mnc r31, boolean r32, int r33, defpackage.ld4 r34, final int r35, final int r36) {
        /*
            Method dump skipped, instruction units count: 503
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gtk.d(zy7, zy7, iqb, zy7, mnc, boolean, int, ld4, int, int):void");
    }

    public static void e(StringBuilder sb, String str) {
        str.getClass();
        sb.append('\"');
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt == '\n') {
                sb.append("%0A");
            } else if (cCharAt == '\r') {
                sb.append("%0D");
            } else if (cCharAt != '\"') {
                sb.append(cCharAt);
            } else {
                sb.append("%22");
            }
        }
        sb.append('\"');
    }

    public static final void f(String str) {
        throw new IllegalArgumentException(str);
    }

    public static final void g(String str) {
        throw new IllegalStateException(str);
    }

    public static final void h(String str) {
        throw new IndexOutOfBoundsException(str);
    }

    public static final void i(String str) {
        throw new NoSuchElementException(str);
    }

    public static final void j() {
        throw new NoSuchElementException("The ScatterSet is empty");
    }

    public static void k(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, 0);
        }
    }
}
