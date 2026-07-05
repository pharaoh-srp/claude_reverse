package com.anthropic.claude.api.artifacts;

import com.anthropic.claude.types.strings.ArtifactId;
import com.anthropic.claude.types.strings.ArtifactIdentifier;
import com.anthropic.claude.types.strings.ChatId;
import com.anthropic.claude.types.strings.MessageId;
import com.pvporbit.freetype.FreeTypeConstants;
import defpackage.cwd;
import defpackage.dwd;
import defpackage.ehb;
import defpackage.gvj;
import defpackage.ir0;
import defpackage.kgh;
import defpackage.kr0;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.srg;
import defpackage.vb7;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.vs2;
import defpackage.y6a;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u0000 ?2\u00020\u0001:\u0002@ABM\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u0010Bk\b\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u000f\u0010\u0015J'\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\"\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\"\u0010 J\u0012\u0010$\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b#\u0010 J\u0012\u0010%\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b%\u0010 J\u0010\u0010&\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b&\u0010 J\u0010\u0010(\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b'\u0010 J\u0010\u0010*\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b)\u0010 J\u0010\u0010+\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b+\u0010 Jd\u0010.\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b,\u0010-J\u0010\u0010/\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b/\u0010 J\u0010\u00100\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b0\u00101J\u001a\u00104\u001a\u0002032\b\u00102\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b4\u00105R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00106\u001a\u0004\b7\u0010 R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00106\u001a\u0004\b8\u0010 R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00106\u001a\u0004\b9\u0010 R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\b\u00106\u001a\u0004\b:\u0010 R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u00106\u001a\u0004\b;\u0010 R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u00106\u001a\u0004\b<\u0010 R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u00106\u001a\u0004\b=\u0010 R\u0017\u0010\u000e\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u00106\u001a\u0004\b>\u0010 ¨\u0006B"}, d2 = {"Lcom/anthropic/claude/api/artifacts/PublishArtifactRequest;", "", "Lcom/anthropic/claude/types/strings/ArtifactIdentifier;", "artifact_identifier", "", "artifact_type", "Lcom/anthropic/claude/types/strings/ArtifactId;", "artifact_version_uuid", "code_language", "content", "Lcom/anthropic/claude/types/strings/ChatId;", "conversation_uuid", "Lcom/anthropic/claude/types/strings/MessageId;", "message_uuid", "title", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lmq5;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lvnf;Lmq5;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/artifacts/PublishArtifactRequest;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1-eX_QYXY", "()Ljava/lang/String;", "component1", "component2", "component3-inL-Aoc", "component3", "component4", "component5", "component6-RjYBDck", "component6", "component7-PStrttk", "component7", "component8", "copy-7eEouFE", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/anthropic/claude/api/artifacts/PublishArtifactRequest;", "copy", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getArtifact_identifier-eX_QYXY", "getArtifact_type", "getArtifact_version_uuid-inL-Aoc", "getCode_language", "getContent", "getConversation_uuid-RjYBDck", "getMessage_uuid-PStrttk", "getTitle", "Companion", "cwd", "dwd", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class PublishArtifactRequest {
    public static final int $stable = 0;
    public static final dwd Companion = new dwd();
    private final String artifact_identifier;
    private final String artifact_type;
    private final String artifact_version_uuid;
    private final String code_language;
    private final String content;
    private final String conversation_uuid;
    private final String message_uuid;
    private final String title;

    private /* synthetic */ PublishArtifactRequest(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, vnf vnfVar) {
        if (247 != (i & 247)) {
            gvj.f(i, 247, cwd.a.getDescriptor());
            throw null;
        }
        this.artifact_identifier = str;
        this.artifact_type = str2;
        this.artifact_version_uuid = str3;
        if ((i & 8) == 0) {
            this.code_language = null;
        } else {
            this.code_language = str4;
        }
        this.content = str5;
        this.conversation_uuid = str6;
        this.message_uuid = str7;
        this.title = str8;
    }

    /* JADX INFO: renamed from: copy-7eEouFE$default, reason: not valid java name */
    public static /* synthetic */ PublishArtifactRequest m127copy7eEouFE$default(PublishArtifactRequest publishArtifactRequest, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, Object obj) {
        if ((i & 1) != 0) {
            str = publishArtifactRequest.artifact_identifier;
        }
        if ((i & 2) != 0) {
            str2 = publishArtifactRequest.artifact_type;
        }
        if ((i & 4) != 0) {
            str3 = publishArtifactRequest.artifact_version_uuid;
        }
        if ((i & 8) != 0) {
            str4 = publishArtifactRequest.code_language;
        }
        if ((i & 16) != 0) {
            str5 = publishArtifactRequest.content;
        }
        if ((i & 32) != 0) {
            str6 = publishArtifactRequest.conversation_uuid;
        }
        if ((i & 64) != 0) {
            str7 = publishArtifactRequest.message_uuid;
        }
        if ((i & FreeTypeConstants.FT_LOAD_PEDANTIC) != 0) {
            str8 = publishArtifactRequest.title;
        }
        String str9 = str7;
        String str10 = str8;
        String str11 = str5;
        String str12 = str6;
        return publishArtifactRequest.m132copy7eEouFE(str, str2, str3, str4, str11, str12, str9, str10);
    }

    public static final /* synthetic */ void write$Self$api(PublishArtifactRequest self, vd4 output, SerialDescriptor serialDesc) {
        output.r(serialDesc, 0, kr0.a, ArtifactIdentifier.m964boximpl(self.artifact_identifier));
        output.q(serialDesc, 1, self.artifact_type);
        ir0 ir0Var = ir0.a;
        String str = self.artifact_version_uuid;
        output.B(serialDesc, 2, ir0Var, str != null ? ArtifactId.m957boximpl(str) : null);
        if (output.E(serialDesc) || self.code_language != null) {
            output.B(serialDesc, 3, srg.a, self.code_language);
        }
        output.q(serialDesc, 4, self.content);
        output.r(serialDesc, 5, vs2.a, ChatId.m978boximpl(self.conversation_uuid));
        output.r(serialDesc, 6, ehb.a, MessageId.m1051boximpl(self.message_uuid));
        output.q(serialDesc, 7, self.title);
    }

    /* JADX INFO: renamed from: component1-eX_QYXY, reason: not valid java name and from getter */
    public final String getArtifact_identifier() {
        return this.artifact_identifier;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getArtifact_type() {
        return this.artifact_type;
    }

    /* JADX INFO: renamed from: component3-inL-Aoc, reason: not valid java name and from getter */
    public final String getArtifact_version_uuid() {
        return this.artifact_version_uuid;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getCode_language() {
        return this.code_language;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getContent() {
        return this.content;
    }

    /* JADX INFO: renamed from: component6-RjYBDck, reason: not valid java name and from getter */
    public final String getConversation_uuid() {
        return this.conversation_uuid;
    }

    /* JADX INFO: renamed from: component7-PStrttk, reason: not valid java name and from getter */
    public final String getMessage_uuid() {
        return this.message_uuid;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: copy-7eEouFE, reason: not valid java name */
    public final PublishArtifactRequest m132copy7eEouFE(String artifact_identifier, String artifact_type, String artifact_version_uuid, String code_language, String content, String conversation_uuid, String message_uuid, String title) {
        y6a.s(artifact_identifier, artifact_type, content, conversation_uuid, message_uuid);
        title.getClass();
        return new PublishArtifactRequest(artifact_identifier, artifact_type, artifact_version_uuid, code_language, content, conversation_uuid, message_uuid, title, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x002c  */
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
            boolean r1 = r5 instanceof com.anthropic.claude.api.artifacts.PublishArtifactRequest
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.anthropic.claude.api.artifacts.PublishArtifactRequest r5 = (com.anthropic.claude.api.artifacts.PublishArtifactRequest) r5
            java.lang.String r1 = r4.artifact_identifier
            java.lang.String r3 = r5.artifact_identifier
            boolean r1 = com.anthropic.claude.types.strings.ArtifactIdentifier.m967equalsimpl0(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.lang.String r1 = r4.artifact_type
            java.lang.String r3 = r5.artifact_type
            boolean r1 = defpackage.x44.r(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            java.lang.String r1 = r4.artifact_version_uuid
            java.lang.String r3 = r5.artifact_version_uuid
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
            boolean r1 = com.anthropic.claude.types.strings.ArtifactId.m960equalsimpl0(r1, r3)
        L35:
            if (r1 != 0) goto L38
            return r2
        L38:
            java.lang.String r1 = r4.code_language
            java.lang.String r3 = r5.code_language
            boolean r1 = defpackage.x44.r(r1, r3)
            if (r1 != 0) goto L43
            return r2
        L43:
            java.lang.String r1 = r4.content
            java.lang.String r3 = r5.content
            boolean r1 = defpackage.x44.r(r1, r3)
            if (r1 != 0) goto L4e
            return r2
        L4e:
            java.lang.String r1 = r4.conversation_uuid
            java.lang.String r3 = r5.conversation_uuid
            boolean r1 = com.anthropic.claude.types.strings.ChatId.m981equalsimpl0(r1, r3)
            if (r1 != 0) goto L59
            return r2
        L59:
            java.lang.String r1 = r4.message_uuid
            java.lang.String r3 = r5.message_uuid
            boolean r1 = com.anthropic.claude.types.strings.MessageId.m1054equalsimpl0(r1, r3)
            if (r1 != 0) goto L64
            return r2
        L64:
            java.lang.String r4 = r4.title
            java.lang.String r5 = r5.title
            boolean r4 = defpackage.x44.r(r4, r5)
            if (r4 != 0) goto L6f
            return r2
        L6f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anthropic.claude.api.artifacts.PublishArtifactRequest.equals(java.lang.Object):boolean");
    }

    /* JADX INFO: renamed from: getArtifact_identifier-eX_QYXY, reason: not valid java name */
    public final String m133getArtifact_identifiereX_QYXY() {
        return this.artifact_identifier;
    }

    public final String getArtifact_type() {
        return this.artifact_type;
    }

    /* JADX INFO: renamed from: getArtifact_version_uuid-inL-Aoc, reason: not valid java name */
    public final String m134getArtifact_version_uuidinLAoc() {
        return this.artifact_version_uuid;
    }

    public final String getCode_language() {
        return this.code_language;
    }

    public final String getContent() {
        return this.content;
    }

    /* JADX INFO: renamed from: getConversation_uuid-RjYBDck, reason: not valid java name */
    public final String m135getConversation_uuidRjYBDck() {
        return this.conversation_uuid;
    }

    /* JADX INFO: renamed from: getMessage_uuid-PStrttk, reason: not valid java name */
    public final String m136getMessage_uuidPStrttk() {
        return this.message_uuid;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iL = kgh.l(ArtifactIdentifier.m968hashCodeimpl(this.artifact_identifier) * 31, 31, this.artifact_type);
        String str = this.artifact_version_uuid;
        int iM961hashCodeimpl = (iL + (str == null ? 0 : ArtifactId.m961hashCodeimpl(str))) * 31;
        String str2 = this.code_language;
        return this.title.hashCode() + ((MessageId.m1055hashCodeimpl(this.message_uuid) + ((ChatId.m982hashCodeimpl(this.conversation_uuid) + kgh.l((iM961hashCodeimpl + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.content)) * 31)) * 31);
    }

    public String toString() {
        String strM969toStringimpl = ArtifactIdentifier.m969toStringimpl(this.artifact_identifier);
        String str = this.artifact_type;
        String str2 = this.artifact_version_uuid;
        String strM962toStringimpl = str2 == null ? "null" : ArtifactId.m962toStringimpl(str2);
        String str3 = this.code_language;
        String str4 = this.content;
        String strM983toStringimpl = ChatId.m983toStringimpl(this.conversation_uuid);
        String strM1056toStringimpl = MessageId.m1056toStringimpl(this.message_uuid);
        String str5 = this.title;
        StringBuilder sbR = kgh.r("PublishArtifactRequest(artifact_identifier=", strM969toStringimpl, ", artifact_type=", str, ", artifact_version_uuid=");
        kgh.u(sbR, strM962toStringimpl, ", code_language=", str3, ", content=");
        kgh.u(sbR, str4, ", conversation_uuid=", strM983toStringimpl, ", message_uuid=");
        return vb7.t(sbR, strM1056toStringimpl, ", title=", str5, ")");
    }

    private PublishArtifactRequest(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        y6a.s(str, str2, str5, str6, str7);
        str8.getClass();
        this.artifact_identifier = str;
        this.artifact_type = str2;
        this.artifact_version_uuid = str3;
        this.code_language = str4;
        this.content = str5;
        this.conversation_uuid = str6;
        this.message_uuid = str7;
        this.title = str8;
    }

    public /* synthetic */ PublishArtifactRequest(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, mq5 mq5Var) {
        this(str, str2, str3, str4, str5, str6, str7, str8);
    }

    public /* synthetic */ PublishArtifactRequest(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, vnf vnfVar, mq5 mq5Var) {
        this(i, str, str2, str3, str4, str5, str6, str7, str8, vnfVar);
    }

    public /* synthetic */ PublishArtifactRequest(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, mq5 mq5Var) {
        this(str, str2, str3, (i & 8) != 0 ? null : str4, str5, str6, str7, str8, null);
    }
}
