package com.anthropic.claude.wear;

import defpackage.iei;
import defpackage.l45;
import defpackage.pz7;
import defpackage.tp4;
import defpackage.xzg;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends xzg implements pz7 {
    public int E;
    public /* synthetic */ Object F;
    public final /* synthetic */ PhoneWearableListenerService G;
    public final /* synthetic */ String H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(PhoneWearableListenerService phoneWearableListenerService, String str, tp4 tp4Var) {
        super(2, tp4Var);
        this.G = phoneWearableListenerService;
        this.H = str;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        g gVar = new g(this.G, this.H, tp4Var);
        gVar.F = obj;
        return gVar;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        return ((g) create((l45) obj, (tp4) obj2)).invokeSuspend(iei.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x01b2, code lost:
    
        if (com.anthropic.claude.wear.PhoneWearableListenerService.g(r0, r9, "/claude/auth-sync", r14, r13) != r10) goto L83;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006b A[Catch: Exception -> 0x0031, TryCatch #1 {Exception -> 0x0031, blocks: (B:13:0x002c, B:40:0x00e6, B:43:0x00f5, B:44:0x0104, B:46:0x010a, B:47:0x011a, B:49:0x0120, B:50:0x012b, B:52:0x0131, B:16:0x0034, B:24:0x005c, B:27:0x006b, B:28:0x007a, B:30:0x0080, B:31:0x0090, B:33:0x0096, B:34:0x00b0, B:36:0x00b6, B:19:0x003b, B:21:0x0041, B:37:0x00c2), top: B:85:0x0015, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f5 A[Catch: Exception -> 0x0031, TryCatch #1 {Exception -> 0x0031, blocks: (B:13:0x002c, B:40:0x00e6, B:43:0x00f5, B:44:0x0104, B:46:0x010a, B:47:0x011a, B:49:0x0120, B:50:0x012b, B:52:0x0131, B:16:0x0034, B:24:0x005c, B:27:0x006b, B:28:0x007a, B:30:0x0080, B:31:0x0090, B:33:0x0096, B:34:0x00b0, B:36:0x00b6, B:19:0x003b, B:21:0x0041, B:37:0x00c2), top: B:85:0x0015, outer: #0 }] */
    @Override // defpackage.vd1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instruction units count: 525
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anthropic.claude.wear.g.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
