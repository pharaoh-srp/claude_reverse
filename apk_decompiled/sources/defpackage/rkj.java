package defpackage;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import androidx.compose.foundation.layout.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.anthropic.claude.design.icon.a;
import com.anthropic.claude.tool.model.UserLocationV0Output;
import com.anthropic.claude.tool.model.UserLocationV0OutputUserLocationError;
import com.anthropic.claude.tool.model.UserLocationV0OutputUserLocationResult;
import com.anthropic.claude.tool.model.UserLocationV0OutputUserLocationResultGeocoded;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class rkj {
    public static final aci a = aci.L;
    public static final q0g b;
    public static final float c;
    public static final q0g d;
    public static final float e;

    static {
        q0g q0gVar = q0g.I;
        b = q0gVar;
        c = 16.0f;
        d = q0gVar;
        e = 6.0f;
    }

    public static final void a(boolean z, zy7 zy7Var, zy7 zy7Var2, ld4 ld4Var, int i) {
        zy7Var.getClass();
        zy7Var2.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-1540458483);
        int i2 = i | (e18Var.g(z) ? 4 : 2) | (e18Var.h(zy7Var) ? 32 : 16) | (e18Var.h(zy7Var2) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC);
        if (e18Var.Q(i2 & 1, (i2 & 147) != 146)) {
            j8.b(z, zy7Var, null, 0L, null, null, null, 0L, MTTypesetterKt.kLineSkipLimitMultiplier, fd9.q0(619200778, new pr4(zy7Var2, zy7Var, 3), e18Var), e18Var, i2 & 126, 2044);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new iv(z, zy7Var, zy7Var2, i, 14);
        }
    }

    public static final void b(zy7 zy7Var, ld4 ld4Var, int i) {
        zy7Var.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-1123360616);
        int i2 = (e18Var.h(zy7Var) ? 4 : 2) | i;
        if (e18Var.Q(i2 & 1, (i2 & 3) != 2)) {
            String strJ0 = d4c.j0(R.string.generic_disconnect, e18Var);
            bpc bpcVarA = a.a(ud0.Z, e18Var);
            float f = wcb.a;
            uuj.a(strJ0, bpcVarA, zy7Var, null, null, false, null, nrk.e(e18Var), null, null, 0, 0, e18Var, 64 | ((i2 << 6) & 896), 3960);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new wh(i, 24, zy7Var);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x05fc  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x0623  */
    /* JADX WARN: Removed duplicated region for block: B:354:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0143  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(final defpackage.pz7 r46, final java.lang.String r47, final boolean r48, final defpackage.bz7 r49, defpackage.iqb r50, defpackage.pz7 r51, final defpackage.zb0 r52, boolean r53, defpackage.nxf r54, defpackage.oxf r55, final defpackage.mnc r56, float r57, final defpackage.wo1 r58, defpackage.mnc r59, long r60, float r62, defpackage.tkh r63, int r64, long r65, float r67, defpackage.p0h r68, final defpackage.pl3 r69, defpackage.ld4 r70, final int r71, final int r72, final int r73, final int r74) {
        /*
            Method dump skipped, instruction units count: 1604
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rkj.c(pz7, java.lang.String, boolean, bz7, iqb, pz7, zb0, boolean, nxf, oxf, mnc, float, wo1, mnc, long, float, tkh, int, long, float, p0h, pl3, ld4, int, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:138:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0114  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(final defpackage.bpc r30, final java.lang.String r31, final boolean r32, final defpackage.bz7 r33, defpackage.iqb r34, defpackage.pz7 r35, final defpackage.zb0 r36, boolean r37, final defpackage.nxf r38, final defpackage.oxf r39, final defpackage.mnc r40, float r41, final defpackage.wo1 r42, defpackage.mnc r43, long r44, float r46, defpackage.tkh r47, int r48, long r49, float r51, defpackage.p0h r52, defpackage.pl3 r53, defpackage.ld4 r54, final int r55, final int r56, final int r57) {
        /*
            Method dump skipped, instruction units count: 761
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rkj.d(bpc, java.lang.String, boolean, bz7, iqb, pz7, zb0, boolean, nxf, oxf, mnc, float, wo1, mnc, long, float, tkh, int, long, float, p0h, pl3, ld4, int, int, int):void");
    }

    public static final void e(UserLocationV0OutputUserLocationResult userLocationV0OutputUserLocationResult, iqb iqbVar, ld4 ld4Var, int i) {
        String address;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(1567960079);
        int i2 = (e18Var.f(userLocationV0OutputUserLocationResult) ? 4 : 2) | i | (e18Var.f(iqbVar) ? 32 : 16);
        int i3 = 18;
        if (e18Var.Q(i2 & 1, (i2 & 19) != 18)) {
            UserLocationV0OutputUserLocationResultGeocoded geocoded = userLocationV0OutputUserLocationResult.getGeocoded();
            if (geocoded == null || (address = geocoded.getAddress()) == null) {
                address = "Lat: " + userLocationV0OutputUserLocationResult.getLatitude() + ", Lng: " + userLocationV0OutputUserLocationResult.getLongitude();
            }
            twj.b(b.c(iqbVar, 1.0f), null, null, rwj.h(30), null, fd9.q0(385838557, new u3e(address, i3, userLocationV0OutputUserLocationResult), e18Var), e18Var, 196608, 22);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new nwh(userLocationV0OutputUserLocationResult, iqbVar, i, 5);
        }
    }

    public static final void f(boolean z, int i, boolean z2, zy7 zy7Var, UserLocationV0Output userLocationV0Output, iqb iqbVar, ld4 ld4Var, int i2) {
        boolean z3;
        int i3;
        int i4;
        boolean z4;
        zy7 zy7Var2;
        iqb iqbVar2;
        zy7Var.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-858307578);
        if ((i2 & 6) == 0) {
            z3 = z;
            i3 = (e18Var.g(z3) ? 4 : 2) | i2;
        } else {
            z3 = z;
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 = i;
            i3 |= e18Var.d(i4) ? 32 : 16;
        } else {
            i4 = i;
        }
        if ((i2 & 384) == 0) {
            z4 = z2;
            i3 |= e18Var.g(z4) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        } else {
            z4 = z2;
        }
        if ((i2 & 3072) == 0) {
            zy7Var2 = zy7Var;
            i3 |= e18Var.h(zy7Var2) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        } else {
            zy7Var2 = zy7Var;
        }
        if ((i2 & 24576) == 0) {
            i3 |= (32768 & i2) == 0 ? e18Var.f(userLocationV0Output) : e18Var.h(userLocationV0Output) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        }
        if ((196608 & i2) == 0) {
            iqbVar2 = iqbVar;
            i3 |= e18Var.f(iqbVar2) ? 131072 : 65536;
        } else {
            iqbVar2 = iqbVar;
        }
        if (e18Var.Q(i3 & 1, (74899 & i3) != 74898)) {
            Object objN = e18Var.N();
            lz1 lz1Var = jd4.a;
            if (objN == lz1Var) {
                objN = xn5.w0(gp6.e(kxk.N(300, 0, null, 6), 2).a(gp6.m(kxk.N(300, 0, null, 6), new r2i(8))), gp6.f(kxk.N(200, 0, null, 6), 2).a(gp6.o(kxk.N(200, 0, null, 6), new r2i(9))));
                e18Var.k0(objN);
            }
            po4 po4Var = (po4) objN;
            final UserLocationV0OutputUserLocationResult userLocationV0OutputUserLocationResult = userLocationV0Output instanceof UserLocationV0OutputUserLocationResult ? (UserLocationV0OutputUserLocationResult) userLocationV0Output : null;
            final UserLocationV0OutputUserLocationError userLocationV0OutputUserLocationError = userLocationV0Output instanceof UserLocationV0OutputUserLocationError ? (UserLocationV0OutputUserLocationError) userLocationV0Output : null;
            Boolean boolValueOf = Boolean.valueOf(userLocationV0OutputUserLocationResult != null);
            boolean zH = e18Var.h(po4Var);
            Object objN2 = e18Var.N();
            if (zH || objN2 == lz1Var) {
                objN2 = new ymi(1, po4Var);
                e18Var.k0(objN2);
            }
            final boolean z5 = z3;
            final int i5 = i4;
            final boolean z6 = z4;
            final zy7 zy7Var3 = zy7Var2;
            final iqb iqbVar3 = iqbVar2;
            xn5.G(boolValueOf, null, (bz7) objN2, null, "location_tool_animation", null, fd9.q0(-1116272349, new sz7() { // from class: hni
                /* JADX WARN: Removed duplicated region for block: B:43:0x00ff  */
                /* JADX WARN: Removed duplicated region for block: B:46:0x010f  */
                @Override // defpackage.sz7
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object i(java.lang.Object r25, java.lang.Object r26, java.lang.Object r27, java.lang.Object r28) {
                    /*
                        Method dump skipped, instruction units count: 317
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.hni.i(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
                }
            }, e18Var), e18Var, 1597440, 42);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new ak1(z, i, z2, zy7Var, userLocationV0Output, iqbVar, i2);
        }
    }

    public static final boolean g(int i, int i2) {
        return i == i2;
    }

    public static final boolean h(int i, int i2) {
        return i == i2;
    }

    public static final String i(PackageManager packageManager) {
        ActivityInfo activityInfo;
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.addCategory("android.intent.category.BROWSABLE");
        intent.setData(Uri.parse("https://"));
        List<ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
        listQueryIntentActivities.getClass();
        ResolveInfo resolveInfo = (ResolveInfo) w44.N0(listQueryIntentActivities);
        if (resolveInfo == null || (activityInfo = resolveInfo.activityInfo) == null) {
            return null;
        }
        return activityInfo.packageName;
    }

    public static final iqb j(iqb iqbVar, za9 za9Var) {
        return iqbVar.B(new va9(za9Var));
    }

    public static final iqb k(iqb iqbVar, za9 za9Var) {
        return iqbVar.B(new db9(za9Var));
    }
}
