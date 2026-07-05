package defpackage;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class lbi extends qwk {
    public static Class q = null;
    public static Constructor r = null;
    public static Method s = null;
    public static Method t = null;
    public static boolean u = false;
    public final Class j;
    public final Constructor k;
    public final Method l;
    public final Method m;
    public final Method n;
    public final Method o;
    public final Method p;

    public lbi() throws NoSuchMethodException {
        Method methodT;
        Constructor<?> constructor;
        Method methodS;
        Method method;
        Method method2;
        Method method3;
        Class<?> cls = null;
        try {
            Class<?> cls2 = Class.forName("android.graphics.FontFamily");
            constructor = cls2.getConstructor(null);
            methodS = s(cls2);
            Class cls3 = Integer.TYPE;
            method = cls2.getMethod("addFontFromBuffer", ByteBuffer.class, cls3, FontVariationAxis[].class, cls3, cls3);
            method2 = cls2.getMethod("freeze", null);
            method3 = cls2.getMethod("abortCreation", null);
            methodT = t(cls2);
            cls = cls2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class ".concat(e.getClass().getName()), e);
            methodT = null;
            constructor = null;
            methodS = null;
            method = null;
            method2 = null;
            method3 = null;
        }
        this.j = cls;
        this.k = constructor;
        this.l = methodS;
        this.m = method;
        this.n = method2;
        this.o = method3;
        this.p = methodT;
    }

    public static boolean o(String str, boolean z, int i, Object obj) throws NoSuchMethodException {
        r();
        try {
            return ((Boolean) s.invoke(obj, str, Integer.valueOf(i), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            xh6.h(e);
            return false;
        }
    }

    public static void r() throws NoSuchMethodException {
        Method method;
        Class<?> cls;
        Method method2;
        if (u) {
            return;
        }
        u = true;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi21Impl", e.getClass().getName(), e);
            method = null;
            cls = null;
            method2 = null;
        }
        r = constructor;
        q = cls;
        s = method2;
        t = method;
    }

    public static Method s(Class cls) {
        Class cls2 = Boolean.TYPE;
        Class cls3 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls3, cls2, cls3, cls3, cls3, FontVariationAxis[].class);
    }

    @Override // defpackage.qwk
    public final Typeface f(Context context, qu7 qu7Var, Resources resources, int i) throws IllegalAccessException, NoSuchMethodException, InstantiationException, InvocationTargetException {
        Object objNewInstance;
        InputStream inputStreamOpenRawResource;
        ru7[] ru7VarArr = qu7Var.a;
        Method method = this.l;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        int i2 = 0;
        if (method == null) {
            r();
            try {
                Object objNewInstance2 = r.newInstance(null);
                for (ru7 ru7Var : ru7VarArr) {
                    File fileN = rwk.n(context);
                    if (fileN != null) {
                        try {
                            try {
                                inputStreamOpenRawResource = resources.openRawResource(ru7Var.f);
                                try {
                                    boolean zK = rwk.k(fileN, inputStreamOpenRawResource);
                                    if (inputStreamOpenRawResource != null) {
                                        try {
                                            inputStreamOpenRawResource.close();
                                        } catch (IOException unused) {
                                        }
                                    }
                                    if (!zK) {
                                        fileN.delete();
                                        return null;
                                    }
                                    if (!o(fileN.getPath(), ru7Var.c, ru7Var.b, objNewInstance2)) {
                                        fileN.delete();
                                        return null;
                                    }
                                    fileN.delete();
                                } catch (Throwable th) {
                                    th = th;
                                    Throwable th2 = th;
                                    if (inputStreamOpenRawResource == null) {
                                        throw th2;
                                    }
                                    try {
                                        inputStreamOpenRawResource.close();
                                        throw th2;
                                    } catch (IOException unused2) {
                                        throw th2;
                                    }
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                inputStreamOpenRawResource = null;
                            }
                        } catch (RuntimeException unused3) {
                            fileN.delete();
                            return null;
                        } catch (Throwable th4) {
                            fileN.delete();
                            throw th4;
                        }
                    }
                }
                r();
                try {
                    Object objNewInstance3 = Array.newInstance((Class<?>) q, 1);
                    Array.set(objNewInstance3, 0, objNewInstance2);
                    return (Typeface) t.invoke(null, objNewInstance3);
                } catch (IllegalAccessException | InvocationTargetException e) {
                    xh6.h(e);
                    return null;
                }
            } catch (IllegalAccessException | InstantiationException | InvocationTargetException e2) {
                xh6.h(e2);
                return null;
            }
        }
        try {
            objNewInstance = this.k.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused4) {
            objNewInstance = null;
        }
        if (objNewInstance != null) {
            int length = ru7VarArr.length;
            while (true) {
                if (i2 < length) {
                    ru7 ru7Var2 = ru7VarArr[i2];
                    lbi lbiVar = this;
                    Context context2 = context;
                    if (lbiVar.n(context2, objNewInstance, ru7Var2.a, ru7Var2.e, ru7Var2.b, ru7Var2.c ? 1 : 0, FontVariationAxis.fromFontVariationSettings(ru7Var2.d))) {
                        i2++;
                        this = lbiVar;
                        context = context2;
                    } else {
                        try {
                            lbiVar.o.invoke(objNewInstance, null);
                            break;
                        } catch (IllegalAccessException | InvocationTargetException unused5) {
                        }
                    }
                } else {
                    lbi lbiVar2 = this;
                    if (lbiVar2.q(objNewInstance)) {
                        return lbiVar2.p(objNewInstance);
                    }
                }
            }
        }
        return null;
    }

    @Override // defpackage.qwk
    public final Typeface g(Context context, jv7[] jv7VarArr, int i) throws IOException {
        Object objNewInstance;
        Typeface typefaceP;
        boolean zBooleanValue;
        if (jv7VarArr.length >= 1) {
            Method method = this.l;
            if (method == null) {
                Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
            }
            try {
                if (method != null) {
                    HashMap map = new HashMap();
                    for (jv7 jv7Var : jv7VarArr) {
                        if (jv7Var.f == 0) {
                            Uri uri = jv7Var.a;
                            if (!map.containsKey(uri)) {
                                map.put(uri, rwk.o(context, uri));
                            }
                        }
                    }
                    Map mapUnmodifiableMap = Collections.unmodifiableMap(map);
                    try {
                        objNewInstance = this.k.newInstance(null);
                    } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
                        objNewInstance = null;
                    }
                    if (objNewInstance != null) {
                        int length = jv7VarArr.length;
                        int i2 = 0;
                        boolean z = false;
                        while (true) {
                            Method method2 = this.o;
                            if (i2 < length) {
                                jv7 jv7Var2 = jv7VarArr[i2];
                                ByteBuffer byteBuffer = (ByteBuffer) mapUnmodifiableMap.get(jv7Var2.a);
                                if (byteBuffer != null) {
                                    try {
                                        zBooleanValue = ((Boolean) this.m.invoke(objNewInstance, byteBuffer, Integer.valueOf(jv7Var2.b), null, Integer.valueOf(jv7Var2.c), Integer.valueOf(jv7Var2.d ? 1 : 0))).booleanValue();
                                    } catch (IllegalAccessException | InvocationTargetException unused2) {
                                        zBooleanValue = false;
                                    }
                                    if (!zBooleanValue) {
                                        method2.invoke(objNewInstance, null);
                                        break;
                                    }
                                    z = true;
                                }
                                i2++;
                                z = z;
                            } else if (!z) {
                                method2.invoke(objNewInstance, null);
                            } else if (q(objNewInstance) && (typefaceP = p(objNewInstance)) != null) {
                                return Typeface.create(typefaceP, i);
                            }
                        }
                    }
                } else {
                    int i3 = (i & 1) == 0 ? 400 : 700;
                    boolean z2 = (i & 2) != 0;
                    int i4 = Integer.MAX_VALUE;
                    jv7 jv7Var3 = null;
                    for (jv7 jv7Var4 : jv7VarArr) {
                        int iAbs = (Math.abs(jv7Var4.c - i3) * 2) + (jv7Var4.d == z2 ? 0 : 1);
                        if (jv7Var3 == null || i4 > iAbs) {
                            jv7Var3 = jv7Var4;
                            i4 = iAbs;
                        }
                    }
                    ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(jv7Var3.a, "r", null);
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        try {
                            Typeface typefaceBuild = new Typeface.Builder(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor()).setWeight(jv7Var3.c).setItalic(jv7Var3.d).build();
                            parcelFileDescriptorOpenFileDescriptor.close();
                            return typefaceBuild;
                        } finally {
                        }
                    }
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        parcelFileDescriptorOpenFileDescriptor.close();
                        return null;
                    }
                }
            } catch (IOException | IllegalAccessException | InvocationTargetException unused3) {
            }
        }
        return null;
    }

    @Override // defpackage.qwk
    public final Typeface i(Context context, Resources resources, int i, String str) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        Object objNewInstance;
        InputStream inputStreamOpenRawResource;
        Method method = this.l;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (method != null) {
            try {
                objNewInstance = this.k.newInstance(null);
            } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
                objNewInstance = null;
            }
            if (objNewInstance != null) {
                if (!n(context, objNewInstance, str, 0, -1, -1, null)) {
                    try {
                        this.o.invoke(objNewInstance, null);
                    } catch (IllegalAccessException | InvocationTargetException unused2) {
                    }
                } else if (q(objNewInstance)) {
                    return p(objNewInstance);
                }
            }
        } else {
            File fileN = rwk.n(context);
            try {
                if (fileN != null) {
                    try {
                        inputStreamOpenRawResource = resources.openRawResource(i);
                        try {
                            boolean zK = rwk.k(fileN, inputStreamOpenRawResource);
                            if (inputStreamOpenRawResource != null) {
                                try {
                                    inputStreamOpenRawResource.close();
                                } catch (IOException unused3) {
                                }
                            }
                            if (!zK) {
                                fileN.delete();
                                return null;
                            }
                            Typeface typefaceCreateFromFile = Typeface.createFromFile(fileN.getPath());
                            fileN.delete();
                            return typefaceCreateFromFile;
                        } catch (Throwable th) {
                            th = th;
                            Throwable th2 = th;
                            if (inputStreamOpenRawResource == null) {
                                throw th2;
                            }
                            try {
                                inputStreamOpenRawResource.close();
                                throw th2;
                            } catch (IOException unused4) {
                                throw th2;
                            }
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        inputStreamOpenRawResource = null;
                    }
                }
            } catch (RuntimeException unused5) {
                fileN.delete();
                return null;
            } catch (Throwable th4) {
                fileN.delete();
                throw th4;
            }
        }
        return null;
    }

    public final boolean n(Context context, Object obj, String str, int i, int i2, int i3, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.l.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Typeface p(Object obj) {
        try {
            Object objNewInstance = Array.newInstance((Class<?>) this.j, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) this.p.invoke(null, objNewInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean q(Object obj) {
        try {
            return ((Boolean) this.n.invoke(obj, null)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Method t(Class cls) throws NoSuchMethodException {
        Class<?> cls2 = Array.newInstance((Class<?>) cls, 1).getClass();
        Class cls3 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", cls2, cls3, cls3);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
