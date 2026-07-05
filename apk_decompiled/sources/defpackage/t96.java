package defpackage;

import com.anthropic.claude.api.account.DocumentAcceptance;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class t96 {
    public final u2a a;
    public final o7 b;

    public t96(u2a u2aVar, o7 o7Var) {
        this.a = u2aVar;
        this.b = o7Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.util.ArrayList r5, defpackage.zy1 r6, defpackage.vp4 r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof defpackage.s96
            if (r0 == 0) goto L13
            r0 = r7
            s96 r0 = (defpackage.s96) r0
            int r1 = r0.H
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.H = r1
            goto L18
        L13:
            s96 r0 = new s96
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.F
            int r1 = r0.H
            r2 = 1
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L27
            zy1 r6 = r0.E
            defpackage.sf5.h0(r7)
            goto L45
        L27:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r4)
            r4 = 0
            return r4
        L2e:
            defpackage.sf5.h0(r7)
            com.anthropic.claude.api.account.AcceptLegalDocsRequest r7 = new com.anthropic.claude.api.account.AcceptLegalDocsRequest
            r7.<init>(r5)
            r0.E = r6
            r0.H = r2
            o7 r4 = r4.b
            java.lang.Object r7 = r4.h(r7, r0)
            m45 r4 = defpackage.m45.E
            if (r7 != r4) goto L45
            return r4
        L45:
            com.anthropic.claude.api.result.ApiResult r7 = (com.anthropic.claude.api.result.ApiResult) r7
            com.anthropic.claude.ui.components.snackbar.a.a(r7, r6)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t96.a(java.util.ArrayList, zy1, vp4):java.lang.Object");
    }

    public final ArrayList b(boolean z, boolean z2) {
        String str;
        Map map = (Map) this.a.d.getValue();
        ArrayList arrayList = new ArrayList();
        if (z) {
            String str2 = (String) map.get(t2a.J);
            if (str2 != null) {
                arrayList.add(new DocumentAcceptance(str2, Boolean.TRUE));
            }
            String str3 = (String) map.get(t2a.H);
            if (str3 != null) {
                arrayList.add(new DocumentAcceptance(str3, Boolean.TRUE));
            }
        }
        if (z2 && (str = (String) map.get(t2a.I)) != null) {
            arrayList.add(new DocumentAcceptance(str, Boolean.TRUE));
        }
        return arrayList;
    }
}
