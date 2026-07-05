package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class c84 extends y2 {
    public final Object E;
    public int F;
    public final /* synthetic */ d84 G;

    public c84(d84 d84Var, int i) {
        this.G = d84Var;
        Object obj = d84.N;
        this.E = d84Var.j()[i];
        this.F = i;
    }

    public final void a() {
        int i = this.F;
        Object obj = this.E;
        d84 d84Var = this.G;
        if (i != -1 && i < d84Var.size()) {
            if (cvk.l(obj, d84Var.j()[this.F])) {
                return;
            }
        }
        Object obj2 = d84.N;
        this.F = d84Var.e(obj);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.E;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        d84 d84Var = this.G;
        Map mapC = d84Var.c();
        if (mapC != null) {
            return mapC.get(this.E);
        }
        a();
        int i = this.F;
        if (i == -1) {
            return null;
        }
        return d84Var.k()[i];
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        d84 d84Var = this.G;
        Map mapC = d84Var.c();
        Object obj2 = this.E;
        if (mapC != null) {
            return mapC.put(obj2, obj);
        }
        a();
        int i = this.F;
        if (i == -1) {
            d84Var.put(obj2, obj);
            return null;
        }
        Object obj3 = d84Var.k()[i];
        d84Var.k()[this.F] = obj;
        return obj3;
    }
}
