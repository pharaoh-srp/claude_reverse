package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.internal.measurement.b0;
import com.google.android.gms.internal.measurement.c0;
import com.google.android.gms.internal.measurement.g0;
import com.google.android.gms.internal.measurement.i;
import com.google.android.gms.internal.measurement.j;
import com.google.android.gms.internal.measurement.m;
import com.google.android.gms.internal.measurement.s;
import com.google.android.gms.internal.measurement.x;
import com.google.android.gms.internal.measurement.z;
import com.google.android.gms.internal.measurement.zzlk;
import com.pvporbit.freetype.FreeTypeConstants;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.Serializable;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.TreeSet;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class o0l implements jrk {
    public static volatile o0l l0;
    public final pkk E;
    public final dik F;
    public wrj G;
    public lpj H;
    public h0l I;
    public l5l J;
    public final dik K;
    public dik L;
    public izk M;
    public fkk O;
    public final umk P;
    public boolean R;
    public long S;
    public ArrayList T;
    public int V;
    public int W;
    public boolean X;
    public boolean Y;
    public boolean Z;
    public FileLock a0;
    public FileChannel b0;
    public ArrayList c0;
    public ArrayList d0;
    public final HashMap f0;
    public final HashMap g0;
    public final HashMap h0;
    public xxk i0;
    public String j0;
    public boolean Q = false;
    public final HashSet U = new HashSet();
    public final cbi k0 = new cbi(this);
    public long e0 = -1;
    public final j0l N = new j0l(this);

    public o0l(m20 m20Var) {
        this.P = umk.a(m20Var.a, null, null);
        dik dikVar = new dik(this, 2);
        dikVar.P0();
        this.K = dikVar;
        dik dikVar2 = new dik(this, 0);
        dikVar2.P0();
        this.F = dikVar2;
        pkk pkkVar = new pkk(this);
        pkkVar.P0();
        this.E = pkkVar;
        this.f0 = new HashMap();
        this.g0 = new HashMap();
        this.h0 = new HashMap();
        O().T0(new m(this, m20Var));
    }

    public static boolean W(u1l u1lVar) {
        return (TextUtils.isEmpty(u1lVar.F) && TextUtils.isEmpty(u1lVar.U)) ? false : true;
    }

    public static o0l g(Context context) {
        dgj.v(context);
        dgj.v(context.getApplicationContext());
        if (l0 == null) {
            synchronized (o0l.class) {
                try {
                    if (l0 == null) {
                        l0 = new o0l(new m20(context, 1));
                    }
                } finally {
                }
            }
        }
        return l0;
    }

    public static void p(mhk mhkVar, int i, String str) {
        List listK = mhkVar.k();
        for (int i2 = 0; i2 < listK.size(); i2++) {
            if ("_err".equals(((z) listK.get(i2)).E())) {
                return;
            }
        }
        nhk nhkVarD = z.D();
        nhkVarD.g("_err");
        nhkVarD.f(i);
        z zVar = (z) nhkVarD.b();
        nhk nhkVarD2 = z.D();
        nhkVarD2.g("_ev");
        nhkVarD2.h(str);
        z zVar2 = (z) nhkVarD2.b();
        mhkVar.f(zVar);
        mhkVar.f(zVar2);
    }

    public static void q(mhk mhkVar, String str) {
        List listK = mhkVar.k();
        for (int i = 0; i < listK.size(); i++) {
            if (str.equals(((z) listK.get(i)).E())) {
                mhkVar.c();
                x.r(i, (x) mhkVar.F);
                return;
            }
        }
    }

    public static void t(k0l k0lVar) {
        if (k0lVar == null) {
            sz6.j("Upload Component not created");
        } else {
            if (k0lVar.G) {
                return;
            }
            sz6.j("Component not initialized: ".concat(String.valueOf(k0lVar.getClass())));
        }
    }

    public final void A() {
        O().K0();
        HashSet<String> hashSet = this.U;
        for (String str : hashSet) {
            b4l.a();
            if (N().X0(str, zvj.F0)) {
                b0().Q.c("Notifying app that trigger URIs are available. App ID", str);
                Intent intent = new Intent();
                intent.setAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                intent.setPackage(str);
                this.P.E.sendBroadcast(intent);
            }
        }
        hashSet.clear();
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x038d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01d4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void B() {
        /*
            Method dump skipped, instruction units count: 986
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o0l.B():void");
    }

    public final boolean C() {
        O().K0();
        a0();
        wrj wrjVar = this.G;
        t(wrjVar);
        if (wrjVar.y1("select count(1) > 0 from raw_events", null) != 0) {
            return true;
        }
        wrj wrjVar2 = this.G;
        t(wrjVar2);
        return !TextUtils.isEmpty(wrjVar2.S0());
    }

    public final qrk D(String str) throws Throwable {
        O().K0();
        a0();
        HashMap map = this.f0;
        qrk qrkVarK1 = (qrk) map.get(str);
        if (qrkVarK1 == null) {
            wrj wrjVar = this.G;
            t(wrjVar);
            qrkVarK1 = wrjVar.K1(str);
            if (qrkVarK1 == null) {
                qrkVarK1 = qrk.c;
            }
            O().K0();
            a0();
            map.put(str, qrkVarK1);
            wrj wrjVar2 = this.G;
            t(wrjVar2);
            wrjVar2.B1(str, qrkVarK1);
        }
        return qrkVarK1;
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x0195 A[Catch: all -> 0x005d, TryCatch #1 {all -> 0x005d, blocks: (B:8:0x0030, B:17:0x004c, B:71:0x0198, B:25:0x006a, B:30:0x00c6, B:29:0x00b4, B:32:0x00cd, B:35:0x00d9, B:37:0x00df, B:40:0x00e9, B:43:0x00f5, B:45:0x00fb, B:50:0x0108, B:54:0x011e, B:56:0x0136, B:58:0x0156, B:60:0x015f, B:62:0x0165, B:63:0x0169, B:65:0x0175, B:67:0x017e, B:69:0x018d, B:70:0x0195, B:57:0x0142, B:51:0x010f, B:53:0x0118), top: B:80:0x0030, outer: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void E(java.lang.String r9, int r10, java.lang.Throwable r11, byte[] r12, java.util.Map r13) {
        /*
            Method dump skipped, instruction units count: 445
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o0l.E(java.lang.String, int, java.lang.Throwable, byte[], java.util.Map):void");
    }

    public final void F(kqj kqjVar, u1l u1lVar) {
        rvj rvjVar;
        boolean z;
        dgj.s(kqjVar.E);
        dgj.v(kqjVar.F);
        dgj.v(kqjVar.G);
        dgj.s(kqjVar.G.F);
        O().K0();
        a0();
        if (W(u1lVar)) {
            if (!u1lVar.L) {
                f(u1lVar);
                return;
            }
            kqj kqjVar2 = new kqj(kqjVar);
            boolean z2 = false;
            kqjVar2.I = false;
            wrj wrjVar = this.G;
            t(wrjVar);
            wrjVar.O1();
            try {
                wrj wrjVar2 = this.G;
                t(wrjVar2);
                String str = kqjVar2.E;
                dgj.v(str);
                kqj kqjVarE1 = wrjVar2.E1(str, kqjVar2.G.F);
                umk umkVar = this.P;
                if (kqjVarE1 != null && !kqjVarE1.F.equals(kqjVar2.F)) {
                    b0().M.d("Updating a conditional user property with different origin. name, origin, origin (from DB)", umkVar.Q.g(kqjVar2.G.F), kqjVar2.F, kqjVarE1.F);
                }
                if (kqjVarE1 != null && (z = kqjVarE1.I)) {
                    kqjVar2.F = kqjVarE1.F;
                    kqjVar2.H = kqjVarE1.H;
                    kqjVar2.L = kqjVarE1.L;
                    kqjVar2.J = kqjVarE1.J;
                    kqjVar2.M = kqjVarE1.M;
                    kqjVar2.I = z;
                    e1l e1lVar = kqjVar2.G;
                    kqjVar2.G = new e1l(kqjVarE1.G.G, e1lVar.zza(), e1lVar.F, kqjVarE1.G.J);
                } else if (TextUtils.isEmpty(kqjVar2.J)) {
                    e1l e1lVar2 = kqjVar2.G;
                    kqjVar2.G = new e1l(kqjVar2.H, e1lVar2.zza(), e1lVar2.F, kqjVar2.G.J);
                    z2 = true;
                    kqjVar2.I = true;
                }
                if (kqjVar2.I) {
                    e1l e1lVar3 = kqjVar2.G;
                    String str2 = kqjVar2.E;
                    dgj.v(str2);
                    String str3 = kqjVar2.F;
                    String str4 = e1lVar3.F;
                    long j = e1lVar3.G;
                    Object objZza = e1lVar3.zza();
                    dgj.v(objZza);
                    f1l f1lVar = new f1l(str2, str3, str4, j, objZza);
                    Object obj = f1lVar.e;
                    String str5 = f1lVar.c;
                    wrj wrjVar3 = this.G;
                    t(wrjVar3);
                    if (wrjVar3.u1(f1lVar)) {
                        b0().Q.d("User property updated immediately", kqjVar2.E, umkVar.Q.g(str5), obj);
                    } else {
                        b0().J.d("(2)Too many active user properties, ignoring", qgk.Q0(kqjVar2.E), umkVar.Q.g(str5), obj);
                    }
                    if (z2 && (rvjVar = kqjVar2.M) != null) {
                        K(new rvj(rvjVar, kqjVar2.H), u1lVar);
                    }
                }
                wrj wrjVar4 = this.G;
                t(wrjVar4);
                if (wrjVar4.s1(kqjVar2)) {
                    b0().Q.d("Conditional property added", kqjVar2.E, umkVar.Q.g(kqjVar2.G.F), kqjVar2.G.zza());
                } else {
                    b0().J.d("Too many conditional properties, ignoring", qgk.Q0(kqjVar2.E), umkVar.Q.g(kqjVar2.G.F), kqjVar2.G.zza());
                }
                wrj wrjVar5 = this.G;
                t(wrjVar5);
                wrjVar5.V1();
                wrj wrjVar6 = this.G;
                t(wrjVar6);
                wrjVar6.T1();
            } catch (Throwable th) {
                wrj wrjVar7 = this.G;
                t(wrjVar7);
                wrjVar7.T1();
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void G(defpackage.rvj r11, defpackage.u1l r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o0l.G(rvj, u1l):void");
    }

    public final void H(mjk mjkVar) {
        O().K0();
        if (TextUtils.isEmpty(mjkVar.j()) && TextUtils.isEmpty(mjkVar.d())) {
            String strF = mjkVar.f();
            dgj.v(strF);
            E(strF, 204, null, null, null);
            return;
        }
        g3l.a();
        bp0 bp0Var = null;
        boolean zX0 = N().X0(null, zvj.B0);
        dik dikVar = this.F;
        pkk pkkVar = this.E;
        if (!zX0) {
            this.N.getClass();
            String strO0 = j0l.O0(mjkVar);
            try {
                String strF2 = mjkVar.f();
                dgj.v(strF2);
                URL url = new URL(strO0);
                b0().R.c("Fetching remote configuration", strF2);
                t(pkkVar);
                m mVarC1 = pkkVar.c1(strF2);
                t(pkkVar);
                pkkVar.K0();
                String str = (String) pkkVar.Q.get(strF2);
                if (mVarC1 != null) {
                    if (!TextUtils.isEmpty(str)) {
                        bp0Var = new bp0(0);
                        bp0Var.put("If-Modified-Since", str);
                    }
                    t(pkkVar);
                    pkkVar.K0();
                    String str2 = (String) pkkVar.R.get(strF2);
                    if (!TextUtils.isEmpty(str2)) {
                        if (bp0Var == null) {
                            bp0Var = new bp0(0);
                        }
                        bp0Var.put("If-None-Match", str2);
                    }
                }
                this.X = true;
                t(dikVar);
                c6k c6kVar = new c6k(this);
                dikVar.K0();
                dikVar.O0();
                dikVar.O().R0(new rik(dikVar, strF2, url, null, bp0Var, c6kVar));
                return;
            } catch (MalformedURLException unused) {
                b0().J.a(qgk.Q0(mjkVar.f()), strO0, "Failed to parse config URL. Not fetching. appId");
                return;
            }
        }
        String strF3 = mjkVar.f();
        dgj.v(strF3);
        b0().R.c("Fetching remote configuration", strF3);
        t(pkkVar);
        m mVarC12 = pkkVar.c1(strF3);
        t(pkkVar);
        pkkVar.K0();
        String str3 = (String) pkkVar.Q.get(strF3);
        if (mVarC12 != null) {
            if (!TextUtils.isEmpty(str3)) {
                bp0Var = new bp0(0);
                bp0Var.put("If-Modified-Since", str3);
            }
            t(pkkVar);
            pkkVar.K0();
            String str4 = (String) pkkVar.R.get(strF3);
            if (!TextUtils.isEmpty(str4)) {
                if (bp0Var == null) {
                    bp0Var = new bp0(0);
                }
                bp0Var.put("If-None-Match", str4);
            }
        }
        bp0 bp0Var2 = bp0Var;
        this.X = true;
        t(dikVar);
        fnf fnfVar = new fnf(28, this);
        dikVar.K0();
        dikVar.O0();
        dikVar.F.N.getClass();
        String strO02 = j0l.O0(mjkVar);
        try {
            dikVar.O().R0(new rik(dikVar, mjkVar.f(), new URI(strO02).toURL(), null, bp0Var2, fnfVar));
        } catch (IllegalArgumentException | MalformedURLException | URISyntaxException unused2) {
            dikVar.b0().J.a(qgk.Q0(mjkVar.f()), strO02, "Failed to parse config URL. Not fetching. appId");
        }
    }

    public final void I(mjk mjkVar, phk phkVar) {
        O().K0();
        a0();
        ihk ihkVarX = s.x();
        umk umkVar = mjkVar.a;
        wlk wlkVar = umkVar.N;
        umk.d(wlkVar);
        wlkVar.K0();
        byte[] bArr = mjkVar.I;
        if (bArr != null) {
            try {
                ihkVarX = (ihk) dik.e1(ihkVarX, bArr);
            } catch (zzlk unused) {
                b0().M.c("Failed to parse locally stored ad campaign info. appId", qgk.Q0(mjkVar.f()));
            }
        }
        for (x xVar : phkVar.m()) {
            if (xVar.D().equals("_cmp")) {
                Serializable serializableV1 = dik.v1(xVar, "gclid");
                if (serializableV1 == null) {
                    serializableV1 = "";
                }
                String str = (String) serializableV1;
                Serializable serializableV12 = dik.v1(xVar, "gbraid");
                if (serializableV12 == null) {
                    serializableV12 = "";
                }
                String str2 = (String) serializableV12;
                Serializable serializableV13 = dik.v1(xVar, "gad_source");
                String str3 = (String) (serializableV13 != null ? serializableV13 : "");
                if (!str.isEmpty() || !str2.isEmpty()) {
                    Serializable serializableV14 = dik.v1(xVar, "click_timestamp");
                    long jLongValue = ((Long) (serializableV14 != null ? serializableV14 : 0L)).longValue();
                    if (jLongValue <= 0) {
                        jLongValue = xVar.B();
                    }
                    if ("referrer API v2".equals(dik.v1(xVar, "_cis"))) {
                        if (jLongValue > ihkVarX.i()) {
                            if (str.isEmpty()) {
                                ihkVarX.u();
                            } else {
                                ihkVarX.s(str);
                            }
                            if (str2.isEmpty()) {
                                ihkVarX.t();
                            } else {
                                ihkVarX.q(str2);
                            }
                            if (str3.isEmpty()) {
                                ihkVarX.r();
                            } else {
                                ihkVarX.o(str3);
                            }
                            ihkVarX.j(jLongValue);
                        }
                    } else if (jLongValue > ihkVarX.f()) {
                        if (str.isEmpty()) {
                            ihkVarX.p();
                        } else {
                            ihkVarX.m(str);
                        }
                        if (str2.isEmpty()) {
                            ihkVarX.n();
                        } else {
                            ihkVarX.k(str2);
                        }
                        if (str3.isEmpty()) {
                            ihkVarX.l();
                        } else {
                            ihkVarX.h(str3);
                        }
                        ihkVarX.g(jLongValue);
                    }
                }
            }
        }
        if (!((s) ihkVarX.b()).equals(s.D())) {
            s sVar = (s) ihkVarX.b();
            phkVar.c();
            c0.w((c0) phkVar.F, sVar);
        }
        byte[] bArrC = ((s) ihkVarX.b()).c();
        wlk wlkVar2 = umkVar.N;
        umk.d(wlkVar2);
        wlkVar2.K0();
        mjkVar.Q |= mjkVar.I != bArrC;
        mjkVar.I = bArrC;
        if (mjkVar.o()) {
            wrj wrjVar = this.G;
            t(wrjVar);
            wrjVar.p1(mjkVar, false);
        }
    }

    public final u1l J(String str) {
        wrj wrjVar = this.G;
        t(wrjVar);
        mjk mjkVarG1 = wrjVar.G1(str);
        if (mjkVarG1 != null) {
            umk umkVar = mjkVarG1.a;
            if (!TextUtils.isEmpty(mjkVarG1.h())) {
                Boolean boolC = c(mjkVarG1);
                if (boolC != null && !boolC.booleanValue()) {
                    b0().J.c("App version does not match; dropping. appId", qgk.Q0(str));
                    return null;
                }
                String strJ = mjkVarG1.j();
                String strH = mjkVarG1.h();
                long jZ = mjkVarG1.z();
                wlk wlkVar = umkVar.N;
                umk.d(wlkVar);
                wlkVar.K0();
                String str2 = mjkVarG1.l;
                wlk wlkVar2 = umkVar.N;
                umk.d(wlkVar2);
                wlkVar2.K0();
                long j = mjkVarG1.m;
                wlk wlkVar3 = umkVar.N;
                umk.d(wlkVar3);
                wlkVar3.K0();
                long j2 = mjkVarG1.n;
                wlk wlkVar4 = umkVar.N;
                umk.d(wlkVar4);
                wlkVar4.K0();
                boolean z = mjkVarG1.o;
                String strI = mjkVarG1.i();
                wlk wlkVar5 = umkVar.N;
                umk.d(wlkVar5);
                wlkVar5.K0();
                boolean zN = mjkVarG1.n();
                String strD = mjkVarG1.d();
                Boolean boolV = mjkVarG1.V();
                long jO = mjkVarG1.O();
                wlk wlkVar6 = umkVar.N;
                umk.d(wlkVar6);
                wlkVar6.K0();
                ArrayList arrayList = mjkVarG1.t;
                String strO = D(str).o();
                boolean zP = mjkVarG1.p();
                wlk wlkVar7 = umkVar.N;
                umk.d(wlkVar7);
                wlkVar7.K0();
                long j3 = mjkVarG1.w;
                int i = D(str).b;
                String str3 = L(str).b;
                wlk wlkVar8 = umkVar.N;
                umk.d(wlkVar8);
                wlkVar8.K0();
                int i2 = mjkVarG1.y;
                wlk wlkVar9 = umkVar.N;
                umk.d(wlkVar9);
                wlkVar9.K0();
                return new u1l(str, strJ, strH, jZ, str2, j, j2, null, z, false, strI, 0L, 0, zN, false, strD, boolV, jO, arrayList, strO, "", null, zP, j3, i, str3, i2, mjkVarG1.C, mjkVarG1.l(), mjkVarG1.k());
            }
        }
        b0().Q.c("No app data available; dropping", str);
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:353:0x0af8, code lost:
    
        r12 = true;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:114:0x03d3  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0423 A[Catch: all -> 0x0246, TryCatch #3 {all -> 0x0246, blocks: (B:51:0x0228, B:54:0x0235, B:56:0x023d, B:63:0x024b, B:115:0x03d7, B:117:0x0423, B:119:0x0429, B:120:0x0440, B:124:0x0451, B:126:0x046b, B:128:0x0471, B:129:0x0488, B:135:0x04b1, B:139:0x04d5, B:140:0x04ec, B:144:0x04fd, B:147:0x0518, B:148:0x0528, B:150:0x0530, B:152:0x053c, B:154:0x0542, B:155:0x054b, B:157:0x0557, B:159:0x055f, B:161:0x0567, B:163:0x056d, B:165:0x0571, B:166:0x057d, B:168:0x0589, B:169:0x059e, B:171:0x05c9, B:174:0x05f2, B:178:0x0641, B:180:0x065c, B:182:0x068b, B:183:0x068e, B:185:0x0694, B:187:0x069c, B:189:0x06a2, B:191:0x06aa, B:193:0x06b0, B:197:0x06bf, B:200:0x06cb, B:202:0x06d4, B:204:0x06dc, B:206:0x070a, B:208:0x0710, B:209:0x0715, B:212:0x0726, B:214:0x073c, B:220:0x0753, B:224:0x0766, B:229:0x0774, B:231:0x077b, B:235:0x0789, B:239:0x0798, B:243:0x07a7, B:247:0x07b6, B:251:0x07c5, B:255:0x07d2, B:259:0x07e1, B:261:0x07f0, B:263:0x07f6, B:264:0x07f9, B:266:0x0808, B:267:0x080b, B:270:0x0821, B:272:0x082c, B:274:0x083a, B:277:0x0846, B:279:0x0851, B:280:0x085a, B:282:0x0869, B:284:0x0873, B:286:0x087f, B:288:0x0889, B:290:0x0897, B:293:0x08b1, B:295:0x08bf, B:297:0x08d9, B:299:0x08e7, B:304:0x0919, B:306:0x0928, B:308:0x0969, B:311:0x0974, B:312:0x097e, B:313:0x097f, B:315:0x0989, B:317:0x09a9, B:318:0x09b4, B:320:0x09ee, B:322:0x09f4, B:324:0x09fe, B:325:0x0a08, B:327:0x0a12, B:328:0x0a1c, B:329:0x0a25, B:331:0x0a2b, B:333:0x0a75, B:335:0x0a87, B:339:0x0aa6, B:341:0x0ab6, B:338:0x0a96, B:345:0x0ac9, B:346:0x0ad7, B:348:0x0adf, B:349:0x0ae3, B:351:0x0aec, B:354:0x0afb, B:356:0x0b27, B:359:0x0b3e, B:361:0x0b44, B:364:0x0b5f, B:363:0x0b4a, B:301:0x08f3, B:303:0x0905, B:273:0x0831, B:179:0x064b, B:70:0x0268, B:73:0x0272, B:75:0x0287, B:81:0x029f, B:89:0x02d5, B:91:0x02db, B:93:0x02e9, B:95:0x0301, B:98:0x030a, B:111:0x0399, B:113:0x03a3, B:100:0x0337, B:101:0x0350, B:103:0x0356, B:110:0x037e, B:109:0x0369, B:84:0x02ab, B:88:0x02d1), top: B:376:0x0228, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x044f  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x0920  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x0ac1  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0307  */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v34 */
    /* JADX WARN: Type inference failed for: r4v35, types: [int] */
    /* JADX WARN: Type inference failed for: r4v76 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void K(defpackage.rvj r53, defpackage.u1l r54) {
        /*
            Method dump skipped, instruction units count: 2968
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o0l.K(rvj, u1l):void");
    }

    public final buj L(String str) {
        O().K0();
        a0();
        HashMap map = this.g0;
        buj bujVar = (buj) map.get(str);
        if (bujVar != null) {
            return bujVar;
        }
        wrj wrjVar = this.G;
        t(wrjVar);
        dgj.v(str);
        wrjVar.K0();
        wrjVar.O0();
        buj bujVarC = buj.c(wrjVar.Y0("select dma_consent_settings from consent_settings where app_id=? limit 1;", new String[]{str}));
        map.put(str, bujVarC);
        return bujVarC;
    }

    /* JADX WARN: Removed duplicated region for block: B:130:0x03ae A[Catch: all -> 0x00db, TryCatch #5 {all -> 0x00db, blocks: (B:25:0x00be, B:27:0x00ce, B:34:0x00e2, B:38:0x00f1, B:40:0x00fe, B:42:0x0108, B:44:0x010e, B:45:0x0111, B:48:0x0121, B:50:0x0134, B:51:0x0159, B:53:0x0167, B:55:0x01b6, B:61:0x01cb, B:64:0x01dd, B:66:0x01e8, B:71:0x01f7, B:74:0x0205, B:78:0x0210, B:80:0x0213, B:82:0x0238, B:84:0x023d, B:90:0x025b, B:93:0x026d, B:96:0x0293, B:128:0x0380, B:130:0x03ae, B:131:0x03b1, B:133:0x03c9, B:173:0x0482, B:174:0x0485, B:184:0x050b, B:135:0x03dc, B:140:0x03f9, B:142:0x0401, B:144:0x0409, B:148:0x041c, B:152:0x042b, B:156:0x0436, B:159:0x0446, B:164:0x0463, B:166:0x046b, B:168:0x0473, B:170:0x0479, B:162:0x0451, B:149:0x0422, B:138:0x03e7, B:98:0x02a3, B:100:0x02b1, B:101:0x02c0, B:103:0x02ed, B:104:0x02fd, B:106:0x0304, B:108:0x030a, B:110:0x0314, B:112:0x031a, B:114:0x0320, B:116:0x0326, B:117:0x032b, B:123:0x034c, B:125:0x0350, B:126:0x0363, B:127:0x0372, B:177:0x04a2, B:179:0x04d0, B:180:0x04d3, B:181:0x04eb, B:183:0x04ef, B:87:0x024c), top: B:199:0x00be, inners: #1, #2, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x03c9 A[Catch: all -> 0x00db, TRY_LEAVE, TryCatch #5 {all -> 0x00db, blocks: (B:25:0x00be, B:27:0x00ce, B:34:0x00e2, B:38:0x00f1, B:40:0x00fe, B:42:0x0108, B:44:0x010e, B:45:0x0111, B:48:0x0121, B:50:0x0134, B:51:0x0159, B:53:0x0167, B:55:0x01b6, B:61:0x01cb, B:64:0x01dd, B:66:0x01e8, B:71:0x01f7, B:74:0x0205, B:78:0x0210, B:80:0x0213, B:82:0x0238, B:84:0x023d, B:90:0x025b, B:93:0x026d, B:96:0x0293, B:128:0x0380, B:130:0x03ae, B:131:0x03b1, B:133:0x03c9, B:173:0x0482, B:174:0x0485, B:184:0x050b, B:135:0x03dc, B:140:0x03f9, B:142:0x0401, B:144:0x0409, B:148:0x041c, B:152:0x042b, B:156:0x0436, B:159:0x0446, B:164:0x0463, B:166:0x046b, B:168:0x0473, B:170:0x0479, B:162:0x0451, B:149:0x0422, B:138:0x03e7, B:98:0x02a3, B:100:0x02b1, B:101:0x02c0, B:103:0x02ed, B:104:0x02fd, B:106:0x0304, B:108:0x030a, B:110:0x0314, B:112:0x031a, B:114:0x0320, B:116:0x0326, B:117:0x032b, B:123:0x034c, B:125:0x0350, B:126:0x0363, B:127:0x0372, B:177:0x04a2, B:179:0x04d0, B:180:0x04d3, B:181:0x04eb, B:183:0x04ef, B:87:0x024c), top: B:199:0x00be, inners: #1, #2, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0445  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0482 A[Catch: all -> 0x00db, TryCatch #5 {all -> 0x00db, blocks: (B:25:0x00be, B:27:0x00ce, B:34:0x00e2, B:38:0x00f1, B:40:0x00fe, B:42:0x0108, B:44:0x010e, B:45:0x0111, B:48:0x0121, B:50:0x0134, B:51:0x0159, B:53:0x0167, B:55:0x01b6, B:61:0x01cb, B:64:0x01dd, B:66:0x01e8, B:71:0x01f7, B:74:0x0205, B:78:0x0210, B:80:0x0213, B:82:0x0238, B:84:0x023d, B:90:0x025b, B:93:0x026d, B:96:0x0293, B:128:0x0380, B:130:0x03ae, B:131:0x03b1, B:133:0x03c9, B:173:0x0482, B:174:0x0485, B:184:0x050b, B:135:0x03dc, B:140:0x03f9, B:142:0x0401, B:144:0x0409, B:148:0x041c, B:152:0x042b, B:156:0x0436, B:159:0x0446, B:164:0x0463, B:166:0x046b, B:168:0x0473, B:170:0x0479, B:162:0x0451, B:149:0x0422, B:138:0x03e7, B:98:0x02a3, B:100:0x02b1, B:101:0x02c0, B:103:0x02ed, B:104:0x02fd, B:106:0x0304, B:108:0x030a, B:110:0x0314, B:112:0x031a, B:114:0x0320, B:116:0x0326, B:117:0x032b, B:123:0x034c, B:125:0x0350, B:126:0x0363, B:127:0x0372, B:177:0x04a2, B:179:0x04d0, B:180:0x04d3, B:181:0x04eb, B:183:0x04ef, B:87:0x024c), top: B:199:0x00be, inners: #1, #2, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:181:0x04eb A[Catch: all -> 0x00db, TryCatch #5 {all -> 0x00db, blocks: (B:25:0x00be, B:27:0x00ce, B:34:0x00e2, B:38:0x00f1, B:40:0x00fe, B:42:0x0108, B:44:0x010e, B:45:0x0111, B:48:0x0121, B:50:0x0134, B:51:0x0159, B:53:0x0167, B:55:0x01b6, B:61:0x01cb, B:64:0x01dd, B:66:0x01e8, B:71:0x01f7, B:74:0x0205, B:78:0x0210, B:80:0x0213, B:82:0x0238, B:84:0x023d, B:90:0x025b, B:93:0x026d, B:96:0x0293, B:128:0x0380, B:130:0x03ae, B:131:0x03b1, B:133:0x03c9, B:173:0x0482, B:174:0x0485, B:184:0x050b, B:135:0x03dc, B:140:0x03f9, B:142:0x0401, B:144:0x0409, B:148:0x041c, B:152:0x042b, B:156:0x0436, B:159:0x0446, B:164:0x0463, B:166:0x046b, B:168:0x0473, B:170:0x0479, B:162:0x0451, B:149:0x0422, B:138:0x03e7, B:98:0x02a3, B:100:0x02b1, B:101:0x02c0, B:103:0x02ed, B:104:0x02fd, B:106:0x0304, B:108:0x030a, B:110:0x0314, B:112:0x031a, B:114:0x0320, B:116:0x0326, B:117:0x032b, B:123:0x034c, B:125:0x0350, B:126:0x0363, B:127:0x0372, B:177:0x04a2, B:179:0x04d0, B:180:0x04d3, B:181:0x04eb, B:183:0x04ef, B:87:0x024c), top: B:199:0x00be, inners: #1, #2, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:193:0x03dc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0121 A[Catch: all -> 0x00db, TRY_ENTER, TryCatch #5 {all -> 0x00db, blocks: (B:25:0x00be, B:27:0x00ce, B:34:0x00e2, B:38:0x00f1, B:40:0x00fe, B:42:0x0108, B:44:0x010e, B:45:0x0111, B:48:0x0121, B:50:0x0134, B:51:0x0159, B:53:0x0167, B:55:0x01b6, B:61:0x01cb, B:64:0x01dd, B:66:0x01e8, B:71:0x01f7, B:74:0x0205, B:78:0x0210, B:80:0x0213, B:82:0x0238, B:84:0x023d, B:90:0x025b, B:93:0x026d, B:96:0x0293, B:128:0x0380, B:130:0x03ae, B:131:0x03b1, B:133:0x03c9, B:173:0x0482, B:174:0x0485, B:184:0x050b, B:135:0x03dc, B:140:0x03f9, B:142:0x0401, B:144:0x0409, B:148:0x041c, B:152:0x042b, B:156:0x0436, B:159:0x0446, B:164:0x0463, B:166:0x046b, B:168:0x0473, B:170:0x0479, B:162:0x0451, B:149:0x0422, B:138:0x03e7, B:98:0x02a3, B:100:0x02b1, B:101:0x02c0, B:103:0x02ed, B:104:0x02fd, B:106:0x0304, B:108:0x030a, B:110:0x0314, B:112:0x031a, B:114:0x0320, B:116:0x0326, B:117:0x032b, B:123:0x034c, B:125:0x0350, B:126:0x0363, B:127:0x0372, B:177:0x04a2, B:179:0x04d0, B:180:0x04d3, B:181:0x04eb, B:183:0x04ef, B:87:0x024c), top: B:199:0x00be, inners: #1, #2, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01dd A[Catch: all -> 0x00db, TryCatch #5 {all -> 0x00db, blocks: (B:25:0x00be, B:27:0x00ce, B:34:0x00e2, B:38:0x00f1, B:40:0x00fe, B:42:0x0108, B:44:0x010e, B:45:0x0111, B:48:0x0121, B:50:0x0134, B:51:0x0159, B:53:0x0167, B:55:0x01b6, B:61:0x01cb, B:64:0x01dd, B:66:0x01e8, B:71:0x01f7, B:74:0x0205, B:78:0x0210, B:80:0x0213, B:82:0x0238, B:84:0x023d, B:90:0x025b, B:93:0x026d, B:96:0x0293, B:128:0x0380, B:130:0x03ae, B:131:0x03b1, B:133:0x03c9, B:173:0x0482, B:174:0x0485, B:184:0x050b, B:135:0x03dc, B:140:0x03f9, B:142:0x0401, B:144:0x0409, B:148:0x041c, B:152:0x042b, B:156:0x0436, B:159:0x0446, B:164:0x0463, B:166:0x046b, B:168:0x0473, B:170:0x0479, B:162:0x0451, B:149:0x0422, B:138:0x03e7, B:98:0x02a3, B:100:0x02b1, B:101:0x02c0, B:103:0x02ed, B:104:0x02fd, B:106:0x0304, B:108:0x030a, B:110:0x0314, B:112:0x031a, B:114:0x0320, B:116:0x0326, B:117:0x032b, B:123:0x034c, B:125:0x0350, B:126:0x0363, B:127:0x0372, B:177:0x04a2, B:179:0x04d0, B:180:0x04d3, B:181:0x04eb, B:183:0x04ef, B:87:0x024c), top: B:199:0x00be, inners: #1, #2, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0213 A[Catch: all -> 0x00db, TryCatch #5 {all -> 0x00db, blocks: (B:25:0x00be, B:27:0x00ce, B:34:0x00e2, B:38:0x00f1, B:40:0x00fe, B:42:0x0108, B:44:0x010e, B:45:0x0111, B:48:0x0121, B:50:0x0134, B:51:0x0159, B:53:0x0167, B:55:0x01b6, B:61:0x01cb, B:64:0x01dd, B:66:0x01e8, B:71:0x01f7, B:74:0x0205, B:78:0x0210, B:80:0x0213, B:82:0x0238, B:84:0x023d, B:90:0x025b, B:93:0x026d, B:96:0x0293, B:128:0x0380, B:130:0x03ae, B:131:0x03b1, B:133:0x03c9, B:173:0x0482, B:174:0x0485, B:184:0x050b, B:135:0x03dc, B:140:0x03f9, B:142:0x0401, B:144:0x0409, B:148:0x041c, B:152:0x042b, B:156:0x0436, B:159:0x0446, B:164:0x0463, B:166:0x046b, B:168:0x0473, B:170:0x0479, B:162:0x0451, B:149:0x0422, B:138:0x03e7, B:98:0x02a3, B:100:0x02b1, B:101:0x02c0, B:103:0x02ed, B:104:0x02fd, B:106:0x0304, B:108:0x030a, B:110:0x0314, B:112:0x031a, B:114:0x0320, B:116:0x0326, B:117:0x032b, B:123:0x034c, B:125:0x0350, B:126:0x0363, B:127:0x0372, B:177:0x04a2, B:179:0x04d0, B:180:0x04d3, B:181:0x04eb, B:183:0x04ef, B:87:0x024c), top: B:199:0x00be, inners: #1, #2, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x023d A[Catch: all -> 0x00db, TryCatch #5 {all -> 0x00db, blocks: (B:25:0x00be, B:27:0x00ce, B:34:0x00e2, B:38:0x00f1, B:40:0x00fe, B:42:0x0108, B:44:0x010e, B:45:0x0111, B:48:0x0121, B:50:0x0134, B:51:0x0159, B:53:0x0167, B:55:0x01b6, B:61:0x01cb, B:64:0x01dd, B:66:0x01e8, B:71:0x01f7, B:74:0x0205, B:78:0x0210, B:80:0x0213, B:82:0x0238, B:84:0x023d, B:90:0x025b, B:93:0x026d, B:96:0x0293, B:128:0x0380, B:130:0x03ae, B:131:0x03b1, B:133:0x03c9, B:173:0x0482, B:174:0x0485, B:184:0x050b, B:135:0x03dc, B:140:0x03f9, B:142:0x0401, B:144:0x0409, B:148:0x041c, B:152:0x042b, B:156:0x0436, B:159:0x0446, B:164:0x0463, B:166:0x046b, B:168:0x0473, B:170:0x0479, B:162:0x0451, B:149:0x0422, B:138:0x03e7, B:98:0x02a3, B:100:0x02b1, B:101:0x02c0, B:103:0x02ed, B:104:0x02fd, B:106:0x0304, B:108:0x030a, B:110:0x0314, B:112:0x031a, B:114:0x0320, B:116:0x0326, B:117:0x032b, B:123:0x034c, B:125:0x0350, B:126:0x0363, B:127:0x0372, B:177:0x04a2, B:179:0x04d0, B:180:0x04d3, B:181:0x04eb, B:183:0x04ef, B:87:0x024c), top: B:199:0x00be, inners: #1, #2, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x025b A[Catch: all -> 0x00db, TRY_LEAVE, TryCatch #5 {all -> 0x00db, blocks: (B:25:0x00be, B:27:0x00ce, B:34:0x00e2, B:38:0x00f1, B:40:0x00fe, B:42:0x0108, B:44:0x010e, B:45:0x0111, B:48:0x0121, B:50:0x0134, B:51:0x0159, B:53:0x0167, B:55:0x01b6, B:61:0x01cb, B:64:0x01dd, B:66:0x01e8, B:71:0x01f7, B:74:0x0205, B:78:0x0210, B:80:0x0213, B:82:0x0238, B:84:0x023d, B:90:0x025b, B:93:0x026d, B:96:0x0293, B:128:0x0380, B:130:0x03ae, B:131:0x03b1, B:133:0x03c9, B:173:0x0482, B:174:0x0485, B:184:0x050b, B:135:0x03dc, B:140:0x03f9, B:142:0x0401, B:144:0x0409, B:148:0x041c, B:152:0x042b, B:156:0x0436, B:159:0x0446, B:164:0x0463, B:166:0x046b, B:168:0x0473, B:170:0x0479, B:162:0x0451, B:149:0x0422, B:138:0x03e7, B:98:0x02a3, B:100:0x02b1, B:101:0x02c0, B:103:0x02ed, B:104:0x02fd, B:106:0x0304, B:108:0x030a, B:110:0x0314, B:112:0x031a, B:114:0x0320, B:116:0x0326, B:117:0x032b, B:123:0x034c, B:125:0x0350, B:126:0x0363, B:127:0x0372, B:177:0x04a2, B:179:0x04d0, B:180:0x04d3, B:181:0x04eb, B:183:0x04ef, B:87:0x024c), top: B:199:0x00be, inners: #1, #2, #4 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void M(defpackage.u1l r31) {
        /*
            Method dump skipped, instruction units count: 1317
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o0l.M(u1l):void");
    }

    public final vqj N() {
        umk umkVar = this.P;
        dgj.v(umkVar);
        return umkVar.K;
    }

    @Override // defpackage.jrk
    public final wlk O() {
        umk umkVar = this.P;
        dgj.v(umkVar);
        wlk wlkVar = umkVar.N;
        umk.d(wlkVar);
        return wlkVar;
    }

    public final void P(String str) {
        String str2;
        dik dikVar;
        URL url;
        Map mapH;
        uvj uvjVar;
        O().K0();
        a0();
        this.Z = true;
        try {
            Boolean bool = this.P.n().I;
            if (bool == null) {
                b0().M.b("Upload data called on the client side before use of service was decided");
                this.Z = false;
                z();
                return;
            }
            if (bool.booleanValue()) {
                b0().J.b("Upload called in the client side when service should be used");
                this.Z = false;
                z();
                return;
            }
            if (this.S > 0) {
                B();
                this.Z = false;
                z();
                return;
            }
            O().K0();
            if (this.c0 != null) {
                b0().R.b("Uploading requested multiple times");
                this.Z = false;
                z();
                return;
            }
            dik dikVar2 = this.F;
            t(dikVar2);
            if (!dikVar2.C1()) {
                b0().R.b("Network not connected, ignoring upload request");
                B();
                this.Z = false;
                z();
                return;
            }
            wrj wrjVar = this.G;
            t(wrjVar);
            if (!wrjVar.S1(str)) {
                b0().R.c("Upload queue has no batches for appId", str);
                this.Z = false;
                z();
                return;
            }
            wrj wrjVar2 = this.G;
            t(wrjVar2);
            d1l d1lVarM1 = wrjVar2.M1(str);
            if (d1lVarM1 == null) {
                this.Z = false;
                z();
                return;
            }
            b0 b0VarF = d1lVarM1.f();
            if (b0VarF == null) {
                this.Z = false;
                z();
                return;
            }
            dik dikVar3 = this.K;
            t(dikVar3);
            String strY0 = dikVar3.Y0(b0VarF);
            byte[] bArrC = b0VarF.c();
            b0().R.d("Uploading data from upload queue. appId, uncompressed size, data", str, Integer.valueOf(bArrC.length), strY0);
            try {
                this.Y = true;
                dikVar = this.F;
                t(dikVar);
                url = new URL(d1lVarM1.g());
                mapH = d1lVarM1.h();
                uvjVar = new uvj(this, str, d1lVarM1, 7);
                dikVar.K0();
                dikVar.O0();
                str2 = str;
            } catch (MalformedURLException unused) {
                str2 = str;
            }
            try {
                dikVar.O().R0(new rik(dikVar, str2, url, bArrC, mapH, uvjVar));
            } catch (MalformedURLException unused2) {
                b0().J.a(qgk.Q0(str2), d1lVarM1.g(), "Failed to parse URL. Not uploading MeasurementBatch. appId");
            }
            this.Z = false;
            z();
        } catch (Throwable th) {
            this.Z = false;
            z();
            throw th;
        }
    }

    public final void Q(u1l u1lVar) {
        if (this.c0 != null) {
            ArrayList arrayList = new ArrayList();
            this.d0 = arrayList;
            arrayList.addAll(this.c0);
        }
        wrj wrjVar = this.G;
        t(wrjVar);
        String str = u1lVar.E;
        dgj.v(str);
        dgj.s(str);
        wrjVar.K0();
        wrjVar.O0();
        try {
            SQLiteDatabase sQLiteDatabaseR0 = wrjVar.R0();
            String[] strArr = {str};
            int iDelete = sQLiteDatabaseR0.delete("apps", "app_id=?", strArr) + sQLiteDatabaseR0.delete("events", "app_id=?", strArr) + sQLiteDatabaseR0.delete("events_snapshot", "app_id=?", strArr) + sQLiteDatabaseR0.delete("user_attributes", "app_id=?", strArr) + sQLiteDatabaseR0.delete("conditional_properties", "app_id=?", strArr) + sQLiteDatabaseR0.delete("raw_events", "app_id=?", strArr) + sQLiteDatabaseR0.delete("raw_events_metadata", "app_id=?", strArr) + sQLiteDatabaseR0.delete("queue", "app_id=?", strArr) + sQLiteDatabaseR0.delete("audience_filter_values", "app_id=?", strArr) + sQLiteDatabaseR0.delete("main_event_params", "app_id=?", strArr) + sQLiteDatabaseR0.delete("default_event_params", "app_id=?", strArr) + sQLiteDatabaseR0.delete("trigger_uris", "app_id=?", strArr) + sQLiteDatabaseR0.delete("upload_queue", "app_id=?", strArr);
            if (iDelete > 0) {
                wrjVar.b0().R.a(str, Integer.valueOf(iDelete), "Reset analytics data. app, records");
            }
        } catch (SQLiteException e) {
            wrjVar.b0().J.a(qgk.Q0(str), e, "Error resetting analytics data. appId, error");
        }
        if (u1lVar.L) {
            M(u1lVar);
        }
    }

    public final wrj R() {
        wrj wrjVar = this.G;
        t(wrjVar);
        return wrjVar;
    }

    public final void S(u1l u1lVar) throws Throwable {
        O().K0();
        a0();
        dgj.s(u1lVar.E);
        buj bujVarC = buj.c(u1lVar.f0);
        ygk ygkVar = b0().R;
        String str = u1lVar.E;
        ygkVar.a(str, bujVarC, "Setting DMA consent for package");
        O().K0();
        a0();
        mrk mrkVarD = buj.b(100, b(str)).d();
        this.g0.put(str, bujVarC);
        wrj wrjVar = this.G;
        t(wrjVar);
        dgj.v(str);
        dgj.v(bujVarC);
        wrjVar.K0();
        wrjVar.O0();
        if (((umk) wrjVar.E).K.X0(null, zvj.P0)) {
            qrk qrkVarK1 = wrjVar.K1(str);
            qrk qrkVar = qrk.c;
            if (qrkVarK1 == qrkVar) {
                wrjVar.B1(str, qrkVar);
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("dma_consent_settings", bujVarC.b);
        wrjVar.d1(contentValues);
        mrk mrkVarD2 = buj.b(100, b(str)).d();
        O().K0();
        a0();
        mrk mrkVar = mrk.GRANTED;
        mrk mrkVar2 = mrk.DENIED;
        boolean z = mrkVarD == mrkVar2 && mrkVarD2 == mrkVar;
        boolean z2 = mrkVarD == mrkVar && mrkVarD2 == mrkVar2;
        if (N().X0(null, zvj.O0)) {
            z = z || z2;
        }
        if (z) {
            b0().R.c("Generated _dcu event for", str);
            Bundle bundle = new Bundle();
            wrj wrjVar2 = this.G;
            t(wrjVar2);
            if (wrjVar2.c1(d0(), str, 1L, false, false, false, false, false, false).f < N().R0(str, zvj.Y)) {
                bundle.putLong("_r", 1L);
                wrj wrjVar3 = this.G;
                t(wrjVar3);
                b0().R.a(str, Long.valueOf(wrjVar3.c1(d0(), str, 1L, false, false, false, false, false, true).f), "_dcu realtime event count");
            }
            this.k0.c(str, "_dcu", bundle);
        }
    }

    public final void T(u1l u1lVar) throws Throwable {
        O().K0();
        a0();
        dgj.s(u1lVar.E);
        qrk qrkVarF = qrk.f(u1lVar.e0, u1lVar.Z);
        String str = u1lVar.E;
        qrk qrkVarD = D(str);
        b0().R.a(str, qrkVarF, "Setting storage consent for package");
        O().K0();
        a0();
        this.f0.put(str, qrkVarF);
        wrj wrjVar = this.G;
        t(wrjVar);
        wrjVar.B1(str, qrkVarF);
        x1l.a();
        if (N().X0(null, zvj.b1) || !qrkVarF.k(qrkVarD, (ork[]) qrkVarF.a.keySet().toArray(new ork[0]))) {
            return;
        }
        Q(u1lVar);
    }

    public final Boolean U(u1l u1lVar) {
        Boolean bool = u1lVar.V;
        String str = u1lVar.j0;
        l1l.a();
        if (N().X0(null, zvj.V0) && !TextUtils.isEmpty(str)) {
            int i = c1l.a[((mrk) cbi.e(str).E).ordinal()];
            if (i != 1) {
                if (i == 2) {
                    return Boolean.FALSE;
                }
                if (i == 3) {
                    return Boolean.TRUE;
                }
                if (i != 4) {
                }
            }
            return null;
        }
        return bool;
    }

    public final pkk V() {
        pkk pkkVar = this.E;
        t(pkkVar);
        return pkkVar;
    }

    public final dik X() {
        dik dikVar = this.K;
        t(dikVar);
        return dikVar;
    }

    public final h1l Y() {
        umk umkVar = this.P;
        dgj.v(umkVar);
        h1l h1lVar = umkVar.P;
        umk.c(h1lVar);
        return h1lVar;
    }

    public final void Z() {
        O().K0();
        a0();
        if (this.R) {
            return;
        }
        this.R = true;
        O().K0();
        FileLock fileLock = this.a0;
        umk umkVar = this.P;
        if (fileLock == null || !fileLock.isValid()) {
            File filesDir = umkVar.E.getFilesDir();
            int i = uzj.c;
            try {
                FileChannel channel = new RandomAccessFile(new File(new File(filesDir, "google_app_measurement.db").getPath()), "rw").getChannel();
                this.b0 = channel;
                FileLock fileLockTryLock = channel.tryLock();
                this.a0 = fileLockTryLock;
                if (fileLockTryLock == null) {
                    b0().J.b("Storage concurrent data access panic");
                    return;
                }
                b0().R.b("Storage concurrent access okay");
            } catch (FileNotFoundException e) {
                b0().J.c("Failed to acquire storage lock", e);
                return;
            } catch (IOException e2) {
                b0().J.c("Failed to access storage lock file", e2);
                return;
            } catch (OverlappingFileLockException e3) {
                b0().M.c("Storage lock already acquired", e3);
                return;
            }
        } else {
            b0().R.b("Storage concurrent access okay");
        }
        FileChannel fileChannel = this.b0;
        O().K0();
        int i2 = 0;
        if (fileChannel == null || !fileChannel.isOpen()) {
            b0().J.b("Bad channel to read from");
        } else {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
            try {
                fileChannel.position(0L);
                int i3 = fileChannel.read(byteBufferAllocate);
                if (i3 == 4) {
                    byteBufferAllocate.flip();
                    i2 = byteBufferAllocate.getInt();
                } else if (i3 != -1) {
                    b0().M.c("Unexpected data length. Bytes read", Integer.valueOf(i3));
                }
            } catch (IOException e4) {
                b0().J.c("Failed to read from channel", e4);
            }
        }
        ufk ufkVarJ = umkVar.j();
        ufkVarJ.O0();
        int i4 = ufkVarJ.I;
        O().K0();
        if (i2 > i4) {
            b0().J.a(Integer.valueOf(i2), Integer.valueOf(i4), "Panic: can't downgrade version. Previous, current version");
            return;
        }
        if (i2 < i4) {
            FileChannel fileChannel2 = this.b0;
            O().K0();
            if (fileChannel2 == null || !fileChannel2.isOpen()) {
                b0().J.b("Bad channel to read from");
            } else {
                ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(4);
                byteBufferAllocate2.putInt(i4);
                byteBufferAllocate2.flip();
                try {
                    fileChannel2.truncate(0L);
                    fileChannel2.write(byteBufferAllocate2);
                    fileChannel2.force(true);
                    if (fileChannel2.size() != 4) {
                        b0().J.c("Error writing to channel. Bytes written", Long.valueOf(fileChannel2.size()));
                    }
                    b0().R.a(Integer.valueOf(i2), Integer.valueOf(i4), "Storage version upgraded. Previous, current version");
                    return;
                } catch (IOException e5) {
                    b0().J.c("Failed to write to channel", e5);
                }
            }
            b0().J.a(Integer.valueOf(i2), Integer.valueOf(i4), "Storage version upgrade failed. Previous, current version");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(java.lang.String r7, defpackage.xzd r8) {
        /*
            r6 = this;
            pkk r0 = r6.E
            com.google.android.gms.internal.measurement.j r1 = r0.a1(r7)
            r2 = 1
            ork r3 = defpackage.ork.AD_PERSONALIZATION
            if (r1 != 0) goto L11
            rrj r6 = defpackage.rrj.FAILSAFE
            r8.N(r3, r6)
            return r2
        L11:
            defpackage.l1l.a()
            vqj r1 = r6.N()
            yek r4 = defpackage.zvj.V0
            r5 = 0
            boolean r1 = r1.X0(r5, r4)
            if (r1 == 0) goto L4e
            wrj r6 = r6.G
            t(r6)
            mjk r6 = r6.G1(r7)
            if (r6 == 0) goto L4e
            java.lang.String r6 = r6.k()
            cbi r6 = defpackage.cbi.e(r6)
            java.lang.Object r6 = r6.E
            mrk r6 = (defpackage.mrk) r6
            mrk r1 = defpackage.mrk.POLICY
            if (r6 != r1) goto L4e
            mrk r6 = r0.U0(r7, r3)
            mrk r1 = defpackage.mrk.UNINITIALIZED
            if (r6 == r1) goto L4e
            rrj r7 = defpackage.rrj.REMOTE_ENFORCED_DEFAULT
            r8.N(r3, r7)
            mrk r7 = defpackage.mrk.GRANTED
            if (r6 != r7) goto L5b
            goto L59
        L4e:
            rrj r6 = defpackage.rrj.REMOTE_DEFAULT
            r8.N(r3, r6)
            boolean r6 = r0.e1(r7, r3)
            if (r6 == 0) goto L5b
        L59:
            r6 = 0
            return r6
        L5b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o0l.a(java.lang.String, xzd):int");
    }

    public final void a0() {
        if (this.Q) {
            return;
        }
        sz6.j("UploadController is not initialized");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v8 */
    public final Bundle b(String str) throws Throwable {
        ?? Equals;
        O().K0();
        a0();
        pkk pkkVar = this.E;
        t(pkkVar);
        if (pkkVar.a1(str) == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        qrk qrkVarD = D(str);
        Bundle bundle2 = new Bundle();
        Iterator it = qrkVarD.a.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            int iOrdinal = ((mrk) entry.getValue()).ordinal();
            String str2 = iOrdinal != 2 ? iOrdinal != 3 ? null : "granted" : "denied";
            if (str2 != null) {
                bundle2.putString(((ork) entry.getKey()).E, str2);
            }
        }
        bundle.putAll(bundle2);
        buj bujVarE = e(str, L(str), qrkVarD, new xzd(27));
        Bundle bundle3 = new Bundle();
        for (Map.Entry entry2 : bujVarE.e.entrySet()) {
            int iOrdinal2 = ((mrk) entry2.getValue()).ordinal();
            String str3 = iOrdinal2 != 2 ? iOrdinal2 != 3 ? null : "granted" : "denied";
            if (str3 != null) {
                bundle3.putString(((ork) entry2.getKey()).E, str3);
            }
        }
        Boolean bool = bujVarE.c;
        if (bool != null) {
            bundle3.putString("is_dma_region", bool.toString());
        }
        String str4 = bujVarE.d;
        if (str4 != null) {
            bundle3.putString("cps_display_str", str4);
        }
        bundle.putAll(bundle3);
        dik dikVar = this.K;
        t(dikVar);
        if (dikVar.z1(str)) {
            Equals = 1;
        } else {
            wrj wrjVar = this.G;
            t(wrjVar);
            f1l f1lVarH1 = wrjVar.H1(str, "_npa");
            Equals = f1lVarH1 != null ? f1lVarH1.e.equals(1L) : a(str, new xzd(27));
        }
        bundle.putString("ad_personalization", Equals != 1 ? "granted" : "denied");
        return bundle;
    }

    @Override // defpackage.jrk
    public final qgk b0() {
        umk umkVar = this.P;
        dgj.v(umkVar);
        qgk qgkVar = umkVar.M;
        umk.d(qgkVar);
        return qgkVar;
    }

    public final Boolean c(mjk mjkVar) {
        try {
            long jZ = mjkVar.z();
            umk umkVar = this.P;
            if (jZ != -2147483648L) {
                if (mjkVar.z() == nij.a(umkVar.E).E(0, mjkVar.f()).versionCode) {
                    return Boolean.TRUE;
                }
            } else {
                String str = nij.a(umkVar.E).E(0, mjkVar.f()).versionName;
                String strH = mjkVar.h();
                if (strH != null && strH.equals(str)) {
                    return Boolean.TRUE;
                }
            }
            return Boolean.FALSE;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v2, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [int] */
    /* JADX WARN: Type inference failed for: r9v54 */
    /* JADX WARN: Type inference failed for: r9v55 */
    /* JADX WARN: Type inference failed for: r9v56 */
    /* JADX WARN: Type inference failed for: r9v57 */
    /* JADX WARN: Type inference failed for: r9v58 */
    /* JADX WARN: Type inference failed for: r9v7 */
    public final void c0() {
        boolean z;
        Boolean bool;
        mjk mjkVarG1;
        wrj wrjVar;
        Cursor cursorRawQuery;
        String strY0;
        String string;
        l0l l0lVar;
        boolean z2;
        int i;
        int i2;
        String strQ;
        ork orkVar = ork.AD_STORAGE;
        O().K0();
        a0();
        this.Z = true;
        try {
            bool = this.P.n().I;
        } catch (Throwable th) {
            th = th;
            z = false;
        }
        try {
            if (bool == null) {
                b0().M.b("Upload data called on the client side before use of service was decided");
                this.Z = false;
                z();
                return;
            }
            if (bool.booleanValue()) {
                b0().J.b("Upload called in the client side when service should be used");
                this.Z = false;
                z();
                return;
            }
            if (this.S > 0) {
                B();
                this.Z = false;
                z();
                return;
            }
            O().K0();
            if (this.c0 != null) {
                b0().R.b("Uploading requested multiple times");
                this.Z = false;
                z();
                return;
            }
            dik dikVar = this.F;
            t(dikVar);
            if (!dikVar.C1()) {
                b0().R.b("Network not connected, ignoring upload request");
                B();
                this.Z = false;
                z();
                return;
            }
            zzb().getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            ?? r10 = 0;
            String str = null;
            int iR0 = N().R0(null, zvj.U);
            N();
            long jLongValue = jCurrentTimeMillis - ((Long) zvj.e.a(null)).longValue();
            ?? r9 = 0;
            while (r9 < iR0 && w(jLongValue, null)) {
                r9++;
            }
            b4l.a();
            A();
            long jA = this.M.L.a();
            if (jA != 0) {
                b0().Q.c("Uploading events. Elapsed time since last upload attempt (ms)", Long.valueOf(Math.abs(jCurrentTimeMillis - jA)));
            }
            wrj wrjVar2 = this.G;
            t(wrjVar2);
            String strS0 = wrjVar2.S0();
            long j = -1;
            if (TextUtils.isEmpty(strS0)) {
                this.e0 = -1L;
                wrj wrjVarR = R();
                N();
                String strX0 = wrjVarR.X0(jCurrentTimeMillis - ((Long) zvj.e.a(null)).longValue());
                if (!TextUtils.isEmpty(strX0) && (mjkVarG1 = R().G1(strX0)) != null) {
                    H(mjkVarG1);
                }
            } else {
                if (this.e0 == -1) {
                    try {
                        wrjVar = this.G;
                        t(wrjVar);
                    } catch (Throwable th2) {
                        th = th2;
                        r10 = r9;
                    }
                    try {
                        cursorRawQuery = wrjVar.R0().rawQuery("select rowid from raw_events order by rowid desc limit 1;", null);
                        try {
                            if (cursorRawQuery.moveToFirst()) {
                                j = cursorRawQuery.getLong(0);
                                cursorRawQuery.close();
                                r9 = cursorRawQuery;
                            } else {
                                cursorRawQuery.close();
                                r9 = cursorRawQuery;
                            }
                        } catch (SQLiteException e) {
                            e = e;
                            wrjVar.b0().J.c("Error querying raw events", e);
                            r9 = cursorRawQuery;
                            if (cursorRawQuery != null) {
                                cursorRawQuery.close();
                                r9 = cursorRawQuery;
                            }
                        }
                    } catch (SQLiteException e2) {
                        e = e2;
                        cursorRawQuery = null;
                    } catch (Throwable th3) {
                        th = th3;
                        if (r10 != 0) {
                            r10.close();
                        }
                        throw th;
                    }
                    this.e0 = j;
                }
                int iR02 = N().R0(strS0, zvj.h);
                int iMax = Math.max(0, N().R0(strS0, zvj.i));
                wrj wrjVar3 = this.G;
                t(wrjVar3);
                List listZ0 = wrjVar3.Z0(iR02, iMax, strS0);
                if (!listZ0.isEmpty()) {
                    if (D(strS0).i(orkVar)) {
                        Iterator it = listZ0.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                strQ = null;
                                break;
                            }
                            c0 c0Var = (c0) ((Pair) it.next()).first;
                            if (!c0Var.Q().isEmpty()) {
                                strQ = c0Var.Q();
                                break;
                            }
                        }
                        if (strQ != null) {
                            int i3 = 0;
                            while (true) {
                                if (i3 >= listZ0.size()) {
                                    break;
                                }
                                c0 c0Var2 = (c0) ((Pair) listZ0.get(i3)).first;
                                if (!c0Var2.Q().isEmpty() && !c0Var2.Q().equals(strQ)) {
                                    listZ0 = listZ0.subList(0, i3);
                                    break;
                                }
                                i3++;
                            }
                        }
                    }
                    ohk ohkVarV = b0.v();
                    int size = listZ0.size();
                    ArrayList arrayList = new ArrayList(listZ0.size());
                    boolean z3 = "1".equals(N().H.o(strS0, "gaia_collection_enabled")) && D(strS0).i(orkVar);
                    boolean zI = D(strS0).i(orkVar);
                    boolean zI2 = D(strS0).i(ork.ANALYTICS_STORAGE);
                    e4l.a();
                    boolean zX0 = N().X0(strS0, zvj.u0);
                    l0l l0lVarP0 = this.N.P0(strS0);
                    int i4 = 0;
                    while (i4 < size) {
                        phk phkVar = (phk) ((c0) ((Pair) listZ0.get(i4)).first).l();
                        arrayList.add((Long) ((Pair) listZ0.get(i4)).second);
                        N();
                        phkVar.c();
                        c0.J1((c0) phkVar.F);
                        phkVar.c();
                        c0.E1((c0) phkVar.F, jCurrentTimeMillis);
                        phkVar.c();
                        c0.Y0((c0) phkVar.F);
                        if (!z3) {
                            phkVar.I();
                        }
                        if (!zI) {
                            phkVar.c();
                            c0.D1((c0) phkVar.F);
                            phkVar.c();
                            c0.p1((c0) phkVar.F);
                        }
                        if (!zI2) {
                            phkVar.c();
                            c0.f0((c0) phkVar.F);
                        }
                        i(strS0, phkVar);
                        if (!zX0) {
                            phkVar.c();
                            c0.H1((c0) phkVar.F);
                        }
                        x1l.a();
                        List list = listZ0;
                        if (N().X0(str, zvj.c1) && !zI2) {
                            phkVar.c();
                            c0.K0((c0) phkVar.F);
                        }
                        e2l.a();
                        if (N().X0(str, zvj.Q0)) {
                            String strQ2 = ((c0) phkVar.F).Q();
                            if (TextUtils.isEmpty(strQ2) || strQ2.equals("00000000-0000-0000-0000-000000000000")) {
                                ArrayList arrayList2 = new ArrayList(phkVar.m());
                                Iterator it2 = arrayList2.iterator();
                                Long lValueOf = str;
                                Long lValueOf2 = lValueOf;
                                boolean z4 = false;
                                boolean z5 = false;
                                while (it2.hasNext()) {
                                    x xVar = (x) it2.next();
                                    boolean z6 = zI;
                                    Iterator it3 = it2;
                                    if ("_fx".equals(xVar.D())) {
                                        it3.remove();
                                        zI = z6;
                                        it2 = it3;
                                        z4 = true;
                                        z5 = true;
                                    } else {
                                        if ("_f".equals(xVar.D())) {
                                            i2 = size;
                                            if (N().X0(null, zvj.Y0)) {
                                                X();
                                                z zVarX0 = dik.X0(xVar, "_pfo");
                                                if (zVarX0 != null) {
                                                    lValueOf = Long.valueOf(zVarX0.B());
                                                }
                                                X();
                                                z zVarX02 = dik.X0(xVar, "_uwa");
                                                if (zVarX02 != null) {
                                                    lValueOf2 = Long.valueOf(zVarX02.B());
                                                }
                                            }
                                            z5 = true;
                                        } else {
                                            i2 = size;
                                        }
                                        zI = z6;
                                        it2 = it3;
                                        size = i2;
                                    }
                                }
                                z2 = zI;
                                i = size;
                                if (z4) {
                                    phkVar.c();
                                    c0.f1((c0) phkVar.F);
                                    phkVar.c();
                                    c0.j0((c0) phkVar.F, arrayList2);
                                }
                                if (z5) {
                                    l(phkVar.U(), true, lValueOf, lValueOf2);
                                }
                            } else {
                                z2 = zI;
                                i = size;
                            }
                            if (phkVar.p() == 0) {
                                i4++;
                                listZ0 = list;
                                zI = z2;
                                size = i;
                                str = null;
                            }
                        } else {
                            z2 = zI;
                            i = size;
                        }
                        if (N().X0(strS0, zvj.k0)) {
                            byte[] bArrC = ((c0) phkVar.b()).c();
                            dik dikVar2 = this.K;
                            t(dikVar2);
                            long jS0 = dikVar2.S0(bArrC);
                            phkVar.c();
                            c0.v((c0) phkVar.F, jS0);
                        }
                        i4l.a();
                        if (N().X0(null, zvj.v0)) {
                            Y();
                            if (h1l.N1(strS0) && l0lVarP0.a() == 3) {
                                phkVar.I();
                            }
                        }
                        ohkVarV.i(phkVar);
                        i4++;
                        listZ0 = list;
                        zI = z2;
                        size = i;
                        str = null;
                    }
                    int i5 = size;
                    e2l.a();
                    if (N().X0(null, zvj.Q0) && ohkVarV.f() == 0) {
                        y(arrayList);
                        v(false, 204, null, null, strS0, Collections.EMPTY_LIST);
                        this.Z = false;
                        z();
                        return;
                    }
                    b0 b0Var = (b0) ohkVarV.b();
                    ArrayList arrayList3 = new ArrayList();
                    if (N().X0(null, zvj.v0)) {
                        Y();
                        if (h1l.N1(strS0) && l0lVarP0.a() == 3) {
                            Iterator it4 = ((b0) ohkVarV.b()).A().iterator();
                            while (true) {
                                if (it4.hasNext()) {
                                    if (((c0) it4.next()).s0()) {
                                        string = UUID.randomUUID().toString();
                                        break;
                                    }
                                } else {
                                    string = null;
                                    break;
                                }
                            }
                            b0 b0Var2 = (b0) ohkVarV.b();
                            O().K0();
                            a0();
                            ohk ohkVarR = b0.r(b0Var2);
                            if (!TextUtils.isEmpty(string)) {
                                ohkVarR.j(string);
                            }
                            pkk pkkVar = this.E;
                            t(pkkVar);
                            String strG1 = pkkVar.g1(strS0);
                            if (!TextUtils.isEmpty(strG1)) {
                                ohkVarR.l(strG1);
                            }
                            ArrayList arrayList4 = new ArrayList();
                            Iterator it5 = b0Var2.A().iterator();
                            while (it5.hasNext()) {
                                phk phkVarR = c0.r((c0) it5.next());
                                phkVarR.I();
                                arrayList4.add((c0) phkVarR.b());
                            }
                            ohkVarR.k();
                            ohkVarR.h(arrayList4);
                            b0().R.c("Processed MeasurementBatch for sGTM with sgtmJoinId", ohkVarR.m());
                            b0 b0Var3 = (b0) ohkVarR.b();
                            if (!TextUtils.isEmpty(string) && N().X0(null, zvj.z0)) {
                                b0 b0Var4 = (b0) ohkVarV.b();
                                O().K0();
                                a0();
                                ohk ohkVarV2 = b0.v();
                                b0().R.c("Processing Google Signal, sgtmJoinId", b0Var4.y());
                                ohkVarV2.j(string);
                                for (c0 c0Var3 : b0Var4.A()) {
                                    phk phkVarC2 = c0.c2();
                                    String strK = c0Var3.K();
                                    phkVarC2.c();
                                    c0.B1((c0) phkVarC2.F, strK);
                                    int iS0 = c0Var3.S0();
                                    phkVarC2.c();
                                    c0.g1((c0) phkVarC2.F, iS0);
                                    ohkVarV2.i(phkVarC2);
                                }
                                b0 b0Var5 = (b0) ohkVarV2.b();
                                String strG12 = this.N.N0().g1(strS0);
                                if (TextUtils.isEmpty(strG12)) {
                                    l0lVar = new l0l((String) zvj.s.a(null), 2);
                                } else {
                                    Uri uri = Uri.parse((String) zvj.s.a(null));
                                    Uri.Builder builderBuildUpon = uri.buildUpon();
                                    builderBuildUpon.authority(strG12 + "." + uri.getAuthority());
                                    l0lVar = new l0l(builderBuildUpon.build().toString(), 2);
                                }
                                arrayList3.add(Pair.create(b0Var5, l0lVar));
                            }
                            b0Var = b0Var3;
                        }
                    }
                    if (b0().S0(2)) {
                        dik dikVar3 = this.K;
                        t(dikVar3);
                        strY0 = dikVar3.Y0(b0Var);
                    } else {
                        strY0 = null;
                    }
                    X();
                    byte[] bArrC2 = b0Var.c();
                    try {
                        y(arrayList);
                        this.M.M.b(jCurrentTimeMillis);
                        b0().R.d("Uploading data. app, uncompressed size, data", i5 > 0 ? ohkVarV.g().e2() : "?", Integer.valueOf(bArrC2.length), strY0);
                        this.Y = true;
                        dik dikVar4 = this.F;
                        t(dikVar4);
                        URL url = new URL(l0lVarP0.b());
                        Map mapC = l0lVarP0.c();
                        uvj uvjVar = new uvj(this, strS0, arrayList3, 6);
                        dikVar4.K0();
                        dikVar4.O0();
                        wlk wlkVarO = dikVar4.O();
                        try {
                            rik rikVar = new rik(dikVar4, strS0, url, bArrC2, mapC, uvjVar);
                            strS0 = strS0;
                            wlkVarO.R0(rikVar);
                        } catch (MalformedURLException unused) {
                            strS0 = strS0;
                            b0().V0().a(qgk.Q0(strS0), l0lVarP0.b(), "Failed to parse upload URL. Not uploading. appId");
                        }
                    } catch (MalformedURLException unused2) {
                    }
                }
            }
            this.Z = false;
            z();
        } catch (Throwable th4) {
            th = th4;
            z = false;
            this.Z = z;
            z();
            throw th;
        }
    }

    public final String d(qrk qrkVar) {
        if (!qrkVar.i(ork.ANALYTICS_STORAGE)) {
            return null;
        }
        byte[] bArr = new byte[16];
        Y().X1().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new BigInteger(1, bArr));
    }

    public final long d0() {
        zzb().getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        izk izkVar = this.M;
        izkVar.O0();
        izkVar.K0();
        kjk kjkVar = izkVar.N;
        long jA = kjkVar.a();
        if (jA == 0) {
            jA = ((long) izkVar.J0().X1().nextInt(86400000)) + 1;
            kjkVar.b(jA);
        }
        return ((((jCurrentTimeMillis + jA) / 1000) / 60) / 60) / 24;
    }

    public final buj e(String str, buj bujVar, qrk qrkVar, xzd xzdVar) {
        int i;
        mrk mrkVarU0;
        int i2;
        pkk pkkVar = this.E;
        t(pkkVar);
        j jVarA1 = pkkVar.a1(str);
        mrk mrkVar = mrk.DENIED;
        ork orkVar = ork.AD_USER_DATA;
        if (jVarA1 == null) {
            if (bujVar.d() == mrkVar) {
                i2 = bujVar.a;
                xzdVar.M(orkVar, i2);
            } else {
                xzdVar.N(orkVar, rrj.FAILSAFE);
                i2 = 90;
            }
            return new buj(Boolean.FALSE, i2, Boolean.TRUE, "-");
        }
        mrk mrkVarD = bujVar.d();
        boolean z = true;
        mrk mrkVar2 = mrk.GRANTED;
        if (mrkVarD == mrkVar2 || mrkVarD == mrkVar) {
            i = bujVar.a;
            xzdVar.M(orkVar, i);
        } else {
            l1l.a();
            boolean zX0 = N().X0(null, zvj.V0);
            rrj rrjVar = rrj.REMOTE_DEFAULT;
            rrj rrjVar2 = rrj.REMOTE_DELEGATION;
            ork orkVar2 = ork.AD_STORAGE;
            mrk mrkVar3 = mrk.UNINITIALIZED;
            mrk mrkVar4 = mrk.POLICY;
            if (zX0) {
                if (mrkVarD != mrkVar4 || (mrkVarU0 = pkkVar.U0(str, orkVar)) == mrkVar3) {
                    ork orkVarB1 = pkkVar.b1(str);
                    mrk mrkVar5 = (mrk) qrkVar.a.get(orkVar2);
                    if (mrkVar5 != null) {
                        mrkVar3 = mrkVar5;
                    }
                    boolean z2 = mrkVar3 == mrkVar2 || mrkVar3 == mrkVar;
                    if (orkVarB1 == orkVar2 && z2) {
                        xzdVar.N(orkVar, rrjVar2);
                        mrkVarD = mrkVar3;
                    } else {
                        xzdVar.N(orkVar, rrjVar);
                        mrkVarD = pkkVar.e1(str, orkVar) ? mrkVar2 : mrkVar;
                    }
                } else {
                    xzdVar.N(orkVar, rrj.REMOTE_ENFORCED_DEFAULT);
                    mrkVarD = mrkVarU0;
                }
                i = 90;
            } else {
                dgj.o(mrkVarD == mrkVar3 || mrkVarD == mrkVar4);
                ork orkVarB12 = pkkVar.b1(str);
                Boolean boolL = qrkVar.l();
                if (orkVarB12 == orkVar2 && boolL != null) {
                    mrkVarD = boolL.booleanValue() ? mrkVar2 : mrkVar;
                    xzdVar.N(orkVar, rrjVar2);
                }
                if (mrkVarD == mrkVar3) {
                    if (!pkkVar.e1(str, orkVar)) {
                        mrkVar2 = mrkVar;
                    }
                    xzdVar.N(orkVar, rrjVar);
                }
                i = 90;
            }
        }
        pkkVar.K0();
        pkkVar.j1(str);
        j jVarA12 = pkkVar.a1(str);
        if (jVarA12 != null && jVarA12.w() && !jVarA12.v()) {
            z = false;
        }
        t(pkkVar);
        pkkVar.K0();
        pkkVar.j1(str);
        TreeSet treeSet = new TreeSet();
        j jVarA13 = pkkVar.a1(str);
        if (jVarA13 != null) {
            Iterator it = jVarA13.r().iterator();
            while (it.hasNext()) {
                treeSet.add(((i) it.next()).q());
            }
        }
        if (mrkVarD == mrkVar || treeSet.isEmpty()) {
            return new buj(Boolean.FALSE, i, Boolean.valueOf(z), "-");
        }
        return new buj(Boolean.TRUE, i, Boolean.valueOf(z), z ? TextUtils.join("", treeSet) : "");
    }

    public final lpj e0() {
        lpj lpjVar = this.H;
        if (lpjVar != null) {
            return lpjVar;
        }
        sz6.j("Network broadcast receiver not created");
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x014f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.mjk f(defpackage.u1l r26) {
        /*
            Method dump skipped, instruction units count: 773
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o0l.f(u1l):mjk");
    }

    public final void h(String str, nhk nhkVar, Bundle bundle, String str2) {
        List listUnmodifiableList = Collections.unmodifiableList(Arrays.asList("_o", "_sn", "_sc", "_si"));
        long jMax = (h1l.P1(((z) nhkVar.F).E()) || h1l.P1(str)) ? Math.max(N().M0(str2, true), FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) : N().M0(str2, true);
        long jCodePointCount = ((z) nhkVar.F).F().codePointCount(0, ((z) nhkVar.F).F().length());
        Y();
        String strE = ((z) nhkVar.F).E();
        N();
        String strY0 = h1l.Y0(strE, 40, true);
        if (jCodePointCount <= jMax || listUnmodifiableList.contains(((z) nhkVar.F).E())) {
            return;
        }
        if ("_ev".equals(((z) nhkVar.F).E())) {
            Y();
            bundle.putString("_ev", h1l.Y0(((z) nhkVar.F).F(), Math.max(N().M0(str2, true), FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING), true));
            return;
        }
        b0().O.a(strY0, Long.valueOf(jCodePointCount), "Param value is too long; discarded. Name, value length");
        if (bundle.getLong("_err") == 0) {
            bundle.putLong("_err", 4L);
            if (bundle.getString("_ev") == null) {
                bundle.putString("_ev", strY0);
                bundle.putLong("_el", jCodePointCount);
            }
        }
        bundle.remove(((z) nhkVar.F).E());
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0129  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(java.lang.String r9, defpackage.phk r10) {
        /*
            Method dump skipped, instruction units count: 365
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o0l.i(java.lang.String, phk):void");
    }

    public final void j(String str, u1l u1lVar) {
        O().K0();
        a0();
        boolean zW = W(u1lVar);
        String str2 = u1lVar.E;
        if (zW) {
            if (!u1lVar.L) {
                f(u1lVar);
                return;
            }
            Boolean boolU = U(u1lVar);
            if ("_npa".equals(str) && boolU != null) {
                b0().Q.b("Falling back to manifest metadata value for ad personalization");
                zzb().getClass();
                u(new e1l(System.currentTimeMillis(), Long.valueOf(boolU.booleanValue() ? 1L : 0L), "_npa", "auto"), u1lVar);
                return;
            }
            ygk ygkVar = b0().Q;
            umk umkVar = this.P;
            ygkVar.c("Removing user property", umkVar.Q.g(str));
            wrj wrjVar = this.G;
            t(wrjVar);
            wrjVar.O1();
            try {
                f(u1lVar);
                if ("_id".equals(str)) {
                    wrj wrjVar2 = this.G;
                    t(wrjVar2);
                    dgj.v(str2);
                    wrjVar2.J1(str2, "_lair");
                }
                wrj wrjVar3 = this.G;
                t(wrjVar3);
                dgj.v(str2);
                wrjVar3.J1(str2, str);
                wrj wrjVar4 = this.G;
                t(wrjVar4);
                wrjVar4.V1();
                b0().Q.c("User property removed", umkVar.Q.g(str));
                wrj wrjVar5 = this.G;
                t(wrjVar5);
                wrjVar5.T1();
            } catch (Throwable th) {
                wrj wrjVar6 = this.G;
                t(wrjVar6);
                wrjVar6.T1();
                throw th;
            }
        }
    }

    @Override // defpackage.jrk
    public final s4i k() {
        return this.P.J;
    }

    public final void l(String str, boolean z, Long l, Long l2) {
        wrj wrjVar = this.G;
        t(wrjVar);
        mjk mjkVarG1 = wrjVar.G1(str);
        if (mjkVarG1 != null) {
            umk umkVar = mjkVarG1.a;
            wlk wlkVar = umkVar.N;
            umk.d(wlkVar);
            wlkVar.K0();
            mjkVarG1.Q |= mjkVarG1.z != z;
            mjkVarG1.z = z;
            wlk wlkVar2 = umkVar.N;
            umk.d(wlkVar2);
            wlkVar2.K0();
            mjkVarG1.Q |= !Objects.equals(mjkVarG1.A, l);
            mjkVarG1.A = l;
            wlk wlkVar3 = umkVar.N;
            umk.d(wlkVar3);
            wlkVar3.K0();
            mjkVarG1.Q |= !Objects.equals(mjkVarG1.B, l2);
            mjkVarG1.B = l2;
            if (mjkVarG1.o()) {
                wrj wrjVar2 = this.G;
                t(wrjVar2);
                wrjVar2.p1(mjkVarG1, false);
            }
        }
    }

    public final void m(kqj kqjVar, u1l u1lVar) {
        rvj rvjVar = kqjVar.O;
        dgj.s(kqjVar.E);
        dgj.v(kqjVar.G);
        dgj.s(kqjVar.G.F);
        O().K0();
        a0();
        if (W(u1lVar)) {
            if (!u1lVar.L) {
                f(u1lVar);
                return;
            }
            wrj wrjVar = this.G;
            t(wrjVar);
            wrjVar.O1();
            try {
                f(u1lVar);
                String str = kqjVar.E;
                dgj.v(str);
                wrj wrjVar2 = this.G;
                t(wrjVar2);
                kqj kqjVarE1 = wrjVar2.E1(str, kqjVar.G.F);
                umk umkVar = this.P;
                if (kqjVarE1 != null) {
                    b0().Q.a(kqjVar.E, umkVar.Q.g(kqjVar.G.F), "Removing conditional user property");
                    wrj wrjVar3 = this.G;
                    t(wrjVar3);
                    wrjVar3.k1(str, kqjVar.G.F);
                    if (kqjVarE1.I) {
                        wrj wrjVar4 = this.G;
                        t(wrjVar4);
                        wrjVar4.J1(str, kqjVar.G.F);
                    }
                    if (rvjVar != null) {
                        avj avjVar = rvjVar.F;
                        rvj rvjVarZ0 = Y().Z0(rvjVar.E, avjVar != null ? avjVar.x0() : null, kqjVarE1.F, rvjVar.H, true);
                        dgj.v(rvjVarZ0);
                        K(rvjVarZ0, u1lVar);
                    }
                } else {
                    b0().M.a(qgk.Q0(kqjVar.E), umkVar.Q.g(kqjVar.G.F), "Conditional user property doesn't exist");
                }
                wrj wrjVar5 = this.G;
                t(wrjVar5);
                wrjVar5.V1();
                wrj wrjVar6 = this.G;
                t(wrjVar6);
                wrjVar6.T1();
            } catch (Throwable th) {
                wrj wrjVar7 = this.G;
                t(wrjVar7);
                wrjVar7.T1();
                throw th;
            }
        }
    }

    public final void n(rvj rvjVar, String str) {
        wrj wrjVar = this.G;
        t(wrjVar);
        mjk mjkVarG1 = wrjVar.G1(str);
        if (mjkVarG1 != null) {
            umk umkVar = mjkVarG1.a;
            if (!TextUtils.isEmpty(mjkVarG1.h())) {
                Boolean boolC = c(mjkVarG1);
                if (boolC == null) {
                    if (!"_ui".equals(rvjVar.E)) {
                        b0().M.c("Could not find package. appId", qgk.Q0(str));
                    }
                } else if (!boolC.booleanValue()) {
                    b0().J.c("App version does not match; dropping event. appId", qgk.Q0(str));
                    return;
                }
                String strJ = mjkVarG1.j();
                String strH = mjkVarG1.h();
                long jZ = mjkVarG1.z();
                wlk wlkVar = umkVar.N;
                umk.d(wlkVar);
                wlkVar.K0();
                String str2 = mjkVarG1.l;
                wlk wlkVar2 = umkVar.N;
                umk.d(wlkVar2);
                wlkVar2.K0();
                long j = mjkVarG1.m;
                wlk wlkVar3 = umkVar.N;
                umk.d(wlkVar3);
                wlkVar3.K0();
                long j2 = mjkVarG1.n;
                wlk wlkVar4 = umkVar.N;
                umk.d(wlkVar4);
                wlkVar4.K0();
                boolean z = mjkVarG1.o;
                String strI = mjkVarG1.i();
                wlk wlkVar5 = umkVar.N;
                umk.d(wlkVar5);
                wlkVar5.K0();
                boolean zN = mjkVarG1.n();
                String strD = mjkVarG1.d();
                Boolean boolV = mjkVarG1.V();
                long jO = mjkVarG1.O();
                wlk wlkVar6 = umkVar.N;
                umk.d(wlkVar6);
                wlkVar6.K0();
                ArrayList arrayList = mjkVarG1.t;
                String strO = D(str).o();
                boolean zP = mjkVarG1.p();
                wlk wlkVar7 = umkVar.N;
                umk.d(wlkVar7);
                wlkVar7.K0();
                long j3 = mjkVarG1.w;
                int i = D(str).b;
                String str3 = L(str).b;
                wlk wlkVar8 = umkVar.N;
                umk.d(wlkVar8);
                wlkVar8.K0();
                int i2 = mjkVarG1.y;
                wlk wlkVar9 = umkVar.N;
                umk.d(wlkVar9);
                wlkVar9.K0();
                G(rvjVar, new u1l(str, strJ, strH, jZ, str2, j, j2, null, z, false, strI, 0L, 0, zN, false, strD, boolV, jO, arrayList, strO, "", null, zP, j3, i, str3, i2, mjkVarG1.C, mjkVarG1.l(), mjkVarG1.k()));
                return;
            }
        }
        b0().Q.c("No app data available; dropping event", str);
    }

    public final void o(rvj rvjVar, u1l u1lVar) {
        rvj rvjVar2;
        List listB1;
        umk umkVar;
        List<kqj> listB12;
        List<kqj> listB13;
        String str;
        dgj.v(u1lVar);
        String str2 = u1lVar.E;
        dgj.s(str2);
        O().K0();
        a0();
        long j = rvjVar.H;
        ak6 ak6VarB = ak6.b(rvjVar);
        O().K0();
        h1l.n1((this.i0 == null || (str = this.j0) == null || !str.equals(str2)) ? null : this.i0, (Bundle) ak6VarB.e, false);
        rvj rvjVarC = ak6VarB.c();
        String str3 = rvjVarC.E;
        X();
        if (TextUtils.isEmpty(u1lVar.F) && TextUtils.isEmpty(u1lVar.U)) {
            return;
        }
        if (!u1lVar.L) {
            f(u1lVar);
            return;
        }
        List list = u1lVar.X;
        if (list == null) {
            rvjVar2 = rvjVarC;
        } else if (!list.contains(str3)) {
            b0().Q.d("Dropping non-safelisted event. appId, event name, origin", str2, str3, rvjVarC.G);
            return;
        } else {
            Bundle bundleX0 = rvjVarC.F.x0();
            bundleX0.putLong("ga_safelisted", 1L);
            rvjVar2 = new rvj(rvjVarC.E, new avj(bundleX0), rvjVarC.G, rvjVarC.H);
        }
        wrj wrjVar = this.G;
        t(wrjVar);
        wrjVar.O1();
        try {
            wrj wrjVar2 = this.G;
            t(wrjVar2);
            dgj.s(str2);
            wrjVar2.K0();
            wrjVar2.O0();
            if (j < 0) {
                wrjVar2.b0().M.a(qgk.Q0(str2), Long.valueOf(j), "Invalid time querying timed out conditional properties");
                listB1 = Collections.EMPTY_LIST;
            } else {
                listB1 = wrjVar2.b1("active=0 and app_id=? and abs(? - creation_timestamp) > trigger_timeout", new String[]{str2, String.valueOf(j)});
            }
            Iterator it = listB1.iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                umkVar = this.P;
                if (!zHasNext) {
                    break;
                }
                kqj kqjVar = (kqj) it.next();
                if (kqjVar != null) {
                    b0().R.d("User property timed out", kqjVar.E, umkVar.Q.g(kqjVar.G.F), kqjVar.G.zza());
                    rvj rvjVar3 = kqjVar.K;
                    if (rvjVar3 != null) {
                        K(new rvj(rvjVar3, j), u1lVar);
                    }
                    wrj wrjVar3 = this.G;
                    t(wrjVar3);
                    wrjVar3.k1(str2, kqjVar.G.F);
                }
            }
            wrj wrjVar4 = this.G;
            t(wrjVar4);
            dgj.s(str2);
            wrjVar4.K0();
            wrjVar4.O0();
            if (j < 0) {
                wrjVar4.b0().M.a(qgk.Q0(str2), Long.valueOf(j), "Invalid time querying expired conditional properties");
                listB12 = Collections.EMPTY_LIST;
            } else {
                listB12 = wrjVar4.b1("active<>0 and app_id=? and abs(? - triggered_timestamp) > time_to_live", new String[]{str2, String.valueOf(j)});
            }
            ArrayList arrayList = new ArrayList(listB12.size());
            for (kqj kqjVar2 : listB12) {
                if (kqjVar2 != null) {
                    b0().R.d("User property expired", kqjVar2.E, umkVar.Q.g(kqjVar2.G.F), kqjVar2.G.zza());
                    wrj wrjVar5 = this.G;
                    t(wrjVar5);
                    wrjVar5.J1(str2, kqjVar2.G.F);
                    rvj rvjVar4 = kqjVar2.O;
                    if (rvjVar4 != null) {
                        arrayList.add(rvjVar4);
                    }
                    wrj wrjVar6 = this.G;
                    t(wrjVar6);
                    wrjVar6.k1(str2, kqjVar2.G.F);
                }
            }
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                K(new rvj((rvj) obj, j), u1lVar);
            }
            wrj wrjVar7 = this.G;
            t(wrjVar7);
            String str4 = rvjVar2.E;
            dgj.s(str2);
            dgj.s(str4);
            wrjVar7.K0();
            wrjVar7.O0();
            if (j < 0) {
                wrjVar7.b0().M.d("Invalid time querying triggered conditional properties", qgk.Q0(str2), ((umk) wrjVar7.E).Q.b(str4), Long.valueOf(j));
                listB13 = Collections.EMPTY_LIST;
            } else {
                listB13 = wrjVar7.b1("active=0 and app_id=? and trigger_event_name=? and abs(? - creation_timestamp) <= trigger_timeout", new String[]{str2, str4, String.valueOf(j)});
            }
            ArrayList arrayList2 = new ArrayList(listB13.size());
            for (kqj kqjVar3 : listB13) {
                if (kqjVar3 != null) {
                    e1l e1lVar = kqjVar3.G;
                    String str5 = kqjVar3.E;
                    dgj.v(str5);
                    String str6 = kqjVar3.F;
                    String str7 = e1lVar.F;
                    Object objZza = e1lVar.zza();
                    dgj.v(objZza);
                    f1l f1lVar = new f1l(str5, str6, str7, j, objZza);
                    Object obj2 = f1lVar.e;
                    String str8 = f1lVar.c;
                    wrj wrjVar8 = this.G;
                    t(wrjVar8);
                    if (wrjVar8.u1(f1lVar)) {
                        b0().R.d("User property triggered", kqjVar3.E, umkVar.Q.g(str8), obj2);
                    } else {
                        b0().J.d("Too many active user properties, ignoring", qgk.Q0(kqjVar3.E), umkVar.Q.g(str8), obj2);
                    }
                    rvj rvjVar5 = kqjVar3.M;
                    if (rvjVar5 != null) {
                        arrayList2.add(rvjVar5);
                    }
                    kqjVar3.G = new e1l(f1lVar);
                    kqjVar3.I = true;
                    wrj wrjVar9 = this.G;
                    t(wrjVar9);
                    wrjVar9.s1(kqjVar3);
                }
            }
            K(rvjVar2, u1lVar);
            int size2 = arrayList2.size();
            int i2 = 0;
            while (i2 < size2) {
                Object obj3 = arrayList2.get(i2);
                i2++;
                K(new rvj((rvj) obj3, j), u1lVar);
            }
            wrj wrjVar10 = this.G;
            t(wrjVar10);
            wrjVar10.V1();
            wrj wrjVar11 = this.G;
            t(wrjVar11);
            wrjVar11.T1();
        } catch (Throwable th) {
            wrj wrjVar12 = this.G;
            t(wrjVar12);
            wrjVar12.T1();
            throw th;
        }
    }

    public final void r(phk phkVar, long j, boolean z) throws Throwable {
        f1l f1lVar;
        Object obj;
        String str = z ? "_se" : "_lte";
        wrj wrjVar = this.G;
        t(wrjVar);
        f1l f1lVarH1 = wrjVar.H1(phkVar.U(), str);
        if (f1lVarH1 == null || (obj = f1lVarH1.e) == null) {
            String strU = phkVar.U();
            zzb().getClass();
            f1lVar = new f1l(strU, "auto", str, System.currentTimeMillis(), Long.valueOf(j));
        } else {
            String strU2 = phkVar.U();
            zzb().getClass();
            f1lVar = new f1l(strU2, "auto", str, System.currentTimeMillis(), Long.valueOf(((Long) obj).longValue() + j));
        }
        shk shkVarB = g0.B();
        shkVarB.c();
        g0.s((g0) shkVarB.F, str);
        zzb().getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        shkVarB.c();
        g0.w((g0) shkVarB.F, jCurrentTimeMillis);
        Object obj2 = f1lVar.e;
        long jLongValue = ((Long) obj2).longValue();
        shkVarB.c();
        g0.r((g0) shkVarB.F, jLongValue);
        g0 g0Var = (g0) shkVarB.b();
        int iR0 = dik.R0(str, phkVar);
        if (iR0 >= 0) {
            phkVar.c();
            c0.u((c0) phkVar.F, iR0, g0Var);
        } else {
            phkVar.c();
            c0.z((c0) phkVar.F, g0Var);
        }
        if (j > 0) {
            wrj wrjVar2 = this.G;
            t(wrjVar2);
            wrjVar2.u1(f1lVar);
            b0().R.a(z ? "session-scoped" : "lifetime", obj2, "Updated engagement user property. scope, value");
        }
    }

    public final void s(mjk mjkVar, phk phkVar) throws Throwable {
        O().K0();
        a0();
        xzd xzdVarK = xzd.K(((c0) phkVar.F).G());
        l1l.a();
        g0 g0Var = null;
        boolean zX0 = N().X0(null, zvj.V0);
        rrj rrjVar = rrj.FAILSAFE;
        ork orkVar = ork.ANALYTICS_STORAGE;
        ork orkVar2 = ork.AD_STORAGE;
        if (zX0) {
            String strF = mjkVar.f();
            O().K0();
            a0();
            qrk qrkVarD = D(strF);
            EnumMap enumMap = qrkVarD.a;
            int[] iArr = c1l.a;
            mrk mrkVar = (mrk) enumMap.get(orkVar2);
            mrk mrkVar2 = mrk.UNINITIALIZED;
            if (mrkVar == null) {
                mrkVar = mrkVar2;
            }
            int i = qrkVarD.b;
            int i2 = iArr[mrkVar.ordinal()];
            rrj rrjVar2 = rrj.REMOTE_ENFORCED_DEFAULT;
            if (i2 == 1) {
                xzdVarK.N(orkVar2, rrjVar2);
            } else if (i2 == 2 || i2 == 3) {
                xzdVarK.M(orkVar2, i);
            } else {
                xzdVarK.N(orkVar2, rrjVar);
            }
            mrk mrkVar3 = (mrk) enumMap.get(orkVar);
            if (mrkVar3 != null) {
                mrkVar2 = mrkVar3;
            }
            int i3 = iArr[mrkVar2.ordinal()];
            if (i3 == 1) {
                xzdVarK.N(orkVar, rrjVar2);
            } else if (i3 == 2 || i3 == 3) {
                xzdVarK.M(orkVar, i);
            } else {
                xzdVarK.N(orkVar, rrjVar);
            }
        } else {
            String strF2 = mjkVar.f();
            O().K0();
            a0();
            qrk qrkVarD2 = D(strF2);
            Boolean boolL = qrkVarD2.l();
            int i4 = qrkVarD2.b;
            if (boolL != null) {
                xzdVarK.M(orkVar2, i4);
            } else {
                xzdVarK.N(orkVar2, rrjVar);
            }
            if (qrkVarD2.m() != null) {
                xzdVarK.M(orkVar, i4);
            } else {
                xzdVarK.N(orkVar, rrjVar);
            }
        }
        String strF3 = mjkVar.f();
        O().K0();
        a0();
        buj bujVarE = e(strF3, L(strF3), D(strF3), xzdVarK);
        String str = bujVarE.d;
        Boolean bool = bujVarE.c;
        dgj.v(bool);
        boolean zBooleanValue = bool.booleanValue();
        phkVar.c();
        c0.k0((c0) phkVar.F, zBooleanValue);
        if (!TextUtils.isEmpty(str)) {
            phkVar.c();
            c0.s1((c0) phkVar.F, str);
        }
        O().K0();
        a0();
        Iterator it = Collections.unmodifiableList(((c0) phkVar.F).V()).iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            g0 g0Var2 = (g0) it.next();
            if ("_npa".equals(g0Var2.C())) {
                g0Var = g0Var2;
                break;
            }
        }
        if (g0Var == null) {
            int iA = a(mjkVar.f(), xzdVarK);
            shk shkVarB = g0.B();
            shkVarB.c();
            g0.s((g0) shkVarB.F, "_npa");
            zzb().getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            shkVarB.c();
            g0.w((g0) shkVarB.F, jCurrentTimeMillis);
            shkVarB.c();
            g0.r((g0) shkVarB.F, iA);
            g0 g0Var3 = (g0) shkVarB.b();
            phkVar.c();
            c0.z((c0) phkVar.F, g0Var3);
            b0().R.a("non_personalized_ads(_npa)", Integer.valueOf(iA), "Setting user property");
        } else if (xzdVarK.L() == rrj.UNSET) {
            wrj wrjVar = this.G;
            t(wrjVar);
            f1l f1lVarH1 = wrjVar.H1(mjkVar.f(), "_npa");
            rrj rrjVar3 = rrj.MANIFEST;
            rrj rrjVar4 = rrj.API;
            ork orkVar3 = ork.AD_PERSONALIZATION;
            if (f1lVarH1 != null) {
                String str2 = f1lVarH1.b;
                if ("tcf".equals(str2)) {
                    xzdVarK.N(orkVar3, rrj.TCF);
                } else if ("app".equals(str2)) {
                    xzdVarK.N(orkVar3, rrjVar4);
                } else {
                    xzdVarK.N(orkVar3, rrjVar3);
                }
            } else {
                Boolean boolV = mjkVar.V();
                if (boolV == null || ((boolV == Boolean.TRUE && g0Var.y() != 1) || (boolV == Boolean.FALSE && g0Var.y() != 0))) {
                    xzdVarK.N(orkVar3, rrjVar4);
                } else {
                    xzdVarK.N(orkVar3, rrjVar3);
                }
            }
        }
        String string = xzdVarK.toString();
        phkVar.c();
        c0.i1((c0) phkVar.F, string);
        String strF4 = mjkVar.f();
        pkk pkkVar = this.E;
        pkkVar.K0();
        pkkVar.j1(strF4);
        j jVarA1 = pkkVar.a1(strF4);
        int i5 = 0;
        boolean z = jVarA1 == null || !jVarA1.w() || jVarA1.v();
        List listM = phkVar.m();
        for (int i6 = 0; i6 < listM.size(); i6++) {
            if ("_tcf".equals(((x) listM.get(i6)).D())) {
                mhk mhkVar = (mhk) ((x) listM.get(i6)).l();
                List listK = mhkVar.k();
                int i7 = 0;
                while (true) {
                    if (i7 >= listK.size()) {
                        break;
                    }
                    if ("_tcfd".equals(((z) listK.get(i7)).E())) {
                        String strF5 = ((z) listK.get(i7)).F();
                        if (z && strF5.length() > 4) {
                            char[] charArray = strF5.toCharArray();
                            int i8 = 1;
                            while (true) {
                                if (i8 >= 64) {
                                    break;
                                }
                                if (charArray[4] == "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i8)) {
                                    i5 = i8;
                                    break;
                                }
                                i8++;
                            }
                            charArray[4] = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i5 | 1);
                            strF5 = String.valueOf(charArray);
                        }
                        nhk nhkVarD = z.D();
                        nhkVarD.g("_tcfd");
                        nhkVarD.h(strF5);
                        mhkVar.c();
                        x.u((x) mhkVar.F, i7, (z) nhkVarD.b());
                    } else {
                        i7++;
                    }
                }
                phkVar.g(i6, mhkVar);
                return;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00d1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void u(defpackage.e1l r26, defpackage.u1l r27) {
        /*
            Method dump skipped, instruction units count: 510
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o0l.u(e1l, u1l):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x0195 A[Catch: all -> 0x0012, SQLiteException -> 0x0091, TryCatch #3 {SQLiteException -> 0x0091, blocks: (B:16:0x003b, B:20:0x005c, B:24:0x0078, B:26:0x0085, B:30:0x00a9, B:60:0x0154, B:62:0x0167, B:64:0x016d, B:73:0x019c, B:65:0x0171, B:67:0x017d, B:69:0x0186, B:71:0x0191, B:72:0x0195, B:74:0x01a0, B:75:0x01a8, B:29:0x0095, B:19:0x004a), top: B:92:0x003b, outer: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void v(boolean r13, int r14, java.lang.Throwable r15, byte[] r16, java.lang.String r17, java.util.List r18) {
        /*
            Method dump skipped, instruction units count: 549
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o0l.v(boolean, int, java.lang.Throwable, byte[], java.lang.String, java.util.List):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:187:0x05d2 A[Catch: all -> 0x0081, TryCatch #0 {all -> 0x0081, blocks: (B:3:0x0015, B:22:0x007c, B:94:0x022e, B:96:0x0232, B:99:0x023a, B:100:0x0253, B:103:0x0269, B:106:0x0295, B:108:0x02ce, B:111:0x02e5, B:113:0x02ef, B:280:0x0887, B:116:0x031a, B:118:0x0330, B:121:0x0353, B:123:0x035d, B:125:0x036d, B:127:0x037b, B:129:0x038b, B:130:0x0396, B:131:0x0399, B:133:0x03ad, B:187:0x05d2, B:188:0x05de, B:191:0x05ea, B:197:0x060d, B:194:0x05fc, B:200:0x0615, B:202:0x0621, B:204:0x062d, B:218:0x0675, B:221:0x069c, B:223:0x06a8, B:226:0x06b9, B:228:0x06ca, B:230:0x06d8, B:245:0x0730, B:247:0x0741, B:249:0x074b, B:250:0x0757, B:252:0x0761, B:254:0x0771, B:256:0x077b, B:257:0x078c, B:259:0x0792, B:260:0x07ad, B:262:0x07b3, B:263:0x07d1, B:264:0x07de, B:268:0x0807, B:265:0x07e6, B:267:0x07f4, B:269:0x0813, B:270:0x0834, B:272:0x083a, B:274:0x084d, B:275:0x085a, B:277:0x0861, B:279:0x0873, B:233:0x06e4, B:235:0x06f0, B:238:0x0703, B:240:0x0714, B:242:0x0722, B:210:0x0652, B:214:0x0665, B:216:0x066b, B:219:0x0693, B:136:0x03c3, B:142:0x03d9, B:145:0x03e7, B:147:0x03f5, B:151:0x0449, B:148:0x0419, B:150:0x0429, B:155:0x0456, B:158:0x0487, B:159:0x04af, B:161:0x04eb, B:163:0x04f1, B:166:0x04fd, B:168:0x0534, B:169:0x054f, B:171:0x0559, B:173:0x0569, B:178:0x0582, B:174:0x0572, B:182:0x058b, B:184:0x0598, B:185:0x05b9, B:283:0x08a0, B:285:0x08b2, B:287:0x08bb, B:299:0x08ef, B:289:0x08c5, B:291:0x08ce, B:293:0x08d4, B:296:0x08e0, B:298:0x08e8, B:300:0x08f2, B:301:0x08fe, B:304:0x0906, B:306:0x0918, B:307:0x0923, B:309:0x092b, B:313:0x0957, B:315:0x0978, B:317:0x098d, B:319:0x099c, B:321:0x09b6, B:322:0x09c8, B:323:0x09cb, B:324:0x09e7, B:326:0x09ed, B:328:0x0a05, B:329:0x0a13, B:331:0x0a23, B:332:0x0a31, B:333:0x0a34, B:336:0x0a4a, B:338:0x0a85, B:340:0x0a8b, B:346:0x0ab2, B:348:0x0ab8, B:349:0x0acf, B:351:0x0ad5, B:341:0x0a99, B:343:0x0a9f, B:345:0x0aa5, B:352:0x0ae9, B:355:0x0b00, B:357:0x0b1a, B:363:0x0b2e, B:365:0x0b3e, B:368:0x0b47, B:370:0x0b4d, B:371:0x0b63, B:373:0x0b69, B:375:0x0b79, B:377:0x0b91, B:379:0x0ba3, B:381:0x0bc2, B:383:0x0be9, B:384:0x0c16, B:385:0x0c1f, B:386:0x0c23, B:388:0x0c32, B:390:0x0ccd, B:392:0x0cdd, B:393:0x0cf0, B:396:0x0cf8, B:399:0x0d16, B:401:0x0d2f, B:403:0x0d44, B:406:0x0d4c, B:408:0x0d50, B:410:0x0d54, B:412:0x0d5e, B:414:0x0d69, B:416:0x0d6d, B:418:0x0d73, B:420:0x0d7e, B:422:0x0d8c, B:480:0x0fcf, B:424:0x0d95, B:426:0x0dca, B:427:0x0dd2, B:429:0x0dd8, B:431:0x0de8, B:438:0x0e10, B:439:0x0e33, B:441:0x0e3f, B:443:0x0e53, B:444:0x0e8f, B:450:0x0ea9, B:452:0x0eb4, B:454:0x0eb8, B:456:0x0ebc, B:458:0x0ec0, B:459:0x0ecc, B:460:0x0ed1, B:462:0x0ed7, B:464:0x0eef, B:465:0x0ef8, B:479:0x0fcc, B:466:0x0f38, B:468:0x0f40, B:472:0x0f58, B:474:0x0f74, B:475:0x0f7f, B:478:0x0fc0, B:469:0x0f45, B:436:0x0dfc, B:481:0x0fd9, B:483:0x0fe5, B:484:0x0ff9, B:485:0x1001, B:487:0x1007, B:489:0x101d, B:491:0x102d, B:517:0x10fa, B:519:0x1100, B:521:0x1110, B:524:0x1117, B:529:0x1156, B:525:0x1126, B:527:0x1132, B:528:0x113f, B:530:0x1165, B:531:0x117c, B:534:0x1184, B:535:0x1187, B:536:0x1197, B:538:0x11b1, B:539:0x11ca, B:540:0x11d2, B:544:0x11ee, B:543:0x11dd, B:492:0x1046, B:494:0x104c, B:496:0x105c, B:498:0x1063, B:504:0x1079, B:506:0x1080, B:508:0x108f, B:510:0x109c, B:512:0x10bf, B:514:0x10eb, B:516:0x10f2, B:515:0x10ef, B:511:0x10bc, B:505:0x107d, B:497:0x1060, B:389:0x0c84, B:316:0x098a, B:310:0x0930, B:312:0x0936, B:547:0x11ff, B:54:0x011b, B:71:0x019f, B:79:0x01e2, B:85:0x01fe, B:89:0x0214, B:93:0x022b, B:551:0x1212, B:552:0x1215, B:48:0x00dc, B:59:0x0127), top: B:555:0x0015, inners: #6, #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0699  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x06a8 A[Catch: all -> 0x0081, TryCatch #0 {all -> 0x0081, blocks: (B:3:0x0015, B:22:0x007c, B:94:0x022e, B:96:0x0232, B:99:0x023a, B:100:0x0253, B:103:0x0269, B:106:0x0295, B:108:0x02ce, B:111:0x02e5, B:113:0x02ef, B:280:0x0887, B:116:0x031a, B:118:0x0330, B:121:0x0353, B:123:0x035d, B:125:0x036d, B:127:0x037b, B:129:0x038b, B:130:0x0396, B:131:0x0399, B:133:0x03ad, B:187:0x05d2, B:188:0x05de, B:191:0x05ea, B:197:0x060d, B:194:0x05fc, B:200:0x0615, B:202:0x0621, B:204:0x062d, B:218:0x0675, B:221:0x069c, B:223:0x06a8, B:226:0x06b9, B:228:0x06ca, B:230:0x06d8, B:245:0x0730, B:247:0x0741, B:249:0x074b, B:250:0x0757, B:252:0x0761, B:254:0x0771, B:256:0x077b, B:257:0x078c, B:259:0x0792, B:260:0x07ad, B:262:0x07b3, B:263:0x07d1, B:264:0x07de, B:268:0x0807, B:265:0x07e6, B:267:0x07f4, B:269:0x0813, B:270:0x0834, B:272:0x083a, B:274:0x084d, B:275:0x085a, B:277:0x0861, B:279:0x0873, B:233:0x06e4, B:235:0x06f0, B:238:0x0703, B:240:0x0714, B:242:0x0722, B:210:0x0652, B:214:0x0665, B:216:0x066b, B:219:0x0693, B:136:0x03c3, B:142:0x03d9, B:145:0x03e7, B:147:0x03f5, B:151:0x0449, B:148:0x0419, B:150:0x0429, B:155:0x0456, B:158:0x0487, B:159:0x04af, B:161:0x04eb, B:163:0x04f1, B:166:0x04fd, B:168:0x0534, B:169:0x054f, B:171:0x0559, B:173:0x0569, B:178:0x0582, B:174:0x0572, B:182:0x058b, B:184:0x0598, B:185:0x05b9, B:283:0x08a0, B:285:0x08b2, B:287:0x08bb, B:299:0x08ef, B:289:0x08c5, B:291:0x08ce, B:293:0x08d4, B:296:0x08e0, B:298:0x08e8, B:300:0x08f2, B:301:0x08fe, B:304:0x0906, B:306:0x0918, B:307:0x0923, B:309:0x092b, B:313:0x0957, B:315:0x0978, B:317:0x098d, B:319:0x099c, B:321:0x09b6, B:322:0x09c8, B:323:0x09cb, B:324:0x09e7, B:326:0x09ed, B:328:0x0a05, B:329:0x0a13, B:331:0x0a23, B:332:0x0a31, B:333:0x0a34, B:336:0x0a4a, B:338:0x0a85, B:340:0x0a8b, B:346:0x0ab2, B:348:0x0ab8, B:349:0x0acf, B:351:0x0ad5, B:341:0x0a99, B:343:0x0a9f, B:345:0x0aa5, B:352:0x0ae9, B:355:0x0b00, B:357:0x0b1a, B:363:0x0b2e, B:365:0x0b3e, B:368:0x0b47, B:370:0x0b4d, B:371:0x0b63, B:373:0x0b69, B:375:0x0b79, B:377:0x0b91, B:379:0x0ba3, B:381:0x0bc2, B:383:0x0be9, B:384:0x0c16, B:385:0x0c1f, B:386:0x0c23, B:388:0x0c32, B:390:0x0ccd, B:392:0x0cdd, B:393:0x0cf0, B:396:0x0cf8, B:399:0x0d16, B:401:0x0d2f, B:403:0x0d44, B:406:0x0d4c, B:408:0x0d50, B:410:0x0d54, B:412:0x0d5e, B:414:0x0d69, B:416:0x0d6d, B:418:0x0d73, B:420:0x0d7e, B:422:0x0d8c, B:480:0x0fcf, B:424:0x0d95, B:426:0x0dca, B:427:0x0dd2, B:429:0x0dd8, B:431:0x0de8, B:438:0x0e10, B:439:0x0e33, B:441:0x0e3f, B:443:0x0e53, B:444:0x0e8f, B:450:0x0ea9, B:452:0x0eb4, B:454:0x0eb8, B:456:0x0ebc, B:458:0x0ec0, B:459:0x0ecc, B:460:0x0ed1, B:462:0x0ed7, B:464:0x0eef, B:465:0x0ef8, B:479:0x0fcc, B:466:0x0f38, B:468:0x0f40, B:472:0x0f58, B:474:0x0f74, B:475:0x0f7f, B:478:0x0fc0, B:469:0x0f45, B:436:0x0dfc, B:481:0x0fd9, B:483:0x0fe5, B:484:0x0ff9, B:485:0x1001, B:487:0x1007, B:489:0x101d, B:491:0x102d, B:517:0x10fa, B:519:0x1100, B:521:0x1110, B:524:0x1117, B:529:0x1156, B:525:0x1126, B:527:0x1132, B:528:0x113f, B:530:0x1165, B:531:0x117c, B:534:0x1184, B:535:0x1187, B:536:0x1197, B:538:0x11b1, B:539:0x11ca, B:540:0x11d2, B:544:0x11ee, B:543:0x11dd, B:492:0x1046, B:494:0x104c, B:496:0x105c, B:498:0x1063, B:504:0x1079, B:506:0x1080, B:508:0x108f, B:510:0x109c, B:512:0x10bf, B:514:0x10eb, B:516:0x10f2, B:515:0x10ef, B:511:0x10bc, B:505:0x107d, B:497:0x1060, B:389:0x0c84, B:316:0x098a, B:310:0x0930, B:312:0x0936, B:547:0x11ff, B:54:0x011b, B:71:0x019f, B:79:0x01e2, B:85:0x01fe, B:89:0x0214, B:93:0x022b, B:551:0x1212, B:552:0x1215, B:48:0x00dc, B:59:0x0127), top: B:555:0x0015, inners: #6, #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:233:0x06e4 A[Catch: all -> 0x0081, TryCatch #0 {all -> 0x0081, blocks: (B:3:0x0015, B:22:0x007c, B:94:0x022e, B:96:0x0232, B:99:0x023a, B:100:0x0253, B:103:0x0269, B:106:0x0295, B:108:0x02ce, B:111:0x02e5, B:113:0x02ef, B:280:0x0887, B:116:0x031a, B:118:0x0330, B:121:0x0353, B:123:0x035d, B:125:0x036d, B:127:0x037b, B:129:0x038b, B:130:0x0396, B:131:0x0399, B:133:0x03ad, B:187:0x05d2, B:188:0x05de, B:191:0x05ea, B:197:0x060d, B:194:0x05fc, B:200:0x0615, B:202:0x0621, B:204:0x062d, B:218:0x0675, B:221:0x069c, B:223:0x06a8, B:226:0x06b9, B:228:0x06ca, B:230:0x06d8, B:245:0x0730, B:247:0x0741, B:249:0x074b, B:250:0x0757, B:252:0x0761, B:254:0x0771, B:256:0x077b, B:257:0x078c, B:259:0x0792, B:260:0x07ad, B:262:0x07b3, B:263:0x07d1, B:264:0x07de, B:268:0x0807, B:265:0x07e6, B:267:0x07f4, B:269:0x0813, B:270:0x0834, B:272:0x083a, B:274:0x084d, B:275:0x085a, B:277:0x0861, B:279:0x0873, B:233:0x06e4, B:235:0x06f0, B:238:0x0703, B:240:0x0714, B:242:0x0722, B:210:0x0652, B:214:0x0665, B:216:0x066b, B:219:0x0693, B:136:0x03c3, B:142:0x03d9, B:145:0x03e7, B:147:0x03f5, B:151:0x0449, B:148:0x0419, B:150:0x0429, B:155:0x0456, B:158:0x0487, B:159:0x04af, B:161:0x04eb, B:163:0x04f1, B:166:0x04fd, B:168:0x0534, B:169:0x054f, B:171:0x0559, B:173:0x0569, B:178:0x0582, B:174:0x0572, B:182:0x058b, B:184:0x0598, B:185:0x05b9, B:283:0x08a0, B:285:0x08b2, B:287:0x08bb, B:299:0x08ef, B:289:0x08c5, B:291:0x08ce, B:293:0x08d4, B:296:0x08e0, B:298:0x08e8, B:300:0x08f2, B:301:0x08fe, B:304:0x0906, B:306:0x0918, B:307:0x0923, B:309:0x092b, B:313:0x0957, B:315:0x0978, B:317:0x098d, B:319:0x099c, B:321:0x09b6, B:322:0x09c8, B:323:0x09cb, B:324:0x09e7, B:326:0x09ed, B:328:0x0a05, B:329:0x0a13, B:331:0x0a23, B:332:0x0a31, B:333:0x0a34, B:336:0x0a4a, B:338:0x0a85, B:340:0x0a8b, B:346:0x0ab2, B:348:0x0ab8, B:349:0x0acf, B:351:0x0ad5, B:341:0x0a99, B:343:0x0a9f, B:345:0x0aa5, B:352:0x0ae9, B:355:0x0b00, B:357:0x0b1a, B:363:0x0b2e, B:365:0x0b3e, B:368:0x0b47, B:370:0x0b4d, B:371:0x0b63, B:373:0x0b69, B:375:0x0b79, B:377:0x0b91, B:379:0x0ba3, B:381:0x0bc2, B:383:0x0be9, B:384:0x0c16, B:385:0x0c1f, B:386:0x0c23, B:388:0x0c32, B:390:0x0ccd, B:392:0x0cdd, B:393:0x0cf0, B:396:0x0cf8, B:399:0x0d16, B:401:0x0d2f, B:403:0x0d44, B:406:0x0d4c, B:408:0x0d50, B:410:0x0d54, B:412:0x0d5e, B:414:0x0d69, B:416:0x0d6d, B:418:0x0d73, B:420:0x0d7e, B:422:0x0d8c, B:480:0x0fcf, B:424:0x0d95, B:426:0x0dca, B:427:0x0dd2, B:429:0x0dd8, B:431:0x0de8, B:438:0x0e10, B:439:0x0e33, B:441:0x0e3f, B:443:0x0e53, B:444:0x0e8f, B:450:0x0ea9, B:452:0x0eb4, B:454:0x0eb8, B:456:0x0ebc, B:458:0x0ec0, B:459:0x0ecc, B:460:0x0ed1, B:462:0x0ed7, B:464:0x0eef, B:465:0x0ef8, B:479:0x0fcc, B:466:0x0f38, B:468:0x0f40, B:472:0x0f58, B:474:0x0f74, B:475:0x0f7f, B:478:0x0fc0, B:469:0x0f45, B:436:0x0dfc, B:481:0x0fd9, B:483:0x0fe5, B:484:0x0ff9, B:485:0x1001, B:487:0x1007, B:489:0x101d, B:491:0x102d, B:517:0x10fa, B:519:0x1100, B:521:0x1110, B:524:0x1117, B:529:0x1156, B:525:0x1126, B:527:0x1132, B:528:0x113f, B:530:0x1165, B:531:0x117c, B:534:0x1184, B:535:0x1187, B:536:0x1197, B:538:0x11b1, B:539:0x11ca, B:540:0x11d2, B:544:0x11ee, B:543:0x11dd, B:492:0x1046, B:494:0x104c, B:496:0x105c, B:498:0x1063, B:504:0x1079, B:506:0x1080, B:508:0x108f, B:510:0x109c, B:512:0x10bf, B:514:0x10eb, B:516:0x10f2, B:515:0x10ef, B:511:0x10bc, B:505:0x107d, B:497:0x1060, B:389:0x0c84, B:316:0x098a, B:310:0x0930, B:312:0x0936, B:547:0x11ff, B:54:0x011b, B:71:0x019f, B:79:0x01e2, B:85:0x01fe, B:89:0x0214, B:93:0x022b, B:551:0x1212, B:552:0x1215, B:48:0x00dc, B:59:0x0127), top: B:555:0x0015, inners: #6, #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:244:0x072c  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x086d  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x08c5 A[Catch: all -> 0x0081, TryCatch #0 {all -> 0x0081, blocks: (B:3:0x0015, B:22:0x007c, B:94:0x022e, B:96:0x0232, B:99:0x023a, B:100:0x0253, B:103:0x0269, B:106:0x0295, B:108:0x02ce, B:111:0x02e5, B:113:0x02ef, B:280:0x0887, B:116:0x031a, B:118:0x0330, B:121:0x0353, B:123:0x035d, B:125:0x036d, B:127:0x037b, B:129:0x038b, B:130:0x0396, B:131:0x0399, B:133:0x03ad, B:187:0x05d2, B:188:0x05de, B:191:0x05ea, B:197:0x060d, B:194:0x05fc, B:200:0x0615, B:202:0x0621, B:204:0x062d, B:218:0x0675, B:221:0x069c, B:223:0x06a8, B:226:0x06b9, B:228:0x06ca, B:230:0x06d8, B:245:0x0730, B:247:0x0741, B:249:0x074b, B:250:0x0757, B:252:0x0761, B:254:0x0771, B:256:0x077b, B:257:0x078c, B:259:0x0792, B:260:0x07ad, B:262:0x07b3, B:263:0x07d1, B:264:0x07de, B:268:0x0807, B:265:0x07e6, B:267:0x07f4, B:269:0x0813, B:270:0x0834, B:272:0x083a, B:274:0x084d, B:275:0x085a, B:277:0x0861, B:279:0x0873, B:233:0x06e4, B:235:0x06f0, B:238:0x0703, B:240:0x0714, B:242:0x0722, B:210:0x0652, B:214:0x0665, B:216:0x066b, B:219:0x0693, B:136:0x03c3, B:142:0x03d9, B:145:0x03e7, B:147:0x03f5, B:151:0x0449, B:148:0x0419, B:150:0x0429, B:155:0x0456, B:158:0x0487, B:159:0x04af, B:161:0x04eb, B:163:0x04f1, B:166:0x04fd, B:168:0x0534, B:169:0x054f, B:171:0x0559, B:173:0x0569, B:178:0x0582, B:174:0x0572, B:182:0x058b, B:184:0x0598, B:185:0x05b9, B:283:0x08a0, B:285:0x08b2, B:287:0x08bb, B:299:0x08ef, B:289:0x08c5, B:291:0x08ce, B:293:0x08d4, B:296:0x08e0, B:298:0x08e8, B:300:0x08f2, B:301:0x08fe, B:304:0x0906, B:306:0x0918, B:307:0x0923, B:309:0x092b, B:313:0x0957, B:315:0x0978, B:317:0x098d, B:319:0x099c, B:321:0x09b6, B:322:0x09c8, B:323:0x09cb, B:324:0x09e7, B:326:0x09ed, B:328:0x0a05, B:329:0x0a13, B:331:0x0a23, B:332:0x0a31, B:333:0x0a34, B:336:0x0a4a, B:338:0x0a85, B:340:0x0a8b, B:346:0x0ab2, B:348:0x0ab8, B:349:0x0acf, B:351:0x0ad5, B:341:0x0a99, B:343:0x0a9f, B:345:0x0aa5, B:352:0x0ae9, B:355:0x0b00, B:357:0x0b1a, B:363:0x0b2e, B:365:0x0b3e, B:368:0x0b47, B:370:0x0b4d, B:371:0x0b63, B:373:0x0b69, B:375:0x0b79, B:377:0x0b91, B:379:0x0ba3, B:381:0x0bc2, B:383:0x0be9, B:384:0x0c16, B:385:0x0c1f, B:386:0x0c23, B:388:0x0c32, B:390:0x0ccd, B:392:0x0cdd, B:393:0x0cf0, B:396:0x0cf8, B:399:0x0d16, B:401:0x0d2f, B:403:0x0d44, B:406:0x0d4c, B:408:0x0d50, B:410:0x0d54, B:412:0x0d5e, B:414:0x0d69, B:416:0x0d6d, B:418:0x0d73, B:420:0x0d7e, B:422:0x0d8c, B:480:0x0fcf, B:424:0x0d95, B:426:0x0dca, B:427:0x0dd2, B:429:0x0dd8, B:431:0x0de8, B:438:0x0e10, B:439:0x0e33, B:441:0x0e3f, B:443:0x0e53, B:444:0x0e8f, B:450:0x0ea9, B:452:0x0eb4, B:454:0x0eb8, B:456:0x0ebc, B:458:0x0ec0, B:459:0x0ecc, B:460:0x0ed1, B:462:0x0ed7, B:464:0x0eef, B:465:0x0ef8, B:479:0x0fcc, B:466:0x0f38, B:468:0x0f40, B:472:0x0f58, B:474:0x0f74, B:475:0x0f7f, B:478:0x0fc0, B:469:0x0f45, B:436:0x0dfc, B:481:0x0fd9, B:483:0x0fe5, B:484:0x0ff9, B:485:0x1001, B:487:0x1007, B:489:0x101d, B:491:0x102d, B:517:0x10fa, B:519:0x1100, B:521:0x1110, B:524:0x1117, B:529:0x1156, B:525:0x1126, B:527:0x1132, B:528:0x113f, B:530:0x1165, B:531:0x117c, B:534:0x1184, B:535:0x1187, B:536:0x1197, B:538:0x11b1, B:539:0x11ca, B:540:0x11d2, B:544:0x11ee, B:543:0x11dd, B:492:0x1046, B:494:0x104c, B:496:0x105c, B:498:0x1063, B:504:0x1079, B:506:0x1080, B:508:0x108f, B:510:0x109c, B:512:0x10bf, B:514:0x10eb, B:516:0x10f2, B:515:0x10ef, B:511:0x10bc, B:505:0x107d, B:497:0x1060, B:389:0x0c84, B:316:0x098a, B:310:0x0930, B:312:0x0936, B:547:0x11ff, B:54:0x011b, B:71:0x019f, B:79:0x01e2, B:85:0x01fe, B:89:0x0214, B:93:0x022b, B:551:0x1212, B:552:0x1215, B:48:0x00dc, B:59:0x0127), top: B:555:0x0015, inners: #6, #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:438:0x0e10 A[Catch: all -> 0x0081, TryCatch #0 {all -> 0x0081, blocks: (B:3:0x0015, B:22:0x007c, B:94:0x022e, B:96:0x0232, B:99:0x023a, B:100:0x0253, B:103:0x0269, B:106:0x0295, B:108:0x02ce, B:111:0x02e5, B:113:0x02ef, B:280:0x0887, B:116:0x031a, B:118:0x0330, B:121:0x0353, B:123:0x035d, B:125:0x036d, B:127:0x037b, B:129:0x038b, B:130:0x0396, B:131:0x0399, B:133:0x03ad, B:187:0x05d2, B:188:0x05de, B:191:0x05ea, B:197:0x060d, B:194:0x05fc, B:200:0x0615, B:202:0x0621, B:204:0x062d, B:218:0x0675, B:221:0x069c, B:223:0x06a8, B:226:0x06b9, B:228:0x06ca, B:230:0x06d8, B:245:0x0730, B:247:0x0741, B:249:0x074b, B:250:0x0757, B:252:0x0761, B:254:0x0771, B:256:0x077b, B:257:0x078c, B:259:0x0792, B:260:0x07ad, B:262:0x07b3, B:263:0x07d1, B:264:0x07de, B:268:0x0807, B:265:0x07e6, B:267:0x07f4, B:269:0x0813, B:270:0x0834, B:272:0x083a, B:274:0x084d, B:275:0x085a, B:277:0x0861, B:279:0x0873, B:233:0x06e4, B:235:0x06f0, B:238:0x0703, B:240:0x0714, B:242:0x0722, B:210:0x0652, B:214:0x0665, B:216:0x066b, B:219:0x0693, B:136:0x03c3, B:142:0x03d9, B:145:0x03e7, B:147:0x03f5, B:151:0x0449, B:148:0x0419, B:150:0x0429, B:155:0x0456, B:158:0x0487, B:159:0x04af, B:161:0x04eb, B:163:0x04f1, B:166:0x04fd, B:168:0x0534, B:169:0x054f, B:171:0x0559, B:173:0x0569, B:178:0x0582, B:174:0x0572, B:182:0x058b, B:184:0x0598, B:185:0x05b9, B:283:0x08a0, B:285:0x08b2, B:287:0x08bb, B:299:0x08ef, B:289:0x08c5, B:291:0x08ce, B:293:0x08d4, B:296:0x08e0, B:298:0x08e8, B:300:0x08f2, B:301:0x08fe, B:304:0x0906, B:306:0x0918, B:307:0x0923, B:309:0x092b, B:313:0x0957, B:315:0x0978, B:317:0x098d, B:319:0x099c, B:321:0x09b6, B:322:0x09c8, B:323:0x09cb, B:324:0x09e7, B:326:0x09ed, B:328:0x0a05, B:329:0x0a13, B:331:0x0a23, B:332:0x0a31, B:333:0x0a34, B:336:0x0a4a, B:338:0x0a85, B:340:0x0a8b, B:346:0x0ab2, B:348:0x0ab8, B:349:0x0acf, B:351:0x0ad5, B:341:0x0a99, B:343:0x0a9f, B:345:0x0aa5, B:352:0x0ae9, B:355:0x0b00, B:357:0x0b1a, B:363:0x0b2e, B:365:0x0b3e, B:368:0x0b47, B:370:0x0b4d, B:371:0x0b63, B:373:0x0b69, B:375:0x0b79, B:377:0x0b91, B:379:0x0ba3, B:381:0x0bc2, B:383:0x0be9, B:384:0x0c16, B:385:0x0c1f, B:386:0x0c23, B:388:0x0c32, B:390:0x0ccd, B:392:0x0cdd, B:393:0x0cf0, B:396:0x0cf8, B:399:0x0d16, B:401:0x0d2f, B:403:0x0d44, B:406:0x0d4c, B:408:0x0d50, B:410:0x0d54, B:412:0x0d5e, B:414:0x0d69, B:416:0x0d6d, B:418:0x0d73, B:420:0x0d7e, B:422:0x0d8c, B:480:0x0fcf, B:424:0x0d95, B:426:0x0dca, B:427:0x0dd2, B:429:0x0dd8, B:431:0x0de8, B:438:0x0e10, B:439:0x0e33, B:441:0x0e3f, B:443:0x0e53, B:444:0x0e8f, B:450:0x0ea9, B:452:0x0eb4, B:454:0x0eb8, B:456:0x0ebc, B:458:0x0ec0, B:459:0x0ecc, B:460:0x0ed1, B:462:0x0ed7, B:464:0x0eef, B:465:0x0ef8, B:479:0x0fcc, B:466:0x0f38, B:468:0x0f40, B:472:0x0f58, B:474:0x0f74, B:475:0x0f7f, B:478:0x0fc0, B:469:0x0f45, B:436:0x0dfc, B:481:0x0fd9, B:483:0x0fe5, B:484:0x0ff9, B:485:0x1001, B:487:0x1007, B:489:0x101d, B:491:0x102d, B:517:0x10fa, B:519:0x1100, B:521:0x1110, B:524:0x1117, B:529:0x1156, B:525:0x1126, B:527:0x1132, B:528:0x113f, B:530:0x1165, B:531:0x117c, B:534:0x1184, B:535:0x1187, B:536:0x1197, B:538:0x11b1, B:539:0x11ca, B:540:0x11d2, B:544:0x11ee, B:543:0x11dd, B:492:0x1046, B:494:0x104c, B:496:0x105c, B:498:0x1063, B:504:0x1079, B:506:0x1080, B:508:0x108f, B:510:0x109c, B:512:0x10bf, B:514:0x10eb, B:516:0x10f2, B:515:0x10ef, B:511:0x10bc, B:505:0x107d, B:497:0x1060, B:389:0x0c84, B:316:0x098a, B:310:0x0930, B:312:0x0936, B:547:0x11ff, B:54:0x011b, B:71:0x019f, B:79:0x01e2, B:85:0x01fe, B:89:0x0214, B:93:0x022b, B:551:0x1212, B:552:0x1215, B:48:0x00dc, B:59:0x0127), top: B:555:0x0015, inners: #6, #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:439:0x0e33 A[Catch: all -> 0x0081, TryCatch #0 {all -> 0x0081, blocks: (B:3:0x0015, B:22:0x007c, B:94:0x022e, B:96:0x0232, B:99:0x023a, B:100:0x0253, B:103:0x0269, B:106:0x0295, B:108:0x02ce, B:111:0x02e5, B:113:0x02ef, B:280:0x0887, B:116:0x031a, B:118:0x0330, B:121:0x0353, B:123:0x035d, B:125:0x036d, B:127:0x037b, B:129:0x038b, B:130:0x0396, B:131:0x0399, B:133:0x03ad, B:187:0x05d2, B:188:0x05de, B:191:0x05ea, B:197:0x060d, B:194:0x05fc, B:200:0x0615, B:202:0x0621, B:204:0x062d, B:218:0x0675, B:221:0x069c, B:223:0x06a8, B:226:0x06b9, B:228:0x06ca, B:230:0x06d8, B:245:0x0730, B:247:0x0741, B:249:0x074b, B:250:0x0757, B:252:0x0761, B:254:0x0771, B:256:0x077b, B:257:0x078c, B:259:0x0792, B:260:0x07ad, B:262:0x07b3, B:263:0x07d1, B:264:0x07de, B:268:0x0807, B:265:0x07e6, B:267:0x07f4, B:269:0x0813, B:270:0x0834, B:272:0x083a, B:274:0x084d, B:275:0x085a, B:277:0x0861, B:279:0x0873, B:233:0x06e4, B:235:0x06f0, B:238:0x0703, B:240:0x0714, B:242:0x0722, B:210:0x0652, B:214:0x0665, B:216:0x066b, B:219:0x0693, B:136:0x03c3, B:142:0x03d9, B:145:0x03e7, B:147:0x03f5, B:151:0x0449, B:148:0x0419, B:150:0x0429, B:155:0x0456, B:158:0x0487, B:159:0x04af, B:161:0x04eb, B:163:0x04f1, B:166:0x04fd, B:168:0x0534, B:169:0x054f, B:171:0x0559, B:173:0x0569, B:178:0x0582, B:174:0x0572, B:182:0x058b, B:184:0x0598, B:185:0x05b9, B:283:0x08a0, B:285:0x08b2, B:287:0x08bb, B:299:0x08ef, B:289:0x08c5, B:291:0x08ce, B:293:0x08d4, B:296:0x08e0, B:298:0x08e8, B:300:0x08f2, B:301:0x08fe, B:304:0x0906, B:306:0x0918, B:307:0x0923, B:309:0x092b, B:313:0x0957, B:315:0x0978, B:317:0x098d, B:319:0x099c, B:321:0x09b6, B:322:0x09c8, B:323:0x09cb, B:324:0x09e7, B:326:0x09ed, B:328:0x0a05, B:329:0x0a13, B:331:0x0a23, B:332:0x0a31, B:333:0x0a34, B:336:0x0a4a, B:338:0x0a85, B:340:0x0a8b, B:346:0x0ab2, B:348:0x0ab8, B:349:0x0acf, B:351:0x0ad5, B:341:0x0a99, B:343:0x0a9f, B:345:0x0aa5, B:352:0x0ae9, B:355:0x0b00, B:357:0x0b1a, B:363:0x0b2e, B:365:0x0b3e, B:368:0x0b47, B:370:0x0b4d, B:371:0x0b63, B:373:0x0b69, B:375:0x0b79, B:377:0x0b91, B:379:0x0ba3, B:381:0x0bc2, B:383:0x0be9, B:384:0x0c16, B:385:0x0c1f, B:386:0x0c23, B:388:0x0c32, B:390:0x0ccd, B:392:0x0cdd, B:393:0x0cf0, B:396:0x0cf8, B:399:0x0d16, B:401:0x0d2f, B:403:0x0d44, B:406:0x0d4c, B:408:0x0d50, B:410:0x0d54, B:412:0x0d5e, B:414:0x0d69, B:416:0x0d6d, B:418:0x0d73, B:420:0x0d7e, B:422:0x0d8c, B:480:0x0fcf, B:424:0x0d95, B:426:0x0dca, B:427:0x0dd2, B:429:0x0dd8, B:431:0x0de8, B:438:0x0e10, B:439:0x0e33, B:441:0x0e3f, B:443:0x0e53, B:444:0x0e8f, B:450:0x0ea9, B:452:0x0eb4, B:454:0x0eb8, B:456:0x0ebc, B:458:0x0ec0, B:459:0x0ecc, B:460:0x0ed1, B:462:0x0ed7, B:464:0x0eef, B:465:0x0ef8, B:479:0x0fcc, B:466:0x0f38, B:468:0x0f40, B:472:0x0f58, B:474:0x0f74, B:475:0x0f7f, B:478:0x0fc0, B:469:0x0f45, B:436:0x0dfc, B:481:0x0fd9, B:483:0x0fe5, B:484:0x0ff9, B:485:0x1001, B:487:0x1007, B:489:0x101d, B:491:0x102d, B:517:0x10fa, B:519:0x1100, B:521:0x1110, B:524:0x1117, B:529:0x1156, B:525:0x1126, B:527:0x1132, B:528:0x113f, B:530:0x1165, B:531:0x117c, B:534:0x1184, B:535:0x1187, B:536:0x1197, B:538:0x11b1, B:539:0x11ca, B:540:0x11d2, B:544:0x11ee, B:543:0x11dd, B:492:0x1046, B:494:0x104c, B:496:0x105c, B:498:0x1063, B:504:0x1079, B:506:0x1080, B:508:0x108f, B:510:0x109c, B:512:0x10bf, B:514:0x10eb, B:516:0x10f2, B:515:0x10ef, B:511:0x10bc, B:505:0x107d, B:497:0x1060, B:389:0x0c84, B:316:0x098a, B:310:0x0930, B:312:0x0936, B:547:0x11ff, B:54:0x011b, B:71:0x019f, B:79:0x01e2, B:85:0x01fe, B:89:0x0214, B:93:0x022b, B:551:0x1212, B:552:0x1215, B:48:0x00dc, B:59:0x0127), top: B:555:0x0015, inners: #6, #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:511:0x10bc A[Catch: all -> 0x0081, TryCatch #0 {all -> 0x0081, blocks: (B:3:0x0015, B:22:0x007c, B:94:0x022e, B:96:0x0232, B:99:0x023a, B:100:0x0253, B:103:0x0269, B:106:0x0295, B:108:0x02ce, B:111:0x02e5, B:113:0x02ef, B:280:0x0887, B:116:0x031a, B:118:0x0330, B:121:0x0353, B:123:0x035d, B:125:0x036d, B:127:0x037b, B:129:0x038b, B:130:0x0396, B:131:0x0399, B:133:0x03ad, B:187:0x05d2, B:188:0x05de, B:191:0x05ea, B:197:0x060d, B:194:0x05fc, B:200:0x0615, B:202:0x0621, B:204:0x062d, B:218:0x0675, B:221:0x069c, B:223:0x06a8, B:226:0x06b9, B:228:0x06ca, B:230:0x06d8, B:245:0x0730, B:247:0x0741, B:249:0x074b, B:250:0x0757, B:252:0x0761, B:254:0x0771, B:256:0x077b, B:257:0x078c, B:259:0x0792, B:260:0x07ad, B:262:0x07b3, B:263:0x07d1, B:264:0x07de, B:268:0x0807, B:265:0x07e6, B:267:0x07f4, B:269:0x0813, B:270:0x0834, B:272:0x083a, B:274:0x084d, B:275:0x085a, B:277:0x0861, B:279:0x0873, B:233:0x06e4, B:235:0x06f0, B:238:0x0703, B:240:0x0714, B:242:0x0722, B:210:0x0652, B:214:0x0665, B:216:0x066b, B:219:0x0693, B:136:0x03c3, B:142:0x03d9, B:145:0x03e7, B:147:0x03f5, B:151:0x0449, B:148:0x0419, B:150:0x0429, B:155:0x0456, B:158:0x0487, B:159:0x04af, B:161:0x04eb, B:163:0x04f1, B:166:0x04fd, B:168:0x0534, B:169:0x054f, B:171:0x0559, B:173:0x0569, B:178:0x0582, B:174:0x0572, B:182:0x058b, B:184:0x0598, B:185:0x05b9, B:283:0x08a0, B:285:0x08b2, B:287:0x08bb, B:299:0x08ef, B:289:0x08c5, B:291:0x08ce, B:293:0x08d4, B:296:0x08e0, B:298:0x08e8, B:300:0x08f2, B:301:0x08fe, B:304:0x0906, B:306:0x0918, B:307:0x0923, B:309:0x092b, B:313:0x0957, B:315:0x0978, B:317:0x098d, B:319:0x099c, B:321:0x09b6, B:322:0x09c8, B:323:0x09cb, B:324:0x09e7, B:326:0x09ed, B:328:0x0a05, B:329:0x0a13, B:331:0x0a23, B:332:0x0a31, B:333:0x0a34, B:336:0x0a4a, B:338:0x0a85, B:340:0x0a8b, B:346:0x0ab2, B:348:0x0ab8, B:349:0x0acf, B:351:0x0ad5, B:341:0x0a99, B:343:0x0a9f, B:345:0x0aa5, B:352:0x0ae9, B:355:0x0b00, B:357:0x0b1a, B:363:0x0b2e, B:365:0x0b3e, B:368:0x0b47, B:370:0x0b4d, B:371:0x0b63, B:373:0x0b69, B:375:0x0b79, B:377:0x0b91, B:379:0x0ba3, B:381:0x0bc2, B:383:0x0be9, B:384:0x0c16, B:385:0x0c1f, B:386:0x0c23, B:388:0x0c32, B:390:0x0ccd, B:392:0x0cdd, B:393:0x0cf0, B:396:0x0cf8, B:399:0x0d16, B:401:0x0d2f, B:403:0x0d44, B:406:0x0d4c, B:408:0x0d50, B:410:0x0d54, B:412:0x0d5e, B:414:0x0d69, B:416:0x0d6d, B:418:0x0d73, B:420:0x0d7e, B:422:0x0d8c, B:480:0x0fcf, B:424:0x0d95, B:426:0x0dca, B:427:0x0dd2, B:429:0x0dd8, B:431:0x0de8, B:438:0x0e10, B:439:0x0e33, B:441:0x0e3f, B:443:0x0e53, B:444:0x0e8f, B:450:0x0ea9, B:452:0x0eb4, B:454:0x0eb8, B:456:0x0ebc, B:458:0x0ec0, B:459:0x0ecc, B:460:0x0ed1, B:462:0x0ed7, B:464:0x0eef, B:465:0x0ef8, B:479:0x0fcc, B:466:0x0f38, B:468:0x0f40, B:472:0x0f58, B:474:0x0f74, B:475:0x0f7f, B:478:0x0fc0, B:469:0x0f45, B:436:0x0dfc, B:481:0x0fd9, B:483:0x0fe5, B:484:0x0ff9, B:485:0x1001, B:487:0x1007, B:489:0x101d, B:491:0x102d, B:517:0x10fa, B:519:0x1100, B:521:0x1110, B:524:0x1117, B:529:0x1156, B:525:0x1126, B:527:0x1132, B:528:0x113f, B:530:0x1165, B:531:0x117c, B:534:0x1184, B:535:0x1187, B:536:0x1197, B:538:0x11b1, B:539:0x11ca, B:540:0x11d2, B:544:0x11ee, B:543:0x11dd, B:492:0x1046, B:494:0x104c, B:496:0x105c, B:498:0x1063, B:504:0x1079, B:506:0x1080, B:508:0x108f, B:510:0x109c, B:512:0x10bf, B:514:0x10eb, B:516:0x10f2, B:515:0x10ef, B:511:0x10bc, B:505:0x107d, B:497:0x1060, B:389:0x0c84, B:316:0x098a, B:310:0x0930, B:312:0x0936, B:547:0x11ff, B:54:0x011b, B:71:0x019f, B:79:0x01e2, B:85:0x01fe, B:89:0x0214, B:93:0x022b, B:551:0x1212, B:552:0x1215, B:48:0x00dc, B:59:0x0127), top: B:555:0x0015, inners: #6, #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x010a A[Catch: all -> 0x0095, SQLiteException -> 0x0120, TRY_LEAVE, TryCatch #3 {all -> 0x0095, blocks: (B:20:0x0076, B:26:0x0084, B:27:0x0088, B:51:0x00e8, B:53:0x010a, B:58:0x0123, B:59:0x0127, B:60:0x0137, B:62:0x013d, B:63:0x014e, B:65:0x0158, B:68:0x016e, B:70:0x018e, B:74:0x01a5, B:75:0x01ae, B:77:0x01b9, B:83:0x01f8, B:82:0x01e7, B:67:0x0167, B:88:0x0203, B:91:0x0218, B:46:0x00d6, B:50:0x00e1), top: B:560:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:551:0x1212 A[Catch: all -> 0x0081, TRY_ENTER, TryCatch #0 {all -> 0x0081, blocks: (B:3:0x0015, B:22:0x007c, B:94:0x022e, B:96:0x0232, B:99:0x023a, B:100:0x0253, B:103:0x0269, B:106:0x0295, B:108:0x02ce, B:111:0x02e5, B:113:0x02ef, B:280:0x0887, B:116:0x031a, B:118:0x0330, B:121:0x0353, B:123:0x035d, B:125:0x036d, B:127:0x037b, B:129:0x038b, B:130:0x0396, B:131:0x0399, B:133:0x03ad, B:187:0x05d2, B:188:0x05de, B:191:0x05ea, B:197:0x060d, B:194:0x05fc, B:200:0x0615, B:202:0x0621, B:204:0x062d, B:218:0x0675, B:221:0x069c, B:223:0x06a8, B:226:0x06b9, B:228:0x06ca, B:230:0x06d8, B:245:0x0730, B:247:0x0741, B:249:0x074b, B:250:0x0757, B:252:0x0761, B:254:0x0771, B:256:0x077b, B:257:0x078c, B:259:0x0792, B:260:0x07ad, B:262:0x07b3, B:263:0x07d1, B:264:0x07de, B:268:0x0807, B:265:0x07e6, B:267:0x07f4, B:269:0x0813, B:270:0x0834, B:272:0x083a, B:274:0x084d, B:275:0x085a, B:277:0x0861, B:279:0x0873, B:233:0x06e4, B:235:0x06f0, B:238:0x0703, B:240:0x0714, B:242:0x0722, B:210:0x0652, B:214:0x0665, B:216:0x066b, B:219:0x0693, B:136:0x03c3, B:142:0x03d9, B:145:0x03e7, B:147:0x03f5, B:151:0x0449, B:148:0x0419, B:150:0x0429, B:155:0x0456, B:158:0x0487, B:159:0x04af, B:161:0x04eb, B:163:0x04f1, B:166:0x04fd, B:168:0x0534, B:169:0x054f, B:171:0x0559, B:173:0x0569, B:178:0x0582, B:174:0x0572, B:182:0x058b, B:184:0x0598, B:185:0x05b9, B:283:0x08a0, B:285:0x08b2, B:287:0x08bb, B:299:0x08ef, B:289:0x08c5, B:291:0x08ce, B:293:0x08d4, B:296:0x08e0, B:298:0x08e8, B:300:0x08f2, B:301:0x08fe, B:304:0x0906, B:306:0x0918, B:307:0x0923, B:309:0x092b, B:313:0x0957, B:315:0x0978, B:317:0x098d, B:319:0x099c, B:321:0x09b6, B:322:0x09c8, B:323:0x09cb, B:324:0x09e7, B:326:0x09ed, B:328:0x0a05, B:329:0x0a13, B:331:0x0a23, B:332:0x0a31, B:333:0x0a34, B:336:0x0a4a, B:338:0x0a85, B:340:0x0a8b, B:346:0x0ab2, B:348:0x0ab8, B:349:0x0acf, B:351:0x0ad5, B:341:0x0a99, B:343:0x0a9f, B:345:0x0aa5, B:352:0x0ae9, B:355:0x0b00, B:357:0x0b1a, B:363:0x0b2e, B:365:0x0b3e, B:368:0x0b47, B:370:0x0b4d, B:371:0x0b63, B:373:0x0b69, B:375:0x0b79, B:377:0x0b91, B:379:0x0ba3, B:381:0x0bc2, B:383:0x0be9, B:384:0x0c16, B:385:0x0c1f, B:386:0x0c23, B:388:0x0c32, B:390:0x0ccd, B:392:0x0cdd, B:393:0x0cf0, B:396:0x0cf8, B:399:0x0d16, B:401:0x0d2f, B:403:0x0d44, B:406:0x0d4c, B:408:0x0d50, B:410:0x0d54, B:412:0x0d5e, B:414:0x0d69, B:416:0x0d6d, B:418:0x0d73, B:420:0x0d7e, B:422:0x0d8c, B:480:0x0fcf, B:424:0x0d95, B:426:0x0dca, B:427:0x0dd2, B:429:0x0dd8, B:431:0x0de8, B:438:0x0e10, B:439:0x0e33, B:441:0x0e3f, B:443:0x0e53, B:444:0x0e8f, B:450:0x0ea9, B:452:0x0eb4, B:454:0x0eb8, B:456:0x0ebc, B:458:0x0ec0, B:459:0x0ecc, B:460:0x0ed1, B:462:0x0ed7, B:464:0x0eef, B:465:0x0ef8, B:479:0x0fcc, B:466:0x0f38, B:468:0x0f40, B:472:0x0f58, B:474:0x0f74, B:475:0x0f7f, B:478:0x0fc0, B:469:0x0f45, B:436:0x0dfc, B:481:0x0fd9, B:483:0x0fe5, B:484:0x0ff9, B:485:0x1001, B:487:0x1007, B:489:0x101d, B:491:0x102d, B:517:0x10fa, B:519:0x1100, B:521:0x1110, B:524:0x1117, B:529:0x1156, B:525:0x1126, B:527:0x1132, B:528:0x113f, B:530:0x1165, B:531:0x117c, B:534:0x1184, B:535:0x1187, B:536:0x1197, B:538:0x11b1, B:539:0x11ca, B:540:0x11d2, B:544:0x11ee, B:543:0x11dd, B:492:0x1046, B:494:0x104c, B:496:0x105c, B:498:0x1063, B:504:0x1079, B:506:0x1080, B:508:0x108f, B:510:0x109c, B:512:0x10bf, B:514:0x10eb, B:516:0x10f2, B:515:0x10ef, B:511:0x10bc, B:505:0x107d, B:497:0x1060, B:389:0x0c84, B:316:0x098a, B:310:0x0930, B:312:0x0936, B:547:0x11ff, B:54:0x011b, B:71:0x019f, B:79:0x01e2, B:85:0x01fe, B:89:0x0214, B:93:0x022b, B:551:0x1212, B:552:0x1215, B:48:0x00dc, B:59:0x0127), top: B:555:0x0015, inners: #6, #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0123 A[Catch: all -> 0x0095, SQLiteException -> 0x0120, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x0095, blocks: (B:20:0x0076, B:26:0x0084, B:27:0x0088, B:51:0x00e8, B:53:0x010a, B:58:0x0123, B:59:0x0127, B:60:0x0137, B:62:0x013d, B:63:0x014e, B:65:0x0158, B:68:0x016e, B:70:0x018e, B:74:0x01a5, B:75:0x01ae, B:77:0x01b9, B:83:0x01f8, B:82:0x01e7, B:67:0x0167, B:88:0x0203, B:91:0x0218, B:46:0x00d6, B:50:0x00e1), top: B:560:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x022b A[Catch: all -> 0x0081, TRY_ENTER, TryCatch #0 {all -> 0x0081, blocks: (B:3:0x0015, B:22:0x007c, B:94:0x022e, B:96:0x0232, B:99:0x023a, B:100:0x0253, B:103:0x0269, B:106:0x0295, B:108:0x02ce, B:111:0x02e5, B:113:0x02ef, B:280:0x0887, B:116:0x031a, B:118:0x0330, B:121:0x0353, B:123:0x035d, B:125:0x036d, B:127:0x037b, B:129:0x038b, B:130:0x0396, B:131:0x0399, B:133:0x03ad, B:187:0x05d2, B:188:0x05de, B:191:0x05ea, B:197:0x060d, B:194:0x05fc, B:200:0x0615, B:202:0x0621, B:204:0x062d, B:218:0x0675, B:221:0x069c, B:223:0x06a8, B:226:0x06b9, B:228:0x06ca, B:230:0x06d8, B:245:0x0730, B:247:0x0741, B:249:0x074b, B:250:0x0757, B:252:0x0761, B:254:0x0771, B:256:0x077b, B:257:0x078c, B:259:0x0792, B:260:0x07ad, B:262:0x07b3, B:263:0x07d1, B:264:0x07de, B:268:0x0807, B:265:0x07e6, B:267:0x07f4, B:269:0x0813, B:270:0x0834, B:272:0x083a, B:274:0x084d, B:275:0x085a, B:277:0x0861, B:279:0x0873, B:233:0x06e4, B:235:0x06f0, B:238:0x0703, B:240:0x0714, B:242:0x0722, B:210:0x0652, B:214:0x0665, B:216:0x066b, B:219:0x0693, B:136:0x03c3, B:142:0x03d9, B:145:0x03e7, B:147:0x03f5, B:151:0x0449, B:148:0x0419, B:150:0x0429, B:155:0x0456, B:158:0x0487, B:159:0x04af, B:161:0x04eb, B:163:0x04f1, B:166:0x04fd, B:168:0x0534, B:169:0x054f, B:171:0x0559, B:173:0x0569, B:178:0x0582, B:174:0x0572, B:182:0x058b, B:184:0x0598, B:185:0x05b9, B:283:0x08a0, B:285:0x08b2, B:287:0x08bb, B:299:0x08ef, B:289:0x08c5, B:291:0x08ce, B:293:0x08d4, B:296:0x08e0, B:298:0x08e8, B:300:0x08f2, B:301:0x08fe, B:304:0x0906, B:306:0x0918, B:307:0x0923, B:309:0x092b, B:313:0x0957, B:315:0x0978, B:317:0x098d, B:319:0x099c, B:321:0x09b6, B:322:0x09c8, B:323:0x09cb, B:324:0x09e7, B:326:0x09ed, B:328:0x0a05, B:329:0x0a13, B:331:0x0a23, B:332:0x0a31, B:333:0x0a34, B:336:0x0a4a, B:338:0x0a85, B:340:0x0a8b, B:346:0x0ab2, B:348:0x0ab8, B:349:0x0acf, B:351:0x0ad5, B:341:0x0a99, B:343:0x0a9f, B:345:0x0aa5, B:352:0x0ae9, B:355:0x0b00, B:357:0x0b1a, B:363:0x0b2e, B:365:0x0b3e, B:368:0x0b47, B:370:0x0b4d, B:371:0x0b63, B:373:0x0b69, B:375:0x0b79, B:377:0x0b91, B:379:0x0ba3, B:381:0x0bc2, B:383:0x0be9, B:384:0x0c16, B:385:0x0c1f, B:386:0x0c23, B:388:0x0c32, B:390:0x0ccd, B:392:0x0cdd, B:393:0x0cf0, B:396:0x0cf8, B:399:0x0d16, B:401:0x0d2f, B:403:0x0d44, B:406:0x0d4c, B:408:0x0d50, B:410:0x0d54, B:412:0x0d5e, B:414:0x0d69, B:416:0x0d6d, B:418:0x0d73, B:420:0x0d7e, B:422:0x0d8c, B:480:0x0fcf, B:424:0x0d95, B:426:0x0dca, B:427:0x0dd2, B:429:0x0dd8, B:431:0x0de8, B:438:0x0e10, B:439:0x0e33, B:441:0x0e3f, B:443:0x0e53, B:444:0x0e8f, B:450:0x0ea9, B:452:0x0eb4, B:454:0x0eb8, B:456:0x0ebc, B:458:0x0ec0, B:459:0x0ecc, B:460:0x0ed1, B:462:0x0ed7, B:464:0x0eef, B:465:0x0ef8, B:479:0x0fcc, B:466:0x0f38, B:468:0x0f40, B:472:0x0f58, B:474:0x0f74, B:475:0x0f7f, B:478:0x0fc0, B:469:0x0f45, B:436:0x0dfc, B:481:0x0fd9, B:483:0x0fe5, B:484:0x0ff9, B:485:0x1001, B:487:0x1007, B:489:0x101d, B:491:0x102d, B:517:0x10fa, B:519:0x1100, B:521:0x1110, B:524:0x1117, B:529:0x1156, B:525:0x1126, B:527:0x1132, B:528:0x113f, B:530:0x1165, B:531:0x117c, B:534:0x1184, B:535:0x1187, B:536:0x1197, B:538:0x11b1, B:539:0x11ca, B:540:0x11d2, B:544:0x11ee, B:543:0x11dd, B:492:0x1046, B:494:0x104c, B:496:0x105c, B:498:0x1063, B:504:0x1079, B:506:0x1080, B:508:0x108f, B:510:0x109c, B:512:0x10bf, B:514:0x10eb, B:516:0x10f2, B:515:0x10ef, B:511:0x10bc, B:505:0x107d, B:497:0x1060, B:389:0x0c84, B:316:0x098a, B:310:0x0930, B:312:0x0936, B:547:0x11ff, B:54:0x011b, B:71:0x019f, B:79:0x01e2, B:85:0x01fe, B:89:0x0214, B:93:0x022b, B:551:0x1212, B:552:0x1215, B:48:0x00dc, B:59:0x0127), top: B:555:0x0015, inners: #6, #8 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean w(long r50, java.lang.String r52) {
        /*
            Method dump skipped, instruction units count: 4638
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o0l.w(long, java.lang.String):boolean");
    }

    public final boolean x(mhk mhkVar, mhk mhkVar2) {
        dgj.o("_e".equals(mhkVar.j()));
        X();
        z zVarX0 = dik.X0((x) mhkVar.b(), "_sc");
        String strF = zVarX0 == null ? null : zVarX0.F();
        X();
        z zVarX02 = dik.X0((x) mhkVar2.b(), "_pc");
        String strF2 = zVarX02 != null ? zVarX02.F() : null;
        if (strF2 == null || !strF2.equals(strF)) {
            return false;
        }
        dgj.o("_e".equals(mhkVar.j()));
        X();
        z zVarX03 = dik.X0((x) mhkVar.b(), "_et");
        if (zVarX03 == null || !zVarX03.J() || zVarX03.B() <= 0) {
            return true;
        }
        long jB = zVarX03.B();
        X();
        z zVarX04 = dik.X0((x) mhkVar2.b(), "_et");
        if (zVarX04 != null && zVarX04.B() > 0) {
            jB += zVarX04.B();
        }
        X();
        dik.o1(mhkVar2, "_et", Long.valueOf(jB));
        X();
        dik.o1(mhkVar, "_fr", 1L);
        return true;
    }

    public final void y(ArrayList arrayList) {
        dgj.o(!arrayList.isEmpty());
        if (this.c0 != null) {
            b0().J.b("Set uploading progress before finishing the previous upload");
        } else {
            this.c0 = new ArrayList(arrayList);
        }
    }

    public final void z() {
        O().K0();
        if (this.X || this.Y || this.Z) {
            b0().R.d("Not stopping services. fetch, network, upload", Boolean.valueOf(this.X), Boolean.valueOf(this.Y), Boolean.valueOf(this.Z));
            return;
        }
        b0().R.b("Stopping uploading service(s)");
        ArrayList arrayList = this.T;
        if (arrayList == null) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        ArrayList arrayList2 = this.T;
        dgj.v(arrayList2);
        arrayList2.clear();
    }

    @Override // defpackage.jrk
    public final Context zza() {
        return this.P.E;
    }

    @Override // defpackage.jrk
    public final ql8 zzb() {
        umk umkVar = this.P;
        dgj.v(umkVar);
        return umkVar.R;
    }
}
