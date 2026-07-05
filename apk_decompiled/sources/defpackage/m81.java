package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class m81 extends h95 {
    public final Context a;
    public final wp3 b;
    public final wp3 c;
    public final String d;

    public m81(Context context, wp3 wp3Var, wp3 wp3Var2, String str) {
        if (context == null) {
            mr9.h("Null applicationContext");
            throw null;
        }
        this.a = context;
        if (wp3Var == null) {
            mr9.h("Null wallClock");
            throw null;
        }
        this.b = wp3Var;
        if (wp3Var2 == null) {
            mr9.h("Null monotonicClock");
            throw null;
        }
        this.c = wp3Var2;
        if (str != null) {
            this.d = str;
        } else {
            mr9.h("Null backendName");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h95) {
            m81 m81Var = (m81) ((h95) obj);
            if (this.a.equals(m81Var.a) && this.b.equals(m81Var.b) && this.c.equals(m81Var.c) && this.d.equals(m81Var.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode() ^ ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CreationContext{applicationContext=");
        sb.append(this.a);
        sb.append(", wallClock=");
        sb.append(this.b);
        sb.append(", monotonicClock=");
        sb.append(this.c);
        sb.append(", backendName=");
        return ij0.m(sb, this.d, "}");
    }
}
