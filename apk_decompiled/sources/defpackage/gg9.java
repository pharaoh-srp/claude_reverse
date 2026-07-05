package defpackage;

import com.squareup.moshi.JsonDataException;
import java.io.IOException;
import okio.Buffer;
import okio.BufferedSink;
import okio.BufferedSource;

/* JADX INFO: loaded from: classes.dex */
public abstract class gg9 {
    public final gg9 failOnUnknown() {
        return new dg9(this, 2);
    }

    public abstract Object fromJson(ci9 ci9Var);

    public final Object fromJson(String str) {
        Buffer buffer = new Buffer();
        buffer.T0(str);
        bj9 bj9VarI = ci9.i(buffer);
        Object objFromJson = fromJson(bj9VarI);
        if (isLenient() || bj9VarI.j() == bi9.N) {
            return objFromJson;
        }
        throw new JsonDataException("JSON document was not fully consumed.");
    }

    public final Object fromJsonValue(Object obj) {
        try {
            return fromJson(new hj9(obj));
        } catch (IOException e) {
            sz6.h(e);
            return null;
        }
    }

    public gg9 indent(String str) {
        if (str != null) {
            return new eg9(this, str);
        }
        mr9.h("indent == null");
        return null;
    }

    public boolean isLenient() {
        return false;
    }

    public final gg9 lenient() {
        return new dg9(this, 1);
    }

    public final gg9 nonNull() {
        return this instanceof g6c ? this : new g6c(this);
    }

    public final gg9 nullSafe() {
        return this instanceof k9c ? this : new k9c(this);
    }

    public final gg9 serializeNulls() {
        return new dg9(this, 0);
    }

    public final String toJson(Object obj) {
        Buffer buffer = new Buffer();
        try {
            toJson(buffer, obj);
            return buffer.t0();
        } catch (IOException e) {
            sz6.h(e);
            return null;
        }
    }

    public abstract void toJson(jj9 jj9Var, Object obj);

    public final Object toJsonValue(Object obj) {
        ij9 ij9Var = new ij9();
        try {
            toJson(ij9Var, obj);
            return ij9Var.D0();
        } catch (IOException e) {
            sz6.h(e);
            return null;
        }
    }

    public final void toJson(BufferedSink bufferedSink, Object obj) {
        toJson(jj9.H(bufferedSink), obj);
    }

    public final Object fromJson(BufferedSource bufferedSource) {
        return fromJson(ci9.i(bufferedSource));
    }
}
