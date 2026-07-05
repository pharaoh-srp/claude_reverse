package defpackage;

import com.google.gson.JsonIOException;
import com.google.gson.stream.JsonWriter;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class rce {
    public final String a;
    public final Field b;
    public final String c;
    public final boolean d;
    public final boolean e;
    public final /* synthetic */ Method f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ f9i h;
    public final /* synthetic */ xd8 i;
    public final /* synthetic */ dbi j;
    public final /* synthetic */ boolean k;
    public final /* synthetic */ boolean l;

    public rce(String str, Field field, boolean z, boolean z2, Method method, boolean z3, f9i f9iVar, xd8 xd8Var, dbi dbiVar, boolean z4, boolean z5) {
        this.f = method;
        this.g = z3;
        this.h = f9iVar;
        this.i = xd8Var;
        this.j = dbiVar;
        this.k = z4;
        this.l = z5;
        this.a = str;
        this.b = field;
        this.c = field.getName();
        this.d = z;
        this.e = z2;
    }

    public final void a(JsonWriter jsonWriter, Object obj) throws IllegalAccessException {
        Object objInvoke;
        if (this.d) {
            Method method = this.f;
            if (method != null) {
                try {
                    objInvoke = method.invoke(obj, null);
                } catch (InvocationTargetException e) {
                    throw new JsonIOException(ij0.j("Accessor ", oce.d(method, false), " threw exception"), e.getCause());
                }
            } else {
                objInvoke = this.b.get(obj);
            }
            if (objInvoke == obj) {
                return;
            }
            jsonWriter.name(this.a);
            boolean z = this.g;
            f9i ftaVar = this.h;
            if (!z) {
                ftaVar = new fta(this.i, ftaVar, this.j.b);
            }
            ftaVar.b(jsonWriter, objInvoke);
        }
    }
}
