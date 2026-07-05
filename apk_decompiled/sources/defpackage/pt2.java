package defpackage;

import android.content.Context;
import com.anthropic.claude.api.chat.MessageAttachment;
import com.anthropic.claude.api.chat.MessageFile;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class pt2 {
    public final yw2 a;
    public final koi b;
    public final g09 c;
    public final qi3 d;
    public final Context e;
    public final h86 f;
    public final rc8 g;
    public final fn0 h;
    public final wz5 i;
    public final AtomicInteger j = new AtomicInteger(0);
    public final wz5 k;
    public final wz5 l;
    public final wz5 m;
    public final wz5 n;
    public final wz5 o;
    public final zy1 p;

    public pt2(yw2 yw2Var, koi koiVar, g09 g09Var, qi3 qi3Var, Context context, h86 h86Var, rc8 rc8Var, fn0 fn0Var) {
        this.a = yw2Var;
        this.b = koiVar;
        this.c = g09Var;
        this.d = qi3Var;
        this.e = context;
        this.f = h86Var;
        this.g = rc8Var;
        this.h = fn0Var;
        final int i = 2;
        this.i = mpk.w(new zy7(this) { // from class: ht2
            public final /* synthetic */ pt2 F;

            {
                this.F = this;
            }

            @Override // defpackage.zy7
            public final Object a() {
                boolean zE;
                int i2 = i;
                boolean z = true;
                pt2 pt2Var = this.F;
                switch (i2) {
                    case 0:
                        zE = !pt2Var.a.getFiles().isEmpty();
                        break;
                    case 1:
                        List files = pt2Var.a.getFiles();
                        if ((files instanceof Collection) && files.isEmpty()) {
                            z = false;
                        } else {
                            Iterator it = files.iterator();
                            while (it.hasNext()) {
                                if (((ww2) it.next()).a()) {
                                }
                            }
                            z = false;
                        }
                        return Boolean.valueOf(z);
                    case 2:
                        int max_per_message_upload_count = amk.c(pt2Var.g).getMax_per_message_upload_count() - pt2Var.a.getFiles().size();
                        return Integer.valueOf(max_per_message_upload_count >= 0 ? max_per_message_upload_count : 0);
                    case 3:
                        List files2 = pt2Var.a.getFiles();
                        ArrayList arrayList = new ArrayList(x44.y(files2, 10));
                        Iterator it2 = files2.iterator();
                        while (it2.hasNext()) {
                            arrayList.add(new gt2((ww2) it2.next()));
                        }
                        return arrayList;
                    case 4:
                        zE = pt2Var.a.e();
                        break;
                    default:
                        zE = pt2Var.a.c();
                        break;
                }
                return Boolean.valueOf(zE);
            }
        });
        final int i2 = 0;
        final int i3 = 3;
        this.k = mpk.w(new zy7(this) { // from class: ht2
            public final /* synthetic */ pt2 F;

            {
                this.F = this;
            }

            @Override // defpackage.zy7
            public final Object a() {
                boolean zE;
                int i22 = i3;
                boolean z = true;
                pt2 pt2Var = this.F;
                switch (i22) {
                    case 0:
                        zE = !pt2Var.a.getFiles().isEmpty();
                        break;
                    case 1:
                        List files = pt2Var.a.getFiles();
                        if ((files instanceof Collection) && files.isEmpty()) {
                            z = false;
                        } else {
                            Iterator it = files.iterator();
                            while (it.hasNext()) {
                                if (((ww2) it.next()).a()) {
                                }
                            }
                            z = false;
                        }
                        return Boolean.valueOf(z);
                    case 2:
                        int max_per_message_upload_count = amk.c(pt2Var.g).getMax_per_message_upload_count() - pt2Var.a.getFiles().size();
                        return Integer.valueOf(max_per_message_upload_count >= 0 ? max_per_message_upload_count : 0);
                    case 3:
                        List files2 = pt2Var.a.getFiles();
                        ArrayList arrayList = new ArrayList(x44.y(files2, 10));
                        Iterator it2 = files2.iterator();
                        while (it2.hasNext()) {
                            arrayList.add(new gt2((ww2) it2.next()));
                        }
                        return arrayList;
                    case 4:
                        zE = pt2Var.a.e();
                        break;
                    default:
                        zE = pt2Var.a.c();
                        break;
                }
                return Boolean.valueOf(zE);
            }
        });
        a5 a5Var = a5.N;
        final int i4 = 4;
        this.l = mpk.x(new zy7(this) { // from class: ht2
            public final /* synthetic */ pt2 F;

            {
                this.F = this;
            }

            @Override // defpackage.zy7
            public final Object a() {
                boolean zE;
                int i22 = i4;
                boolean z = true;
                pt2 pt2Var = this.F;
                switch (i22) {
                    case 0:
                        zE = !pt2Var.a.getFiles().isEmpty();
                        break;
                    case 1:
                        List files = pt2Var.a.getFiles();
                        if ((files instanceof Collection) && files.isEmpty()) {
                            z = false;
                        } else {
                            Iterator it = files.iterator();
                            while (it.hasNext()) {
                                if (((ww2) it.next()).a()) {
                                }
                            }
                            z = false;
                        }
                        return Boolean.valueOf(z);
                    case 2:
                        int max_per_message_upload_count = amk.c(pt2Var.g).getMax_per_message_upload_count() - pt2Var.a.getFiles().size();
                        return Integer.valueOf(max_per_message_upload_count >= 0 ? max_per_message_upload_count : 0);
                    case 3:
                        List files2 = pt2Var.a.getFiles();
                        ArrayList arrayList = new ArrayList(x44.y(files2, 10));
                        Iterator it2 = files2.iterator();
                        while (it2.hasNext()) {
                            arrayList.add(new gt2((ww2) it2.next()));
                        }
                        return arrayList;
                    case 4:
                        zE = pt2Var.a.e();
                        break;
                    default:
                        zE = pt2Var.a.c();
                        break;
                }
                return Boolean.valueOf(zE);
            }
        }, a5Var);
        final int i5 = 5;
        this.m = mpk.w(new zy7(this) { // from class: ht2
            public final /* synthetic */ pt2 F;

            {
                this.F = this;
            }

            @Override // defpackage.zy7
            public final Object a() {
                boolean zE;
                int i22 = i5;
                boolean z = true;
                pt2 pt2Var = this.F;
                switch (i22) {
                    case 0:
                        zE = !pt2Var.a.getFiles().isEmpty();
                        break;
                    case 1:
                        List files = pt2Var.a.getFiles();
                        if ((files instanceof Collection) && files.isEmpty()) {
                            z = false;
                        } else {
                            Iterator it = files.iterator();
                            while (it.hasNext()) {
                                if (((ww2) it.next()).a()) {
                                }
                            }
                            z = false;
                        }
                        return Boolean.valueOf(z);
                    case 2:
                        int max_per_message_upload_count = amk.c(pt2Var.g).getMax_per_message_upload_count() - pt2Var.a.getFiles().size();
                        return Integer.valueOf(max_per_message_upload_count >= 0 ? max_per_message_upload_count : 0);
                    case 3:
                        List files2 = pt2Var.a.getFiles();
                        ArrayList arrayList = new ArrayList(x44.y(files2, 10));
                        Iterator it2 = files2.iterator();
                        while (it2.hasNext()) {
                            arrayList.add(new gt2((ww2) it2.next()));
                        }
                        return arrayList;
                    case 4:
                        zE = pt2Var.a.e();
                        break;
                    default:
                        zE = pt2Var.a.c();
                        break;
                }
                return Boolean.valueOf(zE);
            }
        });
        this.n = mpk.x(new zy7(this) { // from class: ht2
            public final /* synthetic */ pt2 F;

            {
                this.F = this;
            }

            @Override // defpackage.zy7
            public final Object a() {
                boolean zE;
                int i22 = i2;
                boolean z = true;
                pt2 pt2Var = this.F;
                switch (i22) {
                    case 0:
                        zE = !pt2Var.a.getFiles().isEmpty();
                        break;
                    case 1:
                        List files = pt2Var.a.getFiles();
                        if ((files instanceof Collection) && files.isEmpty()) {
                            z = false;
                        } else {
                            Iterator it = files.iterator();
                            while (it.hasNext()) {
                                if (((ww2) it.next()).a()) {
                                }
                            }
                            z = false;
                        }
                        return Boolean.valueOf(z);
                    case 2:
                        int max_per_message_upload_count = amk.c(pt2Var.g).getMax_per_message_upload_count() - pt2Var.a.getFiles().size();
                        return Integer.valueOf(max_per_message_upload_count >= 0 ? max_per_message_upload_count : 0);
                    case 3:
                        List files2 = pt2Var.a.getFiles();
                        ArrayList arrayList = new ArrayList(x44.y(files2, 10));
                        Iterator it2 = files2.iterator();
                        while (it2.hasNext()) {
                            arrayList.add(new gt2((ww2) it2.next()));
                        }
                        return arrayList;
                    case 4:
                        zE = pt2Var.a.e();
                        break;
                    default:
                        zE = pt2Var.a.c();
                        break;
                }
                return Boolean.valueOf(zE);
            }
        }, a5Var);
        final int i6 = 1;
        this.o = mpk.x(new zy7(this) { // from class: ht2
            public final /* synthetic */ pt2 F;

            {
                this.F = this;
            }

            @Override // defpackage.zy7
            public final Object a() {
                boolean zE;
                int i22 = i6;
                boolean z = true;
                pt2 pt2Var = this.F;
                switch (i22) {
                    case 0:
                        zE = !pt2Var.a.getFiles().isEmpty();
                        break;
                    case 1:
                        List files = pt2Var.a.getFiles();
                        if ((files instanceof Collection) && files.isEmpty()) {
                            z = false;
                        } else {
                            Iterator it = files.iterator();
                            while (it.hasNext()) {
                                if (((ww2) it.next()).a()) {
                                }
                            }
                            z = false;
                        }
                        return Boolean.valueOf(z);
                    case 2:
                        int max_per_message_upload_count = amk.c(pt2Var.g).getMax_per_message_upload_count() - pt2Var.a.getFiles().size();
                        return Integer.valueOf(max_per_message_upload_count >= 0 ? max_per_message_upload_count : 0);
                    case 3:
                        List files2 = pt2Var.a.getFiles();
                        ArrayList arrayList = new ArrayList(x44.y(files2, 10));
                        Iterator it2 = files2.iterator();
                        while (it2.hasNext()) {
                            arrayList.add(new gt2((ww2) it2.next()));
                        }
                        return arrayList;
                    case 4:
                        zE = pt2Var.a.e();
                        break;
                    default:
                        zE = pt2Var.a.c();
                        break;
                }
                return Boolean.valueOf(zE);
            }
        }, a5Var);
        this.p = g09Var.b;
    }

    public final void a(List list, List list2) {
        list.getClass();
        list2.getClass();
        this.a.d(list, list2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1, types: [o45, tp4] */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v3, types: [o45, tp4] */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [l45] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [l45] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v16, types: [h86] */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [h86] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.io.File r17, java.lang.String r18, com.anthropic.claude.analytics.events.ChatEvents$AttachmentSource r19, com.anthropic.claude.analytics.events.ScreenSource r20, defpackage.sm r21, defpackage.vp4 r22) throws java.lang.Throwable {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r22
            boolean r3 = r2 instanceof defpackage.kt2
            if (r3 == 0) goto L1a
            r3 = r2
            kt2 r3 = (defpackage.kt2) r3
            int r4 = r3.H
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L1a
            int r4 = r4 - r5
            r3.H = r4
        L18:
            r12 = r3
            goto L20
        L1a:
            kt2 r3 = new kt2
            r3.<init>(r0, r2)
            goto L18
        L20:
            java.lang.Object r2 = r12.F
            int r3 = r12.H
            r14 = 0
            fn0 r4 = r0.h
            h86 r5 = r0.f
            r6 = 1
            r7 = 0
            if (r3 == 0) goto L44
            if (r3 != r6) goto L3e
            java.io.File r1 = r12.E
            defpackage.sf5.h0(r2)     // Catch: java.lang.Throwable -> L38
            r2 = r4
            r3 = r5
            r15 = r7
            goto L98
        L38:
            r0 = move-exception
            r2 = r4
            r3 = r5
            r15 = r7
            goto La9
        L3e:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r0)
            return r7
        L44:
            defpackage.sf5.h0(r2)
            android.content.Context r2 = r0.e
            java.lang.String r3 = r2.getPackageName()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r3)
            java.lang.String r3 = ".provider"
            r8.append(r3)
            java.lang.String r3 = r8.toString()
            android.net.Uri r2 = androidx.core.content.FileProvider.d(r2, r3, r1)
            android.net.Uri r3 = android.net.Uri.fromFile(r1)
            java.lang.String r3 = r3.toString()
            r3.getClass()
            java.lang.String r3 = defpackage.gsk.e(r3)
            yw2 r0 = r0.a     // Catch: java.lang.Throwable -> L38
            r2.getClass()     // Catch: java.lang.Throwable -> L38
            if (r3 != 0) goto L7a
            java.lang.String r3 = "image/jpeg"
        L7a:
            r10 = r3
            r12.E = r1     // Catch: java.lang.Throwable -> L38
            r12.H = r6     // Catch: java.lang.Throwable -> L38
            r11 = 0
            r13 = 64
            r6 = r18
            r8 = r20
            r9 = r21
            r3 = r5
            r15 = r7
            r7 = r19
            r5 = r2
            r2 = r4
            r4 = r0
            java.lang.Object r0 = defpackage.yw2.j(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)     // Catch: java.lang.Throwable -> La8
            m45 r4 = defpackage.m45.E
            if (r0 != r4) goto L98
            return r4
        L98:
            e45 r0 = r3.b()
            lt2 r3 = new lt2
            r3.<init>(r1, r15, r14)
            r1 = 2
            defpackage.gb9.D(r2, r0, r15, r3, r1)
            iei r0 = defpackage.iei.a
            return r0
        La8:
            r0 = move-exception
        La9:
            e45 r3 = r3.b()
            lt2 r4 = new lt2
            r4.<init>(r1, r15, r14)
            r1 = 2
            defpackage.gb9.D(r2, r3, r15, r4, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pt2.b(java.io.File, java.lang.String, com.anthropic.claude.analytics.events.ChatEvents$AttachmentSource, com.anthropic.claude.analytics.events.ScreenSource, sm, vp4):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.bz7 r17, java.lang.String r18, com.anthropic.claude.analytics.events.ScreenSource r19, defpackage.pz7 r20, defpackage.vp4 r21) {
        /*
            Method dump skipped, instruction units count: 311
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pt2.c(bz7, java.lang.String, com.anthropic.claude.analytics.events.ScreenSource, pz7, vp4):java.lang.Object");
    }

    public final int d() {
        return ((Number) this.i.getValue()).intValue();
    }

    public final ArrayList e() {
        List<ww2> files = this.a.getFiles();
        ArrayList arrayList = new ArrayList();
        for (ww2 ww2Var : files) {
            jw2 jw2Var = ww2Var instanceof jw2 ? (jw2) ww2Var : null;
            MessageAttachment messageAttachmentM = jw2Var != null ? jw2Var.m() : null;
            if (messageAttachmentM != null) {
                arrayList.add(messageAttachmentM);
            }
        }
        return arrayList;
    }

    public final ArrayList f() {
        List<ww2> files = this.a.getFiles();
        ArrayList arrayList = new ArrayList();
        for (ww2 ww2Var : files) {
            uw2 uw2Var = ww2Var instanceof uw2 ? (uw2) ww2Var : null;
            MessageFile messageFileF = uw2Var != null ? uw2Var.f() : null;
            if (messageFileF != null) {
                arrayList.add(messageFileF);
            }
        }
        return arrayList;
    }
}
