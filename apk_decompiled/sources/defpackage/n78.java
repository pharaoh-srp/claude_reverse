package defpackage;

import android.R;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.graphics.Region;
import android.os.Build;
import android.os.Looper;
import android.os.Trace;
import android.util.Log;
import android.view.GestureDetector;
import android.view.View;
import android.view.Window;
import android.view.autofill.AutofillManager;
import android.view.inputmethod.InputMethodManager;
import androidx.health.platform.client.proto.g;
import com.anthropic.claude.api.experience.ExperienceToggle;
import com.anthropic.claude.tool.model.EventCreateV1Input;
import com.anthropic.claude.tool.model.HealthConnectQueryV0Input;
import com.pvporbit.freetype.FreeTypeConstants;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.StringTokenizer;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public class n78 implements lp3, fo5, qc, b4a, sr9, szb, mze {
    public static volatile n78 G;
    public static volatile n78 I;
    public final /* synthetic */ int E;
    public Object F;
    public static final Object H = new Object();
    public static final zic J = new zic(1);
    public static final zic K = new zic(0);

    public n78(int i) {
        this.E = i;
        switch (i) {
            case 1:
                this.F = new ConcurrentHashMap();
                break;
            case 5:
                this.F = new AtomicReference(null);
                break;
            case 11:
                this.F = dgj.A(Looper.getMainLooper());
                break;
            case g.MAX_FIELD_NUMBER /* 17 */:
                this.F = new wwb(0, new sy9[16]);
                break;
            case 24:
                this.F = new WeakHashMap();
                break;
            case BuildConfig.VERSION_CODE /* 25 */:
                this.F = new Region();
                break;
            case 26:
                break;
            case 27:
                this.F = new y50();
                break;
            default:
                this.F = new HashSet();
                break;
        }
    }

    public static n78 K() {
        if (I == null) {
            synchronized (H) {
                try {
                    if (I == null) {
                        I = new n78(1);
                    }
                } finally {
                }
            }
        }
        n78 n78Var = I;
        dgj.v(n78Var);
        return n78Var;
    }

    public static int[] P(String str) {
        try {
            if (str.isEmpty()) {
                throw new IllegalArgumentException("Version string is empty");
            }
            StringTokenizer stringTokenizer = new StringTokenizer(str, ".");
            int iCountTokens = stringTokenizer.countTokens();
            int[] iArr = new int[iCountTokens];
            for (int i = 0; i < iCountTokens; i++) {
                iArr[i] = Integer.parseInt(stringTokenizer.nextToken());
            }
            return iArr;
        } catch (RuntimeException e) {
            throw new IllegalArgumentException(ij0.j("Unable to parse HTTP flags version string: `", str, "`"), e);
        }
    }

    public static n78 S(nn7 nn7Var, String str, boolean z) {
        swc.e("Cronet ResolvedFlags#resolve");
        try {
            P(str);
            HashMap map = new HashMap();
            for (Map.Entry entry : Collections.unmodifiableMap(nn7Var.e).entrySet()) {
                try {
                    Iterator it = ((hn7) entry.getValue()).e.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            gn7 gn7Var = (gn7) it.next();
                            if (z) {
                                gn7Var.getClass();
                                break;
                            }
                            gn7Var.getClass();
                        }
                    }
                } catch (RuntimeException e) {
                    throw new IllegalArgumentException("Unable to resolve HTTP flag `" + ((String) entry.getKey()) + "`", e);
                }
            }
            n78 n78Var = new n78(22, map);
            Trace.endSection();
            return n78Var;
        } catch (Throwable th) {
            try {
                Trace.endSection();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static void U(cf5 cf5Var, String str, Object obj) {
        cf5Var.c.P(str, obj);
    }

    @Override // defpackage.fo5
    public Object A(xmc xmcVar, Object obj) {
        StringBuilder sb = (StringBuilder) obj;
        g06 g06Var = (g06) this.F;
        g06Var.getClass();
        g06Var.U(xmcVar.I, "package-fragment", sb);
        if (g06Var.a.o()) {
            sb.append(" in ");
            g06Var.Q(xmcVar.h(), sb, false);
        }
        return iei.a;
    }

    @Override // defpackage.mze
    public boolean B() {
        return true;
    }

    public void C(char c) {
        if (c <= 127) {
            ((BitSet) this.F).set(c);
        } else {
            sz6.p("Can only match ASCII characters");
        }
    }

    public jm4 D(Object obj, pl9 pl9Var, Activity activity, bd7 bd7Var) throws IllegalAccessException, ClassNotFoundException, InvocationTargetException {
        pl9Var.getClass();
        im4 im4Var = new im4(pl9Var, bd7Var);
        ClassLoader classLoader = (ClassLoader) this.F;
        Class<?> clsLoadClass = classLoader.loadClass("java.util.function.Consumer");
        clsLoadClass.getClass();
        Object objNewProxyInstance = Proxy.newProxyInstance(classLoader, new Class[]{clsLoadClass}, im4Var);
        objNewProxyInstance.getClass();
        Class<?> cls = obj.getClass();
        Class<?> clsLoadClass2 = classLoader.loadClass("java.util.function.Consumer");
        clsLoadClass2.getClass();
        cls.getMethod("addWindowLayoutInfoListener", Activity.class, clsLoadClass2).invoke(obj, activity, objNewProxyInstance);
        Class<?> cls2 = obj.getClass();
        Class<?> clsLoadClass3 = classLoader.loadClass("java.util.function.Consumer");
        clsLoadClass3.getClass();
        return new jm4(cls2.getMethod("removeWindowLayoutInfoListener", clsLoadClass3), obj, objNewProxyInstance);
    }

    public void E() {
        ((ge4) this.F).getClass();
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0045  */
    @Override // defpackage.fo5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object F(defpackage.tg3 r11, java.lang.Object r12) {
        /*
            Method dump skipped, instruction units count: 322
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n78.F(tg3, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0075, code lost:
    
        if (r6 == r5) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object G(defpackage.tp4 r7) {
        /*
            Method dump skipped, instruction units count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n78.G(tp4):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0078, code lost:
    
        if (r6 == r5) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object H(com.anthropic.claude.tool.model.EventCreateV1Input r7, defpackage.vp4 r8) {
        /*
            Method dump skipped, instruction units count: 230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n78.H(com.anthropic.claude.tool.model.EventCreateV1Input, vp4):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:45:0x00ef, B:44:0x00ed], limit reached: 106 */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01e0  */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v15, types: [int] */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v9, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v4, types: [mc] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:88:0x01d3 -> B:89:0x01d7). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object I(com.anthropic.claude.tool.model.HealthConnectQueryV0Input r22, defpackage.vp4 r23) {
        /*
            Method dump skipped, instruction units count: 502
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n78.I(com.anthropic.claude.tool.model.HealthConnectQueryV0Input, vp4):java.lang.Object");
    }

    public int J(int i, String str) {
        str.getClass();
        return ((SharedPreferences) this.F).getInt(str, i);
    }

    public void L() {
        View view = (View) this.F;
        if (view != null) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    public void M(String str) {
        k99 k99Var = (k99) ((zy7) this.F).a();
        h99 h99VarT = k99Var != null ? k99Var.t() : null;
        if (h99VarT != null) {
            dch.H(h99VarT, 5, g99.F, new rb1(str, 21), null, false, 56);
        }
    }

    public void N(z3a z3aVar) {
        q4a q4aVar = (q4a) this.F;
        int iOrdinal = z3aVar.ordinal();
        if (iOrdinal == 0) {
            int iOrdinal2 = q4aVar.F.ordinal();
            if (iOrdinal2 != 0) {
                if (iOrdinal2 == 1) {
                    yfd.u(q4aVar);
                    yfd.v(q4aVar);
                    return;
                } else if (iOrdinal2 == 2 || iOrdinal2 == 3 || iOrdinal2 == 4) {
                    yfd.v(q4aVar);
                    return;
                } else {
                    mr9.b();
                    return;
                }
            }
            return;
        }
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                int iOrdinal3 = q4aVar.F.ordinal();
                if (iOrdinal3 != 0) {
                    if (iOrdinal3 == 1) {
                        yfd.u(q4aVar);
                        return;
                    }
                    if (iOrdinal3 != 2) {
                        if (iOrdinal3 == 3 || iOrdinal3 == 4) {
                            yfd.g0(q4aVar);
                            return;
                        } else {
                            mr9.b();
                            return;
                        }
                    }
                    return;
                }
                return;
            }
            if (iOrdinal != 3) {
                if (iOrdinal != 4) {
                    mr9.b();
                    return;
                }
                int iOrdinal4 = q4aVar.F.ordinal();
                if (iOrdinal4 != 0) {
                    if (iOrdinal4 == 1 || iOrdinal4 == 2 || iOrdinal4 == 3) {
                        yfd.Z(q4aVar);
                        return;
                    } else {
                        if (iOrdinal4 == 4) {
                            return;
                        }
                        mr9.b();
                        return;
                    }
                }
                return;
            }
            int iOrdinal5 = q4aVar.F.ordinal();
            if (iOrdinal5 != 0) {
                if (iOrdinal5 == 1 || iOrdinal5 == 2) {
                    yfd.f0(q4aVar);
                    return;
                }
                if (iOrdinal5 != 3) {
                    if (iOrdinal5 != 4) {
                        mr9.b();
                    } else if (q4aVar.F == z3a.I) {
                        q4aVar.onPause();
                    }
                }
            }
        }
    }

    public void O(View view, int i, boolean z) {
        if (Build.VERSION.SDK_INT >= 27) {
            ((AutofillManager) this.F).notifyViewVisibilityChanged(view, i, z);
        }
    }

    public void Q(char c, char c2) {
        while (c <= c2) {
            C(c);
            c = (char) (c + 1);
        }
    }

    public void R(Activity activity, bye byeVar) {
        byeVar.getClass();
        WeakHashMap weakHashMap = (WeakHashMap) this.F;
        eze ezeVar = (eze) weakHashMap.get(activity);
        if (ezeVar != null) {
            tk5 tk5Var = ezeVar.G;
            tk5Var.getClass();
            ((CopyOnWriteArraySet) tk5Var.F).remove(byeVar);
            if (((CopyOnWriteArraySet) tk5Var.F).size() == 0) {
                Window window = activity.getWindow();
                window.getClass();
                Window.Callback callback = window.getCallback();
                if ((callback instanceof eze) && weakHashMap.values().contains(callback)) {
                    window.setCallback(((eze) callback).F);
                }
                weakHashMap.remove(activity);
            }
        }
    }

    public void T(c79 c79Var) {
        ((Region) this.F).set(c79Var.a, c79Var.b, c79Var.c, c79Var.d);
    }

    public void V() {
        View viewFindViewById;
        View view = (View) this.F;
        if (view == null) {
            return;
        }
        if (view.isInEditMode() || view.onCheckIsTextEditor()) {
            view.requestFocus();
            viewFindViewById = view;
        } else {
            viewFindViewById = view.getRootView().findFocus();
        }
        if (viewFindViewById == null) {
            viewFindViewById = view.getRootView().findViewById(R.id.content);
        }
        if (viewFindViewById == null || !viewFindViewById.hasWindowFocus()) {
            return;
        }
        viewFindViewById.post(new y0(10, viewFindViewById));
    }

    public void W(Context context, ServiceConnection serviceConnection) {
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.F;
        if ((serviceConnection instanceof p3l) || !concurrentHashMap.containsKey(serviceConnection)) {
            try {
                context.unbindService(serviceConnection);
            } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused) {
            }
        } else {
            try {
                try {
                    context.unbindService((ServiceConnection) concurrentHashMap.get(serviceConnection));
                } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused2) {
                }
            } finally {
                concurrentHashMap.remove(serviceConnection);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void X(defpackage.h08 r10, java.lang.StringBuilder r11) {
        /*
            Method dump skipped, instruction units count: 473
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n78.X(h08, java.lang.StringBuilder):void");
    }

    public void Y(erd erdVar, StringBuilder sb, String str) {
        g06 g06Var = (g06) this.F;
        va1 va1Var = g06Var.a.G;
        wn9 wn9Var = k06.W[31];
        va1Var.getClass();
        wn9Var.getClass();
        int iOrdinal = ((frd) va1Var.a).ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                return;
            }
            X(erdVar, sb);
        } else {
            g06Var.L(erdVar, sb);
            sb.append(str.concat(" for "));
            hrd hrdVarN0 = erdVar.N0();
            hrdVarN0.getClass();
            g06.o(g06Var, hrdVarN0, sb);
        }
    }

    public boolean Z(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i, Executor executor) {
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.F;
        ComponentName component = intent.getComponent();
        if (component != null) {
            String packageName = component.getPackageName();
            "com.google.android.gms".equals(packageName);
            try {
                if ((nij.a(context).C(0, packageName).flags & FreeTypeConstants.FT_LOAD_COMPUTE_METRICS) != 0) {
                    Log.w("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
                    return false;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        if (serviceConnection instanceof p3l) {
            if (executor == null) {
                executor = null;
            }
            return (Build.VERSION.SDK_INT < 29 || executor == null) ? context.bindService(intent, serviceConnection, i) : context.bindService(intent, i, executor, serviceConnection);
        }
        ServiceConnection serviceConnection2 = (ServiceConnection) concurrentHashMap.putIfAbsent(serviceConnection, serviceConnection);
        if (serviceConnection2 != null && serviceConnection != serviceConnection2) {
            Log.w("ConnectionTracker", String.format("Duplicate binding with the same ServiceConnection: %s, %s, %s.", serviceConnection, str, intent.getAction()));
        }
        if (executor == null) {
            executor = null;
        }
        try {
            boolean zBindService = (Build.VERSION.SDK_INT < 29 || executor == null) ? context.bindService(intent, serviceConnection, i) : context.bindService(intent, i, executor, serviceConnection);
            if (zBindService) {
                return zBindService;
            }
            return false;
        } finally {
            concurrentHashMap.remove(serviceConnection, serviceConnection);
        }
    }

    @Override // defpackage.b4a
    public z3a a() {
        return ((q4a) this.F).F;
    }

    @Override // defpackage.fo5
    public Object b(krd krdVar, Object obj) {
        Y(krdVar, (StringBuilder) obj, "getter");
        return iei.a;
    }

    @Override // defpackage.szb
    public uwb c(a2 a2Var) {
        return ((y50) this.F).d(a2Var);
    }

    @Override // defpackage.b4a
    public void d(v3a v3aVar) {
        v3aVar.getClass();
        ((q4a) this.F).d(v3aVar);
    }

    @Override // defpackage.qc
    public void e(Object obj) {
        Map map = (Map) obj;
        rx7 rx7Var = (rx7) this.F;
        ArrayList arrayList = new ArrayList(map.values());
        int[] iArr = new int[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            iArr[i] = ((Boolean) arrayList.get(i)).booleanValue() ? 0 : -1;
        }
        nx7 nx7Var = (nx7) rx7Var.F.pollFirst();
        if (nx7Var == null) {
            Log.w("FragmentManager", "No permissions were requested for " + this);
        } else {
            String str = nx7Var.E;
            if (rx7Var.c.E(str) == null) {
                Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
            }
        }
    }

    public boolean f(Context context, Intent intent, ServiceConnection serviceConnection, int i) {
        return Z(context, context.getClass().getName(), intent, serviceConnection, i, null);
    }

    @Override // defpackage.fo5
    public Object g(eri eriVar, Object obj) {
        ((g06) this.F).g0(eriVar, true, (StringBuilder) obj, true);
        return iei.a;
    }

    @Override // defpackage.fo5
    public Object h(r4 r4Var, Object obj) {
        ((g06) this.F).c0(r4Var, (StringBuilder) obj, true);
        return iei.a;
    }

    @Override // defpackage.fo5
    public Object i(mw9 mw9Var, Object obj) {
        ((StringBuilder) obj).append(mw9Var.getName());
        return iei.a;
    }

    @Override // defpackage.sr9, defpackage.tr9
    public void j() {
    }

    @Override // defpackage.sr9
    public void k(sxb sxbVar, Object obj) {
        l3e l3eVar = (l3e) this.F;
        String strB = sxbVar.b();
        if ("k".equals(strB)) {
            if (obj instanceof Integer) {
                pr9 pr9Var = (pr9) pr9.F.get((Integer) obj);
                if (pr9Var == null) {
                    pr9Var = pr9.UNKNOWN;
                }
                l3eVar.K = pr9Var;
                return;
            }
            return;
        }
        if ("mv".equals(strB)) {
            if (obj instanceof int[]) {
                l3eVar.E = (int[]) obj;
            }
        } else {
            if ("xs".equals(strB)) {
                if (obj instanceof String) {
                    String str = (String) obj;
                    if (str.isEmpty()) {
                        return;
                    }
                    l3eVar.F = str;
                    return;
                }
                return;
            }
            if (!"xi".equals(strB)) {
                "pn".equals(strB);
            } else if (obj instanceof Integer) {
                l3eVar.G = ((Integer) obj).intValue();
            }
        }
    }

    @Override // defpackage.b4a
    public void l(v3a v3aVar) {
        ((q4a) this.F).l(v3aVar);
    }

    @Override // defpackage.fo5
    public Object n(prd prdVar, Object obj) {
        Y(prdVar, (StringBuilder) obj, "setter");
        return iei.a;
    }

    @Override // defpackage.fo5
    public Object o(d1a d1aVar, Object obj) {
        StringBuilder sb = (StringBuilder) obj;
        g06 g06Var = (g06) this.F;
        g06Var.getClass();
        g06Var.U(d1aVar.H, "package", sb);
        if (g06Var.a.o()) {
            sb.append(" in context of ");
            g06Var.Q(d1aVar.G, sb, false);
        }
        return iei.a;
    }

    @Override // defpackage.fo5
    public Object p(q16 q16Var, Object obj) {
        StringBuilder sb = (StringBuilder) obj;
        g06 g06Var = (g06) this.F;
        g06Var.getClass();
        g06Var.z(sb, q16Var, null);
        ow5 visibility = q16Var.getVisibility();
        visibility.getClass();
        g06Var.i0(visibility, sb);
        g06Var.L(q16Var, sb);
        sb.append(g06Var.J("typealias"));
        sb.append(" ");
        g06Var.Q(q16Var, sb, true);
        g06Var.e0(q16Var.i0(), sb, false);
        g06Var.B(q16Var, sb);
        sb.append(" = ");
        sb.append(g06Var.Z(q16Var.P0()));
        return iei.a;
    }

    @Override // defpackage.sr9
    public void q(sxb sxbVar, jh3 jh3Var) {
    }

    @Override // defpackage.mze
    public lze r(String str) {
        str.getClass();
        bzg bzgVar = (bzg) this.F;
        String databaseName = bzgVar.getDatabaseName();
        if (databaseName == null) {
            if (!str.equals(":memory:")) {
                mr9.q(ij0.j("This driver is configured to open an in-memory database but a file-based named '", str, "' was requested."));
                return null;
            }
        } else if (!databaseName.equals(str) && !bsg.d1('/', databaseName, databaseName).equals(bsg.d1('/', str, str))) {
            throw new IllegalArgumentException(("This driver is configured to open a database named '" + bzgVar.getDatabaseName() + "' but '" + str + "' was requested.").toString());
        }
        return new zyg(bzgVar.X());
    }

    @Override // defpackage.fo5
    public Object s(uqb uqbVar, Object obj) {
        ((g06) this.F).Q(uqbVar, (StringBuilder) obj, true);
        return iei.a;
    }

    @Override // defpackage.sr9
    public tr9 t(sxb sxbVar) {
        String strB = sxbVar.b();
        if ("d1".equals(strB)) {
            return new j3e(this, 0);
        }
        if ("d2".equals(strB)) {
            return new j3e(this, 1);
        }
        return null;
    }

    @Override // defpackage.sr9
    public void u(sxb sxbVar, gh3 gh3Var, sxb sxbVar2) {
    }

    @Override // defpackage.fo5
    public Object v(jrd jrdVar, Object obj) {
        jrdVar.getClass();
        g06.o((g06) this.F, jrdVar, (StringBuilder) obj);
        return iei.a;
    }

    @Override // defpackage.lp3
    public /* bridge */ /* synthetic */ Object w(Context context, Object obj, String str, cxh cxhVar) {
        switch (this.E) {
            case 6:
                return H((EventCreateV1Input) obj, cxhVar);
            case 7:
                return G(cxhVar);
            default:
                return I((HealthConnectQueryV0Input) obj, cxhVar);
        }
    }

    @Override // defpackage.fo5
    public /* bridge */ /* synthetic */ Object x(h08 h08Var, Object obj) {
        X(h08Var, (StringBuilder) obj);
        return iei.a;
    }

    @Override // defpackage.fo5
    public Object y(qqb qqbVar, Object obj) throws IOException {
        tg3 tg3VarN0;
        String str;
        StringBuilder sb = (StringBuilder) obj;
        g06 g06Var = (g06) this.F;
        k06 k06Var = g06Var.a;
        boolean z = qqbVar.m() == 4;
        int i = 2;
        if (!g06Var.s()) {
            g06Var.z(sb, qqbVar, null);
            List listK = qqbVar.k();
            listK.getClass();
            g06Var.D(sb, listK);
            if (!z) {
                ow5 visibility = qqbVar.getVisibility();
                visibility.getClass();
                g06Var.i0(visibility, sb);
            }
            if ((qqbVar.m() != 2 || qqbVar.q() != 4) && (!qy1.a(qqbVar.m()) || qqbVar.q() != 1)) {
                int iQ = qqbVar.q();
                sq6.a(iQ);
                g06Var.M(iQ, g06.w(qqbVar), sb);
            }
            g06Var.L(qqbVar, sb);
            g06Var.O("inner", sb, g06Var.r().contains(h06.INNER) && qqbVar.y());
            g06Var.O("data", sb, g06Var.r().contains(h06.DATA) && qqbVar.q0());
            g06Var.O("inline", sb, g06Var.r().contains(h06.INLINE) && qqbVar.isInline());
            g06Var.O(ExperienceToggle.DEFAULT_PARAM_KEY, sb, g06Var.r().contains(h06.VALUE) && qqbVar.s0());
            g06Var.O("fun", sb, g06Var.r().contains(h06.FUN) && qqbVar.r0());
            if (qqbVar.p0()) {
                str = "companion object";
            } else {
                int iF = sq6.F(qqbVar.m());
                if (iF == 0) {
                    str = "class";
                } else if (iF == 1) {
                    str = "interface";
                } else if (iF == 2) {
                    str = "enum class";
                } else if (iF == 3) {
                    str = "enum entry";
                } else if (iF == 4) {
                    str = "annotation class";
                } else {
                    if (iF != 5) {
                        mr9.b();
                        return null;
                    }
                    str = "object";
                }
            }
            sb.append(g06Var.J(str));
        }
        if (m06.l(qqbVar)) {
            va1 va1Var = k06Var.F;
            wn9 wn9Var = k06.W[30];
            va1Var.getClass();
            wn9Var.getClass();
            if (((Boolean) va1Var.a).booleanValue()) {
                if (g06Var.s()) {
                    sb.append("companion object");
                }
                g06.Y(sb);
                bo5 bo5VarH = qqbVar.h();
                if (bo5VarH != null) {
                    sb.append("of ");
                    sxb name = bo5VarH.getName();
                    name.getClass();
                    sb.append(g06Var.P(name, false));
                }
            }
            if (g06Var.v() || !x44.r(qqbVar.getName(), ygg.b)) {
                if (!g06Var.s()) {
                    g06.Y(sb);
                }
                sxb name2 = qqbVar.getName();
                name2.getClass();
                sb.append(g06Var.P(name2, true));
            }
        } else {
            if (!g06Var.s()) {
                g06.Y(sb);
            }
            g06Var.Q(qqbVar, sb, true);
        }
        if (!z) {
            List listI0 = qqbVar.i0();
            listI0.getClass();
            g06Var.e0(listI0, sb, false);
            g06Var.B(qqbVar, sb);
            if (!qy1.a(qqbVar.m())) {
                va1 va1Var2 = k06Var.i;
                wn9 wn9Var2 = k06.W[7];
                va1Var2.getClass();
                wn9Var2.getClass();
                if (((Boolean) va1Var2.a).booleanValue() && (tg3VarN0 = qqbVar.n0()) != null) {
                    sb.append(" ");
                    g06Var.z(sb, tg3VarN0, null);
                    ow5 visibility2 = tg3VarN0.getVisibility();
                    visibility2.getClass();
                    g06Var.i0(visibility2, sb);
                    sb.append(g06Var.J("constructor"));
                    List listI = tg3VarN0.I();
                    listI.getClass();
                    g06Var.h0(listI, tg3VarN0.v(), sb);
                }
            }
            va1 va1Var3 = k06Var.w;
            wn9 wn9Var3 = k06.W[21];
            va1Var3.getClass();
            wn9Var3.getClass();
            if (!((Boolean) va1Var3.a).booleanValue() && !or9.D(qqbVar.W())) {
                Collection collectionB = qqbVar.p().b();
                collectionB.getClass();
                if (!collectionB.isEmpty() && (collectionB.size() != 1 || !or9.w((yr9) collectionB.iterator().next()))) {
                    g06.Y(sb);
                    sb.append(": ");
                    w44.R0(collectionB, sb, ", ", null, null, new e06(g06Var, i), 60);
                }
            }
            g06Var.j0(sb, listI0);
        }
        return iei.a;
    }

    @Override // defpackage.sr9
    public sr9 z(gh3 gh3Var, sxb sxbVar) {
        return null;
    }

    public n78(b4a b4aVar, q4a q4aVar) {
        this.E = 18;
        b4aVar.getClass();
        q4a q4aVar2 = new q4a();
        q4aVar2.E = um6.E;
        z3a z3aVar = z3a.F;
        q4aVar2.F = z3aVar;
        this.F = q4aVar2;
        final dae daeVar = new dae();
        z3a z3aVarA = b4aVar.a();
        z3a z3aVar2 = z3a.E;
        daeVar.E = z3aVarA == z3aVar2 ? z3aVar2 : z3aVar;
        final dae daeVar2 = new dae();
        z3aVar = q4aVar.F == z3aVar2 ? z3aVar2 : z3aVar;
        daeVar2.E = z3aVar;
        N((z3a) nai.V((Comparable) daeVar.E, z3aVar));
        if (daeVar.E == z3aVar2 || daeVar2.E == z3aVar2) {
            return;
        }
        final int i = 0;
        bz7 bz7Var = new bz7() { // from class: deb
            @Override // defpackage.bz7
            public final Object invoke(Object obj) {
                int i2 = i;
                iei ieiVar = iei.a;
                dae daeVar3 = daeVar2;
                n78 n78Var = this;
                dae daeVar4 = daeVar;
                z3a z3aVar3 = (z3a) obj;
                switch (i2) {
                    case 0:
                        z3aVar3.getClass();
                        daeVar4.E = z3aVar3;
                        n78Var.N((z3a) nai.V(z3aVar3, (Comparable) daeVar3.E));
                        break;
                    default:
                        z3aVar3.getClass();
                        daeVar4.E = z3aVar3;
                        n78Var.N((z3a) nai.V(z3aVar3, (Comparable) daeVar3.E));
                        break;
                }
                return ieiVar;
            }
        };
        int i2 = 3;
        hf3 hf3Var = new hf3(i2, bz7Var);
        final int i3 = 1;
        hf3 hf3Var2 = new hf3(i2, new bz7() { // from class: deb
            @Override // defpackage.bz7
            public final Object invoke(Object obj) {
                int i22 = i3;
                iei ieiVar = iei.a;
                dae daeVar3 = daeVar;
                n78 n78Var = this;
                dae daeVar4 = daeVar2;
                z3a z3aVar3 = (z3a) obj;
                switch (i22) {
                    case 0:
                        z3aVar3.getClass();
                        daeVar4.E = z3aVar3;
                        n78Var.N((z3a) nai.V(z3aVar3, (Comparable) daeVar3.E));
                        break;
                    default:
                        z3aVar3.getClass();
                        daeVar4.E = z3aVar3;
                        n78Var.N((z3a) nai.V(z3aVar3, (Comparable) daeVar3.E));
                        break;
                }
                return ieiVar;
            }
        });
        b4aVar.l(hf3Var);
        q4aVar.l(hf3Var2);
        if (q4aVar2.F == z3aVar2) {
            b4aVar.d(hf3Var);
            q4aVar.d(hf3Var2);
        } else {
            q4aVar2.l(new eeb(b4aVar, hf3Var, q4aVar, hf3Var2));
        }
    }

    public /* synthetic */ n78(int i, Object obj) {
        this.E = i;
        this.F = obj;
    }

    public n78(bzg bzgVar) {
        this.E = 29;
        bzgVar.getClass();
        this.F = bzgVar;
    }

    public n78(ClassLoader classLoader) {
        this.E = 10;
        classLoader.getClass();
        this.F = classLoader;
    }

    public n78(bvb bvbVar, o92 o92Var) {
        this.E = 2;
        this.F = o92Var;
    }

    public n78(Context context, f38 f38Var) {
        this.E = 14;
        this.F = new GestureDetector(context, f38Var, null);
    }

    public n78(InputStream inputStream) {
        this.E = 16;
        inputStream.getClass();
        this.F = new cj2(inputStream, dj2.a);
    }
}
