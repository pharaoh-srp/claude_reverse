package com.anthropic.claude.chat.input.draft;

import com.anthropic.claude.api.chat.ChatCompletionRequest;
import com.anthropic.claude.api.chat.MessageAttachment;
import com.anthropic.claude.api.chat.MessageFile;
import com.anthropic.claude.types.strings.AccountId;
import com.anthropic.claude.types.strings.MessageId;
import com.anthropic.claude.types.strings.OrganizationId;
import com.pvporbit.freetype.FreeTypeConstants;
import defpackage.c69;
import defpackage.gvj;
import defpackage.kgh;
import defpackage.kw9;
import defpackage.l0e;
import defpackage.lm6;
import defpackage.lz1;
import defpackage.m0e;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.rod;
import defpackage.uh6;
import defpackage.uo0;
import defpackage.v40;
import defpackage.vb7;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.yb5;
import defpackage.zh6;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0087\b\u0018\u0000 U2\u00020\u0001:\u0002VWBW\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0012\u0010\u0013Bq\b\u0010\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0012\u0010\u0018J\u0015\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\n¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\"\u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b \u0010!J\u0010\u0010#\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010'\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b%\u0010&J\u0010\u0010)\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b(\u0010&J\u0010\u0010+\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b*\u0010&J\u0010\u0010,\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b,\u0010-J\u0010\u00100\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b.\u0010/J\u0016\u00101\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eHÆ\u0003¢\u0006\u0004\b1\u00102J\u0012\u00104\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b3\u0010&Jj\u00107\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b5\u00106J\u0010\u00109\u001a\u000208HÖ\u0001¢\u0006\u0004\b9\u0010&J\u0010\u0010:\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b:\u0010;J\u001a\u0010=\u001a\u00020\u001a2\b\u0010<\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b=\u0010>J'\u0010G\u001a\u00020D2\u0006\u0010?\u001a\u00020\u00002\u0006\u0010A\u001a\u00020@2\u0006\u0010C\u001a\u00020BH\u0001¢\u0006\u0004\bE\u0010FR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010H\u001a\u0004\bI\u0010$R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010J\u001a\u0004\bK\u0010&R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010J\u001a\u0004\bL\u0010&R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010J\u001a\u0004\bM\u0010&R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010N\u001a\u0004\bO\u0010-R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010P\u001a\u0004\bQ\u0010/R\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006¢\u0006\f\n\u0004\b\u0010\u0010R\u001a\u0004\bS\u00102R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010J\u001a\u0004\bT\u0010&¨\u0006X"}, d2 = {"Lcom/anthropic/claude/chat/input/draft/QueuedSendRequest;", "", "Lcom/anthropic/claude/api/chat/ChatCompletionRequest;", "request", "Lcom/anthropic/claude/types/strings/MessageId;", "expectedLeafMessageId", "Lcom/anthropic/claude/types/strings/AccountId;", "accountId", "Lcom/anthropic/claude/types/strings/OrganizationId;", "organizationId", "Lc69;", "createdAt", "Luh6;", "ttl", "", "Lcom/anthropic/claude/api/chat/MessageFile;", "inputFiles", "editMessageParentId", "<init>", "(Lcom/anthropic/claude/api/chat/ChatCompletionRequest;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lc69;JLjava/util/List;Ljava/lang/String;Lmq5;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILcom/anthropic/claude/api/chat/ChatCompletionRequest;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lc69;Luh6;Ljava/util/List;Ljava/lang/String;Lvnf;Lmq5;)V", "now", "", "isExpired", "(Lc69;)Z", "Lcom/anthropic/claude/types/strings/ChatId;", "chatId", "Lcom/anthropic/claude/chat/input/draft/DraftMessage;", "toDraftMessage-2lyOXG8", "(Ljava/lang/String;)Lcom/anthropic/claude/chat/input/draft/DraftMessage;", "toDraftMessage", "component1", "()Lcom/anthropic/claude/api/chat/ChatCompletionRequest;", "component2-saiyK68", "()Ljava/lang/String;", "component2", "component3-islZJdo", "component3", "component4-XjkXN6I", "component4", "component5", "()Lc69;", "component6-UwyO8pc", "()J", "component6", "component7", "()Ljava/util/List;", "component8-saiyK68", "component8", "copy-aKn3eE8", "(Lcom/anthropic/claude/api/chat/ChatCompletionRequest;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lc69;JLjava/util/List;Ljava/lang/String;)Lcom/anthropic/claude/chat/input/draft/QueuedSendRequest;", "copy", "", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$input", "(Lcom/anthropic/claude/chat/input/draft/QueuedSendRequest;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Lcom/anthropic/claude/api/chat/ChatCompletionRequest;", "getRequest", "Ljava/lang/String;", "getExpectedLeafMessageId-saiyK68", "getAccountId-islZJdo", "getOrganizationId-XjkXN6I", "Lc69;", "getCreatedAt", "J", "getTtl-UwyO8pc", "Ljava/util/List;", "getInputFiles", "getEditMessageParentId-saiyK68", "Companion", "l0e", "m0e", "input"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class QueuedSendRequest {
    public static final int $stable = 0;
    private final String accountId;
    private final c69 createdAt;
    private final String editMessageParentId;
    private final String expectedLeafMessageId;
    private final List<MessageFile> inputFiles;
    private final String organizationId;
    private final ChatCompletionRequest request;
    private final long ttl;
    public static final m0e Companion = new m0e();
    private static final kw9[] $childSerializers = {null, null, null, null, null, null, yb5.w(w1a.F, new rod(14)), null};

    private /* synthetic */ QueuedSendRequest(int i, ChatCompletionRequest chatCompletionRequest, String str, String str2, String str3, c69 c69Var, uh6 uh6Var, List list, String str4, vnf vnfVar) {
        long jQ;
        if (31 != (i & 31)) {
            gvj.f(i, 31, l0e.a.getDescriptor());
            throw null;
        }
        this.request = chatCompletionRequest;
        this.expectedLeafMessageId = str;
        this.accountId = str2;
        this.organizationId = str3;
        this.createdAt = c69Var;
        if ((i & 32) == 0) {
            lz1 lz1Var = uh6.F;
            jQ = v40.Q(12, zh6.HOURS);
        } else {
            jQ = uh6Var.E;
        }
        this.ttl = jQ;
        if ((i & 64) == 0) {
            this.inputFiles = lm6.E;
        } else {
            this.inputFiles = list;
        }
        if ((i & FreeTypeConstants.FT_LOAD_PEDANTIC) == 0) {
            this.editMessageParentId = null;
        } else {
            this.editMessageParentId = str4;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new uo0(MessageFile.Companion.serializer(), 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: copy-aKn3eE8$default, reason: not valid java name */
    public static /* synthetic */ QueuedSendRequest m660copyaKn3eE8$default(QueuedSendRequest queuedSendRequest, ChatCompletionRequest chatCompletionRequest, String str, String str2, String str3, c69 c69Var, long j, List list, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            chatCompletionRequest = queuedSendRequest.request;
        }
        if ((i & 2) != 0) {
            str = queuedSendRequest.expectedLeafMessageId;
        }
        if ((i & 4) != 0) {
            str2 = queuedSendRequest.accountId;
        }
        if ((i & 8) != 0) {
            str3 = queuedSendRequest.organizationId;
        }
        if ((i & 16) != 0) {
            c69Var = queuedSendRequest.createdAt;
        }
        if ((i & 32) != 0) {
            j = queuedSendRequest.ttl;
        }
        if ((i & 64) != 0) {
            list = queuedSendRequest.inputFiles;
        }
        if ((i & FreeTypeConstants.FT_LOAD_PEDANTIC) != 0) {
            str4 = queuedSendRequest.editMessageParentId;
        }
        long j2 = j;
        String str5 = str3;
        c69 c69Var2 = c69Var;
        String str6 = str2;
        return queuedSendRequest.m666copyaKn3eE8(chatCompletionRequest, str, str6, str5, c69Var2, j2, list, str4);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void write$Self$input(com.anthropic.claude.chat.input.draft.QueuedSendRequest r8, defpackage.vd4 r9, kotlinx.serialization.descriptors.SerialDescriptor r10) {
        /*
            kw9[] r0 = com.anthropic.claude.chat.input.draft.QueuedSendRequest.$childSerializers
            pm2 r1 = defpackage.pm2.a
            com.anthropic.claude.api.chat.ChatCompletionRequest r2 = r8.request
            r3 = 0
            r9.r(r10, r3, r1, r2)
            ehb r1 = defpackage.ehb.a
            java.lang.String r2 = r8.expectedLeafMessageId
            r3 = 0
            if (r2 == 0) goto L16
            com.anthropic.claude.types.strings.MessageId r2 = com.anthropic.claude.types.strings.MessageId.m1051boximpl(r2)
            goto L17
        L16:
            r2 = r3
        L17:
            r4 = 1
            r9.B(r10, r4, r1, r2)
            z7 r2 = defpackage.z7.a
            java.lang.String r4 = r8.accountId
            com.anthropic.claude.types.strings.AccountId r4 = com.anthropic.claude.types.strings.AccountId.m943boximpl(r4)
            r5 = 2
            r9.r(r10, r5, r2, r4)
            fkc r2 = defpackage.fkc.a
            java.lang.String r4 = r8.organizationId
            com.anthropic.claude.types.strings.OrganizationId r4 = com.anthropic.claude.types.strings.OrganizationId.m1065boximpl(r4)
            r5 = 3
            r9.r(r10, r5, r2, r4)
            g69 r2 = defpackage.g69.a
            c69 r4 = r8.createdAt
            r5 = 4
            r9.r(r10, r5, r2, r4)
            boolean r2 = r9.E(r10)
            if (r2 == 0) goto L42
            goto L54
        L42:
            long r4 = r8.ttl
            lz1 r2 = defpackage.uh6.F
            r2 = 12
            zh6 r6 = defpackage.zh6.HOURS
            long r6 = defpackage.v40.Q(r2, r6)
            boolean r2 = defpackage.uh6.e(r4, r6)
            if (r2 != 0) goto L61
        L54:
            yh6 r2 = defpackage.yh6.a
            long r4 = r8.ttl
            uh6 r6 = new uh6
            r6.<init>(r4)
            r4 = 5
            r9.r(r10, r4, r2, r6)
        L61:
            boolean r2 = r9.E(r10)
            if (r2 == 0) goto L68
            goto L72
        L68:
            java.util.List<com.anthropic.claude.api.chat.MessageFile> r2 = r8.inputFiles
            lm6 r4 = defpackage.lm6.E
            boolean r2 = defpackage.x44.r(r2, r4)
            if (r2 != 0) goto L80
        L72:
            r2 = 6
            r0 = r0[r2]
            java.lang.Object r0 = r0.getValue()
            znf r0 = (defpackage.znf) r0
            java.util.List<com.anthropic.claude.api.chat.MessageFile> r4 = r8.inputFiles
            r9.r(r10, r2, r0, r4)
        L80:
            boolean r0 = r9.E(r10)
            if (r0 == 0) goto L87
            goto L8b
        L87:
            java.lang.String r0 = r8.editMessageParentId
            if (r0 == 0) goto L97
        L8b:
            java.lang.String r8 = r8.editMessageParentId
            if (r8 == 0) goto L93
            com.anthropic.claude.types.strings.MessageId r3 = com.anthropic.claude.types.strings.MessageId.m1051boximpl(r8)
        L93:
            r8 = 7
            r9.B(r10, r8, r1, r3)
        L97:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anthropic.claude.chat.input.draft.QueuedSendRequest.write$Self$input(com.anthropic.claude.chat.input.draft.QueuedSendRequest, vd4, kotlinx.serialization.descriptors.SerialDescriptor):void");
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ChatCompletionRequest getRequest() {
        return this.request;
    }

    /* JADX INFO: renamed from: component2-saiyK68, reason: not valid java name and from getter */
    public final String getExpectedLeafMessageId() {
        return this.expectedLeafMessageId;
    }

    /* JADX INFO: renamed from: component3-islZJdo, reason: not valid java name and from getter */
    public final String getAccountId() {
        return this.accountId;
    }

    /* JADX INFO: renamed from: component4-XjkXN6I, reason: not valid java name and from getter */
    public final String getOrganizationId() {
        return this.organizationId;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final c69 getCreatedAt() {
        return this.createdAt;
    }

    /* JADX INFO: renamed from: component6-UwyO8pc, reason: not valid java name and from getter */
    public final long getTtl() {
        return this.ttl;
    }

    public final List<MessageFile> component7() {
        return this.inputFiles;
    }

    /* JADX INFO: renamed from: component8-saiyK68, reason: not valid java name and from getter */
    public final String getEditMessageParentId() {
        return this.editMessageParentId;
    }

    /* JADX INFO: renamed from: copy-aKn3eE8, reason: not valid java name */
    public final QueuedSendRequest m666copyaKn3eE8(ChatCompletionRequest request, String expectedLeafMessageId, String accountId, String organizationId, c69 createdAt, long ttl, List<? extends MessageFile> inputFiles, String editMessageParentId) {
        request.getClass();
        accountId.getClass();
        organizationId.getClass();
        createdAt.getClass();
        inputFiles.getClass();
        return new QueuedSendRequest(request, expectedLeafMessageId, accountId, organizationId, createdAt, ttl, inputFiles, editMessageParentId, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(java.lang.Object r8) {
        /*
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof com.anthropic.claude.chat.input.draft.QueuedSendRequest
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.anthropic.claude.chat.input.draft.QueuedSendRequest r8 = (com.anthropic.claude.chat.input.draft.QueuedSendRequest) r8
            com.anthropic.claude.api.chat.ChatCompletionRequest r1 = r7.request
            com.anthropic.claude.api.chat.ChatCompletionRequest r3 = r8.request
            boolean r1 = defpackage.x44.r(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.lang.String r1 = r7.expectedLeafMessageId
            java.lang.String r3 = r8.expectedLeafMessageId
            if (r1 != 0) goto L23
            if (r3 != 0) goto L21
            r1 = r0
            goto L2a
        L21:
            r1 = r2
            goto L2a
        L23:
            if (r3 != 0) goto L26
            goto L21
        L26:
            boolean r1 = com.anthropic.claude.types.strings.MessageId.m1054equalsimpl0(r1, r3)
        L2a:
            if (r1 != 0) goto L2d
            return r2
        L2d:
            java.lang.String r1 = r7.accountId
            java.lang.String r3 = r8.accountId
            boolean r1 = com.anthropic.claude.types.strings.AccountId.m946equalsimpl0(r1, r3)
            if (r1 != 0) goto L38
            return r2
        L38:
            java.lang.String r1 = r7.organizationId
            java.lang.String r3 = r8.organizationId
            boolean r1 = com.anthropic.claude.types.strings.OrganizationId.m1068equalsimpl0(r1, r3)
            if (r1 != 0) goto L43
            return r2
        L43:
            c69 r1 = r7.createdAt
            c69 r3 = r8.createdAt
            boolean r1 = defpackage.x44.r(r1, r3)
            if (r1 != 0) goto L4e
            return r2
        L4e:
            long r3 = r7.ttl
            long r5 = r8.ttl
            boolean r1 = defpackage.uh6.e(r3, r5)
            if (r1 != 0) goto L59
            return r2
        L59:
            java.util.List<com.anthropic.claude.api.chat.MessageFile> r1 = r7.inputFiles
            java.util.List<com.anthropic.claude.api.chat.MessageFile> r3 = r8.inputFiles
            boolean r1 = defpackage.x44.r(r1, r3)
            if (r1 != 0) goto L64
            return r2
        L64:
            java.lang.String r7 = r7.editMessageParentId
            java.lang.String r8 = r8.editMessageParentId
            if (r7 != 0) goto L70
            if (r8 != 0) goto L6e
            r7 = r0
            goto L77
        L6e:
            r7 = r2
            goto L77
        L70:
            if (r8 != 0) goto L73
            goto L6e
        L73:
            boolean r7 = com.anthropic.claude.types.strings.MessageId.m1054equalsimpl0(r7, r8)
        L77:
            if (r7 != 0) goto L7a
            return r2
        L7a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anthropic.claude.chat.input.draft.QueuedSendRequest.equals(java.lang.Object):boolean");
    }

    /* JADX INFO: renamed from: getAccountId-islZJdo, reason: not valid java name */
    public final String m667getAccountIdislZJdo() {
        return this.accountId;
    }

    public final c69 getCreatedAt() {
        return this.createdAt;
    }

    /* JADX INFO: renamed from: getEditMessageParentId-saiyK68, reason: not valid java name */
    public final String m668getEditMessageParentIdsaiyK68() {
        return this.editMessageParentId;
    }

    /* JADX INFO: renamed from: getExpectedLeafMessageId-saiyK68, reason: not valid java name */
    public final String m669getExpectedLeafMessageIdsaiyK68() {
        return this.expectedLeafMessageId;
    }

    public final List<MessageFile> getInputFiles() {
        return this.inputFiles;
    }

    /* JADX INFO: renamed from: getOrganizationId-XjkXN6I, reason: not valid java name */
    public final String m670getOrganizationIdXjkXN6I() {
        return this.organizationId;
    }

    public final ChatCompletionRequest getRequest() {
        return this.request;
    }

    /* JADX INFO: renamed from: getTtl-UwyO8pc, reason: not valid java name */
    public final long m671getTtlUwyO8pc() {
        return this.ttl;
    }

    public int hashCode() {
        int iHashCode = this.request.hashCode() * 31;
        String str = this.expectedLeafMessageId;
        int iHashCode2 = (this.createdAt.hashCode() + ((OrganizationId.m1069hashCodeimpl(this.organizationId) + ((AccountId.m947hashCodeimpl(this.accountId) + ((iHashCode + (str == null ? 0 : MessageId.m1055hashCodeimpl(str))) * 31)) * 31)) * 31)) * 31;
        long j = this.ttl;
        lz1 lz1Var = uh6.F;
        int iM = kgh.m(vb7.e(iHashCode2, 31, j), 31, this.inputFiles);
        String str2 = this.editMessageParentId;
        return iM + (str2 != null ? MessageId.m1055hashCodeimpl(str2) : 0);
    }

    public final boolean isExpired(c69 now) {
        now.getClass();
        return uh6.d(now.a(this.createdAt), this.ttl) > 0;
    }

    /* JADX INFO: renamed from: toDraftMessage-2lyOXG8, reason: not valid java name */
    public final DraftMessage m672toDraftMessage2lyOXG8(String chatId) {
        chatId.getClass();
        String prompt = this.request.getPrompt();
        List<MessageFile> list = this.inputFiles;
        List<MessageAttachment> attachments = this.request.getAttachments();
        if (attachments == null) {
            attachments = lm6.E;
        }
        return new DraftMessage(chatId, (String) null, prompt, list, attachments, this.request.getInput_mode(), this.editMessageParentId, (String) null, this, FreeTypeConstants.FT_LOAD_PEDANTIC, (mq5) null);
    }

    public String toString() {
        ChatCompletionRequest chatCompletionRequest = this.request;
        String str = this.expectedLeafMessageId;
        String strM1056toStringimpl = str == null ? "null" : MessageId.m1056toStringimpl(str);
        String strM948toStringimpl = AccountId.m948toStringimpl(this.accountId);
        String strM1070toStringimpl = OrganizationId.m1070toStringimpl(this.organizationId);
        c69 c69Var = this.createdAt;
        String strP = uh6.p(this.ttl);
        List<MessageFile> list = this.inputFiles;
        String str2 = this.editMessageParentId;
        String strM1056toStringimpl2 = str2 != null ? MessageId.m1056toStringimpl(str2) : "null";
        StringBuilder sb = new StringBuilder("QueuedSendRequest(request=");
        sb.append(chatCompletionRequest);
        sb.append(", expectedLeafMessageId=");
        sb.append(strM1056toStringimpl);
        sb.append(", accountId=");
        kgh.u(sb, strM948toStringimpl, ", organizationId=", strM1070toStringimpl, ", createdAt=");
        sb.append(c69Var);
        sb.append(", ttl=");
        sb.append(strP);
        sb.append(", inputFiles=");
        sb.append(list);
        sb.append(", editMessageParentId=");
        sb.append(strM1056toStringimpl2);
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ QueuedSendRequest(ChatCompletionRequest chatCompletionRequest, String str, String str2, String str3, c69 c69Var, long j, List list, String str4, mq5 mq5Var) {
        this(chatCompletionRequest, str, str2, str3, c69Var, j, list, str4);
    }

    public /* synthetic */ QueuedSendRequest(int i, ChatCompletionRequest chatCompletionRequest, String str, String str2, String str3, c69 c69Var, uh6 uh6Var, List list, String str4, vnf vnfVar, mq5 mq5Var) {
        this(i, chatCompletionRequest, str, str2, str3, c69Var, uh6Var, list, str4, vnfVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private QueuedSendRequest(ChatCompletionRequest chatCompletionRequest, String str, String str2, String str3, c69 c69Var, long j, List<? extends MessageFile> list, String str4) {
        chatCompletionRequest.getClass();
        str2.getClass();
        str3.getClass();
        c69Var.getClass();
        list.getClass();
        this.request = chatCompletionRequest;
        this.expectedLeafMessageId = str;
        this.accountId = str2;
        this.organizationId = str3;
        this.createdAt = c69Var;
        this.ttl = j;
        this.inputFiles = list;
        this.editMessageParentId = str4;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ QueuedSendRequest(ChatCompletionRequest chatCompletionRequest, String str, String str2, String str3, c69 c69Var, long j, List list, String str4, int i, mq5 mq5Var) {
        long jQ;
        if ((i & 32) != 0) {
            lz1 lz1Var = uh6.F;
            jQ = v40.Q(12, zh6.HOURS);
        } else {
            jQ = j;
        }
        this(chatCompletionRequest, str, str2, str3, c69Var, jQ, (i & 64) != 0 ? lm6.E : list, (i & FreeTypeConstants.FT_LOAD_PEDANTIC) != 0 ? null : str4, null);
    }
}
