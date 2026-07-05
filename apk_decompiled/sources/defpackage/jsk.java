package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import com.anthropic.claude.api.experience.ExperienceToggle;
import com.anthropic.claude.api.tasks.TaskSessionEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.TreeSet;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Function;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* JADX INFO: loaded from: classes.dex */
public final class jsk extends yak {
    public af7 G;
    public qb5 H;
    public final CopyOnWriteArraySet I;
    public boolean J;
    public final AtomicReference K;
    public final Object L;
    public boolean M;
    public int N;
    public cuk O;
    public PriorityQueue P;
    public boolean Q;
    public qrk R;
    public final AtomicLong S;
    public long T;
    public final w9h U;
    public boolean V;
    public cuk W;
    public ttk X;
    public uuk Y;
    public final w9h Z;

    public jsk(umk umkVar) {
        super(umkVar);
        this.I = new CopyOnWriteArraySet();
        this.L = new Object();
        this.M = false;
        this.N = 1;
        this.V = true;
        this.Z = new w9h(this);
        this.K = new AtomicReference();
        this.R = qrk.c;
        this.T = -1L;
        this.S = new AtomicLong(0L);
        this.U = new w9h(umkVar);
    }

    public static void d1(jsk jskVar, qrk qrkVar, long j, boolean z, boolean z2) {
        int i = qrkVar.b;
        jskVar.K0();
        umk umkVar = (umk) jskVar.E;
        jskVar.O0();
        qrk qrkVarV0 = jskVar.I0().V0();
        if (j <= jskVar.T && qrk.h(qrkVarV0.b, i)) {
            jskVar.b0().P.c("Dropped out-of-date consent setting, proposed settings", qrkVar);
            return;
        }
        vik vikVarI0 = jskVar.I0();
        vikVarI0.K0();
        if (!vikVarI0.P0(i)) {
            jskVar.b0().P.c("Lower precedence consent source ignored, proposed source", Integer.valueOf(i));
            return;
        }
        SharedPreferences.Editor editorEdit = vikVarI0.T0().edit();
        editorEdit.putString("consent_settings", qrkVar.o());
        editorEdit.putInt("consent_source", i);
        editorEdit.apply();
        jskVar.b0().R.c("Setting storage consent(FE)", qrkVar);
        jskVar.T = j;
        hyk hykVarN = umkVar.n();
        hykVarN.K0();
        hykVarN.O0();
        if (hykVarN.a1() && hykVarN.J0().O1() < 241200) {
            umkVar.n().V0(z);
        } else {
            hyk hykVarN2 = umkVar.n();
            hykVarN2.K0();
            hykVarN2.O0();
            x1l.a();
            umk umkVar2 = (umk) hykVarN2.E;
            if (!umkVar2.K.X0(null, zvj.a1) && z) {
                umkVar2.l().T0();
            }
            hykVarN2.R0(new gyk(hykVarN2));
        }
        if (z2) {
            umkVar.n().S0(new AtomicReference());
        }
    }

