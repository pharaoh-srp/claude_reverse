package com.anthropic.claude.artifact.dialog;

import com.anthropic.claude.artifact.model.ArtifactMetadata;
import com.anthropic.claude.types.strings.ChatId;
import com.anthropic.claude.types.strings.MessageId;
import defpackage.awd;
import defpackage.bwd;
import defpackage.ehb;
import defpackage.gvj;
import defpackage.kgh;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.pr0;
import defpackage.vb7;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.vs2;
import defpackage.x44;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b$\b\u0087\b\u0018\u0000 :2\u00020\u0001:\u0002;<B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fBS\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u000e\u0010\u0013J'\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\"\u0010\u001eJ\u0010\u0010$\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b#\u0010\u001eJ\u0010\u0010%\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b'\u0010(JL\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\fHÆ\u0001¢\u0006\u0004\b)\u0010*J\u0010\u0010,\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b,\u0010\u001eJ\u0010\u0010-\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b-\u0010&J\u001a\u0010/\u001a\u00020\f2\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b/\u00100R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00101\u001a\u0004\b2\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00103\u001a\u0004\b4\u0010!R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00101\u001a\u0004\b5\u0010\u001eR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u00101\u001a\u0004\b6\u0010\u001eR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u00107\u001a\u0004\b8\u0010&R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u00109\u001a\u0004\b\r\u0010(¨\u0006="}, d2 = {"Lcom/anthropic/claude/artifact/dialog/PublishArtifactParams;", "", "Lcom/anthropic/claude/types/strings/MessageId;", "messageId", "Lcom/anthropic/claude/artifact/model/ArtifactMetadata;", "artifactMetadata", "", "artifactBody", "Lcom/anthropic/claude/types/strings/ChatId;", "conversationUuid", "", "artifactVersionIndex", "", "isWiggleArtifact", "<init>", "(Ljava/lang/String;Lcom/anthropic/claude/artifact/model/ArtifactMetadata;Ljava/lang/String;Ljava/lang/String;IZLmq5;)V", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/anthropic/claude/artifact/model/ArtifactMetadata;Ljava/lang/String;Ljava/lang/String;IZLvnf;Lmq5;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$artifact", "(Lcom/anthropic/claude/artifact/dialog/PublishArtifactParams;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1-PStrttk", "()Ljava/lang/String;", "component1", "component2", "()Lcom/anthropic/claude/artifact/model/ArtifactMetadata;", "component3", "component4-RjYBDck", "component4", "component5", "()I", "component6", "()Z", "copy-oUZhBHE", "(Ljava/lang/String;Lcom/anthropic/claude/artifact/model/ArtifactMetadata;Ljava/lang/String;Ljava/lang/String;IZ)Lcom/anthropic/claude/artifact/dialog/PublishArtifactParams;", "copy", "toString", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getMessageId-PStrttk", "Lcom/anthropic/claude/artifact/model/ArtifactMetadata;", "getArtifactMetadata", "getArtifactBody", "getConversationUuid-RjYBDck", "I", "getArtifactVersionIndex", "Z", "Companion", "awd", "bwd", "artifact"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class PublishArtifactParams {
    public static final int $stable = 0;
    public static final bwd Companion = new bwd();
    private final String artifactBody;
    private final ArtifactMetadata artifactMetadata;
    private final int artifactVersionIndex;
    private final String conversationUuid;
    private final boolean isWiggleArtifact;
    private final String messageId;

    private /* synthetic */ PublishArtifactParams(int i, String str, ArtifactMetadata artifactMetadata, String str2, String str3, int i2, boolean z, vnf vnfVar) {
        if (63 != (i & 63)) {
            gvj.f(i, 63, awd.a.getDescriptor());
            throw null;
        }
        this.messageId = str;
        this.artifactMetadata = artifactMetadata;
        this.artifactBody = str2;
        this.conversationUuid = str3;
        this.artifactVersionIndex = i2;
        this.isWiggleArtifact = z;
    }

    /* JADX INFO: renamed from: copy-oUZhBHE$default, reason: not valid java name */
    public static /* synthetic */ PublishArtifactParams m527copyoUZhBHE$default(PublishArtifactParams publishArtifactParams, String str, ArtifactMetadata artifactMetadata, String str2, String str3, int i, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = publishArtifactParams.messageId;
        }
        if ((i2 & 2) != 0) {
            artifactMetadata = publishArtifactParams.artifactMetadata;
        }
        if ((i2 & 4) != 0) {
            str2 = publishArtifactParams.artifactBody;
        }
        if ((i2 & 8) != 0) {
            str3 = publishArtifactParams.conversationUuid;
        }
        if ((i2 & 16) != 0) {
            i = publishArtifactParams.artifactVersionIndex;
        }
        if ((i2 & 32) != 0) {
            z = publishArtifactParams.isWiggleArtifact;
        }
        int i3 = i;
        boolean z2 = z;
        return publishArtifactParams.m530copyoUZhBHE(str, artifactMetadata, str2, str3, i3, z2);
    }

    public static final /* synthetic */ void write$Self$artifact(PublishArtifactParams self, vd4 output, SerialDescriptor serialDesc) {
        output.r(serialDesc, 0, ehb.a, MessageId.m1051boximpl(self.messageId));
        output.r(serialDesc, 1, pr0.a, self.artifactMetadata);
        output.q(serialDesc, 2, self.artifactBody);
        output.r(serialDesc, 3, vs2.a, ChatId.m978boximpl(self.conversationUuid));
        output.l(4, self.artifactVersionIndex, serialDesc);
        output.p(serialDesc, 5, self.isWiggleArtifact);
    }

    /* JADX INFO: renamed from: component1-PStrttk, reason: not valid java name and from getter */
    public final String getMessageId() {
        return this.messageId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final ArtifactMetadata getArtifactMetadata() {
        return this.artifactMetadata;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getArtifactBody() {
        return this.artifactBody;
    }

    /* JADX INFO: renamed from: component4-RjYBDck, reason: not valid java name and from getter */
    public final String getConversationUuid() {
        return this.conversationUuid;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getArtifactVersionIndex() {
        return this.artifactVersionIndex;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getIsWiggleArtifact() {
        return this.isWiggleArtifact;
    }

    /* JADX INFO: renamed from: copy-oUZhBHE, reason: not valid java name */
    public final PublishArtifactParams m530copyoUZhBHE(String messageId, ArtifactMetadata artifactMetadata, String artifactBody, String conversationUuid, int artifactVersionIndex, boolean isWiggleArtifact) {
        messageId.getClass();
        artifactMetadata.getClass();
        artifactBody.getClass();
        conversationUuid.getClass();
        return new PublishArtifactParams(messageId, artifactMetadata, artifactBody, conversationUuid, artifactVersionIndex, isWiggleArtifact, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PublishArtifactParams)) {
            return false;
        }
        PublishArtifactParams publishArtifactParams = (PublishArtifactParams) other;
        return MessageId.m1054equalsimpl0(this.messageId, publishArtifactParams.messageId) && x44.r(this.artifactMetadata, publishArtifactParams.artifactMetadata) && x44.r(this.artifactBody, publishArtifactParams.artifactBody) && ChatId.m981equalsimpl0(this.conversationUuid, publishArtifactParams.conversationUuid) && this.artifactVersionIndex == publishArtifactParams.artifactVersionIndex && this.isWiggleArtifact == publishArtifactParams.isWiggleArtifact;
    }

    public final String getArtifactBody() {
        return this.artifactBody;
    }

    public final ArtifactMetadata getArtifactMetadata() {
        return this.artifactMetadata;
    }

    public final int getArtifactVersionIndex() {
        return this.artifactVersionIndex;
    }

    /* JADX INFO: renamed from: getConversationUuid-RjYBDck, reason: not valid java name */
    public final String m531getConversationUuidRjYBDck() {
        return this.conversationUuid;
    }

    /* JADX INFO: renamed from: getMessageId-PStrttk, reason: not valid java name */
    public final String m532getMessageIdPStrttk() {
        return this.messageId;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isWiggleArtifact) + vb7.c(this.artifactVersionIndex, (ChatId.m982hashCodeimpl(this.conversationUuid) + kgh.l((this.artifactMetadata.hashCode() + (MessageId.m1055hashCodeimpl(this.messageId) * 31)) * 31, 31, this.artifactBody)) * 31, 31);
    }

    public final boolean isWiggleArtifact() {
        return this.isWiggleArtifact;
    }

    public String toString() {
        String strM1056toStringimpl = MessageId.m1056toStringimpl(this.messageId);
        ArtifactMetadata artifactMetadata = this.artifactMetadata;
        String str = this.artifactBody;
        String strM983toStringimpl = ChatId.m983toStringimpl(this.conversationUuid);
        int i = this.artifactVersionIndex;
        boolean z = this.isWiggleArtifact;
        StringBuilder sb = new StringBuilder("PublishArtifactParams(messageId=");
        sb.append(strM1056toStringimpl);
        sb.append(", artifactMetadata=");
        sb.append(artifactMetadata);
        sb.append(", artifactBody=");
        kgh.u(sb, str, ", conversationUuid=", strM983toStringimpl, ", artifactVersionIndex=");
        sb.append(i);
        sb.append(", isWiggleArtifact=");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ PublishArtifactParams(String str, ArtifactMetadata artifactMetadata, String str2, String str3, int i, boolean z, mq5 mq5Var) {
        this(str, artifactMetadata, str2, str3, i, z);
    }

    public /* synthetic */ PublishArtifactParams(int i, String str, ArtifactMetadata artifactMetadata, String str2, String str3, int i2, boolean z, vnf vnfVar, mq5 mq5Var) {
        this(i, str, artifactMetadata, str2, str3, i2, z, vnfVar);
    }

    private PublishArtifactParams(String str, ArtifactMetadata artifactMetadata, String str2, String str3, int i, boolean z) {
        str.getClass();
        artifactMetadata.getClass();
        str2.getClass();
        str3.getClass();
        this.messageId = str;
        this.artifactMetadata = artifactMetadata;
        this.artifactBody = str2;
        this.conversationUuid = str3;
        this.artifactVersionIndex = i;
        this.isWiggleArtifact = z;
    }
}
