package defpackage;

import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.io.StringWriter;

/* JADX INFO: loaded from: classes.dex */
public abstract class bh9 {
    public boolean a() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public int b() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public final ig9 e() {
        if (this instanceof ig9) {
            return (ig9) this;
        }
        xh6.m("Not a JSON Array: ", this);
        return null;
    }

    public final qh9 g() {
        if (this instanceof qh9) {
            return (qh9) this;
        }
        xh6.m("Not a JSON Object: ", this);
        return null;
    }

    public final vh9 h() {
        if (this instanceof vh9) {
            return (vh9) this;
        }
        xh6.m("Not a JSON Primitive: ", this);
        return null;
    }

    public long k() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public Number l() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public String m() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public final String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            JsonWriter jsonWriter = new JsonWriter(stringWriter);
            jsonWriter.setLenient(true);
            h9i h9iVar = n9i.a;
            eac.e(jsonWriter, this);
            return stringWriter.toString();
        } catch (IOException e) {
            sz6.h(e);
            return null;
        }
    }
}
