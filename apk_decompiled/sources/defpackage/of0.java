package defpackage;

import com.anthropic.claude.api.result.ApiResult;

/* JADX INFO: loaded from: classes.dex */
public final class of0 implements ApiResult {
    public final int a;
    public final Object b;

    public of0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final Object a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof of0)) {
            return false;
        }
        of0 of0Var = (of0) obj;
        return this.a == of0Var.a && x44.r(this.b, of0Var.b);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.a) * 31;
        Object obj = this.b;
        return iHashCode + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        return "Success(code=" + this.a + ", data=" + this.b + ")";
    }
}