    public static void e1(jsk jskVar, qrk qrkVar, qrk qrkVar2) {
        x1l.a();
        umk umkVar = (umk) jskVar.E;
        if (umkVar.K.X0(null, zvj.a1)) {
            return;
        }
        ork orkVar = ork.ANALYTICS_STORAGE;
        ork orkVar2 = ork.AD_STORAGE;
        ork[] orkVarArr = {orkVar, orkVar2};
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= 2) {
                break;
            }
            ork orkVar3 = orkVarArr[i];
            if (!qrkVar2.i(orkVar3) && qrkVar.i(orkVar3)) {
                z = true;
                break;
            }
            i++;
        }
        boolean zK = qrkVar.k(qrkVar2, orkVar, orkVar2);
        if (z || zK) {
            umkVar.j().T0();
        }
    }

    @Override // defpackage.yak
    public final boolean Q0() {
        return false;
    }

    public final void R0(long j, Bundle bundle, String str, String str2) {
        K0();
        V0(str, str2, j, bundle, true, this.H == null || h1l.P1(str2), true);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void S0(long r11, java.lang.Object r13, java.lang.String r14, java.lang.String r15) {
        /*
            Method dump skipped, instruction units count: 212
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jsk.S0(long, java.lang.Object, java.lang.String, java.lang.String):void");
    }

    public final void T0(long j, boolean z) {
        umk umkVar = (umk) this.E;
        K0();
        O0();
        b0().Q.b("Resetting analytics data (FE)");
        yzk yzkVarN0 = N0();
        yzkVarN0.K0();
        e5e e5eVar = yzkVarN0.J;
        ((uuk) e5eVar.G).a();
        umk umkVar2 = (umk) ((yzk) e5eVar.H).E;
        if (umkVar2.K.X0(null, zvj.e1)) {
            umkVar2.R.getClass();
            e5eVar.E = SystemClock.elapsedRealtime();
        } else {
            e5eVar.E = 0L;
        }
        e5eVar.F = e5eVar.E;
        umkVar.j().T0();
        boolean zE = umkVar.e();
        vik vikVarI0 = I0();
        vikVarI0.K.b(j);
        if (!TextUtils.isEmpty(vikVarI0.I0().a0.d())) {
            vikVarI0.a0.h(null);
        }
        vikVarI0.U.b(0L);
        vikVarI0.V.b(0L);
        Boolean boolV0 = ((umk) vikVarI0.E).K.V0("firebase_analytics_collection_deactivated");
        if (boolV0 == null || !boolV0.booleanValue()) {
            vikVarI0.R0(!zE);
        }
        vikVarI0.b0.h(null);
        vikVarI0.c0.b(0L);
        vikVarI0.d0.X(null);
        if (z) {
            hyk hykVarN = umkVar.n();
            hykVarN.K0();
            hykVarN.O0();
            u1l u1lVarD1 = hykVarN.d1(false);
            ((umk) hykVarN.E).l().T0();
            hykVarN.R0(new ryk(hykVarN, u1lVarD1, 0));
        }
        N0().I.a();
        this.V = !zE;
    }

    public final void U0(Bundle bundle, int i, long j) throws Throwable {
        Object obj;
        String string;
        O0();
        qrk qrkVar = qrk.c;
        ork[] orkVarArr = srk.STORAGE.E;
        int length = orkVarArr.length;
        int i2 = 0;
        while (true) {
            obj = null;
            if (i2 >= length) {
                break;
            }
            ork orkVar = orkVarArr[i2];
            if (bundle.containsKey(orkVar.E) && (string = bundle.getString(orkVar.E)) != null) {
                if (string.equals("granted")) {
                    obj = Boolean.TRUE;
                } else if (string.equals("denied")) {
                    obj = Boolean.FALSE;
                }
                if (obj == null) {
                    obj = string;
                    break;
                }
            }
            i2++;
        }
        if (obj != null) {
            b0().O.c("Ignoring invalid consent setting", obj);
            b0().O.b("Valid consent values are 'granted', 'denied'");
        }
        boolean zV0 = O().V0();
        qrk qrkVarE = qrk.e(i, bundle);
        if (qrkVarE.q()) {
            c1(qrkVarE, j, zV0);
        }
        buj bujVarB = buj.b(i, bundle);
        Iterator it = bujVarB.e.values().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            } else if (((mrk) it.next()) != mrk.UNINITIALIZED) {
                a1(bujVarB, zV0);
                break;
            }
        }
        Boolean boolA = buj.a(bundle);
        if (boolA != null) {
            Y0(i == -30 ? "tcf" : "app", "allow_personalized_ads", boolA.toString(), false);
        }
    }

    public final void V0(String str, String str2, long j, Bundle bundle, boolean z, boolean z2, boolean z3) {
        boolean zB;
        jsk jskVar;
        long j2;
        Bundle[] bundleArr;
        ql8 ql8Var;
        boolean z4;
        long j3;
        boolean zS0;
        Bundle[] bundleArr2;
        int length;
        dgj.s(str);
        dgj.v(bundle);
        K0();
        O0();
        umk umkVar = (umk) this.E;
        boolean zE = umkVar.e();
        Context context = umkVar.E;
        ogk ogkVar = umkVar.Q;
        ql8 ql8Var2 = umkVar.R;
        if (!zE) {
            b0().Q.b("Event not sent since app measurement is disabled");
            return;
        }
        List list = umkVar.j().M;
        if (list != null && !list.contains(str2)) {
            b0().Q.a(str2, str, "Dropping non-safelisted event. event name, origin");
            return;
        }
        if (!this.J) {
            this.J = true;
            try {
                try {
                    (!umkVar.I ? Class.forName("com.google.android.gms.tagmanager.TagManagerService", true, context.getClassLoader()) : Class.forName("com.google.android.gms.tagmanager.TagManagerService")).getDeclaredMethod("initialize", Context.class).invoke(null, context);
                } catch (Exception e) {
                    b0().M.c("Failed to invoke Tag Manager's initialize() method", e);
                }
            } catch (ClassNotFoundException unused) {
                b0().P.b("Tag Manager is not found and thus will not be used");
            }
        }
        if ("_cmp".equals(str2) && bundle.containsKey("gclid")) {
            String string = bundle.getString("gclid");
            ql8Var2.getClass();
            S0(System.currentTimeMillis(), string, "auto", "_lgclid");
        }
        if (z && !h1l.N[0].equals(str2)) {
            J0().d1(bundle, I0().d0.W());
        }
        w9h w9hVar = this.Z;
        if (!z3 && !"_iap".equals(str2)) {
            h1l h1lVar = umkVar.P;
            umk.c(h1lVar);
            int i = 2;
            if (h1lVar.K1("event", str2)) {
                if (!h1lVar.z1("event", v40.k, v40.l, str2)) {
                    i = 13;
                } else if (h1lVar.u1("event", 40, str2)) {
                    i = 0;
                }
            }
            if (i != 0) {
                b0().L.c("Invalid public event name. Event will not be logged (FE)", ogkVar.b(str2));
                umkVar.o();
                String strY0 = h1l.Y0(str2, 40, true);
                length = str2 != null ? str2.length() : 0;
                umkVar.o();
                h1l.o1(w9hVar, null, i, "_ev", strY0, length);
                return;
            }
        }
        xxk xxkVarS0 = M0().S0(false);
        if (xxkVarS0 != null && !bundle.containsKey("_sc")) {
            xxkVarS0.d = true;
        }
        h1l.n1(xxkVarS0, bundle, z && !z3);
        boolean zEquals = "am".equals(str);
        boolean zP1 = h1l.P1(str2);
        if (z && this.H != null && !zP1 && !zEquals) {
            b0().Q.a(ogkVar.b(str2), ogkVar.a(bundle), "Passing event to registered event handler (FE)");
            dgj.v(this.H);
            this.H.p(j, bundle, str, str2);
            return;
        }
        if (umkVar.f()) {
            int iO0 = J0().O0(str2);
            if (iO0 != 0) {
                b0().L.c("Invalid event name. Event will not be logged (FE)", ogkVar.b(str2));
                J0();
                String strY02 = h1l.Y0(str2, 40, true);
                length = str2 != null ? str2.length() : 0;
                umkVar.o();
                h1l.o1(w9hVar, null, iO0, "_ev", strY02, length);
                return;
            }
            Bundle bundleU0 = J0().U0(str2, bundle, Collections.unmodifiableList(Arrays.asList("_o", "_sn", "_sc", "_si")), z3);
            dgj.v(bundleU0);
            if (M0().S0(false) != null && "_ae".equals(str2)) {
                e5e e5eVar = N0().J;
                ((umk) ((yzk) e5eVar.H).E).R.getClass();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                long j4 = jElapsedRealtime - e5eVar.F;
                e5eVar.F = jElapsedRealtime;
                if (j4 > 0) {
                    J0().c1(bundleU0, j4);
                }
            }
            if (!"auto".equals(str) && "_ssr".equals(str2)) {
                h1l h1lVarJ0 = J0();
                String string2 = bundleU0.getString("_ffr");
                int i2 = zrg.a;
                if (string2 == null || string2.trim().isEmpty()) {
                    string2 = null;
                } else if (string2 != null) {
                    string2 = string2.trim();
                }
                if (Objects.equals(string2, h1lVarJ0.I0().a0.d())) {
                    h1lVarJ0.b0().Q.b("Not logging duplicate session_start_with_rollout event");
                    return;
                }
                h1lVarJ0.I0().a0.h(string2);
            } else if ("_ae".equals(str2)) {
                String strD = J0().I0().a0.d();
                if (!TextUtils.isEmpty(strD)) {
                    bundleU0.putString("_ffr", strD);
                }
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(bundleU0);
            if (umkVar.K.X0(null, zvj.M0)) {
                yzk yzkVarN0 = N0();
                yzkVarN0.K0();
                zB = yzkVarN0.H;
            } else {
                zB = I0().X.b();
            }
            if (I0().U.a() <= 0) {
                jskVar = this;
                j2 = 0;
                bundleArr = null;
                ql8Var = ql8Var2;
                z4 = zEquals;
                j3 = j;
            } else if (I0().Q0(j) && zB) {
                b0().R.b("Current session is expired, remove the session number, ID, and engagement time");
                ql8Var2.getClass();
                ql8Var = ql8Var2;
                z4 = zEquals;
                j2 = 0;
                bundleArr = null;
                j3 = j;
                S0(System.currentTimeMillis(), null, "auto", "_sid");
                ql8Var.getClass();
                S0(System.currentTimeMillis(), null, "auto", "_sno");
                ql8Var.getClass();
                S0(System.currentTimeMillis(), null, "auto", "_se");
                jskVar = this;
                jskVar.I0().V.b(0L);
            } else {
                jskVar = this;
                ql8Var = ql8Var2;
                z4 = zEquals;
                j2 = 0;
                bundleArr = null;
                j3 = j;
            }
            if (bundleU0.getLong("extend_session", j2) == 1) {
                jskVar.b0().R.b("EXTEND_SESSION param attached: initiate a new session or extend the current active session");
                yzk yzkVar = umkVar.O;
                umk.b(yzkVar);
                yzkVar.I.f(j3);
            }
            ArrayList arrayList2 = new ArrayList(bundleU0.keySet());
            Collections.sort(arrayList2);
            int size = arrayList2.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList2.get(i3);
                i3++;
                String str3 = (String) obj;
                if (str3 != null) {
                    jskVar.J0();
                    Object obj2 = bundleU0.get(str3);
                    if (obj2 instanceof Bundle) {
                        bundleArr2 = new Bundle[]{(Bundle) obj2};
                    } else if (obj2 instanceof Parcelable[]) {
                        Parcelable[] parcelableArr = (Parcelable[]) obj2;
                        bundleArr2 = (Bundle[]) Arrays.copyOf(parcelableArr, parcelableArr.length, Bundle[].class);
                    } else if (obj2 instanceof ArrayList) {
                        ArrayList arrayList3 = (ArrayList) obj2;
                        bundleArr2 = (Bundle[]) arrayList3.toArray(new Bundle[arrayList3.size()]);
                    } else {
                        bundleArr2 = bundleArr;
                    }
                    if (bundleArr2 != null) {
                        bundleU0.putParcelableArray(str3, bundleArr2);
                    }
                }
            }
            int i4 = 0;
            while (i4 < arrayList.size()) {
                Bundle bundleT0 = (Bundle) arrayList.get(i4);
                String str4 = i4 != 0 ? "_ep" : str2;
                bundleT0.putString("_o", str);
                if (z2) {
                    bundleT0 = jskVar.J0().T0(bundleT0);
                }
                Bundle bundle2 = bundleT0;
                ArrayList arrayList4 = arrayList;
                rvj rvjVar = new rvj(str4, new avj(bundle2), str, j3);
                hyk hykVarN = umkVar.n();
                hykVarN.getClass();
                hykVarN.K0();
                hykVarN.O0();
                ggk ggkVarL = ((umk) hykVarN.E).l();
                ggkVarL.getClass();
                Parcel parcelObtain = Parcel.obtain();
                rvjVar.writeToParcel(parcelObtain, 0);
                byte[] bArrMarshall = parcelObtain.marshall();
                parcelObtain.recycle();
                if (bArrMarshall.length > 131072) {
                    ggkVarL.b0().K.b("Event is too long for local database. Sending event directly to service");
                    zS0 = false;
                } else {
                    zS0 = ggkVarL.S0(bArrMarshall, 0);
                }
                hykVarN.R0(new ezk(hykVarN, hykVarN.d1(true), zS0, rvjVar));
                if (!z4) {
                    Iterator it = jskVar.I.iterator();
                    while (it.hasNext()) {
                        ((ck0) it.next()).a(j, new Bundle(bundle2), str, str2);
                    }
                }
                i4++;
                arrayList = arrayList4;
                j3 = j;
            }
            if (jskVar.M0().S0(false) == null || !"_ae".equals(str2)) {
                return;
            }
            yzk yzkVarN02 = jskVar.N0();
            ql8Var.getClass();
            yzkVarN02.J.j(SystemClock.elapsedRealtime(), true, true);
        }
    }

    public final void W0(String str, String str2, Bundle bundle) {
        ((umk) this.E).R.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        dgj.s(str);
        Bundle bundle2 = new Bundle();
        bundle2.putString("name", str);
        bundle2.putLong("creation_timestamp", jCurrentTimeMillis);
        if (str2 != null) {
            bundle2.putString("expired_event_name", str2);
            bundle2.putBundle("expired_event_params", bundle);
        }
        O().T0(new jtk(this, bundle2, 1));
    }

    public final void X0(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) {
        if (str == null) {
            str = "app";
        }
        String str3 = str;
        Bundle bundle2 = bundle == null ? new Bundle() : bundle;
        if (!Objects.equals(str2, "screen_view")) {
            boolean z3 = !z2 || this.H == null || h1l.P1(str2);
            Bundle bundle3 = new Bundle(bundle2);
            for (String str4 : bundle3.keySet()) {
                Object obj = bundle3.get(str4);
                if (obj instanceof Bundle) {
                    bundle3.putBundle(str4, new Bundle((Bundle) obj));
                } else if (obj instanceof Parcelable[]) {
                    Parcelable[] parcelableArr = (Parcelable[]) obj;
                    for (int i = 0; i < parcelableArr.length; i++) {
                        if (parcelableArr[i] instanceof Bundle) {
                            parcelableArr[i] = new Bundle((Bundle) parcelableArr[i]);
                        }
                    }
                } else if (obj instanceof List) {
                    List list = (List) obj;
                    for (int i2 = 0; i2 < list.size(); i2++) {
                        Object obj2 = list.get(i2);
                        if (obj2 instanceof Bundle) {
                            list.set(i2, new Bundle((Bundle) obj2));
                        }
                    }
                }
            }
            O().T0(new evk(this, str3, str2, j, bundle3, z2, z3, z));
            return;
        }
        vxk vxkVarM0 = M0();
        synchronized (vxkVarM0.P) {
            try {
                if (!vxkVarM0.O) {
                    vxkVarM0.b0().O.b("Cannot log screen view event when the app is in the background.");
                    return;
                }
                String string = bundle2.getString("screen_name");
                if (string != null && (string.length() <= 0 || string.length() > ((umk) vxkVarM0.E).K.M0(null, false))) {
                    vxkVarM0.b0().O.c("Invalid screen name length for screen view. Length", Integer.valueOf(string.length()));
                    return;
                }
                String string2 = bundle2.getString("screen_class");
                if (string2 != null && (string2.length() <= 0 || string2.length() > ((umk) vxkVarM0.E).K.M0(null, false))) {
                    vxkVarM0.b0().O.c("Invalid screen class length for screen view. Length", Integer.valueOf(string2.length()));
                    return;
                }
                if (string2 == null) {
                    Activity activity = vxkVarM0.K;
                    string2 = activity != null ? vxkVarM0.R0(activity.getClass()) : "Activity";
                }
                String str5 = string2;
                xxk xxkVar = vxkVarM0.G;
                if (vxkVarM0.L && xxkVar != null) {
                    vxkVarM0.L = false;
                    boolean zEquals = Objects.equals(xxkVar.b, str5);
                    boolean zEquals2 = Objects.equals(xxkVar.a, string);
                    if (zEquals && zEquals2) {
                        vxkVarM0.b0().O.b("Ignoring call to log screen view event with duplicate parameters.");
                        return;
                    }
                }
                vxkVarM0.b0().R.a(string == null ? "null" : string, str5, "Logging screen view with name, class");
                xxk xxkVar2 = vxkVarM0.G == null ? vxkVarM0.H : vxkVarM0.G;
                xxk xxkVar3 = new xxk(string, str5, vxkVarM0.J0().U1(), true, j);
                vxkVarM0.G = xxkVar3;
                vxkVarM0.H = xxkVar2;
                vxkVarM0.M = xxkVar3;
                ((umk) vxkVarM0.E).R.getClass();
                vxkVarM0.O().T0(new a3i(vxkVarM0, bundle2, xxkVar3, xxkVar2, SystemClock.elapsedRealtime(), 3));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void Y0(String str, String str2, Object obj, boolean z) {
        ((umk) this.E).R.getClass();
        Z0(str, str2, obj, z, System.currentTimeMillis());
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Z0(java.lang.String r13, java.lang.String r14, java.lang.Object r15, boolean r16, long r17) {
        /*
            r12 = this;
            java.lang.Object r2 = r12.E
            umk r2 = (defpackage.umk) r2
            if (r13 != 0) goto L9
            java.lang.String r4 = "app"
            goto La
        L9:
            r4 = r13
        La:
            r5 = 0
            r6 = 24
            if (r16 == 0) goto L18
            h1l r7 = r12.J0()
            int r7 = r7.D1(r14)
            goto L3b
        L18:
            h1l r7 = r12.J0()
            java.lang.String r8 = "user property"
            boolean r9 = r7.K1(r8, r14)
            r10 = 6
            if (r9 != 0) goto L27
        L25:
            r7 = r10
            goto L3b
        L27:
            java.lang.String[] r9 = defpackage.tik.c
            r11 = 0
            boolean r9 = r7.z1(r8, r9, r11, r14)
            if (r9 != 0) goto L33
            r7 = 15
            goto L3b
        L33:
            boolean r7 = r7.u1(r8, r6, r14)
            if (r7 != 0) goto L3a
            goto L25
        L3a:
            r7 = r5
        L3b:
            w9h r8 = r12.Z
            r9 = 1
            if (r7 == 0) goto L5f
            r12.J0()
            java.lang.String r0 = defpackage.h1l.Y0(r14, r6, r9)
            if (r14 == 0) goto L4d
            int r5 = r14.length()
        L4d:
            r2.o()
            java.lang.String r1 = "_ev"
            r2 = 0
            r16 = r0
            r15 = r1
            r13 = r2
            r17 = r5
            r14 = r7
            r12 = r8
            defpackage.h1l.o1(r12, r13, r14, r15, r16, r17)
            return
        L5f:
            r7 = r8
            if (r15 == 0) goto Lb3
            h1l r8 = r12.J0()
            int r8 = r8.P0(r14, r15)
            if (r8 == 0) goto L95
            r12.J0()
            java.lang.String r1 = defpackage.h1l.Y0(r14, r6, r9)
            boolean r3 = r15 instanceof java.lang.String
            if (r3 != 0) goto L7b
            boolean r3 = r15 instanceof java.lang.CharSequence
            if (r3 == 0) goto L83
        L7b:
            java.lang.String r0 = java.lang.String.valueOf(r15)
            int r5 = r0.length()
        L83:
            r2.o()
            java.lang.String r0 = "_ev"
            r2 = 0
            r15 = r0
            r16 = r1
            r13 = r2
            r17 = r5
            r12 = r7
            r14 = r8
            defpackage.h1l.o1(r12, r13, r14, r15, r16, r17)
            return
        L95:
            h1l r2 = r12.J0()
            java.lang.Object r0 = r2.J1(r14, r15)
            if (r0 == 0) goto Lb2
            wlk r8 = r12.O()
            r2 = r4
            r4 = r0
            a3i r0 = new a3i
            r7 = 2
            r1 = r12
            r3 = r14
            r5 = r17
            r0.<init>(r1, r2, r3, r4, r5, r7)
            r8.T0(r0)
        Lb2:
            return
        Lb3:
            r2 = r4
            wlk r8 = r12.O()
            a3i r0 = new a3i
            r7 = 2
            r4 = 0
            r1 = r12
            r3 = r14
            r5 = r17
            r0.<init>(r1, r2, r3, r4, r5, r7)
            r8.T0(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jsk.Z0(java.lang.String, java.lang.String, java.lang.Object, boolean, long):void");
    }

    public final void a1(buj bujVar, boolean z) throws Throwable {
        s2k s2kVar = new s2k(this, bujVar, false, 21);
        if (!z) {
            O().T0(s2kVar);
        } else {
            K0();
            s2kVar.run();
        }
    }

    public final void b1(qrk qrkVar) {
        K0();
        boolean z = (qrkVar.i(ork.ANALYTICS_STORAGE) && qrkVar.i(ork.AD_STORAGE)) || ((umk) this.E).n().Z0();
        umk umkVar = (umk) this.E;
        wlk wlkVar = umkVar.N;
        umk.d(wlkVar);
        wlkVar.K0();
        if (z != umkVar.h0) {
            umk umkVar2 = (umk) this.E;
            wlk wlkVar2 = umkVar2.N;
            umk.d(wlkVar2);
            wlkVar2.K0();
            umkVar2.h0 = z;
            vik vikVarI0 = I0();
            vikVarI0.K0();
            Boolean boolValueOf = vikVarI0.T0().contains("measurement_enabled_from_api") ? Boolean.valueOf(vikVarI0.T0().getBoolean("measurement_enabled_from_api", true)) : null;
            if (!z || boolValueOf == null || boolValueOf.booleanValue()) {
                f1(false, Boolean.valueOf(z));
            }
        }
    }

    public final void c1(qrk qrkVar, long j, boolean z) {
        qrk qrkVar2;
        boolean z2;
        qrk qrkVarJ;
        boolean zK;
        int i;
        boolean z3;
        O0();
        int i2 = qrkVar.b;
        l1l.a();
        if (((umk) this.E).K.X0(null, zvj.W0)) {
            if (i2 != -10) {
                mrk mrkVar = (mrk) qrkVar.a.get(ork.AD_STORAGE);
                if (mrkVar == null) {
                    mrkVar = mrk.UNINITIALIZED;
                }
                mrk mrkVar2 = mrk.UNINITIALIZED;
                if (mrkVar == mrkVar2) {
                    mrk mrkVar3 = (mrk) qrkVar.a.get(ork.ANALYTICS_STORAGE);
                    if (mrkVar3 == null) {
                        mrkVar3 = mrkVar2;
                    }
                    if (mrkVar3 == mrkVar2) {
                        b0().O.b("Ignoring empty consent settings");
                        return;
                    }
                }
            }
        } else if (i2 != -10 && qrkVar.l() == null && qrkVar.m() == null) {
            b0().O.b("Discarding empty consent settings");
            return;
        }
        synchronized (this.L) {
            try {
                qrkVar2 = this.R;
                z2 = false;
                if (qrk.h(i2, qrkVar2.b)) {
                    zK = qrkVar.k(this.R, (ork[]) qrkVar.a.keySet().toArray(new ork[0]));
                    ork orkVar = ork.ANALYTICS_STORAGE;
                    if (qrkVar.i(orkVar) && !this.R.i(orkVar)) {
                        z2 = true;
                    }
                    qrkVarJ = qrkVar.j(this.R);
                    this.R = qrkVarJ;
                    i = i2;
                    z3 = z2;
                    z2 = true;
                } else {
                    qrkVarJ = qrkVar;
                    zK = false;
                    i = i2;
                    z3 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!z2) {
            b0().P.c("Ignoring lower-priority consent settings, proposed settings", qrkVarJ);
            return;
        }
        long andIncrement = this.S.getAndIncrement();
        if (zK) {
            o1(null);
            twk twkVar = new twk(this, qrkVarJ, j, andIncrement, z3, qrkVar2);
            if (!z) {
                O().U0(twkVar);
                return;
            } else {
                K0();
                twkVar.run();
                return;
            }
        }
        ywk ywkVar = new ywk(this, qrkVarJ, andIncrement, z3, qrkVar2);
        if (z) {
            K0();
            ywkVar.run();
        } else if (i == 30 || i == -10) {
            O().U0(ywkVar);
        } else {
            O().T0(ywkVar);
        }
    }

    public final void f1(boolean z, Boolean bool) {
        K0();
        O0();
        b0().Q.c("Setting app measurement enabled (FE)", bool);
        vik vikVarI0 = I0();
        vikVarI0.K0();
        SharedPreferences.Editor editorEdit = vikVarI0.T0().edit();
        if (bool != null) {
            editorEdit.putBoolean("measurement_enabled", bool.booleanValue());
        } else {
            editorEdit.remove("measurement_enabled");
        }
        editorEdit.apply();
        if (z) {
            vik vikVarI02 = I0();
            vikVarI02.K0();
            SharedPreferences.Editor editorEdit2 = vikVarI02.T0().edit();
            if (bool != null) {
                editorEdit2.putBoolean("measurement_enabled_from_api", bool.booleanValue());
            } else {
                editorEdit2.remove("measurement_enabled_from_api");
            }
            editorEdit2.apply();
        }
        umk umkVar = (umk) this.E;
        wlk wlkVar = umkVar.N;
        umk.d(wlkVar);
        wlkVar.K0();
        if (umkVar.h0 || !(bool == null || bool.booleanValue())) {
            m1();
        }
    }

    public final PriorityQueue g1() {
        if (this.P == null) {
            this.P = new PriorityQueue(Comparator.comparing(new Function() { // from class: tsk
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return Long.valueOf(((f0l) obj).F);
                }
            }, new x8e(23)));
        }
        return this.P;
    }

    public final void h1() {
        K0();
        O0();
        umk umkVar = (umk) this.E;
        if (umkVar.f()) {
            Boolean boolV0 = umkVar.K.V0("google_analytics_deferred_deep_link_enabled");
            int i = 1;
            if (boolV0 != null && boolV0.booleanValue()) {
                b0().Q.b("Deferred Deep Link feature enabled.");
                O().T0(new qmk(this, i));
            }
            hyk hykVarN = umkVar.n();
            hykVarN.K0();
            hykVarN.O0();
            u1l u1lVarD1 = hykVarN.d1(true);
            ((umk) hykVarN.E).l().S0(new byte[0], 3);
            hykVarN.R0(new syk(hykVarN, u1lVarD1, 0));
            this.V = false;
            vik vikVarI0 = I0();
            vikVarI0.K0();
            String string = vikVarI0.T0().getString("previous_os_version", null);
            ((umk) vikVarI0.E).i().L0();
            String str = Build.VERSION.RELEASE;
            if (!TextUtils.isEmpty(str) && !str.equals(string)) {
                SharedPreferences.Editor editorEdit = vikVarI0.T0().edit();
                editorEdit.putString("previous_os_version", str);
                editorEdit.apply();
            }
            if (TextUtils.isEmpty(string)) {
                return;
            }
            umkVar.i().L0();
            if (string.equals(str)) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("_po", string);
            p1("auto", "_ou", bundle);
        }
    }

    public final void i1() {
        umk umkVar = (umk) this.E;
        if (!(umkVar.E.getApplicationContext() instanceof Application) || this.G == null) {
            return;
        }
        ((Application) umkVar.E.getApplicationContext()).unregisterActivityLifecycleCallbacks(this.G);
    }

    public final void j1() {
        b4l.a();
        if (((umk) this.E).K.X0(null, zvj.G0)) {
            if (O().V0()) {
                b0().J.b("Cannot get trigger URIs from analytics worker thread");
                return;
            }
            if (s4i.f()) {
                b0().J.b("Cannot get trigger URIs from main thread");
                return;
            }
            O0();
            b0().R.b("Getting trigger URIs (FE)");
            AtomicReference atomicReference = new AtomicReference();
            O().O0(atomicReference, 5000L, "get trigger URIs", new btk(this, atomicReference, 0));
            List list = (List) atomicReference.get();
            if (list == null) {
                b0().J.b("Timed out waiting for get trigger URIs");
            } else {
                O().T0(new s2k(this, 16, list));
            }
        }
    }

    public final void k1() throws Throwable {
        String string;
        int i;
        int i2;
        int i3;
        String string2;
        int i4;
        int i5;
        Bundle bundle;
        String str;
        Bundle bundle2;
        K0();
        b0().Q.b("Handle tcf update.");
        SharedPreferences sharedPreferencesS0 = I0().S0();
        HashMap map = new HashMap();
        try {
            string = sharedPreferencesS0.getString("IABTCF_VendorConsents", WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR);
        } catch (ClassCastException unused) {
            string = WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR;
        }
        if (!WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR.equals(string) && string.length() > 754) {
            map.put("GoogleConsent", String.valueOf(string.charAt(754)));
        }
        try {
            i = sharedPreferencesS0.getInt("IABTCF_gdprApplies", -1);
        } catch (ClassCastException unused2) {
            i = -1;
        }
        if (i != -1) {
            map.put("gdprApplies", String.valueOf(i));
        }
        try {
            i2 = sharedPreferencesS0.getInt("IABTCF_EnableAdvertiserConsentMode", -1);
        } catch (ClassCastException unused3) {
            i2 = -1;
        }
        if (i2 != -1) {
            map.put("EnableAdvertiserConsentMode", String.valueOf(i2));
        }
        try {
            i3 = sharedPreferencesS0.getInt("IABTCF_PolicyVersion", -1);
        } catch (ClassCastException unused4) {
            i3 = -1;
        }
        if (i3 != -1) {
            map.put("PolicyVersion", String.valueOf(i3));
        }
        try {
            string2 = sharedPreferencesS0.getString("IABTCF_PurposeConsents", WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR);
        } catch (ClassCastException unused5) {
            string2 = WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR;
        }
        if (!WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR.equals(string2)) {
            map.put("PurposeConsents", string2);
        }
        try {
            i4 = sharedPreferencesS0.getInt("IABTCF_CmpSdkID", -1);
        } catch (ClassCastException unused6) {
            i4 = -1;
        }
        if (i4 != -1) {
            map.put("CmpSdkID", String.valueOf(i4));
        }
        e0l e0lVar = new e0l(map);
        b0().R.c("Tcf preferences read", e0lVar);
        vik vikVarI0 = I0();
        vikVarI0.K0();
        String string3 = vikVarI0.T0().getString("stored_tcf_param", "");
        String strA = e0lVar.a();
        if (strA.equals(string3)) {
            return;
        }
        SharedPreferences.Editor editorEdit = vikVarI0.T0().edit();
        editorEdit.putString("stored_tcf_param", strA);
        editorEdit.apply();
        HashMap map2 = e0lVar.a;
        if ("1".equals(map2.get("GoogleConsent")) && "1".equals(map2.get("gdprApplies")) && "1".equals(map2.get("EnableAdvertiserConsentMode"))) {
            int iB = e0lVar.b();
            if (iB < 0) {
                bundle2 = Bundle.EMPTY;
            } else {
                String str2 = (String) map2.get("PurposeConsents");
                if (TextUtils.isEmpty(str2)) {
                    bundle2 = Bundle.EMPTY;
                } else {
                    bundle = new Bundle();
                    String str3 = "denied";
                    if (str2.length() > 0) {
                        bundle.putString("ad_storage", str2.charAt(0) == '1' ? "granted" : "denied");
                    }
                    if (str2.length() > 3) {
                        bundle.putString("ad_personalization", (str2.charAt(2) == '1' && str2.charAt(3) == '1') ? "granted" : "denied");
                    }
                    if (str2.length() <= 6 || iB < 4) {
                        i5 = 0;
                    } else {
                        i5 = 0;
                        if (str2.charAt(0) == '1' && str2.charAt(6) == '1') {
                            str3 = "granted";
                        }
                        bundle.putString("ad_user_data", str3);
                    }
                }
            }
            bundle = bundle2;
            i5 = 0;
        } else {
            i5 = 0;
            bundle = Bundle.EMPTY;
        }
        b0().R.c("Consent generated from Tcf", bundle);
        if (bundle != Bundle.EMPTY) {
            ((umk) this.E).R.getClass();
            U0(bundle, -30, System.currentTimeMillis());
        }
        Bundle bundle3 = new Bundle();
        StringBuilder sb = new StringBuilder("1");
        try {
            str = (String) map2.get("CmpSdkID");
        } catch (NumberFormatException unused7) {
        }
        int i6 = !TextUtils.isEmpty(str) ? Integer.parseInt(str) : -1;
        if (i6 < 0 || i6 > 4095) {
            sb.append("00");
        } else {
            sb.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt((i6 >> 6) & 63));
            sb.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i6 & 63));
        }
        int iB2 = e0lVar.b();
        if (iB2 < 0 || iB2 > 63) {
            sb.append(TaskSessionEvent.REPLAY_FROM_START);
        } else {
            sb.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(iB2));
        }
        int i7 = "1".equals(map2.get("gdprApplies")) ? 2 : i5;
        int i8 = i7 | 4;
        if ("1".equals(map2.get("EnableAdvertiserConsentMode"))) {
            i8 = i7 | 12;
        }
        sb.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i8));
        bundle3.putString("_tcfd", sb.toString());
        p1("auto", "_tcf", bundle3);
    }

    public final void l1() {
        f0l f0lVar;
        K0();
        boolean z = false;
        this.Q = false;
        if (g1().isEmpty() || this.M || (f0lVar = (f0l) g1().poll()) == null) {
            return;
        }
        String str = f0lVar.E;
        h1l h1lVarJ0 = J0();
        if (h1lVarJ0.J == null) {
            h1lVarJ0.J = u5b.b(((umk) h1lVarJ0.E).E);
        }
        u5b u5bVar = h1lVarJ0.J;
        if (u5bVar == null) {
            return;
        }
        this.M = true;
        b0().R.c("Registering trigger URI", str);
        saa saaVarE = u5bVar.e(Uri.parse(str));
        if (saaVarE == null) {
            this.M = false;
            g1().add(f0lVar);
            return;
        }
        if (!((umk) this.E).K.X0(null, zvj.L0)) {
            SparseArray sparseArrayU0 = I0().U0();
            sparseArrayU0.put(f0lVar.G, Long.valueOf(f0lVar.F));
            I0().O0(sparseArrayU0);
        }
        dpk.e(saaVarE, new ire(this, f0lVar, z, 14), new bf8(this));
    }

    public final void m1() {
        jsk jskVar;
        umk umkVar = (umk) this.E;
        K0();
        String strD = I0().R.d();
        if (strD == null) {
            jskVar = this;
        } else if ("unset".equals(strD)) {
            umkVar.R.getClass();
            jskVar = this;
            jskVar.S0(System.currentTimeMillis(), null, "app", "_npa");
        } else {
            jskVar = this;
            Long lValueOf = Long.valueOf("true".equals(strD) ? 1L : 0L);
            umkVar.R.getClass();
            jskVar.S0(System.currentTimeMillis(), lValueOf, "app", "_npa");
        }
        if (umkVar.e() && jskVar.V) {
            jskVar.b0().Q.b("Recording app launch after enabling measurement for the first time (FE)");
            jskVar.h1();
            jskVar.N0().I.a();
            jskVar.O().T0(new qmk(jskVar, 2));
            return;
        }
        jskVar.b0().Q.b("Updating Scion state (FE)");
        hyk hykVarN = umkVar.n();
        hykVarN.K0();
        hykVarN.O0();
        hykVarN.R0(new syk(hykVarN, hykVarN.d1(true), 1));
    }

    public final void n1(Bundle bundle, long j) {
        umk umkVar = (umk) this.E;
        dgj.v(bundle);
        Bundle bundle2 = new Bundle(bundle);
        if (!TextUtils.isEmpty(bundle2.getString("app_id"))) {
            b0().M.b("Package name should be null when calling setConditionalUserProperty");
        }
        bundle2.remove("app_id");
        ask.n(bundle2, "app_id", String.class, null);
        ask.n(bundle2, "origin", String.class, null);
        ask.n(bundle2, "name", String.class, null);
        ask.n(bundle2, ExperienceToggle.DEFAULT_PARAM_KEY, Object.class, null);
        ask.n(bundle2, "trigger_event_name", String.class, null);
        ask.n(bundle2, "trigger_timeout", Long.class, 0L);
        ask.n(bundle2, "timed_out_event_name", String.class, null);
        ask.n(bundle2, "timed_out_event_params", Bundle.class, null);
        ask.n(bundle2, "triggered_event_name", String.class, null);
        ask.n(bundle2, "triggered_event_params", Bundle.class, null);
        ask.n(bundle2, "time_to_live", Long.class, 0L);
        ask.n(bundle2, "expired_event_name", String.class, null);
        ask.n(bundle2, "expired_event_params", Bundle.class, null);
        dgj.s(bundle2.getString("name"));
        dgj.s(bundle2.getString("origin"));
        dgj.v(bundle2.get(ExperienceToggle.DEFAULT_PARAM_KEY));
        bundle2.putLong("creation_timestamp", j);
        String string = bundle2.getString("name");
        Object obj = bundle2.get(ExperienceToggle.DEFAULT_PARAM_KEY);
        if (J0().D1(string) != 0) {
            b0().J.c("Invalid conditional user property name", umkVar.Q.g(string));
            return;
        }
        if (J0().P0(string, obj) != 0) {
            b0().J.a(umkVar.Q.g(string), obj, "Invalid conditional user property value");
            return;
        }
        Object objJ1 = J0().J1(string, obj);
        if (objJ1 == null) {
            b0().J.a(umkVar.Q.g(string), obj, "Unable to normalize conditional user property value");
            return;
        }
        ask.o(bundle2, objJ1);
        long j2 = bundle2.getLong("trigger_timeout");
        if (!TextUtils.isEmpty(bundle2.getString("trigger_event_name")) && (j2 > 15552000000L || j2 < 1)) {
            b0().J.a(umkVar.Q.g(string), Long.valueOf(j2), "Invalid conditional user property timeout");
            return;
        }
        long j3 = bundle2.getLong("time_to_live");
        if (j3 > 15552000000L || j3 < 1) {
            b0().J.a(umkVar.Q.g(string), Long.valueOf(j3), "Invalid conditional user property time to live");
        } else {
            O().T0(new mtk(this, bundle2, 1));
        }
    }

    public final void o1(String str) {
        this.K.set(str);
    }

    public final void p1(String str, String str2, Bundle bundle) {
        K0();
        ((umk) this.E).R.getClass();
        R0(System.currentTimeMillis(), bundle, str, str2);
    }

    public final Bundle q1(Bundle bundle) {
        int i;
        w9h w9hVar;
        umk umkVar = (umk) this.E;
        Bundle bundleW = I0().d0.W();
        Iterator<String> it = bundle.keySet().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            i = 0;
            w9hVar = this.Z;
            if (!zHasNext) {
                break;
            }
            String next = it.next();
            Object obj = bundle.get(next);
            if (obj != null && !(obj instanceof String) && !(obj instanceof Long) && !(obj instanceof Double)) {
                J0();
                if (h1l.t1(obj)) {
                    J0();
                    h1l.o1(w9hVar, null, 27, null, null, 0);
                }
                b0().O.a(next, obj, "Invalid default event parameter type. Name, value");
            } else if (h1l.P1(next)) {
                b0().O.c("Invalid default event parameter name. Name", next);
            } else if (obj == null) {
                bundleW.remove(next);
            } else if (J0().w1("param", next, umkVar.K.M0(null, false), obj)) {
                J0().e1(bundleW, next, obj);
            }
        }
        J0();
        int i2 = umkVar.K.J0().B1(201500000) ? 100 : 25;
        if (bundleW.size() <= i2) {
            return bundleW;
        }
        for (String str : new TreeSet(bundleW.keySet())) {
            i++;
            if (i > i2) {
                bundleW.remove(str);
            }
        }
        J0();
        h1l.o1(w9hVar, null, 26, null, null, 0);
        b0().O.b("Too many default event parameters set. Discarding beyond event parameter limit");
        return bundleW;
    }
}
