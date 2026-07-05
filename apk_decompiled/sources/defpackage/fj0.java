package defpackage;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.os.LocaleList;
import android.os.PersistableBundle;
import android.os.Trace;
import android.util.Base64;
import android.util.Log;
import androidx.health.platform.client.proto.g;
import androidx.startup.StartupException;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.arkivanov.essenty.statekeeper.SerializableContainer;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.zip.Adler32;
import okio.Okio;
import okio.RealBufferedSink;
import okio.RealBufferedSource;
import okio.Sink;
import okio.Socket;
import okio.Source;

/* JADX INFO: loaded from: classes.dex */
public final class fj0 implements hi5, ocg, x82, Socket {
    public static volatile fj0 H;
    public static final Object I = new Object();
    public static final byte[] J = new byte[0];
    public Object E;
    public Object F;
    public Object G;

    public fj0(int i) {
        int i2 = 29;
        switch (i) {
            case 5:
                this.E = new zna(16);
                long[] jArr = u6f.a;
                this.F = new ewb();
                this.G = new lja(i2);
                break;
            case g.AVG_FIELD_NUMBER /* 18 */:
                this.E = new tk5(12);
                this.F = new tk5(12);
                this.G = new tk5(12);
                break;
            default:
                this.G = new lja(i2);
                break;
        }
    }

