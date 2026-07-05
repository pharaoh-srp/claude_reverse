package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public final class s4e {
    public final ct5 a;
    public final u0h b;
    public final dke c;
    public final oa4 d;
    public final ArrayList e;

    /* JADX WARN: Multi-variable type inference failed */
    public s4e(Context context, ct5 ct5Var, u0h u0hVar, u0h u0hVar2, u0h u0hVar3, oa4 oa4Var, zw8 zw8Var) {
        Object am4Var;
        this.a = ct5Var;
        this.b = u0hVar;
        myg mygVarG = iuj.g();
        ft5 ft5Var = g86.a;
        fd9.c(nai.Z(mygVarG, tpa.a.J).r0(new q4e(zp3.G)));
        f1h f1hVar = new f1h(this, context, zw8Var.b);
        dke dkeVar = new dke();
        dkeVar.E = f1hVar;
        int i = 1;
        char c = 1;
        int i2 = 2;
        boolean z = false;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        if (g.a) {
            am4Var = new r09(z, i2);
        } else {
            int i3 = Build.VERSION.SDK_INT;
            am4Var = (i3 == 26 || i3 == 27) ? new am4(11) : new r09(c == true ? 1 : 0, i2);
        }
        dkeVar.F = am4Var;
        this.c = dkeVar;
        h80 h80Var = new h80();
        h80Var.E = w44.q1(oa4Var.a);
        h80Var.F = w44.q1(oa4Var.b);
        h80Var.G = w44.q1(oa4Var.c);
        h80Var.H = w44.q1(oa4Var.d);
        h80Var.I = w44.q1(oa4Var.e);
        h80Var.a(new l12(i2), vs8.class);
        int i4 = 5;
        h80Var.a(new l12(i4), String.class);
        h80Var.a(new l12(i), Uri.class);
        h80Var.a(new l12(4), Uri.class);
        int i5 = 3;
        h80Var.a(new l12(i5), Integer.class);
        h80Var.a(new l12(objArr2 == true ? 1 : 0), byte[].class);
        fli fliVar = new fli();
        ArrayList arrayList = (ArrayList) h80Var.G;
        arrayList.add(new cpc(fliVar, Uri.class));
        arrayList.add(new cpc(new vi7(zw8Var.a), File.class));
        h80Var.b(new qs8(u0hVar3, u0hVar2, zw8Var.c), Uri.class);
        h80Var.b(new ax0(i4), File.class);
        h80Var.b(new ax0(objArr == true ? 1 : 0), Uri.class);
        h80Var.b(new ax0(i5), Uri.class);
        h80Var.b(new ax0(6), Uri.class);
        h80Var.b(new ax0(4), Drawable.class);
        h80Var.b(new ax0(1), Bitmap.class);
        h80Var.b(new ax0(2), ByteBuffer.class);
        vq1 vq1Var = new vq1(zw8Var.d, zw8Var.e);
        ArrayList arrayList2 = (ArrayList) h80Var.I;
        arrayList2.add(vq1Var);
        List listS = ajk.s((ArrayList) h80Var.E);
        this.d = new oa4(listS, ajk.s((ArrayList) h80Var.F), ajk.s(arrayList), ajk.s((ArrayList) h80Var.H), ajk.s(arrayList2));
        this.e = w44.b1(listS, new oo6(this, dkeVar));
        new AtomicBoolean(false);
        context.registerComponentCallbacks(f1hVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00b9, code lost:
    
        if (defpackage.cjk.i(r0, r2) == r8) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00cc A[Catch: all -> 0x00d0, TryCatch #0 {all -> 0x00d0, blocks: (B:42:0x00c2, B:44:0x00cc, B:47:0x00d4, B:49:0x00df, B:50:0x00e2), top: B:94:0x00c2 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00df A[Catch: all -> 0x00d0, TryCatch #0 {all -> 0x00d0, blocks: (B:42:0x00c2, B:44:0x00cc, B:47:0x00d4, B:49:0x00df, B:50:0x00e2), top: B:94:0x00c2 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x012e A[Catch: all -> 0x015a, TryCatch #5 {all -> 0x015a, blocks: (B:60:0x0128, B:62:0x012e, B:69:0x0150, B:65:0x013d, B:68:0x014a, B:74:0x015c, B:76:0x0160), top: B:103:0x0128 }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x015c A[Catch: all -> 0x015a, TryCatch #5 {all -> 0x015a, blocks: (B:60:0x0128, B:62:0x012e, B:69:0x0150, B:65:0x013d, B:68:0x014a, B:74:0x015c, B:76:0x0160), top: B:103:0x0128 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0186 A[Catch: all -> 0x0195, TryCatch #3 {all -> 0x0195, blocks: (B:85:0x0182, B:87:0x0186, B:90:0x0197, B:91:0x01a0), top: B:100:0x0182 }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0197 A[Catch: all -> 0x0195, TryCatch #3 {all -> 0x0195, blocks: (B:85:0x0182, B:87:0x0186, B:90:0x0197, B:91:0x01a0), top: B:100:0x0182 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(defpackage.s4e r20, defpackage.kx8 r21, int r22, defpackage.vp4 r23) {
        /*
            Method dump skipped, instruction units count: 423
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s4e.a(s4e, kx8, int, vp4):java.lang.Object");
    }

    public static void b(fu6 fu6Var, z4h z4hVar, rz6 rz6Var) {
        kx8 kx8Var = fu6Var.b;
        if (z4hVar instanceof a11) {
            y5i y5iVarA = kx8Var.g.a((a11) z4hVar, fu6Var);
            if (!(y5iVarA instanceof o6c)) {
                rz6Var.getClass();
                y5iVarA.a();
            }
        }
        rz6Var.getClass();
        kx8Var.getClass();
    }
}
