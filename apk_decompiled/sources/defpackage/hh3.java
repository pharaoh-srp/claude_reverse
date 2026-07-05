package defpackage;

import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes3.dex */
public final class hh3 {
    public final String a;
    public final Field b;
    public final gg9 c;

    public hh3(String str, Field field, gg9 gg9Var) {
        this.a = str;
        this.b = field;
        this.c = gg9Var;
    }

    public final void a(ci9 ci9Var, Object obj) {
        this.b.set(obj, this.c.fromJson(ci9Var));
    }

    public final void b(jj9 jj9Var, Object obj) {
        this.c.toJson(jj9Var, this.b.get(obj));
    }
}
