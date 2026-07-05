package defpackage;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class zvb {
    public static final zvb b = new zvb();
    public final AtomicReference a = new AtomicReference(new qfd(new epk(29)));

    public final Class a(Class cls) throws GeneralSecurityException {
        HashMap map = ((qfd) this.a.get()).b;
        if (map.containsKey(cls)) {
            return ((wfd) map.get(cls)).a();
        }
        poc.k(cls, " available", "No input primitive class for ");
        return null;
    }

    public final synchronized void b(ifd ifdVar) {
        epk epkVar = new epk((qfd) this.a.get());
        HashMap map = (HashMap) epkVar.E;
        pfd pfdVar = new pfd(ifdVar.a, xf3.class);
        if (map.containsKey(pfdVar)) {
            ifd ifdVar2 = (ifd) map.get(pfdVar);
            if (!ifdVar2.equals(ifdVar) || ifdVar != ifdVar2) {
                poc.m("Attempt to register non-equal PrimitiveConstructor object for already existing object of type: ", pfdVar);
            }
        } else {
            map.put(pfdVar, ifdVar);
        }
        this.a.set(new qfd(epkVar));
    }
}
