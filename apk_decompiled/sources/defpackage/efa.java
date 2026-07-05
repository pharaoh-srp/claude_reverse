package defpackage;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public class efa implements bz7 {
    public final gfa E;
    public final ConcurrentHashMap F;
    public final bz7 G;

    public efa(gfa gfaVar, ConcurrentHashMap concurrentHashMap, bz7 bz7Var) {
        this.E = gfaVar;
        this.F = concurrentHashMap;
        this.G = bz7Var;
    }

    public static /* synthetic */ void d(int i) {
        String str = (i == 3 || i == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 3 || i == 4) ? 2 : 3];
        if (i == 1) {
            objArr[0] = "map";
        } else if (i == 2) {
            objArr[0] = "compute";
        } else if (i == 3 || i == 4) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunction";
        } else {
            objArr[0] = "storageManager";
        }
        if (i == 3) {
            objArr[1] = "recursionDetected";
        } else if (i != 4) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunction";
        } else {
            objArr[1] = "raceCondition";
        }
        if (i != 3 && i != 4) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i != 3 && i != 4) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public final AssertionError e(Object obj, Object obj2) {
        AssertionError assertionError = new AssertionError("Race condition detected on input " + obj + ". Old value is " + obj2 + " under " + this.E);
        gfa.e(assertionError);
        return assertionError;
    }

    @Override // defpackage.bz7
    public Object invoke(Object obj) throws Throwable {
        AssertionError assertionErrorE;
        gfa gfaVar = this.E;
        efk efkVar = gfaVar.b;
        f7g f7gVar = gfaVar.a;
        ConcurrentHashMap concurrentHashMap = this.F;
        Object obj2 = concurrentHashMap.get(obj);
        Object obj3 = kij.a;
        ffa ffaVar = ffa.F;
        if (obj2 != null && obj2 != ffaVar) {
            kij.a(obj2);
            if (obj2 == obj3) {
                return null;
            }
            return obj2;
        }
        f7gVar.lock();
        try {
            Object obj4 = concurrentHashMap.get(obj);
            ffa ffaVar2 = ffa.G;
            if (obj4 == ffaVar) {
                z5l z5lVarD = gfaVar.d("", obj);
                if (z5lVarD == null) {
                    d(3);
                    throw null;
                }
                if (!z5lVarD.g()) {
                    return z5lVarD.f();
                }
                obj4 = ffaVar2;
            }
            if (obj4 == ffaVar2) {
                z5l z5lVarD2 = gfaVar.d("", obj);
                if (z5lVarD2 == null) {
                    d(3);
                    throw null;
                }
                if (!z5lVarD2.g()) {
                    return z5lVarD2.f();
                }
            }
            if (obj4 != null) {
                kij.a(obj4);
                return obj4 != obj3 ? obj4 : null;
            }
            try {
                concurrentHashMap.put(obj, ffaVar);
                Object objInvoke = this.G.invoke(obj);
                if (objInvoke != null) {
                    obj3 = objInvoke;
                }
                Object objPut = concurrentHashMap.put(obj, obj3);
                if (objPut == ffaVar) {
                    return objInvoke;
                }
                assertionErrorE = e(obj, objPut);
                try {
                    throw assertionErrorE;
                } catch (Throwable th) {
                    th = th;
                }
            } catch (Throwable th2) {
                th = th2;
                assertionErrorE = null;
            }
            if (djk.i(th)) {
                concurrentHashMap.remove(obj);
                throw th;
            }
            if (th == assertionErrorE) {
                efkVar.getClass();
                djk.j(th);
                throw null;
            }
            Object objPut2 = concurrentHashMap.put(obj, new jij(th));
            if (objPut2 != ffaVar) {
                throw e(obj, objPut2);
            }
            efkVar.getClass();
            djk.j(th);
            throw null;
        } finally {
            f7gVar.unlock();
        }
    }
}
