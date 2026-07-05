package defpackage;

import com.google.crypto.tink.internal.TinkBugException;
import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class gwb {
    public static final gwb b = new gwb();
    public final AtomicReference a = new AtomicReference(new ynf(new c61(24)));

    public final ybi a(jud judVar) {
        AtomicReference atomicReference = this.a;
        ynf ynfVar = (ynf) atomicReference.get();
        ynfVar.getClass();
        n22 n22Var = (n22) judVar.c;
        if (!ynfVar.b.containsKey(new wnf(jud.class, n22Var))) {
            try {
                i2a i2aVar = new i2a();
                ((qo9) judVar.e).ordinal();
                return i2aVar;
            } catch (GeneralSecurityException e) {
                throw new TinkBugException("Creating a LegacyProtoKey failed", e);
            }
        }
        ynf ynfVar2 = (ynf) atomicReference.get();
        ynfVar2.getClass();
        wnf wnfVar = new wnf(jud.class, n22Var);
        HashMap map = ynfVar2.b;
        if (map.containsKey(wnfVar)) {
            return ((ap9) map.get(wnfVar)).b.h(judVar);
        }
        poc.k(wnfVar, " available", "No Key Parser for requested key type ");
        return null;
    }

    public final synchronized void b(ap9 ap9Var) {
        c61 c61Var = new c61((ynf) this.a.get());
        ap9Var.getClass();
        wnf wnfVar = new wnf(jud.class, ap9Var.a);
        HashMap map = (HashMap) c61Var.G;
        if (map.containsKey(wnfVar)) {
            ap9 ap9Var2 = (ap9) map.get(wnfVar);
            if (!ap9Var2.equals(ap9Var) || ap9Var != ap9Var2) {
                poc.m("Attempt to register non-equal parser for already existing object of type: ", wnfVar);
            }
        } else {
            map.put(wnfVar, ap9Var);
        }
        this.a.set(new ynf(c61Var));
    }

    public final synchronized void c(cp9 cp9Var) {
        c61 c61Var = new c61((ynf) this.a.get());
        xnf xnfVar = new xnf(cp9Var.a, jud.class);
        HashMap map = (HashMap) c61Var.F;
        if (map.containsKey(xnfVar)) {
            cp9 cp9Var2 = (cp9) map.get(xnfVar);
            if (!cp9Var2.equals(cp9Var) || cp9Var != cp9Var2) {
                poc.m("Attempt to register non-equal serializer for already existing object of type: ", xnfVar);
            }
        } else {
            map.put(xnfVar, cp9Var);
        }
        this.a.set(new ynf(c61Var));
    }

    public final synchronized void d(csc cscVar) {
        c61 c61Var = new c61((ynf) this.a.get());
        cscVar.getClass();
        wnf wnfVar = new wnf(kud.class, cscVar.a);
        HashMap map = (HashMap) c61Var.I;
        if (map.containsKey(wnfVar)) {
            csc cscVar2 = (csc) map.get(wnfVar);
            if (!cscVar2.equals(cscVar) || cscVar != cscVar2) {
                poc.m("Attempt to register non-equal parser for already existing object of type: ", wnfVar);
            }
        } else {
            map.put(wnfVar, cscVar);
        }
        this.a.set(new ynf(c61Var));
    }

    public final synchronized void e(dsc dscVar) {
        c61 c61Var = new c61((ynf) this.a.get());
        xnf xnfVar = new xnf(dscVar.a, kud.class);
        HashMap map = (HashMap) c61Var.H;
        if (map.containsKey(xnfVar)) {
            dsc dscVar2 = (dsc) map.get(xnfVar);
            if (!dscVar2.equals(dscVar) || dscVar != dscVar2) {
                poc.m("Attempt to register non-equal serializer for already existing object of type: ", xnfVar);
            }
        } else {
            map.put(xnfVar, dscVar);
        }
        this.a.set(new ynf(c61Var));
    }
}
