package defpackage;

import com.anthropic.claude.api.chat.ChatConversationWithProjectReference;
import com.anthropic.claude.types.strings.ChatId;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class xz8 implements hq4 {
    public final fj0 a = new fj0(wl0.I, xn5.a);
    public final ConcurrentHashMap b = new ConcurrentHashMap();

    @Override // defpackage.hq4
    public final kdg b(ft2 ft2Var) {
        ft2Var.getClass();
        return w(ft2Var);
    }

    @Override // defpackage.hq4
    public final Object c(String str, List list, vp4 vp4Var) {
        return iei.a;
    }

    @Override // defpackage.hq4
    public final Object d(String str, vp4 vp4Var) {
        this.a.D(ChatId.m978boximpl(str));
        Collection collectionValues = this.b.values();
        collectionValues.getClass();
        Iterator it = collectionValues.iterator();
        while (it.hasNext()) {
            ((kdg) it.next()).remove(ChatId.m978boximpl(str));
        }
        return iei.a;
    }

    @Override // defpackage.hq4
    public final Object e(ft2 ft2Var, List list, boolean z, vp4 vp4Var) {
        kwb kwbVarC;
        rcg rcgVarJ = ycg.j();
        kwb kwbVar = rcgVarJ instanceof kwb ? (kwb) rcgVarJ : null;
        if (kwbVar == null || (kwbVarC = kwbVar.C(null, null)) == null) {
            sz6.j("Cannot create a mutable snapshot of an read-only snapshot");
            return null;
        }
        try {
            rcg rcgVarJ2 = kwbVarC.j();
            if (z) {
                try {
                    List<ChatConversationWithProjectReference> list2 = list;
                    ArrayList arrayList = new ArrayList(x44.y(list2, 10));
                    for (ChatConversationWithProjectReference chatConversationWithProjectReference : list2) {
                        ChatConversationWithProjectReference chatConversationWithProjectReferenceT = t(chatConversationWithProjectReference.m209getUuidRjYBDck());
                        if (chatConversationWithProjectReferenceT != null) {
                            chatConversationWithProjectReference = chatConversationWithProjectReferenceT;
                        }
                        arrayList.add(chatConversationWithProjectReference);
                    }
                    list = arrayList;
                } catch (Throwable th) {
                    rcg.q(rcgVarJ2);
                    throw th;
                }
            }
            List listP1 = w44.p1(this.a.T(list));
            kdg kdgVarW = w(ft2Var);
            kdgVarW.clear();
            List list3 = listP1;
            ArrayList arrayList2 = new ArrayList(x44.y(list3, 10));
            Iterator it = list3.iterator();
            while (it.hasNext()) {
                arrayList2.add(ChatId.m978boximpl(((ChatConversationWithProjectReference) it.next()).m209getUuidRjYBDck()));
            }
            kdgVarW.addAll(arrayList2);
            rcg.q(rcgVarJ2);
            kwbVarC.w().p();
            return listP1;
        } finally {
        }
    }

    @Override // defpackage.hq4
    public final Object f(ft2 ft2Var, String str, vp4 vp4Var) {
        kdg kdgVarW = w(ft2Var);
        if (!kdgVarW.contains(ChatId.m978boximpl(str))) {
            kdgVarW.add(0, ChatId.m978boximpl(str));
        }
        return iei.a;
    }

    @Override // defpackage.hq4
    public final Object g(ChatConversationWithProjectReference chatConversationWithProjectReference, boolean z, vp4 vp4Var) {
        return this.a.S(chatConversationWithProjectReference);
    }

    /* JADX WARN: Finally extract failed */
    @Override // defpackage.hq4
    public final Object h(Set set, vp4 vp4Var) {
        kwb kwbVarC;
        rcg rcgVarJ = ycg.j();
        kwb kwbVar = rcgVarJ instanceof kwb ? (kwb) rcgVarJ : null;
        if (kwbVar == null || (kwbVarC = kwbVar.C(null, null)) == null) {
            sz6.j("Cannot create a mutable snapshot of an read-only snapshot");
            return null;
        }
        try {
            rcg rcgVarJ2 = kwbVarC.j();
            try {
                this.a.E(new u74(1, set));
                Collection collectionValues = this.b.values();
                collectionValues.getClass();
                Iterator it = collectionValues.iterator();
                while (it.hasNext()) {
                    ((kdg) it.next()).removeAll(set);
                }
                kwbVarC.w().p();
                kwbVarC.c();
                return iei.a;
            } finally {
                rcg.q(rcgVarJ2);
            }
        } finally {
        }
    }

    @Override // defpackage.hq4
    public final Object i(vp4 vp4Var, String str, boolean z) {
        ChatId chatIdM978boximpl = ChatId.m978boximpl(str);
        fj0 fj0Var = this.a;
        ChatConversationWithProjectReference chatConversationWithProjectReference = (ChatConversationWithProjectReference) ((mdg) fj0Var.G).get(chatIdM978boximpl);
        iei ieiVar = iei.a;
        if (chatConversationWithProjectReference != null) {
            fj0Var.S(ChatConversationWithProjectReference.m200copyu2nbJzk$default(chatConversationWithProjectReference, null, null, null, null, null, null, null, z, null, null, false, null, 3967, null));
            kdg kdgVarW = w(et2.a);
            if (!z) {
                kdgVarW.remove(ChatId.m978boximpl(str));
                return ieiVar;
            }
            if (!kdgVarW.contains(ChatId.m978boximpl(str))) {
                kdgVarW.add(0, ChatId.m978boximpl(str));
            }
        }
        return ieiVar;
    }

    @Override // defpackage.hq4
    public final Object j(List list, tp4 tp4Var) {
        List list2 = list;
        this.a.T(list2);
        kdg kdgVarW = w(ct2.a);
        Set setT1 = w44.t1(kdgVarW);
        ArrayList arrayList = new ArrayList(x44.y(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(ChatId.m978boximpl(((ChatConversationWithProjectReference) it.next()).m209getUuidRjYBDck()));
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (!setT1.contains(ChatId.m978boximpl(((ChatId) obj).m984unboximpl()))) {
                arrayList2.add(obj);
            }
        }
        kdgVarW.addAll(arrayList2);
        return iei.a;
    }

    @Override // defpackage.hq4
    public final Object m(String str, tp4 tp4Var) {
        return null;
    }

    @Override // defpackage.hq4
    public final boolean o(String str) {
        str.getClass();
        return ((mdg) this.a.G).containsKey(ChatId.m978boximpl(str));
    }

    @Override // defpackage.hq4
    public final Object q(bt2 bt2Var, String str, tp4 tp4Var) {
        w(bt2Var).remove(ChatId.m978boximpl(str));
        return iei.a;
    }

    @Override // defpackage.hq4
    public final Object r(ft2 ft2Var, vp4 vp4Var) {
        return iei.a;
    }

    @Override // defpackage.hq4
    public final boolean s() {
        return false;
    }

    @Override // defpackage.hq4
    public final ChatConversationWithProjectReference t(String str) {
        str.getClass();
        return (ChatConversationWithProjectReference) ((mdg) this.a.G).get(ChatId.m978boximpl(str));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.hq4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object v(java.lang.String r4, boolean r5, defpackage.bz7 r6, defpackage.vp4 r7) {
        /*
            r3 = this;
            boolean r5 = r7 instanceof defpackage.wz8
            if (r5 == 0) goto L13
            r5 = r7
            wz8 r5 = (defpackage.wz8) r5
            int r0 = r5.H
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r5.H = r0
            goto L18
        L13:
            wz8 r5 = new wz8
            r5.<init>(r3, r7)
        L18:
            java.lang.Object r7 = r5.F
            int r0 = r5.H
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L2e
            if (r0 != r1) goto L28
            com.anthropic.claude.api.chat.ChatConversationWithProjectReference r3 = r5.E
            defpackage.sf5.h0(r7)
            return r3
        L28:
            java.lang.String r3 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r3)
            return r2
        L2e:
            defpackage.sf5.h0(r7)
            com.anthropic.claude.api.chat.ChatConversationWithProjectReference r4 = r3.t(r4)
            if (r4 != 0) goto L38
            return r2
        L38:
            java.lang.Object r4 = r6.invoke(r4)
            com.anthropic.claude.api.chat.ChatConversationWithProjectReference r4 = (com.anthropic.claude.api.chat.ChatConversationWithProjectReference) r4
            r5.E = r4
            r5.H = r1
            fj0 r3 = r3.a
            java.lang.Object r5 = r3.G
            mdg r5 = (defpackage.mdg) r5
            java.lang.Object r3 = r3.E
            bz7 r3 = (defpackage.bz7) r3
            java.lang.Object r3 = r3.invoke(r4)
            r5.put(r3, r4)
            iei r3 = defpackage.iei.a
            m45 r5 = defpackage.m45.E
            if (r3 != r5) goto L5a
            return r5
        L5a:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xz8.v(java.lang.String, boolean, bz7, vp4):java.lang.Object");
    }

    public final kdg w(ft2 ft2Var) {
        Object objComputeIfAbsent = this.b.computeIfAbsent(ft2Var, new uc8(1, new fg7(20)));
        objComputeIfAbsent.getClass();
        return (kdg) objComputeIfAbsent;
    }

    public final List x(Collection collection) {
        Collection collectionY = this.a.y();
        ArrayList arrayList = new ArrayList();
        for (Object obj : collectionY) {
            if (collection.contains(ChatId.m978boximpl(((ChatConversationWithProjectReference) obj).m209getUuidRjYBDck()))) {
                arrayList.add(obj);
            }
        }
        return w44.p1(arrayList);
    }
}
