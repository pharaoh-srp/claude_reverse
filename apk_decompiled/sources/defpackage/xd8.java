package defpackage;

import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.google.gson.stream.MalformedJsonException;
import java.io.EOFException;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

/* JADX INFO: loaded from: classes.dex */
public final class xd8 {
    public final ThreadLocal a = new ThreadLocal();
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    public final nyj c;
    public final v44 d;
    public final List e;
    public final boolean f;

    public xd8(f57 f57Var, HashMap map, ArrayList arrayList, ArrayList arrayList2) {
        nyj nyjVar = new nyj(map, 15, arrayList2);
        this.c = nyjVar;
        int i = 1;
        this.f = true;
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add(n9i.A);
        arrayList3.add(bbc.b);
        arrayList3.add(f57Var);
        arrayList3.addAll(arrayList);
        arrayList3.add(n9i.p);
        arrayList3.add(n9i.g);
        arrayList3.add(n9i.d);
        arrayList3.add(n9i.e);
        arrayList3.add(n9i.f);
        eac eacVar = n9i.k;
        arrayList3.add(new vce(Long.TYPE, Long.class, eacVar));
        arrayList3.add(new vce(Double.TYPE, Double.class, new eac(i)));
        int i2 = 2;
        arrayList3.add(new vce(Float.TYPE, Float.class, new eac(i2)));
        arrayList3.add(eac.b);
        arrayList3.add(n9i.h);
        arrayList3.add(n9i.i);
        int i3 = 3;
        int i4 = 0;
        arrayList3.add(new h9i(AtomicLong.class, new ajg(new ajg(eacVar, i), i3), i4));
        arrayList3.add(new h9i(AtomicLongArray.class, new ajg(new ajg(eacVar, i2), i3), i4));
        arrayList3.add(n9i.j);
        arrayList3.add(n9i.l);
        arrayList3.add(n9i.q);
        arrayList3.add(n9i.r);
        arrayList3.add(new h9i(BigDecimal.class, n9i.m, i4));
        arrayList3.add(new h9i(BigInteger.class, n9i.n, i4));
        arrayList3.add(new h9i(jw9.class, n9i.o, i4));
        arrayList3.add(n9i.s);
        arrayList3.add(n9i.t);
        arrayList3.add(n9i.v);
        arrayList3.add(n9i.w);
        arrayList3.add(n9i.y);
        arrayList3.add(n9i.u);
        arrayList3.add(n9i.b);
        arrayList3.add(zig.e);
        arrayList3.add(n9i.x);
        if (bjg.a) {
            arrayList3.add(bjg.c);
            arrayList3.add(bjg.b);
            arrayList3.add(bjg.d);
        }
        arrayList3.add(kp0.d);
        arrayList3.add(n9i.a);
        arrayList3.add(new v44(nyjVar, i4));
        arrayList3.add(new v44(nyjVar, i2));
        v44 v44Var = new v44(nyjVar, i);
        this.d = v44Var;
        arrayList3.add(v44Var);
        arrayList3.add(n9i.B);
        arrayList3.add(new vce(nyjVar, f57Var, v44Var, arrayList2));
        this.e = Collections.unmodifiableList(arrayList3);
    }

    public static void a(double d) {
        if (Double.isNaN(d) || Double.isInfinite(d)) {
            throw new IllegalArgumentException(d + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        }
    }

    public final Object b(Class cls, String str) {
        Object objA;
        dbi dbiVar = new dbi(cls);
        JsonReader jsonReader = new JsonReader(new StringReader(str));
        boolean z = false;
        jsonReader.setLenient(false);
        boolean zIsLenient = jsonReader.isLenient();
        jsonReader.setLenient(true);
        try {
            try {
                try {
                    jsonReader.peek();
                } catch (EOFException e) {
                    e = e;
                    z = true;
                }
                try {
                    objA = c(dbiVar).a(jsonReader);
                } catch (EOFException e2) {
                    e = e2;
                    if (!z) {
                        throw new JsonSyntaxException(e);
                    }
                    jsonReader.setLenient(zIsLenient);
                    objA = null;
                }
                if (objA != null) {
                    try {
                        if (jsonReader.peek() != JsonToken.END_DOCUMENT) {
                            throw new JsonSyntaxException("JSON document was not fully consumed.");
                        }
                    } catch (MalformedJsonException e3) {
                        throw new JsonSyntaxException(e3);
                    } catch (IOException e4) {
                        throw new JsonIOException(e4);
                    }
                }
                if (cls == Integer.TYPE) {
                    cls = Integer.class;
                } else if (cls == Float.TYPE) {
                    cls = Float.class;
                } else if (cls == Byte.TYPE) {
                    cls = Byte.class;
                } else if (cls == Double.TYPE) {
                    cls = Double.class;
                } else if (cls == Long.TYPE) {
                    cls = Long.class;
                } else if (cls == Character.TYPE) {
                    cls = Character.class;
                } else if (cls == Boolean.TYPE) {
                    cls = Boolean.class;
                } else if (cls == Short.TYPE) {
                    cls = Short.class;
                } else if (cls == Void.TYPE) {
                    cls = Void.class;
                }
                return cls.cast(objA);
            } catch (IOException e5) {
                throw new JsonSyntaxException(e5);
            } catch (AssertionError e6) {
                throw new AssertionError("AssertionError (GSON 2.10.1): " + e6.getMessage(), e6);
            } catch (IllegalStateException e7) {
                throw new JsonSyntaxException(e7);
            }
        } finally {
            jsonReader.setLenient(zIsLenient);
        }
    }

    public final f9i c(dbi dbiVar) {
        boolean z;
        ConcurrentHashMap concurrentHashMap = this.b;
        f9i f9iVar = (f9i) concurrentHashMap.get(dbiVar);
        if (f9iVar != null) {
            return f9iVar;
        }
        ThreadLocal threadLocal = this.a;
        Map map = (Map) threadLocal.get();
        if (map == null) {
            map = new HashMap();
            threadLocal.set(map);
            z = true;
        } else {
            f9i f9iVar2 = (f9i) map.get(dbiVar);
            if (f9iVar2 != null) {
                return f9iVar2;
            }
            z = false;
        }
        try {
            wd8 wd8Var = new wd8();
            wd8Var.a = null;
            map.put(dbiVar, wd8Var);
            Iterator it = this.e.iterator();
            f9i f9iVarA = null;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                f9iVarA = ((g9i) it.next()).a(this, dbiVar);
                if (f9iVarA != null) {
                    if (wd8Var.a != null) {
                        throw new AssertionError("Delegate is already set");
                    }
                    wd8Var.a = f9iVarA;
                    map.put(dbiVar, f9iVarA);
                }
            }
            if (z) {
                threadLocal.remove();
            }
            if (f9iVarA == null) {
                xh6.k("GSON (2.10.1) cannot handle ", dbiVar);
                return null;
            }
            if (z) {
                concurrentHashMap.putAll(map);
            }
            return f9iVarA;
        } catch (Throwable th) {
            if (z) {
                threadLocal.remove();
            }
            throw th;
        }
    }

