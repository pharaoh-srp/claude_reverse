package defpackage;

import com.anthropic.claude.api.chat.ChatConversationWithProjectReference;
import com.anthropic.claude.types.strings.ChatId;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public interface hq4 extends iib {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static java.lang.Object u(defpackage.hq4 r24, java.lang.String r25, java.util.List r26, java.lang.String r27, defpackage.vp4 r28) {
        /*
            r0 = r24
            r1 = r28
            boolean r2 = r1 instanceof defpackage.gq4
            if (r2 == 0) goto L17
            r2 = r1
            gq4 r2 = (defpackage.gq4) r2
            int r3 = r2.J
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.J = r3
            goto L1c
        L17:
            gq4 r2 = new gq4
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.H
            int r3 = r2.J
            r4 = 2
            r5 = 1
            iei r6 = defpackage.iei.a
            r7 = 0
            m45 r8 = defpackage.m45.E
            if (r3 == 0) goto L48
            if (r3 == r5) goto L37
            if (r3 != r4) goto L31
            defpackage.sf5.h0(r1)
            return r6
        L31:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r0)
            return r7
        L37:
            com.anthropic.claude.api.chat.ChatConversationWithProjectReference r0 = r2.G
            java.lang.String r3 = r2.F
            hq4 r9 = r2.E
            defpackage.sf5.h0(r1)
            r21 = r9
            r9 = r0
            r0 = r21
        L45:
            r21 = r3
            goto L70
        L48:
            defpackage.sf5.h0(r1)
            com.anthropic.claude.api.chat.ChatConversationWithProjectReference r1 = r24.t(r25)
            if (r1 != 0) goto L52
            goto L9b
        L52:
            boolean r3 = r1.is_temporary()
            if (r3 == 0) goto L59
            goto L9b
        L59:
            r2.E = r0
            r3 = r27
            r2.F = r3
            r2.G = r1
            r2.J = r5
            r9 = r25
            r10 = r26
            java.lang.Object r9 = r0.c(r9, r10, r2)
            if (r9 != r8) goto L6e
            goto L9a
        L6e:
            r9 = r1
            goto L45
        L70:
            java.util.Date r12 = new java.util.Date
            r12.<init>()
            r22 = 2043(0x7fb, float:2.863E-42)
            r23 = 0
            r10 = 0
            r11 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            com.anthropic.claude.api.chat.ChatConversationWithProjectReference r1 = com.anthropic.claude.api.chat.ChatConversationWithProjectReference.m200copyu2nbJzk$default(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            r2.E = r7
            r2.F = r7
            r2.G = r7
            r2.J = r4
            java.lang.Object r0 = r0.g(r1, r5, r2)
            if (r0 != r8) goto L9b
        L9a:
            return r8
        L9b:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hq4.u(hq4, java.lang.String, java.util.List, java.lang.String, vp4):java.lang.Object");
    }

    @Override // defpackage.iib
    default Object a(String str, d8a d8aVar, String str2, tp4 tp4Var) {
        return u(this, str, d8aVar, str2, (vp4) tp4Var);
    }

    kdg b(ft2 ft2Var);

    Object c(String str, List list, vp4 vp4Var);

    Object d(String str, vp4 vp4Var);

    Object e(ft2 ft2Var, List list, boolean z, vp4 vp4Var);

    Object f(ft2 ft2Var, String str, vp4 vp4Var);

    Object g(ChatConversationWithProjectReference chatConversationWithProjectReference, boolean z, vp4 vp4Var);

    Object h(Set set, vp4 vp4Var);

    Object i(vp4 vp4Var, String str, boolean z);

    Object j(List list, tp4 tp4Var);

    default Object k(String str, List list, String str2, String str3, tp4 tp4Var) {
        return Boolean.FALSE;
    }

    default List l(ft2 ft2Var) {
        ft2Var.getClass();
        kdg kdgVarB = b(ft2Var);
        ArrayList arrayList = new ArrayList();
        Iterator<E> it = kdgVarB.iterator();
        while (it.hasNext()) {
            ChatConversationWithProjectReference chatConversationWithProjectReferenceT = t(((ChatId) it.next()).m984unboximpl());
            if (chatConversationWithProjectReferenceT != null) {
                arrayList.add(chatConversationWithProjectReferenceT);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (!((ChatConversationWithProjectReference) obj).is_temporary()) {
                arrayList2.add(obj);
            }
        }
        return w44.i1(arrayList2, new iec(2));
    }

    Object m(String str, tp4 tp4Var);

    default Object n(q60 q60Var) {
        return iei.a;
    }

    boolean o(String str);

    default Object p(Collection collection, tp4 tp4Var) {
        return um6.E;
    }

    Object q(bt2 bt2Var, String str, tp4 tp4Var);

    Object r(ft2 ft2Var, vp4 vp4Var);

    boolean s();

    ChatConversationWithProjectReference t(String str);

    Object v(String str, boolean z, bz7 bz7Var, vp4 vp4Var);
}
