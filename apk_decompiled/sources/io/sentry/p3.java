package io.sentry;

import java.io.Closeable;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes3.dex */
public interface p3 extends Closeable {
    Long A();

    ArrayList E0(a1 a1Var, z1 z1Var);

    TimeZone G(a1 a1Var);

    String I();

    HashMap M(a1 a1Var, z1 z1Var);

    Double U();

    Date a0(a1 a1Var);

    void beginArray();

    void beginObject();

    Boolean d0();

    void endArray();

    void endObject();

    boolean hasNext();

    Float n0();

    double nextDouble();

    float nextFloat();

    int nextInt();

    long nextLong();

    String nextName();

    String nextString();

    Object o0(a1 a1Var, z1 z1Var);

    io.sentry.vendor.gson.stream.b peek();

    void setLenient(boolean z);

    void skipValue();

    Integer v();

    Object v0();

    void z(a1 a1Var, AbstractMap abstractMap, String str);
}
