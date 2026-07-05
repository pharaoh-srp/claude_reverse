package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import com.pvporbit.freetype.FreeTypeConstants;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.types.a;

/* JADX INFO: loaded from: classes3.dex */
public abstract class nv1 {
    public static final int[] a = {1, 2, 3, 6};
    public static final int[] b = {48000, 44100, 32000};
    public static final int[] c = {24000, 22050, 16000};
    public static final int[] d = {2, 1, 2, 3, 3, 4, 4, 5};
    public static final int[] e = {32, 40, 48, 56, 64, 80, 96, 112, FreeTypeConstants.FT_LOAD_PEDANTIC, 160, 192, 224, FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING, 320, 384, 448, 512, 576, 640};
    public static final int[] f = {69, 87, 104, 121, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};
    public static final float g = 40.0f;
    public static kuk h;

    public static /* synthetic */ void a(int i) {
        String str = i != 4 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i != 4 ? 3 : 2];
        switch (i) {
            case 1:
            case 6:
                objArr[0] = "originalSubstitution";
                break;
            case 2:
            case 7:
                objArr[0] = "newContainingDeclaration";
                break;
            case 3:
            case 8:
                objArr[0] = "result";
                break;
            case 4:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/DescriptorSubstitutor";
                break;
            case 5:
            default:
                objArr[0] = "typeParameters";
                break;
        }
        if (i != 4) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/DescriptorSubstitutor";
        } else {
            objArr[1] = "substituteTypeParameters";
        }
        if (i != 4) {
            objArr[2] = "substituteTypeParameters";
        }
        String str2 = String.format(str, objArr);
        if (i == 4) {
            throw new IllegalStateException(str2);
        }
    }

    public static Object b(Class cls, InvocationHandler invocationHandler) {
        if (invocationHandler == null) {
            return null;
        }
        return cls.cast(Proxy.newProxyInstance(nv1.class.getClassLoader(), new Class[]{cls}, invocationHandler));
    }

    public static byte c(long j) {
        fd9.D("out of range: %s", (j >> 8) == 0, j);
        return (byte) j;
    }

    public static boolean d(HashSet hashSet, String str) {
        if (hashSet.contains(str)) {
            return true;
        }
        String str2 = Build.TYPE;
        if (!"eng".equals(str2) && !"userdebug".equals(str2)) {
            return false;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(":dev");
        return hashSet.contains(sb.toString());
    }

    public static final void e(ArrayList arrayList, rvh rvhVar) {
        List<spf> list = rvhVar.g;
        if (list != null) {
            for (spf spfVar : list) {
                if (spfVar instanceof xdh) {
                    arrayList.add(((xdh) spfVar).a);
                }
            }
        }
    }

    public static int f(int i, int i2) {
        int i3 = i2 / 2;
        if (i < 0 || i >= 3 || i2 < 0 || i3 >= 19) {
            return -1;
        }
        int i4 = b[i];
        if (i4 == 44100) {
            return ((i2 % 2) + f[i3]) * 2;
        }
        int i5 = e[i3];
        return i4 == 32000 ? i5 * 6 : i5 * 4;
    }

    public static final Rect g(TextPaint textPaint, CharSequence charSequence, int i, int i2) {
        int i3 = i;
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            if (spanned.nextSpanTransition(i3 - 1, i2, MetricAffectingSpan.class) != i2) {
                Rect rect = new Rect();
                Rect rect2 = new Rect();
                TextPaint textPaint2 = new TextPaint();
                while (i3 < i2) {
                    int iNextSpanTransition = spanned.nextSpanTransition(i3, i2, MetricAffectingSpan.class);
                    MetricAffectingSpan[] metricAffectingSpanArr = (MetricAffectingSpan[]) spanned.getSpans(i3, iNextSpanTransition, MetricAffectingSpan.class);
                    textPaint2.set(textPaint);
                    for (MetricAffectingSpan metricAffectingSpan : metricAffectingSpanArr) {
                        if (spanned.getSpanStart(metricAffectingSpan) != spanned.getSpanEnd(metricAffectingSpan)) {
                            metricAffectingSpan.updateMeasureState(textPaint2);
                        }
                    }
                    if (Build.VERSION.SDK_INT >= 29) {
                        textPaint2.getTextBounds(charSequence, i3, iNextSpanTransition, rect2);
                    } else {
                        textPaint2.getTextBounds(charSequence.toString(), i3, iNextSpanTransition, rect2);
                    }
                    rect.right = rect2.width() + rect.right;
                    rect.top = Math.min(rect.top, rect2.top);
                    rect.bottom = Math.max(rect.bottom, rect2.bottom);
                    i3 = iNextSpanTransition;
                }
                return rect;
            }
        }
        Rect rect3 = new Rect();
        if (Build.VERSION.SDK_INT >= 29) {
            textPaint.getTextBounds(charSequence, i3, i2, rect3);
            return rect3;
        }
        textPaint.getTextBounds(charSequence.toString(), i3, i2, rect3);
        return rect3;
    }

    public static final String h(Object obj) {
        return (obj.getClass().isAnonymousClass() ? obj.getClass().getName() : obj.getClass().getSimpleName()) + '@' + String.format("%07x", Arrays.copyOf(new Object[]{Integer.valueOf(System.identityHashCode(obj))}, 1));
    }

    public static a i(List list, bbi bbiVar, bo5 bo5Var, ArrayList arrayList) {
        if (bbiVar == null) {
            a(1);
            throw null;
        }
        if (bo5Var == null) {
            a(2);
            throw null;
        }
        if (arrayList == null) {
            a(3);
            throw null;
        }
        a aVarJ = j(list, bbiVar, bo5Var, arrayList, null);
        if (aVarJ != null) {
            return aVarJ;
        }
        sz6.h("Substitution failed");
        return null;
    }

    public static a j(List list, bbi bbiVar, bo5 bo5Var, List list2, boolean[] zArr) {
        int i;
        if (bbiVar == null) {
            a(6);
            throw null;
        }
        if (bo5Var == null) {
            a(7);
            throw null;
        }
        if (list2 == null) {
            a(8);
            throw null;
        }
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        Iterator it = list.iterator();
        int i2 = 0;
        while (true) {
            i = 1;
            if (!it.hasNext()) {
                break;
            }
            qai qaiVar = (qai) it.next();
            rai raiVarP0 = rai.P0(bo5Var, qaiVar.getAnnotations(), qaiVar.u(), qaiVar.z(), qaiVar.getName(), i2, qaiVar.Q());
            map.put(qaiVar.p(), new wai(1, raiVarP0.W()));
            map2.put(qaiVar, raiVarP0);
            list2.add(raiVarP0);
            i2++;
        }
        tkg tkgVar = new tkg(i, map);
        a aVarF = a.f(bbiVar, tkgVar);
        a aVarF2 = a.f(new kc2(bbiVar, i), tkgVar);
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            qai qaiVar2 = (qai) it2.next();
            rai raiVar = (rai) map2.get(qaiVar2);
            for (yr9 yr9Var : qaiVar2.getUpperBounds()) {
                xh3 xh3VarA = yr9Var.O().a();
                yr9 yr9VarK = (((xh3VarA instanceof qai) && jwk.z((qai) xh3VarA, null, null)) ? aVarF : aVarF2).k(3, yr9Var);
                if (yr9VarK == null) {
                    return null;
                }
                if (yr9VarK != yr9Var && zArr != null) {
                    zArr[0] = true;
                }
                if (raiVar.P) {
                    sz6.j("Type parameter descriptor is already initialized: ".concat(raiVar.R0()));
                    return null;
                }
                if (!ttj.j(yr9VarK)) {
                    raiVar.O.add(yr9VarK);
                }
            }
            if (raiVar.P) {
                sz6.j("Type parameter descriptor is already initialized: ".concat(raiVar.R0()));
                return null;
            }
            raiVar.P = true;
        }
        return aVarF;
    }
}
