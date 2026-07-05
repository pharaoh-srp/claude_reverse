package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.util.SizeF;
import android.widget.RemoteViews;
import com.pvporbit.freetype.FreeTypeConstants;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import okio.FileSystem;
import okio.Path;

/* JADX INFO: loaded from: classes3.dex */
public abstract class vlk {
    public static final ta4 a = new ta4(-2102687085, false, new rb4(17));

    public static final void a(cte cteVar, boolean z, ta4 ta4Var, ld4 ld4Var, int i) {
        int i2;
        cteVar.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(407108909);
        if ((i & 6) == 0) {
            i2 = (e18Var.f(cteVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var.g(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= e18Var.h(ta4Var) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if (e18Var.Q(i2 & 1, (i2 & 147) != 146)) {
            fqb fqbVar = fqb.E;
            if (z) {
                e18Var.a0(-805894951);
                ta4Var.i(cteVar, fqbVar, e18Var, Integer.valueOf((i2 & 896) | (i2 & 14) | 48));
                e18Var.p(false);
            } else {
                e18Var.a0(-805999793);
                ta4Var.i(cteVar, mpk.b0(fqbVar, mpk.Y(e18Var), false), e18Var, Integer.valueOf(i2 & 910));
                e18Var.p(false);
            }
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new ds0(cteVar, z, ta4Var, i, 4);
        }
    }

    public static long b(boolean z, int i, jc1 jc1Var, long j, long j2, int i2, boolean z2, long j3, long j4, long j5, long j6) {
        jc1Var.getClass();
        if (j6 != Long.MAX_VALUE && z2) {
            if (i2 != 0) {
                long j7 = j2 + 900000;
                if (j6 < j7) {
                    return j7;
                }
            }
            return j6;
        }
        if (z) {
            long jScalb = jc1Var == jc1.F ? j * ((long) i) : (long) Math.scalb(j, i - 1);
            if (jScalb > 18000000) {
                jScalb = 18000000;
            }
            return j2 + jScalb;
        }
        if (z2) {
            long j8 = i2 == 0 ? j2 + j3 : j2 + j5;
            return (j4 == j5 || i2 != 0) ? j8 : (j5 - j4) + j8;
        }
        if (j2 == -1) {
            return Long.MAX_VALUE;
        }
        return j2 + j3;
    }

    public static final void c(List list) {
        List<qk6> list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return;
        }
        for (qk6 qk6Var : list2) {
        }
    }

    public static pva d(String str) {
        if (str.equals("*")) {
            return null;
        }
        return (str.indexOf(42) == -1 && str.indexOf(63) == -1) ? new pva(0, str) : new pva(1, aqk.m(str));
    }

    public static final void e(FileSystem fileSystem, Path path) throws IOException {
        try {
            IOException iOException = null;
            for (Path path2 : fileSystem.x(path)) {
                try {
                    if (fileSystem.K(path2).b) {
                        e(fileSystem, path2);
                    }
                    fileSystem.j(path2, false);
                } catch (IOException e) {
                    if (iOException == null) {
                        iOException = e;
                    }
                }
            }
            if (iOException != null) {
                throw iOException;
            }
        } catch (FileNotFoundException unused) {
        }
    }

    public static za f(qh9 qh9Var) {
        try {
            String strM = qh9Var.s("test_id").m();
            String strM2 = qh9Var.s("result_id").m();
            bh9 bh9VarS = qh9Var.s("injected");
            Boolean boolValueOf = bh9VarS != null ? Boolean.valueOf(bh9VarS.a()) : null;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator it = ((m7a) qh9Var.E.entrySet()).iterator();
            while (((o7a) it).hasNext()) {
                p7a p7aVarA = ((l7a) it).a();
                if (!mp0.o0(p7aVarA.getKey(), za.e)) {
                    Object key = p7aVarA.getKey();
                    key.getClass();
                    linkedHashMap.put(key, p7aVarA.getValue());
                }
            }
            strM.getClass();
            strM2.getClass();
            return new za(strM, strM2, boolValueOf, linkedHashMap);
        } catch (IllegalStateException e) {
            pmf.j("Unable to parse json into type Synthetics", e);
            return null;
        } catch (NullPointerException e2) {
            pmf.j("Unable to parse json into type Synthetics", e2);
            return null;
        } catch (NumberFormatException e3) {
            pmf.j("Unable to parse json into type Synthetics", e3);
            return null;
        }
    }

    public static xbh g(qh9 qh9Var) {
        try {
            bh9 bh9VarS = qh9Var.s("device");
            tbh tbhVarK = bh9VarS != null ? jlk.k(bh9VarS.g()) : null;
            bh9 bh9VarS2 = qh9Var.s("os");
            vbh vbhVarE = bh9VarS2 != null ? tlk.e(bh9VarS2.g()) : null;
            bh9 bh9VarS3 = qh9Var.s("type");
            String strM = bh9VarS3 != null ? bh9VarS3.m() : null;
            String strM2 = qh9Var.s("status").m();
            String strM3 = qh9Var.s("message").m();
            bh9 bh9VarS4 = qh9Var.s("error");
            ubh ubhVarJ = bh9VarS4 != null ? rlk.j(bh9VarS4.g()) : null;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator it = ((m7a) qh9Var.E.entrySet()).iterator();
            while (((o7a) it).hasNext()) {
                p7a p7aVarA = ((l7a) it).a();
                if (!mp0.o0(p7aVarA.getKey(), xbh.f)) {
                    Object key = p7aVarA.getKey();
                    key.getClass();
                    linkedHashMap.put(key, p7aVarA.getValue());
                }
            }
            if (strM != null && !strM.equals("log")) {
                throw new IllegalStateException("Check failed.");
            }
            if (!x44.r(strM2, "error")) {
                throw new IllegalStateException("Check failed.");
            }
            strM3.getClass();
            return new xbh(tbhVarK, vbhVarE, strM3, ubhVarJ, linkedHashMap);
        } catch (IllegalStateException e) {
            pmf.j("Unable to parse json into type Telemetry", e);
            return null;
        } catch (NullPointerException e2) {
            pmf.j("Unable to parse json into type Telemetry", e2);
            return null;
        } catch (NumberFormatException e3) {
            pmf.j("Unable to parse json into type Telemetry", e3);
            return null;
        }
    }

    public static final void h(RemoteViews remoteViews, f6i f6iVar, c59 c59Var, List list) {
        int i = 0;
        for (Object obj : w44.j1(list, 10)) {
            int i2 = i + 1;
            if (i < 0) {
                x44.n0();
                throw null;
            }
            j(remoteViews, f6iVar.b(c59Var, i), (qk6) obj);
            i = i2;
        }
    }

    public static final int i(st stVar) {
        int i = stVar.a;
        int i2 = 8388611;
        if (i != 0) {
            if (i == 2) {
                i2 = 8388613;
            } else if (i == 1) {
                i2 = 1;
            } else {
                Log.w("GlanceAppWidget", "Unknown horizontal alignment: " + ((Object) pt.b(i)));
            }
        }
        int i3 = stVar.b;
        int i4 = 48;
        if (i3 != 0) {
            if (i3 == 2) {
                i4 = 80;
            } else if (i3 == 1) {
                i4 = 16;
            } else {
                Log.w("GlanceAppWidget", "Unknown vertical alignment: " + ((Object) rt.b(i3)));
            }
        }
        return i2 | i4;
    }

    /* JADX WARN: Removed duplicated region for block: B:130:0x0343  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void j(android.widget.RemoteViews r19, defpackage.f6i r20, defpackage.qk6 r21) {
        /*
            Method dump skipped, instruction units count: 922
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vlk.j(android.widget.RemoteViews, f6i, qk6):void");
    }

    public static final RemoteViews k(Context context, int i, jfe jfeVar, bu9 bu9Var, int i2, ComponentName componentName, ro6 ro6Var) {
        boolean z = true;
        if (context.getResources().getConfiguration().getLayoutDirection() != 1) {
            z = false;
        }
        f6i f6iVar = new f6i(context, i, z, bu9Var, -1, false, new AtomicInteger(-1), new c59(0, 0, null, 7), new AtomicBoolean(false), 9205357640488583168L, -1, false, null, componentName, ro6Var);
        ArrayList<qk6> arrayList = jfeVar.b;
        if (arrayList == null || !arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (!(((qk6) it.next()) instanceof wk6)) {
                    qk6 qk6Var = (qk6) w44.e1(arrayList);
                    ife ifeVarA = cw9.a(f6iVar, qk6Var.b(), i2);
                    RemoteViews remoteViews = ifeVarA.a;
                    j(remoteViews, f6i.a(f6iVar.b(ifeVarA.b, 0), 0, new AtomicInteger(-1), null, new AtomicBoolean(false), 0L, null, 65215), qk6Var);
                    return remoteViews;
                }
            }
        }
        Object objL0 = w44.L0(arrayList);
        objL0.getClass();
        v8g v8gVar = ((wk6) objL0).d;
        ArrayList arrayList2 = new ArrayList(x44.y(arrayList, 10));
        for (qk6 qk6Var2 : arrayList) {
            qk6Var2.getClass();
            wk6 wk6Var = (wk6) qk6Var2;
            long j = wk6Var.c;
            ife ifeVarA2 = cw9.a(f6iVar, wk6Var.b(), i2);
            RemoteViews remoteViews2 = ifeVarA2.a;
            j(remoteViews2, f6i.a(f6iVar.b(ifeVarA2.b, 0), 0, new AtomicInteger(-1), null, new AtomicBoolean(false), j, null, 64703), qk6Var2);
            arrayList2.add(new cpc(new SizeF(za6.d(j), za6.c(j)), remoteViews2));
        }
        if (v8gVar instanceof u8g) {
            return (RemoteViews) ((cpc) w44.e1(arrayList2)).F;
        }
        if (!x44.r(v8gVar, t8g.a)) {
            xh6.d("Unknown sizeMode: ", v8gVar);
            return null;
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return oe0.c(sta.p0(arrayList2));
        }
        if (arrayList2.size() != 1 && arrayList2.size() != 2) {
            sz6.p("unsupported views size");
            return null;
        }
        ArrayList arrayList3 = new ArrayList(x44.y(arrayList2, 10));
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            arrayList3.add((RemoteViews) ((cpc) it2.next()).F);
        }
        int size = arrayList3.size();
        if (size == 1) {
            return (RemoteViews) arrayList3.get(0);
        }
        if (size == 2) {
            return new RemoteViews((RemoteViews) arrayList3.get(0), (RemoteViews) arrayList3.get(1));
        }
        sz6.p("There must be between 1 and 2 views.");
        return null;
    }
}
