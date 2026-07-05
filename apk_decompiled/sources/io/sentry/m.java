package io.sentry;

import android.app.ApplicationExitInfo;
import android.content.Context;
import defpackage.i99;
import io.sentry.android.core.SentryAndroidOptions;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class m implements f1, io.sentry.android.core.i0 {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;
    public final Object d;

    public m(Context context, SentryAndroidOptions sentryAndroidOptions) {
        this.a = 3;
        this.b = sentryAndroidOptions;
        i99 i99Var = new i99();
        i99Var.G = new ArrayList();
        i99Var.E = false;
        i99Var.F = sentryAndroidOptions;
        this.c = i99Var;
        this.d = context;
    }

    @Override // io.sentry.f1
    public Queue A() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(((f1) this.b).A());
        arrayList.addAll(((f1) this.c).A());
        f1 f1Var = (f1) this.d;
        arrayList.addAll(f1Var.A());
        Collections.sort(arrayList);
        Queue queueB = h4.b(f1Var.r().getMaxBreadcrumbs());
        queueB.addAll(arrayList);
        return queueB;
    }

    @Override // io.sentry.f1
    public void B(m mVar) {
        V(null).B(mVar);
    }

    @Override // io.sentry.f1
    public t5 C() {
        t5 t5VarC = ((f1) this.d).C();
        if (t5VarC != null) {
            return t5VarC;
        }
        t5 t5VarC2 = ((f1) this.c).C();
        return t5VarC2 != null ? t5VarC2 : ((f1) this.b).C();
    }

    @Override // io.sentry.f1
    public m D() {
        return V(null).D();
    }

    @Override // io.sentry.f1
    public h7 E(f4 f4Var) {
        return V(null).E(f4Var);
    }

    @Override // io.sentry.f1
    public void F(String str) {
        V(null).F(str);
    }

    @Override // io.sentry.f1
    public k1 G() {
        k1 k1VarG = ((f1) this.d).G();
        if (!(k1VarG instanceof g3)) {
            return k1VarG;
        }
        k1 k1VarG2 = ((f1) this.c).G();
        return !(k1VarG2 instanceof g3) ? k1VarG2 : ((f1) this.b).G();
    }

    @Override // io.sentry.f1
    public Map H() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        concurrentHashMap.putAll(((f1) this.b).H());
        concurrentHashMap.putAll(((f1) this.c).H());
        concurrentHashMap.putAll(((f1) this.d).H());
        return concurrentHashMap;
    }

    @Override // io.sentry.f1
    public void I() {
        V(null).I();
    }

    @Override // io.sentry.f1
    public List J() {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        copyOnWriteArrayList.addAll(((f1) this.b).J());
        copyOnWriteArrayList.addAll(((f1) this.c).J());
        copyOnWriteArrayList.addAll(((f1) this.d).J());
        Collections.sort(copyOnWriteArrayList);
        return copyOnWriteArrayList;
    }

    @Override // io.sentry.f1
    public void K(j5 j5Var) {
        ((f1) this.b).K(j5Var);
    }

    @Override // io.sentry.f1
    public io.sentry.protocol.e L() {
        f1 f1Var = (f1) this.b;
        return new k(f1Var.L(), ((f1) this.c).L(), ((f1) this.d).L(), f1Var.r().getDefaultScopeType());
    }

    @Override // io.sentry.f1
    public m M(e4 e4Var) {
        return V(null).M(e4Var);
    }

    @Override // io.sentry.f1
    public String N() {
        String strN = ((f1) this.d).N();
        if (strN != null) {
            return strN;
        }
        String strN2 = ((f1) this.c).N();
        return strN2 != null ? strN2 : ((f1) this.b).N();
    }

    @Override // io.sentry.f1
    public void O(g4 g4Var) {
        V(null).O(g4Var);
    }

    @Override // io.sentry.f1
    public void P(io.sentry.protocol.w wVar) {
        ((f1) this.b).P(wVar);
        ((f1) this.c).P(wVar);
        ((f1) this.d).P(wVar);
    }

    @Override // io.sentry.f1
    public void Q(r1 r1Var) {
        V(null).Q(r1Var);
    }

    @Override // io.sentry.f1
    public List R() {
        List listR = ((f1) this.d).R();
        if (!listR.isEmpty()) {
            return listR;
        }
        List listR2 = ((f1) this.c).R();
        return !listR2.isEmpty() ? listR2 : ((f1) this.b).R();
    }

    @Override // io.sentry.f1
    public io.sentry.protocol.i0 S() {
        io.sentry.protocol.i0 i0VarS = ((f1) this.d).S();
        if (i0VarS != null) {
            return i0VarS;
        }
        io.sentry.protocol.i0 i0VarS2 = ((f1) this.c).S();
        return i0VarS2 != null ? i0VarS2 : ((f1) this.b).S();
    }

    @Override // io.sentry.f1
    public List T() {
        return io.sentry.config.a.M((CopyOnWriteArrayList) J());
    }

    @Override // io.sentry.f1
    public String U() {
        String strU = ((f1) this.d).U();
        if (strU != null) {
            return strU;
        }
        String strU2 = ((f1) this.c).U();
        return strU2 != null ? strU2 : ((f1) this.b).U();
    }

    public f1 V(l4 l4Var) {
        f1 f1Var = (f1) this.c;
        f1 f1Var2 = (f1) this.d;
        f1 f1Var3 = (f1) this.b;
        if (l4Var != null) {
            int i = l.a[l4Var.ordinal()];
            if (i == 1) {
                return f1Var2;
            }
            if (i == 2) {
                return f1Var;
            }
            if (i == 3) {
                return f1Var3;
            }
            if (i == 4) {
                return this;
            }
        }
        int i2 = l.a[f1Var3.r().getDefaultScopeType().ordinal()];
        return i2 != 1 ? i2 != 2 ? i2 != 3 ? f1Var2 : f1Var3 : f1Var : f1Var2;
    }

    public String W() {
        Boolean bool = (Boolean) this.d;
        String str = (bool == null || !bool.booleanValue()) ? "00" : "01";
        return "00-" + ((io.sentry.protocol.w) this.b) + "-" + ((m7) this.c) + "-" + str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0377  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public io.sentry.j5 X(long r22, io.sentry.j5 r24, io.sentry.n0 r25) {
        /*
            Method dump skipped, instruction units count: 1011
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.m.X(long, io.sentry.j5, io.sentry.n0):io.sentry.j5");
    }

    @Override // io.sentry.f1
    public io.sentry.protocol.r a() {
        io.sentry.protocol.r rVarA = ((f1) this.d).a();
        if (rVarA != null) {
            return rVarA;
        }
        io.sentry.protocol.r rVarA2 = ((f1) this.c).a();
        return rVarA2 != null ? rVarA2 : ((f1) this.b).a();
    }

    @Override // io.sentry.android.core.i0
    public int b() {
        return 5;
    }

    @Override // io.sentry.f1
    public p1 c() {
        p1 p1VarC = ((f1) this.d).c();
        if (p1VarC != null) {
            return p1VarC;
        }
        p1 p1VarC2 = ((f1) this.c).c();
        return p1VarC2 != null ? p1VarC2 : ((f1) this.b).c();
    }

    @Override // io.sentry.f1
    public void clear() {
        V(null).clear();
    }

    @Override // io.sentry.f1
    public f1 clone() {
        return new m((f1) this.b, ((f1) this.c).clone(), ((f1) this.d).clone(), 0);
    }

    @Override // io.sentry.f1
    public void d(String str, Boolean bool) {
        V(null).d(str, bool);
        p1 p1VarC = c();
        if (p1VarC != null) {
            p1VarC.d(str, bool);
        }
    }

    @Override // io.sentry.f1
    public void e(io.sentry.protocol.i0 i0Var) {
        V(null).e(i0Var);
    }

    @Override // io.sentry.f1
    public void f(String str, String str2) {
        V(null).f(str, str2);
    }

    @Override // io.sentry.android.core.i0
    public Long g() {
        return io.sentry.android.core.cache.b.m((SentryAndroidOptions) this.b, "last_tombstone_report", "Tombstone");
    }

    @Override // io.sentry.f1
    public List getAttachments() {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        copyOnWriteArrayList.addAll(((f1) this.b).getAttachments());
        copyOnWriteArrayList.addAll(((f1) this.c).getAttachments());
        copyOnWriteArrayList.addAll(((f1) this.d).getAttachments());
        return copyOnWriteArrayList;
    }

    @Override // io.sentry.f1
    public Map getExtras() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        concurrentHashMap.putAll(((f1) this.b).getExtras());
        concurrentHashMap.putAll(((f1) this.c).getExtras());
        concurrentHashMap.putAll(((f1) this.d).getExtras());
        return concurrentHashMap;
    }

    @Override // io.sentry.android.core.i0
    public String h() {
        return "Tombstone";
    }

    @Override // io.sentry.f1
    public void i(Throwable th, i7 i7Var, String str) {
        ((f1) this.b).i(th, i7Var, str);
    }

    @Override // io.sentry.f1
    public void j(g gVar, n0 n0Var) {
        V(null).j(gVar, n0Var);
    }

    @Override // io.sentry.f1
    public io.sentry.protocol.j k() {
        return y().k();
    }

    @Override // io.sentry.android.core.i0
    public boolean l() {
        return ((SentryAndroidOptions) this.b).isReportHistoricalTombstones();
    }

    @Override // io.sentry.android.core.i0
    public io.sentry.android.core.j0 m(ApplicationExitInfo applicationExitInfo, boolean z) {
        SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) this.b;
        try {
            boolean zIsAttachRawTombstone = sentryAndroidOptions.isAttachRawTombstone();
            InputStream traceInputStream = applicationExitInfo.getTraceInputStream();
            try {
                if (traceInputStream == null) {
                    sentryAndroidOptions.getLogger().h(t5.WARNING, "No tombstone InputStream available for ApplicationExitInfo from %s", DateTimeFormatter.ISO_INSTANT.format(Instant.ofEpochMilli(applicationExitInfo.getTimestamp())));
                    if (traceInputStream == null) {
                        return null;
                    }
                    traceInputStream.close();
                    return null;
                }
                byte[] bArrC = zIsAttachRawTombstone ? io.sentry.config.a.C(traceInputStream) : null;
                io.sentry.android.core.internal.tombstone.b bVar = new io.sentry.android.core.internal.tombstone.b(zIsAttachRawTombstone ? new ByteArrayInputStream(bArrC) : traceInputStream, sentryAndroidOptions.getInAppIncludes(), sentryAndroidOptions.getInAppExcludes(), ((Context) this.d).getApplicationInfo().nativeLibraryDir);
                try {
                    j5 j5VarC = bVar.c();
                    bVar.close();
                    traceInputStream.close();
                    long timestamp = applicationExitInfo.getTimestamp();
                    j5VarC.T = p.l(timestamp);
                    io.sentry.android.core.a2 a2Var = new io.sentry.android.core.a2(sentryAndroidOptions.getFlushTimeoutMillis(), sentryAndroidOptions.getLogger(), timestamp, z);
                    n0 n0VarA = io.sentry.util.c.a(a2Var);
                    if (bArrC != null) {
                        n0VarA.g = new a(bArrC, "tombstone.pb", "application/x-protobuf");
                    }
                    try {
                        j5 j5VarX = X(timestamp, j5VarC, n0VarA);
                        if (j5VarX != null) {
                            j5VarC = j5VarX;
                        }
                    } catch (Throwable th) {
                        sentryAndroidOptions.getLogger().h(t5.WARNING, "Failed to merge native event with tombstone, continuing without merge: %s", th.getMessage());
                    }
                    return new io.sentry.android.core.j0(j5VarC, n0VarA, a2Var, 0);
                } finally {
                }
            } finally {
            }
        } catch (Throwable th2) {
            sentryAndroidOptions.getLogger().h(t5.WARNING, "Failed to parse tombstone from %s: %s", DateTimeFormatter.ISO_INSTANT.format(Instant.ofEpochMilli(applicationExitInfo.getTimestamp())), th2.getMessage());
            return null;
        }
        sentryAndroidOptions.getLogger().h(t5.WARNING, "Failed to parse tombstone from %s: %s", DateTimeFormatter.ISO_INSTANT.format(Instant.ofEpochMilli(applicationExitInfo.getTimestamp())), th2.getMessage());
        return null;
    }

    @Override // io.sentry.f1
    public io.sentry.protocol.w n() {
        io.sentry.protocol.w wVarN = ((f1) this.d).n();
        io.sentry.protocol.w wVar = io.sentry.protocol.w.F;
        if (!wVar.equals(wVarN)) {
            return wVarN;
        }
        io.sentry.protocol.w wVarN2 = ((f1) this.c).n();
        return !wVar.equals(wVarN2) ? wVarN2 : ((f1) this.b).n();
    }

    @Override // io.sentry.f1
    public void o(List list) {
        V(null).o(list);
    }

    @Override // io.sentry.f1
    public void p(String str, String str2) {
        V(null).p(str, str2);
    }

    @Override // io.sentry.f1
    public void q(io.sentry.protocol.w wVar) {
        V(null).q(wVar);
    }

    @Override // io.sentry.f1
    public w6 r() {
        return ((f1) this.b).r();
    }

    @Override // io.sentry.f1
    public r1 s() {
        r1 r1VarS = ((f1) this.d).s();
        if (r1VarS != null) {
            return r1VarS;
        }
        r1 r1VarS2 = ((f1) this.c).s();
        return r1VarS2 != null ? r1VarS2 : ((f1) this.b).s();
    }

    @Override // io.sentry.f1
    public void t(String str) {
        V(null).t("subscription_level");
    }

    @Override // io.sentry.f1
    public h7 u() {
        return V(null).u();
    }

    @Override // io.sentry.f1
    public io.sentry.internal.debugmeta.c v() {
        return V(null).v();
    }

    @Override // io.sentry.f1
    public void w(t5 t5Var) {
        V(null).w(t5Var);
    }

    @Override // io.sentry.f1
    public void x() {
        V(null).x();
    }

    @Override // io.sentry.f1
    public io.sentry.featureflags.c y() {
        l4 l4Var;
        io.sentry.featureflags.a aVar;
        w6 w6VarR = ((f1) this.b).r();
        io.sentry.featureflags.c cVarY = ((f1) this.b).y();
        io.sentry.featureflags.c cVarY2 = ((f1) this.c).y();
        io.sentry.featureflags.c cVarY3 = ((f1) this.d).y();
        io.sentry.featureflags.d dVar = io.sentry.featureflags.d.E;
        int maxFeatureFlags = w6VarR.getMaxFeatureFlags();
        if (maxFeatureFlags > 0) {
            io.sentry.featureflags.b bVar = cVarY instanceof io.sentry.featureflags.b ? (io.sentry.featureflags.b) cVarY : null;
            io.sentry.featureflags.b bVar2 = cVarY2 instanceof io.sentry.featureflags.b ? (io.sentry.featureflags.b) cVarY2 : null;
            io.sentry.featureflags.b bVar3 = cVarY3 instanceof io.sentry.featureflags.b ? (io.sentry.featureflags.b) cVarY3 : null;
            CopyOnWriteArrayList copyOnWriteArrayList = bVar == null ? null : bVar.E;
            CopyOnWriteArrayList copyOnWriteArrayList2 = bVar2 == null ? null : bVar2.E;
            CopyOnWriteArrayList copyOnWriteArrayList3 = bVar3 == null ? null : bVar3.E;
            int size = copyOnWriteArrayList == null ? 0 : copyOnWriteArrayList.size();
            int size2 = copyOnWriteArrayList2 == null ? 0 : copyOnWriteArrayList2.size();
            int size3 = copyOnWriteArrayList3 != null ? copyOnWriteArrayList3.size() : 0;
            if (size != 0 || size2 != 0 || size3 != 0) {
                int i = size - 1;
                int i2 = size2 - 1;
                int i3 = size3 - 1;
                io.sentry.featureflags.a aVar2 = (copyOnWriteArrayList == null || i < 0) ? null : (io.sentry.featureflags.a) copyOnWriteArrayList.get(i);
                io.sentry.featureflags.a aVar3 = (copyOnWriteArrayList2 == null || i2 < 0) ? null : (io.sentry.featureflags.a) copyOnWriteArrayList2.get(i2);
                io.sentry.featureflags.a aVar4 = (copyOnWriteArrayList3 == null || i3 < 0) ? null : (io.sentry.featureflags.a) copyOnWriteArrayList3.get(i3);
                LinkedHashMap linkedHashMap = new LinkedHashMap(maxFeatureFlags);
                while (linkedHashMap.size() < maxFeatureFlags && (aVar2 != null || aVar3 != null || aVar4 != null)) {
                    if (aVar2 != null) {
                        l4Var = l4.GLOBAL;
                        aVar = aVar2;
                    } else {
                        l4Var = null;
                        aVar = null;
                    }
                    if (aVar3 != null && (aVar == null || aVar3.c.longValue() > aVar.c.longValue())) {
                        l4Var = l4.ISOLATION;
                        aVar = aVar3;
                    }
                    if (aVar4 != null && (aVar == null || aVar4.c.longValue() > aVar.c.longValue())) {
                        l4Var = l4.CURRENT;
                        aVar = aVar4;
                    }
                    if (aVar == null) {
                        break;
                    }
                    if (!linkedHashMap.containsKey(aVar.a)) {
                        linkedHashMap.put(aVar.a, aVar);
                    }
                    if (l4.CURRENT.equals(l4Var)) {
                        i3--;
                        aVar4 = (copyOnWriteArrayList3 == null || i3 < 0) ? null : (io.sentry.featureflags.a) copyOnWriteArrayList3.get(i3);
                    } else if (l4.ISOLATION.equals(l4Var)) {
                        i2--;
                        aVar3 = (copyOnWriteArrayList2 == null || i2 < 0) ? null : (io.sentry.featureflags.a) copyOnWriteArrayList2.get(i2);
                    } else if (l4.GLOBAL.equals(l4Var)) {
                        i--;
                        aVar2 = (copyOnWriteArrayList == null || i < 0) ? null : (io.sentry.featureflags.a) copyOnWriteArrayList.get(i);
                    }
                }
                ArrayList arrayList = new ArrayList(linkedHashMap.values());
                Collections.reverse(arrayList);
                return new io.sentry.featureflags.b(maxFeatureFlags, new CopyOnWriteArrayList(arrayList));
            }
        }
        return dVar;
    }

    @Override // io.sentry.f1
    public h7 z() {
        h7 h7VarZ = ((f1) this.d).z();
        if (h7VarZ != null) {
            return h7VarZ;
        }
        h7 h7VarZ2 = ((f1) this.c).z();
        return h7VarZ2 != null ? h7VarZ2 : ((f1) this.b).z();
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m1187clone() {
        switch (this.a) {
            case 0:
                return clone();
            default:
                return super.clone();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public m() {
        this(new io.sentry.protocol.w(), new m7(), null);
        this.a = 1;
    }

    public m(io.sentry.protocol.w wVar, m7 m7Var, c cVar) {
        this.a = 1;
        this.b = wVar;
        this.c = m7Var;
        this.d = p.g(cVar, null, null, null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public m(m mVar) {
        this((io.sentry.protocol.w) mVar.b, (m7) mVar.c, (c) mVar.d);
        this.a = 1;
    }

    public /* synthetic */ m(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }
}
