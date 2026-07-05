package defpackage;

import com.anthropic.claude.api.model.ModelSelectorState;
import com.anthropic.claude.api.model.ModelSelectorSurface;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class spb {
    public final npb a;
    public final koi b;
    public final pkc c;

    public spb(npb npbVar, koi koiVar, pkc pkcVar) {
        this.a = npbVar;
        this.b = koiVar;
        this.c = pkcVar;
    }

    public final okc a() {
        return this.c.a();
    }

    public final void b(String str, bz7 bz7Var) {
        okc okcVarA = a();
        List<ModelSelectorState> listD = a().d();
        ArrayList arrayList = new ArrayList(x44.y(listD, 10));
        for (ModelSelectorState modelSelectorState : listD) {
            if (ModelSelectorSurface.m375equalsimpl0(modelSelectorState.m370getIdWIVdKfU(), str)) {
                modelSelectorState = (ModelSelectorState) bz7Var.invoke(modelSelectorState);
            }
            arrayList.add(modelSelectorState);
        }
        okcVarA.h(arrayList);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.String r5, com.anthropic.claude.api.bootstrap.ModelSelectorStateBody r6, defpackage.tl8 r7, defpackage.tl8 r8, defpackage.vp4 r9) {
        /*
            r4 = this;
            boolean r0 = r9 instanceof defpackage.qpb
            if (r0 == 0) goto L13
            r0 = r9
            qpb r0 = (defpackage.qpb) r0
            int r1 = r0.I
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.I = r1
            goto L18
        L13:
            qpb r0 = new qpb
            r0.<init>(r4, r9)
        L18:
            java.lang.Object r9 = r0.G
            int r1 = r0.I
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L30
            if (r1 != r3) goto L2a
            tl8 r8 = r0.F
            java.lang.String r5 = r0.E
            defpackage.sf5.h0(r9)
            goto L4b
        L2a:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r4)
            return r2
        L30:
            defpackage.sf5.h0(r9)
            r4.b(r5, r7)
            koi r7 = r4.b
            java.lang.String r7 = r7.e
            r0.E = r5
            r0.F = r8
            r0.I = r3
            npb r9 = r4.a
            java.lang.Object r9 = r9.a(r7, r5, r6, r0)
            m45 r6 = defpackage.m45.E
            if (r9 != r6) goto L4b
            return r6
        L4b:
            com.anthropic.claude.api.result.ApiResult r9 = (com.anthropic.claude.api.result.ApiResult) r9
            boolean r6 = r9 instanceof defpackage.of0
            if (r6 == 0) goto L5c
            r7 = r9
            of0 r7 = (defpackage.of0) r7
            java.lang.Object r7 = r7.b
            com.anthropic.claude.api.model.ModelSelectorState r7 = (com.anthropic.claude.api.model.ModelSelectorState) r7
            r4.e(r5, r7)
            goto L60
        L5c:
            boolean r7 = r9 instanceof defpackage.nf0
            if (r7 == 0) goto L6f
        L60:
            if (r6 != 0) goto L6e
            boolean r6 = r9 instanceof defpackage.nf0
            if (r6 == 0) goto L6a
            r4.b(r5, r8)
            return r9
        L6a:
            defpackage.mr9.b()
            return r2
        L6e:
            return r9
        L6f:
            defpackage.mr9.b()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.spb.c(java.lang.String, com.anthropic.claude.api.bootstrap.ModelSelectorStateBody, tl8, tl8, vp4):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x007f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(java.lang.String r13, java.lang.String r14, defpackage.vp4 r15) {
        /*
            Method dump skipped, instruction units count: 338
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.spb.d(java.lang.String, java.lang.String, vp4):java.lang.Object");
    }

    public final void e(String str, ModelSelectorState modelSelectorState) {
        ArrayList arrayList = new ArrayList(a().d());
        Iterator it = arrayList.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (ModelSelectorSurface.m375equalsimpl0(((ModelSelectorState) it.next()).m370getIdWIVdKfU(), str)) {
                break;
            } else {
                i++;
            }
        }
        if (i >= 0) {
            arrayList.set(i, modelSelectorState);
        } else {
            arrayList.add(modelSelectorState);
        }
        a().h(arrayList);
    }
}
