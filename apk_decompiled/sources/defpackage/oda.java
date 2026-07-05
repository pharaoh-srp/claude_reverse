package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;

/* JADX INFO: loaded from: classes.dex */
public final class oda {
    public final Context a;
    public final h86 b;
    public final ContentResolver c;
    public final u0h d = new u0h(new dg8(11, this));

    public oda(Context context, h86 h86Var) {
        this.a = context;
        this.b = h86Var;
        this.c = context.getContentResolver();
    }

    public final Object a(Uri uri, vp4 vp4Var) {
        return gb9.c0(this.b.b(), new mda(this, uri, (tp4) null), vp4Var);
    }

    public final Object b(si7 si7Var, vp4 vp4Var) {
        return gb9.c0(this.b.b(), new zn(si7Var, this, (tp4) null, 17), vp4Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x004b, code lost:
    
        if (r8 == r5) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(android.net.Uri r7, defpackage.vp4 r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.nda
            if (r0 == 0) goto L13
            r0 = r8
            nda r0 = (defpackage.nda) r0
            int r1 = r0.G
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.G = r1
            goto L18
        L13:
            nda r0 = new nda
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.E
            int r1 = r0.G
            r2 = 2
            r3 = 1
            r4 = 0
            m45 r5 = defpackage.m45.E
            if (r1 == 0) goto L35
            if (r1 == r3) goto L31
            if (r1 != r2) goto L2b
            defpackage.sf5.h0(r8)
            goto L4e
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r6)
            return r4
        L31:
            defpackage.sf5.h0(r8)
            goto L41
        L35:
            defpackage.sf5.h0(r8)
            r0.G = r3
            java.lang.Object r8 = r6.a(r7, r0)
            if (r8 != r5) goto L41
            goto L4d
        L41:
            si7 r8 = (defpackage.si7) r8
            if (r8 == 0) goto L51
            r0.G = r2
            java.lang.Object r8 = r6.b(r8, r0)
            if (r8 != r5) goto L4e
        L4d:
            return r5
        L4e:
            dk7 r8 = (defpackage.dk7) r8
            return r8
        L51:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oda.c(android.net.Uri, vp4):java.lang.Object");
    }

    public final Object d(Uri uri, xzg xzgVar) {
        return gb9.c0(this.b.b(), new mda(uri, this, (tp4) null), xzgVar);
    }
}
