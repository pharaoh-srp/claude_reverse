package com.anthropic.claude.api.artifacts;

import com.anthropic.claude.types.strings.ArtifactIdentifier;
import com.anthropic.claude.types.strings.MessageId;
import com.anthropic.claude.types.strings.PublishedArtifactId;
import defpackage.ehb;
import defpackage.gvj;
import defpackage.kgh;
import defpackage.kr0;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.qwd;
import defpackage.rwd;
import defpackage.sq6;
import defpackage.srg;
import defpackage.swd;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import defpackage.y6a;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b%\b\u0087\b\u0018\u0000 <2\u00020\u0001:\u0002=>BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fB_\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u000e\u0010\u0014J'\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010\"\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b!\u0010\u001fJ\u0010\u0010#\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b#\u0010\u001fJ\u0012\u0010$\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b$\u0010\u001fJ\u0010\u0010&\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b%\u0010\u001fJ\u0010\u0010'\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b'\u0010\u001fJ\u0010\u0010(\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b(\u0010)JX\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\fHÆ\u0001¢\u0006\u0004\b*\u0010+J\u0010\u0010-\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b-\u0010\u001fJ\u0010\u0010.\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b.\u0010/J\u001a\u00101\u001a\u00020\f2\b\u00100\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b1\u00102R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00103\u001a\u0004\b4\u0010\u001fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00103\u001a\u0004\b5\u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00103\u001a\u0004\b6\u0010\u001fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\b\u00103\u001a\u0004\b7\u0010\u001fR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u00103\u001a\u0004\b8\u0010\u001fR\u0017\u0010\u000b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u000b\u00103\u001a\u0004\b9\u0010\u001fR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010:\u001a\u0004\b;\u0010)¨\u0006?"}, d2 = {"Lcom/anthropic/claude/api/artifacts/PublishedArtifact;", "", "Lcom/anthropic/claude/types/strings/ArtifactIdentifier;", "artifact_identifier", "Lcom/anthropic/claude/types/strings/PublishedArtifactId;", "published_artifact_uuid", "", "artifact_type", "code_language", "Lcom/anthropic/claude/types/strings/MessageId;", "message_uuid", "title", "", "deleted", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLmq5;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLvnf;Lmq5;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/artifacts/PublishedArtifact;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1-eX_QYXY", "()Ljava/lang/String;", "component1", "component2-2-azyQ4", "component2", "component3", "component4", "component5-PStrttk", "component5", "component6", "component7", "()Z", "copy-NOG8DHw", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lcom/anthropic/claude/api/artifacts/PublishedArtifact;", "copy", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getArtifact_identifier-eX_QYXY", "getPublished_artifact_uuid-2-azyQ4", "getArtifact_type", "getCode_language", "getMessage_uuid-PStrttk", "getTitle", "Z", "getDeleted", "Companion", "qwd", "rwd", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class PublishedArtifact {
    public static final int $stable = 0;
    public static final rwd Companion = new rwd();
    private final String artifact_identifier;
    private final String artifact_type;
    private final String code_language;
    private final boolean deleted;
    private final String message_uuid;
    private final String published_artifact_uuid;
    private final String title;

    private /* synthetic */ PublishedArtifact(int i, String str, String str2, String str3, String str4, String str5, String str6, boolean z, vnf vnfVar) {
        if (119 != (i & 119)) {
            gvj.f(i, 119, qwd.a.getDescriptor());
            throw null;
        }
        this.artifact_identifier = str;
        this.published_artifact_uuid = str2;
        this.artifact_type = str3;
        if ((i & 8) == 0) {
            this.code_language = null;
        } else {
            this.code_language = str4;
        }
        this.message_uuid = str5;
        this.title = str6;
        this.deleted = z;
    }

    /* JADX INFO: renamed from: copy-NOG8DHw$default, reason: not valid java name */
    public static /* synthetic */ PublishedArtifact m137copyNOG8DHw$default(PublishedArtifact publishedArtifact, String str, String str2, String str3, String str4, String str5, String str6, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = publishedArtifact.artifact_identifier;
        }
        if ((i & 2) != 0) {
            str2 = publishedArtifact.published_artifact_uuid;
        }
        if ((i & 4) != 0) {
            str3 = publishedArtifact.artifact_type;
        }
        if ((i & 8) != 0) {
            str4 = publishedArtifact.code_language;
        }
        if ((i & 16) != 0) {
            str5 = publishedArtifact.message_uuid;
        }
        if ((i & 32) != 0) {
            str6 = publishedArtifact.title;
        }
        if ((i & 64) != 0) {
            z = publishedArtifact.deleted;
        }
        String str7 = str6;
        boolean z2 = z;
        String str8 = str5;
        String str9 = str3;
        return publishedArtifact.m141copyNOG8DHw(str, str2, str9, str4, str8, str7, z2);
    }

    public static final /* synthetic */ void write$Self$api(PublishedArtifact self, vd4 output, SerialDescriptor serialDesc) {
        output.r(serialDesc, 0, kr0.a, ArtifactIdentifier.m964boximpl(self.artifact_identifier));
        output.r(serialDesc, 1, swd.a, PublishedArtifactId.m1086boximpl(self.published_artifact_uuid));
        output.q(serialDesc, 2, self.artifact_type);
        if (output.E(serialDesc) || self.code_language != null) {
            output.B(serialDesc, 3, srg.a, self.code_language);
        }
        output.r(serialDesc, 4, ehb.a, MessageId.m1051boximpl(self.message_uuid));
        output.q(serialDesc, 5, self.title);
        output.p(serialDesc, 6, self.deleted);
    }

    /* JADX INFO: renamed from: component1-eX_QYXY, reason: not valid java name and from getter */
    public final String getArtifact_identifier() {
        return this.artifact_identifier;
    }

    /* JADX INFO: renamed from: component2-2-azyQ4, reason: not valid java name and from getter */
    public final String getPublished_artifact_uuid() {
        return this.published_artifact_uuid;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getArtifact_type() {
        return this.artifact_type;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getCode_language() {
        return this.code_language;
    }

    /* JADX INFO: renamed from: component5-PStrttk, reason: not valid java name and from getter */
    public final String getMessage_uuid() {
        return this.message_uuid;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getDeleted() {
        return this.deleted;
    }

    /* JADX INFO: renamed from: copy-NOG8DHw, reason: not valid java name */
    public final PublishedArtifact m141copyNOG8DHw(String artifact_identifier, String published_artifact_uuid, String artifact_type, String code_language, String message_uuid, String title, boolean deleted) {
        artifact_identifier.getClass();
        published_artifact_uuid.getClass();
        artifact_type.getClass();
        message_uuid.getClass();
        title.getClass();
        return new PublishedArtifact(artifact_identifier, published_artifact_uuid, artifact_type, code_language, message_uuid, title, deleted, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PublishedArtifact)) {
            return false;
        }
        PublishedArtifact publishedArtifact = (PublishedArtifact) other;
        return ArtifactIdentifier.m967equalsimpl0(this.artifact_identifier, publishedArtifact.artifact_identifier) && PublishedArtifactId.m1089equalsimpl0(this.published_artifact_uuid, publishedArtifact.published_artifact_uuid) && x44.r(this.artifact_type, publishedArtifact.artifact_type) && x44.r(this.code_language, publishedArtifact.code_language) && MessageId.m1054equalsimpl0(this.message_uuid, publishedArtifact.message_uuid) && x44.r(this.title, publishedArtifact.title) && this.deleted == publishedArtifact.deleted;
    }

    /* JADX INFO: renamed from: getArtifact_identifier-eX_QYXY, reason: not valid java name */
    public final String m142getArtifact_identifiereX_QYXY() {
        return this.artifact_identifier;
    }

    public final String getArtifact_type() {
        return this.artifact_type;
    }

    public final String getCode_language() {
        return this.code_language;
    }

    public final boolean getDeleted() {
        return this.deleted;
    }

    /* JADX INFO: renamed from: getMessage_uuid-PStrttk, reason: not valid java name */
    public final String m143getMessage_uuidPStrttk() {
        return this.message_uuid;
    }

    /* JADX INFO: renamed from: getPublished_artifact_uuid-2-azyQ4, reason: not valid java name */
    public final String m144getPublished_artifact_uuid2azyQ4() {
        return this.published_artifact_uuid;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iL = kgh.l((PublishedArtifactId.m1090hashCodeimpl(this.published_artifact_uuid) + (ArtifactIdentifier.m968hashCodeimpl(this.artifact_identifier) * 31)) * 31, 31, this.artifact_type);
        String str = this.code_language;
        return Boolean.hashCode(this.deleted) + kgh.l((MessageId.m1055hashCodeimpl(this.message_uuid) + ((iL + (str == null ? 0 : str.hashCode())) * 31)) * 31, 31, this.title);
    }

    public String toString() {
        String strM969toStringimpl = ArtifactIdentifier.m969toStringimpl(this.artifact_identifier);
        String strM1091toStringimpl = PublishedArtifactId.m1091toStringimpl(this.published_artifact_uuid);
        String str = this.artifact_type;
        String str2 = this.code_language;
        String strM1056toStringimpl = MessageId.m1056toStringimpl(this.message_uuid);
        String str3 = this.title;
        boolean z = this.deleted;
        StringBuilder sbR = kgh.r("PublishedArtifact(artifact_identifier=", strM969toStringimpl, ", published_artifact_uuid=", strM1091toStringimpl, ", artifact_type=");
        kgh.u(sbR, str, ", code_language=", str2, ", message_uuid=");
        kgh.u(sbR, strM1056toStringimpl, ", title=", str3, ", deleted=");
        return sq6.v(")", sbR, z);
    }

    private PublishedArtifact(String str, String str2, String str3, String str4, String str5, String str6, boolean z) {
        y6a.s(str, str2, str3, str5, str6);
        this.artifact_identifier = str;
        this.published_artifact_uuid = str2;
        this.artifact_type = str3;
        this.code_language = str4;
        this.message_uuid = str5;
        this.title = str6;
        this.deleted = z;
    }

    public /* synthetic */ PublishedArtifact(String str, String str2, String str3, String str4, String str5, String str6, boolean z, mq5 mq5Var) {
        this(str, str2, str3, str4, str5, str6, z);
    }

    public /* synthetic */ PublishedArtifact(int i, String str, String str2, String str3, String str4, String str5, String str6, boolean z, vnf vnfVar, mq5 mq5Var) {
        this(i, str, str2, str3, str4, str5, str6, z, vnfVar);
    }

    public /* synthetic */ PublishedArtifact(String str, String str2, String str3, String str4, String str5, String str6, boolean z, int i, mq5 mq5Var) {
        this(str, str2, str3, (i & 8) != 0 ? null : str4, str5, str6, z, null);
    }
}
