package com.anthropic.claude.code.remote;

import com.anthropic.claude.code.remote.CodeSessionListScope;
import com.anthropic.claude.types.strings.SessionId;
import defpackage.fsf;
import defpackage.fsh;
import defpackage.fwc;
import defpackage.j34;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.o2c;
import defpackage.onf;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.wt3;
import defpackage.x44;
import defpackage.yb5;
import defpackage.znf;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000e\n\u0002\b\u0015\b\u0087\b\u0018\u0000 <2\u00020\u0001:\u0002=>B?\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rBA\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0012J'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b%\u0010&JH\u0010)\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\nHÆ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010+\u001a\u00020*HÖ\u0001¢\u0006\u0004\b+\u0010\u001dJ\u0010\u0010,\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b,\u0010-J\u001a\u0010/\u001a\u00020\u00042\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b/\u00100R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00101\u001a\u0004\b2\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00103\u001a\u0004\b\u0005\u0010 R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00104\u001a\u0004\b5\u0010\"R\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u00106\u0012\u0004\b8\u00109\u001a\u0004\b7\u0010$R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010:\u001a\u0004\b;\u0010&¨\u0006?"}, d2 = {"Lcom/anthropic/claude/code/remote/CodeRemoteSessionScreenParams;", "", "Lcom/anthropic/claude/types/strings/SessionId;", "sessionId", "", "isRootScreen", "Lcom/anthropic/claude/code/remote/NewCodeSessionPrefill;", "prefill", "Lfwc;", "pendingFirstMessage", "Lcom/anthropic/claude/code/remote/CodeSessionListScope;", "newSessionScope", "<init>", "(Ljava/lang/String;ZLcom/anthropic/claude/code/remote/NewCodeSessionPrefill;Lfwc;Lcom/anthropic/claude/code/remote/CodeSessionListScope;Lmq5;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;ZLcom/anthropic/claude/code/remote/NewCodeSessionPrefill;Lcom/anthropic/claude/code/remote/CodeSessionListScope;Lvnf;Lmq5;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$remote", "(Lcom/anthropic/claude/code/remote/CodeRemoteSessionScreenParams;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1-UFAIyc8", "()Ljava/lang/String;", "component1", "component2", "()Z", "component3", "()Lcom/anthropic/claude/code/remote/NewCodeSessionPrefill;", "component4", "()Lfwc;", "component5", "()Lcom/anthropic/claude/code/remote/CodeSessionListScope;", "copy-GRiloUc", "(Ljava/lang/String;ZLcom/anthropic/claude/code/remote/NewCodeSessionPrefill;Lfwc;Lcom/anthropic/claude/code/remote/CodeSessionListScope;)Lcom/anthropic/claude/code/remote/CodeRemoteSessionScreenParams;", "copy", "", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getSessionId-UFAIyc8", "Z", "Lcom/anthropic/claude/code/remote/NewCodeSessionPrefill;", "getPrefill", "Lfwc;", "getPendingFirstMessage", "getPendingFirstMessage$annotations", "()V", "Lcom/anthropic/claude/code/remote/CodeSessionListScope;", "getNewSessionScope", "Companion", "i34", "j34", "remote"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class CodeRemoteSessionScreenParams {
    public static final int $stable = 0;
    private final boolean isRootScreen;
    private final CodeSessionListScope newSessionScope;
    private final fwc pendingFirstMessage;
    private final NewCodeSessionPrefill prefill;
    private final String sessionId;
    public static final j34 Companion = new j34();
    private static final kw9[] $childSerializers = {null, null, null, yb5.w(w1a.F, new wt3(20))};

    private /* synthetic */ CodeRemoteSessionScreenParams(int i, String str, boolean z, NewCodeSessionPrefill newCodeSessionPrefill, CodeSessionListScope codeSessionListScope, vnf vnfVar) {
        if ((i & 1) == 0) {
            this.sessionId = null;
        } else {
            this.sessionId = str;
        }
        if ((i & 2) == 0) {
            this.isRootScreen = false;
        } else {
            this.isRootScreen = z;
        }
        if ((i & 4) == 0) {
            this.prefill = null;
        } else {
            this.prefill = newCodeSessionPrefill;
        }
        if ((i & 8) == 0) {
            this.newSessionScope = CodeSessionListScope.Code.INSTANCE;
        } else {
            this.newSessionScope = codeSessionListScope;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return CodeSessionListScope.Companion.serializer();
    }

    /* JADX INFO: renamed from: copy-GRiloUc$default, reason: not valid java name */
    public static /* synthetic */ CodeRemoteSessionScreenParams m695copyGRiloUc$default(CodeRemoteSessionScreenParams codeRemoteSessionScreenParams, String str, boolean z, NewCodeSessionPrefill newCodeSessionPrefill, fwc fwcVar, CodeSessionListScope codeSessionListScope, int i, Object obj) {
        if ((i & 1) != 0) {
            str = codeRemoteSessionScreenParams.sessionId;
        }
        if ((i & 2) != 0) {
            z = codeRemoteSessionScreenParams.isRootScreen;
        }
        if ((i & 4) != 0) {
            newCodeSessionPrefill = codeRemoteSessionScreenParams.prefill;
        }
        if ((i & 8) != 0) {
            codeRemoteSessionScreenParams.getClass();
            fwcVar = null;
        }
        if ((i & 16) != 0) {
            codeSessionListScope = codeRemoteSessionScreenParams.newSessionScope;
        }
        CodeSessionListScope codeSessionListScope2 = codeSessionListScope;
        NewCodeSessionPrefill newCodeSessionPrefill2 = newCodeSessionPrefill;
        return codeRemoteSessionScreenParams.m697copyGRiloUc(str, z, newCodeSessionPrefill2, fwcVar, codeSessionListScope2);
    }

    public static /* synthetic */ void getPendingFirstMessage$annotations() {
    }

    public static final /* synthetic */ void write$Self$remote(CodeRemoteSessionScreenParams self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        if (output.E(serialDesc) || self.sessionId != null) {
            fsf fsfVar = fsf.a;
            String str = self.sessionId;
            output.B(serialDesc, 0, fsfVar, str != null ? SessionId.m1114boximpl(str) : null);
        }
        if (output.E(serialDesc) || self.isRootScreen) {
            output.p(serialDesc, 1, self.isRootScreen);
        }
        if (output.E(serialDesc) || self.prefill != null) {
            output.B(serialDesc, 2, o2c.a, self.prefill);
        }
        if (!output.E(serialDesc) && x44.r(self.newSessionScope, CodeSessionListScope.Code.INSTANCE)) {
            return;
        }
        output.r(serialDesc, 3, (znf) kw9VarArr[3].getValue(), self.newSessionScope);
    }

    /* JADX INFO: renamed from: component1-UFAIyc8, reason: not valid java name and from getter */
    public final String getSessionId() {
        return this.sessionId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getIsRootScreen() {
        return this.isRootScreen;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final NewCodeSessionPrefill getPrefill() {
        return this.prefill;
    }

    public final fwc component4() {
        return null;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final CodeSessionListScope getNewSessionScope() {
        return this.newSessionScope;
    }

    /* JADX INFO: renamed from: copy-GRiloUc, reason: not valid java name */
    public final CodeRemoteSessionScreenParams m697copyGRiloUc(String sessionId, boolean isRootScreen, NewCodeSessionPrefill prefill, fwc pendingFirstMessage, CodeSessionListScope newSessionScope) {
        newSessionScope.getClass();
        return new CodeRemoteSessionScreenParams(sessionId, isRootScreen, prefill, pendingFirstMessage, newSessionScope, (mq5) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof com.anthropic.claude.code.remote.CodeRemoteSessionScreenParams
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.anthropic.claude.code.remote.CodeRemoteSessionScreenParams r5 = (com.anthropic.claude.code.remote.CodeRemoteSessionScreenParams) r5
            java.lang.String r1 = r4.sessionId
            java.lang.String r3 = r5.sessionId
            if (r1 != 0) goto L18
            if (r3 != 0) goto L16
            r1 = r0
            goto L1f
        L16:
            r1 = r2
            goto L1f
        L18:
            if (r3 != 0) goto L1b
            goto L16
        L1b:
            boolean r1 = com.anthropic.claude.types.strings.SessionId.m1117equalsimpl0(r1, r3)
        L1f:
            if (r1 != 0) goto L22
            return r2
        L22:
            boolean r1 = r4.isRootScreen
            boolean r3 = r5.isRootScreen
            if (r1 == r3) goto L29
            return r2
        L29:
            com.anthropic.claude.code.remote.NewCodeSessionPrefill r1 = r4.prefill
            com.anthropic.claude.code.remote.NewCodeSessionPrefill r3 = r5.prefill
            boolean r1 = defpackage.x44.r(r1, r3)
            if (r1 != 0) goto L34
            return r2
        L34:
            com.anthropic.claude.code.remote.CodeSessionListScope r4 = r4.newSessionScope
            com.anthropic.claude.code.remote.CodeSessionListScope r5 = r5.newSessionScope
            boolean r4 = defpackage.x44.r(r4, r5)
            if (r4 != 0) goto L3f
            return r2
        L3f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anthropic.claude.code.remote.CodeRemoteSessionScreenParams.equals(java.lang.Object):boolean");
    }

    public final CodeSessionListScope getNewSessionScope() {
        return this.newSessionScope;
    }

    public final fwc getPendingFirstMessage() {
        return null;
    }

    public final NewCodeSessionPrefill getPrefill() {
        return this.prefill;
    }

    /* JADX INFO: renamed from: getSessionId-UFAIyc8, reason: not valid java name */
    public final String m698getSessionIdUFAIyc8() {
        return this.sessionId;
    }

    public int hashCode() {
        String str = this.sessionId;
        int iP = fsh.p((str == null ? 0 : SessionId.m1118hashCodeimpl(str)) * 31, 31, this.isRootScreen);
        NewCodeSessionPrefill newCodeSessionPrefill = this.prefill;
        return this.newSessionScope.hashCode() + ((iP + (newCodeSessionPrefill != null ? newCodeSessionPrefill.hashCode() : 0)) * 961);
    }

    public final boolean isRootScreen() {
        return this.isRootScreen;
    }

    public String toString() {
        String str = this.sessionId;
        return "CodeRemoteSessionScreenParams(sessionId=" + (str == null ? "null" : SessionId.m1119toStringimpl(str)) + ", isRootScreen=" + this.isRootScreen + ", prefill=" + this.prefill + ", pendingFirstMessage=null, newSessionScope=" + this.newSessionScope + ")";
    }

    public /* synthetic */ CodeRemoteSessionScreenParams(String str, boolean z, NewCodeSessionPrefill newCodeSessionPrefill, fwc fwcVar, CodeSessionListScope codeSessionListScope, mq5 mq5Var) {
        this(str, z, newCodeSessionPrefill, fwcVar, codeSessionListScope);
    }

    public /* synthetic */ CodeRemoteSessionScreenParams(int i, String str, boolean z, NewCodeSessionPrefill newCodeSessionPrefill, CodeSessionListScope codeSessionListScope, vnf vnfVar, mq5 mq5Var) {
        this(i, str, z, newCodeSessionPrefill, codeSessionListScope, vnfVar);
    }

    private CodeRemoteSessionScreenParams(String str, boolean z, NewCodeSessionPrefill newCodeSessionPrefill, fwc fwcVar, CodeSessionListScope codeSessionListScope) {
        codeSessionListScope.getClass();
        this.sessionId = str;
        this.isRootScreen = z;
        this.prefill = newCodeSessionPrefill;
        this.newSessionScope = codeSessionListScope;
    }

    public /* synthetic */ CodeRemoteSessionScreenParams(String str, boolean z, NewCodeSessionPrefill newCodeSessionPrefill, fwc fwcVar, CodeSessionListScope codeSessionListScope, int i, mq5 mq5Var) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? false : z, (i & 4) != 0 ? null : newCodeSessionPrefill, (i & 8) != 0 ? null : fwcVar, (i & 16) != 0 ? CodeSessionListScope.Code.INSTANCE : codeSessionListScope, (mq5) null);
    }
}