    public static void C(fj0 fj0Var, k20 k20Var, m20 m20Var, Object obj) {
        fj0Var.getClass();
        m20Var.getClass();
        i11 i11Var = new i11(k20Var);
        synchronized (((lja) fj0Var.G)) {
            try {
                if (obj == null) {
                    ((ewb) fj0Var.F).m(i11Var, new h11(null));
                } else {
                    ((zna) fj0Var.E).d(i11Var, new h11(obj));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static fj0 t(Context context) {
        if (H == null) {
            synchronized (I) {
                try {
                    if (H == null) {
                        fj0 fj0Var = new fj0();
                        fj0Var.G = context.getApplicationContext();
                        fj0Var.F = new HashSet();
                        fj0Var.E = new HashMap();
                        H = fj0Var;
                    }
                } finally {
                }
            }
        }
        return H;
    }

    public void A(String str) {
        qo0 qo0Var = (qo0) this.G;
        str.getClass();
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.F;
        if (linkedHashMap.containsKey(str)) {
            qo0Var.remove(str);
            qo0Var.addLast(str);
            while (qo0Var.size() > 3) {
                String str2 = (String) qo0Var.removeFirst();
                zfa.a.getClass();
                if (yfa.b()) {
                    String strE = iuj.E(this);
                    CopyOnWriteArrayList copyOnWriteArrayList = yfa.b;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : copyOnWriteArrayList) {
                        ((n30) ((zfa) obj)).getClass();
                        arrayList.add(obj);
                    }
                    if (!arrayList.isEmpty()) {
                        String strM = ebh.m(zfa.a, "Evicting MCP app WebView: ", str2);
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            ((n30) ((zfa) it.next())).b(sfa.INFO, strE, strM);
                        }
                    }
                }
                Object objRemove = linkedHashMap.remove(str2);
                if (objRemove != null) {
                    ((it2) this.E).invoke(objRemove);
                }
            }
        }
    }

    public boolean B(String str) throws IOException {
        File file = (File) this.G;
        boolean z = false;
        if (file != null) {
            String name = file.getName();
            name.getClass();
            if (!isg.h0(name, str, false)) {
                FileOutputStream fileOutputStream = (FileOutputStream) this.F;
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }
                this.F = null;
                this.G = null;
            }
        }
        if (((File) this.G) == null) {
            this.G = new File((File) this.E, str);
        }
        File file2 = (File) this.G;
        if (file2 != null) {
            if (!file2.exists()) {
                file2.createNewFile();
                z = true;
            }
            FileOutputStream fileOutputStream2 = (FileOutputStream) this.F;
            if (fileOutputStream2 == null) {
                fileOutputStream2 = new FileOutputStream(file2, true);
            }
            this.F = fileOutputStream2;
        }
        return z;
    }

    public void D(Object obj) {
        ((mdg) this.G).remove(obj);
    }

    public void E(pz7 pz7Var) {
        zcg zcgVar = ((mdg) this.G).H;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = zcgVar.iterator();
        while (((hmg) it).hasNext()) {
            Object next = ((hmg) it).next();
            if (((Boolean) pz7Var.invoke(((bz7) this.E).invoke(next), next)).booleanValue()) {
                linkedHashSet.add(next);
            }
        }
        zcgVar.removeAll(linkedHashSet);
    }

    public void F(Iterable iterable, pz7 pz7Var) {
        iterable.getClass();
        LinkedHashMap linkedHashMapV = v(iterable);
        E(new t04(pz7Var, 14, linkedHashMapV));
        ((mdg) this.G).putAll(linkedHashMapV);
    }

    public Object G(rzd rzdVar, pl9 pl9Var, rzd rzdVar2, ra4 ra4Var) {
        String value;
        pl9Var.getClass();
        rzdVar2.getClass();
        StringBuilder sb = new StringBuilder();
        sq6.D(pl9Var, sb, ':');
        if (rzdVar == null || (value = rzdVar.getValue()) == null) {
            value = "";
        }
        x59 x59Var = (x59) ((ConcurrentHashMap) this.F).get(sq6.w(sb, value, ':', rzdVar2));
        Object objB = x59Var != null ? x59Var.b(ra4Var) : null;
        if (objB == null) {
            return null;
        }
        return objB;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object H(defpackage.k20 r7, defpackage.m20 r8, defpackage.ny r9, defpackage.vp4 r10) {
        /*
            r6 = this;
            boolean r0 = r10 instanceof defpackage.j11
            if (r0 == 0) goto L13
            r0 = r10
            j11 r0 = (defpackage.j11) r0
            int r1 = r0.H
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.H = r1
            goto L18
        L13:
            j11 r0 = new j11
            r0.<init>(r6, r10)
        L18:
            java.lang.Object r10 = r0.F
            m45 r1 = defpackage.m45.E
            int r2 = r0.H
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L30
            if (r2 != r4) goto L2a
            i11 r7 = r0.E
            defpackage.sf5.h0(r10)
            goto L6e
        L2a:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r6)
            return r3
        L30:
            defpackage.sf5.h0(r10)
            i11 r10 = new i11
            r8.getClass()
            r10.<init>(r7)
            java.lang.Object r7 = r6.G
            lja r7 = (defpackage.lja) r7
            monitor-enter(r7)
            java.lang.Object r8 = r6.E     // Catch: java.lang.Throwable -> L57
            zna r8 = (defpackage.zna) r8     // Catch: java.lang.Throwable -> L57
            java.lang.Object r8 = r8.c(r10)     // Catch: java.lang.Throwable -> L57
            h11 r8 = (defpackage.h11) r8     // Catch: java.lang.Throwable -> L57
            if (r8 != 0) goto L59
            java.lang.Object r8 = r6.F     // Catch: java.lang.Throwable -> L57
            ewb r8 = (defpackage.ewb) r8     // Catch: java.lang.Throwable -> L57
            java.lang.Object r8 = r8.g(r10)     // Catch: java.lang.Throwable -> L57
            h11 r8 = (defpackage.h11) r8     // Catch: java.lang.Throwable -> L57
            goto L59
        L57:
            r6 = move-exception
            goto L94
        L59:
            if (r8 == 0) goto L5f
            java.lang.Object r6 = r8.a     // Catch: java.lang.Throwable -> L57
            monitor-exit(r7)
            return r6
        L5f:
            monitor-exit(r7)
            r0.E = r10
            r0.H = r4
            java.lang.Object r7 = r9.invoke(r0)
            if (r7 != r1) goto L6b
            return r1
        L6b:
            r5 = r10
            r10 = r7
            r7 = r5
        L6e:
            java.lang.Object r8 = r6.G
            lja r8 = (defpackage.lja) r8
            monitor-enter(r8)
            if (r10 != 0) goto L84
            java.lang.Object r6 = r6.F     // Catch: java.lang.Throwable -> L82
            ewb r6 = (defpackage.ewb) r6     // Catch: java.lang.Throwable -> L82
            h11 r9 = new h11     // Catch: java.lang.Throwable -> L82
            r9.<init>(r3)     // Catch: java.lang.Throwable -> L82
            r6.m(r7, r9)     // Catch: java.lang.Throwable -> L82
            goto L90
        L82:
            r6 = move-exception
            goto L92
        L84:
            java.lang.Object r6 = r6.E     // Catch: java.lang.Throwable -> L82
            zna r6 = (defpackage.zna) r6     // Catch: java.lang.Throwable -> L82
            h11 r9 = new h11     // Catch: java.lang.Throwable -> L82
            r9.<init>(r10)     // Catch: java.lang.Throwable -> L82
            r6.d(r7, r9)     // Catch: java.lang.Throwable -> L82
        L90:
            monitor-exit(r8)
            return r10
        L92:
            monitor-exit(r8)
            throw r6
        L94:
            monitor-exit(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fj0.H(k20, m20, ny, vp4):java.lang.Object");
    }

    public void I(g91 g91Var, int i, boolean z) {
        c91 c91Var = (c91) this.F;
        Context context = (Context) this.G;
        ComponentName componentName = new ComponentName(context, (Class<?>) JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        Adler32 adler32 = new Adler32();
        adler32.update(context.getPackageName().getBytes(Charset.forName("UTF-8")));
        adler32.update(g91Var.a.getBytes(Charset.forName("UTF-8")));
        adler32.update(ByteBuffer.allocate(4).putInt(bgd.a(g91Var.c)).array());
        byte[] bArr = g91Var.b;
        if (bArr != null) {
            adler32.update(bArr);
        }
        int value = (int) adler32.getValue();
        if (!z) {
            Iterator<JobInfo> it = jobScheduler.getAllPendingJobs().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                JobInfo next = it.next();
                int i2 = next.getExtras().getInt("attemptNumber");
                if (next.getId() == value) {
                    if (i2 >= i) {
                        j8.x(g91Var, "JobInfoScheduler", "Upload for context %s is already scheduled. Returning...");
                        return;
                    }
                }
            }
        }
        SQLiteDatabase sQLiteDatabaseC = ((sze) this.E).c();
        String str = g91Var.a;
        agd agdVar = g91Var.c;
        Cursor cursorRawQuery = sQLiteDatabaseC.rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{str, String.valueOf(bgd.a(agdVar))});
        try {
            Long lValueOf = cursorRawQuery.moveToNext() ? Long.valueOf(cursorRawQuery.getLong(0)) : 0L;
            cursorRawQuery.close();
            long jLongValue = lValueOf.longValue();
            JobInfo.Builder builder = new JobInfo.Builder(value, componentName);
            builder.setMinimumLatency(c91Var.a(agdVar, jLongValue, i));
            Set set = ((d91) c91Var.b.get(agdVar)).c;
            if (set.contains(y6f.E)) {
                builder.setRequiredNetworkType(2);
            } else {
                builder.setRequiredNetworkType(1);
            }
            if (set.contains(y6f.G)) {
                builder.setRequiresCharging(true);
            }
            if (set.contains(y6f.F)) {
                builder.setRequiresDeviceIdle(true);
            }
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putInt("attemptNumber", i);
            persistableBundle.putString("backendName", str);
            persistableBundle.putInt("priority", bgd.a(agdVar));
            byte[] bArr2 = g91Var.b;
            if (bArr2 != null) {
                persistableBundle.putString("extras", Base64.encodeToString(bArr2, 0));
            }
            builder.setExtras(persistableBundle);
            Object[] objArr = {g91Var, Integer.valueOf(value), Long.valueOf(c91Var.a(agdVar, jLongValue, i)), lValueOf, Integer.valueOf(i)};
            if (Log.isLoggable("TRuntime.".concat("JobInfoScheduler"), 3)) {
                String.format("Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", objArr);
            }
            jobScheduler.schedule(builder.build());
        } catch (Throwable th) {
            cursorRawQuery.close();
            throw th;
        }
    }

    public void J(String str) {
        if (str != null) {
            this.E = str;
        } else {
            mr9.h("Null backendName");
        }
    }

    public void K(fb2 fb2Var) {
        ((ib2) this.G).E.c = fb2Var;
    }

    public void L(cz5 cz5Var) {
        ((ib2) this.G).E.a = cz5Var;
    }

    public void M(fu9 fu9Var) {
        ((ib2) this.G).E.b = fu9Var;
    }

    public void N(long j) {
        ((ib2) this.G).E.d = j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v6, types: [qe3] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v8, types: [oe3] */
    public void O(List list) {
        cpc cpcVar;
        z3a z3aVar = z3a.I;
        LinkedHashMap linkedHashMapJ = dgj.J(list, lf3.F);
        wo5 wo5Var = wo5.d;
        if (!wo5.d.a) {
            List list2 = list;
            HashSet hashSet = new HashSet();
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                hashSet.add(((x6g) it.next()).a);
            }
            if (hashSet.size() != list.size()) {
                StringBuilder sb = new StringBuilder("Configurations must be unique: ");
                ArrayList arrayList = new ArrayList(x44.y(list2, 10));
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList.add(((x6g) it2.next()).a);
                }
                sb.append(arrayList);
                sb.append('.');
                throw new IllegalStateException(sb.toString().toString());
            }
        }
        LinkedHashMap linkedHashMapJ2 = dgj.J(((if3) this.G).a, mf3.F);
        ArrayList<cpc> arrayList2 = new ArrayList(linkedHashMapJ.size());
        for (Map.Entry entry : linkedHashMapJ.entrySet()) {
            ic9 ic9Var = (ic9) entry.getKey();
            x6g x6gVar = (x6g) entry.getValue();
            qe3 qe3Var = (qe3) linkedHashMapJ2.get(ic9Var);
            if (qe3Var instanceof oe3) {
                cpcVar = new cpc(qe3Var, x6gVar.b);
            } else if (qe3Var instanceof pe3) {
                re3 re3Var = x6gVar.b;
                int iOrdinal = re3Var.ordinal();
                if (iOrdinal == 0) {
                    cpcVar = new cpc(qe3Var, re3Var);
                } else {
                    if (iOrdinal != 1 && iOrdinal != 2 && iOrdinal != 3) {
                        mr9.b();
                        return;
                    }
                    pe3 pe3Var = (pe3) qe3Var;
                    oe3 oe3VarN = mpk.N((dpf) this.E, x6gVar.a, pe3Var.b, pe3Var.c, 8);
                    yfd.u(oe3VarN.d);
                    cpcVar = new cpc(oe3VarN, re3Var);
                }
            } else {
                if (qe3Var != null) {
                    mr9.b();
                    return;
                }
                re3 re3Var2 = x6gVar.b;
                int iOrdinal2 = re3Var2.ordinal();
                if (iOrdinal2 == 0) {
                    cpcVar = new cpc(new pe3(x6gVar.a, knk.F().toString(), null), re3Var2);
                } else if (iOrdinal2 != 1 && iOrdinal2 != 2 && iOrdinal2 != 3) {
                    mr9.b();
                    return;
                } else {
                    oe3 oe3VarN2 = mpk.N((dpf) this.E, x6gVar.a, knk.F().toString(), null, 12);
                    yfd.u(oe3VarN2.d);
                    cpcVar = new cpc(oe3VarN2, re3Var2);
                }
            }
            arrayList2.add(cpcVar);
        }
        Set setKeySet = linkedHashMapJ.keySet();
        for (Map.Entry entry2 : linkedHashMapJ2.entrySet()) {
            ic9 ic9Var2 = (ic9) entry2.getKey();
            qe3 qe3Var2 = (qe3) entry2.getValue();
            oe3 oe3Var = qe3Var2 instanceof oe3 ? (oe3) qe3Var2 : null;
            if (oe3Var != null && !setKeySet.contains(ic9Var2)) {
                oe3Var.g.e();
                yfd.v(oe3Var.d);
                oe3Var.f.a();
            }
        }
        if3 if3Var = (if3) this.G;
        if3Var.a.clear();
        for (cpc cpcVar2 : arrayList2) {
            ?? pe3Var2 = (qe3) cpcVar2.E;
            re3 re3Var3 = (re3) cpcVar2.F;
            ArrayList arrayList3 = if3Var.a;
            if (pe3Var2 instanceof oe3) {
                pe3Var2 = (oe3) pe3Var2;
                jq5 jq5Var = pe3Var2.g;
                q4a q4aVar = pe3Var2.d;
                int iOrdinal3 = re3Var3.ordinal();
                if (iOrdinal3 == 0) {
                    SerializableContainer serializableContainerC = pe3Var2.e.c();
                    pe3Var2.g.e();
                    yfd.v(pe3Var2.d);
                    pe3Var2.f.a();
                    pe3Var2 = new pe3(pe3Var2.a, pe3Var2.b, serializableContainerC);
                } else if (iOrdinal3 != 1) {
                    if (iOrdinal3 == 2) {
                        z3a z3aVar2 = q4aVar.F;
                        z3a z3aVar3 = z3a.H;
                        if (z3aVar2.compareTo(z3aVar3) < 0) {
                            jq5Var.d();
                            yfd.f0(q4aVar);
                        } else if (q4aVar.F.compareTo(z3aVar3) > 0 && q4aVar.F == z3aVar) {
                            q4aVar.onPause();
                        }
                    } else if (iOrdinal3 != 3) {
                        mr9.b();
                        return;
                    } else if (q4aVar.F != z3aVar) {
                        jq5Var.d();
                        yfd.Z(q4aVar);
                    }
                } else if (q4aVar.F != z3a.G) {
                    jq5Var.e();
                    yfd.g0(q4aVar);
                }
            } else if (!(pe3Var2 instanceof pe3)) {
                mr9.b();
                return;
            }
            arrayList3.add(pe3Var2);
        }
    }

    public fhi P(dbe dbeVar, ze9 ze9Var, boolean z) {
        el5 el5Var = (el5) this.E;
        ke9 ke9Var = (ke9) el5Var.E;
        dbeVar.getClass();
        xbe xbeVarC = dbeVar.c();
        vbe vbeVar = xbeVarC instanceof vbe ? (vbe) xbeVarC : null;
        vfd vfdVarC = vbeVar != null ? vbeVar.c() : null;
        sx9 sx9Var = new sx9(el5Var, dbeVar, true);
        if (vfdVarC == null) {
            yr9 yr9VarQ = Q(xbeVarC, oyk.j(2, ze9Var.f(), null, 6));
            if (ze9Var.f()) {
                return ke9Var.o.f().g(z ? 3 : 1, yr9VarQ, sx9Var);
            }
            return yfd.z(ke9Var.o.f().g(1, yr9VarQ, sx9Var), ke9Var.o.f().g(3, yr9VarQ, sx9Var).l0(true));
        }
        j7g j7gVarP = ke9Var.o.f().p(vfdVarC);
        yr9 yr9VarD = jwk.D(j7gVarP, new xc0(new wc0[]{j7gVarP.getAnnotations(), sx9Var}));
        yr9VarD.getClass();
        j7g j7gVar = (j7g) yr9VarD;
        return ze9Var.f() ? j7gVar : yfd.z(j7gVar, j7gVar.l0(true));
    }

    public yr9 Q(xbe xbeVar, ze9 ze9Var) {
        j7g j7gVarJ;
        ke9 ke9Var = (ke9) ((el5) this.E).E;
        if (xbeVar instanceof vbe) {
            vfd vfdVarC = ((vbe) xbeVar).c();
            return vfdVarC != null ? ke9Var.o.f().r(vfdVarC) : ke9Var.o.f().v();
        }
        boolean z = false;
        if (!(xbeVar instanceof mbe)) {
            if (xbeVar instanceof dbe) {
                return P((dbe) xbeVar, ze9Var, false);
            }
            if (xbeVar instanceof ace) {
                xbe xbeVarC = ((ace) xbeVar).c();
                return xbeVarC != null ? Q(xbeVarC, ze9Var) : ke9Var.o.f().n();
            }
            if (xbeVar == null) {
                return ke9Var.o.f().n();
            }
            poc.t("Unsupported type: ", xbeVar);
            return null;
        }
        mbe mbeVar = (mbe) xbeVar;
        if (!ze9Var.f() && ze9Var.d() != 1) {
            z = true;
        }
        boolean zG = mbeVar.g();
        mu6 mu6Var = mu6.UNRESOLVED_JAVA_CLASS;
        if (!zG && !z) {
            j7g j7gVarJ2 = j(mbeVar, ze9Var, null);
            return j7gVarJ2 != null ? j7gVarJ2 : nu6.c(mu6Var, mbeVar.e());
        }
        j7g j7gVarJ3 = j(mbeVar, ze9Var.i(3), null);
        if (j7gVarJ3 != null && (j7gVarJ = j(mbeVar, ze9Var.i(2), j7gVarJ3)) != null) {
            return zG ? new j2e(j7gVarJ3, j7gVarJ) : yfd.z(j7gVarJ3, j7gVarJ);
        }
        return nu6.c(mu6Var, mbeVar.e());
    }

    public void R() {
        synchronized (this) {
            ((AtomicInteger) this.F).decrementAndGet();
            if (((AtomicInteger) this.F).get() < 0) {
                throw new IllegalStateException("Unbalanced call to unblock() detected.");
            }
        }
    }

    public Object S(Object obj) {
        Object objInvoke = ((bz7) this.E).invoke(obj);
        d52 d52Var = (d52) this.F;
        mdg mdgVar = (mdg) this.G;
        Object objInvoke2 = d52Var.invoke(mdgVar.get(objInvoke), obj);
        mdgVar.put(objInvoke, objInvoke2);
        return objInvoke2;
    }

    public Collection T(Iterable iterable) {
        iterable.getClass();
        LinkedHashMap linkedHashMapV = v(iterable);
        ((mdg) this.G).putAll(linkedHashMapV);
        return linkedHashMapV.values();
    }

    public void U(String str) throws IOException {
        str.getClass();
        FileOutputStream fileOutputStream = (FileOutputStream) this.F;
        if (fileOutputStream != null) {
            byte[] bytes = str.getBytes(dj2.a);
            bytes.getClass();
            fileOutputStream.write(bytes);
            fileOutputStream.flush();
        }
    }

    @Override // defpackage.hi5
    public boolean a(fv6 fv6Var, Object obj, int i) {
        x1e x1eVar;
        boolean zA;
        fv6Var.getClass();
        obj.getClass();
        sq6.a(i);
        byte[] bArrO = v40.O((q28) this.E, obj, ((k99) this.G).t());
        if (bArrO == null) {
            return false;
        }
        if (obj instanceof mxi) {
            mxi mxiVar = (mxi) obj;
            kxi kxiVar = mxiVar.j;
            byte[] bArrO2 = v40.O((dd8) this.F, new wxe(kxiVar.a, Boolean.valueOf(kxiVar.X != null), mxiVar.s.e), ((k99) this.G).t());
            if (bArrO2 == null) {
                bArrO2 = J;
            }
            x1eVar = new x1e(bArrO, bArrO2);
        } else {
            x1eVar = new x1e(bArrO, x1e.c);
        }
        synchronized (this) {
            zA = fv6Var.a(x1eVar, i);
            if (zA && (obj instanceof mxi)) {
                ((k99) this.G).r(bArrO);
            }
        }
        return zA;
    }

    public void b(av9 av9Var, sb9 sb9Var) {
        tk5 tk5Var = (tk5) this.E;
        tk5 tk5Var2 = (tk5) this.F;
        tk5 tk5Var3 = (tk5) this.G;
        int iOrdinal = sb9Var.ordinal();
        if (iOrdinal == 0) {
            tk5Var.a(av9Var);
            tk5Var3.a(av9Var);
            return;
        }
        if (iOrdinal == 1) {
            tk5Var2.a(av9Var);
            tk5Var3.a(av9Var);
            return;
        }
        if (iOrdinal == 2) {
            if (av9Var.M != null) {
                tk5Var3.a(av9Var);
                return;
            } else {
                tk5Var.a(av9Var);
                return;
            }
        }
        if (iOrdinal != 3) {
            mr9.b();
        } else if (av9Var.M != null) {
            tk5Var3.a(av9Var);
        } else {
            tk5Var2.a(av9Var);
        }
    }

    @Override // defpackage.ocg
    public float c(float f, float f2) {
        return MTTypesetterKt.kLineSkipLimitMultiplier;
    }

    @Override // okio.Socket
    public void cancel() {
        ((Socket) this.E).cancel();
    }

    @Override // okio.Socket
    public Source d() {
        return (RealBufferedSource) this.F;
    }

    @Override // defpackage.ocg
    public float e(float f) {
        ry ryVar = (ry) this.E;
        float f2 = ryVar.f();
        Object objC = fy.c(ryVar.c(), f2, f, (bz7) this.F, (p7) this.G);
        if (!((Boolean) ryVar.a.invoke(objC)).booleanValue()) {
            objC = ryVar.h.getValue();
        }
        return ryVar.c().f(objC) - f2;
    }

    public boolean f() {
        synchronized (this) {
            if (((AtomicBoolean) this.G).get()) {
                return false;
            }
            ((AtomicInteger) this.F).incrementAndGet();
            return true;
        }
    }

    @Override // defpackage.x82
    public Type g() {
        return (Type) this.E;
    }

    public g91 h() {
        String strConcat = ((String) this.E) == null ? " backendName" : "";
        if (((agd) this.G) == null) {
            strConcat = strConcat.concat(" priority");
        }
        if (strConcat.isEmpty()) {
            return new g91((String) this.E, (byte[]) this.F, (agd) this.G);
        }
        sz6.j("Missing required properties:".concat(strConcat));
        return null;
    }

    @Override // defpackage.x82
    public Object i(fdc fdcVar) {
        return new pf0(fdcVar, (Type) this.E, (cj3) this.F, (q61) this.G);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:50:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01ad  */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r11v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r11v11, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r11v9, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.j7g j(defpackage.mbe r18, defpackage.ze9 r19, defpackage.j7g r20) {
        /*
            Method dump skipped, instruction units count: 800
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fj0.j(mbe, ze9, j7g):j7g");
    }

    public boolean k(av9 av9Var) {
        return !(av9Var.M == null) && (((keg) ((tk5) this.E).F).contains(av9Var) || ((keg) ((tk5) this.F).F).contains(av9Var));
    }

    public void l(Bundle bundle) {
        HashSet hashSet = (HashSet) this.F;
        String string = ((Context) this.G).getString(R.string.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                for (String str : bundle.keySet()) {
                    if (string.equals(bundle.getString(str, null))) {
                        Class<?> cls = Class.forName(str);
                        if (u29.class.isAssignableFrom(cls)) {
                            hashSet.add(cls);
                        }
                    }
                }
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    m((Class) it.next(), hashSet2);
                }
            } catch (ClassNotFoundException e) {
                throw new StartupException(e);
            }
        }
    }

    public Object m(Class cls, HashSet hashSet) {
        Object objB;
        HashMap map = (HashMap) this.E;
        if (mpk.O()) {
            try {
                String simpleName = cls.getSimpleName();
                String strSubstring = simpleName.length() <= 127 ? simpleName : null;
                if (strSubstring == null) {
                    strSubstring = simpleName.substring(0, 127);
                }
                Trace.beginSection(strSubstring);
            } finally {
                Trace.endSection();
            }
        }
        if (hashSet.contains(cls)) {
            throw new IllegalStateException("Cannot initialize " + cls.getName() + ". Cycle detected.");
        }
        if (map.containsKey(cls)) {
            objB = map.get(cls);
        } else {
            hashSet.add(cls);
            try {
                u29 u29Var = (u29) cls.getDeclaredConstructor(null).newInstance(null);
                List<Class> listA = u29Var.a();
                if (!listA.isEmpty()) {
                    for (Class cls2 : listA) {
                        if (!map.containsKey(cls2)) {
                            m(cls2, hashSet);
                        }
                    }
                }
                objB = u29Var.b((Context) this.G);
                hashSet.remove(cls);
                map.put(cls, objB);
            } catch (Throwable th) {
                throw new StartupException(th);
            }
        }
        return objB;
    }

    @Override // okio.Socket
    public Sink n() {
        return (RealBufferedSink) this.G;
    }

    public void o(String str) {
        str.getClass();
        ((qo0) this.G).remove(str);
        Object objRemove = ((LinkedHashMap) this.F).remove(str);
        if (objRemove != null) {
            ((it2) this.E).invoke(objRemove);
        }
    }

    public fb2 p() {
        return ((ib2) this.G).E.c;
    }

    public ArrayList q() {
        ArrayList<qe3> arrayList = ((if3) this.G).a;
        ArrayList arrayList2 = new ArrayList(x44.y(arrayList, 10));
        for (qe3 qe3Var : arrayList) {
            Object objA = qe3Var.a();
            arrayList2.add(objA != null ? new ie3(qe3Var.c(), objA, qe3Var.getKey()) : new je3(qe3Var.getKey(), qe3Var.c()));
        }
        return arrayList2;
    }

    public gea r() {
        LocaleList localeList = LocaleList.getDefault();
        synchronized (((lja) this.G)) {
            try {
                gea geaVar = (gea) this.F;
                if (geaVar != null && localeList == ((LocaleList) this.E)) {
                    return geaVar;
                }
                int size = localeList.size();
                ArrayList arrayList = new ArrayList(size);
                for (int i = 0; i < size; i++) {
                    arrayList.add(new eea(localeList.get(i)));
                }
                gea geaVar2 = new gea(arrayList);
                this.E = localeList;
                this.F = geaVar2;
                return geaVar2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public cz5 s() {
        return ((ib2) this.G).E.a;
    }

    public fu9 u() {
        return ((ib2) this.G).E.b;
    }

    public LinkedHashMap v(Iterable iterable) {
        jyc jycVar = ((mdg) this.G).d().c;
        bz7 bz7Var = (bz7) this.E;
        int iD0 = tta.d0(x44.y(iterable, 10));
        if (iD0 < 16) {
            iD0 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iD0);
        for (Object obj : iterable) {
            linkedHashMap.put(bz7Var.invoke(obj), ((d52) this.F).invoke(jycVar.get(bz7Var.invoke(obj)), obj));
        }
        return linkedHashMap;
    }

    public long w() {
        return ((ib2) this.G).E.d;
    }

    public toh x() {
        return (toh) ((gff) this.E).F.getValue();
    }

    public Collection y() {
        return ((mdg) this.G).d().c.values();
    }

    public boolean z() {
        return !(((keg) ((tk5) this.E).F).isEmpty() && ((keg) ((tk5) this.G).F).isEmpty() && ((keg) ((tk5) this.F).F).isEmpty());
    }

    public /* synthetic */ fj0(Object obj, Object obj2, Object obj3) {
        this.E = obj;
        this.F = obj2;
        this.G = obj3;
    }

    public fj0(bz7 bz7Var, d52 d52Var) {
        this.E = bz7Var;
        this.F = d52Var;
        this.G = new mdg();
    }

    public /* synthetic */ fj0(Context context, Object obj, Object obj2) {
        this.G = context;
        this.E = obj;
        this.F = obj2;
    }

    public fj0(Socket socket) {
        this.E = socket;
        this.F = Okio.c(socket.d());
        this.G = Okio.b(socket.n());
    }

    public fj0(Runnable runnable) {
        this.G = new CopyOnWriteArrayList();
        this.E = new HashMap();
        this.F = runnable;
    }
}
