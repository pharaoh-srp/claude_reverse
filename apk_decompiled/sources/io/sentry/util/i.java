package io.sentry.util;

import com.agog.mathdisplay.render.MTTypesetterKt;
import defpackage.xh6;
import io.sentry.a1;
import io.sentry.e0;
import io.sentry.p3;
import io.sentry.t5;
import io.sentry.z1;
import java.io.IOException;
import java.util.AbstractMap;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes3.dex */
public final class i implements p3 {
    public final ArrayDeque E;

    public i(Map map) {
        ArrayDeque arrayDeque = new ArrayDeque();
        this.E = arrayDeque;
        arrayDeque.addLast(new AbstractMap.SimpleEntry(null, map));
    }

    @Override // io.sentry.p3
    public final Long A() throws IOException {
        Object objC = c();
        if (objC instanceof Number) {
            return Long.valueOf(((Number) objC).longValue());
        }
        return null;
    }

    @Override // io.sentry.p3
    public final ArrayList E0(a1 a1Var, z1 z1Var) throws IOException {
        if (peek() == io.sentry.vendor.gson.stream.b.NULL) {
            if (c() == null) {
                return null;
            }
            e0.e("Expected null but was ", peek());
            return null;
        }
        try {
            beginArray();
            ArrayList arrayList = new ArrayList();
            while (peek() != io.sentry.vendor.gson.stream.b.END_ARRAY) {
                int size = this.E.size();
                try {
                    arrayList.add(z1Var.a(this, a1Var));
                } catch (Exception e) {
                    a1Var.d(t5.WARNING, "Failed to deserialize object in list.", e);
                    d(size);
                }
            }
            endArray();
            return arrayList;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    @Override // io.sentry.p3
    public final TimeZone G(a1 a1Var) {
        String str = (String) c();
        if (str != null) {
            return TimeZone.getTimeZone(str);
        }
        return null;
    }

    @Override // io.sentry.p3
    public final String I() {
        return (String) c();
    }

    @Override // io.sentry.p3
    public final HashMap M(a1 a1Var, z1 z1Var) throws IOException {
        if (peek() == io.sentry.vendor.gson.stream.b.NULL) {
            if (c() == null) {
                return null;
            }
            e0.e("Expected null but was ", peek());
            return null;
        }
        try {
            beginObject();
            HashMap map = new HashMap();
            if (peek() == io.sentry.vendor.gson.stream.b.NAME) {
                while (true) {
                    String strNextName = nextName();
                    int size = this.E.size();
                    try {
                        map.put(strNextName, z1Var.a(this, a1Var));
                    } catch (Exception e) {
                        a1Var.d(t5.WARNING, "Failed to deserialize object in map.", e);
                        d(size);
                    }
                    if (peek() != io.sentry.vendor.gson.stream.b.BEGIN_OBJECT && peek() != io.sentry.vendor.gson.stream.b.NAME) {
                        break;
                    }
                }
            }
            endObject();
            return map;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    @Override // io.sentry.p3
    public final Double U() throws IOException {
        Object objC = c();
        if (objC instanceof Number) {
            return Double.valueOf(((Number) objC).doubleValue());
        }
        return null;
    }

    @Override // io.sentry.p3
    public final Date a0(a1 a1Var) {
        String str = (String) c();
        if (str == null) {
            return null;
        }
        try {
            try {
                return io.sentry.p.m(str);
            } catch (Exception unused) {
                return io.sentry.p.n(str);
            }
        } catch (Exception e) {
            a1Var.d(t5.ERROR, "Error when deserializing millis timestamp format.", e);
            return null;
        }
    }

    @Override // io.sentry.p3
    public final void beginArray() throws IOException {
        ArrayDeque arrayDeque = this.E;
        Map.Entry entry = (Map.Entry) arrayDeque.peekLast();
        if (entry == null) {
            xh6.c("No more entries");
            return;
        }
        Object value = entry.getValue();
        if (!(value instanceof List)) {
            xh6.c("Current token is not an object");
            return;
        }
        arrayDeque.removeLast();
        arrayDeque.addLast(new AbstractMap.SimpleEntry(null, io.sentry.vendor.gson.stream.b.END_ARRAY));
        List list = (List) value;
        for (int size = list.size() - 1; size >= 0; size--) {
            arrayDeque.addLast(new AbstractMap.SimpleEntry(null, list.get(size)));
        }
    }

    @Override // io.sentry.p3
    public final void beginObject() throws IOException {
        ArrayDeque arrayDeque = this.E;
        Map.Entry entry = (Map.Entry) arrayDeque.peekLast();
        if (entry == null) {
            xh6.c("No more entries");
            return;
        }
        Object value = entry.getValue();
        if (!(value instanceof Map)) {
            xh6.c("Current token is not an object");
            return;
        }
        arrayDeque.removeLast();
        arrayDeque.addLast(new AbstractMap.SimpleEntry(null, io.sentry.vendor.gson.stream.b.END_OBJECT));
        Iterator it = ((Map) value).entrySet().iterator();
        while (it.hasNext()) {
            arrayDeque.addLast((Map.Entry) it.next());
        }
    }

    public final Object c() throws IOException {
        try {
            ArrayDeque arrayDeque = this.E;
            Map.Entry entry = (Map.Entry) arrayDeque.peekLast();
            if (entry == null) {
                return null;
            }
            Object value = entry.getValue();
            arrayDeque.removeLast();
            return value;
        } catch (Exception e) {
            throw new IOException(e);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.E.clear();
    }

    public final void d(int i) {
        while (true) {
            ArrayDeque arrayDeque = this.E;
            if (arrayDeque.isEmpty() || arrayDeque.size() < i) {
                return;
            } else {
                arrayDeque.removeLast();
            }
        }
    }

    @Override // io.sentry.p3
    public final Boolean d0() {
        return (Boolean) c();
    }

    @Override // io.sentry.p3
    public final void endArray() {
        ArrayDeque arrayDeque = this.E;
        if (arrayDeque.size() > 1) {
            arrayDeque.removeLast();
        }
    }

    @Override // io.sentry.p3
    public final void endObject() {
        ArrayDeque arrayDeque = this.E;
        if (arrayDeque.size() > 1) {
            arrayDeque.removeLast();
        }
    }

    @Override // io.sentry.p3
    public final boolean hasNext() {
        return !this.E.isEmpty();
    }

    @Override // io.sentry.p3
    public final Float n0() throws IOException {
        Object objC = c();
        if (objC instanceof Number) {
            return Float.valueOf(((Number) objC).floatValue());
        }
        return null;
    }

    @Override // io.sentry.p3
    public final double nextDouble() throws IOException {
        Object objC = c();
        if (objC instanceof Number) {
            return ((Number) objC).doubleValue();
        }
        xh6.c("Expected double");
        return 0.0d;
    }

    @Override // io.sentry.p3
    public final float nextFloat() throws IOException {
        Object objC = c();
        if (objC instanceof Number) {
            return ((Number) objC).floatValue();
        }
        xh6.c("Expected float");
        return MTTypesetterKt.kLineSkipLimitMultiplier;
    }

    @Override // io.sentry.p3
    public final int nextInt() throws IOException {
        Object objC = c();
        if (objC instanceof Number) {
            return ((Number) objC).intValue();
        }
        xh6.c("Expected int");
        return 0;
    }

    @Override // io.sentry.p3
    public final long nextLong() throws IOException {
        Object objC = c();
        if (objC instanceof Number) {
            return ((Number) objC).longValue();
        }
        xh6.c("Expected long");
        return 0L;
    }

    @Override // io.sentry.p3
    public final String nextName() throws IOException {
        Map.Entry entry = (Map.Entry) this.E.peekLast();
        if (entry != null && entry.getKey() != null) {
            return (String) entry.getKey();
        }
        e0.e("Expected a name but was ", peek());
        return null;
    }

    @Override // io.sentry.p3
    public final String nextString() throws IOException {
        String str = (String) c();
        if (str != null) {
            return str;
        }
        xh6.c("Expected string");
        return null;
    }

    @Override // io.sentry.p3
    public final Object o0(a1 a1Var, z1 z1Var) {
        ArrayDeque arrayDeque = this.E;
        Map.Entry entry = (Map.Entry) arrayDeque.peekLast();
        if (entry == null) {
            return null;
        }
        Object value = entry.getValue();
        if (a1Var != null) {
            return z1Var.a(this, a1Var);
        }
        arrayDeque.removeLast();
        return value;
    }

    @Override // io.sentry.p3
    public final io.sentry.vendor.gson.stream.b peek() {
        Map.Entry entry;
        ArrayDeque arrayDeque = this.E;
        if (!arrayDeque.isEmpty() && (entry = (Map.Entry) arrayDeque.peekLast()) != null) {
            if (entry.getKey() != null) {
                return io.sentry.vendor.gson.stream.b.NAME;
            }
            Object value = entry.getValue();
            return value instanceof Map ? io.sentry.vendor.gson.stream.b.BEGIN_OBJECT : value instanceof List ? io.sentry.vendor.gson.stream.b.BEGIN_ARRAY : value instanceof String ? io.sentry.vendor.gson.stream.b.STRING : value instanceof Number ? io.sentry.vendor.gson.stream.b.NUMBER : value instanceof Boolean ? io.sentry.vendor.gson.stream.b.BOOLEAN : value instanceof io.sentry.vendor.gson.stream.b ? (io.sentry.vendor.gson.stream.b) value : io.sentry.vendor.gson.stream.b.END_DOCUMENT;
        }
        return io.sentry.vendor.gson.stream.b.END_DOCUMENT;
    }

    @Override // io.sentry.p3
    public final void setLenient(boolean z) {
    }

    @Override // io.sentry.p3
    public final void skipValue() {
        ArrayDeque arrayDeque = this.E;
        if (arrayDeque.isEmpty()) {
            return;
        }
        arrayDeque.removeLast();
    }

    @Override // io.sentry.p3
    public final Integer v() throws IOException {
        Object objC = c();
        if (objC instanceof Number) {
            return Integer.valueOf(((Number) objC).intValue());
        }
        return null;
    }

    @Override // io.sentry.p3
    public final Object v0() {
        return c();
    }

    @Override // io.sentry.p3
    public final void z(a1 a1Var, AbstractMap abstractMap, String str) {
        int size = this.E.size();
        try {
            abstractMap.put(str, c());
        } catch (Exception e) {
            a1Var.b(t5.ERROR, e, "Error deserializing unknown key: %s", str);
            d(size);
        }
    }
}
