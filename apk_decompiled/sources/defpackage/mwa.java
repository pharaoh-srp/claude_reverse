package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Icon;
import android.os.Bundle;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.pvporbit.freetype.FreeTypeConstants;
import com.segment.analytics.kotlin.core.Settings;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public abstract class mwa {
    public static final aci a = aci.M;
    public static final iec b = new iec(3);
    public static final jr8 c = new jr8();
    public static final xnh d = new xnh(0, new long[0], new Object[0]);

    public static x9 A(qh9 qh9Var) {
        try {
            String strM = qh9Var.s("type").m();
            strM.getClass();
            for (z9 z9Var : z9.values()) {
                if (z9Var.E.equals(strM)) {
                    bh9 bh9VarS = qh9Var.s("id");
                    String strM2 = bh9VarS != null ? bh9VarS.m() : null;
                    bh9 bh9VarS2 = qh9Var.s("loading_time");
                    Long lValueOf = bh9VarS2 != null ? Long.valueOf(bh9VarS2.k()) : null;
                    bh9 bh9VarS3 = qh9Var.s("target");
                    y9 y9VarQ = bh9VarS3 != null ? d4c.Q(bh9VarS3.g()) : null;
                    bh9 bh9VarS4 = qh9Var.s("frustration");
                    sa saVarI = bh9VarS4 != null ? rlk.i(bh9VarS4.g()) : null;
                    bh9 bh9VarS5 = qh9Var.s("error");
                    ra raVarW = bh9VarS5 != null ? kxk.w(bh9VarS5.g()) : null;
                    bh9 bh9VarS6 = qh9Var.s("crash");
                    ka kaVarX = bh9VarS6 != null ? fd9.X(bh9VarS6.g()) : null;
                    bh9 bh9VarS7 = qh9Var.s("long_task");
                    ua uaVarQ = bh9VarS7 != null ? yb5.q(bh9VarS7.g()) : null;
                    bh9 bh9VarS8 = qh9Var.s("resource");
                    return new x9(z9Var, strM2, lValueOf, y9VarQ, saVarI, raVarW, kaVarX, uaVarQ, bh9VarS8 != null ? u00.s(bh9VarS8.g()) : null);
                }
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        } catch (IllegalStateException e) {
            pmf.j("Unable to parse json into type ActionEventAction", e);
            return null;
        } catch (NullPointerException e2) {
            pmf.j("Unable to parse json into type ActionEventAction", e2);
            return null;
        } catch (NumberFormatException e3) {
            pmf.j("Unable to parse json into type ActionEventAction", e3);
            return null;
        }
    }

    public static um2 B() {
        return um2.e;
    }

    public static final boolean C(wjf wjfVar) {
        Object objG = wjfVar.d.E.g(akf.L);
        if (objG == null) {
            objG = null;
        }
        wrh wrhVar = (wrh) objG;
        ewb ewbVar = wjfVar.d.E;
        Object objG2 = ewbVar.g(akf.z);
        if (objG2 == null) {
            objG2 = null;
        }
        vue vueVar = (vue) objG2;
        boolean z = wrhVar != null;
        Object objG3 = ewbVar.g(akf.K);
        if (((Boolean) (objG3 != null ? objG3 : null)) == null || (vueVar != null && vueVar.a == 4)) {
            return z;
        }
        return true;
    }

    public static final String D(wjf wjfVar, Resources resources) {
        qjf qjfVar = wjfVar.d;
        qjf qjfVar2 = wjfVar.d;
        Object objG = qjfVar.E.g(akf.b);
        String string = null;
        if (objG == null) {
            objG = null;
        }
        ewb ewbVar = qjfVar2.E;
        Object objG2 = ewbVar.g(akf.L);
        if (objG2 == null) {
            objG2 = null;
        }
        wrh wrhVar = (wrh) objG2;
        Object objG3 = ewbVar.g(akf.z);
        if (objG3 == null) {
            objG3 = null;
        }
        vue vueVar = (vue) objG3;
        if (wrhVar != null) {
            int iOrdinal = wrhVar.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal != 1) {
                    if (iOrdinal != 2) {
                        mr9.b();
                        return null;
                    }
                    if (objG == null) {
                        objG = resources.getString(R.string.indeterminate);
                    }
                } else if (vueVar != null && vueVar.a == 2 && objG == null) {
                    objG = resources.getString(R.string.state_off);
                }
            } else if (vueVar != null && vueVar.a == 2 && objG == null) {
                objG = resources.getString(R.string.state_on);
            }
        }
        Object objG4 = ewbVar.g(akf.K);
        if (objG4 == null) {
            objG4 = null;
        }
        Boolean bool = (Boolean) objG4;
        if (bool != null) {
            boolean zBooleanValue = bool.booleanValue();
            if ((vueVar == null || vueVar.a != 4) && objG == null) {
                objG = zBooleanValue ? resources.getString(R.string.selected) : resources.getString(R.string.not_selected);
            }
        }
        Object objG5 = ewbVar.g(akf.c);
        if (objG5 == null) {
            objG5 = null;
        }
        mjd mjdVar = (mjd) objG5;
        if (mjdVar != null) {
            if (mjdVar != mjd.d) {
                if (objG == null) {
                    fq3 fq3Var = mjdVar.b;
                    float f = fq3Var.F;
                    float f2 = fq3Var.E;
                    float fFloatValue = Float.valueOf(f).floatValue() - Float.valueOf(f2).floatValue() == MTTypesetterKt.kLineSkipLimitMultiplier ? 0.0f : (mjdVar.a - Float.valueOf(f2).floatValue()) / (Float.valueOf(fq3Var.F).floatValue() - Float.valueOf(f2).floatValue());
                    if (fFloatValue < MTTypesetterKt.kLineSkipLimitMultiplier) {
                        fFloatValue = 0.0f;
                    }
                    if (fFloatValue > 1.0f) {
                        fFloatValue = 1.0f;
                    }
                    objG = resources.getString(R.string.template_percent, Integer.valueOf(fFloatValue == MTTypesetterKt.kLineSkipLimitMultiplier ? 0 : fFloatValue == 1.0f ? 100 : wd6.e0(Math.round(fFloatValue * 100.0f), 1, 99)));
                }
            } else if (objG == null) {
                objG = resources.getString(R.string.in_progress);
            }
        }
        dkf dkfVar = akf.G;
        if (ewbVar.c(dkfVar)) {
            ewb ewbVar2 = new wjf(wjfVar.a, true, wjfVar.c, qjfVar2).k().E;
            Object objG6 = ewbVar2.g(akf.a);
            if (objG6 == null) {
                objG6 = null;
            }
            Collection collection = (Collection) objG6;
            if (collection == null || collection.isEmpty()) {
                Object objG7 = ewbVar2.g(akf.C);
                if (objG7 == null) {
                    objG7 = null;
                }
                Collection collection2 = (Collection) objG7;
                if (collection2 == null || collection2.isEmpty()) {
                    Object objG8 = ewbVar2.g(dkfVar);
                    if (objG8 == null) {
                        objG8 = null;
                    }
                    CharSequence charSequence = (CharSequence) objG8;
                    if (charSequence == null || charSequence.length() == 0) {
                        string = resources.getString(R.string.state_empty);
                    }
                }
            }
            objG = string;
        }
        return (String) objG;
    }

    public static final zb0 E(wjf wjfVar) {
        Object objG = wjfVar.d.E.g(akf.G);
        if (objG == null) {
            objG = null;
        }
        zb0 zb0Var = (zb0) objG;
        Object objG2 = wjfVar.d.E.g(akf.C);
        if (objG2 == null) {
            objG2 = null;
        }
        List list = (List) objG2;
        return zb0Var == null ? list != null ? (zb0) w44.N0(list) : null : zb0Var;
    }

    public static final f2 F(Object[] objArr) {
        objArr.getClass();
        return new f2(objArr);
    }

    public static final mp4 G(h86 h86Var) {
        h86Var.getClass();
        return fd9.c(nai.Z(iuj.g(), h86Var.a()));
    }

    public static String H(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            sz6.p("Invalid input received");
            return null;
        }
        StringBuilder sb = new StringBuilder(str2.length() + str.length());
        for (int i = 0; i < str.length(); i++) {
            sb.append(str.charAt(i));
            if (str2.length() > i) {
                sb.append(str2.charAt(i));
            }
        }
        return sb.toString();
    }

    public static final Object I(Object obj, Object obj2) {
        if (obj == null) {
            return obj2;
        }
        if (obj instanceof ArrayList) {
            ((ArrayList) obj).add(obj2);
            return obj;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(obj2);
        return arrayList;
    }

    public static final void J(Context context, String str, j5g j5gVar, String str2, Icon icon, Bundle bundle) {
        context.getClass();
        str2.getClass();
        ShortcutManager shortcutManager = (ShortcutManager) context.getSystemService(ShortcutManager.class);
        if (shortcutManager == null) {
            return;
        }
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setClassName(context.getPackageName(), "com.anthropic.claude.deeplink.DeepLinkActivity");
        intent.putExtra("EXTRA_SHORTCUT_TYPE", j5gVar.a());
        intent.putExtras(bundle);
        ShortcutInfo shortcutInfoBuild = new ShortcutInfo.Builder(context, str).setShortLabel(str2).setLongLabel(str2).setIcon(icon).setIntent(intent).build();
        shortcutInfoBuild.getClass();
        shortcutManager.requestPinShortcut(shortcutInfoBuild, null);
    }

    public static int K(double d2) {
        if (Double.isNaN(d2)) {
            sz6.p("Cannot round NaN value.");
            return 0;
        }
        if (d2 > 2.147483647E9d) {
            return Integer.MAX_VALUE;
        }
        if (d2 < -2.147483648E9d) {
            return Integer.MIN_VALUE;
        }
        return (int) Math.round(d2);
    }

    public static int L(float f) {
        if (!Float.isNaN(f)) {
            return Math.round(f);
        }
        sz6.p("Cannot round NaN value.");
        return 0;
    }

    public static long M(double d2) {
        if (!Double.isNaN(d2)) {
            return Math.round(d2);
        }
        sz6.p("Cannot round NaN value.");
        return 0L;
    }

    public static String N(Throwable th) {
        th.getClass();
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th.printStackTrace(printWriter);
        printWriter.flush();
        String string = stringWriter.toString();
        string.getClass();
        return string;
    }

    public static final String O(long j, CharSequence charSequence) {
        return charSequence.subSequence(kkh.g(j), kkh.f(j)).toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.ww7 P(defpackage.ww7 r3, defpackage.ww7 r4) {
        /*
            r3.getClass()
            r4.getClass()
            boolean r0 = r3.equals(r4)
            if (r0 == 0) goto Ld
            goto L2f
        Ld:
            boolean r0 = r4.d()
            if (r0 == 0) goto L14
            goto L2f
        L14:
            java.lang.String r0 = r3.b()
            java.lang.String r1 = r4.b()
            r2 = 0
            boolean r2 = defpackage.isg.q0(r0, r1, r2)
            if (r2 == 0) goto L5a
            int r1 = r1.length()
            char r0 = r0.charAt(r1)
            r1 = 46
            if (r0 != r1) goto L5a
        L2f:
            boolean r0 = r4.d()
            if (r0 == 0) goto L36
            goto L5a
        L36:
            boolean r0 = r3.equals(r4)
            if (r0 == 0) goto L42
            ww7 r3 = defpackage.ww7.c
            r3.getClass()
            return r3
        L42:
            ww7 r0 = new ww7
            java.lang.String r3 = r3.b()
            java.lang.String r4 = r4.b()
            int r4 = r4.length()
            int r4 = r4 + 1
            java.lang.String r3 = r3.substring(r4)
            r0.<init>(r3)
            return r0
        L5a:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mwa.P(ww7, ww7):ww7");
    }

    public static final Rect Q(c79 c79Var) {
        return new Rect(c79Var.a, c79Var.b, c79Var.c, c79Var.d);
    }

    public static final RectF R(l9e l9eVar) {
        return new RectF(l9eVar.a, l9eVar.b, l9eVar.c, l9eVar.d);
    }

    public static final l9e S(Rect rect) {
        return new l9e(rect.left, rect.top, rect.right, rect.bottom);
    }

    public static final l9e T(RectF rectF) {
        return new l9e(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    public static final List U(List list) {
        int size = list.size();
        return size != 0 ? size != 1 ? Collections.unmodifiableList(new ArrayList(list)) : Collections.singletonList(w44.L0(list)) : lm6.E;
    }

    public static final Map V(Map map) {
        int size = map.size();
        if (size == 0) {
            return nm6.E;
        }
        if (size != 1) {
            return Collections.unmodifiableMap(new LinkedHashMap(map));
        }
        Map.Entry entry = (Map.Entry) w44.K0(map.entrySet());
        return Collections.singletonMap(entry.getKey(), entry.getValue());
    }

    public static final double W(long j) {
        return ((j >>> 11) * 2048.0d) + (j & 2047);
    }

    public static void X(Settings settings, int i) {
        settings.getClass();
        sq6.a(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x03c2  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x03e2  */
    /* JADX WARN: Removed duplicated region for block: B:245:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0117  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(final defpackage.cjh r60, final defpackage.bz7 r61, final java.lang.String r62, final defpackage.iqb r63, boolean r64, defpackage.e0g r65, defpackage.tkh r66, defpackage.pz7 r67, defpackage.pz7 r68, defpackage.pzi r69, defpackage.mp9 r70, defpackage.kp9 r71, boolean r72, int r73, int r74, long r75, defpackage.ffh r77, defpackage.ld4 r78, final int r79, final int r80, final int r81) {
        /*
            Method dump skipped, instruction units count: 1017
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mwa.a(cjh, bz7, java.lang.String, iqb, boolean, e0g, tkh, pz7, pz7, pzi, mp9, kp9, boolean, int, int, long, ffh, ld4, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0450  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0472  */
    /* JADX WARN: Removed duplicated region for block: B:281:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x012f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(final java.lang.String r61, final defpackage.bz7 r62, final java.lang.String r63, final defpackage.iqb r64, boolean r65, boolean r66, defpackage.e0g r67, defpackage.tkh r68, final defpackage.pz7 r69, defpackage.pz7 r70, defpackage.pz7 r71, defpackage.pzi r72, defpackage.mp9 r73, defpackage.kp9 r74, boolean r75, int r76, int r77, long r78, defpackage.ffh r80, defpackage.ld4 r81, final int r82, final int r83, final int r84) {
        /*
            Method dump skipped, instruction units count: 1163
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mwa.b(java.lang.String, bz7, java.lang.String, iqb, boolean, boolean, e0g, tkh, pz7, pz7, pz7, pzi, mp9, kp9, boolean, int, int, long, ffh, ld4, int, int, int):void");
    }

    public static final void c(y3a y3aVar, m4a m4aVar, zy7 zy7Var, ld4 ld4Var, int i) {
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-709389590);
        int i2 = i | 16 | (e18Var.h(zy7Var) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC);
        if (e18Var.Q(i2 & 1, (i2 & 147) != 146)) {
            e18Var.V();
            if ((i & 1) == 0 || e18Var.A()) {
                m4aVar = (m4a) e18Var.j(tda.a);
            } else {
                e18Var.T();
            }
            e18Var.q();
            if (y3aVar == y3a.ON_DESTROY) {
                sz6.p("LifecycleEventEffect cannot be used to listen for Lifecycle.Event.ON_DESTROY, since Compose disposes of the composition before ON_DESTROY observers are invoked.");
                return;
            }
            nwb nwbVarZ = mpk.Z(zy7Var, e18Var);
            boolean zF = e18Var.f(nwbVarZ) | e18Var.h(m4aVar);
            Object objN = e18Var.N();
            if (zF || objN == jd4.a) {
                objN = new ny4(m4aVar, y3aVar, nwbVarZ, 14);
                e18Var.k0(objN);
            }
            fd9.d(m4aVar, (bz7) objN, e18Var);
        } else {
            e18Var.T();
        }
        m4a m4aVar2 = m4aVar;
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new ra7(y3aVar, m4aVar2, zy7Var, i, 9);
        }
    }

    public static final void d(Object obj, m4a m4aVar, bz7 bz7Var, ld4 ld4Var, int i) {
        int i2;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(1220373486);
        if ((i & 6) == 0) {
            i2 = (e18Var.h(obj) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= 16;
        }
        if ((i & 384) == 0) {
            i2 |= e18Var.h(bz7Var) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if (e18Var.Q(i2 & 1, (i2 & 147) != 146)) {
            e18Var.V();
            if ((i & 1) == 0 || e18Var.A()) {
                m4aVar = (m4a) e18Var.j(tda.a);
            } else {
                e18Var.T();
            }
            int i3 = i2 & (-113);
            e18Var.q();
            boolean zF = e18Var.f(obj) | e18Var.f(m4aVar);
            Object objN = e18Var.N();
            if (zF || objN == jd4.a) {
                objN = new r4a(m4aVar.a());
                e18Var.k0(objN);
            }
            g(m4aVar, (r4a) objN, bz7Var, e18Var, i3 & 896);
        } else {
            e18Var.T();
        }
        m4a m4aVar2 = m4aVar;
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new fb0(obj, i, m4aVar2, bz7Var, 9);
        }
    }

    public static final void e(Object obj, Object obj2, m4a m4aVar, bz7 bz7Var, ld4 ld4Var, int i) {
        int i2;
        m4a m4aVar2;
        int i3;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(752680142);
        if ((i & 6) == 0) {
            i2 = (e18Var.h(obj) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var.h(obj2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if ((i & 3072) == 0) {
            i2 |= e18Var.h(bz7Var) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        if (e18Var.Q(i2 & 1, (i2 & 1171) != 1170)) {
            e18Var.V();
            if ((i & 1) == 0 || e18Var.A()) {
                m4aVar2 = (m4a) e18Var.j(tda.a);
                i3 = i2 & (-897);
            } else {
                e18Var.T();
                i3 = i2 & (-897);
                m4aVar2 = m4aVar;
            }
            e18Var.q();
            boolean zF = e18Var.f(obj) | e18Var.f(obj2) | e18Var.f(m4aVar2);
            Object objN = e18Var.N();
            if (zF || objN == jd4.a) {
                objN = new r4a(m4aVar2.a());
                e18Var.k0(objN);
            }
            g(m4aVar2, (r4a) objN, bz7Var, e18Var, (i3 >> 3) & 896);
        } else {
            e18Var.T();
            m4aVar2 = m4aVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new bg6(i, 5, obj, obj2, m4aVar2, bz7Var, false);
        }
    }

    public static final void f(Object obj, Object obj2, Object obj3, m4a m4aVar, bz7 bz7Var, ld4 ld4Var, int i) {
        int i2;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-485941842);
        if ((i & 6) == 0) {
            i2 = (e18Var.h(obj) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var.h(obj2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= e18Var.h(obj3) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if ((i & 3072) == 0) {
            i2 |= FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        if ((i & 24576) == 0) {
            i2 |= e18Var.h(bz7Var) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        }
        if (e18Var.Q(i2 & 1, (i2 & 9363) != 9362)) {
            e18Var.V();
            if ((i & 1) == 0 || e18Var.A()) {
                m4aVar = (m4a) e18Var.j(tda.a);
            } else {
                e18Var.T();
            }
            int i3 = i2 & (-7169);
            e18Var.q();
            boolean zF = e18Var.f(obj) | e18Var.f(obj2) | e18Var.f(obj3) | e18Var.f(m4aVar);
            Object objN = e18Var.N();
            if (zF || objN == jd4.a) {
                objN = new r4a(m4aVar.a());
                e18Var.k0(objN);
            }
            g(m4aVar, (r4a) objN, bz7Var, e18Var, (i3 >> 6) & 896);
        } else {
            e18Var.T();
        }
        m4a m4aVar2 = m4aVar;
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new oa0(obj, obj2, obj3, m4aVar2, bz7Var, i, 2);
        }
    }

    public static final void g(m4a m4aVar, r4a r4aVar, bz7 bz7Var, ld4 ld4Var, int i) {
        int i2;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(912823238);
        if ((i & 6) == 0) {
            i2 = (e18Var.h(m4aVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var.h(r4aVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= e18Var.h(bz7Var) ? 256 : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if (e18Var.Q(i2 & 1, (i2 & 147) != 146)) {
            boolean zH = e18Var.h(r4aVar) | ((i2 & 896) == 256) | e18Var.h(m4aVar);
            Object objN = e18Var.N();
            if (zH || objN == jd4.a) {
                objN = new nf1(m4aVar, (m4a) r4aVar, bz7Var, 15);
                e18Var.k0(objN);
            }
            fd9.e(m4aVar, r4aVar, (bz7) objN, e18Var);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new fb0(m4aVar, i, r4aVar, bz7Var, 10);
        }
    }

    public static final void h(Object obj, m4a m4aVar, bz7 bz7Var, ld4 ld4Var, int i) {
        int i2;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-1408314671);
        if ((i & 6) == 0) {
            i2 = (e18Var.h(obj) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= 16;
        }
        if ((i & 384) == 0) {
            i2 |= e18Var.h(bz7Var) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if (e18Var.Q(i2 & 1, (i2 & 147) != 146)) {
            e18Var.V();
            if ((i & 1) == 0 || e18Var.A()) {
                m4aVar = (m4a) e18Var.j(tda.a);
            } else {
                e18Var.T();
            }
            int i3 = i2 & (-113);
            e18Var.q();
            boolean zF = e18Var.f(obj) | e18Var.f(m4aVar);
            Object objN = e18Var.N();
            if (zF || objN == jd4.a) {
                objN = new v4a(m4aVar.a());
                e18Var.k0(objN);
            }
            j(m4aVar, (v4a) objN, bz7Var, e18Var, i3 & 896);
        } else {
            e18Var.T();
        }
        m4a m4aVar2 = m4aVar;
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new v76(obj, i, m4aVar2, bz7Var, 10);
        }
    }

    public static final void i(Object obj, Object obj2, m4a m4aVar, bz7 bz7Var, ld4 ld4Var, int i) {
        int i2;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(696924721);
        if ((i & 6) == 0) {
            i2 = (e18Var.h(obj) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var.h(obj2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if ((i & 3072) == 0) {
            i2 |= e18Var.h(bz7Var) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        if (e18Var.Q(i2 & 1, (i2 & 1171) != 1170)) {
            e18Var.V();
            if ((i & 1) == 0 || e18Var.A()) {
                m4aVar = (m4a) e18Var.j(tda.a);
            } else {
                e18Var.T();
            }
            int i3 = i2 & (-897);
            e18Var.q();
            boolean zF = e18Var.f(obj) | e18Var.f(obj2) | e18Var.f(m4aVar);
            Object objN = e18Var.N();
            if (zF || objN == jd4.a) {
                objN = new v4a(m4aVar.a());
                e18Var.k0(objN);
            }
            j(m4aVar, (v4a) objN, bz7Var, e18Var, (i3 >> 3) & 896);
        } else {
            e18Var.T();
        }
        m4a m4aVar2 = m4aVar;
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new xo4(obj, obj2, m4aVar2, bz7Var, i, 2);
        }
    }

    public static final void j(m4a m4aVar, v4a v4aVar, bz7 bz7Var, ld4 ld4Var, int i) {
        int i2;
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(228371534);
        if ((i & 6) == 0) {
            i2 = (e18Var.h(m4aVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var.h(v4aVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= e18Var.h(bz7Var) ? 256 : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if (e18Var.Q(i2 & 1, (i2 & 147) != 146)) {
            boolean zH = e18Var.h(v4aVar) | ((i2 & 896) == 256) | e18Var.h(m4aVar);
            Object objN = e18Var.N();
            if (zH || objN == jd4.a) {
                objN = new nf1(m4aVar, (m4a) v4aVar, bz7Var, 14);
                e18Var.k0(objN);
            }
            fd9.e(m4aVar, v4aVar, (bz7) objN, e18Var);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new fb0(m4aVar, i, v4aVar, bz7Var, 8);
        }
    }

    public static final void k(bf3 bf3Var, iqb iqbVar, ojg ojgVar, ta4 ta4Var, ld4 ld4Var, int i) {
        int i2;
        bf3Var.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(11583962);
        int i3 = 4;
        if ((i & 6) == 0) {
            i2 = (e18Var.h(bf3Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var.f(iqbVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? e18Var.f(ojgVar) : e18Var.h(ojgVar) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if ((i & 3072) == 0) {
            i2 |= e18Var.h(ta4Var) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        if (e18Var.Q(i2 & 1, (i2 & 1171) != 1170)) {
            yb5.b(bf3Var, iqbVar, ojgVar, fd9.q0(-2034294534, new k8a(ta4Var, i3), e18Var), e18Var, (i2 & 896) | (i2 & 14) | 3072 | (i2 & 112));
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new df3(bf3Var, iqbVar, ojgVar, ta4Var, i, 1);
        }
    }

    public static final void l(rwe rweVar, iqb iqbVar, ojg ojgVar, ta4 ta4Var, ld4 ld4Var, int i, int i2) {
        int i3;
        iqb iqbVar2;
        ojg ojgVar2;
        rweVar.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(456095895);
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? e18Var.f(rweVar) : e18Var.h(rweVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= e18Var.f(iqbVar) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= (i & 512) == 0 ? e18Var.f(ojgVar) : e18Var.h(ojgVar) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if ((i & 3072) == 0) {
            i3 |= e18Var.h(ta4Var) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        if (e18Var.Q(i3 & 1, (i3 & 1171) != 1170)) {
            if (i4 != 0) {
                iqbVar = fqb.E;
            }
            iqb iqbVar3 = iqbVar;
            if (i5 != 0) {
                ojgVar = null;
            }
            ojg ojgVar3 = ojgVar;
            k((bf3) rweVar.F.getValue(), iqbVar3, ojgVar3, ta4Var, e18Var, i3 & 8176);
            iqbVar2 = iqbVar3;
            ojgVar2 = ojgVar3;
        } else {
            e18Var.T();
            iqbVar2 = iqbVar;
            ojgVar2 = ojgVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new hwa(rweVar, iqbVar2, ojgVar2, ta4Var, i, i2, 1);
        }
    }

    public static final long m(int i, int i2) {
        if (i < 0 || i2 < 0) {
            c39.a("start and end cannot be negative. [start: " + i + ", end: " + i2 + ']');
        }
        long j = (((long) i2) & 4294967295L) | (((long) i) << 32);
        int i3 = kkh.c;
        return j;
    }

    public static final boolean n(wjf wjfVar) {
        qjf qjfVarK = wjfVar.k();
        return !qjfVarK.E.c(akf.j);
    }

    public static final boolean o(wjf wjfVar, Resources resources) {
        Object objG = wjfVar.d.E.g(akf.a);
        if (objG == null) {
            objG = null;
        }
        List list = (List) objG;
        return !v40.D(wjfVar) && (wjfVar.d.G || (wjfVar.q() && ((list != null ? (String) w44.N0(list) : null) != null || E(wjfVar) != null || D(wjfVar, resources) != null || C(wjfVar))));
    }

    public static void p(Throwable th, Throwable th2) {
        th.getClass();
        th2.getClass();
        if (th != th2) {
            Integer num = tc9.a;
            if (num == null || num.intValue() >= 19) {
                th.addSuppressed(th2);
                return;
            }
            Method method = a5d.a;
            if (method != null) {
                method.invoke(th, th2);
            }
        }
    }

    public static final iqb q() {
        return n90.E;
    }

    public static final n54 r(jl3 jl3Var) {
        jl3Var.getClass();
        long j = jl3Var.n;
        long j2 = jl3Var.c;
        long j3 = jl3Var.F;
        long j4 = jl3Var.b;
        long j5 = h54.a;
        long j6 = jl3Var.q;
        long j7 = jl3Var.N;
        long j8 = h54.b;
        long j9 = jl3Var.r;
        long j10 = jl3Var.o;
        long j11 = jl3Var.M;
        long j12 = jl3Var.O;
        long j13 = d54.b;
        long j14 = jl3Var.v;
        long j15 = d54.h;
        return new n54(j2, j3, j4, j3, j5, j5, j5, j6, j7, j5, j8, j9, j7, j10, j11, j, j11, j, j12, j13, j11, j, j5, j5, j5, j5, j14, j14, j13, j, j, j, j, j, j, j, j15, j15, j15, j15, j15, j15, j15, j15, j15, j15, j15, j15);
    }

    public static final boolean s(Context context) {
        Object hreVar;
        context.getClass();
        try {
            hreVar = (ShortcutManager) context.getSystemService(ShortcutManager.class);
        } catch (Throwable th) {
            hreVar = new hre(th);
        }
        if (hreVar instanceof hre) {
            hreVar = null;
        }
        ShortcutManager shortcutManager = (ShortcutManager) hreVar;
        return shortcutManager != null && shortcutManager.isRequestPinShortcutSupported();
    }

    public static el5 t(el5 el5Var, lh3 lh3Var, vd9 vd9Var, int i) {
        int i2 = 2;
        if ((i & 2) != 0) {
            vd9Var = null;
        }
        el5Var.getClass();
        return new el5((ke9) el5Var.E, vd9Var != null ? new f4i(el5Var, lh3Var, vd9Var, 0) : (tai) el5Var.F, yb5.w(w1a.G, new mx1(el5Var, i2, lh3Var)));
    }

    public static final long u(int i, long j) {
        int i2 = kkh.c;
        int i3 = (int) (j >> 32);
        int i4 = i3 < 0 ? 0 : i3;
        if (i4 > i) {
            i4 = i;
        }
        int i5 = (int) (4294967295L & j);
        int i6 = i5 >= 0 ? i5 : 0;
        if (i6 <= i) {
            i = i6;
        }
        return (i4 == i3 && i == i5) ? j : m(i4, i);
    }

    public static nwb v() {
        return new lsc(iei.a, ql8.J);
    }

    public static final el5 w(el5 el5Var, wc0 wc0Var) {
        el5Var.getClass();
        wc0Var.getClass();
        if (wc0Var.isEmpty()) {
            return el5Var;
        }
        return new el5((ke9) el5Var.E, (tai) el5Var.F, yb5.w(w1a.G, new xz(el5Var, 6, wc0Var)));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0046 A[Catch: all -> 0x005b, TryCatch #2 {all -> 0x005b, blocks: (B:3:0x0006, B:10:0x0024, B:12:0x003d, B:13:0x0040, B:15:0x0046, B:17:0x004a, B:18:0x0055, B:20:0x0057, B:21:0x005a), top: B:39:0x0006, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004a A[Catch: all -> 0x005b, TryCatch #2 {all -> 0x005b, blocks: (B:3:0x0006, B:10:0x0024, B:12:0x003d, B:13:0x0040, B:15:0x0046, B:17:0x004a, B:18:0x0055, B:20:0x0057, B:21:0x005a), top: B:39:0x0006, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.vz1 x(defpackage.ww7 r7, defpackage.gfa r8, defpackage.tqb r9, java.io.InputStream r10) throws java.io.IOException {
        /*
            r7.getClass()
            r9.getClass()
            qz1 r0 = defpackage.qz1.f     // Catch: java.lang.Throwable -> L5b
            qz1 r6 = defpackage.x44.e0(r10)     // Catch: java.lang.Throwable -> L5b
            qz1 r0 = defpackage.qz1.f     // Catch: java.lang.Throwable -> L5b
            int r1 = r6.c     // Catch: java.lang.Throwable -> L5b
            r0.getClass()     // Catch: java.lang.Throwable -> L5b
            int r2 = r0.c     // Catch: java.lang.Throwable -> L5b
            int r3 = r6.b     // Catch: java.lang.Throwable -> L5b
            int r4 = r0.b     // Catch: java.lang.Throwable -> L5b
            if (r3 != 0) goto L20
            if (r4 != 0) goto L5e
            if (r1 != r2) goto L5e
            goto L24
        L20:
            if (r3 != r4) goto L5e
            if (r1 > r2) goto L5e
        L24:
            oc7 r1 = new oc7     // Catch: java.lang.Throwable -> L5b
            r1.<init>()     // Catch: java.lang.Throwable -> L5b
            defpackage.wz1.a(r1)     // Catch: java.lang.Throwable -> L5b
            sk9 r2 = defpackage.atd.O     // Catch: java.lang.Throwable -> L5b
            r2.getClass()     // Catch: java.lang.Throwable -> L5b
            t34 r3 = new t34     // Catch: java.lang.Throwable -> L5b
            r3.<init>(r10)     // Catch: java.lang.Throwable -> L5b
            java.lang.Object r1 = r2.b(r3, r1)     // Catch: java.lang.Throwable -> L5b
            b3 r1 = (defpackage.b3) r1     // Catch: java.lang.Throwable -> L5b
            r2 = 0
            r3.a(r2)     // Catch: kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L56 java.lang.Throwable -> L5b
            boolean r2 = r1.b()     // Catch: java.lang.Throwable -> L5b
            if (r2 == 0) goto L4a
            atd r1 = (defpackage.atd) r1     // Catch: java.lang.Throwable -> L5b
        L48:
            r5 = r1
            goto L60
        L4a:
            kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException r7 = new kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException     // Catch: java.lang.Throwable -> L5b
            r7.<init>()     // Catch: java.lang.Throwable -> L5b
            kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException r7 = r7.a()     // Catch: java.lang.Throwable -> L5b
            r7.E = r1     // Catch: java.lang.Throwable -> L5b
            throw r7     // Catch: java.lang.Throwable -> L5b
        L56:
            r0 = move-exception
            r7 = r0
            r7.E = r1     // Catch: java.lang.Throwable -> L5b
            throw r7     // Catch: java.lang.Throwable -> L5b
        L5b:
            r0 = move-exception
            r7 = r0
            goto L8f
        L5e:
            r1 = 0
            goto L48
        L60:
            r10.close()
            if (r5 == 0) goto L6e
            vz1 r1 = new vz1
            r2 = r7
            r3 = r8
            r4 = r9
            r1.<init>(r2, r3, r4, r5, r6)
            return r1
        L6e:
            java.lang.UnsupportedOperationException r7 = new java.lang.UnsupportedOperationException
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "Kotlin built-in definition format version is not supported: expected "
            r8.<init>(r9)
            r8.append(r0)
            java.lang.String r9 = ", actual "
            r8.append(r9)
            r8.append(r6)
            java.lang.String r9 = ". Please update Kotlin"
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
        L8f:
            throw r7     // Catch: java.lang.Throwable -> L90
        L90:
            r0 = move-exception
            r8 = r0
            defpackage.wd6.Z(r10, r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mwa.x(ww7, gfa, tqb, java.io.InputStream):vz1");
    }

    public static final bce y(gmf gmfVar, gh3 gh3Var, jk9 jk9Var) {
        gh3Var.getClass();
        jk9Var.getClass();
        gmf gmfVarB = gmfVar.B(gh3Var, jk9Var);
        if (gmfVarB != null) {
            return (bce) gmfVarB.F;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:89:0x033b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.zb0 z(java.lang.String r38, defpackage.ekh r39, int r40) {
        /*
            Method dump skipped, instruction units count: 959
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mwa.z(java.lang.String, ekh, int):zb0");
    }
}
