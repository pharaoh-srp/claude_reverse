package io.sentry;

import android.content.Context;
import defpackage.mr9;
import defpackage.sz6;
import defpackage.x44;
import defpackage.xh6;
import java.io.BufferedInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Writer;
import java.net.MalformedURLException;
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes.dex */
public final class y implements a1, q3, io.sentry.internal.debugmeta.a, h6, io.sentry.clientreport.g, io.sentry.featureflags.c {
    public final /* synthetic */ int E;
    public Object F;
    public final Object G;

    public y(String str, HashMap map) {
        this.E = 2;
        p.v("url is required", str);
        try {
            this.F = URI.create(str).toURL();
            this.G = map;
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException("Failed to compose the Sentry's server URL.", e);
        }
    }

    public static o o(s5 s5Var) {
        return s5.Event.equals(s5Var) ? o.Error : s5.Session.equals(s5Var) ? o.Session : s5.Transaction.equals(s5Var) ? o.Transaction : s5.UserFeedback.equals(s5Var) ? o.UserReport : s5.Feedback.equals(s5Var) ? o.Feedback : s5.Profile.equals(s5Var) ? o.Profile : s5.ProfileChunk.equals(s5Var) ? o.ProfileChunkUi : s5.Attachment.equals(s5Var) ? o.Attachment : s5.CheckIn.equals(s5Var) ? o.Monitor : s5.ReplayVideo.equals(s5Var) ? o.Replay : s5.Log.equals(s5Var) ? o.LogItem : s5.Span.equals(s5Var) ? o.Span : s5.TraceMetric.equals(s5Var) ? o.TraceMetric : o.Default;
    }

    public y A(String str) {
        io.sentry.vendor.gson.stream.c cVar = (io.sentry.vendor.gson.stream.c) this.F;
        if (str == null) {
            cVar.f();
            return this;
        }
        cVar.n();
        cVar.c();
        cVar.j(str);
        return this;
    }

    public y B(boolean z) throws IOException {
        io.sentry.vendor.gson.stream.c cVar = (io.sentry.vendor.gson.stream.c) this.F;
        cVar.n();
        cVar.c();
        cVar.E.write(z ? "true" : "false");
        return this;
    }

    @Override // io.sentry.clientreport.g
    public void a(io.sentry.clientreport.d dVar, o oVar) {
        g(dVar, oVar, 1L);
    }

    @Override // io.sentry.a1
    public void b(t5 t5Var, Throwable th, String str, Object... objArr) {
        a1 a1Var = (a1) this.G;
        if (a1Var == null || !l(t5Var)) {
            return;
        }
        a1Var.b(t5Var, th, str, objArr);
    }

