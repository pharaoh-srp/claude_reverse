package defpackage;

import java.util.List;
import java.util.Map;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes.dex */
public final class nnf extends fof {
    public final Map a;
    public final Map b;
    public final Map c;
    public final Map d;
    public final Map e;
    public final boolean f;

    public nnf(Map map, Map map2, Map map3, Map map4, Map map5, boolean z) {
        map.getClass();
        map2.getClass();
        map3.getClass();
        map4.getClass();
        map5.getClass();
        this.a = map;
        this.b = map2;
        this.c = map3;
        this.d = map4;
        this.e = map5;
        this.f = z;
    }

    @Override // defpackage.fof
    public final void a(gof gofVar) {
        for (Map.Entry entry : this.a.entrySet()) {
            pl9 pl9Var = (pl9) entry.getKey();
            qp4 qp4Var = (qp4) entry.getValue();
            if (qp4Var instanceof op4) {
                pl9Var.getClass();
                gofVar.f(pl9Var, ((op4) qp4Var).a);
            } else {
                if (!(qp4Var instanceof pp4)) {
                    mr9.b();
                    return;
                }
                gofVar.g(pl9Var, ((pp4) qp4Var).a);
            }
        }
        for (Map.Entry entry2 : this.b.entrySet()) {
            pl9 pl9Var2 = (pl9) entry2.getKey();
            for (Map.Entry entry3 : ((Map) entry2.getValue()).entrySet()) {
                pl9 pl9Var3 = (pl9) entry3.getKey();
                KSerializer kSerializer = (KSerializer) entry3.getValue();
                pl9Var2.getClass();
                pl9Var3.getClass();
                kSerializer.getClass();
                gofVar.h(pl9Var2, pl9Var3, kSerializer);
            }
        }
        for (Map.Entry entry4 : this.c.entrySet()) {
            pl9 pl9Var4 = (pl9) entry4.getKey();
            bz7 bz7Var = (bz7) entry4.getValue();
            pl9Var4.getClass();
            bz7Var.getClass();
            nai.n(1, bz7Var);
            gofVar.a(pl9Var4, bz7Var);
        }
        for (Map.Entry entry5 : this.e.entrySet()) {
            pl9 pl9Var5 = (pl9) entry5.getKey();
            bz7 bz7Var2 = (bz7) entry5.getValue();
            pl9Var5.getClass();
            bz7Var2.getClass();
            nai.n(1, bz7Var2);
            gofVar.c(pl9Var5, bz7Var2);
        }
    }

    @Override // defpackage.fof
    public final KSerializer b(pl9 pl9Var, List list) {
        pl9Var.getClass();
        list.getClass();
        qp4 qp4Var = (qp4) this.a.get(pl9Var);
        KSerializer kSerializerA = qp4Var != null ? qp4Var.a(list) : null;
        if (kSerializerA instanceof KSerializer) {
            return kSerializerA;
        }
        return null;
    }

    @Override // defpackage.fof
    public final znf c(pl9 pl9Var, Object obj) {
        pl9Var.getClass();
        obj.getClass();
        if (pl9Var.n(obj)) {
            Map map = (Map) this.b.get(pl9Var);
            KSerializer kSerializer = map != null ? (KSerializer) map.get(jce.a.b(obj.getClass())) : null;
            KSerializer kSerializer2 = kSerializer instanceof znf ? kSerializer : null;
            if (kSerializer2 != null) {
                return kSerializer2;
            }
            Object obj2 = this.c.get(pl9Var);
            bz7 bz7Var = nai.N(1, obj2) ? (bz7) obj2 : null;
            if (bz7Var != null) {
                return (znf) bz7Var.invoke(obj);
            }
        }
        return null;
    }
}
