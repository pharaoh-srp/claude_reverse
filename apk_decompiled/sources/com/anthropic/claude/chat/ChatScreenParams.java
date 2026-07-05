package com.anthropic.claude.chat;

import com.anthropic.claude.types.strings.ArtifactIdentifier;
import com.anthropic.claude.types.strings.ChatId;
import com.anthropic.claude.types.strings.ModelId;
import com.anthropic.claude.types.strings.ProjectId;
import com.pvporbit.freetype.FreeTypeConstants;
import defpackage.emd;
import defpackage.gvj;
import defpackage.kgh;
import defpackage.kr0;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.srg;
import defpackage.vd4;
import defpackage.vnb;
import defpackage.vnf;
import defpackage.vs2;
import defpackage.x93;
import defpackage.y93;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b'\b\u0087\b\u0018\u0000 @2\u00020\u0001:\u0002ABBY\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\u0011Be\b\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000e\u001a\u00020\u0006\u0012\u0006\u0010\u000f\u001a\u00020\u0006\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0010\u0010\u0016J'\u0010\u001f\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\u00062\b\u0010 \u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0012H\u0016¢\u0006\u0004\b#\u0010$J\u0010\u0010'\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b%\u0010&J\u0012\u0010)\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b(\u0010&J\u0010\u0010*\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b*\u0010+J\u0012\u0010,\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b,\u0010&J\u0012\u0010.\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b-\u0010&J\u0012\u00100\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b/\u0010&J\u0010\u00101\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b1\u0010+J\u0010\u00102\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b2\u0010+Jh\u00105\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000e\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b3\u00104J\u0010\u00106\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b6\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00107\u001a\u0004\b8\u0010&R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00107\u001a\u0004\b9\u0010&R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010:\u001a\u0004\b;\u0010+R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u00107\u001a\u0004\b<\u0010&R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u00107\u001a\u0004\b=\u0010&R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u00107\u001a\u0004\b>\u0010&R\u0017\u0010\u000e\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u000e\u0010:\u001a\u0004\b\u000e\u0010+R\u0017\u0010\u000f\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u000f\u0010:\u001a\u0004\b?\u0010+¨\u0006C"}, d2 = {"Lcom/anthropic/claude/chat/ChatScreenParams;", "", "Lcom/anthropic/claude/types/strings/ChatId;", "chatId", "Lcom/anthropic/claude/types/strings/ProjectId;", "projectId", "", "createdAsNewChat", "", "initialPrompt", "Lcom/anthropic/claude/types/strings/ArtifactIdentifier;", "artifactIdentifierToOpen", "Lcom/anthropic/claude/types/strings/ModelId;", "initialModel", "isRootScreen", "restoreDraft", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLmq5;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLvnf;Lmq5;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$chat", "(Lcom/anthropic/claude/chat/ChatScreenParams;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "component1-RjYBDck", "()Ljava/lang/String;", "component1", "component2-v-f-JkQ", "component2", "component3", "()Z", "component4", "component5-NDePnSc", "component5", "component6-a6HIKFk", "component6", "component7", "component8", "copy-QfsIOxA", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)Lcom/anthropic/claude/chat/ChatScreenParams;", "copy", "toString", "Ljava/lang/String;", "getChatId-RjYBDck", "getProjectId-v-f-JkQ", "Z", "getCreatedAsNewChat", "getInitialPrompt", "getArtifactIdentifierToOpen-NDePnSc", "getInitialModel-a6HIKFk", "getRestoreDraft", "Companion", "y93", "x93", "chat"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class ChatScreenParams {
    public static final int $stable = 0;
    public static final y93 Companion = new y93();
    private final String artifactIdentifierToOpen;
    private final String chatId;
    private final boolean createdAsNewChat;
    private final String initialModel;
    private final String initialPrompt;
    private final boolean isRootScreen;
    private final String projectId;
    private final boolean restoreDraft;

    private /* synthetic */ ChatScreenParams(int i, String str, String str2, boolean z, String str3, String str4, String str5, boolean z2, boolean z3, vnf vnfVar) {
        if (7 != (i & 7)) {
            gvj.f(i, 7, x93.a.getDescriptor());
            throw null;
        }
        this.chatId = str;
        this.projectId = str2;
        this.createdAsNewChat = z;
        if ((i & 8) == 0) {
            this.initialPrompt = null;
        } else {
            this.initialPrompt = str3;
        }
        if ((i & 16) == 0) {
            this.artifactIdentifierToOpen = null;
        } else {
            this.artifactIdentifierToOpen = str4;
        }
        if ((i & 32) == 0) {
            this.initialModel = null;
        } else {
            this.initialModel = str5;
        }
        if ((i & 64) == 0) {
            this.isRootScreen = false;
        } else {
            this.isRootScreen = z2;
        }
        if ((i & FreeTypeConstants.FT_LOAD_PEDANTIC) == 0) {
            this.restoreDraft = true;
        } else {
            this.restoreDraft = z3;
        }
    }

    /* JADX INFO: renamed from: copy-QfsIOxA$default, reason: not valid java name */
    public static /* synthetic */ ChatScreenParams m584copyQfsIOxA$default(ChatScreenParams chatScreenParams, String str, String str2, boolean z, String str3, String str4, String str5, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = chatScreenParams.chatId;
        }
        if ((i & 2) != 0) {
            str2 = chatScreenParams.projectId;
        }
        if ((i & 4) != 0) {
            z = chatScreenParams.createdAsNewChat;
        }
        if ((i & 8) != 0) {
            str3 = chatScreenParams.initialPrompt;
        }
        if ((i & 16) != 0) {
            str4 = chatScreenParams.artifactIdentifierToOpen;
        }
        if ((i & 32) != 0) {
            str5 = chatScreenParams.initialModel;
        }
        if ((i & 64) != 0) {
            z2 = chatScreenParams.isRootScreen;
        }
        if ((i & FreeTypeConstants.FT_LOAD_PEDANTIC) != 0) {
            z3 = chatScreenParams.restoreDraft;
        }
        boolean z4 = z2;
        boolean z5 = z3;
        String str6 = str4;
        String str7 = str5;
        return chatScreenParams.m589copyQfsIOxA(str, str2, z, str3, str6, str7, z4, z5);
    }

    public static final /* synthetic */ void write$Self$chat(ChatScreenParams self, vd4 output, SerialDescriptor serialDesc) {
        output.r(serialDesc, 0, vs2.a, ChatId.m978boximpl(self.chatId));
        emd emdVar = emd.a;
        String str = self.projectId;
        output.B(serialDesc, 1, emdVar, str != null ? ProjectId.m1079boximpl(str) : null);
        output.p(serialDesc, 2, self.createdAsNewChat);
        if (output.E(serialDesc) || self.initialPrompt != null) {
            output.B(serialDesc, 3, srg.a, self.initialPrompt);
        }
        if (output.E(serialDesc) || self.artifactIdentifierToOpen != null) {
            kr0 kr0Var = kr0.a;
            String str2 = self.artifactIdentifierToOpen;
            output.B(serialDesc, 4, kr0Var, str2 != null ? ArtifactIdentifier.m964boximpl(str2) : null);
        }
        if (output.E(serialDesc) || self.initialModel != null) {
            vnb vnbVar = vnb.a;
            String str3 = self.initialModel;
            output.B(serialDesc, 5, vnbVar, str3 != null ? ModelId.m1058boximpl(str3) : null);
        }
        if (output.E(serialDesc) || self.isRootScreen) {
            output.p(serialDesc, 6, self.isRootScreen);
        }
        if (!output.E(serialDesc) && self.restoreDraft) {
            return;
        }
        output.p(serialDesc, 7, self.restoreDraft);
    }

    /* JADX INFO: renamed from: component1-RjYBDck, reason: not valid java name and from getter */
    public final String getChatId() {
        return this.chatId;
    }

    /* JADX INFO: renamed from: component2-v-f-JkQ, reason: not valid java name and from getter */
    public final String getProjectId() {
        return this.projectId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getCreatedAsNewChat() {
        return this.createdAsNewChat;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getInitialPrompt() {
        return this.initialPrompt;
    }

    /* JADX INFO: renamed from: component5-NDePnSc, reason: not valid java name and from getter */
    public final String getArtifactIdentifierToOpen() {
        return this.artifactIdentifierToOpen;
    }

    /* JADX INFO: renamed from: component6-a6HIKFk, reason: not valid java name and from getter */
    public final String getInitialModel() {
        return this.initialModel;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getIsRootScreen() {
        return this.isRootScreen;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final boolean getRestoreDraft() {
        return this.restoreDraft;
    }

    /* JADX INFO: renamed from: copy-QfsIOxA, reason: not valid java name */
    public final ChatScreenParams m589copyQfsIOxA(String chatId, String projectId, boolean createdAsNewChat, String initialPrompt, String artifactIdentifierToOpen, String initialModel, boolean isRootScreen, boolean restoreDraft) {
        chatId.getClass();
        return new ChatScreenParams(chatId, projectId, createdAsNewChat, initialPrompt, artifactIdentifierToOpen, initialModel, isRootScreen, restoreDraft, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002b A[RETURN] */
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
            boolean r1 = r5 instanceof com.anthropic.claude.chat.ChatScreenParams
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            java.lang.String r1 = r4.chatId
            com.anthropic.claude.chat.ChatScreenParams r5 = (com.anthropic.claude.chat.ChatScreenParams) r5
            java.lang.String r3 = r5.chatId
            boolean r1 = com.anthropic.claude.types.strings.ChatId.m981equalsimpl0(r1, r3)
            if (r1 == 0) goto L2c
            java.lang.String r4 = r4.projectId
            java.lang.String r5 = r5.projectId
            if (r4 != 0) goto L22
            if (r5 != 0) goto L20
            r4 = r0
            goto L29
        L20:
            r4 = r2
            goto L29
        L22:
            if (r5 != 0) goto L25
            goto L20
        L25:
            boolean r4 = com.anthropic.claude.types.strings.ProjectId.m1082equalsimpl0(r4, r5)
        L29:
            if (r4 == 0) goto L2c
            return r0
        L2c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anthropic.claude.chat.ChatScreenParams.equals(java.lang.Object):boolean");
    }

    /* JADX INFO: renamed from: getArtifactIdentifierToOpen-NDePnSc, reason: not valid java name */
    public final String m590getArtifactIdentifierToOpenNDePnSc() {
        return this.artifactIdentifierToOpen;
    }

    /* JADX INFO: renamed from: getChatId-RjYBDck, reason: not valid java name */
    public final String m591getChatIdRjYBDck() {
        return this.chatId;
    }

    public final boolean getCreatedAsNewChat() {
        return this.createdAsNewChat;
    }

    /* JADX INFO: renamed from: getInitialModel-a6HIKFk, reason: not valid java name */
    public final String m592getInitialModela6HIKFk() {
        return this.initialModel;
    }

    public final String getInitialPrompt() {
        return this.initialPrompt;
    }

    /* JADX INFO: renamed from: getProjectId-v-f-JkQ, reason: not valid java name */
    public final String m593getProjectIdvfJkQ() {
        return this.projectId;
    }

    public final boolean getRestoreDraft() {
        return this.restoreDraft;
    }

    public int hashCode() {
        int iM982hashCodeimpl = ChatId.m982hashCodeimpl(this.chatId) * 31;
        String str = this.projectId;
        return iM982hashCodeimpl + (str != null ? ProjectId.m1083hashCodeimpl(str) : 0);
    }

    public final boolean isRootScreen() {
        return this.isRootScreen;
    }

    public String toString() {
        String strM983toStringimpl = ChatId.m983toStringimpl(this.chatId);
        String str = this.projectId;
        String strM1084toStringimpl = str == null ? "null" : ProjectId.m1084toStringimpl(str);
        boolean z = this.createdAsNewChat;
        String str2 = this.initialPrompt;
        String str3 = this.artifactIdentifierToOpen;
        String strM969toStringimpl = str3 == null ? "null" : ArtifactIdentifier.m969toStringimpl(str3);
        String str4 = this.initialModel;
        String strM1063toStringimpl = str4 != null ? ModelId.m1063toStringimpl(str4) : "null";
        boolean z2 = this.isRootScreen;
        boolean z3 = this.restoreDraft;
        StringBuilder sbR = kgh.r("ChatScreenParams(chatId=", strM983toStringimpl, ", projectId=", strM1084toStringimpl, ", createdAsNewChat=");
        sbR.append(z);
        sbR.append(", initialPrompt=");
        sbR.append(str2);
        sbR.append(", artifactIdentifierToOpen=");
        kgh.u(sbR, strM969toStringimpl, ", initialModel=", strM1063toStringimpl, ", isRootScreen=");
        sbR.append(z2);
        sbR.append(", restoreDraft=");
        sbR.append(z3);
        sbR.append(")");
        return sbR.toString();
    }

    public /* synthetic */ ChatScreenParams(String str, String str2, boolean z, String str3, String str4, String str5, boolean z2, boolean z3, mq5 mq5Var) {
        this(str, str2, z, str3, str4, str5, z2, z3);
    }

    public /* synthetic */ ChatScreenParams(int i, String str, String str2, boolean z, String str3, String str4, String str5, boolean z2, boolean z3, vnf vnfVar, mq5 mq5Var) {
        this(i, str, str2, z, str3, str4, str5, z2, z3, vnfVar);
    }

    private ChatScreenParams(String str, String str2, boolean z, String str3, String str4, String str5, boolean z2, boolean z3) {
        str.getClass();
        this.chatId = str;
        this.projectId = str2;
        this.createdAsNewChat = z;
        this.initialPrompt = str3;
        this.artifactIdentifierToOpen = str4;
        this.initialModel = str5;
        this.isRootScreen = z2;
        this.restoreDraft = z3;
    }

    public /* synthetic */ ChatScreenParams(String str, String str2, boolean z, String str3, String str4, String str5, boolean z2, boolean z3, int i, mq5 mq5Var) {
        this(str, str2, z, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? false : z2, (i & FreeTypeConstants.FT_LOAD_PEDANTIC) != 0 ? true : z3, null);
    }
}
