package com.anthropic.claude.protos.push;

import com.anthropic.claude.api.login.VerifyMagicLinkRequest;
import defpackage.mdj;
import defpackage.tp4;
import defpackage.vp4;
import defpackage.wn5;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\u001a$\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0086@¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/anthropic/claude/protos/push/LoggedInPushOperationsService;", "Lujb;", VerifyMagicLinkRequest.Credentials.DISCRIMINATOR, "Lcom/squareup/wire/AnyMessage;", "rawRequest", "", "inlineDispatchRequest", "(Lcom/anthropic/claude/protos/push/LoggedInPushOperationsService;Lujb;Lcom/squareup/wire/AnyMessage;Ltp4;)Ljava/lang/Object;", "Claude:protos"}, k = 2, mv = {2, 4, 0}, xi = mdj.f)
public final class OperationsClaudeRpcKt {

    /* JADX INFO: renamed from: com.anthropic.claude.protos.push.OperationsClaudeRpcKt$inlineDispatchRequest$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 4, 0}, xi = mdj.f)
    @wn5(c = "com.anthropic.claude.protos.push.OperationsClaudeRpcKt", f = "OperationsClaudeRpc.kt", l = {109, 115, 121, 127, 133, 139}, m = "inlineDispatchRequest", v = 2)
    public static final class AnonymousClass1 extends vp4 {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(tp4<? super AnonymousClass1> tp4Var) {
            super(tp4Var);
        }

        @Override // defpackage.vd1
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return OperationsClaudeRpcKt.inlineDispatchRequest(null, null, null, this);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00d4, code lost:
    
        if (r4.openChat(r5, r0) == r3) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00fc, code lost:
    
        if (r4.openCodeSession(r5, r0) == r3) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0124, code lost:
    
        if (r4.openCoworkSession(r5, r0) == r3) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x014c, code lost:
    
        if (r4.openDispatch(r5, r0) == r3) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0173, code lost:
    
        if (r4.openOrbit(r5, r0) == r3) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x019a, code lost:
    
        if (r4.conwayWake(r5, r0) == r3) goto L59;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object inlineDispatchRequest(com.anthropic.claude.protos.push.LoggedInPushOperationsService r4, defpackage.ujb r5, com.squareup.wire.AnyMessage r6, defpackage.tp4<java.lang.Object> r7) throws anthropic.claude.ServiceException {
        /*
            Method dump skipped, instruction units count: 462
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anthropic.claude.protos.push.OperationsClaudeRpcKt.inlineDispatchRequest(com.anthropic.claude.protos.push.LoggedInPushOperationsService, ujb, com.squareup.wire.AnyMessage, tp4):java.lang.Object");
    }
}
