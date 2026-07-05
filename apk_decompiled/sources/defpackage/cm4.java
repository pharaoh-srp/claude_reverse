package defpackage;

import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.view.View;
import java.security.KeyPairGenerator;
import java.security.Provider;
import java.util.Collection;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes3.dex */
public class cm4 implements sac, hf5, i1c, qo6, coi, s6f, up4, jzk {
    public static final /* synthetic */ cm4 E = new cm4();

    public cm4(v4d v4dVar, String str, String str2) {
        str.getClass();
        str2.getClass();
    }

    public static m6b c(h86 h86Var, s41 s41Var) {
        s41Var.getClass();
        return new m6b(new i6b(s41Var), h86Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x0152, code lost:
    
        if (defpackage.uwj.c(r11, r0) == r7) goto L69;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0116 A[Catch: all -> 0x003b, TryCatch #3 {all -> 0x003b, blocks: (B:16:0x0036, B:70:0x0155, B:23:0x004a, B:65:0x0134, B:67:0x013d, B:26:0x0057, B:59:0x0112, B:61:0x0116, B:29:0x0064, B:50:0x00e6), top: B:95:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0165 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r12v0, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v15 */
    /* JADX WARN: Type inference failed for: r12v16, types: [ne9] */
    /* JADX WARN: Type inference failed for: r12v17 */
    /* JADX WARN: Type inference failed for: r12v18, types: [ne9] */
    /* JADX WARN: Type inference failed for: r12v19 */
    /* JADX WARN: Type inference failed for: r12v2, types: [ne9] */
    /* JADX WARN: Type inference failed for: r12v20, types: [ne9] */
    /* JADX WARN: Type inference failed for: r12v21, types: [ne9] */
    /* JADX WARN: Type inference failed for: r12v22 */
    /* JADX WARN: Type inference failed for: r12v23, types: [ne9] */
    /* JADX WARN: Type inference failed for: r12v29 */
    /* JADX WARN: Type inference failed for: r12v30 */
    /* JADX WARN: Type inference failed for: r12v31 */
    /* JADX WARN: Type inference failed for: r12v32 */
    /* JADX WARN: Type inference failed for: r12v33 */
    /* JADX WARN: Type inference failed for: r12v34 */
    /* JADX WARN: Type inference failed for: r12v35 */
    /* JADX WARN: Type inference failed for: r12v36 */
    /* JADX WARN: Type inference failed for: r12v37 */
    /* JADX WARN: Type inference failed for: r12v38 */
    /* JADX WARN: Type inference failed for: r12v39 */
    /* JADX WARN: Type inference failed for: r12v40 */
    /* JADX WARN: Type inference failed for: r13v0, types: [h86] */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v10, types: [h86] */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v17, types: [java.lang.Object, re9] */
    /* JADX WARN: Type inference failed for: r13v2, types: [re9] */
    /* JADX WARN: Type inference failed for: r13v23 */
    /* JADX WARN: Type inference failed for: r13v24 */
    /* JADX WARN: Type inference failed for: r13v30 */
    /* JADX WARN: Type inference failed for: r13v31 */
    /* JADX WARN: Type inference failed for: r13v32 */
    /* JADX WARN: Type inference failed for: r13v5, types: [h86] */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v13, types: [h86] */
    /* JADX WARN: Type inference failed for: r14v14 */
    /* JADX WARN: Type inference failed for: r14v15, types: [h86] */
    /* JADX WARN: Type inference failed for: r14v21 */
    /* JADX WARN: Type inference failed for: r14v22 */
    /* JADX WARN: Type inference failed for: r14v23 */
    /* JADX WARN: Type inference failed for: r14v24 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [h86] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(android.content.Context r12, defpackage.h86 r13, defpackage.vp4 r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 420
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cm4.a(android.content.Context, h86, vp4):java.lang.Object");
    }

    @Override // defpackage.i1c
    public boolean b() {
        return true;
    }

    public void d(View view, Rect rect) {
        DisplayMetrics displayMetrics = view.getResources().getDisplayMetrics();
        rect.set(0, 0, displayMetrics.widthPixels, displayMetrics.heightPixels);
    }

    @Override // defpackage.hf5
    public Iterable e(Object obj) {
        e92 e92Var = (e92) obj;
        Collection collectionI = e92Var != null ? e92Var.i() : null;
        return collectionI == null ? lm6.E : collectionI;
    }

    @Override // defpackage.qo6
    public Object f(String str, Provider provider) {
        return provider == null ? KeyPairGenerator.getInstance(str) : KeyPairGenerator.getInstance(str, provider);
    }

    @Override // defpackage.up4
    public /* synthetic */ Object g(d5h d5hVar) {
        nyj nyjVar = snj.l;
        return null;
    }

    @Override // defpackage.s6f
    public a7a h(int i, int i2, String str) {
        char cCharAt;
        int i3 = i + 4;
        if (i3 >= str.length() || str.charAt(i + 1) != 'w' || str.charAt(i + 2) != 'w' || str.charAt(i + 3) != '.') {
            return null;
        }
        if (i != i2 && ((cCharAt = str.charAt(i - 1)) == '.' || auk.h(cCharAt))) {
            i = -1;
        }
        if (i == -1) {
            return null;
        }
        int iF = auk.f(i3, str);
        if (iF != -1) {
            int i4 = iF;
            while (true) {
                i4--;
                if (i4 <= i3) {
                    break;
                }
                if (str.charAt(i4) == '.' && i4 > i3) {
                    break;
                }
            }
        } else {
            iF = -1;
        }
        if (iF == -1) {
            return null;
        }
        return new a7a(c7a.G, i, iF + 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object i(android.content.Context r7, int r8, defpackage.vp4 r9) {
        /*
            Method dump skipped, instruction units count: 218
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cm4.i(android.content.Context, int, vp4):java.lang.Object");
    }

    public void j(r9d r9dVar, int i, int i2) {
    }

    @Override // defpackage.sac
    public Object o0() {
        return new LinkedHashMap();
    }

    @Override // defpackage.i1c
    public void shutdown() {
    }

    public /* synthetic */ cm4() {
    }
}
