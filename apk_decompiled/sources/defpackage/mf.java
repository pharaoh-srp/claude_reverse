package defpackage;

import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import java.util.Collections;
import java.util.HashMap;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class mf {
    static {
        wf[] wfVarArr = {new wf(1, lf.class)};
        HashMap map = new HashMap();
        wf wfVar = wfVarArr[0];
        boolean zContainsKey = map.containsKey(wfVar.a);
        Class cls = wfVar.a;
        if (zContainsKey) {
            sz6.p(vb7.o(cls, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
            return;
        }
        map.put(cls, wfVar);
        Class cls2 = wfVarArr[0].a;
        Collections.unmodifiableMap(map);
        wf[] wfVarArr2 = {new wf(4, lf.class)};
        HashMap map2 = new HashMap();
        wf wfVar2 = wfVarArr2[0];
        boolean zContainsKey2 = map2.containsKey(wfVar2.a);
        Class cls3 = wfVar2.a;
        if (zContainsKey2) {
            sz6.p(vb7.o(cls3, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
            return;
        }
        map2.put(cls3, wfVar2);
        Class cls4 = wfVarArr2[0].a;
        Collections.unmodifiableMap(map2);
        wf[] wfVarArr3 = {new wf(5, lf.class)};
        HashMap map3 = new HashMap();
        wf wfVar3 = wfVarArr3[0];
        boolean zContainsKey3 = map3.containsKey(wfVar3.a);
        Class cls5 = wfVar3.a;
        if (zContainsKey3) {
            sz6.p(vb7.o(cls5, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
            return;
        }
        map3.put(cls5, wfVar3);
        Class cls6 = wfVarArr3[0].a;
        Collections.unmodifiableMap(map3);
        wf[] wfVarArr4 = {new wf(3, lf.class)};
        HashMap map4 = new HashMap();
        wf wfVar4 = wfVarArr4[0];
        boolean zContainsKey4 = map4.containsKey(wfVar4.a);
        Class cls7 = wfVar4.a;
        if (zContainsKey4) {
            sz6.p(vb7.o(cls7, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
            return;
        }
        map4.put(cls7, wfVar4);
        Class cls8 = wfVarArr4[0].a;
        Collections.unmodifiableMap(map4);
        wf[] wfVarArr5 = {new wf(9, lf.class)};
        HashMap map5 = new HashMap();
        wf wfVar5 = wfVarArr5[0];
        boolean zContainsKey5 = map5.containsKey(wfVar5.a);
        Class cls9 = wfVar5.a;
        if (zContainsKey5) {
            sz6.p(vb7.o(cls9, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
            return;
        }
        map5.put(cls9, wfVar5);
        Class cls10 = wfVarArr5[0].a;
        Collections.unmodifiableMap(map5);
        wf[] wfVarArr6 = {new wf(10, lf.class)};
        HashMap map6 = new HashMap();
        wf wfVar6 = wfVarArr6[0];
        boolean zContainsKey6 = map6.containsKey(wfVar6.a);
        Class cls11 = wfVar6.a;
        if (zContainsKey6) {
            sz6.p(vb7.o(cls11, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
            return;
        }
        map6.put(cls11, wfVar6);
        Class cls12 = wfVarArr6[0].a;
        Collections.unmodifiableMap(map6);
        wf[] wfVarArr7 = {new wf(7, lf.class)};
        HashMap map7 = new HashMap();
        wf wfVar7 = wfVarArr7[0];
        boolean zContainsKey7 = map7.containsKey(wfVar7.a);
        Class cls13 = wfVar7.a;
        if (zContainsKey7) {
            sz6.p(vb7.o(cls13, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
            return;
        }
        map7.put(cls13, wfVar7);
        Class cls14 = wfVarArr7[0].a;
        Collections.unmodifiableMap(map7);
        wf[] wfVarArr8 = {new wf(11, lf.class)};
        HashMap map8 = new HashMap();
        wf wfVar8 = wfVarArr8[0];
        boolean zContainsKey8 = map8.containsKey(wfVar8.a);
        Class cls15 = wfVar8.a;
        if (zContainsKey8) {
            sz6.p(vb7.o(cls15, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
            return;
        }
        map8.put(cls15, wfVar8);
        Class cls16 = wfVarArr8[0].a;
        Collections.unmodifiableMap(map8);
        int i = ude.CONFIG_NAME_FIELD_NUMBER;
        try {
            a();
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    public static void a() {
        tde.h(qf.b);
        eoa.a();
        tde.f(new yf(fg.class, new wf[]{new wf(1, lf.class)}, 2), true);
        tde.f(new yf(dh.class, new wf[]{new wf(4, lf.class)}, 4), true);
        dsc dscVar = ih.a;
        gwb gwbVar = gwb.b;
        gwbVar.e(ih.a);
        gwbVar.d(ih.b);
        gwbVar.c(ih.c);
        gwbVar.b(ih.d);
        if (hrh.a()) {
            return;
        }
        tde.f(new yf(sg.class, new wf[]{new wf(3, lf.class)}, 3), true);
        gwbVar.e(ah.a);
        gwbVar.d(ah.b);
        gwbVar.c(ah.c);
        gwbVar.b(ah.d);
        try {
            Cipher.getInstance("AES/GCM-SIV/NoPadding");
            tde.f(new yf(lh.class, new wf[]{new wf(5, lf.class)}, 5), true);
            gwbVar.e(qh.a);
            gwbVar.d(qh.b);
            gwbVar.c(qh.c);
            gwbVar.b(qh.d);
        } catch (NoSuchAlgorithmException | NoSuchPaddingException unused) {
        }
        tde.f(new yf(ng2.class, new wf[]{new wf(7, lf.class)}, 7), true);
        dsc dscVar2 = sg2.a;
        gwb gwbVar2 = gwb.b;
        gwbVar2.e(sg2.a);
        gwbVar2.d(sg2.b);
        gwbVar2.c(sg2.c);
        gwbVar2.b(sg2.d);
        tde.f(new yf(mq9.class, new wf[]{new wf(9, lf.class)}, 8), true);
        tde.f(new yf(rq9.class, new wf[]{new wf(10, lf.class)}, 9), true);
        tde.f(new yf(uij.class, new wf[]{new wf(11, lf.class)}, 10), true);
        gwbVar2.e(yij.a);
        gwbVar2.d(yij.b);
        gwbVar2.c(yij.c);
        gwbVar2.b(yij.d);
    }
}
