package defpackage;

import android.graphics.Shader;
import android.view.KeyEvent;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.anthropic.claude.types.strings.OrganizationId;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.reflect.jvm.internal.impl.descriptors.InvalidModuleException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ssj {
    public static final xb a = new xb(1);
    public static final sqb b = new sqb("InvalidModuleNotifier", 0);

    public static final void a(j66 j66Var, zy7 zy7Var, zy7 zy7Var2, ld4 ld4Var, int i) {
        int i2;
        j66Var.getClass();
        zy7Var.getClass();
        zy7Var2.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(1286512411);
        if ((i & 6) == 0) {
            i2 = (e18Var.f(j66Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var.h(zy7Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= e18Var.h(zy7Var2) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if (e18Var.Q(i2 & 1, (i2 & 147) != 146)) {
            rwk.d(j66Var, zy7Var, zy7Var2, d4c.k0(R.string.disconnect_mcp_server_dialog_title, new Object[]{j66Var.f}, e18Var), d4c.j0(R.string.generic_disconnect, e18Var), d4c.j0(R.string.disconnect_mcp_server_dialog_subtitle, e18Var), 0, e18Var, i2 & 1022, 64);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new ji(j66Var, i, zy7Var, zy7Var2, 29);
        }
    }

    public static final void b(String str, ml3 ml3Var, iqb iqbVar, ta4 ta4Var, ta4 ta4Var2, long j, ta4 ta4Var3, ld4 ld4Var, int i) {
        int i2;
        long j2;
        iqb iqbVar2;
        iqb iqbVar3;
        str.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-918712118);
        if ((i & 6) == 0) {
            i2 = (e18Var.f(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? e18Var.f(ml3Var) : e18Var.h(ml3Var) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if ((i & 3072) == 0) {
            i3 |= e18Var.h(ta4Var) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        if ((i & 24576) == 0) {
            i3 |= e18Var.h(ta4Var2) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        }
        if ((196608 & i) == 0) {
            j2 = j;
            i3 |= e18Var.e(j2) ? 131072 : 65536;
        } else {
            j2 = j;
        }
        if ((1572864 & i) == 0) {
            i3 |= e18Var.h(ta4Var3) ? FreeTypeConstants.FT_LOAD_COLOR : 524288;
        }
        if (e18Var.Q(i3 & 1, (599187 & i3) != 599186)) {
            e18Var.V();
            if ((i & 1) == 0 || e18Var.A()) {
                iqbVar3 = fqb.E;
            } else {
                e18Var.T();
                iqbVar3 = iqbVar;
            }
            e18Var.q();
            WeakHashMap weakHashMap = gdj.x;
            iqb iqbVar4 = iqbVar3;
            v40.b(iqbVar4, str, fd9.q0(-117037683, new tfe(str, ml3Var, ta4Var, 7), e18Var), rtk.d, ta4Var2, null, 0, j2, 0L, s4i.d(e18Var).l, MTTypesetterKt.kLineSkipLimitMultiplier, fd9.q0(-1195070592, new ru(ta4Var3, 6), e18Var), e18Var, ((i3 >> 6) & 14) | 3456 | ((i3 << 3) & 112) | (i3 & 57344) | ((i3 << 6) & 29360128), 1376);
            iqbVar2 = iqbVar4;
        } else {
            e18Var.T();
            iqbVar2 = iqbVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new ds1(str, ml3Var, iqbVar2, ta4Var, ta4Var2, j, ta4Var3, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:87:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(final java.lang.String r27, final defpackage.zy7 r28, defpackage.iqb r29, defpackage.rz7 r30, defpackage.pz7 r31, long r32, final defpackage.ta4 r34, defpackage.ld4 r35, final int r36, final int r37) {
        /*
            Method dump skipped, instruction units count: 355
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ssj.c(java.lang.String, zy7, iqb, rz7, pz7, long, ta4, ld4, int, int):void");
    }

    public static final void d(String str, ml3 ml3Var, ta4 ta4Var, iqb iqbVar, ld4 ld4Var, int i) {
        iqb iqbVar2;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(423293016);
        int i2 = 2;
        int i3 = i | (e18Var.f(str) ? 4 : 2) | (e18Var.f(ml3Var) ? 32 : 16) | (e18Var.h(ta4Var) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC) | 3072;
        if (e18Var.Q(i3 & 1, (i3 & 1171) != 1170)) {
            m2i m2iVarN = zh4.n(0L, e18Var, 1);
            iqbVar2 = fqb.E;
            eg0.a(fd9.q0(-803983427, new ngf(str, i2), e18Var), iqbVar2, fd9.q0(-713923137, new gl(ml3Var, 10), e18Var), ta4Var, MTTypesetterKt.kLineSkipLimitMultiplier, null, m2iVarN, null, e18Var, 438 | ((i3 << 3) & 7168), 432);
        } else {
            e18Var.T();
            iqbVar2 = iqbVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new v3e(str, ml3Var, ta4Var, iqbVar2, i, 5);
        }
    }

    public static final void e(String str, zy7 zy7Var, rz7 rz7Var, iqb iqbVar, ld4 ld4Var, int i) {
        iqb iqbVar2;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(1359457729);
        int i2 = i | (e18Var.f(str) ? 4 : 2) | (e18Var.h(zy7Var) ? 32 : 16) | (e18Var.h(rz7Var) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC) | 3072;
        byte b2 = 0;
        int i3 = 1;
        if (e18Var.Q(i2 & 1, (i2 & 1171) != 1170)) {
            m2i m2iVarN = zh4.n(0L, e18Var, 1);
            fqb fqbVar = fqb.E;
            eg0.a(fd9.q0(132181286, new ngf(str, i3), e18Var), fqbVar, fd9.q0(222241576, new sxa(zy7Var, 24, b2), e18Var), rz7Var, MTTypesetterKt.kLineSkipLimitMultiplier, null, m2iVarN, null, e18Var, 438 | ((i2 << 3) & 7168), 432);
            iqbVar2 = fqbVar;
        } else {
            e18Var.T();
            iqbVar2 = iqbVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new v3e(str, zy7Var, rz7Var, iqbVar2, i, 6);
        }
    }

    public static final ky1 f(Shader shader) {
        return new ky1(shader);
    }

    public static float[] g(int i, float[] fArr) {
        if (i < 0) {
            mr9.y();
            return null;
        }
        int length = fArr.length;
        if (length < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int iMin = Math.min(i, length);
        float[] fArr2 = new float[i];
        System.arraycopy(fArr, 0, fArr2, 0, iMin);
        return fArr2;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0096 A[Catch: NumberFormatException -> 0x00aa, LOOP:3: B:25:0x0068->B:44:0x0096, LOOP_END, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:44:0x0096, B:46:0x009c, B:52:0x00b1, B:53:0x00b4), top: B:68:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x009c A[Catch: NumberFormatException -> 0x00aa, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:44:0x0096, B:46:0x009c, B:52:0x00b1, B:53:0x00b4), top: B:68:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00b1 A[Catch: NumberFormatException -> 0x00aa, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:44:0x0096, B:46:0x009c, B:52:0x00b1, B:53:0x00b4), top: B:68:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00d6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0095 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.ovc[] h(java.lang.String r17) {
        /*
            Method dump skipped, instruction units count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ssj.h(java.lang.String):ovc[]");
    }

    public static final long i(KeyEvent keyEvent) {
        return zsj.b(keyEvent.getKeyCode());
    }

    public static final int j(KeyEvent keyEvent) {
        int action = keyEvent.getAction();
        if (action != 0) {
            return action != 1 ? 0 : 1;
        }
        return 2;
    }

    public static final int k(KeyEvent keyEvent) {
        return keyEvent.getUnicodeChar();
    }

    public static final boolean l(KeyEvent keyEvent) {
        return keyEvent.isCtrlPressed();
    }

    public static boolean m(byte b2) {
        return b2 > -65;
    }

    public static final boolean n(KeyEvent keyEvent) {
        return keyEvent.isShiftPressed();
    }

    public static final ArrayList o(List list, List list2, float f) {
        int iMax = Math.max(list.size(), list2.size());
        ArrayList arrayList = new ArrayList(iMax);
        for (int i = 0; i < iMax; i++) {
            arrayList.add(new d54(d4c.Y(f, ((d54) list.get(Math.min(i, list.size() - 1))).a, ((d54) list2.get(Math.min(i, list2.size() - 1))).a)));
        }
        return arrayList;
    }

    public static final ArrayList p(List list, List list2, float f) {
        if (list2 == null || list == null) {
            return null;
        }
        int iMax = Math.max(list.size(), list2.size());
        ArrayList arrayList = new ArrayList(iMax);
        for (int i = 0; i < iMax; i++) {
            arrayList.add(Float.valueOf(d4c.W(((Number) list.get(Math.min(i, list.size() - 1))).floatValue(), ((Number) list2.get(Math.min(i, list2.size() - 1))).floatValue(), f)));
        }
        return arrayList;
    }

    public static final long q(float f, long j, long j2) {
        return (((((j & 9187343241974906880L) ^ 9187343241974906880L) - 4294967297L) & (-9223372034707292160L)) == 0 && (((9187343241974906880L ^ (j2 & 9187343241974906880L)) - 4294967297L) & (-9223372034707292160L)) == 0) ? hvk.g(f, j, j2) : f < 0.5f ? j : j2;
    }

    public static final void r(uqb uqbVar) {
        if (uqbVar.F(b) != null) {
            throw new ClassCastException();
        }
        throw new InvalidModuleException("Accessing invalid module descriptor " + uqbVar);
    }

    public static final j66 s(String str, String str2, String str3, String str4, ld4 ld4Var, int i) {
        str.getClass();
        str2.getClass();
        e18 e18Var = (e18) ld4Var;
        m7f m7fVar = (m7f) e18Var.j(gr9.b);
        boolean z = ((((i & 14) ^ 6) > 4 && e18Var.f(str)) || (i & 6) == 4) | ((((i & 112) ^ 48) > 32 && e18Var.f(str2)) || (i & 48) == 32) | ((((i & 896) ^ 384) > 256 && e18Var.f(str3)) || (i & 384) == 256) | ((((i & 7168) ^ 3072) > 2048 && e18Var.f(str4)) || (i & 3072) == 2048);
        Object objN = e18Var.N();
        if (z || objN == jd4.a) {
            kce kceVar = jce.a;
            j66 j66Var = new j66(str, str2, str3, str4, (qi3) m7fVar.a(kceVar.b(qi3.class), null, null), (swa) m7fVar.a(kceVar.b(swa.class), null, null), ((OrganizationId) m7fVar.a(kceVar.b(OrganizationId.class), null, null)).m1071unboximpl(), (q0i) m7fVar.a(kceVar.b(q0i.class), null, null), (h86) m7fVar.a(kceVar.b(h86.class), null, null));
            e18Var.k0(j66Var);
            objN = j66Var;
        }
        return (j66) objN;
    }

    public static final rzf t(jy1 jy1Var) {
        if (jy1Var instanceof rzf) {
            return (rzf) jy1Var;
        }
        if (jy1Var instanceof eeg) {
            long j = ((eeg) jy1Var).a;
            return lz1.I(14, x44.X(new d54(j), new d54(j)));
        }
        wg6.i();
        return null;
    }
}
