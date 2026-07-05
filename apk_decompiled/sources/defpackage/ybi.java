package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Process;
import androidx.compose.foundation.layout.b;
import androidx.datastore.core.DirectBootUsageException;
import androidx.health.platform.client.proto.g;
import com.anthropic.claude.R;
import com.anthropic.claude.design.icon.a;
import com.pvporbit.freetype.FreeTypeConstants;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ybi {
    public static final b11 a = new b11();
    public static final efe b;
    public static final efe c;
    public static final efe d;
    public static final efe e;
    public static final efe f;

    static {
        int i = 1;
        b = new efe(i, (Object) (-1));
        c = new efe(i, Boolean.FALSE);
        d = new efe(i, (Object) (-1L));
        e = new efe(i, Double.valueOf(-1.0d));
        f = new efe(i, (Object) 2);
    }

    public static final void a(int i, ld4 ld4Var, zy7 zy7Var, zy7 zy7Var2, iqb iqbVar) {
        int i2;
        fqb fqbVar;
        int i3;
        zy7Var.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-1218562146);
        if ((i & 6) == 0) {
            i2 = (e18Var.h(zy7Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var.h(zy7Var2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= e18Var.f(iqbVar) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if (e18Var.Q(i2 & 1, (i2 & 147) != 146)) {
            iqb iqbVarK = gb9.K(yfd.p(b.c(iqbVar, 1.0f), gm3.a(e18Var).q, xve.b(16.0f)), 12.0f, 12.0f);
            q64 q64VarA = p64.a(ko0.c, lja.S, e18Var, 0);
            int iHashCode = Long.hashCode(e18Var.T);
            hyc hycVarL = e18Var.l();
            iqb iqbVarE = kxk.E(e18Var, iqbVarK);
            dd4.e.getClass();
            re4 re4Var = cd4.b;
            e18Var.e0();
            if (e18Var.S) {
                e18Var.k(re4Var);
            } else {
                e18Var.n0();
            }
            z80 z80Var = cd4.f;
            d4c.i0(e18Var, z80Var, q64VarA);
            z80 z80Var2 = cd4.e;
            d4c.i0(e18Var, z80Var2, hycVarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            z80 z80Var3 = cd4.g;
            d4c.i0(e18Var, z80Var3, numValueOf);
            bx bxVar = cd4.h;
            d4c.h0(e18Var, bxVar);
            z80 z80Var4 = cd4.d;
            d4c.i0(e18Var, z80Var4, iqbVarE);
            wo1 wo1Var = lja.Q;
            fqb fqbVar2 = fqb.E;
            iqb iqbVarC = b.c(fqbVar2, 1.0f);
            cxe cxeVarA = axe.a(ko0.a, wo1Var, e18Var, 48);
            int iHashCode2 = Long.hashCode(e18Var.T);
            hyc hycVarL2 = e18Var.l();
            iqb iqbVarE2 = kxk.E(e18Var, iqbVarC);
            e18Var.e0();
            if (e18Var.S) {
                e18Var.k(re4Var);
            } else {
                e18Var.n0();
            }
            d4c.i0(e18Var, z80Var, cxeVarA);
            d4c.i0(e18Var, z80Var2, hycVarL2);
            ij0.t(iHashCode2, e18Var, z80Var3, e18Var, bxVar);
            d4c.i0(e18Var, z80Var4, iqbVarE2);
            tjh.b(d4c.j0(R.string.browser_takeover_complete_next_step, e18Var), new hw9(1.0f, true), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var).e.E).h, e18Var, 0, 0, 131068);
            if (zy7Var2 == null) {
                e18Var.a0(650901292);
                e18Var.p(false);
                i3 = i2;
                fqbVar = fqbVar2;
            } else {
                e18Var.a0(650901293);
                fqbVar = fqbVar2;
                i3 = i2;
                ktk.h(a.a(ud0.M1, e18Var), d4c.j0(R.string.browser_takeover_dismiss, e18Var), null, false, null, y02.a, d54.g, zy7Var2, e18Var, 1769480 | ((i2 << 18) & 29360128));
                e18Var.p(false);
            }
            e18Var.p(true);
            fqb fqbVar3 = fqbVar;
            tjh.b(d4c.j0(R.string.browser_takeover_user_instructions, e18Var), null, gm3.a(e18Var).O, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var).e.E).i, e18Var, 0, 0, 131066);
            e18Var = e18Var;
            dtj.a(gid.p(16.0f, R.string.open_browser, e18Var, e18Var, fqbVar3), b.c(fqbVar3, 1.0f), false, wvj.a, new c12(), null, 0L, zy7Var, e18Var, 3120 | ((i3 << 21) & 29360128), 100);
            e18Var.p(true);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new hy1(i, 0, zy7Var, zy7Var2, iqbVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:198:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x010b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(final defpackage.pz7 r30, final defpackage.ta4 r31, final defpackage.iqb r32, defpackage.pz7 r33, defpackage.pz7 r34, long r35, defpackage.mnc r37, float r38, defpackage.wo1 r39, float r40, float r41, boolean r42, defpackage.zy7 r43, defpackage.rz7 r44, defpackage.ld4 r45, final int r46, final int r47, final int r48) {
        /*
            Method dump skipped, instruction units count: 692
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ybi.b(pz7, ta4, iqb, pz7, pz7, long, mnc, float, wo1, float, float, boolean, zy7, rz7, ld4, int, int, int):void");
    }

    public static final String c(Type type) {
        if (!(type instanceof Class)) {
            return type.toString();
        }
        Class cls = (Class) type;
        if (!cls.isArray()) {
            return cls.getName();
        }
        ymf ymfVarZ = bnf.Z(xbi.E, type);
        StringBuilder sb = new StringBuilder();
        Iterator it = ymfVarZ.iterator();
        if (!it.hasNext()) {
            pmf.h("Sequence is empty.");
            return null;
        }
        Object next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        sb.append(((Class) next).getName());
        sb.append(isg.m0(bnf.T(ymfVarZ), "[]"));
        return sb.toString();
    }

    public static int d(int i) {
        return 4 - (i % 4);
    }

    public static final Type e(eo9 eo9Var, boolean z) {
        cm9 cm9VarH = eo9Var.h();
        if (cm9VarH instanceof go9) {
            return new obc((go9) cm9VarH);
        }
        if (!(cm9VarH instanceof pl9)) {
            poc.t("Unsupported type classifier: ", eo9Var);
            return null;
        }
        pl9 pl9Var = (pl9) cm9VarH;
        Class clsJ = z ? ez1.J(pl9Var) : ez1.I(pl9Var);
        List listG = eo9Var.g();
        if (listG.isEmpty()) {
            return clsJ;
        }
        if (!clsJ.isArray()) {
            return f(clsJ, listG);
        }
        if (clsJ.getComponentType().isPrimitive()) {
            return clsJ;
        }
        jo9 jo9Var = (jo9) w44.g1(listG);
        if (jo9Var == null) {
            xh6.k("kotlin.Array must have exactly one type argument: ", eo9Var);
            return null;
        }
        lo9 lo9Var = jo9Var.a;
        eo9 eo9Var2 = jo9Var.b;
        int i = lo9Var == null ? -1 : wbi.a[lo9Var.ordinal()];
        if (i == -1 || i == 1) {
            return clsJ;
        }
        if (i != 2 && i != 3) {
            wg6.i();
            return null;
        }
        eo9Var2.getClass();
        Type typeE = e(eo9Var2, false);
        return typeE instanceof Class ? clsJ : new x28(typeE);
    }

    public static final zrc f(Class cls, List list) {
        Class<?> declaringClass = cls.getDeclaringClass();
        if (declaringClass == null) {
            List list2 = list;
            ArrayList arrayList = new ArrayList(x44.y(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(i((jo9) it.next()));
            }
            return new zrc(cls, null, arrayList);
        }
        if (Modifier.isStatic(cls.getModifiers())) {
            List list3 = list;
            ArrayList arrayList2 = new ArrayList(x44.y(list3, 10));
            Iterator it2 = list3.iterator();
            while (it2.hasNext()) {
                arrayList2.add(i((jo9) it2.next()));
            }
            return new zrc(cls, declaringClass, arrayList2);
        }
        int length = cls.getTypeParameters().length;
        zrc zrcVarF = f(declaringClass, list.subList(length, list.size()));
        List listSubList = list.subList(0, length);
        ArrayList arrayList3 = new ArrayList(x44.y(listSubList, 10));
        Iterator it3 = listSubList.iterator();
        while (it3.hasNext()) {
            arrayList3.add(i((jo9) it3.next()));
        }
        return new zrc(cls, zrcVarF, arrayList3);
    }

    public static int g(char c2, CharSequence charSequence, int i) {
        int length = charSequence.length();
        while (i < length) {
            if (charSequence.charAt(i) == c2) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static int h(int i, String str) {
        int length = str.length();
        while (i < length) {
            char cCharAt = str.charAt(i);
            if (cCharAt == '\n' || cCharAt == '\r') {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static final Type i(jo9 jo9Var) {
        lo9 lo9Var = jo9Var.a;
        if (lo9Var == null) {
            return bbj.G;
        }
        eo9 eo9Var = jo9Var.b;
        eo9Var.getClass();
        int iOrdinal = lo9Var.ordinal();
        if (iOrdinal == 0) {
            return e(eo9Var, true);
        }
        if (iOrdinal == 1) {
            return new bbj(null, e(eo9Var, true));
        }
        if (iOrdinal == 2) {
            return new bbj(e(eo9Var, true), null);
        }
        wg6.i();
        return null;
    }

    public static boolean j(String str) {
        int length = str.length();
        int i = 0;
        while (true) {
            if (i >= length) {
                i = length;
                break;
            }
            if (str.charAt(i) != ' ') {
                break;
            }
            i++;
        }
        return i != length;
    }

    public static boolean k(int i, CharSequence charSequence) {
        return Character.isLetter(Character.codePointAt(charSequence, i));
    }

    public static boolean l(int i) {
        int type = Character.getType(i);
        if (type != 29 && type != 30) {
            switch (type) {
                default:
                    if (i != 36 && i != 43 && i != 94 && i != 96 && i != 124 && i != 126) {
                        switch (i) {
                            case 60:
                            case 61:
                            case 62:
                                break;
                            default:
                                return false;
                        }
                    }
                case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                case 21:
                case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                case 24:
                    return true;
            }
        }
        return true;
    }

    public static boolean m(int i, CharSequence charSequence) {
        if (i >= charSequence.length()) {
            return false;
        }
        char cCharAt = charSequence.charAt(i);
        return cCharAt == '\t' || cCharAt == ' ';
    }

    public static boolean n(int i) {
        return i == 9 || i == 10 || i == 12 || i == 13 || i == 32 || Character.getType(i) == 12;
    }

    public static CharSequence o(String str) {
        int length = str.length();
        StringBuilder sb = null;
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt == 0) {
                if (sb == null) {
                    sb = new StringBuilder(length);
                    sb.append((CharSequence) str, 0, i);
                }
                sb.append((char) 65533);
            } else if (sb != null) {
                sb.append(cCharAt);
            }
        }
        return sb != null ? sb.toString() : str;
    }

    public static final iqb p(iqb iqbVar, oxf oxfVar) {
        iqbVar.getClass();
        return oxfVar == null ? iqbVar : yfd.p(xn5.V(iqbVar, oxfVar.a), oxfVar.b, zni.b);
    }

    public static int q(int i, String str) {
        while (i >= 0) {
            if (str.charAt(i) != ' ') {
                return i;
            }
            i--;
        }
        return -1;
    }

    public static int r(int i, int i2, CharSequence charSequence) {
        while (i < i2) {
            char cCharAt = charSequence.charAt(i);
            if (cCharAt != '\t' && cCharAt != ' ') {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static int s(int i, int i2, CharSequence charSequence) {
        while (i >= i2) {
            char cCharAt = charSequence.charAt(i);
            if (cCharAt != '\t' && cCharAt != ' ') {
                return i;
            }
            i--;
        }
        return i2 - 1;
    }

    public static final dli t(Uri uri) {
        return kud.p(uri.toString());
    }

    public static final Exception u(String str, FileNotFoundException fileNotFoundException) {
        int i;
        boolean zEquals = false;
        try {
            Method method = Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class);
            method.getClass();
            try {
                Parcel parcelObtain = Parcel.obtain();
                parcelObtain.getClass();
                Process.myUserHandle().writeToParcel(parcelObtain, 0);
                parcelObtain.setDataPosition(0);
                i = parcelObtain.readInt();
            } catch (Throwable unused) {
                i = 0;
            }
            Object objInvoke = method.invoke(null, "sys.user." + i + ".ce_available", "false");
            objInvoke.getClass();
            zEquals = ((String) objInvoke).equals("true");
        } catch (Throwable th) {
            mwa.p(fileNotFoundException, th);
        }
        if (zEquals || str == null) {
            return fileNotFoundException;
        }
        File file = new File(str, "siblingTestFile.txt");
        if (file.exists()) {
            file.delete();
        }
        try {
            file.createNewFile();
            return fileNotFoundException;
        } catch (IOException unused2) {
            return new DirectBootUsageException(fileNotFoundException);
        } finally {
            file.delete();
        }
    }
}
