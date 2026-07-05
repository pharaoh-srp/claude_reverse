package com.anthropic.claude.api.artifacts;

import com.anthropic.claude.types.strings.ArtifactId;
import com.anthropic.claude.types.strings.ArtifactIdentifier;
import com.anthropic.claude.types.strings.ChatId;
import com.anthropic.claude.types.strings.PublishedArtifactId;
import com.pvporbit.freetype.FreeTypeConstants;
import defpackage.bc9;
import defpackage.ebh;
import defpackage.gvj;
import defpackage.hmi;
import defpackage.imi;
import defpackage.ir0;
import defpackage.kgh;
import defpackage.kr0;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.srg;
import defpackage.swd;
import defpackage.vb7;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.vs2;
import java.util.Date;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0087\b\u0018\u0000 L2\u00020\u0001:\u0002MNB\u0085\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\u0019\u0010\u0011\u001a\u00150\fj\u0002`\r¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\t0\u0010\u0012\u0019\u0010\u0012\u001a\u00150\fj\u0002`\r¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\t0\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0015\u001a\u00020\b¢\u0006\u0004\b\u0016\u0010\u0017B\u007f\b\u0010\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u0016\u0010\u001cJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010!\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b \u0010\u001eJ\u0012\u0010#\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\"\u0010\u001eJ\u0012\u0010$\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b$\u0010\u001eJ\u0012\u0010%\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b%\u0010\u001eJ\u0012\u0010&\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b&\u0010\u001eJ#\u0010'\u001a\u00150\fj\u0002`\r¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\t0\u0010HÆ\u0003¢\u0006\u0004\b'\u0010(J#\u0010)\u001a\u00150\fj\u0002`\r¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\t0\u0010HÆ\u0003¢\u0006\u0004\b)\u0010(J\u0010\u0010+\u001a\u00020\u0013HÆ\u0003¢\u0006\u0004\b*\u0010\u001eJ\u0010\u0010,\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b,\u0010\u001eJ¢\u0001\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b2\u001b\b\u0002\u0010\u0011\u001a\u00150\fj\u0002`\r¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\t0\u00102\u001b\b\u0002\u0010\u0012\u001a\u00150\fj\u0002`\r¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\t0\u00102\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b-\u0010.J\u0010\u00100\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b0\u0010\u001eJ\u0010\u00101\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b1\u00102J\u001a\u00105\u001a\u0002042\b\u00103\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b5\u00106J'\u0010?\u001a\u00020<2\u0006\u00107\u001a\u00020\u00002\u0006\u00109\u001a\u0002082\u0006\u0010;\u001a\u00020:H\u0001¢\u0006\u0004\b=\u0010>R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010@\u001a\u0004\bA\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010@\u001a\u0004\bB\u0010\u001eR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010@\u001a\u0004\bC\u0010\u001eR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010@\u001a\u0004\bD\u0010\u001eR\u0019\u0010\n\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\n\u0010@\u001a\u0004\bE\u0010\u001eR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u000b\u0010@\u001a\u0004\bF\u0010\u001eR*\u0010\u0011\u001a\u00150\fj\u0002`\r¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\t0\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010G\u001a\u0004\bH\u0010(R*\u0010\u0012\u001a\u00150\fj\u0002`\r¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\t0\u00108\u0006¢\u0006\f\n\u0004\b\u0012\u0010G\u001a\u0004\bI\u0010(R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010@\u001a\u0004\bJ\u0010\u001eR\u0017\u0010\u0015\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0015\u0010@\u001a\u0004\bK\u0010\u001e¨\u0006O"}, d2 = {"Lcom/anthropic/claude/api/artifacts/UserArtifact;", "", "Lcom/anthropic/claude/types/strings/ArtifactId;", "uuid", "Lcom/anthropic/claude/types/strings/ArtifactIdentifier;", "artifact_identifier", "Lcom/anthropic/claude/types/strings/PublishedArtifactId;", "latest_published_artifact_uuid", "", "artifact_type", "title", "code_language", "Ljava/util/Date;", "Lcom/anthropic/claude/api/Iso8601Date;", "Lonf;", "with", "Lbc9;", "created_at", "updated_at", "Lcom/anthropic/claude/types/strings/ChatId;", "chat_conversation_uuid", "preview", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;Lmq5;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;Lvnf;Lmq5;)V", "component1-QssJVS4", "()Ljava/lang/String;", "component1", "component2-eX_QYXY", "component2", "component3-vF4hnP0", "component3", "component4", "component5", "component6", "component7", "()Ljava/util/Date;", "component8", "component9-RjYBDck", "component9", "component10", "copy-bdlfZKc", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;)Lcom/anthropic/claude/api/artifacts/UserArtifact;", "copy", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/artifacts/UserArtifact;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/String;", "getUuid-QssJVS4", "getArtifact_identifier-eX_QYXY", "getLatest_published_artifact_uuid-vF4hnP0", "getArtifact_type", "getTitle", "getCode_language", "Ljava/util/Date;", "getCreated_at", "getUpdated_at", "getChat_conversation_uuid-RjYBDck", "getPreview", "Companion", "hmi", "imi", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class UserArtifact {
    public static final int $stable = 0;
    public static final imi Companion = new imi();
    private final String artifact_identifier;
    private final String artifact_type;
    private final String chat_conversation_uuid;
    private final String code_language;
    private final Date created_at;
    private final String latest_published_artifact_uuid;
    private final String preview;
    private final String title;
    private final Date updated_at;
    private final String uuid;

    private UserArtifact(String str, String str2, String str3, String str4, String str5, String str6, Date date, Date date2, String str7, String str8) {
        str.getClass();
        str2.getClass();
        date.getClass();
        date2.getClass();
        str7.getClass();
        str8.getClass();
        this.uuid = str;
        this.artifact_identifier = str2;
        this.latest_published_artifact_uuid = str3;
        this.artifact_type = str4;
        this.title = str5;
        this.code_language = str6;
        this.created_at = date;
        this.updated_at = date2;
        this.chat_conversation_uuid = str7;
        this.preview = str8;
    }

    /* JADX INFO: renamed from: copy-bdlfZKc$default, reason: not valid java name */
    public static /* synthetic */ UserArtifact m145copybdlfZKc$default(UserArtifact userArtifact, String str, String str2, String str3, String str4, String str5, String str6, Date date, Date date2, String str7, String str8, int i, Object obj) {
        if ((i & 1) != 0) {
            str = userArtifact.uuid;
        }
        if ((i & 2) != 0) {
            str2 = userArtifact.artifact_identifier;
        }
        if ((i & 4) != 0) {
            str3 = userArtifact.latest_published_artifact_uuid;
        }
        if ((i & 8) != 0) {
            str4 = userArtifact.artifact_type;
        }
        if ((i & 16) != 0) {
            str5 = userArtifact.title;
        }
        if ((i & 32) != 0) {
            str6 = userArtifact.code_language;
        }
        if ((i & 64) != 0) {
            date = userArtifact.created_at;
        }
        if ((i & FreeTypeConstants.FT_LOAD_PEDANTIC) != 0) {
            date2 = userArtifact.updated_at;
        }
        if ((i & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) != 0) {
            str7 = userArtifact.chat_conversation_uuid;
        }
        if ((i & 512) != 0) {
            str8 = userArtifact.preview;
        }
        String str9 = str7;
        String str10 = str8;
        Date date3 = date;
        Date date4 = date2;
        String str11 = str5;
        String str12 = str6;
        return userArtifact.m150copybdlfZKc(str, str2, str3, str4, str11, str12, date3, date4, str9, str10);
    }

    public static final /* synthetic */ void write$Self$api(UserArtifact self, vd4 output, SerialDescriptor serialDesc) {
        output.r(serialDesc, 0, ir0.a, ArtifactId.m957boximpl(self.uuid));
        output.r(serialDesc, 1, kr0.a, ArtifactIdentifier.m964boximpl(self.artifact_identifier));
        swd swdVar = swd.a;
        String str = self.latest_published_artifact_uuid;
        output.B(serialDesc, 2, swdVar, str != null ? PublishedArtifactId.m1086boximpl(str) : null);
        srg srgVar = srg.a;
        output.B(serialDesc, 3, srgVar, self.artifact_type);
        output.B(serialDesc, 4, srgVar, self.title);
        output.B(serialDesc, 5, srgVar, self.code_language);
        bc9 bc9Var = bc9.a;
        output.r(serialDesc, 6, bc9Var, self.created_at);
        output.r(serialDesc, 7, bc9Var, self.updated_at);
        output.r(serialDesc, 8, vs2.a, ChatId.m978boximpl(self.chat_conversation_uuid));
        output.q(serialDesc, 9, self.preview);
    }

    /* JADX INFO: renamed from: component1-QssJVS4, reason: not valid java name and from getter */
    public final String getUuid() {
        return this.uuid;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getPreview() {
        return this.preview;
    }

    /* JADX INFO: renamed from: component2-eX_QYXY, reason: not valid java name and from getter */
    public final String getArtifact_identifier() {
        return this.artifact_identifier;
    }

    /* JADX INFO: renamed from: component3-vF4hnP0, reason: not valid java name and from getter */
    public final String getLatest_published_artifact_uuid() {
        return this.latest_published_artifact_uuid;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getArtifact_type() {
        return this.artifact_type;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getCode_language() {
        return this.code_language;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Date getCreated_at() {
        return this.created_at;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Date getUpdated_at() {
        return this.updated_at;
    }

    /* JADX INFO: renamed from: component9-RjYBDck, reason: not valid java name and from getter */
    public final String getChat_conversation_uuid() {
        return this.chat_conversation_uuid;
    }

    /* JADX INFO: renamed from: copy-bdlfZKc, reason: not valid java name */
    public final UserArtifact m150copybdlfZKc(String uuid, String artifact_identifier, String latest_published_artifact_uuid, String artifact_type, String title, String code_language, Date created_at, Date updated_at, String chat_conversation_uuid, String preview) {
        uuid.getClass();
        artifact_identifier.getClass();
        created_at.getClass();
        updated_at.getClass();
        chat_conversation_uuid.getClass();
        preview.getClass();
        return new UserArtifact(uuid, artifact_identifier, latest_published_artifact_uuid, artifact_type, title, code_language, created_at, updated_at, chat_conversation_uuid, preview, null);
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
            boolean r1 = r5 instanceof com.anthropic.claude.api.artifacts.UserArtifact
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.anthropic.claude.api.artifacts.UserArtifact r5 = (com.anthropic.claude.api.artifacts.UserArtifact) r5
            java.lang.String r1 = r4.uuid
            java.lang.String r3 = r5.uuid
            boolean r1 = com.anthropic.claude.types.strings.ArtifactId.m960equalsimpl0(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.lang.String r1 = r4.artifact_identifier
            java.lang.String r3 = r5.artifact_identifier
            boolean r1 = com.anthropic.claude.types.strings.ArtifactIdentifier.m967equalsimpl0(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            java.lang.String r1 = r4.latest_published_artifact_uuid
            java.lang.String r3 = r5.latest_published_artifact_uuid
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
            boolean r1 = com.anthropic.claude.types.strings.PublishedArtifactId.m1089equalsimpl0(r1, r3)
        L35:
            if (r1 != 0) goto L38
            return r2
        L38:
            java.lang.String r1 = r4.artifact_type
            java.lang.String r3 = r5.artifact_type
            boolean r1 = defpackage.x44.r(r1, r3)
            if (r1 != 0) goto L43
            return r2
        L43:
            java.lang.String r1 = r4.title
            java.lang.String r3 = r5.title
            boolean r1 = defpackage.x44.r(r1, r3)
            if (r1 != 0) goto L4e
            return r2
        L4e:
            java.lang.String r1 = r4.code_language
            java.lang.String r3 = r5.code_language
            boolean r1 = defpackage.x44.r(r1, r3)
            if (r1 != 0) goto L59
            return r2
        L59:
            java.util.Date r1 = r4.created_at
            java.util.Date r3 = r5.created_at
            boolean r1 = defpackage.x44.r(r1, r3)
            if (r1 != 0) goto L64
            return r2
        L64:
            java.util.Date r1 = r4.updated_at
            java.util.Date r3 = r5.updated_at
            boolean r1 = defpackage.x44.r(r1, r3)
            if (r1 != 0) goto L6f
            return r2
        L6f:
            java.lang.String r1 = r4.chat_conversation_uuid
            java.lang.String r3 = r5.chat_conversation_uuid
            boolean r1 = com.anthropic.claude.types.strings.ChatId.m981equalsimpl0(r1, r3)
            if (r1 != 0) goto L7a
            return r2
        L7a:
            java.lang.String r4 = r4.preview
            java.lang.String r5 = r5.preview
            boolean r4 = defpackage.x44.r(r4, r5)
            if (r4 != 0) goto L85
            return r2
        L85:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anthropic.claude.api.artifacts.UserArtifact.equals(java.lang.Object):boolean");
    }

    /* JADX INFO: renamed from: getArtifact_identifier-eX_QYXY, reason: not valid java name */
    public final String m151getArtifact_identifiereX_QYXY() {
        return this.artifact_identifier;
    }

    public final String getArtifact_type() {
        return this.artifact_type;
    }

    /* JADX INFO: renamed from: getChat_conversation_uuid-RjYBDck, reason: not valid java name */
    public final String m152getChat_conversation_uuidRjYBDck() {
        return this.chat_conversation_uuid;
    }

    public final String getCode_language() {
        return this.code_language;
    }

    public final Date getCreated_at() {
        return this.created_at;
    }

    /* JADX INFO: renamed from: getLatest_published_artifact_uuid-vF4hnP0, reason: not valid java name */
    public final String m153getLatest_published_artifact_uuidvF4hnP0() {
        return this.latest_published_artifact_uuid;
    }

    public final String getPreview() {
        return this.preview;
    }

    public final String getTitle() {
        return this.title;
    }

    public final Date getUpdated_at() {
        return this.updated_at;
    }

    /* JADX INFO: renamed from: getUuid-QssJVS4, reason: not valid java name */
    public final String m154getUuidQssJVS4() {
        return this.uuid;
    }

    public int hashCode() {
        int iM968hashCodeimpl = (ArtifactIdentifier.m968hashCodeimpl(this.artifact_identifier) + (ArtifactId.m961hashCodeimpl(this.uuid) * 31)) * 31;
        String str = this.latest_published_artifact_uuid;
        int iM1090hashCodeimpl = (iM968hashCodeimpl + (str == null ? 0 : PublishedArtifactId.m1090hashCodeimpl(str))) * 31;
        String str2 = this.artifact_type;
        int iHashCode = (iM1090hashCodeimpl + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.title;
        int iHashCode2 = (iHashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.code_language;
        return this.preview.hashCode() + ((ChatId.m982hashCodeimpl(this.chat_conversation_uuid) + ebh.j(this.updated_at, ebh.j(this.created_at, (iHashCode2 + (str4 != null ? str4.hashCode() : 0)) * 31, 31), 31)) * 31);
    }

    public String toString() {
        String strM962toStringimpl = ArtifactId.m962toStringimpl(this.uuid);
        String strM969toStringimpl = ArtifactIdentifier.m969toStringimpl(this.artifact_identifier);
        String str = this.latest_published_artifact_uuid;
        String strM1091toStringimpl = str == null ? "null" : PublishedArtifactId.m1091toStringimpl(str);
        String str2 = this.artifact_type;
        String str3 = this.title;
        String str4 = this.code_language;
        Date date = this.created_at;
        Date date2 = this.updated_at;
        String strM983toStringimpl = ChatId.m983toStringimpl(this.chat_conversation_uuid);
        String str5 = this.preview;
        StringBuilder sbR = kgh.r("UserArtifact(uuid=", strM962toStringimpl, ", artifact_identifier=", strM969toStringimpl, ", latest_published_artifact_uuid=");
        kgh.u(sbR, strM1091toStringimpl, ", artifact_type=", str2, ", title=");
        kgh.u(sbR, str3, ", code_language=", str4, ", created_at=");
        sbR.append(date);
        sbR.append(", updated_at=");
        sbR.append(date2);
        sbR.append(", chat_conversation_uuid=");
        return vb7.t(sbR, strM983toStringimpl, ", preview=", str5, ")");
    }

    public /* synthetic */ UserArtifact(String str, String str2, String str3, String str4, String str5, String str6, Date date, Date date2, String str7, String str8, mq5 mq5Var) {
        this(str, str2, str3, str4, str5, str6, date, date2, str7, str8);
    }

    private /* synthetic */ UserArtifact(int i, String str, String str2, String str3, String str4, String str5, String str6, Date date, Date date2, String str7, String str8, vnf vnfVar) {
        if (1023 != (i & 1023)) {
            gvj.f(i, 1023, hmi.a.getDescriptor());
            throw null;
        }
        this.uuid = str;
        this.artifact_identifier = str2;
        this.latest_published_artifact_uuid = str3;
        this.artifact_type = str4;
        this.title = str5;
        this.code_language = str6;
        this.created_at = date;
        this.updated_at = date2;
        this.chat_conversation_uuid = str7;
        this.preview = str8;
    }

    public /* synthetic */ UserArtifact(int i, String str, String str2, String str3, String str4, String str5, String str6, Date date, Date date2, String str7, String str8, vnf vnfVar, mq5 mq5Var) {
        this(i, str, str2, str3, str4, str5, str6, date, date2, str7, str8, vnfVar);
    }
}
