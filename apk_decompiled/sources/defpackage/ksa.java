package defpackage;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class ksa {
    public static void a(Object obj, Object obj2) {
        fsa fsaVar = (fsa) obj;
        if (obj2 != null) {
            mr9.o();
            return;
        }
        if (fsaVar.isEmpty()) {
            return;
        }
        Iterator it = fsaVar.entrySet().iterator();
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            entry.getKey();
            entry.getValue();
            throw null;
        }
    }

    public static fsa b(Object obj, Object obj2) {
        fsa fsaVarD = (fsa) obj;
        fsa fsaVar = (fsa) obj2;
        if (!fsaVar.isEmpty()) {
            if (!fsaVarD.E) {
                fsaVarD = fsaVarD.d();
            }
            fsaVarD.c();
            if (!fsaVar.isEmpty()) {
                fsaVarD.putAll(fsaVar);
            }
        }
        return fsaVarD;
    }
}
