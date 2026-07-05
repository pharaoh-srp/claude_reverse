package defpackage;

import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes3.dex */
public final class nrb extends gg9 {
    public final Type a;
    public final String b;
    public final Object c;
    public gg9 d;

    public nrb(Type type, String str, Object obj) {
        this.a = type;
        this.b = str;
        this.c = obj;
    }

    @Override // defpackage.gg9
    public final Object fromJson(ci9 ci9Var) {
        gg9 gg9Var = this.d;
        if (gg9Var != null) {
            return gg9Var.fromJson(ci9Var);
        }
        sz6.j("JsonAdapter isn't ready");
        return null;
    }

    @Override // defpackage.gg9
    public final void toJson(jj9 jj9Var, Object obj) {
        gg9 gg9Var = this.d;
        if (gg9Var != null) {
            gg9Var.toJson(jj9Var, obj);
        } else {
            sz6.j("JsonAdapter isn't ready");
        }
    }

    public final String toString() {
        gg9 gg9Var = this.d;
        return gg9Var != null ? gg9Var.toString() : super.toString();
    }
}
