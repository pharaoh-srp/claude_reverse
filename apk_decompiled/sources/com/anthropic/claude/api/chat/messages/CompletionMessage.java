package com.anthropic.claude.api.chat.messages;

import com.anthropic.claude.types.strings.MessageId;
import defpackage.ehb;
import defpackage.g94;
import defpackage.ij0;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.vd4;
import defpackage.vnf;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0002)*B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0016J(\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0016J\u0010\u0010\u001f\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0016R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010%\u001a\u0004\b'\u0010\u0016¨\u0006+"}, d2 = {"Lcom/anthropic/claude/api/chat/messages/CompletionMessage;", "", "Lcom/anthropic/claude/types/strings/MessageId;", "uuid", "parent_uuid", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lmq5;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lvnf;Lmq5;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/chat/messages/CompletionMessage;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1-saiyK68", "()Ljava/lang/String;", "component1", "component2-saiyK68", "component2", "copy-EdOOLPo", "(Ljava/lang/String;Ljava/lang/String;)Lcom/anthropic/claude/api/chat/messages/CompletionMessage;", "copy", "", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getUuid-saiyK68", "getParent_uuid-saiyK68", "Companion", "f94", "g94", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class CompletionMessage {
    public static final int $stable = 0;
    public static final g94 Companion = new g94();
    private final String parent_uuid;
    private final String uuid;

    private /* synthetic */ CompletionMessage(int i, String str, String str2, vnf vnfVar) {
        if ((i & 1) == 0) {
            this.uuid = null;
        } else {
            this.uuid = str;
        }
        if ((i & 2) == 0) {
            this.parent_uuid = null;
        } else {
            this.parent_uuid = str2;
        }
    }

    /* JADX INFO: renamed from: copy-EdOOLPo$default, reason: not valid java name */
    public static /* synthetic */ CompletionMessage m288copyEdOOLPo$default(CompletionMessage completionMessage, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = completionMessage.uuid;
        }
        if ((i & 2) != 0) {
            str2 = completionMessage.parent_uuid;
        }
        return completionMessage.m291copyEdOOLPo(str, str2);
    }

    public static final /* synthetic */ void write$Self$api(CompletionMessage self, vd4 output, SerialDescriptor serialDesc) {
        if (output.E(serialDesc) || self.uuid != null) {
            ehb ehbVar = ehb.a;
            String str = self.uuid;
            output.B(serialDesc, 0, ehbVar, str != null ? MessageId.m1051boximpl(str) : null);
        }
        if (!output.E(serialDesc) && self.parent_uuid == null) {
            return;
        }
        ehb ehbVar2 = ehb.a;
        String str2 = self.parent_uuid;
        output.B(serialDesc, 1, ehbVar2, str2 != null ? MessageId.m1051boximpl(str2) : null);
    }

    /* JADX INFO: renamed from: component1-saiyK68, reason: not valid java name and from getter */
    public final String getUuid() {
        return this.uuid;
    }

    /* JADX INFO: renamed from: component2-saiyK68, reason: not valid java name and from getter */
    public final String getParent_uuid() {
        return this.parent_uuid;
    }

    /* JADX INFO: renamed from: copy-EdOOLPo, reason: not valid java name */
    public final CompletionMessage m291copyEdOOLPo(String uuid, String parent_uuid) {
        return new CompletionMessage(uuid, parent_uuid, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0016  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x002c  */
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
            boolean r1 = r5 instanceof com.anthropic.claude.api.chat.messages.CompletionMessage
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.anthropic.claude.api.chat.messages.CompletionMessage r5 = (com.anthropic.claude.api.chat.messages.CompletionMessage) r5
            java.lang.String r1 = r4.uuid
            java.lang.String r3 = r5.uuid
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
            boolean r1 = com.anthropic.claude.types.strings.MessageId.m1054equalsimpl0(r1, r3)
        L1f:
            if (r1 != 0) goto L22
            return r2
        L22:
            java.lang.String r4 = r4.parent_uuid
            java.lang.String r5 = r5.parent_uuid
            if (r4 != 0) goto L2e
            if (r5 != 0) goto L2c
            r4 = r0
            goto L35
        L2c:
            r4 = r2
            goto L35
        L2e:
            if (r5 != 0) goto L31
            goto L2c
        L31:
            boolean r4 = com.anthropic.claude.types.strings.MessageId.m1054equalsimpl0(r4, r5)
        L35:
            if (r4 != 0) goto L38
            return r2
        L38:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anthropic.claude.api.chat.messages.CompletionMessage.equals(java.lang.Object):boolean");
    }

    /* JADX INFO: renamed from: getParent_uuid-saiyK68, reason: not valid java name */
    public final String m292getParent_uuidsaiyK68() {
        return this.parent_uuid;
    }

    /* JADX INFO: renamed from: getUuid-saiyK68, reason: not valid java name */
    public final String m293getUuidsaiyK68() {
        return this.uuid;
    }

    public int hashCode() {
        String str = this.uuid;
        int iM1055hashCodeimpl = (str == null ? 0 : MessageId.m1055hashCodeimpl(str)) * 31;
        String str2 = this.parent_uuid;
        return iM1055hashCodeimpl + (str2 != null ? MessageId.m1055hashCodeimpl(str2) : 0);
    }

    public String toString() {
        String str = this.uuid;
        String strM1056toStringimpl = str == null ? "null" : MessageId.m1056toStringimpl(str);
        String str2 = this.parent_uuid;
        return ij0.l("CompletionMessage(uuid=", strM1056toStringimpl, ", parent_uuid=", str2 != null ? MessageId.m1056toStringimpl(str2) : "null", ")");
    }

    public /* synthetic */ CompletionMessage(String str, String str2, mq5 mq5Var) {
        this(str, str2);
    }

    public /* synthetic */ CompletionMessage(int i, String str, String str2, vnf vnfVar, mq5 mq5Var) {
        this(i, str, str2, vnfVar);
    }

    private CompletionMessage(String str, String str2) {
        this.uuid = str;
        this.parent_uuid = str2;
    }

    public /* synthetic */ CompletionMessage(String str, String str2, int i, mq5 mq5Var) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, null);
    }
}
