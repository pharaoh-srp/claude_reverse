package defpackage;

import java.io.IOException;
import java.net.UnknownHostException;
import java.util.LinkedHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;

/* JADX INFO: loaded from: classes.dex */
public final class ag5 extends ts9 implements zy7 {
    public final /* synthetic */ int F;
    public final /* synthetic */ Object G;
    public final /* synthetic */ Object H;
    public final /* synthetic */ Object I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ag5(Object obj, Object obj2, Object obj3, int i) {
        super(0);
        this.F = i;
        this.G = obj;
        this.H = obj2;
        this.I = obj3;
    }

    @Override // defpackage.zy7
    public final Object a() {
        switch (this.F) {
            case 0:
                g99 g99Var = g99.E;
                bg5 bg5Var = (bg5) this.G;
                try {
                    return bg5.a(bg5Var, (lie) this.H);
                } catch (UnknownHostException e) {
                    dch.H(bg5Var.F, 5, g99Var, new v01(7, (lj5) this.I), e, false, 48);
                    return new kki(true, 0, e, 2);
                } catch (IOException e2) {
                    dch.H(bg5Var.F, 5, g99Var, yf5.I, e2, false, 48);
                    return new pki(true, 0, e2, 2);
                } catch (Throwable th) {
                    dch.H(bg5Var.F, 5, g99Var, yf5.J, th, false, 48);
                    return new ski(true, 0, th, 2);
                }
            case 1:
                iei ieiVar = iei.a;
                qj5 qj5Var = (qj5) this.G;
                ConcurrentHashMap concurrentHashMap = qj5Var.f;
                String str = (String) this.H;
                gbf gbfVar = (gbf) concurrentHashMap.get(str);
                if (gbfVar != null) {
                    Lock lockWriteLock = gbfVar.m.writeLock();
                    lockWriteLock.getClass();
                    TimeUnit timeUnit = TimeUnit.SECONDS;
                    bz7 bz7Var = (bz7) this.I;
                    g99 g99Var2 = g99.G;
                    g99 g99Var3 = g99.E;
                    try {
                        boolean zTryLock = lockWriteLock.tryLock(1L, timeUnit);
                        if (zTryLock) {
                            try {
                                LinkedHashMap linkedHashMap = gbfVar.n;
                                bz7Var.invoke(linkedHashMap);
                                for (p0j p0jVar : qj5Var.j) {
                                    p0jVar.getClass();
                                    linkedHashMap.getClass();
                                    if (str.equals("rum")) {
                                        String str2 = sxe.p;
                                        p0jVar.J = zni.y(linkedHashMap);
                                    }
                                }
                            } finally {
                                if (zTryLock) {
                                    lockWriteLock.unlock();
                                }
                            }
                        } else {
                            dch.I(qj5Var.k, 5, x44.X(g99Var3, g99Var2), new pj5(lockWriteLock, 0), null, 56);
                        }
                    } catch (InterruptedException e3) {
                        dch.I(qj5Var.k, 5, x44.X(g99Var3, g99Var2), new pj5(lockWriteLock, 1), e3, 48);
                    }
                    break;
                }
                return ieiVar;
            case 2:
                return new qye((dze) this.G, (k99) this.H, (rxe) this.I);
            default:
                a1 a1Var = (a1) this.G;
                a1Var.removeOnAttachStateChangeListener((p20) this.H);
                zni.E(a1Var).a.remove((pmf) this.I);
                return iei.a;
        }
    }
}
