package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.ProviderInfo;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule$LoadingException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes.dex */
public final class si6 {
    public static final f7i b;
    public static final byi c;
    public static Boolean e = null;
    public static String f = null;
    public static boolean g = false;
    public static int h = -1;
    public static Boolean i;
    public static s1l m;
    public static p2l n;
    public final Context a;
    public static final ThreadLocal j = new ThreadLocal();
    public static final w60 k = new w60(5);
    public static final byi l = new byi(11);
    public static final s4i d = new s4i(15);

    static {
        int i2 = 14;
        b = new f7i(i2);
        c = new byi(i2);
    }

    public si6(Context context) {
        this.a = context;
    }

    public static int a(Context context, String str) {
        try {
            ClassLoader classLoader = context.getApplicationContext().getClassLoader();
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 61);
            sb.append("com.google.android.gms.dynamite.descriptors.");
            sb.append(str);
            sb.append(".ModuleDescriptor");
            Class<?> clsLoadClass = classLoader.loadClass(sb.toString());
            Field declaredField = clsLoadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = clsLoadClass.getDeclaredField("MODULE_VERSION");
            if (gb9.v(declaredField.get(null), str)) {
                return declaredField2.getInt(null);
            }
            String strValueOf = String.valueOf(declaredField.get(null));
            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 50 + String.valueOf(str).length() + 1);
            sb2.append("Module descriptor id '");
            sb2.append(strValueOf);
            sb2.append("' didn't match expected id '");
            sb2.append(str);
            sb2.append("'");
            Log.e("DynamiteModule", sb2.toString());
            return 0;
        } catch (ClassNotFoundException unused) {
            StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 45);
            sb3.append("Local module descriptor class for ");
            sb3.append(str);
            sb3.append(" not found.");
            Log.w("DynamiteModule", sb3.toString());
            return 0;
        } catch (Exception e2) {
            Log.e("DynamiteModule", "Failed to load module descriptor class: ".concat(String.valueOf(e2.getMessage())));
            return 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:135:0x030b A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0311 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:139:0x031a A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00cb A[Catch: all -> 0x00c0, TRY_LEAVE, TryCatch #0 {all -> 0x00c0, blocks: (B:5:0x0042, B:9:0x00b9, B:16:0x00c5, B:19:0x00cb, B:31:0x00f8, B:119:0x02a1, B:120:0x02ab, B:128:0x02ba, B:130:0x02e2, B:132:0x02f3, B:142:0x0323, B:143:0x032a, B:123:0x02ae, B:124:0x02af, B:125:0x02b6, B:144:0x032b, B:145:0x034b, B:146:0x034c, B:147:0x039d), top: B:159:0x0042 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00f5  */
    /* JADX WARN: Type inference failed for: r30v0, types: [ri6] */
    /* JADX WARN: Type inference failed for: r6v2, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v7, types: [android.content.Context] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.si6 c(android.content.Context r29, defpackage.ri6 r30, java.lang.String r31) throws com.google.android.gms.dynamite.DynamiteModule$LoadingException {
        /*
            Method dump skipped, instruction units count: 962
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.si6.c(android.content.Context, ri6, java.lang.String):si6");
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0188 A[Catch: all -> 0x00f4, TRY_ENTER, TRY_LEAVE, TryCatch #8 {all -> 0x00f4, blocks: (B:4:0x0006, B:64:0x00e9, B:66:0x00ef, B:74:0x011d, B:104:0x0188, B:112:0x019d, B:130:0x01fc, B:131:0x01ff, B:125:0x01f3, B:72:0x00fa, B:133:0x0201, B:5:0x0007, B:8:0x000e, B:9:0x002a, B:62:0x00e6, B:22:0x004e, B:45:0x00a5, B:48:0x00a8, B:55:0x00c0, B:63:0x00e8, B:61:0x00c6), top: B:143:0x0006, inners: #5, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x019d A[Catch: all -> 0x00f4, TRY_ENTER, TRY_LEAVE, TryCatch #8 {all -> 0x00f4, blocks: (B:4:0x0006, B:64:0x00e9, B:66:0x00ef, B:74:0x011d, B:104:0x0188, B:112:0x019d, B:130:0x01fc, B:131:0x01ff, B:125:0x01f3, B:72:0x00fa, B:133:0x0201, B:5:0x0007, B:8:0x000e, B:9:0x002a, B:62:0x00e6, B:22:0x004e, B:45:0x00a5, B:48:0x00a8, B:55:0x00c0, B:63:0x00e8, B:61:0x00c6), top: B:143:0x0006, inners: #5, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b4 A[Catch: all -> 0x003b, TryCatch #11 {, blocks: (B:10:0x002b, B:12:0x0037, B:52:0x00bd, B:17:0x0040, B:19:0x0047, B:21:0x004d, B:26:0x0054, B:28:0x0058, B:31:0x0061, B:33:0x0069, B:36:0x0070, B:43:0x009c, B:44:0x00a4, B:39:0x0077, B:41:0x007d, B:42:0x008e, B:47:0x00a7, B:50:0x00aa, B:51:0x00b4, B:18:0x0043), top: B:147:0x002b, inners: #12 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int d(android.content.Context r13, java.lang.String r14, boolean r15) {
        /*
            Method dump skipped, instruction units count: 518
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.si6.d(android.content.Context, java.lang.String, boolean):int");
    }

    public static boolean e(Context context) {
        ApplicationInfo applicationInfo;
        Boolean bool = Boolean.TRUE;
        if (bool.equals(null) || bool.equals(i)) {
            return true;
        }
        boolean z = false;
        if (i == null) {
            ProviderInfo providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.chimera", Build.VERSION.SDK_INT >= 29 ? 268435456 : 0);
            if (g88.b.c(context, 10000000) == 0 && providerInfoResolveContentProvider != null && "com.google.android.gms".equals(providerInfoResolveContentProvider.packageName)) {
                z = true;
            }
            i = Boolean.valueOf(z);
            if (z && (applicationInfo = providerInfoResolveContentProvider.applicationInfo) != null && (applicationInfo.flags & 129) == 0) {
                Log.i("DynamiteModule", "Non-system-image GmsCore APK, forcing V1");
                g = true;
            }
        }
        if (!z) {
            Log.e("DynamiteModule", "Invalid GmsCore APK, remote loading disabled.");
        }
        return z;
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:124:0x00e7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x013a A[PHI: r3
      0x013a: PHI (r3v4 boolean) = (r3v3 boolean), (r3v6 boolean) binds: [B:58:0x00f1, B:83:0x0137] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int f(android.content.Context r14, java.lang.String r15, boolean r16, boolean r17) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 413
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.si6.f(android.content.Context, java.lang.String, boolean, boolean):int");
    }

    public static void g(ClassLoader classLoader) throws DynamiteModule$LoadingException {
        try {
            p2l p2lVar = null;
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(null).newInstance(null);
            if (iBinder != null) {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                p2lVar = iInterfaceQueryLocalInterface instanceof p2l ? (p2l) iInterfaceQueryLocalInterface : new p2l(iBinder);
            }
            n = p2lVar;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e2) {
            throw new DynamiteModule$LoadingException("Failed to instantiate dynamite loader", e2);
        }
    }

    public static s1l h(Context context) {
        s1l s1lVar;
        synchronized (si6.class) {
            s1l s1lVar2 = m;
            if (s1lVar2 != null) {
                return s1lVar2;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    s1lVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    s1lVar = iInterfaceQueryLocalInterface instanceof s1l ? (s1l) iInterfaceQueryLocalInterface : new s1l(iBinder);
                }
                if (s1lVar != null) {
                    m = s1lVar;
                    return s1lVar;
                }
            } catch (Exception e2) {
                String message = e2.getMessage();
                StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 45);
                sb.append("Failed to load IDynamiteLoader from GmsCore: ");
                sb.append(message);
                Log.e("DynamiteModule", sb.toString());
            }
            return null;
        }
    }

    public final IBinder b(String str) throws DynamiteModule$LoadingException {
        try {
            return (IBinder) this.a.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e2) {
            throw new DynamiteModule$LoadingException("Failed to instantiate module class: ".concat(str), e2);
        }
    }
}
