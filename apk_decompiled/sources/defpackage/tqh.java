package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.Display;
import androidx.compose.foundation.layout.b;
import androidx.health.platform.client.proto.g;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.airbnb.lottie.parser.moshi.a;
import com.anthropic.claude.R;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class tqh implements v0i, vv1, br4, dz5, fri, ut9, qdg, crc, b45, lv1, pcg, up4, j5i, vdb, go0, he1, d22, bq3 {
    public static s4e J;
    public final /* synthetic */ int E;
    public static final tqh F = new tqh(1);
    public static final tqh G = new tqh(2);
    public static final tqh H = new tqh(3);
    public static final tqh I = new tqh(4);
    public static final tqh K = new tqh(6);
    public static final tqh L = new tqh(7);
    public static final tqh M = new tqh(8);
    public static final tqh N = new tqh(10);
    public static final tqh O = new tqh(11);
    public static final tqh P = new tqh(12);
    public static final tqh Q = new tqh(13);
    public static final tqh R = new tqh(14);
    public static final tqh S = new tqh(15);
    public static final tqh T = new tqh(16);
    public static final tqh U = new tqh(17);
    public static final poc V = new poc(14);
    public static final tqh W = new tqh(19);
    public static final /* synthetic */ tqh X = new tqh(20);
    public static final /* synthetic */ tqh Y = new tqh(21);

    public /* synthetic */ tqh(int i) {
        this.E = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0030 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0031 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object C(defpackage.jy1 r3, defpackage.jy1 r4, float r5) {
        /*
            boolean r0 = r3.equals(r4)
            r1 = 1056964608(0x3f000000, float:0.5)
            if (r0 == 0) goto Ld
            int r5 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r5 >= 0) goto L31
            goto L30
        Ld:
            boolean r0 = r3 instanceof defpackage.na9
            if (r0 == 0) goto L19
            r0 = r3
            na9 r0 = (defpackage.na9) r0
            java.lang.Object r0 = r0.b(r4, r5)
            goto L1a
        L19:
            r0 = 0
        L1a:
            if (r0 != 0) goto L2a
            boolean r2 = r4 instanceof defpackage.na9
            if (r2 == 0) goto L2a
            r0 = r4
            na9 r0 = (defpackage.na9) r0
            r2 = 1065353216(0x3f800000, float:1.0)
            float r2 = r2 - r5
            java.lang.Object r0 = r0.b(r3, r2)
        L2a:
            if (r0 != 0) goto L32
            int r5 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r5 >= 0) goto L31
        L30:
            return r3
        L31:
            return r4
        L32:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tqh.C(jy1, jy1, float):java.lang.Object");
    }

    public static h15 D() {
        return new h15("string", null);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void A(java.lang.String r17, defpackage.wu8 r18, boolean r19, defpackage.zy7 r20, defpackage.ld4 r21, int r22, int r23) {
        /*
            Method dump skipped, instruction units count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tqh.A(java.lang.String, wu8, boolean, zy7, ld4, int, int):void");
    }

    public void B(int i, int i2, ld4 ld4Var) {
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-630973527);
        int i3 = 4;
        int i4 = (e18Var.d(i) ? 4 : 2) | i2;
        if (e18Var.Q(i4 & 1, (i4 & 3) != 2)) {
            pqi.a(ez1.t(fqb.E, MTTypesetterKt.kLineSkipLimitMultiplier, d54.b(0.2f, gm3.a(e18Var).k), xve.a), gm3.a(e18Var).m, gm3.a(e18Var).k, fd9.q0(2054776278, new mv(i, i3), e18Var), e18Var, 3072);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new ay3(this, i, i2);
        }
    }

    @Override // defpackage.v0i
    public String H(Context context, boolean z, boolean z2) {
        context.getClass();
        String string = context.getString(z2 ? R.string.alarm_creator_tool_status_creation_failed : z ? R.string.alarm_creator_tool_status_creation_success : R.string.alarm_creator_tool_status_creating);
        string.getClass();
        return string;
    }

    @Override // defpackage.vdb
    public void a(vcb vcbVar, boolean z) {
    }

    @Override // defpackage.j5i
    public Object apply(Object obj) {
        return (byte[]) obj;
    }

    @Override // defpackage.d22
    public byte[] b(byte[] bArr, int i, int i2) {
        return Arrays.copyOfRange(bArr, i, i2 + i);
    }

    @Override // defpackage.bq3
    public void c() {
    }

    @Override // defpackage.bq3
    public void close() {
    }

    @Override // defpackage.pcg
    public int e(int i, int i2, int i3, int i4) {
        return 0;
    }

    @Override // defpackage.bq3
    public void f() {
    }

    @Override // defpackage.up4
    public Object g(d5h d5hVar) {
        Intent intent = (Intent) ((Bundle) d5hVar.e()).getParcelable("notification_data");
        if (intent != null) {
            return new iq3(intent);
        }
        return null;
    }

    @Override // defpackage.br4
    public Object h(Object obj) {
        return (rqe) obj;
    }

    @Override // defpackage.he1
    public boolean i(float f) {
        throw new IllegalStateException("not implemented");
    }

    @Override // defpackage.he1
    public boolean isEmpty() {
        return true;
    }

    @Override // defpackage.go0
    public void j(cz5 cz5Var, int i, int[] iArr, fu9 fu9Var, int[] iArr2) {
        int length = iArr.length;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i2 < length) {
            int i5 = iArr[i2];
            iArr2[i3] = i4;
            i4 += i5;
            i2++;
            i3++;
        }
    }

    @Override // defpackage.he1
    public rp9 k() {
        throw new IllegalStateException("not implemented");
    }

    @Override // defpackage.he1
    public boolean l(float f) {
        return false;
    }

    @Override // defpackage.vv1
    public Rect m(Activity activity) {
        Rect rect = new Rect();
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        defaultDisplay.getRectSize(rect);
        if (!activity.isInMultiWindowMode()) {
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            Resources resources = activity.getResources();
            int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
            int dimensionPixelSize = identifier > 0 ? resources.getDimensionPixelSize(identifier) : 0;
            int i = rect.bottom + dimensionPixelSize;
            if (i == point.y) {
                rect.bottom = i;
                return rect;
            }
            int i2 = rect.right + dimensionPixelSize;
            if (i2 == point.x) {
                rect.right = i2;
            }
        }
        return rect;
    }

    @Override // defpackage.fri
    public Object n(a aVar, float f) {
        return Float.valueOf(ej9.d(aVar) * f);
    }

    @Override // defpackage.ut9
    public Object o(ja8 ja8Var, tp4 tp4Var) {
        long j = ja8Var.u;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap((int) (j >> 32), (int) (j & 4294967295L), Bitmap.Config.ARGB_8888);
        ja8Var.c(jz.a(new Canvas(bitmapCreateBitmap)), null);
        return bitmapCreateBitmap;
    }

    @Override // defpackage.dz5
    public float p(Context context) {
        return context.getResources().getDisplayMetrics().density;
    }

    @Override // defpackage.he1
    public float q() {
        return 1.0f;
    }

    @Override // defpackage.he1
    public float r() {
        return MTTypesetterKt.kLineSkipLimitMultiplier;
    }

    @Override // defpackage.vdb
    public boolean s(vcb vcbVar) {
        return false;
    }

    @Override // defpackage.lv1
    public long t(tgf tgfVar, int i) {
        String str = tgfVar.f.a.a.F;
        return mwa.m(bik.d(i, str), bik.c(i, str));
    }

    public String toString() {
        switch (this.E) {
            case 12:
                return "NoDeclaredBrand";
            case g.MAX_FIELD_NUMBER /* 17 */:
                return "Start";
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return "AbsoluteArrangement#Left";
            default:
                return super.toString();
        }
    }

    public void u(String str, wu8 wu8Var, zy7 zy7Var, ld4 ld4Var, int i, int i2) {
        tqh tqhVar;
        zy7 zy7Var2;
        wu8 wu8Var2;
        String str2;
        int i3;
        zy7Var.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-737152789);
        int i4 = i | 2 | (((i2 & 2) == 0 && e18Var.f(wu8Var)) ? 32 : 16) | (e18Var.h(zy7Var) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC);
        if (e18Var.Q(i4 & 1, (i4 & 1171) != 1170)) {
            e18Var.V();
            if ((i & 1) == 0 || e18Var.A()) {
                str = d4c.j0(R.string.generic_back_button_content_description, e18Var);
                i3 = i4 & (-15);
                if ((i2 & 2) != 0) {
                    k4g k4gVar = k4g.a;
                    wu8Var = vz8.G(gm3.a(e18Var).o, gm3.a(e18Var).M, 0L, e18Var, 12);
                    i3 = i4 & (-127);
                }
                String str3 = str;
                wu8 wu8Var3 = wu8Var;
                e18Var.q();
                int i5 = ((i3 << 3) & 1008) | (57344 & (i3 << 6)) | 196608;
                tqhVar = this;
                tqhVar.y(ud0.k, str3, wu8Var3, false, zy7Var, e18Var, i5, 8);
                zy7Var2 = zy7Var;
                str2 = str3;
                wu8Var2 = wu8Var3;
            } else {
                e18Var.T();
                i3 = i4 & (-15);
                if ((i2 & 2) != 0) {
                    i3 = i4 & (-127);
                }
                String str32 = str;
                wu8 wu8Var32 = wu8Var;
                e18Var.q();
                int i52 = ((i3 << 3) & 1008) | (57344 & (i3 << 6)) | 196608;
                tqhVar = this;
                tqhVar.y(ud0.k, str32, wu8Var32, false, zy7Var, e18Var, i52, 8);
                zy7Var2 = zy7Var;
                str2 = str32;
                wu8Var2 = wu8Var32;
            }
        } else {
            tqhVar = this;
            zy7Var2 = zy7Var;
            e18Var.T();
            wu8Var2 = wu8Var;
            str2 = str;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new bg6(tqhVar, str2, wu8Var2, zy7Var2, i, i2);
        }
    }

    public void v(int i, ld4 ld4Var) {
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(1192150991);
        int i2 = i & 1;
        int i3 = 0;
        if (e18Var.Q(i2, i2 != 0)) {
            iv1.b(ud0.C, null, null, ef2.F, gm3.a(e18Var).O, e18Var, 3120, 4);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new r3b(this, i, i3);
        }
    }

    public void w(String str, wu8 wu8Var, zy7 zy7Var, ld4 ld4Var, int i, int i2) {
        tqh tqhVar;
        zy7 zy7Var2;
        wu8 wu8Var2;
        String str2;
        int i3;
        zy7Var.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-205469546);
        int i4 = i | 2 | (((i2 & 2) == 0 && e18Var.f(wu8Var)) ? 32 : 16);
        if ((i & 384) == 0) {
            i4 |= e18Var.h(zy7Var) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if (e18Var.Q(i4 & 1, (i4 & 1171) != 1170)) {
            e18Var.V();
            if ((i & 1) == 0 || e18Var.A()) {
                str = d4c.j0(R.string.generic_button_close, e18Var);
                i3 = i4 & (-15);
                if ((i2 & 2) != 0) {
                    k4g k4gVar = k4g.a;
                    wu8Var = vz8.G(gm3.a(e18Var).o, gm3.a(e18Var).M, 0L, e18Var, 12);
                    i3 = i4 & (-127);
                }
                String str3 = str;
                wu8 wu8Var3 = wu8Var;
                e18Var.q();
                int i5 = ((i3 << 3) & 1008) | (57344 & (i3 << 6)) | 196608;
                tqhVar = this;
                tqhVar.y(ud0.M1, str3, wu8Var3, false, zy7Var, e18Var, i5, 8);
                zy7Var2 = zy7Var;
                str2 = str3;
                wu8Var2 = wu8Var3;
            } else {
                e18Var.T();
                i3 = i4 & (-15);
                if ((i2 & 2) != 0) {
                    i3 = i4 & (-127);
                }
                String str32 = str;
                wu8 wu8Var32 = wu8Var;
                e18Var.q();
                int i52 = ((i3 << 3) & 1008) | (57344 & (i3 << 6)) | 196608;
                tqhVar = this;
                tqhVar.y(ud0.M1, str32, wu8Var32, false, zy7Var, e18Var, i52, 8);
                zy7Var2 = zy7Var;
                str2 = str32;
                wu8Var2 = wu8Var32;
            }
        } else {
            tqhVar = this;
            zy7Var2 = zy7Var;
            e18Var.T();
            wu8Var2 = wu8Var;
            str2 = str;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new et(tqhVar, str2, wu8Var2, zy7Var2, i, i2);
        }
    }

    public void x(int i, ld4 ld4Var) {
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(835173717);
        int i2 = i & 1;
        int i3 = 1;
        if (e18Var.Q(i2, i2 != 0)) {
            iqb iqbVarO = b.o(fqb.E, csg.A(22, e18Var));
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
            ez1.a(null, vf2.G, gm3.a(e18Var).O, e18Var, 48, 1);
            e18Var.p(true);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new r3b(this, i, i3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r8v12, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v24 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void y(defpackage.ud0 r24, java.lang.String r25, defpackage.wu8 r26, boolean r27, defpackage.zy7 r28, defpackage.ld4 r29, int r30, int r31) {
        /*
            Method dump skipped, instruction units count: 438
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tqh.y(ud0, java.lang.String, wu8, boolean, zy7, ld4, int, int):void");
    }

    public void z(int i, ld4 ld4Var) {
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-1986123516);
        int i2 = i & 1;
        if (e18Var.Q(i2, i2 != 0)) {
            cv8.b(com.anthropic.claude.design.icon.a.a(ud0.l, e18Var), d4c.j0(R.string.connector_setting_connect, e18Var), b.o(fqb.E, csg.A(22, e18Var)), gm3.a(e18Var).O, e18Var, 8, 0);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new r3b(this, i, 2);
        }
    }
}