    public final JsonWriter d(Writer writer) {
        JsonWriter jsonWriter = new JsonWriter(writer);
        jsonWriter.setHtmlSafe(this.f);
        jsonWriter.setLenient(false);
        jsonWriter.setSerializeNulls(false);
        return jsonWriter;
    }

    public final String e(Object obj) {
        if (obj == null) {
            StringWriter stringWriter = new StringWriter();
            try {
                f(d(stringWriter));
                return stringWriter.toString();
            } catch (IOException e) {
                throw new JsonIOException(e);
            }
        }
        Class cls = obj.getClass();
        StringWriter stringWriter2 = new StringWriter();
        try {
            g(obj, cls, d(stringWriter2));
            return stringWriter2.toString();
        } catch (IOException e2) {
            throw new JsonIOException(e2);
        }
    }

    public final void f(JsonWriter jsonWriter) {
        oh9 oh9Var = oh9.E;
        boolean zIsLenient = jsonWriter.isLenient();
        jsonWriter.setLenient(true);
        boolean zIsHtmlSafe = jsonWriter.isHtmlSafe();
        jsonWriter.setHtmlSafe(this.f);
        boolean serializeNulls = jsonWriter.getSerializeNulls();
        jsonWriter.setSerializeNulls(false);
        try {
            try {
                try {
                    h9i h9iVar = n9i.a;
                    eac.e(jsonWriter, oh9Var);
                    jsonWriter.setLenient(zIsLenient);
                    jsonWriter.setHtmlSafe(zIsHtmlSafe);
                    jsonWriter.setSerializeNulls(serializeNulls);
                } catch (AssertionError e) {
                    throw new AssertionError("AssertionError (GSON 2.10.1): " + e.getMessage(), e);
                }
            } catch (IOException e2) {
                throw new JsonIOException(e2);
            }
        } catch (Throwable th) {
            jsonWriter.setLenient(zIsLenient);
            jsonWriter.setHtmlSafe(zIsHtmlSafe);
            jsonWriter.setSerializeNulls(serializeNulls);
            throw th;
        }
    }

    public final void g(Object obj, Class cls, JsonWriter jsonWriter) {
        f9i f9iVarC = c(new dbi(cls));
        boolean zIsLenient = jsonWriter.isLenient();
        jsonWriter.setLenient(true);
        boolean zIsHtmlSafe = jsonWriter.isHtmlSafe();
        jsonWriter.setHtmlSafe(this.f);
        boolean serializeNulls = jsonWriter.getSerializeNulls();
        jsonWriter.setSerializeNulls(false);
        try {
            try {
                f9iVarC.b(jsonWriter, obj);
            } catch (IOException e) {
                throw new JsonIOException(e);
            } catch (AssertionError e2) {
                throw new AssertionError("AssertionError (GSON 2.10.1): " + e2.getMessage(), e2);
            }
        } finally {
            jsonWriter.setLenient(zIsLenient);
            jsonWriter.setHtmlSafe(zIsHtmlSafe);
            jsonWriter.setSerializeNulls(serializeNulls);
        }
    }

    public final String toString() {
        return "{serializeNulls:false,factories:" + this.e + ",instanceCreators:" + this.c + "}";
    }
}
