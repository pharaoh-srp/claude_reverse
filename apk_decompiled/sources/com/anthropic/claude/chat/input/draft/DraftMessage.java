package com.anthropic.claude.chat.input.draft;

import com.anthropic.claude.api.chat.InputMode;
import com.anthropic.claude.api.chat.MessageAttachment;
import com.anthropic.claude.api.chat.MessageFile;
import com.anthropic.claude.types.strings.ChatId;
import com.anthropic.claude.types.strings.MessageId;
import com.anthropic.claude.types.strings.ProjectId;
import com.pvporbit.freetype.FreeTypeConstants;
import defpackage.cb6;
import defpackage.db6;
import defpackage.ehb;
import defpackage.emd;
import defpackage.gvj;
import defpackage.h85;
import defpackage.kgh;
import defpackage.kw9;
import defpackage.l0e;
import defpackage.mdj;
import defpackage.meb;
import defpackage.mq5;
import defpackage.mv2;
import defpackage.o49;
import defpackage.onf;
import defpackage.qy1;
import defpackage.srg;
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

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0087\b\u0018\u0000 L2\u00020\u0001:\u0002MNBk\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015B\u0081\u0001\b\u0010\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u0014\u0010\u001aJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001cJ\u0010\u0010 \u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b \u0010\u001cJ\u0016\u0010!\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0016\u0010#\u001a\b\u0012\u0004\u0012\u00020\u000b0\bHÆ\u0003¢\u0006\u0004\b#\u0010\"J\u0012\u0010$\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0012\u0010'\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b&\u0010\u001cJ\u0012\u0010(\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b(\u0010\u001cJ\u0012\u0010)\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\b)\u0010*J\u0082\u0001\u0010-\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÆ\u0001¢\u0006\u0004\b+\u0010,J\u0010\u0010.\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b.\u0010\u001cJ\u0010\u0010/\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b/\u00100J\u001a\u00104\u001a\u0002032\b\u00102\u001a\u0004\u0018\u000101HÖ\u0003¢\u0006\u0004\b4\u00105J'\u0010>\u001a\u00020;2\u0006\u00106\u001a\u00020\u00002\u0006\u00108\u001a\u0002072\u0006\u0010:\u001a\u000209H\u0001¢\u0006\u0004\b<\u0010=R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010?\u001a\u0004\b@\u0010\u001cR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010?\u001a\u0004\bA\u0010\u001cR\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010?\u001a\u0004\bB\u0010\u001cR \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010C\u001a\u0004\bD\u0010\"R \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010C\u001a\u0004\bE\u0010\"R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010F\u001a\u0004\bG\u0010%R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010?\u001a\u0004\bH\u0010\u001cR\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0011\u0010?\u001a\u0004\bI\u0010\u001cR\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010J\u001a\u0004\bK\u0010*¨\u0006O"}, d2 = {"Lcom/anthropic/claude/chat/input/draft/DraftMessage;", "Lmv2;", "Lcom/anthropic/claude/types/strings/ChatId;", "chat_id", "Lcom/anthropic/claude/types/strings/ProjectId;", "project_id", "", "text", "", "Lcom/anthropic/claude/api/chat/MessageFile;", "files", "Lcom/anthropic/claude/api/chat/MessageAttachment;", "attachments", "Lcom/anthropic/claude/api/chat/InputMode;", "inputMode", "Lcom/anthropic/claude/types/strings/MessageId;", "editMessageParentId", "prefill_source", "Lcom/anthropic/claude/chat/input/draft/QueuedSendRequest;", "queuedSendRequest", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lcom/anthropic/claude/api/chat/InputMode;Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/chat/input/draft/QueuedSendRequest;Lmq5;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lcom/anthropic/claude/api/chat/InputMode;Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/chat/input/draft/QueuedSendRequest;Lvnf;Lmq5;)V", "component1-CAG_bmg", "()Ljava/lang/String;", "component1", "component2-v-f-JkQ", "component2", "component3", "component4", "()Ljava/util/List;", "component5", "component6", "()Lcom/anthropic/claude/api/chat/InputMode;", "component7-saiyK68", "component7", "component8", "component9", "()Lcom/anthropic/claude/chat/input/draft/QueuedSendRequest;", "copy-UKUR3NQ", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lcom/anthropic/claude/api/chat/InputMode;Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/chat/input/draft/QueuedSendRequest;)Lcom/anthropic/claude/chat/input/draft/DraftMessage;", "copy", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$input", "(Lcom/anthropic/claude/chat/input/draft/DraftMessage;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/String;", "getChat_id-CAG_bmg", "getProject_id-v-f-JkQ", "getText", "Ljava/util/List;", "getFiles", "getAttachments", "Lcom/anthropic/claude/api/chat/InputMode;", "getInputMode", "getEditMessageParentId-saiyK68", "getPrefill_source", "Lcom/anthropic/claude/chat/input/draft/QueuedSendRequest;", "getQueuedSendRequest", "Companion", "cb6", "db6", "input"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class DraftMessage implements mv2 {
    private static final kw9[] $childSerializers;
    public static final int $stable = 0;
    public static final db6 Companion = new db6();
    private final List<MessageAttachment> attachments;
    private final String chat_id;
    private final String editMessageParentId;
    private final List<MessageFile> files;
    private final InputMode inputMode;
    private final String prefill_source;
    private final String project_id;
    private final QueuedSendRequest queuedSendRequest;
    private final String text;

    static {
        h85 h85Var = new h85(28);
        w1a w1aVar = w1a.F;
        $childSerializers = new kw9[]{null, null, null, yb5.w(w1aVar, h85Var), yb5.w(w1aVar, new h85(29)), null, null, null, null};
    }

    private /* synthetic */ DraftMessage(int i, String str, String str2, String str3, List list, List list2, InputMode inputMode, String str4, String str5, QueuedSendRequest queuedSendRequest, vnf vnfVar) {
        if (127 != (i & 127)) {
            gvj.f(i, 127, cb6.a.getDescriptor());
            throw null;
        }
        this.chat_id = str;
        this.project_id = str2;
        this.text = str3;
        this.files = list;
        this.attachments = list2;
        this.inputMode = inputMode;
        this.editMessageParentId = str4;
        if ((i & FreeTypeConstants.FT_LOAD_PEDANTIC) == 0) {
            this.prefill_source = null;
        } else {
            this.prefill_source = str5;
        }
        if ((i & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) == 0) {
            this.queuedSendRequest = null;
        } else {
            this.queuedSendRequest = queuedSendRequest;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new uo0(MessageFile.Companion.serializer(), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return new uo0(meb.a, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: copy-UKUR3NQ$default, reason: not valid java name */
    public static /* synthetic */ DraftMessage m652copyUKUR3NQ$default(DraftMessage draftMessage, String str, String str2, String str3, List list, List list2, InputMode inputMode, String str4, String str5, QueuedSendRequest queuedSendRequest, int i, Object obj) {
        if ((i & 1) != 0) {
            str = draftMessage.chat_id;
        }
        if ((i & 2) != 0) {
            str2 = draftMessage.project_id;
        }
        if ((i & 4) != 0) {
            str3 = draftMessage.text;
        }
        if ((i & 8) != 0) {
            list = draftMessage.files;
        }
        if ((i & 16) != 0) {
            list2 = draftMessage.attachments;
        }
        if ((i & 32) != 0) {
            inputMode = draftMessage.inputMode;
        }
        if ((i & 64) != 0) {
            str4 = draftMessage.editMessageParentId;
        }
        if ((i & FreeTypeConstants.FT_LOAD_PEDANTIC) != 0) {
            str5 = draftMessage.prefill_source;
        }
        if ((i & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) != 0) {
            queuedSendRequest = draftMessage.queuedSendRequest;
        }
        String str6 = str5;
        QueuedSendRequest queuedSendRequest2 = queuedSendRequest;
        InputMode inputMode2 = inputMode;
        String str7 = str4;
        List list3 = list2;
        String str8 = str3;
        return draftMessage.m656copyUKUR3NQ(str, str2, str8, list, list3, inputMode2, str7, str6, queuedSendRequest2);
    }

    public static final /* synthetic */ void write$Self$input(DraftMessage self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        vs2 vs2Var = vs2.a;
        String str = self.chat_id;
        output.B(serialDesc, 0, vs2Var, str != null ? ChatId.m978boximpl(str) : null);
        emd emdVar = emd.a;
        String str2 = self.project_id;
        output.B(serialDesc, 1, emdVar, str2 != null ? ProjectId.m1079boximpl(str2) : null);
        output.q(serialDesc, 2, self.getText());
        output.r(serialDesc, 3, (znf) kw9VarArr[3].getValue(), self.getFiles());
        output.r(serialDesc, 4, (znf) kw9VarArr[4].getValue(), self.getAttachments());
        output.B(serialDesc, 5, o49.d, self.inputMode);
        ehb ehbVar = ehb.a;
        String str3 = self.editMessageParentId;
        output.B(serialDesc, 6, ehbVar, str3 != null ? MessageId.m1051boximpl(str3) : null);
        if (output.E(serialDesc) || self.prefill_source != null) {
            output.B(serialDesc, 7, srg.a, self.prefill_source);
        }
        if (!output.E(serialDesc) && self.queuedSendRequest == null) {
            return;
        }
        output.B(serialDesc, 8, l0e.a, self.queuedSendRequest);
    }

    /* JADX INFO: renamed from: component1-CAG_bmg, reason: not valid java name and from getter */
    public final String getChat_id() {
        return this.chat_id;
    }

    /* JADX INFO: renamed from: component2-v-f-JkQ, reason: not valid java name and from getter */
    public final String getProject_id() {
        return this.project_id;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getText() {
        return this.text;
    }

    public final List<MessageFile> component4() {
        return this.files;
    }

    public final List<MessageAttachment> component5() {
        return this.attachments;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final InputMode getInputMode() {
        return this.inputMode;
    }

    /* JADX INFO: renamed from: component7-saiyK68, reason: not valid java name and from getter */
    public final String getEditMessageParentId() {
        return this.editMessageParentId;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getPrefill_source() {
        return this.prefill_source;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final QueuedSendRequest getQueuedSendRequest() {
        return this.queuedSendRequest;
    }

    /* JADX INFO: renamed from: copy-UKUR3NQ, reason: not valid java name */
    public final DraftMessage m656copyUKUR3NQ(String chat_id, String project_id, String text, List<? extends MessageFile> files, List<MessageAttachment> attachments, InputMode inputMode, String editMessageParentId, String prefill_source, QueuedSendRequest queuedSendRequest) {
        text.getClass();
        files.getClass();
        attachments.getClass();
        return new DraftMessage(chat_id, project_id, text, files, attachments, inputMode, editMessageParentId, prefill_source, queuedSendRequest, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0016  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x006a  */
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
            boolean r1 = r5 instanceof com.anthropic.claude.chat.input.draft.DraftMessage
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.anthropic.claude.chat.input.draft.DraftMessage r5 = (com.anthropic.claude.chat.input.draft.DraftMessage) r5
            java.lang.String r1 = r4.chat_id
            java.lang.String r3 = r5.chat_id
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
            boolean r1 = com.anthropic.claude.types.strings.ChatId.m981equalsimpl0(r1, r3)
        L1f:
            if (r1 != 0) goto L22
            return r2
        L22:
            java.lang.String r1 = r4.project_id
            java.lang.String r3 = r5.project_id
            if (r1 != 0) goto L2e
            if (r3 != 0) goto L2c
            r1 = r0
            goto L35
        L2c:
            r1 = r2
            goto L35
        L2e:
            if (r3 != 0) goto L31
            goto L2c
        L31:
            boolean r1 = com.anthropic.claude.types.strings.ProjectId.m1082equalsimpl0(r1, r3)
        L35:
            if (r1 != 0) goto L38
            return r2
        L38:
            java.lang.String r1 = r4.text
            java.lang.String r3 = r5.text
            boolean r1 = defpackage.x44.r(r1, r3)
            if (r1 != 0) goto L43
            return r2
        L43:
            java.util.List<com.anthropic.claude.api.chat.MessageFile> r1 = r4.files
            java.util.List<com.anthropic.claude.api.chat.MessageFile> r3 = r5.files
            boolean r1 = defpackage.x44.r(r1, r3)
            if (r1 != 0) goto L4e
            return r2
        L4e:
            java.util.List<com.anthropic.claude.api.chat.MessageAttachment> r1 = r4.attachments
            java.util.List<com.anthropic.claude.api.chat.MessageAttachment> r3 = r5.attachments
            boolean r1 = defpackage.x44.r(r1, r3)
            if (r1 != 0) goto L59
            return r2
        L59:
            com.anthropic.claude.api.chat.InputMode r1 = r4.inputMode
            com.anthropic.claude.api.chat.InputMode r3 = r5.inputMode
            if (r1 == r3) goto L60
            return r2
        L60:
            java.lang.String r1 = r4.editMessageParentId
            java.lang.String r3 = r5.editMessageParentId
            if (r1 != 0) goto L6c
            if (r3 != 0) goto L6a
            r1 = r0
            goto L73
        L6a:
            r1 = r2
            goto L73
        L6c:
            if (r3 != 0) goto L6f
            goto L6a
        L6f:
            boolean r1 = com.anthropic.claude.types.strings.MessageId.m1054equalsimpl0(r1, r3)
        L73:
            if (r1 != 0) goto L76
            return r2
        L76:
            java.lang.String r1 = r4.prefill_source
            java.lang.String r3 = r5.prefill_source
            boolean r1 = defpackage.x44.r(r1, r3)
            if (r1 != 0) goto L81
            return r2
        L81:
            com.anthropic.claude.chat.input.draft.QueuedSendRequest r4 = r4.queuedSendRequest
            com.anthropic.claude.chat.input.draft.QueuedSendRequest r5 = r5.queuedSendRequest
            boolean r4 = defpackage.x44.r(r4, r5)
            if (r4 != 0) goto L8c
            return r2
        L8c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anthropic.claude.chat.input.draft.DraftMessage.equals(java.lang.Object):boolean");
    }

    @Override // defpackage.mv2
    public List<MessageAttachment> getAttachments() {
        return this.attachments;
    }

    /* JADX INFO: renamed from: getChat_id-CAG_bmg, reason: not valid java name */
    public final String m657getChat_idCAG_bmg() {
        return this.chat_id;
    }

    /* JADX INFO: renamed from: getEditMessageParentId-saiyK68, reason: not valid java name */
    public final String m658getEditMessageParentIdsaiyK68() {
        return this.editMessageParentId;
    }

    @Override // defpackage.mv2
    public List<MessageFile> getFiles() {
        return this.files;
    }

    public final InputMode getInputMode() {
        return this.inputMode;
    }

    public final String getPrefill_source() {
        return this.prefill_source;
    }

    /* JADX INFO: renamed from: getProject_id-v-f-JkQ, reason: not valid java name */
    public final String m659getProject_idvfJkQ() {
        return this.project_id;
    }

    public final QueuedSendRequest getQueuedSendRequest() {
        return this.queuedSendRequest;
    }

    @Override // defpackage.mv2
    public String getText() {
        return this.text;
    }

    public int hashCode() {
        String str = this.chat_id;
        int iM982hashCodeimpl = (str == null ? 0 : ChatId.m982hashCodeimpl(str)) * 31;
        String str2 = this.project_id;
        int iM = kgh.m(kgh.m(kgh.l((iM982hashCodeimpl + (str2 == null ? 0 : ProjectId.m1083hashCodeimpl(str2))) * 31, 31, this.text), 31, this.files), 31, this.attachments);
        InputMode inputMode = this.inputMode;
        int iHashCode = (iM + (inputMode == null ? 0 : inputMode.hashCode())) * 31;
        String str3 = this.editMessageParentId;
        int iM1055hashCodeimpl = (iHashCode + (str3 == null ? 0 : MessageId.m1055hashCodeimpl(str3))) * 31;
        String str4 = this.prefill_source;
        int iHashCode2 = (iM1055hashCodeimpl + (str4 == null ? 0 : str4.hashCode())) * 31;
        QueuedSendRequest queuedSendRequest = this.queuedSendRequest;
        return iHashCode2 + (queuedSendRequest != null ? queuedSendRequest.hashCode() : 0);
    }

    public String toString() {
        String str = this.chat_id;
        String strM983toStringimpl = str == null ? "null" : ChatId.m983toStringimpl(str);
        String str2 = this.project_id;
        String strM1084toStringimpl = str2 == null ? "null" : ProjectId.m1084toStringimpl(str2);
        String str3 = this.text;
        List<MessageFile> list = this.files;
        List<MessageAttachment> list2 = this.attachments;
        InputMode inputMode = this.inputMode;
        String str4 = this.editMessageParentId;
        String strM1056toStringimpl = str4 != null ? MessageId.m1056toStringimpl(str4) : "null";
        String str5 = this.prefill_source;
        QueuedSendRequest queuedSendRequest = this.queuedSendRequest;
        StringBuilder sbR = kgh.r("DraftMessage(chat_id=", strM983toStringimpl, ", project_id=", strM1084toStringimpl, ", text=");
        qy1.p(str3, ", files=", ", attachments=", sbR, list);
        sbR.append(list2);
        sbR.append(", inputMode=");
        sbR.append(inputMode);
        sbR.append(", editMessageParentId=");
        kgh.u(sbR, strM1056toStringimpl, ", prefill_source=", str5, ", queuedSendRequest=");
        sbR.append(queuedSendRequest);
        sbR.append(")");
        return sbR.toString();
    }

    public /* synthetic */ DraftMessage(String str, String str2, String str3, List list, List list2, InputMode inputMode, String str4, String str5, QueuedSendRequest queuedSendRequest, mq5 mq5Var) {
        this(str, str2, str3, list, list2, inputMode, str4, str5, queuedSendRequest);
    }

    public /* synthetic */ DraftMessage(int i, String str, String str2, String str3, List list, List list2, InputMode inputMode, String str4, String str5, QueuedSendRequest queuedSendRequest, vnf vnfVar, mq5 mq5Var) {
        this(i, str, str2, str3, list, list2, inputMode, str4, str5, queuedSendRequest, vnfVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private DraftMessage(String str, String str2, String str3, List<? extends MessageFile> list, List<MessageAttachment> list2, InputMode inputMode, String str4, String str5, QueuedSendRequest queuedSendRequest) {
        str3.getClass();
        list.getClass();
        list2.getClass();
        this.chat_id = str;
        this.project_id = str2;
        this.text = str3;
        this.files = list;
        this.attachments = list2;
        this.inputMode = inputMode;
        this.editMessageParentId = str4;
        this.prefill_source = str5;
        this.queuedSendRequest = queuedSendRequest;
    }

    public /* synthetic */ DraftMessage(String str, String str2, String str3, List list, List list2, InputMode inputMode, String str4, String str5, QueuedSendRequest queuedSendRequest, int i, mq5 mq5Var) {
        this(str, str2, str3, list, list2, inputMode, str4, (i & FreeTypeConstants.FT_LOAD_PEDANTIC) != 0 ? null : str5, (i & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) != 0 ? null : queuedSendRequest, null);
    }
}
