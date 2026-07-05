package defpackage;

import com.google.gson.stream.JsonReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class o35 implements kn6 {
    public final nyj E;
    public final long F;
    public final long G;
    public final long H;
    public final boolean I;
    public volatile long J;
    public volatile long K;
    public final swc L;
    public final String M;
    public final sij N;
    public final c4f O;
    public final sp4 P;
    public final il8 Q;
    public final vf4 R;
    public final ki6 S;
    public final Map T;
    public final Map U;
    public final int V;
    public final u4c W;
    public final il8 X;
    public final ov8 Y;
    public final bm7 Z;
    public final ln6 a0;
    public final boolean b0;
    public final ql8 c0;
    public final efk d0;
    public final n35 e0;
    public final c4h f0;
    public final efe g0;
    public final g11 h0;
    public final h99 i0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v5 */
    public o35(vf4 vf4Var, String str, sij sijVar, c4f c4fVar, is8 is8Var, Map map, Map map2, Map map3, Map map4, Map map5, int i, boolean z, boolean z2, h99 h99Var) {
        efk efkVar = efk.N;
        this.E = new nyj(o35.class.getSimpleName(), h99Var);
        this.c0 = ql8.M;
        this.F = TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis());
        long jNanoTime = System.nanoTime();
        this.G = jNanoTime;
        this.H = Math.max(1000000L, TimeUnit.SECONDS.toNanos(vf4Var.d0));
        this.J = jNanoTime;
        dd8 dd8Var = dd8.H;
        ln6 ln6Var = new ln6();
        ln6Var.E = dd8Var;
        this.a0 = ln6Var;
        this.M = str;
        this.R = vf4Var;
        this.O = c4fVar;
        String str2 = vf4Var.s0;
        j3i j3iVarA = str2 == null ? j3i.b : j3i.a(str2);
        String str3 = vf4Var.v0;
        String str4 = vf4Var.w0;
        dgg dggVarB = dgg.b;
        if (str3 != null) {
            try {
                dggVarB = dgg.b(dgg.a(new JsonReader(new StringReader(str3))));
            } catch (Throwable unused) {
                dgg.c.getClass();
            }
        } else if (str4 != null) {
            zp3 zp3Var = dgg.c;
            try {
                JsonReader jsonReader = new JsonReader(new FileReader(str4));
                try {
                    dggVarB = dgg.b(dgg.a(jsonReader));
                    jsonReader.close();
                } finally {
                }
            } catch (FileNotFoundException unused2) {
                zp3Var.getClass();
            } catch (IOException unused3) {
                zp3Var.getClass();
            } catch (Throwable unused4) {
                zp3Var.getClass();
            }
        }
        cd cdVar = new cd(1, this);
        int i2 = 0;
        i2 = 0;
        ki6 ki6Var = new ki6(0);
        ki6Var.F = cdVar;
        ji6 ji6Var = new ji6(ki6Var);
        ji6Var.a = vf4Var.f0;
        ji6Var.b = vf4Var.e0;
        ji6Var.c = vf4Var.B1;
        Set<Map.Entry> setEntrySet = map3.entrySet();
        HashMap map6 = new HashMap((setEntrySet.size() * 4) / 3);
        for (Map.Entry entry : setEntrySet) {
            map6.put(eve.U((String) entry.getKey()), eve.U((String) entry.getValue()));
        }
        ji6Var.d = new HashMap(map6);
        vf4 vf4Var2 = vf4.O1;
        if (!vf4Var2.A.equals(map4) || vf4Var2.B.equals(map4)) {
            Set setEntrySet2 = map4.entrySet();
            ji6Var.e = ki6.a(setEntrySet2, ki6.I);
            ji6Var.f = ki6.a(setEntrySet2, ki6.J);
        } else {
            ji6Var.e = vf4Var2.A;
            ji6Var.f = vf4Var2.B;
        }
        Set<Map.Entry> setEntrySet3 = map5.entrySet();
        HashMap map7 = new HashMap((setEntrySet3.size() * 4) / 3);
        for (Map.Entry entry2 : setEntrySet3) {
            map7.put(eve.U((String) entry2.getKey()).toLowerCase(Locale.ROOT), eve.U((String) entry2.getValue()));
        }
        ji6Var.g = new HashMap(map7);
        ji6Var.j = vf4Var.t0;
        ji6Var.h = dggVarB.a;
        ji6Var.i = j3iVarA.a;
        l35 l35Var = (l35) ji6Var.k.G;
        l35 l35Var2 = new l35((o35) ((cd) ji6Var.k.F).F, ji6Var, l35Var);
        ki6 ki6Var2 = ji6Var.k;
        if (l35Var == null) {
            ki6Var2.G = l35Var2;
        } else {
            ki6Var2.G = l35Var2;
            HashMap map8 = new HashMap();
            map8.put("trace.debug", Boolean.FALSE);
            map8.put("runtime.metrics.enabled", Boolean.valueOf(l35Var2.a));
            map8.put("logs.injection", Boolean.valueOf(l35Var2.b));
            map8.put("data.streams.enabled", Boolean.valueOf(l35Var2.c));
            map8.put("service.mapping", l35Var2.d);
            map8.put("trace.request_header.tags", l35Var2.e);
            map8.put("trace.response_header.tags", l35Var2.f);
            map8.put("trace.header.baggage", l35Var2.g);
            Double d = l35Var2.j;
            if (d != null) {
                map8.put("trace.sample.rate", d);
            }
            xf4 xf4Var = xf4.b;
            xf4Var.getClass();
            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(xf4Var.a.size() + map8.size());
            for (Map.Entry entry3 : map8.entrySet()) {
                concurrentHashMap.put((String) entry3.getKey(), new ag4(2, entry3.getValue(), (String) entry3.getKey()));
            }
            while (true) {
                Map map9 = xf4Var.a;
                for (Map.Entry entry4 : map9.entrySet()) {
                    if (!map8.containsKey(entry4.getKey())) {
                        concurrentHashMap.put((String) entry4.getKey(), (ag4) entry4.getValue());
                    }
                }
                if (qy1.y(xf4.c, xf4Var, map9, concurrentHashMap)) {
                    break;
                }
                concurrentHashMap.keySet().retainAll(map8.keySet());
                i2 = 0;
            }
        }
        this.S = ji6Var.k;
        j69.D.getClass();
        this.U = map2;
        this.V = i;
        this.Y = vf4.O1.v1;
        this.W = u4c.E;
        this.X = il8.H;
        this.P = new sp4(h99Var);
        this.b0 = vf4Var.E1.c("trace.sampling.mechanism.validation.disabled", i2, new String[i2]);
        this.N = sijVar;
        swc qwcVar = z ? new qwc(h99Var) : new pwc(this.c0, vf4Var);
        this.L = qwcVar;
        this.Z = new bm7(this, qwcVar, this.c0, z);
        qwcVar.f();
        sijVar.getClass();
        this.Q = il8.G;
        ArrayList arrayList = new ArrayList();
        Iterator it = vf4Var.a0.iterator();
        while (it.hasNext()) {
            switch (((h3i) it.next()).ordinal()) {
                case 0:
                    arrayList.add(new k6c());
                    break;
                case 1:
                    String str5 = ua1.a;
                    arrayList.add(new k6c());
                    break;
                case 2:
                    String str6 = ua1.a;
                    arrayList.add(new k6c());
                    break;
                case 3:
                    arrayList.add(new k6c());
                    break;
                case 4:
                    arrayList.add(new k6c());
                    break;
                case 5:
                    arrayList.add(new k6c());
                    break;
                case 6:
                    arrayList.add(zh4.l);
                    break;
            }
        }
        int size = arrayList.size();
        if (size != 0 && size == 1) {
        }
        this.g0 = new efe(is8Var, d4c.J(vf4Var, EnumSet.allOf(h3i.class), a(map5)));
        this.f0 = new c4h(new tk5(vf4Var));
        n35 n35Var = new n35(this);
        this.e0 = n35Var;
        try {
            Runtime.getRuntime().addShutdownHook(n35Var);
        } catch (IllegalStateException unused5) {
        }
        this.h0 = new g11(vf4Var.p1, 6);
        this.d0 = efkVar;
        this.I = ((byb) bgg.a.G).e();
        this.T = map;
        this.i0 = h99Var;
    }

    public static Map a(Map map) {
        HashMap map2 = new HashMap(map.size());
        for (Map.Entry entry : map.entrySet()) {
            map2.put(entry.getValue(), entry.getKey());
        }
        return Collections.unmodifiableMap(map2);
    }

    public final void finalize() {
        n35 n35Var = this.e0;
        if (n35Var != null) {
            try {
                n35Var.run();
                Runtime.getRuntime().removeShutdownHook(n35Var);
            } catch (IllegalStateException unused) {
            } catch (Exception e) {
                nyj nyjVar = this.E;
                h99 h99Var = (h99) nyjVar.F;
                ((rl) h99Var).M(5, Arrays.asList(g99.E, g99.G), new xi4(8, nyjVar), e, false, null);
            }
        }
    }

    @Override // defpackage.kn6
    public final void i(cf5 cf5Var) {
        this.a0.i(cf5Var);
    }

    @Override // defpackage.kn6
    public final void l(cf5 cf5Var) {
        this.a0.l(cf5Var);
    }
}
