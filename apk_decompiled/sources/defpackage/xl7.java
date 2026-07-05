package defpackage;

import android.net.TrafficStats;
import android.util.Log;
import com.google.firebase.installations.FirebaseInstallationsException;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class xl7 implements yl7 {
    public static final Object m = new Object();
    public final pl7 a;
    public final vl7 b;
    public final q28 c;
    public final aqi d;
    public final lw9 e;
    public final j1e f;
    public final Object g;
    public final ExecutorService h;
    public final gnf i;
    public String j;
    public final HashSet k;
    public final ArrayList l;

    static {
        new AtomicInteger(1);
    }

    public xl7(pl7 pl7Var, jvd jvdVar, ExecutorService executorService, gnf gnfVar) {
        pl7Var.a();
        vl7 vl7Var = new vl7(pl7Var.a, jvdVar);
        q28 q28Var = new q28(pl7Var);
        if (zp3.b0 == null) {
            zp3.b0 = new zp3(29);
        }
        zp3 zp3Var = zp3.b0;
        if (aqi.c == null) {
            aqi.c = new aqi(zp3Var);
        }
        aqi aqiVar = aqi.c;
        lw9 lw9Var = new lw9(new ha4(2, pl7Var));
        j1e j1eVar = new j1e();
        this.g = new Object();
        this.k = new HashSet();
        this.l = new ArrayList();
        this.a = pl7Var;
        this.b = vl7Var;
        this.c = q28Var;
        this.d = aqiVar;
        this.e = lw9Var;
        this.f = j1eVar;
        this.h = executorService;
        this.i = gnfVar;
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0040 A[Catch: all -> 0x0078, TryCatch #1 {all -> 0x0078, blocks: (B:5:0x000e, B:12:0x0022, B:14:0x0033, B:21:0x005e, B:22:0x0065, B:16:0x0040, B:18:0x0044, B:20:0x0056), top: B:39:0x000e, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005e A[Catch: all -> 0x0078, TryCatch #1 {all -> 0x0078, blocks: (B:5:0x000e, B:12:0x0022, B:14:0x0033, B:21:0x005e, B:22:0x0065, B:16:0x0040, B:18:0x0044, B:20:0x0056), top: B:39:0x000e, outer: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            r8 = this;
            java.lang.Object r0 = defpackage.xl7.m
            monitor-enter(r0)
            pl7 r1 = r8.a     // Catch: java.lang.Throwable -> L80
            r1.a()     // Catch: java.lang.Throwable -> L80
            android.content.Context r1 = r1.a     // Catch: java.lang.Throwable -> L80
            nyj r1 = defpackage.nyj.x(r1)     // Catch: java.lang.Throwable -> L80
            q28 r2 = r8.c     // Catch: java.lang.Throwable -> L78
            a91 r2 = r2.A()     // Catch: java.lang.Throwable -> L78
            int r3 = r2.b     // Catch: java.lang.Throwable -> L78
            r4 = 2
            r5 = 1
            if (r3 == r4) goto L1f
            if (r3 != r5) goto L1d
            goto L1f
        L1d:
            r3 = 0
            goto L20
        L1f:
            r3 = r5
        L20:
            if (r3 == 0) goto L7a
            j1e r3 = r8.f     // Catch: java.lang.Throwable -> L78
            pl7 r4 = r8.a     // Catch: java.lang.Throwable -> L78
            r4.a()     // Catch: java.lang.Throwable -> L78
            java.lang.String r6 = r4.b     // Catch: java.lang.Throwable -> L78
            java.lang.String r7 = "CHIME_ANDROID_SDK"
            boolean r6 = r6.equals(r7)     // Catch: java.lang.Throwable -> L78
            if (r6 != 0) goto L40
            java.lang.String r6 = "[DEFAULT]"
            r4.a()     // Catch: java.lang.Throwable -> L78
            java.lang.String r4 = r4.b     // Catch: java.lang.Throwable -> L78
            boolean r4 = r6.equals(r4)     // Catch: java.lang.Throwable -> L78
            if (r4 == 0) goto L5e
        L40:
            int r4 = r2.b     // Catch: java.lang.Throwable -> L78
            if (r4 != r5) goto L5e
            lw9 r4 = r8.e     // Catch: java.lang.Throwable -> L78
            java.lang.Object r4 = r4.get()     // Catch: java.lang.Throwable -> L78
            uv8 r4 = (defpackage.uv8) r4     // Catch: java.lang.Throwable -> L78
            java.lang.String r4 = r4.a()     // Catch: java.lang.Throwable -> L78
            boolean r6 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Throwable -> L78
            if (r6 == 0) goto L65
            r3.getClass()     // Catch: java.lang.Throwable -> L78
            java.lang.String r4 = defpackage.j1e.a()     // Catch: java.lang.Throwable -> L78
            goto L65
        L5e:
            r3.getClass()     // Catch: java.lang.Throwable -> L78
            java.lang.String r4 = defpackage.j1e.a()     // Catch: java.lang.Throwable -> L78
        L65:
            q28 r3 = r8.c     // Catch: java.lang.Throwable -> L78
            z81 r2 = r2.a()     // Catch: java.lang.Throwable -> L78
            r2.b = r4     // Catch: java.lang.Throwable -> L78
            r4 = 3
            r2.c = r4     // Catch: java.lang.Throwable -> L78
            a91 r2 = r2.a()     // Catch: java.lang.Throwable -> L78
            r3.v(r2)     // Catch: java.lang.Throwable -> L78
            goto L7a
        L78:
            r8 = move-exception
            goto L91
        L7a:
            if (r1 == 0) goto L82
            r1.b0()     // Catch: java.lang.Throwable -> L80
            goto L82
        L80:
            r8 = move-exception
            goto L97
        L82:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L80
            r8.h(r2)
            gnf r0 = r8.i
            wl7 r1 = new wl7
            r1.<init>(r8, r5)
            r0.execute(r1)
            return
        L91:
            if (r1 == 0) goto L96
            r1.b0()     // Catch: java.lang.Throwable -> L80
        L96:
            throw r8     // Catch: java.lang.Throwable -> L80
        L97:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L80
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xl7.a():void");
    }

    public final a91 b(a91 a91Var) throws FirebaseInstallationsException {
        int responseCode;
        f91 f91VarF;
        vl7 vl7Var = this.b;
        pl7 pl7Var = this.a;
        pl7Var.a();
        String str = pl7Var.c.a;
        String str2 = a91Var.a;
        pl7 pl7Var2 = this.a;
        pl7Var2.a();
        String str3 = pl7Var2.c.g;
        String str4 = a91Var.d;
        xje xjeVar = vl7Var.c;
        if (!xjeVar.a()) {
            throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.");
        }
        URL urlA = vl7.a("projects/" + str3 + "/installations/" + str2 + "/authTokens:generate");
        for (int i = 0; i <= 1; i++) {
            TrafficStats.setThreadStatsTag(32771);
            HttpURLConnection httpURLConnectionC = vl7Var.c(urlA, str);
            try {
                try {
                    httpURLConnectionC.setRequestMethod("POST");
                    httpURLConnectionC.addRequestProperty("Authorization", "FIS_v2 " + str4);
                    httpURLConnectionC.setDoOutput(true);
                    vl7.h(httpURLConnectionC);
                    responseCode = httpURLConnectionC.getResponseCode();
                    xjeVar.b(responseCode);
                } finally {
                    httpURLConnectionC.disconnect();
                    TrafficStats.clearThreadStatsTag();
                }
            } catch (IOException | AssertionError unused) {
            }
            if (responseCode >= 200 && responseCode < 300) {
                f91VarF = vl7.f(httpURLConnectionC);
            } else {
                vl7.b(httpURLConnectionC, null, str, str3);
                if (responseCode == 401 || responseCode == 404) {
                    s20 s20VarA = f91.a();
                    s20VarA.n(3);
                    f91VarF = s20VarA.c();
                } else {
                    if (responseCode == 429) {
                        throw new FirebaseInstallationsException("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                    }
                    if (responseCode < 500 || responseCode >= 600) {
                        Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                        s20 s20VarA2 = f91.a();
                        s20VarA2.n(2);
                        f91VarF = s20VarA2.c();
                    }
                }
            }
            int iF = sq6.F(f91VarF.b());
            if (iF == 0) {
                String strC = f91VarF.c();
                long jD = f91VarF.d();
                this.d.a.getClass();
                long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
                z81 z81VarA = a91Var.a();
                z81VarA.d = strC;
                z81VarA.g = Long.valueOf(jD);
                z81VarA.h = Long.valueOf(jCurrentTimeMillis);
                return z81VarA.a();
            }
            if (iF == 1) {
                z81 z81VarA2 = a91Var.a();
                z81VarA2.f = "BAD CONFIG";
                z81VarA2.c = 5;
                return z81VarA2.a();
            }
            if (iF != 2) {
                throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.");
            }
            synchronized (this) {
                this.j = null;
            }
            z81 z81VarA3 = a91Var.a();
            z81VarA3.c = 2;
            return z81VarA3.a();
        }
        throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.");
    }

    public final r5l c() {
        String str;
        e();
        synchronized (this) {
            str = this.j;
        }
        if (str != null) {
            return ez1.E(str);
        }
        j5h j5hVar = new j5h();
        x38 x38Var = new x38(j5hVar);
        synchronized (this.g) {
            this.l.add(x38Var);
        }
        r5l r5lVar = j5hVar.a;
        this.h.execute(new wl7(this, 0));
        return r5lVar;
    }

    public final r5l d() {
        e();
        j5h j5hVar = new j5h();
        g38 g38Var = new g38(this.d, j5hVar);
        synchronized (this.g) {
            this.l.add(g38Var);
        }
        r5l r5lVar = j5hVar.a;
        this.h.execute(new wl7(this, 2));
        return r5lVar;
    }

    public final void e() {
        pl7 pl7Var = this.a;
        pl7Var.a();
        dgj.t(pl7Var.c.b, "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        pl7Var.a();
        dgj.t(pl7Var.c.g, "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        pl7Var.a();
        dgj.t(pl7Var.c.a, "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        pl7Var.a();
        String str = pl7Var.c.b;
        Pattern pattern = aqi.b;
        dgj.n("Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.", str.contains(":"));
        pl7Var.a();
        dgj.n("Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.", aqi.b.matcher(pl7Var.c.a).matches());
    }

    public final a91 f(a91 a91Var) throws FirebaseInstallationsException {
        int responseCode;
        r81 r81VarE;
        String str = a91Var.a;
        String strC = (str == null || str.length() != 11) ? null : ((uv8) this.e.get()).c();
        pl7 pl7Var = this.a;
        pl7Var.a();
        String str2 = pl7Var.c.a;
        pl7Var.a();
        String str3 = pl7Var.c.g;
        pl7Var.a();
        String str4 = pl7Var.c.b;
        vl7 vl7Var = this.b;
        xje xjeVar = vl7Var.c;
        if (!xjeVar.a()) {
            throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.");
        }
        URL urlA = vl7.a("projects/" + str3 + "/installations");
        for (int i = 0; i <= 1; i++) {
            TrafficStats.setThreadStatsTag(32769);
            HttpURLConnection httpURLConnectionC = vl7Var.c(urlA, str2);
            try {
                try {
                    httpURLConnectionC.setRequestMethod("POST");
                    httpURLConnectionC.setDoOutput(true);
                    if (strC != null) {
                        httpURLConnectionC.addRequestProperty("x-goog-fis-android-iid-migration-auth", strC);
                    }
                    vl7.g(httpURLConnectionC, str, str4);
                    responseCode = httpURLConnectionC.getResponseCode();
                    xjeVar.b(responseCode);
                } catch (IOException | AssertionError unused) {
                }
                if (responseCode >= 200 && responseCode < 300) {
                    r81VarE = vl7.e(httpURLConnectionC);
                } else {
                    vl7.b(httpURLConnectionC, str4, str2, str3);
                    if (responseCode == 429) {
                        throw new FirebaseInstallationsException("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                    }
                    if (responseCode < 500 || responseCode >= 600) {
                        Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                        f4i f4iVarA = r81.a();
                        f4iVarA.i(2);
                        r81VarE = f4iVarA.b();
                    }
                    httpURLConnectionC.disconnect();
                    TrafficStats.clearThreadStatsTag();
                }
                httpURLConnectionC.disconnect();
                TrafficStats.clearThreadStatsTag();
                int iF = sq6.F(r81VarE.e());
                if (iF != 0) {
                    if (iF != 1) {
                        throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.");
                    }
                    z81 z81VarA = a91Var.a();
                    z81VarA.f = "BAD CONFIG";
                    z81VarA.c = 5;
                    return z81VarA.a();
                }
                String strC2 = r81VarE.c();
                String strD = r81VarE.d();
                this.d.a.getClass();
                long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
                String strC3 = r81VarE.b().c();
                long jD = r81VarE.b().d();
                z81 z81VarA2 = a91Var.a();
                z81VarA2.b = strC2;
                z81VarA2.c = 4;
                z81VarA2.d = strC3;
                z81VarA2.e = strD;
                z81VarA2.g = Long.valueOf(jD);
                z81VarA2.h = Long.valueOf(jCurrentTimeMillis);
                return z81VarA2.a();
            } catch (Throwable th) {
                httpURLConnectionC.disconnect();
                TrafficStats.clearThreadStatsTag();
                throw th;
            }
        }
        throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.");
    }

    public final void g(Exception exc) {
        synchronized (this.g) {
            try {
                Iterator it = this.l.iterator();
                while (it.hasNext()) {
                    if (((fmg) it.next()).a(exc)) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void h(a91 a91Var) {
        synchronized (this.g) {
            try {
                Iterator it = this.l.iterator();
                while (it.hasNext()) {
                    if (((fmg) it.next()).b(a91Var)) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
