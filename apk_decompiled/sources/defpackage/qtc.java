package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class qtc {
    public final ArrayList a;
    public final ArrayList b;
    public final ArrayList c;
    public int d;
    public final Object e;

    public qtc(qtc qtcVar) {
        ArrayList arrayList = qtcVar.a;
        LinkedHashSet linkedHashSet = (LinkedHashSet) qtcVar.e;
        LinkedHashSet linkedHashSet2 = z96.r;
        ArrayList arrayList2 = new ArrayList();
        arrayList2.addAll(arrayList);
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            arrayList2.add(z96.s.get((Class) it.next()));
        }
        this.a = arrayList2;
        this.e = new lz1(25);
        this.c = qtcVar.c;
        ArrayList arrayList3 = qtcVar.b;
        this.b = arrayList3;
        this.d = qtcVar.d;
        new LinkedHashMap();
        HashMap map = new HashMap();
        s39.b(Arrays.asList(new c01('*'), new c01('_')), map);
        s39.b(arrayList3, map);
        HashMap map2 = new HashMap();
        map2.put('\\', Collections.singletonList(new kc1()));
        map2.put('`', Collections.singletonList(new lc1()));
        map2.put('&', Collections.singletonList(new aq6()));
        map2.put('<', Arrays.asList(new p91(), new zp8()));
        Set setKeySet = map.keySet();
        Set setKeySet2 = map2.keySet();
        BitSet bitSet = new BitSet();
        Iterator it2 = setKeySet.iterator();
        while (it2.hasNext()) {
            bitSet.set(((Character) it2.next()).charValue());
        }
        Iterator it3 = setKeySet2.iterator();
        while (it3.hasNext()) {
            bitSet.set(((Character) it3.next()).charValue());
        }
        bitSet.set(91);
        bitSet.set(93);
        bitSet.set(33);
        bitSet.set(10);
    }

    public void a(Iterable iterable) {
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            bc7 bc7Var = (bc7) it.next();
            if (bc7Var instanceof rtc) {
                ((rtc) bc7Var).b(this);
            }
        }
    }

    public b5c b(String str) {
        if (str == null) {
            mr9.h("input must not be null");
            return null;
        }
        z96 z96Var = new z96(this.a, (lz1) this.e, this.b, this.d);
        int i = 0;
        while (true) {
            int iH = ybi.h(i, str);
            if (iH == -1) {
                break;
            }
            z96Var.i(str.substring(i, iH));
            i = iH + 1;
            if (i < str.length() && str.charAt(iH) == '\r' && str.charAt(i) == '\n') {
                i = iH + 2;
            }
        }
        if (str.length() > 0 && (i == 0 || i < str.length())) {
            z96Var.i(str.substring(i));
        }
        z96Var.f(z96Var.p.size());
        k02 k02Var = z96Var.o;
        q28 q28Var = new q28(z96Var.l, 4, k02Var);
        z96Var.k.getClass();
        s39 s39Var = new s39(q28Var);
        Iterator it = z96Var.q.iterator();
        while (it.hasNext()) {
            ((f0) it.next()).h(s39Var);
        }
        b5c b5cVarL = z96Var.n.l();
        Iterator it2 = this.c.iterator();
        while (it2.hasNext()) {
            b5cVarL = ((aad) it2.next()).a(b5cVarL);
        }
        return b5cVarL;
    }

    public qtc() {
        this.a = new ArrayList();
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.e = z96.r;
        this.d = 1;
    }
}
