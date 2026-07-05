package com.anthropic.claude.api.chat;

import com.anthropic.claude.types.strings.ChatId;
import com.anthropic.claude.types.strings.ProjectId;
import defpackage.emd;
import defpackage.gvj;
import defpackage.kw9;
import defpackage.lsb;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.msb;
import defpackage.nsb;
import defpackage.onf;
import defpackage.ulb;
import defpackage.uo0;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.vs2;
import defpackage.w1a;
import defpackage.yb5;
import defpackage.znf;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0002,-B\u001f\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB5\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ,\u0010\u001e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010\u001aJ\u0010\u0010!\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b(\u0010\u0018R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b*\u0010\u001a¨\u0006."}, d2 = {"Lcom/anthropic/claude/api/chat/MoveChatsRequest;", "", "", "Lcom/anthropic/claude/types/strings/ChatId;", "conversation_uuids", "Lcom/anthropic/claude/types/strings/ProjectId;", "project_uuid", "<init>", "(Ljava/util/List;Ljava/lang/String;Lmq5;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/lang/String;Lvnf;Lmq5;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/chat/MoveChatsRequest;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/util/List;", "component2-v-f-JkQ", "()Ljava/lang/String;", "component2", "copy-_UmhM2c", "(Ljava/util/List;Ljava/lang/String;)Lcom/anthropic/claude/api/chat/MoveChatsRequest;", "copy", "", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getConversation_uuids", "Ljava/lang/String;", "getProject_uuid-v-f-JkQ", "Companion", "lsb", "msb", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf(with = nsb.class)
public final /* data */ class MoveChatsRequest {
    public static final int $stable = 0;
    private final List<ChatId> conversation_uuids;
    private final String project_uuid;
    public static final msb Companion = new msb();
    private static final kw9[] $childSerializers = {yb5.w(w1a.F, new ulb(25)), null};

    private /* synthetic */ MoveChatsRequest(int i, List list, String str, vnf vnfVar) {
        if (3 != (i & 3)) {
            gvj.f(i, 3, lsb.a.getDescriptor());
            throw null;
        }
        this.conversation_uuids = list;
        this.project_uuid = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new uo0(vs2.a, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: copy-_UmhM2c$default, reason: not valid java name */
    public static /* synthetic */ MoveChatsRequest m254copy_UmhM2c$default(MoveChatsRequest moveChatsRequest, List list, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            list = moveChatsRequest.conversation_uuids;
        }
        if ((i & 2) != 0) {
            str = moveChatsRequest.project_uuid;
        }
        return moveChatsRequest.m256copy_UmhM2c(list, str);
    }

    public static final /* synthetic */ void write$Self$api(MoveChatsRequest self, vd4 output, SerialDescriptor serialDesc) {
        output.r(serialDesc, 0, (znf) $childSerializers[0].getValue(), self.conversation_uuids);
        emd emdVar = emd.a;
        String str = self.project_uuid;
        output.B(serialDesc, 1, emdVar, str != null ? ProjectId.m1079boximpl(str) : null);
    }

    public final List<ChatId> component1() {
        return this.conversation_uuids;
    }

    /* JADX INFO: renamed from: component2-v-f-JkQ, reason: not valid java name and from getter */
    public final String getProject_uuid() {
        return this.project_uuid;
    }

    /* JADX INFO: renamed from: copy-_UmhM2c, reason: not valid java name */
    public final MoveChatsRequest m256copy_UmhM2c(List<ChatId> conversation_uuids, String project_uuid) {
        conversation_uuids.getClass();
        return new MoveChatsRequest(conversation_uuids, project_uuid, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0021  */
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
            boolean r1 = r5 instanceof com.anthropic.claude.api.chat.MoveChatsRequest
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.anthropic.claude.api.chat.MoveChatsRequest r5 = (com.anthropic.claude.api.chat.MoveChatsRequest) r5
            java.util.List<com.anthropic.claude.types.strings.ChatId> r1 = r4.conversation_uuids
            java.util.List<com.anthropic.claude.types.strings.ChatId> r3 = r5.conversation_uuids
            boolean r1 = defpackage.x44.r(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.lang.String r4 = r4.project_uuid
            java.lang.String r5 = r5.project_uuid
            if (r4 != 0) goto L23
            if (r5 != 0) goto L21
            r4 = r0
            goto L2a
        L21:
            r4 = r2
            goto L2a
        L23:
            if (r5 != 0) goto L26
            goto L21
        L26:
            boolean r4 = com.anthropic.claude.types.strings.ProjectId.m1082equalsimpl0(r4, r5)
        L2a:
            if (r4 != 0) goto L2d
            return r2
        L2d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anthropic.claude.api.chat.MoveChatsRequest.equals(java.lang.Object):boolean");
    }

    public final List<ChatId> getConversation_uuids() {
        return this.conversation_uuids;
    }

    /* JADX INFO: renamed from: getProject_uuid-v-f-JkQ, reason: not valid java name */
    public final String m257getProject_uuidvfJkQ() {
        return this.project_uuid;
    }

    public int hashCode() {
        int iHashCode = this.conversation_uuids.hashCode() * 31;
        String str = this.project_uuid;
        return iHashCode + (str == null ? 0 : ProjectId.m1083hashCodeimpl(str));
    }

    public String toString() {
        List<ChatId> list = this.conversation_uuids;
        String str = this.project_uuid;
        return "MoveChatsRequest(conversation_uuids=" + list + ", project_uuid=" + (str == null ? "null" : ProjectId.m1084toStringimpl(str)) + ")";
    }

    public /* synthetic */ MoveChatsRequest(List list, String str, mq5 mq5Var) {
        this(list, str);
    }

    public /* synthetic */ MoveChatsRequest(int i, List list, String str, vnf vnfVar, mq5 mq5Var) {
        this(i, list, str, vnfVar);
    }

    private MoveChatsRequest(List<ChatId> list, String str) {
        list.getClass();
        this.conversation_uuids = list;
        this.project_uuid = str;
    }
}