    @Override // io.sentry.featureflags.c
    public void c(String str, Boolean bool) {
        if (str != null) {
            v vVarA = ((io.sentry.util.a) this.G).a();
            try {
                if (((LinkedHashMap) this.F) == null) {
                    this.F = new LinkedHashMap(10);
                }
                if (((LinkedHashMap) this.F).size() < 10 || ((LinkedHashMap) this.F).containsKey(str)) {
                    ((LinkedHashMap) this.F).put(str, bool);
                }
                vVarA.close();
            } catch (Throwable th) {
                try {
                    vVarA.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    @Override // io.sentry.featureflags.c
    public void clear() {
        v vVarA = ((io.sentry.util.a) this.G).a();
        try {
            this.F = null;
            vVarA.close();
        } catch (Throwable th) {
            try {
                vVarA.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public Object m1191clone() {
        switch (this.E) {
            case 7:
                return new y();
            default:
                return super.clone();
        }
    }

    @Override // io.sentry.a1
    public void d(t5 t5Var, String str, Throwable th) {
        a1 a1Var = (a1) this.G;
        if (a1Var == null || !l(t5Var)) {
            return;
        }
        a1Var.d(t5Var, str, th);
    }

    @Override // io.sentry.clientreport.g
    public void e(io.sentry.clientreport.d dVar, io.sentry.internal.debugmeta.c cVar) {
        if (cVar == null) {
            return;
        }
        try {
            Iterator it = cVar.g().iterator();
            while (it.hasNext()) {
                j(dVar, (h5) it.next());
            }
        } catch (Throwable th) {
            ((w6) this.F).getLogger().b(t5.ERROR, th, "Unable to record lost envelope.", new Object[0]);
        }
    }

    @Override // io.sentry.internal.debugmeta.a
    public List f() {
        a1 a1Var = (a1) this.G;
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(((Context) this.F).getAssets().open("sentry-debug-meta.properties"));
            try {
                Properties properties = new Properties();
                properties.load(bufferedInputStream);
                List listSingletonList = Collections.singletonList(properties);
                bufferedInputStream.close();
                return listSingletonList;
            } catch (Throwable th) {
                try {
                    bufferedInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (FileNotFoundException unused) {
            a1Var.h(t5.INFO, "%s file was not found.", "sentry-debug-meta.properties");
            return null;
        } catch (IOException e) {
            a1Var.d(t5.ERROR, "Error getting Proguard UUIDs.", e);
            return null;
        } catch (RuntimeException e2) {
            a1Var.b(t5.ERROR, e2, "%s file is malformed.", "sentry-debug-meta.properties");
            return null;
        }
    }

    @Override // io.sentry.clientreport.g
    public void g(io.sentry.clientreport.d dVar, o oVar, long j) {
        try {
            s(dVar.getReason(), oVar.getCategory(), Long.valueOf(j));
            q();
        } catch (Throwable th) {
            ((w6) this.F).getLogger().b(t5.ERROR, th, "Unable to record lost event.", new Object[0]);
        }
    }

    @Override // io.sentry.a1
    public void h(t5 t5Var, String str, Object... objArr) {
        a1 a1Var = (a1) this.G;
        if (a1Var == null || !l(t5Var)) {
            return;
        }
        a1Var.h(t5Var, str, objArr);
    }

    @Override // io.sentry.h6
    public g i(g gVar, n0 n0Var) {
        gVar.getClass();
        h6 h6Var = (h6) this.F;
        if (h6Var != null) {
            gVar = h6Var.i(gVar, n0Var);
        }
        if (gVar != null) {
            io.sentry.android.replay.d dVar = (io.sentry.android.replay.d) this.G;
            io.sentry.util.network.e eVar = null;
            if (x44.r(gVar.I, "http") || x44.r(gVar.K, "http")) {
                Object objB = n0Var.b("sentry:replayNetworkDetails");
                if (objB instanceof io.sentry.util.network.e) {
                    eVar = (io.sentry.util.network.e) objB;
                }
            }
            if (eVar != null) {
                Map map = dVar.b;
                map.getClass();
                map.put(gVar, eVar);
            }
        }
        return gVar;
    }

    @Override // io.sentry.clientreport.g
    public void j(io.sentry.clientreport.d dVar, h5 h5Var) {
        w6 w6Var = (w6) this.F;
        if (h5Var == null) {
            return;
        }
        try {
            s5 s5Var = h5Var.m().I;
            if (s5.ClientReport.equals(s5Var)) {
                try {
                    t(h5Var.k(w6Var.getSerializer()));
                    return;
                } catch (Exception unused) {
                    w6Var.getLogger().h(t5.ERROR, "Unable to restore counts from previous client report.", new Object[0]);
                    return;
                }
            }
            o oVarO = o(s5Var);
            if (oVarO.equals(o.Transaction)) {
                io.sentry.protocol.e0 e0VarP = h5Var.p(w6Var.getSerializer());
                if (e0VarP != null) {
                    ArrayList arrayList = e0VarP.W;
                    s(dVar.getReason(), o.Span.getCategory(), Long.valueOf(((long) arrayList.size()) + 1));
                    arrayList.size();
                    q();
                }
                s(dVar.getReason(), oVarO.getCategory(), 1L);
                q();
                return;
            }
            if (oVarO.equals(o.LogItem)) {
                if (h5Var.n(w6Var.getSerializer()) == null) {
                    w6Var.getLogger().h(t5.ERROR, "Unable to parse lost logs envelope item.", new Object[0]);
                    return;
                }
                s(dVar.getReason(), oVarO.getCategory(), Long.valueOf(r0.E.size()));
                s(dVar.getReason(), o.LogByte.getCategory(), Long.valueOf(h5Var.l().length));
                q();
                return;
            }
            if (!oVarO.equals(o.TraceMetric)) {
                s(dVar.getReason(), oVarO.getCategory(), 1L);
                q();
                return;
            }
            if (h5Var.o(w6Var.getSerializer()) == null) {
                w6Var.getLogger().h(t5.ERROR, "Unable to parse lost metrics envelope item.", new Object[0]);
                return;
            }
            s(dVar.getReason(), oVarO.getCategory(), Long.valueOf(r12.E.size()));
            q();
        } catch (Throwable th) {
            w6Var.getLogger().b(t5.ERROR, th, "Unable to record lost envelope item.", new Object[0]);
        }
    }

    @Override // io.sentry.featureflags.c
    public io.sentry.protocol.j k() {
        v vVarA = ((io.sentry.util.a) this.G).a();
        try {
            LinkedHashMap linkedHashMap = (LinkedHashMap) this.F;
            if (linkedHashMap != null && !linkedHashMap.isEmpty()) {
                ArrayList arrayList = new ArrayList(((LinkedHashMap) this.F).size());
                for (Map.Entry entry : ((LinkedHashMap) this.F).entrySet()) {
                    arrayList.add(new io.sentry.protocol.i((String) entry.getKey(), ((Boolean) entry.getValue()).booleanValue()));
                }
                io.sentry.protocol.j jVar = new io.sentry.protocol.j(arrayList);
                vVarA.close();
                return jVar;
            }
            vVarA.close();
            return null;
        } catch (Throwable th) {
            try {
                vVarA.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // io.sentry.a1
    public boolean l(t5 t5Var) {
        w6 w6Var = (w6) this.F;
        return t5Var != null && w6Var.isDebug() && t5Var.ordinal() >= w6Var.getDiagnosticLevel().ordinal();
    }

    @Override // io.sentry.clientreport.g
    public io.sentry.internal.debugmeta.c m(io.sentry.internal.debugmeta.c cVar) {
        w6 w6Var = (w6) this.F;
        Date dateK = p.k();
        d dVar = (d) this.G;
        dVar.getClass();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : ((Map) ((io.sentry.util.h) dVar.E).a()).entrySet()) {
            long andSet = ((AtomicLong) entry.getValue()).getAndSet(0L);
            Long lValueOf = Long.valueOf(andSet);
            if (andSet > 0) {
                arrayList.add(new io.sentry.clientreport.f(((io.sentry.clientreport.c) entry.getKey()).b(), ((io.sentry.clientreport.c) entry.getKey()).a(), lValueOf));
            }
        }
        io.sentry.clientreport.b bVar = arrayList.isEmpty() ? null : new io.sentry.clientreport.b(dateK, arrayList);
        if (bVar == null) {
            return cVar;
        }
        try {
            w6Var.getLogger().h(t5.DEBUG, "Attaching client report to envelope.", new Object[0]);
            ArrayList arrayList2 = new ArrayList();
            Iterator it = cVar.g().iterator();
            while (it.hasNext()) {
                arrayList2.add((h5) it.next());
            }
            arrayList2.add(h5.c(w6Var.getSerializer(), bVar));
            return new io.sentry.internal.debugmeta.c(cVar.e(), arrayList2);
        } catch (Throwable th) {
            w6Var.getLogger().b(t5.ERROR, th, "Unable to attach client report to envelope.", new Object[0]);
            return cVar;
        }
    }

    public y n() {
        io.sentry.vendor.gson.stream.c cVar = (io.sentry.vendor.gson.stream.c) this.F;
        cVar.n();
        cVar.c();
        int i = cVar.G;
        int[] iArr = cVar.F;
        if (i == iArr.length) {
            cVar.F = Arrays.copyOf(iArr, i * 2);
        }
        int[] iArr2 = cVar.F;
        int i2 = cVar.G;
        cVar.G = i2 + 1;
        iArr2[i2] = 3;
        cVar.E.write(123);
        return this;
    }

    public y p() {
        ((io.sentry.vendor.gson.stream.c) this.F).d(3, 5, '}');
        return this;
    }

    public void q() {
        ((w6) this.F).getOnDiscard();
    }

    public y r(String str) {
        io.sentry.vendor.gson.stream.c cVar = (io.sentry.vendor.gson.stream.c) this.F;
        if (str == null) {
            cVar.getClass();
            mr9.h("name == null");
            return null;
        }
        if (cVar.K != null) {
            e0.b();
            return null;
        }
        if (cVar.G != 0) {
            cVar.K = str;
            return this;
        }
        sz6.j("JsonWriter is closed.");
        return null;
    }

    public void s(String str, String str2, Long l) {
        AtomicLong atomicLong = (AtomicLong) ((Map) ((io.sentry.util.h) ((d) this.G).E).a()).get(new io.sentry.clientreport.c(str, str2));
        if (atomicLong != null) {
            atomicLong.addAndGet(l.longValue());
        }
    }

    public void t(io.sentry.clientreport.b bVar) {
        if (bVar == null) {
            return;
        }
        for (io.sentry.clientreport.f fVar : bVar.F) {
            s(fVar.c(), fVar.a(), fVar.b());
        }
    }

    public void u(String str) {
        io.sentry.vendor.gson.stream.c cVar = (io.sentry.vendor.gson.stream.c) this.F;
        cVar.getClass();
        if (str == null || str.length() == 0) {
            cVar.H = null;
            cVar.I = ":";
        } else {
            cVar.H = str;
            cVar.I = ": ";
        }
    }

    public y v(double d) throws IOException {
        io.sentry.vendor.gson.stream.c cVar = (io.sentry.vendor.gson.stream.c) this.F;
        cVar.n();
        if (!cVar.J && (Double.isNaN(d) || Double.isInfinite(d))) {
            e0.c(d, "Numeric values must be finite, but was ");
            return null;
        }
        cVar.c();
        cVar.E.append((CharSequence) Double.toString(d));
        return this;
    }

    public y w(long j) {
        io.sentry.vendor.gson.stream.c cVar = (io.sentry.vendor.gson.stream.c) this.F;
        cVar.n();
        cVar.c();
        cVar.E.write(Long.toString(j));
        return this;
    }

    public y x(a1 a1Var, Object obj) {
        ((d) this.G).h(this, a1Var, obj);
        return this;
    }

    public y y(Boolean bool) throws IOException {
        io.sentry.vendor.gson.stream.c cVar = (io.sentry.vendor.gson.stream.c) this.F;
        if (bool == null) {
            cVar.f();
            return this;
        }
        cVar.n();
        cVar.c();
        cVar.E.write(bool.booleanValue() ? "true" : "false");
        return this;
    }

    public y z(Number number) throws IOException {
        io.sentry.vendor.gson.stream.c cVar = (io.sentry.vendor.gson.stream.c) this.F;
        if (number == null) {
            cVar.f();
            return this;
        }
        cVar.n();
        String string = number.toString();
        if (!cVar.J && (string.equals("-Infinity") || string.equals("Infinity") || string.equals("NaN"))) {
            xh6.k("Numeric values must be finite, but was ", number);
            return null;
        }
        cVar.c();
        cVar.E.append((CharSequence) string);
        return this;
    }

    @Override // io.sentry.featureflags.c
    public io.sentry.featureflags.c clone() {
        return new y();
    }

    public y(Writer writer, int i) {
        this.E = 1;
        this.F = new io.sentry.vendor.gson.stream.c(writer);
        this.G = new d(i);
    }

    public /* synthetic */ y(Object obj, int i, Object obj2) {
        this.E = i;
        this.F = obj;
        this.G = obj2;
    }

    public y(Context context, a1 a1Var) {
        this.E = 4;
        Context applicationContext = context.getApplicationContext();
        this.F = applicationContext != null ? applicationContext : context;
        this.G = a1Var;
    }

    public y(w6 w6Var) {
        this.E = 6;
        this.F = w6Var;
        this.G = new d(6, false);
    }

    public y() {
        this.E = 7;
        this.F = null;
        this.G = new io.sentry.util.a();
    }

    public y(io.sentry.android.replay.d dVar, h6 h6Var) {
        this.E = 5;
        this.G = dVar;
        this.F = h6Var;
    }
}
