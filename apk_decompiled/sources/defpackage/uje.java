package defpackage;

import com.anthropic.claude.tool.model.RequestFormInputFromUserInputFieldsItem;
import com.anthropic.claude.tool.model.RequestFormInputFromUserInputFieldsItemType;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class uje extends iwe {
    public final String b;
    public final List c;
    public final dl2 d;
    public final String e;
    public final String f;
    public final String g;
    public final mdg h;
    public final lsc i;
    public final lsc j;
    public final wz5 k;
    public final Set l;
    public final boolean m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uje(String str, List list, dl2 dl2Var, String str2, String str3, String str4, h86 h86Var) {
        super(h86Var);
        list.getClass();
        str2.getClass();
        str3.getClass();
        this.b = str;
        this.c = list;
        this.d = dl2Var;
        this.e = str2;
        this.f = str3;
        this.g = str4;
        mdg mdgVar = new mdg();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            RequestFormInputFromUserInputFieldsItem requestFormInputFromUserInputFieldsItem = (RequestFormInputFromUserInputFieldsItem) it.next();
            String prefill = requestFormInputFromUserInputFieldsItem.getPrefill();
            if (prefill != null) {
                mdgVar.put(requestFormInputFromUserInputFieldsItem.getName(), prefill);
            }
        }
        this.h = mdgVar;
        Boolean bool = Boolean.FALSE;
        this.i = mpk.P(bool);
        this.j = mpk.P(bool);
        this.k = mpk.w(new pza(18, this));
        this.l = mp0.Z0(new RequestFormInputFromUserInputFieldsItemType[]{RequestFormInputFromUserInputFieldsItemType.PASSWORD, RequestFormInputFromUserInputFieldsItemType.SENSITIVE_TEXT});
        List list2 = this.c;
        boolean z = false;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            Iterator it2 = list2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                if (this.l.contains(((RequestFormInputFromUserInputFieldsItem) it2.next()).getType())) {
                    z = true;
                    break;
                }
            }
        }
        this.m = z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00bf, code lost:
    
        if (r9 == r5) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00cd, code lost:
    
        if (r9 == r5) goto L48;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object O(defpackage.vp4 r9) {
        /*
            Method dump skipped, instruction units count: 271
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uje.O(vp4):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a2, code lost:
    
        if (r1 == r10) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object P(defpackage.pz7 r19, defpackage.vp4 r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r20
            boolean r2 = r1 instanceof defpackage.tje
            if (r2 == 0) goto L17
            r2 = r1
            tje r2 = (defpackage.tje) r2
            int r3 = r2.H
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.H = r3
            goto L1c
        L17:
            tje r2 = new tje
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.F
            int r3 = r2.H
            r4 = 0
            lsc r5 = r0.j
            lsc r6 = r0.i
            r7 = 2
            iei r8 = defpackage.iei.a
            r9 = 1
            m45 r10 = defpackage.m45.E
            if (r3 == 0) goto L4a
            if (r3 == r9) goto L3f
            if (r3 != r7) goto L39
            defpackage.sf5.h0(r1)     // Catch: java.lang.Throwable -> L36
            goto La5
        L36:
            r0 = move-exception
            goto Lb3
        L39:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r0)
            return r4
        L3f:
            pz7 r3 = r2.E
            defpackage.sf5.h0(r1)     // Catch: java.lang.Throwable -> L36
            r17 = r3
            r3 = r1
            r1 = r17
            goto L71
        L4a:
            defpackage.sf5.h0(r1)
            java.lang.Object r1 = r6.getValue()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L5a
            return r8
        L5a:
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r6.setValue(r1)
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r5.setValue(r1)
            r1 = r19
            r2.E = r1     // Catch: java.lang.Throwable -> L36
            r2.H = r9     // Catch: java.lang.Throwable -> L36
            java.lang.Object r3 = r0.O(r2)     // Catch: java.lang.Throwable -> L36
            if (r3 != r10) goto L71
            goto La4
        L71:
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch: java.lang.Throwable -> L36
            boolean r3 = r3.booleanValue()     // Catch: java.lang.Throwable -> L36
            if (r3 != 0) goto L84
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L36
            r5.setValue(r0)     // Catch: java.lang.Throwable -> L36
        L7e:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r6.setValue(r0)
            return r8
        L84:
            java.util.List r3 = r0.c     // Catch: java.lang.Throwable -> L36
            r11 = r3
            java.lang.Iterable r11 = (java.lang.Iterable) r11     // Catch: java.lang.Throwable -> L36
            java.lang.String r12 = "\n"
            d6d r15 = new d6d     // Catch: java.lang.Throwable -> L36
            r3 = 9
            r15.<init>(r3, r0)     // Catch: java.lang.Throwable -> L36
            r16 = 30
            r13 = 0
            r14 = 0
            java.lang.String r0 = defpackage.w44.S0(r11, r12, r13, r14, r15, r16)     // Catch: java.lang.Throwable -> L36
            r2.E = r4     // Catch: java.lang.Throwable -> L36
            r2.H = r7     // Catch: java.lang.Throwable -> L36
            java.lang.Object r1 = r1.invoke(r0, r2)     // Catch: java.lang.Throwable -> L36
            if (r1 != r10) goto La5
        La4:
            return r10
        La5:
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> L36
            boolean r0 = r1.booleanValue()     // Catch: java.lang.Throwable -> L36
            if (r0 != 0) goto L7e
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L36
            r5.setValue(r0)     // Catch: java.lang.Throwable -> L36
            goto L7e
        Lb3:
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r6.setValue(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uje.P(pz7, vp4):java.lang.Object");
    }
}
