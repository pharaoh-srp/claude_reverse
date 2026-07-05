package defpackage;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes.dex */
public abstract class vxi {
    public final m4e a = new m4e();

    public final void a(String str, AutoCloseable autoCloseable) {
        AutoCloseable autoCloseable2;
        m4e m4eVar = this.a;
        if (m4eVar != null) {
            if (m4eVar.E) {
                m4e.b(autoCloseable);
                return;
            }
            synchronized (((efk) m4eVar.F)) {
                autoCloseable2 = (AutoCloseable) ((LinkedHashMap) m4eVar.G).put(str, autoCloseable);
            }
            m4e.b(autoCloseable2);
        }
    }

    public final void b() {
        m4e m4eVar = this.a;
        if (m4eVar != null && !m4eVar.E) {
            m4eVar.E = true;
            synchronized (((efk) m4eVar.F)) {
                try {
                    Iterator it = ((LinkedHashMap) m4eVar.G).values().iterator();
                    while (it.hasNext()) {
                        m4e.b((AutoCloseable) it.next());
                    }
                    Iterator it2 = ((LinkedHashSet) m4eVar.H).iterator();
                    while (it2.hasNext()) {
                        m4e.b((AutoCloseable) it2.next());
                    }
                    ((LinkedHashSet) m4eVar.H).clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        d();
    }

    public final AutoCloseable c(String str) {
        AutoCloseable autoCloseable;
        m4e m4eVar = this.a;
        if (m4eVar == null) {
            return null;
        }
        synchronized (((efk) m4eVar.F)) {
            autoCloseable = (AutoCloseable) ((LinkedHashMap) m4eVar.G).get(str);
        }
        return autoCloseable;
    }

    public void d() {
    }
}
