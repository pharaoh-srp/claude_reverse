package defpackage;

import android.content.Context;
import android.util.Log;
import android.view.Menu;
import com.anthropic.claude.api.mcp.McpTool;
import com.anthropic.claude.types.strings.ChatId;
import com.anthropic.claude.types.strings.McpServerId;
import com.anthropic.claude.types.strings.McpToolKey;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.InvalidRegistrarException;
import com.google.firebase.components.MissingDependencyException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class ra4 implements da4, fe7 {
    public static final pa4 L = new pa4(0);
    public final Object E;
    public Object F;
    public Object G;
    public Object H;
    public Object I;
    public Object J;
    public Object K;

    public ra4(km3 km3Var) {
        yt7 yt7Var = km3Var.a;
        xt7 xt7VarA = yt7Var.a(4.0f);
        long jB = eve.B(4);
        dv7 dv7Var = dv7.J;
        this.E = new tkh(0L, jB, dv7Var, null, xt7VarA, 0L, 0L, 0, 0, 0L, null, 16777177);
        yt7 yt7Var2 = km3Var.b;
        this.F = new tkh(0L, eve.B(4), dv7Var, null, yt7Var2.a(4.0f), 0L, 0L, 0, 0, 0L, null, 16777177);
        xt7 xt7VarA2 = yt7Var.a(14.0f);
        long jB2 = eve.B(14);
        dv7 dv7Var2 = dv7.K;
        this.G = new tkh(0L, jB2, dv7Var2, null, xt7VarA2, 0L, 0L, 0, 0, 0L, null, 16777177);
        this.H = new tkh(0L, eve.B(17), dv7Var2, null, yt7Var2.a(17.0f), 0L, 0L, 0, 0, 0L, null, 16777177);
        this.I = new tkh(0L, eve.B(28), dv7Var2, null, yt7Var.a(28.0f), 0L, 0L, 0, 0, eve.y(1.1d), km3Var.d, 15597529);
        this.J = new tkh(0L, eve.B(10), dv7.M, null, yt7Var.a(10.0f), 0L, 0L, 0, 0, 0L, null, 16777177);
        this.K = new tkh(0L, eve.B(20), dv7Var2, null, yt7Var.a(20.0f), 0L, 0L, 0, 0, eve.y(1.35d), km3Var.d, 15597529);
        new tkh(0L, eve.B(32), dv7Var2, null, yt7Var2.a(32.0f), 0L, 0L, 0, 0, eve.y(1.25d), km3Var.d, 15597529);
        tkh.b(new tkh(0L, eve.B(24), dv7Var, null, yt7Var2.a(24.0f), 0L, 0L, 0, 0, eve.y(1.5d), km3Var.d, 15597529), 0L, 0L, dv7Var2, null, null, 0L, null, 0, 0L, null, 0, 16777211);
        yt7 yt7Var3 = km3Var.c;
        new tkh(0L, eve.B(20), dv7Var, null, yt7Var3.a(20.0f), 0L, 0L, 0, 0, 0L, null, 16777177);
        tkh.b(new tkh(0L, eve.B(32), dv7Var, null, yt7Var2.a(32.0f), 0L, 0L, 0, 0, eve.y(1.5d), km3Var.d, 15597529), 0L, 0L, dv7Var2, null, null, 0L, null, 0, 0L, null, 0, 16777211);
        new tkh(0L, eve.B(24), dv7Var, null, yt7Var3.a(24.0f), 0L, 0L, 0, 0, 0L, null, 16777177);
    }

    public static void b(Menu menu, bdb bdbVar) {
        menu.add(0, bdbVar.a(), bdbVar.b(), bdbVar.c()).setShowAsAction(1);
    }

    public static void c(Menu menu, bdb bdbVar, zy7 zy7Var) {
        if (zy7Var != null && menu.findItem(bdbVar.a()) == null) {
            b(menu, bdbVar);
        } else {
            if (zy7Var != null || menu.findItem(bdbVar.a()) == null) {
                return;
            }
            menu.removeItem(bdbVar.a());
        }
    }

    public int f(String str, String str2) {
        str2.getClass();
        Map mapL0 = (Map) ((tzh) this.H).a();
        if (str != null) {
            Map map = (Map) ((wzh) this.I).invoke(ChatId.m978boximpl(str));
            if (map != null) {
                mapL0 = sta.l0(mapL0, map);
            }
        }
        Iterable<McpTool> iterable = (Iterable) ((wzh) this.G).invoke(McpServerId.m1029boximpl(str2));
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return 0;
        }
        int i = 0;
        for (McpTool mcpTool : iterable) {
            if (!qok.k(mcpTool)) {
                String strM352getEnabled_keyA4OzCrU = mcpTool.m352getEnabled_keyA4OzCrU();
                if (!(strM352getEnabled_keyA4OzCrU != null ? x44.r((Boolean) mapL0.get(McpToolKey.m1043boximpl(McpToolKey.m1043boximpl(strM352getEnabled_keyA4OzCrU).m1050unboximpl())), Boolean.FALSE) : false) && (i = i + 1) < 0) {
                    x44.m0();
                    throw null;
                }
            }
        }
        return i;
    }

    @Override // defpackage.da4
    public synchronized jvd g(qzd qzdVar) {
        i1a i1aVar = (i1a) ((HashMap) this.G).get(qzdVar);
        if (i1aVar != null) {
            return i1aVar;
        }
        return L;
    }

    @Override // defpackage.ivd
    public Object get() {
        return new wk((Context) ((ivd) this.E).get(), (jjb) ((ivd) this.F).get(), (sze) ((ivd) this.G).get(), (fj0) ((w3c) this.H).get(), (Executor) ((ivd) this.I).get(), (sze) ((ivd) this.J).get(), new g6j(0), new cli(0), (sze) ((ivd) this.K).get());
    }

    @Override // defpackage.da4
    public synchronized jvd h(qzd qzdVar) {
        iuj.q("Null interface requested.", qzdVar);
        return (jvd) ((HashMap) this.F).get(qzdVar);
    }

    public void j(HashMap map, boolean z) {
        ArrayDeque arrayDeque;
        for (Map.Entry entry : map.entrySet()) {
            p94 p94Var = (p94) entry.getKey();
            jvd jvdVar = (jvd) entry.getValue();
            int i = p94Var.d;
            if (i == 1 || (i == 2 && z)) {
                jvdVar.get();
            }
        }
        gv6 gv6Var = (gv6) this.I;
        synchronized (gv6Var) {
            try {
                arrayDeque = gv6Var.b;
                if (arrayDeque != null) {
                    gv6Var.b = null;
                } else {
                    arrayDeque = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (arrayDeque != null) {
            Iterator it = arrayDeque.iterator();
            if (it.hasNext()) {
                it.next().getClass();
                mr9.o();
            }
        }
    }

    public z4b k(String str, McpTool mcpTool) {
        z4b z4bVar;
        mcpTool.getClass();
        if (qok.k(mcpTool)) {
            return z4b.G;
        }
        Map mapL0 = (Map) ((tzh) this.H).a();
        if (str != null) {
            Map map = (Map) ((wzh) this.I).invoke(ChatId.m978boximpl(str));
            if (map != null) {
                mapL0 = sta.l0(mapL0, map);
            }
        }
        z4b z4bVarQ = qok.q(mcpTool, mapL0);
        ArrayList arrayListG = qok.g(mcpTool);
        return (arrayListG.contains(z4bVarQ) || (z4bVar = (z4b) w44.N0(arrayListG)) == null) ? z4bVarQ : z4bVar;
    }

    public void l(boolean z) {
        HashMap map;
        AtomicReference atomicReference = (AtomicReference) this.J;
        Boolean boolValueOf = Boolean.valueOf(z);
        while (!atomicReference.compareAndSet(null, boolValueOf)) {
            if (atomicReference.get() != null) {
                return;
            }
        }
        synchronized (this) {
            map = new HashMap((HashMap) this.E);
        }
        j(map, z);
    }

    public void m() {
        for (p94 p94Var : ((HashMap) this.E).keySet()) {
            for (iz5 iz5Var : p94Var.c) {
                if (iz5Var.b == 2 && !((HashMap) this.G).containsKey(iz5Var.a)) {
                    HashMap map = (HashMap) this.G;
                    qzd qzdVar = iz5Var.a;
                    Set set = Collections.EMPTY_SET;
                    i1a i1aVar = new i1a();
                    i1aVar.b = null;
                    i1aVar.a = Collections.newSetFromMap(new ConcurrentHashMap());
                    i1aVar.a.addAll(set);
                    map.put(qzdVar, i1aVar);
                } else if (((HashMap) this.F).containsKey(iz5Var.a)) {
                    continue;
                } else {
                    int i = iz5Var.b;
                    if (i == 1) {
                        throw new MissingDependencyException("Unsatisfied dependency for component " + p94Var + ": " + iz5Var.a);
                    }
                    if (i != 2) {
                        HashMap map2 = (HashMap) this.F;
                        qzd qzdVar2 = iz5Var.a;
                        mr9 mr9Var = pjc.c;
                        pa4 pa4Var = pjc.d;
                        pjc pjcVar = new pjc();
                        pjcVar.a = mr9Var;
                        pjcVar.b = pa4Var;
                        map2.put(qzdVar2, pjcVar);
                    }
                }
            }
        }
    }

    public ArrayList n(ArrayList arrayList) {
        HashMap map = (HashMap) this.F;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            p94 p94Var = (p94) it.next();
            if (p94Var.e == 0) {
                jvd jvdVar = (jvd) ((HashMap) this.E).get(p94Var);
                for (qzd qzdVar : p94Var.b) {
                    if (map.containsKey(qzdVar)) {
                        arrayList2.add(new j01((pjc) ((jvd) map.get(qzdVar)), 2, jvdVar));
                    } else {
                        map.put(qzdVar, jvdVar);
                    }
                }
            }
        }
        return arrayList2;
    }

    public ArrayList o() {
        HashMap map = (HashMap) this.G;
        ArrayList arrayList = new ArrayList();
        HashMap map2 = new HashMap();
        for (Map.Entry entry : ((HashMap) this.E).entrySet()) {
            p94 p94Var = (p94) entry.getKey();
            if (p94Var.e != 0) {
                jvd jvdVar = (jvd) entry.getValue();
                for (qzd qzdVar : p94Var.b) {
                    if (!map2.containsKey(qzdVar)) {
                        map2.put(qzdVar, new HashSet());
                    }
                    ((Set) map2.get(qzdVar)).add(jvdVar);
                }
            }
        }
        for (Map.Entry entry2 : map2.entrySet()) {
            if (map.containsKey(entry2.getKey())) {
                i1a i1aVar = (i1a) map.get(entry2.getKey());
                Iterator it = ((Set) entry2.getValue()).iterator();
                while (it.hasNext()) {
                    arrayList.add(new j01(i1aVar, 3, (jvd) it.next()));
                }
            } else {
                qzd qzdVar2 = (qzd) entry2.getKey();
                Set set = (Set) ((Collection) entry2.getValue());
                i1a i1aVar2 = new i1a();
                i1aVar2.b = null;
                i1aVar2.a = Collections.newSetFromMap(new ConcurrentHashMap());
                i1aVar2.a.addAll(set);
                map.put(qzdVar2, i1aVar2);
            }
        }
        return arrayList;
    }

    public Object p(String str, String str2, z4b z4bVar, xzg xzgVar) {
        ArrayList arrayList = new ArrayList();
        wzh wzhVar = (wzh) this.G;
        lqa lqaVar = new lqa();
        Iterator it = ((Iterable) wzhVar.invoke(McpServerId.m1029boximpl(str2))).iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            McpTool mcpTool = (McpTool) it.next();
            if (!qok.k(mcpTool)) {
                Iterator it2 = qok.g(mcpTool).iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    Object next = it2.next();
                    if (((z4b) next).compareTo(z4bVar) >= 0) {
                        obj = next;
                        break;
                    }
                }
                z4b z4bVar2 = (z4b) obj;
                if (z4bVar2 != null) {
                    lqaVar.putAll(qok.n(mcpTool, z4bVar2));
                    String strM352getEnabled_keyA4OzCrU = mcpTool.m352getEnabled_keyA4OzCrU();
                    if (strM352getEnabled_keyA4OzCrU != null) {
                        arrayList.add(McpToolKey.m1043boximpl(McpToolKey.m1043boximpl(strM352getEnabled_keyA4OzCrU).m1050unboximpl()));
                    }
                }
            }
        }
        lqa lqaVarC = lqaVar.c();
        if (lqaVarC.isEmpty()) {
            return iei.a;
        }
        ((u9g) this.K).i(str != null ? ChatId.m978boximpl(str) : null, McpServerId.m1029boximpl(str2), arrayList, Boolean.valueOf(z4bVar != z4b.G));
        return w3c.j((w3c) this.F, str, lqaVarC, xzgVar, 8);
    }

    public Object q(String str, McpTool mcpTool, z4b z4bVar, xzg xzgVar) {
        String strM352getEnabled_keyA4OzCrU = mcpTool.m352getEnabled_keyA4OzCrU();
        if (strM352getEnabled_keyA4OzCrU != null) {
            ((yga) this.J).invoke(str != null ? ChatId.m978boximpl(str) : null, McpToolKey.m1043boximpl(strM352getEnabled_keyA4OzCrU), Boolean.valueOf(z4bVar != z4b.G));
        }
        return w3c.j((w3c) this.F, str, qok.n(mcpTool, z4bVar), xzgVar, 8);
    }

    public /* synthetic */ ra4(rok rokVar, m7f m7fVar, pl9 pl9Var) {
        this(rokVar, m7fVar, pl9Var, null, null);
    }

    public ra4(rok rokVar, m7f m7fVar, pl9 pl9Var, rzd rzdVar, bsc bscVar) {
        rokVar.getClass();
        m7fVar.getClass();
        pl9Var.getClass();
        this.E = rokVar;
        this.F = m7fVar;
        this.G = pl9Var;
        this.H = rzdVar;
        this.I = bscVar;
        this.J = "t:'" + ql9.a(pl9Var) + "' - q:'" + rzdVar + '\'';
    }

    public ra4(ivd ivdVar, ivd ivdVar2, ivd ivdVar3, w3c w3cVar, ivd ivdVar4, ivd ivdVar5, ivd ivdVar6) {
        this.E = ivdVar;
        this.F = ivdVar2;
        this.G = ivdVar3;
        this.H = w3cVar;
        this.I = ivdVar4;
        this.J = ivdVar5;
        this.K = ivdVar6;
    }

    public ra4(w3c w3cVar, wzh wzhVar, tzh tzhVar, wzh wzhVar2, yga ygaVar, u9g u9gVar) {
        this.F = w3cVar;
        this.G = wzhVar;
        this.H = tzhVar;
        this.I = wzhVar2;
        this.J = ygaVar;
        this.K = u9gVar;
        this.E = w3cVar;
    }

    public ra4(Executor executor, ArrayList arrayList, ArrayList arrayList2, ka4 ka4Var) {
        this.E = new HashMap();
        this.F = new HashMap();
        this.G = new HashMap();
        this.H = new HashSet();
        this.J = new AtomicReference();
        gv6 gv6Var = new gv6(executor);
        this.I = gv6Var;
        this.K = ka4Var;
        ArrayList<p94> arrayList3 = new ArrayList();
        arrayList3.add(p94.c(gv6Var, gv6.class, mvg.class, uwd.class));
        int i = 0;
        arrayList3.add(p94.c(this, ra4.class, new Class[0]));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            p94 p94Var = (p94) it.next();
            if (p94Var != null) {
                arrayList3.add(p94Var);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList4.add(it2.next());
        }
        ArrayList arrayList5 = new ArrayList();
        synchronized (this) {
            Iterator it3 = arrayList4.iterator();
            while (it3.hasNext()) {
                try {
                    ComponentRegistrar componentRegistrar = (ComponentRegistrar) ((jvd) it3.next()).get();
                    if (componentRegistrar != null) {
                        arrayList3.addAll(((ka4) this.K).d(componentRegistrar));
                        it3.remove();
                    }
                } catch (InvalidRegistrarException e) {
                    it3.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", e);
                }
            }
            Iterator it4 = arrayList3.iterator();
            while (it4.hasNext()) {
                Object[] array = ((p94) it4.next()).b.toArray();
                int length = array.length;
                int i2 = 0;
                while (true) {
                    if (i2 < length) {
                        Object obj = array[i2];
                        if (obj.toString().contains("kotlinx.coroutines.CoroutineDispatcher")) {
                            if (((HashSet) this.H).contains(obj.toString())) {
                                it4.remove();
                                break;
                            }
                            ((HashSet) this.H).add(obj.toString());
                        }
                        i2++;
                    }
                }
            }
            if (((HashMap) this.E).isEmpty()) {
                j8.z(arrayList3);
            } else {
                ArrayList arrayList6 = new ArrayList(((HashMap) this.E).keySet());
                arrayList6.addAll(arrayList3);
                j8.z(arrayList6);
            }
            for (p94 p94Var2 : arrayList3) {
                ((HashMap) this.E).put(p94Var2, new lw9(new qa4(this, i, p94Var2)));
            }
            arrayList5.addAll(n(arrayList3));
            arrayList5.addAll(o());
            m();
        }
        Iterator it5 = arrayList5.iterator();
        while (it5.hasNext()) {
            ((Runnable) it5.next()).run();
        }
        Boolean bool = (Boolean) ((AtomicReference) this.J).get();
        if (bool != null) {
            j((HashMap) this.E, bool.booleanValue());
        }
    }

    public ra4(l4 l4Var) {
        this.E = l4Var;
        this.F = l9e.e;
        this.G = null;
        this.H = null;
        this.I = null;
        this.J = null;
        this.K = null;
    }
}
