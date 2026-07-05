package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.koin.core.error.DefinitionOverrideException;

/* JADX INFO: loaded from: classes.dex */
public final class er9 {
    public rok a;
    public final nyj b;
    public final dpf c;
    public final fj0 d;

    public er9() {
        mm6 mm6Var = new mm6();
        mm6Var.E = k3a.I;
        this.a = mm6Var;
        this.b = new nyj(this);
        this.c = new dpf(this);
        fj0 fj0Var = new fj0();
        fj0Var.E = this;
        fj0Var.F = new ConcurrentHashMap();
        fj0Var.G = new ConcurrentHashMap();
        this.d = fj0Var;
        new ConcurrentHashMap();
        new HashMap();
        new HashMap();
    }

    public final void a() {
        rok rokVar = this.a;
        rokVar.getClass();
        k3a k3aVar = k3a.E;
        rokVar.u0(k3aVar, "Create eager instances ...");
        long jA = brb.a();
        fj0 fj0Var = this.d;
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) fj0Var.G;
        t7g[] t7gVarArr = (t7g[]) concurrentHashMap.values().toArray(new t7g[0]);
        ArrayList arrayListS = x44.s(Arrays.copyOf(t7gVarArr, t7gVarArr.length));
        concurrentHashMap.clear();
        er9 er9Var = (er9) fj0Var.E;
        ra4 ra4Var = new ra4(er9Var.a, (m7f) er9Var.c.I, jce.a.b(d4c.class));
        Iterator it = arrayListS.iterator();
        while (it.hasNext()) {
            ((t7g) it.next()).b(ra4Var);
        }
        long jA2 = dqh.a(jA);
        rok rokVar2 = this.a;
        StringBuilder sb = new StringBuilder("Created eager instances in ");
        lz1 lz1Var = uh6.F;
        sb.append(uh6.o(jA2, zh6.MICROSECONDS) / 1000.0d);
        sb.append(" ms");
        String string = sb.toString();
        rokVar2.getClass();
        rokVar2.u0(k3aVar, string);
    }

    public final m7f b(String str) {
        str.getClass();
        dpf dpfVar = this.c;
        dpfVar.getClass();
        return (m7f) ((ConcurrentHashMap) dpfVar.H).get(str);
    }

    public final void c(List list, boolean z) {
        Object next;
        list.getClass();
        LinkedHashSet<oqb> linkedHashSet = new LinkedHashSet();
        qo0 qo0Var = new qo0(new mva(list));
        while (!qo0Var.isEmpty()) {
            oqb oqbVar = (oqb) qo0Var.removeLast();
            if (linkedHashSet.add(oqbVar)) {
                for (oqb oqbVar2 : oqbVar.e) {
                    if (!linkedHashSet.contains(oqbVar2)) {
                        qo0Var.addLast(oqbVar2);
                    }
                }
            }
        }
        fj0 fj0Var = this.d;
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) fj0Var.G;
        for (oqb oqbVar3 : linkedHashSet) {
            for (Map.Entry entry : oqbVar3.c.entrySet()) {
                String str = (String) entry.getKey();
                x59 x59Var = (x59) entry.getValue();
                er9 er9Var = (er9) fj0Var.E;
                str.getClass();
                x59Var.getClass();
                qh1 qh1Var = x59Var.a;
                ConcurrentHashMap concurrentHashMap2 = (ConcurrentHashMap) fj0Var.F;
                if (((x59) concurrentHashMap2.get(str)) != null) {
                    if (!z) {
                        throw new DefinitionOverrideException("Already existing definition for " + qh1Var + " at " + str);
                    }
                    rok rokVar = er9Var.a;
                    rokVar.getClass();
                    rokVar.u0(k3a.G, "(+) override index '" + str + "' -> '" + qh1Var + '\'');
                    Iterator it = concurrentHashMap.values().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            next = it.next();
                            if (((t7g) next).a.equals(qh1Var)) {
                                break;
                            }
                        } else {
                            next = null;
                            break;
                        }
                    }
                    if (((t7g) next) != null) {
                        concurrentHashMap.remove(Integer.valueOf(qh1Var.hashCode()));
                    }
                }
                rok rokVar2 = er9Var.a;
                rokVar2.getClass();
                rokVar2.u0(k3a.E, "(+) index '" + str + "' -> '" + qh1Var + '\'');
                concurrentHashMap2.put(str, x59Var);
            }
            for (t7g t7gVar : oqbVar3.b) {
                concurrentHashMap.put(Integer.valueOf(t7gVar.a.hashCode()), t7gVar);
            }
        }
        dpf dpfVar = this.c;
        dpfVar.getClass();
        Iterator it2 = linkedHashSet.iterator();
        while (it2.hasNext()) {
            ((Set) dpfVar.G).addAll(((oqb) it2.next()).d);
        }
    }
}
