package defpackage;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes3.dex */
public final class yf3 implements wfd {
    public static final yf3 a = new yf3();

    @Override // defpackage.wfd
    public final Class a() {
        return xf3.class;
    }

    @Override // defpackage.wfd
    public final Class b() {
        return xf3.class;
    }

    @Override // defpackage.wfd
    public final Object c(lrb lrbVar) throws GeneralSecurityException {
        if (((sfd) lrbVar.G) == null) {
            rl7.j("no primary in primitive set");
            return null;
        }
        Iterator it = ((ConcurrentMap) lrbVar.F).values().iterator();
        while (it.hasNext()) {
            Iterator it2 = ((List) it.next()).iterator();
            while (it2.hasNext()) {
            }
        }
        return new xf3();
    }
}
