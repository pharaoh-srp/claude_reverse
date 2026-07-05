package defpackage;

import java.security.GeneralSecurityException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes3.dex */
public final class zo9 {
    public static final Logger b = Logger.getLogger(zo9.class.getName());
    public final ConcurrentHashMap a;

    public zo9(zo9 zo9Var) {
        this.a = new ConcurrentHashMap(zo9Var.a);
    }

    public final synchronized yo9 a(String str) {
        if (!this.a.containsKey(str)) {
            throw new GeneralSecurityException("No key manager found for key type " + str);
        }
        return (yo9) this.a.get(str);
    }

    public final synchronized void b(yf yfVar) {
        int i = 2;
        switch (yfVar.d) {
            case 1:
            case 2:
            case 4:
                break;
            case 3:
            default:
                i = 1;
                break;
        }
        if (!(i != 1 ? gid.b(i) : gid.a(i))) {
            throw new GeneralSecurityException("failed to register key manager " + yfVar.getClass() + " as it is not FIPS compatible.");
        }
        c(new yo9(yfVar));
    }

    public final synchronized void c(yo9 yo9Var) {
        yf yfVar = yo9Var.a;
        Class cls = yfVar.c;
        if (!yfVar.b.keySet().contains(cls) && !Void.class.equals(cls)) {
            throw new IllegalArgumentException("Given internalKeyMananger " + yfVar.toString() + " does not support primitive class " + cls.getName());
        }
        String strF = yfVar.f();
        yo9 yo9Var2 = (yo9) this.a.get(strF);
        if (yo9Var2 != null && !yo9Var2.a.getClass().equals(yo9Var.a.getClass())) {
            b.warning("Attempted overwrite of a registered key manager for key type ".concat(strF));
            throw new GeneralSecurityException("typeUrl (" + strF + ") is already registered with " + yo9Var2.a.getClass().getName() + ", cannot be re-registered with " + yo9Var.a.getClass().getName());
        }
        this.a.putIfAbsent(strF, yo9Var);
    }

    public zo9() {
        this.a = new ConcurrentHashMap();
    }
}
