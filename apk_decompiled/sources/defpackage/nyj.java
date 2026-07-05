package defpackage;

import android.accounts.Account;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.database.SQLException;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.provider.CalendarContract;
import android.util.Log;
import androidx.health.platform.client.proto.g;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.api.errors.ClaudeApiError$AuthError;
import com.anthropic.claude.api.result.ApiResult;
import com.pvporbit.freetype.FreeTypeConstants;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.ref.SoftReference;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import kotlinx.serialization.KSerializer;
import okio.RealBufferedSource;

/* JADX INFO: loaded from: classes.dex */
public final class nyj implements dc0, h92, mze, t4i, dof, fsc, lp4, x82, br4, d4f, b4a {
    public static volatile nyj H;
    public static final Object I = new Object();
    public final /* synthetic */ int E;
    public Object F;
    public Object G;

    public nyj(nyj nyjVar) {
        wwb wwbVar;
        this.E = 11;
        this.F = new wwb(0, new eh2[16]);
        this.G = new wwb(0, new eh2[16]);
        if (nyjVar == null || (wwbVar = (wwb) nyjVar.F) == null) {
            return;
        }
        Object[] objArr = wwbVar.E;
        int i = wwbVar.G;
        for (int i2 = 0; i2 < i; i2++) {
            eh2 eh2Var = (eh2) objArr[i2];
            ((wwb) this.F).b(new eh2(eh2Var.d(), eh2Var.c(), eh2Var.b(), eh2Var.a()));
        }
    }

