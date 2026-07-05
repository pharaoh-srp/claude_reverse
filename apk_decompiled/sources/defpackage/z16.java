package defpackage;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public abstract class z16 {
    public static final /* synthetic */ int a = 0;

    static {
        wf[] wfVarArr = {new wf(6, y16.class)};
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
            tde.h(b26.b);
            if (hrh.a()) {
                return;
            }
            tde.f(new yf(th.class, new wf[]{new wf(6, y16.class)}, 6), true);
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }
}
