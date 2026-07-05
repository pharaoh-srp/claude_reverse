package defpackage;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.PowerManager;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.health.platform.client.proto.g;
import com.anthropic.claude.mainactivity.MainActivity;
import com.google.android.gms.common.api.Status;
import com.google.android.play.core.common.PlayCoreDialogWrapperActivity;
import com.google.android.play.core.review.ReviewException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Objects;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes3.dex */
public class ire implements iwj, see, pec, s08, up4 {
    public final /* synthetic */ int E;
    public Object F;
    public Object G;

    public ire(Context context, int i) {
        this.E = i;
        switch (i) {
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                this.G = new AtomicLong(-1L);
                this.F = new snj(context, snj.k, new ech("mlkit:natural_language"), d88.c);
                break;
            default:
                this.F = context;
                break;
        }
    }

    public static void b(ire ireVar, boolean z, boolean z2) {
        synchronized (ireVar) {
            boolean z3 = false;
            if (z) {
                if (((PowerManager.WakeLock) ireVar.G) == null) {
                    if (((Context) ireVar.F).checkSelfPermission("android.permission.WAKE_LOCK") != 0) {
                        ysj.u("WakeLockManager", "WAKE_LOCK permission not granted, can't acquire wake lock for playback");
                        return;
                    }
                    PowerManager powerManager = (PowerManager) ((Context) ireVar.F).getSystemService("power");
                    if (powerManager == null) {
                        ysj.u("WakeLockManager", "PowerManager is null, therefore not creating the WakeLock.");
                        return;
                    } else {
                        PowerManager.WakeLock wakeLockNewWakeLock = powerManager.newWakeLock(1, "ExoPlayer:WakeLockManager");
                        ireVar.G = wakeLockNewWakeLock;
                        wakeLockNewWakeLock.setReferenceCounted(false);
                    }
                }
            }
            PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) ireVar.G;
            if (wakeLock == null) {
                return;
            }
            if (z && z2) {
                z3 = true;
            }
            if (z3) {
                wakeLock.acquire();
            } else {
                wakeLock.release();
            }
        }
    }

    @Override // defpackage.pec
    public /* synthetic */ void a() {
        try {
            ((v6k) this.F).F((dba) this.G, true, new j5h());
        } catch (RemoteException unused) {
        }
    }

    @Override // defpackage.see
    public void accept(Object obj, Object obj2) {
        jf7 jf7Var;
        jf7 jf7Var2;
        j5h j5hVar = (j5h) obj2;
        v6k v6kVar = (v6k) obj;
        jd5 jd5Var = (jd5) this.F;
        fnf fnfVar = (fnf) this.G;
        jf7[] jf7VarArrJ = v6kVar.j();
        Object a5lVar = null;
        if (jf7VarArrJ != null) {
            int i = 0;
            while (true) {
                if (i >= jf7VarArrJ.length) {
                    jf7Var2 = null;
                    break;
                }
                jf7Var2 = jf7VarArrJ[i];
                if ("location_updates_with_callback".equals(jf7Var2.E)) {
                    break;
                } else {
                    i++;
                }
            }
            if (jf7Var2 != null && jf7Var2.l0() >= 1) {
                c5l c5lVar = (c5l) v6kVar.t();
                b8k b8kVarX0 = b8k.x0(new e4k(1, j5hVar));
                Parcel parcelH = c5lVar.H();
                zyj.b(parcelH, jd5Var);
                zyj.b(parcelH, b8kVarX0);
                Parcel parcelJ = c5lVar.J(parcelH, 92);
                IBinder strongBinder = parcelJ.readStrongBinder();
                int i2 = jt8.j;
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.common.internal.ICancelToken");
                    a5lVar = iInterfaceQueryLocalInterface instanceof kt8 ? (kt8) iInterfaceQueryLocalInterface : new a5l(strongBinder, "com.google.android.gms.common.internal.ICancelToken", 6);
                }
                parcelJ.recycle();
                if (fnfVar != null) {
                    fnfVar.j(new fnf(23, a5lVar));
                    return;
                }
                return;
            }
        }
        jf7[] jf7VarArrJ2 = v6kVar.j();
        if (jf7VarArrJ2 != null) {
            int i3 = 0;
            while (true) {
                if (i3 >= jf7VarArrJ2.length) {
                    jf7Var = null;
                    break;
                }
                jf7Var = jf7VarArrJ2[i3];
                if ("get_current_location".equals(jf7Var.E)) {
                    break;
                } else {
                    i3++;
                }
            }
            if (jf7Var != null && jf7Var.l0() >= 2) {
                c5l c5lVar2 = (c5l) v6kVar.t();
                e4k e4kVar = new e4k(1, j5hVar);
                Parcel parcelH2 = c5lVar2.H();
                zyj.b(parcelH2, jd5Var);
                parcelH2.writeStrongBinder(e4kVar);
                Parcel parcelJ2 = c5lVar2.J(parcelH2, 87);
                IBinder strongBinder2 = parcelJ2.readStrongBinder();
                int i4 = jt8.j;
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.common.internal.ICancelToken");
                    a5lVar = iInterfaceQueryLocalInterface2 instanceof kt8 ? (kt8) iInterfaceQueryLocalInterface2 : new a5l(strongBinder2, "com.google.android.gms.common.internal.ICancelToken", 6);
                }
                parcelJ2.recycle();
                if (fnfVar != null) {
                    fnfVar.j(new c6k(a5lVar));
                    return;
                }
                return;
            }
        }
        fba fbaVar = new fba(new m4k(v6kVar, j5hVar));
        dba dbaVar = fbaVar.c;
        Objects.requireNonNull(dbaVar);
        mvd mvdVar = new mvd(fbaVar, 14, j5hVar);
        j5h j5hVar2 = new j5h();
        qea qeaVar = new qea(jd5Var.G, 0L);
        qeaVar.e(0L);
        qeaVar.b(Long.MAX_VALUE);
        qeaVar.c(0);
        qeaVar.d(10000L);
        qeaVar.l = false;
        qeaVar.f(0);
        qeaVar.h = true;
        qeaVar.m = jd5Var.K;
        v6kVar.E(mvdVar, qeaVar.a(), j5hVar2);
        j5hVar2.a.h(new p7k(j5hVar));
        if (fnfVar != null) {
            fnfVar.j(new ire(v6kVar, 12, dbaVar));
        }
    }

    public void c(char c) {
        StringBuilder sb = (StringBuilder) this.G;
        if (sb != null) {
            sb.append(c);
            return;
        }
        if (((String) this.F) == null) {
            this.F = String.valueOf(c);
            return;
        }
        StringBuilder sbB = xrg.b();
        this.G = sbB;
        sbB.append((String) this.F);
        this.F = null;
        ((StringBuilder) this.G).append(c);
    }

    public void d(String str) {
        StringBuilder sb = (StringBuilder) this.G;
        if (sb != null) {
            sb.append(str);
            return;
        }
        if (((String) this.F) == null) {
            this.F = str;
            return;
        }
        StringBuilder sbB = xrg.b();
        this.G = sbB;
        sbB.append((String) this.F);
        this.F = null;
        ((StringBuilder) this.G).append(str);
    }

    public vlj e() {
        String str = (String) this.F;
        if (str != null) {
            return new vlj((Long) this.G, str);
        }
        sz6.j("Missing required properties: nonce");
        return null;
    }

    public void f() {
        View rootView = ((ViewGroup) ((MainActivity) this.F).findViewById(R.id.content)).getRootView();
        ViewGroup viewGroup = rootView instanceof ViewGroup ? (ViewGroup) rootView : null;
        if (viewGroup != null) {
            viewGroup.addView((ViewGroup) ((u0h) this.G).getValue());
        }
    }

    @Override // defpackage.up4
    public Object g(d5h d5hVar) {
        Bundle bundle;
        gxe gxeVar = (gxe) this.F;
        Bundle bundle2 = (Bundle) this.G;
        gxeVar.getClass();
        return (d5hVar.g() && (bundle = (Bundle) d5hVar.e()) != null && bundle.containsKey("google.messenger")) ? gxeVar.a(bundle2).l(z46.G, hj6.Y) : d5hVar;
    }

    public void h(String str, bz7 bz7Var) {
        LinkedHashMap linkedHashMap = ((y0c) this.G).a;
        s6g s6gVar = new s6g(this, str);
        bz7Var.invoke(s6gVar);
        String str2 = (String) this.F;
        ArrayList arrayList = s6gVar.a;
        ArrayList arrayList2 = new ArrayList(x44.y(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add((String) ((cpc) it.next()).E);
        }
        String strN = (String) s6gVar.b.E;
        strN.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append('(');
        sb.append(w44.S0(arrayList2, "", null, null, p9d.d0, 30));
        sb.append(')');
        if (strN.length() > 1) {
            strN = grc.n(';', "L", strN);
        }
        sb.append(strN);
        String str3 = str2 + '.' + sb.toString();
        cai caiVar = (cai) s6gVar.b.F;
        ArrayList arrayList3 = new ArrayList(x44.y(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList3.add((cai) ((cpc) it2.next()).F);
        }
        linkedHashMap.put(str3, new fbd(caiVar, arrayList3));
    }

    public ViewGroup i() {
        return (ViewGroup) ((u0h) this.G).getValue();
    }

    @Override // defpackage.iwj
    public c61 j(lsj lsjVar) {
        c61 c61VarL = ((c61) this.F).L();
        String str = (String) this.G;
        c61VarL.Q(str, lsjVar);
        ((HashMap) c61VarL.I).put(str, Boolean.TRUE);
        return c61VarL;
    }

    public boolean k() {
        return (((StringBuilder) this.G) == null && ((String) this.F) == null) ? false : true;
    }

    public r5l l(Activity activity, gse gseVar) {
        if (((bpj) gseVar).F) {
            return ez1.E(null);
        }
        Intent intent = new Intent(activity, (Class<?>) PlayCoreDialogWrapperActivity.class);
        intent.putExtra("confirmation_intent", ((bpj) gseVar).E);
        intent.putExtra("window_flags", activity.getWindow().getDecorView().getWindowSystemUiVisibility());
        j5h j5hVar = new j5h();
        intent.putExtra("result_receiver", new ryj((Handler) this.G, j5hVar));
        activity.startActivity(intent);
        return j5hVar.a;
    }

    public void m() {
        ViewParent parent = i().getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(i());
        }
    }

    public r5l n() {
        enk enkVar = (enk) this.F;
        String str = enkVar.b;
        zf zfVar = enk.c;
        zfVar.f("requestInAppReview (%s)", str);
        s4l s4lVar = enkVar.a;
        if (s4lVar != null) {
            j5h j5hVar = new j5h();
            s4lVar.a().post(new wyk(s4lVar, j5hVar, j5hVar, new bbk(enkVar, j5hVar, j5hVar)));
            return j5hVar.a;
        }
        Object[] objArr = new Object[0];
        if (Log.isLoggable("PlayCore", 6)) {
            Log.e("PlayCore", zf.h(zfVar.F, "Play Store app is either not installed or not the official version", objArr));
        }
        Locale locale = Locale.getDefault();
        HashMap map = cpj.a;
        return ez1.D(new ReviewException(new Status(-1, String.format(locale, "Review Error(%d): %s", -1, !map.containsKey(-1) ? "" : kgh.p((String) map.get(-1), " (https://developer.android.com/reference/com/google/android/play/core/review/model/ReviewErrorCode.html#", (String) cpj.b.get(-1), ")")), null, null)));
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0077  */
    @Override // defpackage.s08
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void o(java.lang.Throwable r9) {
        /*
            Method dump skipped, instruction units count: 339
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ire.o(java.lang.Throwable):void");
    }

    @Override // defpackage.s08
    public void onSuccess(Object obj) {
        f0l f0lVar = (f0l) this.F;
        String str = f0lVar.E;
        jsk jskVar = (jsk) this.G;
        jskVar.K0();
        if (!((umk) jskVar.E).K.X0(null, zvj.L0)) {
            jskVar.M = false;
            jskVar.l1();
            jskVar.b0().Q.c("registerTriggerAsync ran. uri", str);
            return;
        }
        SparseArray sparseArrayU0 = jskVar.I0().U0();
        sparseArrayU0.put(f0lVar.G, Long.valueOf(f0lVar.F));
        jskVar.I0().O0(sparseArrayU0);
        jskVar.M = false;
        jskVar.N = 1;
        jskVar.b0().Q.c("Successfully registered trigger URI", str);
        jskVar.l1();
    }

    public void p() {
        StringBuilder sb = (StringBuilder) this.G;
        if (sb != null) {
            String[] strArr = xrg.a;
            if (sb.length() <= 8192) {
                sb.delete(0, sb.length());
                xrg.e.D(sb);
            }
            this.G = null;
        }
        this.F = null;
    }

    public void q() {
        this.G = 90637372055L;
    }

    public void r(String str) {
        if (str != null) {
            this.F = str;
        } else {
            mr9.h("Null nonce");
        }
    }

    public String s() {
        StringBuilder sb = (StringBuilder) this.G;
        if (sb == null) {
            String str = (String) this.F;
            return str != null ? str : "";
        }
        this.F = sb.toString();
        xrg.k((StringBuilder) this.G);
        this.G = null;
        return (String) this.F;
    }

    public void t(c61 c61Var, lrb lrbVar) {
        TreeMap treeMap = (TreeMap) this.G;
        vzk vzkVar = new vzk(lrbVar);
        TreeMap treeMap2 = (TreeMap) this.F;
        for (Integer num : treeMap2.keySet()) {
            bqj bqjVar = (bqj) ((bqj) lrbVar.G).clone();
            lsj lsjVarC = ((osj) treeMap2.get(num)).c(c61Var, Collections.singletonList(vzkVar));
            int iQ = lsjVarC instanceof yqj ? gqk.q(((yqj) lsjVarC).E.doubleValue()) : -1;
            if (iQ == 2 || iQ == -1) {
                lrbVar.G = bqjVar;
            }
        }
        Iterator it = treeMap.keySet().iterator();
        while (it.hasNext()) {
            lsj lsjVarC2 = ((osj) treeMap.get((Integer) it.next())).c(c61Var, Collections.singletonList(vzkVar));
            if (lsjVarC2 instanceof yqj) {
                gqk.q(((yqj) lsjVarC2).E.doubleValue());
            }
        }
    }

    public String toString() {
        switch (this.E) {
            case 4:
                StringBuilder sb = (StringBuilder) this.G;
                if (sb != null) {
                    return sb.toString();
                }
                String str = (String) this.F;
                return str != null ? str : "";
            default:
                return super.toString();
        }
    }

    public /* synthetic */ ire(Object obj, int i, Object obj2) {
        this.E = i;
        this.F = obj;
        this.G = obj2;
    }

    public /* synthetic */ ire(Object obj, Object obj2, boolean z, int i) {
        this.E = i;
        this.G = obj;
        this.F = obj2;
    }

    public ire(enk enkVar) {
        this.E = 11;
        this.G = new Handler(Looper.getMainLooper());
        this.F = enkVar;
    }

    public ire(MainActivity mainActivity) {
        this.E = 3;
        this.F = mainActivity;
        this.G = new u0h(new pza(26, this));
    }

    public /* synthetic */ ire(int i, boolean z) {
        this.E = i;
    }

    public ire(int i) {
        this.E = i;
        switch (i) {
            case 8:
                this.F = new TreeMap();
                this.G = new TreeMap();
                break;
            default:
                this.F = new LinkedHashMap();
                this.G = new LinkedHashMap();
                break;
        }
    }
}
