package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.inspector.WindowInspector;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class j8f {
    public static final Handler b;
    public static final o30 c;
    public final Context a;

    static {
        Handler handler = new Handler(Looper.getMainLooper());
        b = handler;
        c = new o30(handler);
    }

    public j8f(Context context) {
        this.a = context;
    }

    public static List c(View view) {
        try {
            if (Build.VERSION.SDK_INT >= 29) {
                List globalWindowViews = WindowInspector.getGlobalWindowViews();
                globalWindowViews.getClass();
                return globalWindowViews;
            }
            Class<?> cls = Class.forName("android.view.WindowManagerGlobal");
            Object objInvoke = cls.getMethod("getInstance", null).invoke(null, null);
            Field declaredField = cls.getDeclaredField("mViews");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(objInvoke);
            obj.getClass();
            return w44.p1((List) obj);
        } catch (Throwable th) {
            zfa.a.getClass();
            if (yfa.b()) {
                CopyOnWriteArrayList copyOnWriteArrayList = yfa.b;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : copyOnWriteArrayList) {
                    ((n30) ((zfa) obj2)).getClass();
                    arrayList.add(obj2);
                }
                if (!arrayList.isEmpty()) {
                    String strS = sq6.s(zfa.a, th, "Root view enumeration failed; capturing activity window only: ");
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((n30) ((zfa) it.next())).b(sfa.WARN, "ScreenshotTaker", strS);
                    }
                }
            }
            return x44.W(view);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:77:0x01a7, code lost:
    
        if (r1 == r11) goto L78;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:52:0x00f4, B:51:0x00f2], limit reached: 130 */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c1 A[Catch: all -> 0x0174, TryCatch #4 {all -> 0x0174, blocks: (B:37:0x00bb, B:39:0x00c1, B:41:0x00cd, B:44:0x00da, B:46:0x00e0, B:49:0x00e7, B:59:0x011b, B:52:0x00f4, B:54:0x00fe), top: B:124:0x00bb }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01ae  */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v13 */
    /* JADX WARN: Type inference failed for: r12v2, types: [int] */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r20v0, types: [j8f, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v2, types: [f8f] */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v31, types: [android.graphics.Bitmap] */
    /* JADX WARN: Type inference failed for: r2v32 */
    /* JADX WARN: Type inference failed for: r2v37 */
    /* JADX WARN: Type inference failed for: r2v38 */
    /* JADX WARN: Type inference failed for: r2v39 */
    /* JADX WARN: Type inference failed for: r2v4, types: [android.graphics.Bitmap] */
    /* JADX WARN: Type inference failed for: r2v40 */
    /* JADX WARN: Type inference failed for: r2v41 */
    /* JADX WARN: Type inference failed for: r2v42 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [f8f, vp4] */
    /* JADX WARN: Type inference failed for: r6v5, types: [f8f, tp4] */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:62:0x0154 -> B:63:0x015c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Comparable a(android.app.Activity r21, defpackage.vp4 r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 630
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j8f.a(android.app.Activity, vp4):java.lang.Comparable");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007e A[Catch: all -> 0x0087, CancellationException -> 0x008b, TryCatch #3 {CancellationException -> 0x008b, blocks: (B:30:0x0076, B:32:0x007e, B:38:0x0090, B:22:0x0055, B:23:0x0061, B:25:0x0069), top: B:77:0x0055 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00bc A[Catch: all -> 0x00dd, TryCatch #9 {all -> 0x00dd, blocks: (B:52:0x00ac, B:55:0x00bc, B:56:0x00c7, B:58:0x00cd, B:61:0x00e0, B:63:0x00e6, B:64:0x0114, B:66:0x011a, B:73:0x0131), top: B:85:0x001e }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(android.view.View r9, android.view.Window r10, android.graphics.Canvas r11, float r12, float r13, defpackage.vp4 r14) {
        /*
            Method dump skipped, instruction units count: 312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j8f.b(android.view.View, android.view.Window, android.graphics.Canvas, float, float, vp4):java.lang.Object");
    }
}
