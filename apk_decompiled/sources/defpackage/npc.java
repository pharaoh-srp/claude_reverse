package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class npc extends xzg implements rz7 {
    public int E;
    public /* synthetic */ float F;
    public final /* synthetic */ vpc G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public npc(vpc vpcVar, tp4 tp4Var) {
        super(3, tp4Var);
        this.G = vpcVar;
    }

    @Override // defpackage.rz7
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        float fFloatValue = ((Number) obj2).floatValue();
        npc npcVar = new npc(this.G, (tp4) obj3);
        npcVar.F = fFloatValue;
        return npcVar.invokeSuspend(iei.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
    @Override // defpackage.vd1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            int r0 = r6.E
            r1 = 0
            iei r2 = defpackage.iei.a
            r3 = 1
            if (r0 == 0) goto L14
            if (r0 != r3) goto Le
            defpackage.sf5.h0(r7)
            return r2
        Le:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r6)
            return r1
        L14:
            defpackage.sf5.h0(r7)
            float r7 = r6.F
            r6.E = r3
            vpc r0 = r6.G
            dvb r3 = r0.h
            int r3 = r3.b
            m45 r4 = defpackage.m45.E
            if (r3 != 0) goto L27
        L25:
            r6 = r2
            goto L36
        L27:
            fxb r3 = r0.m
            upc r5 = new upc
            r5.<init>(r0, r7, r1)
            zwb r7 = defpackage.zwb.G
            java.lang.Object r6 = r3.b(r7, r5, r6)
            if (r6 != r4) goto L25
        L36:
            if (r6 != r4) goto L39
            return r4
        L39:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.npc.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
