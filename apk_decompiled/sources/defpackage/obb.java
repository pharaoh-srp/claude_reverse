package defpackage;

import com.anthropic.claude.api.memory.MelangeMeta;
import com.anthropic.claude.core.telemetry.SilentException;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class obb {
    public final t8b a;
    public final koi b;
    public final lsc c = mpk.P(null);
    public final lsc d = mpk.P(lm6.E);
    public final lsc e = mpk.P(Boolean.FALSE);
    public final lsc f = mpk.P(null);

    public obb(t8b t8bVar, koi koiVar) {
        this.a = t8bVar;
        this.b = koiVar;
    }

    public static void c(List list, List list2) {
        boolean zIsEmpty = list2.isEmpty();
        ozf ozfVar = ozf.F;
        if (zIsEmpty && !list.isEmpty()) {
            SilentException.a(new SilentException("memory-fs /list: entries present but categories empty"), ozfVar, false, 2);
        }
        List list3 = list;
        if ((list3 instanceof Collection) && list3.isEmpty()) {
            return;
        }
        Iterator it = list3.iterator();
        while (it.hasNext()) {
            String display_name = ((MelangeMeta) it.next()).getDisplay_name();
            if (display_name == null || display_name.length() == 0) {
                SilentException.a(new SilentException("memory-fs /list: some entries missing display_name"), ozfVar, false, 2);
                return;
            }
        }
    }

    public final List a() {
        return (List) this.c.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.vp4 r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof defpackage.nbb
            if (r0 == 0) goto L13
            r0 = r9
            nbb r0 = (defpackage.nbb) r0
            int r1 = r0.G
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.G = r1
            goto L18
        L13:
            nbb r0 = new nbb
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.E
            int r1 = r0.G
            lsc r2 = r8.f
            lsc r3 = r8.e
            iei r4 = defpackage.iei.a
            r5 = 0
            r6 = 1
            if (r1 == 0) goto L35
            if (r1 != r6) goto L2f
            defpackage.sf5.h0(r9)     // Catch: java.lang.Throwable -> L2c
            goto L63
        L2c:
            r8 = move-exception
            goto Lc0
        L2f:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r8)
            return r5
        L35:
            defpackage.sf5.h0(r9)
            java.lang.Object r9 = r3.getValue()
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L45
            return r4
        L45:
            java.lang.Boolean r9 = java.lang.Boolean.TRUE
            r3.setValue(r9)
            r2.setValue(r5)     // Catch: java.lang.Throwable -> L2c
            t8b r9 = r8.a     // Catch: java.lang.Throwable -> L2c
            koi r1 = r8.b     // Catch: java.lang.Throwable -> L2c
            java.lang.String r1 = r1.e     // Catch: java.lang.Throwable -> L2c
            com.anthropic.claude.api.memory.MelangeListRequest r7 = new com.anthropic.claude.api.memory.MelangeListRequest     // Catch: java.lang.Throwable -> L2c
            r7.<init>(r5, r6, r5)     // Catch: java.lang.Throwable -> L2c
            r0.G = r6     // Catch: java.lang.Throwable -> L2c
            java.lang.Object r9 = r9.b(r1, r7, r0)     // Catch: java.lang.Throwable -> L2c
            m45 r0 = defpackage.m45.E
            if (r9 != r0) goto L63
            return r0
        L63:
            com.anthropic.claude.api.result.ApiResult r9 = (com.anthropic.claude.api.result.ApiResult) r9     // Catch: java.lang.Throwable -> L2c
            boolean r0 = r9 instanceof defpackage.of0     // Catch: java.lang.Throwable -> L2c
            if (r0 == 0) goto Lab
            r0 = r9
            of0 r0 = (defpackage.of0) r0     // Catch: java.lang.Throwable -> L2c
            java.lang.Object r0 = r0.b     // Catch: java.lang.Throwable -> L2c
            com.anthropic.claude.api.memory.MelangeListResponse r0 = (com.anthropic.claude.api.memory.MelangeListResponse) r0     // Catch: java.lang.Throwable -> L2c
            java.util.List r0 = r0.getData()     // Catch: java.lang.Throwable -> L2c
            lsc r1 = r8.c     // Catch: java.lang.Throwable -> L2c
            r1.setValue(r0)     // Catch: java.lang.Throwable -> L2c
            r0 = r9
            of0 r0 = (defpackage.of0) r0     // Catch: java.lang.Throwable -> L2c
            java.lang.Object r0 = r0.b     // Catch: java.lang.Throwable -> L2c
            com.anthropic.claude.api.memory.MelangeListResponse r0 = (com.anthropic.claude.api.memory.MelangeListResponse) r0     // Catch: java.lang.Throwable -> L2c
            java.util.List r0 = r0.getCategories()     // Catch: java.lang.Throwable -> L2c
            lm6 r1 = defpackage.lm6.E
            if (r0 != 0) goto L89
            r0 = r1
        L89:
            lsc r8 = r8.d     // Catch: java.lang.Throwable -> L2c
            r8.setValue(r0)     // Catch: java.lang.Throwable -> L2c
            r8 = r9
            of0 r8 = (defpackage.of0) r8     // Catch: java.lang.Throwable -> L2c
            java.lang.Object r8 = r8.b     // Catch: java.lang.Throwable -> L2c
            com.anthropic.claude.api.memory.MelangeListResponse r8 = (com.anthropic.claude.api.memory.MelangeListResponse) r8     // Catch: java.lang.Throwable -> L2c
            java.util.List r8 = r8.getData()     // Catch: java.lang.Throwable -> L2c
            of0 r9 = (defpackage.of0) r9     // Catch: java.lang.Throwable -> L2c
            java.lang.Object r9 = r9.b     // Catch: java.lang.Throwable -> L2c
            com.anthropic.claude.api.memory.MelangeListResponse r9 = (com.anthropic.claude.api.memory.MelangeListResponse) r9     // Catch: java.lang.Throwable -> L2c
            java.util.List r9 = r9.getCategories()     // Catch: java.lang.Throwable -> L2c
            if (r9 != 0) goto La6
            goto La7
        La6:
            r1 = r9
        La7:
            c(r8, r1)     // Catch: java.lang.Throwable -> L2c
            goto Lb4
        Lab:
            boolean r8 = r9 instanceof defpackage.nf0     // Catch: java.lang.Throwable -> L2c
            if (r8 == 0) goto Lba
            nf0 r9 = (defpackage.nf0) r9     // Catch: java.lang.Throwable -> L2c
            r2.setValue(r9)     // Catch: java.lang.Throwable -> L2c
        Lb4:
            java.lang.Boolean r8 = java.lang.Boolean.FALSE
            r3.setValue(r8)
            return r4
        Lba:
            kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException     // Catch: java.lang.Throwable -> L2c
            r8.<init>()     // Catch: java.lang.Throwable -> L2c
            throw r8     // Catch: java.lang.Throwable -> L2c
        Lc0:
            java.lang.Boolean r9 = java.lang.Boolean.FALSE
            r3.setValue(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.obb.b(vp4):java.lang.Object");
    }
}
