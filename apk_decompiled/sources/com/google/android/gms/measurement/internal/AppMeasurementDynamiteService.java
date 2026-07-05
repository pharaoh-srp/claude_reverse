package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import defpackage.af7;
import defpackage.avj;
import defpackage.bmk;
import defpackage.bp0;
import defpackage.btk;
import defpackage.c5a;
import defpackage.cbc;
import defpackage.ck0;
import defpackage.dgj;
import defpackage.etk;
import defpackage.h1l;
import defpackage.i4l;
import defpackage.jsk;
import defpackage.jtk;
import defpackage.lu8;
import defpackage.me2;
import defpackage.mtk;
import defpackage.o5k;
import defpackage.p5k;
import defpackage.q4k;
import defpackage.qb5;
import defpackage.qgk;
import defpackage.ruk;
import defpackage.rvj;
import defpackage.s2k;
import defpackage.sz6;
import defpackage.u5k;
import defpackage.umk;
import defpackage.vqj;
import defpackage.vvk;
import defpackage.vxk;
import defpackage.wlk;
import defpackage.wqk;
import defpackage.wuk;
import defpackage.x4k;
import defpackage.xxk;
import defpackage.y5k;
import defpackage.zvj;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public class AppMeasurementDynamiteService extends q4k {
    public umk i;
    public final bp0 j;

    public AppMeasurementDynamiteService() {
        super("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
        this.i = null;
        this.j = new bp0(0);
    }

    @Override // defpackage.u4k
    public void beginAdUnitExposure(String str, long j) {
        c();
        this.i.h().P0(j, str);
    }

    public final void c() {
        if (this.i != null) {
            return;
        }
        sz6.j("Attempting to perform action before initialize.");
    }

    @Override // defpackage.u4k
    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        c();
        jsk jskVar = this.i.T;
        umk.b(jskVar);
        jskVar.W0(str, str2, bundle);
    }

    @Override // defpackage.u4k
    public void clearMeasurementEnabled(long j) {
        c();
        jsk jskVar = this.i.T;
        umk.b(jskVar);
        jskVar.O0();
        jskVar.O().T0(new c5a(jskVar, 10, null));
    }

    public final void d(String str, x4k x4kVar) {
        c();
        h1l h1lVar = this.i.P;
        umk.c(h1lVar);
        h1lVar.g1(str, x4kVar);
    }

    @Override // defpackage.u4k
    public void endAdUnitExposure(String str, long j) {
        c();
        this.i.h().T0(j, str);
    }

    @Override // defpackage.u4k
    public void generateEventId(x4k x4kVar) {
        c();
        h1l h1lVar = this.i.P;
        umk.c(h1lVar);
        long jU1 = h1lVar.U1();
        c();
        h1l h1lVar2 = this.i.P;
        umk.c(h1lVar2);
        h1lVar2.i1(x4kVar, jU1);
    }

    @Override // defpackage.u4k
    public void getAppInstanceId(x4k x4kVar) {
        c();
        wlk wlkVar = this.i.N;
        umk.d(wlkVar);
        wlkVar.T0(new wqk(this, x4kVar, 0));
    }

    @Override // defpackage.u4k
    public void getCachedAppInstanceId(x4k x4kVar) {
        c();
        jsk jskVar = this.i.T;
        umk.b(jskVar);
        d((String) jskVar.K.get(), x4kVar);
    }

    @Override // defpackage.u4k
    public void getConditionalUserProperties(String str, String str2, x4k x4kVar) {
        c();
        wlk wlkVar = this.i.N;
        umk.d(wlkVar);
        wlkVar.T0(new me2(this, x4kVar, str, str2, 7));
    }

    @Override // defpackage.u4k
    public void getCurrentScreenClass(x4k x4kVar) {
        c();
        jsk jskVar = this.i.T;
        umk.b(jskVar);
        vxk vxkVar = ((umk) jskVar.E).S;
        umk.b(vxkVar);
        xxk xxkVar = vxkVar.G;
        d(xxkVar != null ? xxkVar.b : null, x4kVar);
    }

    @Override // defpackage.u4k
    public void getCurrentScreenName(x4k x4kVar) {
        c();
        jsk jskVar = this.i.T;
        umk.b(jskVar);
        vxk vxkVar = ((umk) jskVar.E).S;
        umk.b(vxkVar);
        xxk xxkVar = vxkVar.G;
        d(xxkVar != null ? xxkVar.a : null, x4kVar);
    }

    @Override // defpackage.u4k
    public void getGmpAppId(x4k x4kVar) {
        c();
        jsk jskVar = this.i.T;
        umk.b(jskVar);
        umk umkVar = (umk) jskVar.E;
        String string = umkVar.F;
        if (string == null) {
            string = null;
            try {
                Context context = umkVar.E;
                String strB = umkVar.W;
                dgj.v(context);
                Resources resources = context.getResources();
                if (TextUtils.isEmpty(strB)) {
                    strB = bmk.b(context);
                }
                int identifier = resources.getIdentifier("google_app_id", "string", strB);
                if (identifier != 0) {
                    try {
                        string = resources.getString(identifier);
                    } catch (Resources.NotFoundException unused) {
                    }
                }
            } catch (IllegalStateException e) {
                qgk qgkVar = umkVar.M;
                umk.d(qgkVar);
                qgkVar.J.c("getGoogleAppId failed with exception", e);
            }
        }
        d(string, x4kVar);
    }

    @Override // defpackage.u4k
    public void getMaxUserProperties(String str, x4k x4kVar) {
        c();
        umk.b(this.i.T);
        dgj.s(str);
        c();
        h1l h1lVar = this.i.P;
        umk.c(h1lVar);
        h1lVar.h1(x4kVar, 25);
    }

    @Override // defpackage.u4k
    public void getSessionId(x4k x4kVar) {
        c();
        jsk jskVar = this.i.T;
        umk.b(jskVar);
        jskVar.O().T0(new s2k(jskVar, x4kVar, false, 19));
    }

    @Override // defpackage.u4k
    public void getTestFlag(x4k x4kVar, int i) {
        c();
        int i2 = 2;
        if (i == 0) {
            h1l h1lVar = this.i.P;
            umk.c(h1lVar);
            jsk jskVar = this.i.T;
            umk.b(jskVar);
            AtomicReference atomicReference = new AtomicReference();
            h1lVar.g1((String) jskVar.O().O0(atomicReference, 15000L, "String test flag value", new btk(jskVar, atomicReference, i2)), x4kVar);
            return;
        }
        int i3 = 1;
        if (i == 1) {
            h1l h1lVar2 = this.i.P;
            umk.c(h1lVar2);
            jsk jskVar2 = this.i.T;
            umk.b(jskVar2);
            AtomicReference atomicReference2 = new AtomicReference();
            h1lVar2.i1(x4kVar, ((Long) jskVar2.O().O0(atomicReference2, 15000L, "long test flag value", new s2k(jskVar2, atomicReference2, false, 20))).longValue());
            return;
        }
        int i4 = 4;
        if (i == 2) {
            h1l h1lVar3 = this.i.P;
            umk.c(h1lVar3);
            jsk jskVar3 = this.i.T;
            umk.b(jskVar3);
            AtomicReference atomicReference3 = new AtomicReference();
            double dDoubleValue = ((Double) jskVar3.O().O0(atomicReference3, 15000L, "double test flag value", new btk(jskVar3, atomicReference3, i4))).doubleValue();
            Bundle bundle = new Bundle();
            bundle.putDouble("r", dDoubleValue);
            try {
                x4kVar.f(bundle);
                return;
            } catch (RemoteException e) {
                qgk qgkVar = ((umk) h1lVar3.E).M;
                umk.d(qgkVar);
                qgkVar.M.c("Error returning double value to wrapper", e);
                return;
            }
        }
        int i5 = 3;
        if (i == 3) {
            h1l h1lVar4 = this.i.P;
            umk.c(h1lVar4);
            jsk jskVar4 = this.i.T;
            umk.b(jskVar4);
            AtomicReference atomicReference4 = new AtomicReference();
            h1lVar4.h1(x4kVar, ((Integer) jskVar4.O().O0(atomicReference4, 15000L, "int test flag value", new btk(jskVar4, atomicReference4, i5))).intValue());
            return;
        }
        if (i != 4) {
            return;
        }
        h1l h1lVar5 = this.i.P;
        umk.c(h1lVar5);
        jsk jskVar5 = this.i.T;
        umk.b(jskVar5);
        AtomicReference atomicReference5 = new AtomicReference();
        h1lVar5.l1(x4kVar, ((Boolean) jskVar5.O().O0(atomicReference5, 15000L, "boolean test flag value", new btk(jskVar5, atomicReference5, i3))).booleanValue());
    }

    @Override // defpackage.u4k
    public void getUserProperties(String str, String str2, boolean z, x4k x4kVar) {
        c();
        wlk wlkVar = this.i.N;
        umk.d(wlkVar);
        wlkVar.T0(new vvk(this, x4kVar, str, str2, z, 2));
    }

    @Override // defpackage.u4k
    public void initForTests(Map map) {
        c();
    }

    @Override // defpackage.u4k
    public void initialize(lu8 lu8Var, y5k y5kVar, long j) {
        umk umkVar = this.i;
        if (umkVar == null) {
            Context context = (Context) cbc.G(lu8Var);
            dgj.v(context);
            this.i = umk.a(context, y5kVar, Long.valueOf(j));
        } else {
            qgk qgkVar = umkVar.M;
            umk.d(qgkVar);
            qgkVar.M.b("Attempting to initialize multiple times");
        }
    }

    @Override // defpackage.u4k
    public void isDataCollectionEnabled(x4k x4kVar) {
        c();
        wlk wlkVar = this.i.N;
        umk.d(wlkVar);
        wlkVar.T0(new wqk(this, x4kVar, 1));
    }

    @Override // defpackage.u4k
    public void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) {
        c();
        jsk jskVar = this.i.T;
        umk.b(jskVar);
        jskVar.X0(str, str2, bundle, z, z2, j);
    }

    @Override // defpackage.u4k
    public void logEventAndBundle(String str, String str2, Bundle bundle, x4k x4kVar, long j) {
        c();
        dgj.s(str2);
        (bundle != null ? new Bundle(bundle) : new Bundle()).putString("_o", "app");
        rvj rvjVar = new rvj(str2, new avj(bundle), "app", j);
        wlk wlkVar = this.i.N;
        umk.d(wlkVar);
        wlkVar.T0(new me2(this, x4kVar, rvjVar, str, 2));
    }

    @Override // defpackage.u4k
    public void logHealthData(int i, String str, lu8 lu8Var, lu8 lu8Var2, lu8 lu8Var3) {
        c();
        Object objG = lu8Var == null ? null : cbc.G(lu8Var);
        Object objG2 = lu8Var2 == null ? null : cbc.G(lu8Var2);
        Object objG3 = lu8Var3 != null ? cbc.G(lu8Var3) : null;
        qgk qgkVar = this.i.M;
        umk.d(qgkVar);
        qgkVar.R0(i, true, false, str, objG, objG2, objG3);
    }

    @Override // defpackage.u4k
    public void onActivityCreated(lu8 lu8Var, Bundle bundle, long j) {
        c();
        jsk jskVar = this.i.T;
        umk.b(jskVar);
        af7 af7Var = jskVar.G;
        if (af7Var != null) {
            jsk jskVar2 = this.i.T;
            umk.b(jskVar2);
            jskVar2.i1();
            af7Var.onActivityCreated((Activity) cbc.G(lu8Var), bundle);
        }
    }

    @Override // defpackage.u4k
    public void onActivityDestroyed(lu8 lu8Var, long j) {
        c();
        jsk jskVar = this.i.T;
        umk.b(jskVar);
        af7 af7Var = jskVar.G;
        if (af7Var != null) {
            jsk jskVar2 = this.i.T;
            umk.b(jskVar2);
            jskVar2.i1();
            af7Var.onActivityDestroyed((Activity) cbc.G(lu8Var));
        }
    }

    @Override // defpackage.u4k
    public void onActivityPaused(lu8 lu8Var, long j) {
        c();
        jsk jskVar = this.i.T;
        umk.b(jskVar);
        af7 af7Var = jskVar.G;
        if (af7Var != null) {
            jsk jskVar2 = this.i.T;
            umk.b(jskVar2);
            jskVar2.i1();
            af7Var.onActivityPaused((Activity) cbc.G(lu8Var));
        }
    }

    @Override // defpackage.u4k
    public void onActivityResumed(lu8 lu8Var, long j) {
        c();
        jsk jskVar = this.i.T;
        umk.b(jskVar);
        af7 af7Var = jskVar.G;
        if (af7Var != null) {
            jsk jskVar2 = this.i.T;
            umk.b(jskVar2);
            jskVar2.i1();
            af7Var.onActivityResumed((Activity) cbc.G(lu8Var));
        }
    }

    @Override // defpackage.u4k
    public void onActivitySaveInstanceState(lu8 lu8Var, x4k x4kVar, long j) {
        c();
        jsk jskVar = this.i.T;
        umk.b(jskVar);
        af7 af7Var = jskVar.G;
        Bundle bundle = new Bundle();
        if (af7Var != null) {
            jsk jskVar2 = this.i.T;
            umk.b(jskVar2);
            jskVar2.i1();
            af7Var.onActivitySaveInstanceState((Activity) cbc.G(lu8Var), bundle);
        }
        try {
            x4kVar.f(bundle);
        } catch (RemoteException e) {
            qgk qgkVar = this.i.M;
            umk.d(qgkVar);
            qgkVar.M.c("Error returning bundle value to wrapper", e);
        }
    }

    @Override // defpackage.u4k
    public void onActivityStarted(lu8 lu8Var, long j) {
        c();
        jsk jskVar = this.i.T;
        umk.b(jskVar);
        if (jskVar.G != null) {
            jsk jskVar2 = this.i.T;
            umk.b(jskVar2);
            jskVar2.i1();
        }
    }

    @Override // defpackage.u4k
    public void onActivityStopped(lu8 lu8Var, long j) {
        c();
        jsk jskVar = this.i.T;
        umk.b(jskVar);
        if (jskVar.G != null) {
            jsk jskVar2 = this.i.T;
            umk.b(jskVar2);
            jskVar2.i1();
        }
    }

    @Override // defpackage.u4k
    public void performAction(Bundle bundle, x4k x4kVar, long j) {
        c();
        x4kVar.f(null);
    }

    @Override // defpackage.u4k
    public void registerOnMeasurementEventListener(o5k o5kVar) {
        ck0 ck0Var;
        c();
        synchronized (this.j) {
            try {
                u5k u5kVar = (u5k) o5kVar;
                ck0Var = (ck0) this.j.get(Integer.valueOf(u5kVar.O()));
                if (ck0Var == null) {
                    ck0Var = new ck0(this, u5kVar);
                    this.j.put(Integer.valueOf(u5kVar.O()), ck0Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        jsk jskVar = this.i.T;
        umk.b(jskVar);
        jskVar.O0();
        if (jskVar.I.add(ck0Var)) {
            return;
        }
        jskVar.b0().M.b("OnEventListener already registered");
    }

    @Override // defpackage.u4k
    public void resetAnalyticsData(long j) {
        c();
        jsk jskVar = this.i.T;
        umk.b(jskVar);
        jskVar.o1(null);
        jskVar.O().T0(new wuk(jskVar, j, 1));
    }

    @Override // defpackage.u4k
    public void setConditionalUserProperty(Bundle bundle, long j) {
        c();
        umk umkVar = this.i;
        if (bundle == null) {
            qgk qgkVar = umkVar.M;
            umk.d(qgkVar);
            qgkVar.J.b("Conditional user property must not be null");
        } else {
            jsk jskVar = umkVar.T;
            umk.b(jskVar);
            jskVar.n1(bundle, j);
        }
    }

    @Override // defpackage.u4k
    public void setConsent(Bundle bundle, long j) {
        c();
        jsk jskVar = this.i.T;
        umk.b(jskVar);
        jskVar.O().U0(new etk(jskVar, bundle, j));
    }

    @Override // defpackage.u4k
    public void setConsentThirdParty(Bundle bundle, long j) throws Throwable {
        c();
        jsk jskVar = this.i.T;
        umk.b(jskVar);
        jskVar.U0(bundle, -20, j);
    }

    @Override // defpackage.u4k
    public void setCurrentScreen(lu8 lu8Var, String str, String str2, long j) {
        c();
        vxk vxkVar = this.i.S;
        umk.b(vxkVar);
        Activity activity = (Activity) cbc.G(lu8Var);
        if (!((umk) vxkVar.E).K.a1()) {
            vxkVar.b0().O.b("setCurrentScreen cannot be called while screen reporting is disabled.");
            return;
        }
        xxk xxkVar = vxkVar.G;
        if (xxkVar == null) {
            vxkVar.b0().O.b("setCurrentScreen cannot be called while no activity active");
            return;
        }
        if (vxkVar.J.get(activity) == null) {
            vxkVar.b0().O.b("setCurrentScreen must be called with an activity in the activity lifecycle");
            return;
        }
        if (str2 == null) {
            str2 = vxkVar.R0(activity.getClass());
        }
        boolean zEquals = Objects.equals(xxkVar.b, str2);
        boolean zEquals2 = Objects.equals(xxkVar.a, str);
        if (zEquals && zEquals2) {
            vxkVar.b0().O.b("setCurrentScreen cannot be called with the same class and name");
            return;
        }
        if (str != null && (str.length() <= 0 || str.length() > ((umk) vxkVar.E).K.M0(null, false))) {
            vxkVar.b0().O.c("Invalid screen name length in setCurrentScreen. Length", Integer.valueOf(str.length()));
            return;
        }
        if (str2.length() <= 0 || str2.length() > ((umk) vxkVar.E).K.M0(null, false)) {
            vxkVar.b0().O.c("Invalid class name length in setCurrentScreen. Length", Integer.valueOf(str2.length()));
            return;
        }
        vxkVar.b0().R.a(str == null ? "null" : str, str2, "Setting current screen to name, class");
        xxk xxkVar2 = new xxk(str, str2, vxkVar.J0().U1());
        vxkVar.J.put(activity, xxkVar2);
        vxkVar.U0(activity, xxkVar2, true);
    }

    @Override // defpackage.u4k
    public void setDataCollectionEnabled(boolean z) {
        c();
        jsk jskVar = this.i.T;
        umk.b(jskVar);
        jskVar.O0();
        jskVar.O().T0(new ruk(jskVar, z));
    }

    @Override // defpackage.u4k
    public void setDefaultEventParameters(Bundle bundle) {
        c();
        jsk jskVar = this.i.T;
        umk.b(jskVar);
        jskVar.O().T0(new jtk(jskVar, bundle == null ? new Bundle() : new Bundle(bundle), 0));
    }

    @Override // defpackage.u4k
    public void setDefaultEventParametersWithBackfill(Bundle bundle) {
        c();
        jsk jskVar = this.i.T;
        umk.b(jskVar);
        if (((umk) jskVar.E).K.X0(null, zvj.k1)) {
            jskVar.O().T0(new mtk(jskVar, bundle == null ? new Bundle() : new Bundle(bundle), 0));
        }
    }

    @Override // defpackage.u4k
    public void setEventInterceptor(o5k o5kVar) {
        c();
        qb5 qb5Var = new qb5(this, o5kVar);
        wlk wlkVar = this.i.N;
        umk.d(wlkVar);
        boolean zV0 = wlkVar.V0();
        umk umkVar = this.i;
        if (!zV0) {
            wlk wlkVar2 = umkVar.N;
            umk.d(wlkVar2);
            wlkVar2.T0(new s2k(this, qb5Var, false, 18));
            return;
        }
        jsk jskVar = umkVar.T;
        umk.b(jskVar);
        jskVar.K0();
        jskVar.O0();
        qb5 qb5Var2 = jskVar.H;
        if (qb5Var != qb5Var2) {
            dgj.x("EventInterceptor already set.", qb5Var2 == null);
        }
        jskVar.H = qb5Var;
    }

    @Override // defpackage.u4k
    public void setInstanceIdProvider(p5k p5kVar) {
        c();
    }

    @Override // defpackage.u4k
    public void setMeasurementEnabled(boolean z, long j) {
        c();
        jsk jskVar = this.i.T;
        umk.b(jskVar);
        Boolean boolValueOf = Boolean.valueOf(z);
        jskVar.O0();
        jskVar.O().T0(new c5a(jskVar, 10, boolValueOf));
    }

    @Override // defpackage.u4k
    public void setMinimumSessionDuration(long j) {
        c();
    }

    @Override // defpackage.u4k
    public void setSessionTimeoutDuration(long j) {
        c();
        jsk jskVar = this.i.T;
        umk.b(jskVar);
        jskVar.O().T0(new wuk(jskVar, j, 0));
    }

    @Override // defpackage.u4k
    public void setSgtmDebugInfo(Intent intent) {
        c();
        jsk jskVar = this.i.T;
        umk.b(jskVar);
        i4l.a();
        vqj vqjVar = ((umk) jskVar.E).K;
        if (vqjVar.X0(null, zvj.w0)) {
            Uri data = intent.getData();
            if (data == null) {
                jskVar.b0().P.b("Activity intent has no data. Preview Mode was not enabled.");
                return;
            }
            String queryParameter = data.getQueryParameter("sgtm_debug_enable");
            if (queryParameter == null || !queryParameter.equals("1")) {
                jskVar.b0().P.b("Preview Mode was not enabled.");
                vqjVar.G = null;
                return;
            }
            String queryParameter2 = data.getQueryParameter("sgtm_preview_key");
            if (TextUtils.isEmpty(queryParameter2)) {
                return;
            }
            jskVar.b0().P.c("Preview Mode was enabled. Using the sgtmPreviewKey: ", queryParameter2);
            vqjVar.G = queryParameter2;
        }
    }

    @Override // defpackage.u4k
    public void setUserId(String str, long j) {
        c();
        jsk jskVar = this.i.T;
        umk.b(jskVar);
        if (str == null || !TextUtils.isEmpty(str)) {
            jskVar.O().T0(new s2k(jskVar, 17, str));
            jskVar.Z0(null, "_id", str, true, j);
        } else {
            qgk qgkVar = ((umk) jskVar.E).M;
            umk.d(qgkVar);
            qgkVar.M.b("User ID must be non-empty or null");
        }
    }

    @Override // defpackage.u4k
    public void setUserProperty(String str, String str2, lu8 lu8Var, boolean z, long j) {
        c();
        Object objG = cbc.G(lu8Var);
        jsk jskVar = this.i.T;
        umk.b(jskVar);
        jskVar.Z0(str, str2, objG, z, j);
    }

    @Override // defpackage.u4k
    public void unregisterOnMeasurementEventListener(o5k o5kVar) {
        u5k u5kVar;
        ck0 ck0Var;
        c();
        synchronized (this.j) {
            u5kVar = (u5k) o5kVar;
            ck0Var = (ck0) this.j.remove(Integer.valueOf(u5kVar.O()));
        }
        if (ck0Var == null) {
            ck0Var = new ck0(this, u5kVar);
        }
        jsk jskVar = this.i.T;
        umk.b(jskVar);
        jskVar.O0();
        if (jskVar.I.remove(ck0Var)) {
            return;
        }
        jskVar.b0().M.b("OnEventListener had not been registered");
    }
}
