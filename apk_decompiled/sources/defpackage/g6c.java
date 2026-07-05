package defpackage;

import com.squareup.moshi.JsonDataException;

/* JADX INFO: loaded from: classes3.dex */
public final class g6c extends gg9 {
    public final gg9 a;

    public g6c(gg9 gg9Var) {
        this.a = gg9Var;
    }

    @Override // defpackage.gg9
    public final Object fromJson(ci9 ci9Var) {
        if (ci9Var.j() != bi9.M) {
            return this.a.fromJson(ci9Var);
        }
        throw new JsonDataException("Unexpected null at ".concat(ci9Var.c()));
    }

    @Override // defpackage.gg9
    public final void toJson(jj9 jj9Var, Object obj) {
        if (obj == null) {
            throw new JsonDataException("Unexpected null at ".concat(jj9Var.j()));
        }
        this.a.toJson(jj9Var, obj);
    }

    public final String toString() {
        return this.a + ".nonNull()";
    }
}
