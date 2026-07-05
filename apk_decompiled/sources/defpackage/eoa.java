package defpackage;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public abstract class eoa {
    static {
        wf[] wfVarArr = {new wf(8, doa.class)};
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
        int i = ude.CONFIG_NAME_FIELD_NUMBER;
        try {
            a();
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    public static void a() {
        tde.h(hoa.c);
        tde.h(yf3.a);
        tde.f(new yf(), true);
        dsc dscVar = mn8.a;
        gwb gwbVar = gwb.b;
        gwbVar.e(mn8.a);
        gwbVar.d(mn8.b);
        gwbVar.c(mn8.c);
        gwbVar.b(mn8.d);
        zvb zvbVar = zvb.b;
        zvbVar.b(yf.f);
        if (hrh.a()) {
            return;
        }
        tde.f(new yf(sf.class, new wf[]{new wf(0, doa.class)}, 0), true);
        gwbVar.e(dg.a);
        gwbVar.d(dg.b);
        gwbVar.c(dg.c);
        gwbVar.b(dg.d);
        zvbVar.b(yf.e);
    }
}
