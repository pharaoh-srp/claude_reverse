package com.anthropic.claude.artifact.sheet;

import com.anthropic.claude.types.strings.MessageId;
import defpackage.ehb;
import defpackage.gvj;
import defpackage.hs0;
import defpackage.is0;
import defpackage.kgh;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.vb7;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001d\b\u0087\b\u0018\u0000 /2\u00020\u0001:\u000201B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bB?\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\n\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0010\u0010\u001d\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J8\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b$\u0010\u001aJ\u0010\u0010%\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b%\u0010\u001eJ\u001a\u0010'\u001a\u00020\b2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b+\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010,\u001a\u0004\b-\u0010\u001eR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010.\u001a\u0004\b\t\u0010 ¨\u00062"}, d2 = {"Lcom/anthropic/claude/artifact/sheet/ArtifactShareParams;", "", "", "artifactUuid", "Lcom/anthropic/claude/types/strings/MessageId;", "messageId", "", "versionIndex", "", "isWiggleArtifact", "<init>", "(Ljava/lang/String;Ljava/lang/String;IZLmq5;)V", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;IZLvnf;Lmq5;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$artifact", "(Lcom/anthropic/claude/artifact/sheet/ArtifactShareParams;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2-PStrttk", "component2", "component3", "()I", "component4", "()Z", "copy-yHzssjI", "(Ljava/lang/String;Ljava/lang/String;IZ)Lcom/anthropic/claude/artifact/sheet/ArtifactShareParams;", "copy", "toString", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getArtifactUuid", "getMessageId-PStrttk", "I", "getVersionIndex", "Z", "Companion", "hs0", "is0", "artifact"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class ArtifactShareParams {
    public static final int $stable = 0;
    public static final is0 Companion = new is0();
    private final String artifactUuid;
    private final boolean isWiggleArtifact;
    private final String messageId;
    private final int versionIndex;

    private /* synthetic */ ArtifactShareParams(int i, String str, String str2, int i2, boolean z, vnf vnfVar) {
        if (15 != (i & 15)) {
            gvj.f(i, 15, hs0.a.getDescriptor());
            throw null;
        }
        this.artifactUuid = str;
        this.messageId = str2;
        this.versionIndex = i2;
        this.isWiggleArtifact = z;
    }

    /* JADX INFO: renamed from: copy-yHzssjI$default, reason: not valid java name */
    public static /* synthetic */ ArtifactShareParams m547copyyHzssjI$default(ArtifactShareParams artifactShareParams, String str, String str2, int i, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = artifactShareParams.artifactUuid;
        }
        if ((i2 & 2) != 0) {
            str2 = artifactShareParams.messageId;
        }
        if ((i2 & 4) != 0) {
            i = artifactShareParams.versionIndex;
        }
        if ((i2 & 8) != 0) {
            z = artifactShareParams.isWiggleArtifact;
        }
        return artifactShareParams.m549copyyHzssjI(str, str2, i, z);
    }

    public static final /* synthetic */ void write$Self$artifact(ArtifactShareParams self, vd4 output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.artifactUuid);
        output.r(serialDesc, 1, ehb.a, MessageId.m1051boximpl(self.messageId));
        output.l(2, self.versionIndex, serialDesc);
        output.p(serialDesc, 3, self.isWiggleArtifact);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getArtifactUuid() {
        return this.artifactUuid;
    }

    /* JADX INFO: renamed from: component2-PStrttk, reason: not valid java name and from getter */
    public final String getMessageId() {
        return this.messageId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getVersionIndex() {
        return this.versionIndex;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getIsWiggleArtifact() {
        return this.isWiggleArtifact;
    }

    /* JADX INFO: renamed from: copy-yHzssjI, reason: not valid java name */
    public final ArtifactShareParams m549copyyHzssjI(String artifactUuid, String messageId, int versionIndex, boolean isWiggleArtifact) {
        artifactUuid.getClass();
        messageId.getClass();
        return new ArtifactShareParams(artifactUuid, messageId, versionIndex, isWiggleArtifact, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ArtifactShareParams)) {
            return false;
        }
        ArtifactShareParams artifactShareParams = (ArtifactShareParams) other;
        return x44.r(this.artifactUuid, artifactShareParams.artifactUuid) && MessageId.m1054equalsimpl0(this.messageId, artifactShareParams.messageId) && this.versionIndex == artifactShareParams.versionIndex && this.isWiggleArtifact == artifactShareParams.isWiggleArtifact;
    }

    public final String getArtifactUuid() {
        return this.artifactUuid;
    }

    /* JADX INFO: renamed from: getMessageId-PStrttk, reason: not valid java name */
    public final String m550getMessageIdPStrttk() {
        return this.messageId;
    }

    public final int getVersionIndex() {
        return this.versionIndex;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isWiggleArtifact) + vb7.c(this.versionIndex, (MessageId.m1055hashCodeimpl(this.messageId) + (this.artifactUuid.hashCode() * 31)) * 31, 31);
    }

    public final boolean isWiggleArtifact() {
        return this.isWiggleArtifact;
    }

    public String toString() {
        String str = this.artifactUuid;
        String strM1056toStringimpl = MessageId.m1056toStringimpl(this.messageId);
        int i = this.versionIndex;
        boolean z = this.isWiggleArtifact;
        StringBuilder sbR = kgh.r("ArtifactShareParams(artifactUuid=", str, ", messageId=", strM1056toStringimpl, ", versionIndex=");
        sbR.append(i);
        sbR.append(", isWiggleArtifact=");
        sbR.append(z);
        sbR.append(")");
        return sbR.toString();
    }

    public /* synthetic */ ArtifactShareParams(String str, String str2, int i, boolean z, mq5 mq5Var) {
        this(str, str2, i, z);
    }

    public /* synthetic */ ArtifactShareParams(int i, String str, String str2, int i2, boolean z, vnf vnfVar, mq5 mq5Var) {
        this(i, str, str2, i2, z, vnfVar);
    }

    private ArtifactShareParams(String str, String str2, int i, boolean z) {
        str.getClass();
        str2.getClass();
        this.artifactUuid = str;
        this.messageId = str2;
        this.versionIndex = i;
        this.isWiggleArtifact = z;
    }
}
