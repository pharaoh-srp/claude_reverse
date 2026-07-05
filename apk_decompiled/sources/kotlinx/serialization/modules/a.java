package kotlinx.serialization.modules;

import defpackage.bz7;
import defpackage.ez1;
import defpackage.fof;
import defpackage.gof;
import defpackage.nnf;
import defpackage.op4;
import defpackage.pl9;
import defpackage.pmf;
import defpackage.pp4;
import defpackage.qp4;
import defpackage.rp4;
import defpackage.w44;
import defpackage.xh6;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes.dex */
public final class a implements gof {
    public final HashMap E = new HashMap();
    public final HashMap F = new HashMap();
    public final HashMap G = new HashMap();
    public final HashMap H = new HashMap();
    public final HashMap I = new HashMap();
    public boolean J;

    public static void i(a aVar, pl9 pl9Var, pl9 pl9Var2, KSerializer kSerializer) {
        Object next;
        pl9 pl9Var3;
        pl9Var.getClass();
        pl9Var2.getClass();
        kSerializer.getClass();
        String strA = kSerializer.getDescriptor().a();
        HashMap map = aVar.F;
        Object map2 = map.get(pl9Var);
        if (map2 == null) {
            map2 = new HashMap();
            map.put(pl9Var, map2);
        }
        Map map3 = (Map) map2;
        HashMap map4 = aVar.H;
        Object map5 = map4.get(pl9Var);
        if (map5 == null) {
            map5 = new HashMap();
            map4.put(pl9Var, map5);
        }
        Map map6 = (Map) map5;
        KSerializer kSerializer2 = (KSerializer) map3.get(pl9Var2);
        if (kSerializer2 != null && !kSerializer2.equals(kSerializer)) {
            throw new SerializerAlreadyRegisteredException(pl9Var, pl9Var2);
        }
        KSerializer kSerializer3 = (KSerializer) map6.get(strA);
        if (kSerializer3 == null || kSerializer3.equals(kSerializer)) {
            map3.put(pl9Var2, kSerializer);
            map6.put(strA, kSerializer);
            return;
        }
        Iterator it = ((Iterable) w44.E0(map3.entrySet()).b).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((Map.Entry) next).getValue() == kSerializer3) {
                    break;
                }
            }
        }
        Map.Entry entry = (Map.Entry) next;
        if (entry == null || (pl9Var3 = (pl9) entry.getKey()) == null) {
            xh6.i(strA, " is registered in the module but no Kotlin class is associated with it.", "Name ");
            return;
        }
        throw new IllegalArgumentException("Multiple polymorphic serializers in a scope of '" + pl9Var + "' have the same serial name '" + strA + "': " + kSerializer + " for '" + pl9Var2 + "' and " + kSerializer3 + " for '" + pl9Var3 + '\'');
    }

    public static void j(a aVar, pl9 pl9Var, qp4 qp4Var) {
        HashMap map = aVar.E;
        pl9Var.getClass();
        qp4 qp4Var2 = (qp4) map.get(pl9Var);
        if (qp4Var2 != null && !qp4Var2.equals(qp4Var)) {
            throw new SerializerAlreadyRegisteredException("Contextual serializer or serializer provider for " + pl9Var + " already registered in this module");
        }
        map.put(pl9Var, qp4Var);
        if (ez1.I(pl9Var).isInterface()) {
            aVar.J = true;
        }
    }

    @Override // defpackage.gof
    public final void a(pl9 pl9Var, bz7 bz7Var) {
        HashMap map = this.G;
        bz7 bz7Var2 = (bz7) map.get(pl9Var);
        if (bz7Var2 == null || bz7Var2.equals(bz7Var)) {
            map.put(pl9Var, bz7Var);
        } else {
            pmf.i("Default serializers provider for ", pl9Var, " is already registered: ", bz7Var2);
        }
    }

    public final nnf b() {
        return new nnf(this.E, this.F, this.G, this.H, this.I, this.J);
    }

    @Override // defpackage.gof
    public final void c(pl9 pl9Var, bz7 bz7Var) {
        pl9Var.getClass();
        e(pl9Var, bz7Var);
    }

    public final void d(fof fofVar) {
        fofVar.getClass();
        fofVar.a(this);
    }

    public final void e(pl9 pl9Var, bz7 bz7Var) {
        pl9Var.getClass();
        bz7Var.getClass();
        HashMap map = this.I;
        bz7 bz7Var2 = (bz7) map.get(pl9Var);
        if (bz7Var2 == null || bz7Var2.equals(bz7Var)) {
            map.put(pl9Var, bz7Var);
        } else {
            pmf.i("Default deserializers provider for ", pl9Var, " is already registered: ", bz7Var2);
        }
    }

    @Override // defpackage.gof
    public final void f(pl9 pl9Var, rp4 rp4Var) {
        pl9Var.getClass();
        j(this, pl9Var, new op4(rp4Var));
    }

    @Override // defpackage.gof
    public final void g(pl9 pl9Var, bz7 bz7Var) {
        pl9Var.getClass();
        j(this, pl9Var, new pp4(bz7Var));
    }

    @Override // defpackage.gof
    public final void h(pl9 pl9Var, pl9 pl9Var2, KSerializer kSerializer) {
        i(this, pl9Var, pl9Var2, kSerializer);
    }
}
