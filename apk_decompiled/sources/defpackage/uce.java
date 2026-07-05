package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;
import com.google.gson.JsonParseException;
import com.google.gson.stream.JsonReader;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class uce extends sce {
    public static final HashMap e;
    public final Constructor b;
    public final Object[] c;
    public final HashMap d;

    static {
        HashMap map = new HashMap();
        map.put(Byte.TYPE, (byte) 0);
        map.put(Short.TYPE, (short) 0);
        map.put(Integer.TYPE, 0);
        map.put(Long.TYPE, 0L);
        map.put(Float.TYPE, Float.valueOf(MTTypesetterKt.kLineSkipLimitMultiplier));
        map.put(Double.TYPE, Double.valueOf(0.0d));
        map.put(Character.TYPE, (char) 0);
        map.put(Boolean.TYPE, Boolean.FALSE);
        e = map;
    }

    public uce(Class cls, LinkedHashMap linkedHashMap) {
        super(linkedHashMap);
        this.d = new HashMap();
        nai naiVar = oce.a;
        Constructor constructorF = naiVar.F(cls);
        this.b = constructorF;
        oce.e(constructorF);
        String[] strArrG = naiVar.G(cls);
        for (int i = 0; i < strArrG.length; i++) {
            this.d.put(strArrG[i], Integer.valueOf(i));
        }
        Class<?>[] parameterTypes = this.b.getParameterTypes();
        this.c = new Object[parameterTypes.length];
        for (int i2 = 0; i2 < parameterTypes.length; i2++) {
            this.c[i2] = e.get(parameterTypes[i2]);
        }
    }

    @Override // defpackage.sce
    public final Object c() {
        return (Object[]) this.c.clone();
    }

    @Override // defpackage.sce
    public final Object d(Object obj) {
        Object[] objArr = (Object[]) obj;
        Constructor constructor = this.b;
        try {
            return constructor.newInstance(objArr);
        } catch (IllegalAccessException e2) {
            nai naiVar = oce.a;
            xh6.f("Unexpected IllegalAccessException occurred (Gson 2.10.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e2);
            return null;
        } catch (IllegalArgumentException e3) {
            e = e3;
            throw new RuntimeException("Failed to invoke constructor '" + oce.b(constructor) + "' with args " + Arrays.toString(objArr), e);
        } catch (InstantiationException e4) {
            e = e4;
            throw new RuntimeException("Failed to invoke constructor '" + oce.b(constructor) + "' with args " + Arrays.toString(objArr), e);
        } catch (InvocationTargetException e5) {
            xh6.f("Failed to invoke constructor '" + oce.b(constructor) + "' with args " + Arrays.toString(objArr), e5.getCause());
            return null;
        }
    }

    @Override // defpackage.sce
    public final void e(Object obj, JsonReader jsonReader, rce rceVar) {
        Object[] objArr = (Object[]) obj;
        String str = rceVar.c;
        Integer num = (Integer) this.d.get(str);
        if (num == null) {
            throw new IllegalStateException("Could not find the index in the constructor '" + oce.b(this.b) + "' for field with name '" + str + "', unable to determine which argument in the constructor the field corresponds to. This is unexpected behavior, as we expect the RecordComponents to have the same names as the fields in the Java class, and that the order of the RecordComponents is the same as the order of the canonical constructor parameters.");
        }
        int iIntValue = num.intValue();
        Object objA = rceVar.h.a(jsonReader);
        if (objA != null || !rceVar.k) {
            objArr[iIntValue] = objA;
        } else {
            StringBuilder sbX = sq6.x("null is not allowed as value for record component '", str, "' of primitive type; at path ");
            sbX.append(jsonReader.getPath());
            throw new JsonParseException(sbX.toString());
        }
    }
}