    public static String A(Class cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            return "Interfaces can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Interface name: ".concat(cls.getName());
        }
        if (Modifier.isAbstract(modifiers)) {
            return "Abstract classes can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Class name: ".concat(cls.getName());
        }
        return null;
    }

    public static void C(SQLException sQLException) {
        String message = sQLException.getMessage();
        if (message == null) {
            throw sQLException;
        }
        if (!bsg.u0(message, "unique", true) && !bsg.u0(message, "2067", false) && !bsg.u0(message, "1555", false)) {
            throw sQLException;
        }
    }

    public static String V(String str, String str2, Object... objArr) {
        String strReplace = str2.replace("{}", "%s");
        return String.format(Locale.US, str + ": " + strReplace, objArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0046 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0041 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.nyj x(android.content.Context r5) {
        /*
            java.lang.String r0 = "generatefid.lock"
            r1 = 0
            java.io.File r2 = new java.io.File     // Catch: java.nio.channels.OverlappingFileLockException -> L30 java.lang.Error -> L34 java.io.IOException -> L36
            java.io.File r5 = r5.getFilesDir()     // Catch: java.nio.channels.OverlappingFileLockException -> L30 java.lang.Error -> L34 java.io.IOException -> L36
            r2.<init>(r5, r0)     // Catch: java.nio.channels.OverlappingFileLockException -> L30 java.lang.Error -> L34 java.io.IOException -> L36
            java.io.RandomAccessFile r5 = new java.io.RandomAccessFile     // Catch: java.nio.channels.OverlappingFileLockException -> L30 java.lang.Error -> L34 java.io.IOException -> L36
            java.lang.String r0 = "rw"
            r5.<init>(r2, r0)     // Catch: java.nio.channels.OverlappingFileLockException -> L30 java.lang.Error -> L34 java.io.IOException -> L36
            java.nio.channels.FileChannel r5 = r5.getChannel()     // Catch: java.nio.channels.OverlappingFileLockException -> L30 java.lang.Error -> L34 java.io.IOException -> L36
            java.nio.channels.FileLock r0 = r5.lock()     // Catch: java.nio.channels.OverlappingFileLockException -> L29 java.lang.Error -> L2c java.io.IOException -> L2e
            nyj r2 = new nyj     // Catch: java.nio.channels.OverlappingFileLockException -> L23 java.lang.Error -> L25 java.io.IOException -> L27
            r3 = 17
            r2.<init>(r5, r3, r0)     // Catch: java.nio.channels.OverlappingFileLockException -> L23 java.lang.Error -> L25 java.io.IOException -> L27
            return r2
        L23:
            r2 = move-exception
            goto L38
        L25:
            r2 = move-exception
            goto L38
        L27:
            r2 = move-exception
            goto L38
        L29:
            r2 = move-exception
        L2a:
            r0 = r1
            goto L38
        L2c:
            r2 = move-exception
            goto L2a
        L2e:
            r2 = move-exception
            goto L2a
        L30:
            r2 = move-exception
        L31:
            r5 = r1
            r0 = r5
            goto L38
        L34:
            r2 = move-exception
            goto L31
        L36:
            r2 = move-exception
            goto L31
        L38:
            java.lang.String r3 = "CrossProcessLock"
            java.lang.String r4 = "encountered error while creating and acquiring the lock, ignoring"
            android.util.Log.e(r3, r4, r2)
            if (r0 == 0) goto L44
            r0.release()     // Catch: java.io.IOException -> L44
        L44:
            if (r5 == 0) goto L49
            r5.close()     // Catch: java.io.IOException -> L49
        L49:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nyj.x(android.content.Context):nyj");
    }

    @Override // defpackage.mze
    public boolean B() {
        return ((mze) this.F).B();
    }

    public void D() {
        ((wwb) this.F).h();
    }

    public void E(String str, Object obj) {
        h99 h99Var = (h99) this.F;
        ((rl) h99Var).L(2, g99.F, new ka1(this, str, obj, 15), null, false, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00f7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.kc0 F(defpackage.bsd r11, defpackage.txb r12) {
        /*
            Method dump skipped, instruction units count: 261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nyj.F(bsd, txb):kc0");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v8, types: [java.util.List] */
    public ArrayList G() {
        ?? arrayList;
        ArrayList arrayList2 = new ArrayList();
        tk5 tk5Var = (tk5) this.G;
        Context context = (Context) this.F;
        Class cls = (Class) tk5Var.F;
        Bundle bundle = null;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                Log.w("ComponentDiscovery", "Context has no PackageManager.");
            } else {
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) cls), FreeTypeConstants.FT_LOAD_PEDANTIC);
                if (serviceInfo == null) {
                    Log.w("ComponentDiscovery", cls + " has no service info.");
                } else {
                    bundle = serviceInfo.metaData;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
            Log.w("ComponentDiscovery", "Application info not found.");
        }
        if (bundle == null) {
            Log.w("ComponentDiscovery", "Could not retrieve metadata, returning empty list of registrars.");
            arrayList = Collections.EMPTY_LIST;
        } else {
            arrayList = new ArrayList();
            for (String str : bundle.keySet()) {
                if ("com.google.firebase.components.ComponentRegistrar".equals(bundle.get(str)) && str.startsWith("com.google.firebase.components:")) {
                    arrayList.add(str.substring(31));
                }
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new ha4(0, (String) it.next()));
        }
        return arrayList2;
    }

    public void H(cx7 cx7Var, boolean z) {
        cx7Var.getClass();
        cx7 cx7Var2 = ((rx7) this.F).y;
        if (cx7Var2 != null) {
            cx7Var2.l().o.H(cx7Var, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.G).iterator();
        if (it.hasNext()) {
            ij0.x(it.next());
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    public void I(cx7 cx7Var, boolean z) {
        cx7Var.getClass();
        rx7 rx7Var = (rx7) this.F;
        fx7 fx7Var = rx7Var.w.N;
        cx7 cx7Var2 = rx7Var.y;
        if (cx7Var2 != null) {
            cx7Var2.l().o.I(cx7Var, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.G).iterator();
        if (it.hasNext()) {
            ij0.x(it.next());
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    public void J(cx7 cx7Var, boolean z) {
        cx7Var.getClass();
        cx7 cx7Var2 = ((rx7) this.F).y;
        if (cx7Var2 != null) {
            cx7Var2.l().o.J(cx7Var, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.G).iterator();
        if (it.hasNext()) {
            ij0.x(it.next());
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    public void K(cx7 cx7Var, boolean z) {
        cx7Var.getClass();
        cx7 cx7Var2 = ((rx7) this.F).y;
        if (cx7Var2 != null) {
            cx7Var2.l().o.K(cx7Var, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.G).iterator();
        if (it.hasNext()) {
            ij0.x(it.next());
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    public void L(cx7 cx7Var, boolean z) {
        cx7Var.getClass();
        cx7 cx7Var2 = ((rx7) this.F).y;
        if (cx7Var2 != null) {
            cx7Var2.l().o.L(cx7Var, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.G).iterator();
        if (it.hasNext()) {
            ij0.x(it.next());
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    public void M(cx7 cx7Var, boolean z) {
        cx7Var.getClass();
        cx7 cx7Var2 = ((rx7) this.F).y;
        if (cx7Var2 != null) {
            cx7Var2.l().o.M(cx7Var, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.G).iterator();
        if (it.hasNext()) {
            ij0.x(it.next());
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    public void N(cx7 cx7Var, boolean z) {
        cx7Var.getClass();
        rx7 rx7Var = (rx7) this.F;
        fx7 fx7Var = rx7Var.w.N;
        cx7 cx7Var2 = rx7Var.y;
        if (cx7Var2 != null) {
            cx7Var2.l().o.N(cx7Var, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.G).iterator();
        if (it.hasNext()) {
            ij0.x(it.next());
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    public void O(cx7 cx7Var, boolean z) {
        cx7Var.getClass();
        cx7 cx7Var2 = ((rx7) this.F).y;
        if (cx7Var2 != null) {
            cx7Var2.l().o.O(cx7Var, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.G).iterator();
        if (it.hasNext()) {
            ij0.x(it.next());
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    public void P(cx7 cx7Var, boolean z) {
        cx7Var.getClass();
        cx7 cx7Var2 = ((rx7) this.F).y;
        if (cx7Var2 != null) {
            cx7Var2.l().o.P(cx7Var, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.G).iterator();
        if (it.hasNext()) {
            ij0.x(it.next());
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    public void Q(cx7 cx7Var, Bundle bundle, boolean z) {
        cx7Var.getClass();
        cx7 cx7Var2 = ((rx7) this.F).y;
        if (cx7Var2 != null) {
            cx7Var2.l().o.Q(cx7Var, bundle, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.G).iterator();
        if (it.hasNext()) {
            ij0.x(it.next());
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    public void R(cx7 cx7Var, boolean z) {
        cx7Var.getClass();
        cx7 cx7Var2 = ((rx7) this.F).y;
        if (cx7Var2 != null) {
            cx7Var2.l().o.R(cx7Var, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.G).iterator();
        if (it.hasNext()) {
            ij0.x(it.next());
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    public void S(cx7 cx7Var, boolean z) {
        cx7Var.getClass();
        cx7 cx7Var2 = ((rx7) this.F).y;
        if (cx7Var2 != null) {
            cx7Var2.l().o.S(cx7Var, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.G).iterator();
        if (it.hasNext()) {
            ij0.x(it.next());
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    public void T(cx7 cx7Var, boolean z) {
        cx7Var.getClass();
        cx7 cx7Var2 = ((rx7) this.F).y;
        if (cx7Var2 != null) {
            cx7Var2.l().o.T(cx7Var, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.G).iterator();
        if (it.hasNext()) {
            ij0.x(it.next());
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    public boolean U(il4 il4Var, yr9 yr9Var, yrd yrdVar) {
        il4 il4Var2;
        yrd yrdVar2;
        tqb tqbVar = (tqb) this.F;
        xrd xrdVar = yrdVar.G;
        int i = xrdVar == null ? -1 : lc0.a[xrdVar.ordinal()];
        if (i != 10) {
            if (i != 13) {
                return x44.r(il4Var.a(tqbVar), yr9Var);
            }
            if (il4Var instanceof lp0) {
                lp0 lp0Var = (lp0) il4Var;
                if (((List) lp0Var.b()).size() == yrdVar.O.size()) {
                    yr9 yr9VarF = tqbVar.f().f(yr9Var);
                    Iterable iterableL = x44.L((Collection) lp0Var.b());
                    if ((iterableL instanceof Collection) && ((Collection) iterableL).isEmpty()) {
                        return true;
                    }
                    Iterator it = iterableL.iterator();
                    do {
                        a79 a79Var = (a79) it;
                        if (!a79Var.G) {
                            return true;
                        }
                        int iNextInt = a79Var.nextInt();
                        il4Var2 = (il4) ((List) lp0Var.b()).get(iNextInt);
                        yrdVar2 = (yrd) yrdVar.O.get(iNextInt);
                        yrdVar2.getClass();
                    } while (U(il4Var2, yr9VarF, yrdVar2));
                }
            }
            mr9.k("Deserialized ArrayValue should have the same number of elements as the original array value: ", il4Var);
            return false;
        }
        xh3 xh3VarA = yr9Var.O().a();
        qqb qqbVar = xh3VarA instanceof qqb ? (qqb) xh3VarA : null;
        if (qqbVar == null) {
            return true;
        }
        sxb sxbVar = or9.e;
        if (or9.b(qqbVar, okg.P)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:57:0x011d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.sac W(defpackage.dbi r7) {
        /*
            Method dump skipped, instruction units count: 323
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nyj.W(dbi):sac");
    }

    public Float X() {
        float fFloatValue = Float.valueOf(((c26) this.G).G).floatValue();
        float f = MTTypesetterKt.kLineSkipLimitMultiplier;
        g99 g99Var = g99.E;
        if (fFloatValue >= MTTypesetterKt.kLineSkipLimitMultiplier) {
            f = 100.0f;
            if (fFloatValue > 100.0f) {
                h99.k.getClass();
                dch.H(f99.b, 4, g99Var, new e26(1, fFloatValue), null, false, 56);
            }
            return Float.valueOf(fFloatValue);
        }
        h99.k.getClass();
        dch.H(f99.b, 4, g99Var, new e26(0, fFloatValue), null, false, 56);
        fFloatValue = f;
        return Float.valueOf(fFloatValue);
    }

    public void Y() throws IOException {
        String str = (String) this.F;
        if (((FileChannel) this.G) != null) {
            return;
        }
        try {
            File file = new File(str);
            File parentFile = file.getParentFile();
            if (parentFile != null) {
                parentFile.mkdirs();
            }
            FileChannel channel = new FileOutputStream(file).getChannel();
            this.G = channel;
            if (channel != null) {
                channel.lock();
            }
        } catch (Throwable th) {
            FileChannel fileChannel = (FileChannel) this.G;
            if (fileChannel != null) {
                fileChannel.close();
            }
            this.G = null;
            throw new IllegalStateException(ij0.j("Unable to lock file: '", str, "'."), th);
        }
    }

    public void Z() {
        Context context = (Context) this.F;
        try {
            context.getContentResolver().notifyChange(CalendarContract.Events.CONTENT_URI, null);
            context.getContentResolver().notifyChange(CalendarContract.Calendars.CONTENT_URI, null);
            context.getContentResolver().notifyChange(CalendarContract.Instances.CONTENT_URI, null);
            context.getContentResolver().notifyChange(CalendarContract.Reminders.CONTENT_URI, null);
        } catch (Exception e) {
            zfa.a.getClass();
            if (yfa.b()) {
                String strE = iuj.E(this);
                CopyOnWriteArrayList copyOnWriteArrayList = yfa.b;
                ArrayList arrayList = new ArrayList();
                for (Object obj : copyOnWriteArrayList) {
                    ((n30) ((zfa) obj)).getClass();
                    arrayList.add(obj);
                }
                if (arrayList.isEmpty()) {
                    return;
                }
                String strQ = sq6.q(zfa.a, e, "Failed to notify calendar changes: ");
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((n30) ((zfa) it.next())).b(sfa.ERROR, strE, strQ);
                }
            }
        }
    }

    @Override // defpackage.b4a
    public z3a a() {
        int iOrdinal = ((c4a) this.F).b().ordinal();
        if (iOrdinal == 0) {
            return z3a.E;
        }
        if (iOrdinal == 1) {
            return z3a.F;
        }
        if (iOrdinal == 2) {
            return z3a.G;
        }
        if (iOrdinal == 3) {
            return z3a.H;
        }
        if (iOrdinal == 4) {
            return z3a.I;
        }
        mr9.b();
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0076 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.qjc a0(defpackage.jx8 r15, defpackage.j8g r16) {
        /*
            Method dump skipped, instruction units count: 215
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nyj.a0(jx8, j8g):qjc");
    }

    @Override // defpackage.lp4
    public lj5 b(Set set) {
        set.getClass();
        rk5 rk5Var = ((o25) this.F).B;
        String str = ((o25) this.F).t;
        String str2 = ((o25) this.F).u;
        String str3 = ((o25) this.F).y;
        String strF = ((o25) this.F).p.f();
        int iD = ((o25) this.F).p.d();
        String str4 = ((o25) this.F).z;
        String str5 = ((o25) this.F).w;
        String str6 = ((o25) this.F).v;
        iuj iujVar = ((o25) this.F).l;
        iujVar.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jY = iujVar.y();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long nanos = timeUnit.toNanos(jCurrentTimeMillis);
        long nanos2 = timeUnit.toNanos(jY);
        long j = jY - jCurrentTimeMillis;
        wph wphVar = new wph(nanos, nanos2, timeUnit.toNanos(j), j);
        ghd ghdVar = new ghd(((o25) this.F).x);
        a1c a1cVarK = ((o25) this.F).j.k();
        t20 t20Var = ((o25) this.F).q;
        String strO = t20Var.o();
        String strG = t20Var.g();
        t26 t26VarZ = t20Var.z();
        String strU = t20Var.u();
        String strP = t20Var.p();
        String strQ = t20Var.q();
        String strX = t20Var.x();
        String strK = t20Var.k();
        String strL = t20Var.l();
        Integer numC = t20Var.c();
        t20 t20Var2 = ((o25) this.F).q;
        p26 p26Var = new p26(strO, strG, strU, t26VarZ, strP, strQ, strK, strX, strL, numC, new fea(t20Var2.n(), t20Var2.m(), t20Var2.j()), t20Var.e(), t20Var.y(), t20Var.r());
        xmi xmiVarR = ((o25) this.F).n.r();
        ((o25) this.F).o.getClass();
        l4i l4iVarM = ((o25) this.F).m.m();
        String str7 = ((o25) this.F).C;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String str8 = str7;
            String str9 = (String) it.next();
            rk5 rk5Var2 = rk5Var;
            qj5 qj5Var = (qj5) ((cd) this.G).F;
            str9.getClass();
            Map mapD = qj5Var.D(str9);
            if (!mapD.isEmpty()) {
                linkedHashMap.put(str9, mapD);
            }
            rk5Var = rk5Var2;
            str7 = str8;
        }
        return new lj5(rk5Var, str, str2, str3, strF, iD, str4, str6, str5, wphVar, ghdVar, a1cVarK, p26Var, xmiVarR, l4iVarM, str7, linkedHashMap);
    }

    public void b0() {
        try {
            ((FileLock) this.G).release();
            ((FileChannel) this.F).close();
        } catch (IOException e) {
            Log.e("CrossProcessLock", "encountered error while releasing, ignoring", e);
        }
    }

    @Override // defpackage.mc0
    public List c(a0 a0Var, b3 b3Var, int i) {
        pz1 pz1Var = (pz1) this.F;
        b3Var.getClass();
        sq6.a(i);
        if (b3Var instanceof usd) {
            pz1Var.getClass();
        } else {
            if (!(b3Var instanceof ctd)) {
                xh6.d("Unknown message: ", b3Var);
                return null;
            }
            int iF = sq6.F(i);
            if (iF != 1 && iF != 2 && iF != 3) {
                throw new IllegalStateException("Unsupported callable kind with property proto for receiver annotations: ".concat(ebh.H(i)).toString());
            }
            pz1Var.getClass();
        }
        lm6 lm6Var = lm6.E;
        ArrayList arrayList = new ArrayList(x44.y(lm6Var, 10));
        Iterator<E> it = lm6Var.iterator();
        while (it.hasNext()) {
            arrayList.add(((nyj) this.G).F((bsd) it.next(), (txb) a0Var.F));
        }
        return arrayList;
    }

    public void c0() {
        try {
            for (Account account : ((w72) this.G).a(null, null)) {
                Bundle bundle = new Bundle();
                bundle.putBoolean("force", true);
                bundle.putBoolean("expedited", true);
                ContentResolver.requestSync(account, "com.android.calendar", bundle);
            }
        } catch (Exception e) {
            zfa.a.getClass();
            if (yfa.b()) {
                String strE = iuj.E(this);
                CopyOnWriteArrayList copyOnWriteArrayList = yfa.b;
                ArrayList arrayList = new ArrayList();
                for (Object obj : copyOnWriteArrayList) {
                    ((n30) ((zfa) obj)).getClass();
                    arrayList.add(obj);
                }
                if (arrayList.isEmpty()) {
                    return;
                }
                String strQ = sq6.q(zfa.a, e, "Failed to request calendar sync: ");
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((n30) ((zfa) it.next())).b(sfa.ERROR, strE, strQ);
                }
            }
        }
    }

    @Override // defpackage.b4a
    public void d(v3a v3aVar) {
        v3aVar.getClass();
        l4a l4aVar = (l4a) ((HashMap) this.G).remove(v3aVar);
        if (l4aVar != null) {
            ((c4a) this.F).c(l4aVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00fa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object d0(defpackage.m7f r20, defpackage.ra4 r21, boolean r22) {
        /*
            Method dump skipped, instruction units count: 470
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nyj.d0(m7f, ra4, boolean):java.lang.Object");
    }

    @Override // defpackage.mc0
    public List e(a0 a0Var, psd psdVar) {
        a0Var.getClass();
        Iterable iterable = (List) psdVar.k(((pz1) this.F).h);
        if (iterable == null) {
            iterable = lm6.E;
        }
        Iterable iterable2 = iterable;
        ArrayList arrayList = new ArrayList(x44.y(iterable2, 10));
        Iterator it = iterable2.iterator();
        while (it.hasNext()) {
            arrayList.add(((nyj) this.G).F((bsd) it.next(), (txb) a0Var.F));
        }
        return arrayList;
    }

    public il4 e0(yr9 yr9Var, yrd yrdVar, txb txbVar) {
        yrdVar.getClass();
        txbVar.getClass();
        boolean zBooleanValue = on7.M.e(yrdVar.Q).booleanValue();
        xrd xrdVar = yrdVar.G;
        switch (xrdVar == null ? -1 : lc0.a[xrdVar.ordinal()]) {
            case 1:
                byte b = (byte) yrdVar.H;
                return zBooleanValue ? new kci(b) : new m22(b);
            case 2:
                return new ti2((char) yrdVar.H);
            case 3:
                short s = (short) yrdVar.H;
                return zBooleanValue ? new kci(s) : new i5g(s);
            case 4:
                int i = (int) yrdVar.H;
                return zBooleanValue ? new kci(i) : new i79(i);
            case 5:
                long j = yrdVar.H;
                return zBooleanValue ? new kci(j) : new ama(j);
            case 6:
                return new au1(yrdVar.I);
            case 7:
                return new au1(yrdVar.J);
            case 8:
                return new au1(yrdVar.H != 0);
            case 9:
                return new yrg(txbVar.getString(yrdVar.K));
            case 10:
                return new bm9(iv1.u(txbVar, yrdVar.L), yrdVar.P);
            case 11:
                return new mq6(iv1.u(txbVar, yrdVar.L), sxb.d(txbVar.getString(yrdVar.M)));
            case 12:
                bsd bsdVar = yrdVar.N;
                bsdVar.getClass();
                return new uc0(F(bsdVar, txbVar));
            case 13:
                List list = yrdVar.O;
                list.getClass();
                List<yrd> list2 = list;
                ArrayList arrayList = new ArrayList(x44.y(list2, 10));
                for (yrd yrdVar2 : list2) {
                    j7g j7gVarE = ((tqb) this.F).f().e();
                    yrdVar2.getClass();
                    arrayList.add(e0(j7gVarE, yrdVar2, txbVar));
                }
                return pyk.x0(yr9Var, arrayList);
            default:
                throw new IllegalStateException(("Unsupported annotation argument type: " + yrdVar.G + " (expected " + yr9Var + ')').toString());
        }
    }

    @Override // defpackage.d4f
    public boolean f(Object obj) {
        obj.getClass();
        float fFloatValue = X().floatValue();
        if (fFloatValue >= 100.0f) {
            return true;
        }
        if (fFloatValue <= MTTypesetterKt.kLineSkipLimitMultiplier) {
            return false;
        }
        long j = ((qci) ((n0) this.F).invoke(obj)).E * 1111111111111111111L;
        long j2 = -1;
        double dW = (mwa.W(-1L) * ((double) fFloatValue)) / 100.0d;
        if (Double.isNaN(dW) || dW <= 0.0d) {
            j2 = 0;
        } else if (dW < 1.8446744073709552E19d) {
            j2 = dW < 9.223372036854776E18d ? (long) dW : ((long) (dW - 9.223372036854776E18d)) - Long.MIN_VALUE;
        }
        return Long.compareUnsigned(j, j2) < 0;
    }

    public qjc f0(qjc qjcVar) {
        boolean z;
        be7 be7VarC = qjcVar.c();
        if (!ne5.g(nx8.f(qjcVar)) || ((mf8) this.G).b()) {
            z = false;
        } else {
            be7VarC.getClass();
            LinkedHashMap linkedHashMapT0 = sta.t0(be7VarC.a);
            efe efeVarD = nx8.d();
            Bitmap.Config config = Bitmap.Config.ARGB_8888;
            if (config != null) {
                linkedHashMapT0.put(efeVarD, config);
            } else {
                linkedHashMapT0.remove(efeVarD);
            }
            be7VarC = new be7(mwa.V(linkedHashMapT0));
            z = true;
        }
        return z ? qjc.a(qjcVar, be7VarC) : qjcVar;
    }

    @Override // defpackage.x82
    public Type g() {
        return (Type) this.F;
    }

    public void g0(lze lzeVar, Iterable iterable) {
        lzeVar.getClass();
        if (iterable == null) {
            return;
        }
        for (Object obj : iterable) {
            try {
                ((xn5) this.F).m0(lzeVar, obj);
            } catch (SQLException e) {
                C(e);
                ((sf5) this.G).I(lzeVar, obj);
            }
        }
    }

    @Override // defpackage.t4i
    public wg8 get() {
        RealBufferedSource realBufferedSource = ((y4e) this.G).H;
        if (!realBufferedSource.G) {
            TimeZone timeZone = blj.a;
            while (!realBufferedSource.F()) {
                realBufferedSource.skip(realBufferedSource.F.F);
            }
        }
        wg8 wg8VarH = ((y47) ((w47) this.F).e).h();
        if (wg8VarH != null) {
            return wg8VarH;
        }
        sz6.j("null trailers after exhausting response body?!");
        return null;
    }

    @Override // defpackage.br4
    public Object h(Object obj) {
        rqe rqeVar = (rqe) obj;
        rqeVar.getClass();
        efe efeVar = (efe) this.G;
        s06 s06Var = (s06) this.F;
        return ((bg9) efeVar.F).b(rqeVar.f(), s06Var);
    }

    @Override // defpackage.x82
    public Object i(fdc fdcVar) {
        Executor executor = (Executor) this.G;
        return executor == null ? fdcVar : new dq5(executor, fdcVar);
    }

    @Override // defpackage.mc0
    public ArrayList j(ntd ntdVar, txb txbVar) {
        ntdVar.getClass();
        txbVar.getClass();
        Iterable iterable = (List) ntdVar.k(((pz1) this.F).k);
        if (iterable == null) {
            iterable = lm6.E;
        }
        Iterable iterable2 = iterable;
        ArrayList arrayList = new ArrayList(x44.y(iterable2, 10));
        Iterator it = iterable2.iterator();
        while (it.hasNext()) {
            arrayList.add(((nyj) this.G).F((bsd) it.next(), txbVar));
        }
        return arrayList;
    }

    @Override // defpackage.h92
    public void k(u82 u82Var, oqe oqeVar) {
        ApiResult mf0Var;
        ClaudeApiError$AuthError claudeApiError$AuthError;
        vi3 vi3VarG;
        pf0 pf0Var = (pf0) this.F;
        try {
            mf0Var = sf5.i0(oqeVar, pf0Var.F, pf0Var.G);
        } catch (Exception e) {
            mf0Var = new mf0(e);
        }
        kie kieVarL0 = u82Var.l0();
        kieVarL0.getClass();
        knk.H(mf0Var, kieVarL0);
        q61 q61Var = pf0Var.H;
        if (q61Var != null) {
            lf0 lf0Var = mf0Var instanceof lf0 ? (lf0) mf0Var : null;
            if (lf0Var != null) {
                bj3 bj3VarB = lf0Var.b();
                if ((bj3VarB instanceof ClaudeApiError$AuthError) && ((vi3VarG = (claudeApiError$AuthError = (ClaudeApiError$AuthError) bj3VarB).getA()) == vi3.K || vi3VarG == vi3.I)) {
                    zfa.a.getClass();
                    if (yfa.b()) {
                        CopyOnWriteArrayList copyOnWriteArrayList = yfa.b;
                        ArrayList arrayList = new ArrayList();
                        for (Object obj : copyOnWriteArrayList) {
                            ((n30) ((zfa) obj)).getClass();
                            arrayList.add(obj);
                        }
                        if (!arrayList.isEmpty()) {
                            zfa.a.getClass();
                            String str = "Auth-eject error (" + vi3VarG + "); notifying. originalMessage: " + claudeApiError$AuthError.getD();
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                ((n30) ((zfa) it.next())).b(sfa.WARN, "AuthErrorWatcher", str);
                            }
                        }
                    }
                    vi3VarG.getClass();
                    q61Var.a.r(vi3VarG);
                }
            }
        }
        ((h92) this.G).k(pf0Var, oqe.a(mf0Var));
    }

    @Override // defpackage.b4a
    public void l(v3a v3aVar) {
        HashMap map = (HashMap) this.G;
        if (map.containsKey(v3aVar)) {
            sz6.j("Already subscribed");
            return;
        }
        z20 z20Var = new z20(v3aVar, new l80(this, 27, v3aVar));
        map.put(v3aVar, z20Var);
        ((c4a) this.F).a(z20Var);
    }

    @Override // defpackage.mc0
    public List m(a0 a0Var, b3 b3Var, int i, int i2, vtd vtdVar) {
        b3Var.getClass();
        sq6.a(i);
        Iterable iterable = (List) vtdVar.k(((pz1) this.F).j);
        if (iterable == null) {
            iterable = lm6.E;
        }
        Iterable iterable2 = iterable;
        ArrayList arrayList = new ArrayList(x44.y(iterable2, 10));
        Iterator it = iterable2.iterator();
        while (it.hasNext()) {
            arrayList.add(((nyj) this.G).F((bsd) it.next(), (txb) a0Var.F));
        }
        return arrayList;
    }

    @Override // defpackage.mc0
    public ArrayList n(std stdVar, txb txbVar) {
        stdVar.getClass();
        txbVar.getClass();
        Iterable iterable = (List) stdVar.k(((pz1) this.F).l);
        if (iterable == null) {
            iterable = lm6.E;
        }
        Iterable iterable2 = iterable;
        ArrayList arrayList = new ArrayList(x44.y(iterable2, 10));
        Iterator it = iterable2.iterator();
        while (it.hasNext()) {
            arrayList.add(((nyj) this.G).F((bsd) it.next(), txbVar));
        }
        return arrayList;
    }

    @Override // defpackage.dc0
    public Object o(a0 a0Var, ctd ctdVar, yr9 yr9Var) {
        ctdVar.getClass();
        return null;
    }

    @Override // defpackage.mc0
    public List p(a0 a0Var, ctd ctdVar) {
        ctdVar.getClass();
        ((pz1) this.F).getClass();
        lm6 lm6Var = lm6.E;
        ArrayList arrayList = new ArrayList(x44.y(lm6Var, 10));
        Iterator<E> it = lm6Var.iterator();
        while (it.hasNext()) {
            arrayList.add(((nyj) this.G).F((bsd) it.next(), (txb) a0Var.F));
        }
        return arrayList;
    }

    @Override // defpackage.h92
    public void q(u82 u82Var, Throwable th) {
        mf0 mf0Var = new mf0(th);
        kie kieVarL0 = u82Var.l0();
        kieVarL0.getClass();
        knk.H(mf0Var, kieVarL0);
        ((h92) this.G).k((pf0) this.F, oqe.a(mf0Var));
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004c A[Catch: all -> 0x009e, TRY_LEAVE, TryCatch #6 {all -> 0x009e, blocks: (B:20:0x0048, B:22:0x004c, B:25:0x005d, B:29:0x0064, B:31:0x006f, B:33:0x007a, B:32:0x0075, B:27:0x0061, B:28:0x0063, B:45:0x0096, B:46:0x009d, B:24:0x0058), top: B:69:0x0048, outer: #1, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0096 A[Catch: all -> 0x009e, TRY_ENTER, TryCatch #6 {all -> 0x009e, blocks: (B:20:0x0048, B:22:0x004c, B:25:0x005d, B:29:0x0064, B:31:0x006f, B:33:0x007a, B:32:0x0075, B:27:0x0061, B:28:0x0063, B:45:0x0096, B:46:0x009d, B:24:0x0058), top: B:69:0x0048, outer: #1, inners: #0 }] */
    @Override // defpackage.mze
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.lze r(java.lang.String r8) {
        /*
            Method dump skipped, instruction units count: 214
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nyj.r(java.lang.String):lze");
    }

    @Override // defpackage.dof
    public KSerializer s(pl9 pl9Var) {
        Object obj = ((rh3) this.G).get(ez1.I(pl9Var));
        obj.getClass();
        lwb lwbVar = (lwb) obj;
        Object c52Var = lwbVar.a.get();
        if (c52Var == null) {
            synchronized (lwbVar) {
                c52Var = lwbVar.a.get();
                if (c52Var == null) {
                    c52Var = new c52((KSerializer) ((bz7) this.F).invoke(pl9Var));
                    lwbVar.a = new SoftReference(c52Var);
                }
            }
        }
        return ((c52) c52Var).a;
    }

    @Override // defpackage.fsc
    public Object t(pl9 pl9Var, ArrayList arrayList) {
        Object hreVar;
        Object obj = ((rh3) this.G).get(ez1.I(pl9Var));
        obj.getClass();
        lwb lwbVar = (lwb) obj;
        Object escVar = lwbVar.a.get();
        if (escVar == null) {
            synchronized (lwbVar) {
                escVar = lwbVar.a.get();
                if (escVar == null) {
                    escVar = new esc();
                    lwbVar.a = new SoftReference(escVar);
                }
            }
        }
        esc escVar2 = (esc) escVar;
        ArrayList arrayList2 = new ArrayList(x44.y(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new ko9((eo9) it.next()));
        }
        ConcurrentHashMap concurrentHashMap = escVar2.a;
        Object obj2 = concurrentHashMap.get(arrayList2);
        if (obj2 == null) {
            try {
                hreVar = (KSerializer) ((pz7) this.F).invoke(pl9Var, arrayList);
            } catch (Throwable th) {
                hreVar = new hre(th);
            }
            jre jreVar = new jre(hreVar);
            Object objPutIfAbsent = concurrentHashMap.putIfAbsent(arrayList2, jreVar);
            obj2 = objPutIfAbsent == null ? jreVar : objPutIfAbsent;
        }
        return ((jre) obj2).E;
    }

    public String toString() {
        switch (this.E) {
            case 11:
                StringBuilder sb = new StringBuilder("ChangeList(changes=[");
                wwb wwbVar = (wwb) this.F;
                Object[] objArr = wwbVar.E;
                int i = wwbVar.G;
                for (int i2 = 0; i2 < i; i2++) {
                    eh2 eh2Var = (eh2) objArr[i2];
                    sb.append("(" + eh2Var.b() + ',' + eh2Var.a() + ")->(" + eh2Var.d() + ',' + eh2Var.c() + ')');
                    if (i2 < ((wwb) this.F).G - 1) {
                        sb.append(", ");
                    }
                }
                sb.append("])");
                return sb.toString();
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                return ((HashMap) this.F).toString();
            default:
                return super.toString();
        }
    }

    @Override // defpackage.mc0
    public List u(a0 a0Var, ctd ctdVar) {
        ctdVar.getClass();
        ((pz1) this.F).getClass();
        lm6 lm6Var = lm6.E;
        ArrayList arrayList = new ArrayList(x44.y(lm6Var, 10));
        Iterator<E> it = lm6Var.iterator();
        while (it.hasNext()) {
            arrayList.add(((nyj) this.G).F((bsd) it.next(), (txb) a0Var.F));
        }
        return arrayList;
    }

    @Override // defpackage.dc0
    public Object v(a0 a0Var, ctd ctdVar, yr9 yr9Var) {
        ctdVar.getClass();
        yrd yrdVar = (yrd) uik.i(ctdVar, ((pz1) this.F).i);
        if (yrdVar == null) {
            return null;
        }
        return ((nyj) this.G).e0(yr9Var, yrdVar, (txb) a0Var.F);
    }

    @Override // defpackage.mc0
    public List w(a0 a0Var, b3 b3Var, int i) {
        List list;
        pz1 pz1Var = (pz1) this.F;
        b3Var.getClass();
        sq6.a(i);
        if (b3Var instanceof gsd) {
            list = (List) ((gsd) b3Var).k(pz1Var.b);
        } else if (b3Var instanceof usd) {
            list = (List) ((usd) b3Var).k(pz1Var.d);
        } else {
            if (!(b3Var instanceof ctd)) {
                xh6.d("Unknown message: ", b3Var);
                return null;
            }
            int iF = sq6.F(i);
            if (iF == 1) {
                list = (List) ((ctd) b3Var).k(pz1Var.e);
            } else if (iF == 2) {
                list = (List) ((ctd) b3Var).k(pz1Var.f);
            } else {
                if (iF != 3) {
                    sz6.j("Unsupported callable kind with property proto");
                    return null;
                }
                list = (List) ((ctd) b3Var).k(pz1Var.g);
            }
        }
        if (list == null) {
            list = lm6.E;
        }
        List list2 = list;
        ArrayList arrayList = new ArrayList(x44.y(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((nyj) this.G).F((bsd) it.next(), (txb) a0Var.F));
        }
        return arrayList;
    }

    @Override // defpackage.mc0
    public ArrayList y(cud cudVar) {
        cudVar.getClass();
        Iterable iterable = (List) cudVar.I.k(((pz1) this.F).c);
        if (iterable == null) {
            iterable = lm6.E;
        }
        Iterable iterable2 = iterable;
        ArrayList arrayList = new ArrayList(x44.y(iterable2, 10));
        Iterator it = iterable2.iterator();
        while (it.hasNext()) {
            arrayList.add(((nyj) this.G).F((bsd) it.next(), (txb) cudVar.F));
        }
        return arrayList;
    }

    public void z(eh2 eh2Var, int i, int i2, int i3) {
        int iC;
        wwb wwbVar = (wwb) this.G;
        int i4 = wwbVar.G;
        if (i4 == 0) {
            iC = 0;
        } else if (i4 == 0) {
            pmf.h("MutableVector is empty.");
            return;
        } else {
            eh2 eh2Var2 = (eh2) wwbVar.E[i4 - 1];
            iC = eh2Var2.c() - eh2Var2.a();
        }
        if (eh2Var == null) {
            int i5 = i - iC;
            eh2Var = new eh2(i, i2 + i3, i5, (i2 - i) + i5);
        } else {
            if (eh2Var.d() > i) {
                eh2Var.h(i);
                eh2Var.f(i);
            }
            if (i2 > eh2Var.c()) {
                int iC2 = eh2Var.c() - eh2Var.a();
                eh2Var.g(i2);
                eh2Var.e(i2 - iC2);
            }
            eh2Var.g(eh2Var.c() + i3);
        }
        ((wwb) this.G).b(eh2Var);
    }

    public nyj(Context context) {
        this.E = 0;
        this.G = new AtomicLong(-1L);
        this.F = new snj(context, snj.k, new ech("module:cronet_dynamite"), d88.c);
    }

    public nyj(String str, iv1 iv1Var, lz1 lz1Var) {
        this.E = 5;
        this.G = str;
        this.F = iv1Var;
    }

    public nyj(y50 y50Var, unb unbVar) {
        this.E = 21;
        unbVar.getClass();
        this.F = y50Var;
        this.G = unbVar;
    }

    public nyj(h99 h99Var, efe efeVar) {
        this.E = 20;
        h99Var.getClass();
        efeVar.getClass();
        this.F = h99Var;
        this.G = efeVar;
    }

    public nyj() {
        this.E = 1;
        this.F = new Object();
        this.G = new qo0();
    }

    public nyj(di5 di5Var) {
        this.E = 23;
        this.F = di5Var;
        this.G = new ConcurrentHashMap();
    }

    public nyj(c4a c4aVar) {
        this.E = 27;
        this.F = c4aVar;
        this.G = new HashMap();
    }

    public nyj(rx7 rx7Var) {
        this.E = 29;
        this.F = rx7Var;
        this.G = new CopyOnWriteArrayList();
    }

    public /* synthetic */ nyj(Object obj, int i, Object obj2) {
        this.E = i;
        this.F = obj;
        this.G = obj2;
    }

    public nyj(tqb tqbVar, dpf dpfVar, pz1 pz1Var) {
        this.E = 3;
        tqbVar.getClass();
        pz1Var.getClass();
        this.F = pz1Var;
        this.G = new nyj(tqbVar, dpfVar);
    }

    public nyj(String str) {
        this.E = 28;
        this.F = str.concat(".lck");
    }

    public nyj(n0 n0Var, float f) {
        this.E = 25;
        c26 c26Var = new c26(0, f);
        this.F = n0Var;
        this.G = c26Var;
    }

    public nyj(tqb tqbVar, dpf dpfVar) {
        this.E = 4;
        tqbVar.getClass();
        dpfVar.getClass();
        this.F = tqbVar;
        this.G = dpfVar;
    }

    public nyj(r4e r4eVar) {
        Object zl4Var;
        this.E = 2;
        this.F = r4eVar;
        if (of8.a) {
            zl4Var = new ez8(false);
        } else {
            int i = Build.VERSION.SDK_INT;
            if (i != 26 && i != 27) {
                zl4Var = new ez8(true);
            } else {
                zl4Var = new zl4(11);
            }
        }
        this.G = zl4Var;
    }

    public nyj(String str, h99 h99Var) {
        this.E = 19;
        this.F = h99Var;
        this.G = str;
    }

    public nyj(bz7 bz7Var) {
        this.E = 12;
        this.F = bz7Var;
        this.G = new rh3();
    }

    public nyj(er9 er9Var) {
        this.E = 16;
        this.F = er9Var;
        this.G = new ArrayList();
    }

    public nyj(yue yueVar, mze mzeVar) {
        this.E = 7;
        mzeVar.getClass();
        this.G = yueVar;
        this.F = mzeVar;
    }

    public nyj(pz7 pz7Var) {
        this.E = 13;
        this.F = pz7Var;
        this.G = new rh3();
    }
}
