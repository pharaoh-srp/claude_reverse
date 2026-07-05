package com.anthropic.claude.api.artifacts;

import com.anthropic.claude.types.strings.ArtifactId;
import com.anthropic.claude.types.strings.MessageId;
import com.anthropic.claude.types.strings.PublishedArtifactId;
import com.pvporbit.freetype.FreeTypeConstants;
import defpackage.bc9;
import defpackage.ebh;
import defpackage.ehb;
import defpackage.fu0;
import defpackage.gvj;
import defpackage.ir0;
import defpackage.kgh;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.nt0;
import defpackage.onf;
import defpackage.srg;
import defpackage.swd;
import defpackage.ut0;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.vt0;
import defpackage.y6a;
import java.util.Date;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0087\b\u0018\u0000 W2\u00020\u0001:\u0002XYB\u0099\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0019\u0010\u0011\u001a\u00150\fj\u0002`\r¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\t0\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\u001d\u0010\u0018\u001a\u0019\u0018\u00010\fj\u0004\u0018\u0001`\r¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\t0\u0010¢\u0006\u0004\b\u0019\u0010\u001aB\u0093\u0001\b\u0010\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b\u0019\u0010\u001fJ\u0010\u0010\"\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010$\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b#\u0010!J\u0010\u0010&\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b%\u0010!J\u0010\u0010'\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b'\u0010!J\u0012\u0010(\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b(\u0010!J\u0012\u0010)\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b)\u0010!J\u0010\u0010*\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b*\u0010!J#\u0010+\u001a\u00150\fj\u0002`\r¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\t0\u0010HÆ\u0003¢\u0006\u0004\b+\u0010,J\u0012\u0010-\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020\u0014HÆ\u0003¢\u0006\u0004\b/\u00100J\u0012\u00102\u001a\u0004\u0018\u00010\u0016HÆ\u0003¢\u0006\u0004\b1\u0010!J'\u00103\u001a\u0019\u0018\u00010\fj\u0004\u0018\u0001`\r¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\t0\u0010HÆ\u0003¢\u0006\u0004\b3\u0010,Jº\u0001\u00106\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u00072\u001b\b\u0002\u0010\u0011\u001a\u00150\fj\u0002`\r¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\t0\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00142\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u001f\b\u0002\u0010\u0018\u001a\u0019\u0018\u00010\fj\u0004\u0018\u0001`\r¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\t0\u0010HÆ\u0001¢\u0006\u0004\b4\u00105J\u0010\u00107\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b7\u0010!J\u0010\u00108\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b8\u00109J\u001a\u0010<\u001a\u00020;2\b\u0010:\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b<\u0010=J'\u0010F\u001a\u00020C2\u0006\u0010>\u001a\u00020\u00002\u0006\u0010@\u001a\u00020?2\u0006\u0010B\u001a\u00020AH\u0001¢\u0006\u0004\bD\u0010ER\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010G\u001a\u0004\bH\u0010!R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010G\u001a\u0004\bI\u0010!R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010G\u001a\u0004\bJ\u0010!R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010G\u001a\u0004\bK\u0010!R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010G\u001a\u0004\bL\u0010!R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\n\u0010G\u001a\u0004\bM\u0010!R\u0017\u0010\u000b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u000b\u0010G\u001a\u0004\bN\u0010!R*\u0010\u0011\u001a\u00150\fj\u0002`\r¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\t0\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010O\u001a\u0004\bP\u0010,R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010Q\u001a\u0004\bR\u0010.R\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010S\u001a\u0004\bT\u00100R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010G\u001a\u0004\bU\u0010!R.\u0010\u0018\u001a\u0019\u0018\u00010\fj\u0004\u0018\u0001`\r¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\t0\u00108\u0006¢\u0006\f\n\u0004\b\u0018\u0010O\u001a\u0004\bV\u0010,¨\u0006Z"}, d2 = {"Lcom/anthropic/claude/api/artifacts/ArtifactVersionRecord;", "", "Lcom/anthropic/claude/types/strings/ArtifactId;", "uuid", "artifact_uuid", "Lcom/anthropic/claude/types/strings/MessageId;", "message_uuid", "", "artifact_type", "code_language", "title", "result_state", "Ljava/util/Date;", "Lcom/anthropic/claude/api/Iso8601Date;", "Lonf;", "with", "Lbc9;", "created_at", "Lcom/anthropic/claude/api/artifacts/ArtifactSource;", "source", "Lcom/anthropic/claude/api/artifacts/ArtifactVisibility;", "visibility", "Lcom/anthropic/claude/types/strings/PublishedArtifactId;", "published_artifact_uuid", "published_artifact_deleted_at", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Lcom/anthropic/claude/api/artifacts/ArtifactSource;Lcom/anthropic/claude/api/artifacts/ArtifactVisibility;Ljava/lang/String;Ljava/util/Date;Lmq5;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Lcom/anthropic/claude/api/artifacts/ArtifactSource;Lcom/anthropic/claude/api/artifacts/ArtifactVisibility;Ljava/lang/String;Ljava/util/Date;Lvnf;Lmq5;)V", "component1-QssJVS4", "()Ljava/lang/String;", "component1", "component2-QssJVS4", "component2", "component3-PStrttk", "component3", "component4", "component5", "component6", "component7", "component8", "()Ljava/util/Date;", "component9", "()Lcom/anthropic/claude/api/artifacts/ArtifactSource;", "component10", "()Lcom/anthropic/claude/api/artifacts/ArtifactVisibility;", "component11-vF4hnP0", "component11", "component12", "copy-BaA1eQs", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Lcom/anthropic/claude/api/artifacts/ArtifactSource;Lcom/anthropic/claude/api/artifacts/ArtifactVisibility;Ljava/lang/String;Ljava/util/Date;)Lcom/anthropic/claude/api/artifacts/ArtifactVersionRecord;", "copy", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/artifacts/ArtifactVersionRecord;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/String;", "getUuid-QssJVS4", "getArtifact_uuid-QssJVS4", "getMessage_uuid-PStrttk", "getArtifact_type", "getCode_language", "getTitle", "getResult_state", "Ljava/util/Date;", "getCreated_at", "Lcom/anthropic/claude/api/artifacts/ArtifactSource;", "getSource", "Lcom/anthropic/claude/api/artifacts/ArtifactVisibility;", "getVisibility", "getPublished_artifact_uuid-vF4hnP0", "getPublished_artifact_deleted_at", "Companion", "ut0", "vt0", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class ArtifactVersionRecord {
    public static final int $stable = 0;
    public static final vt0 Companion = new vt0();
    private final String artifact_type;
    private final String artifact_uuid;
    private final String code_language;
    private final Date created_at;
    private final String message_uuid;
    private final Date published_artifact_deleted_at;
    private final String published_artifact_uuid;
    private final String result_state;
    private final ArtifactSource source;
    private final String title;
    private final String uuid;
    private final ArtifactVisibility visibility;

    private /* synthetic */ ArtifactVersionRecord(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, Date date, ArtifactSource artifactSource, ArtifactVisibility artifactVisibility, String str8, Date date2, vnf vnfVar) {
        if (4095 != (i & 4095)) {
            gvj.f(i, 4095, ut0.a.getDescriptor());
            throw null;
        }
        this.uuid = str;
        this.artifact_uuid = str2;
        this.message_uuid = str3;
        this.artifact_type = str4;
        this.code_language = str5;
        this.title = str6;
        this.result_state = str7;
        this.created_at = date;
        this.source = artifactSource;
        this.visibility = artifactVisibility;
        this.published_artifact_uuid = str8;
        this.published_artifact_deleted_at = date2;
    }

    /* JADX INFO: renamed from: copy-BaA1eQs$default, reason: not valid java name */
    public static /* synthetic */ ArtifactVersionRecord m117copyBaA1eQs$default(ArtifactVersionRecord artifactVersionRecord, String str, String str2, String str3, String str4, String str5, String str6, String str7, Date date, ArtifactSource artifactSource, ArtifactVisibility artifactVisibility, String str8, Date date2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = artifactVersionRecord.uuid;
        }
        if ((i & 2) != 0) {
            str2 = artifactVersionRecord.artifact_uuid;
        }
        if ((i & 4) != 0) {
            str3 = artifactVersionRecord.message_uuid;
        }
        if ((i & 8) != 0) {
            str4 = artifactVersionRecord.artifact_type;
        }
        if ((i & 16) != 0) {
            str5 = artifactVersionRecord.code_language;
        }
        if ((i & 32) != 0) {
            str6 = artifactVersionRecord.title;
        }
        if ((i & 64) != 0) {
            str7 = artifactVersionRecord.result_state;
        }
        if ((i & FreeTypeConstants.FT_LOAD_PEDANTIC) != 0) {
            date = artifactVersionRecord.created_at;
        }
        if ((i & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) != 0) {
            artifactSource = artifactVersionRecord.source;
        }
        if ((i & 512) != 0) {
            artifactVisibility = artifactVersionRecord.visibility;
        }
        if ((i & FreeTypeConstants.FT_LOAD_NO_RECURSE) != 0) {
            str8 = artifactVersionRecord.published_artifact_uuid;
        }
        if ((i & FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM) != 0) {
            date2 = artifactVersionRecord.published_artifact_deleted_at;
        }
        String str9 = str8;
        Date date3 = date2;
        ArtifactSource artifactSource2 = artifactSource;
        ArtifactVisibility artifactVisibility2 = artifactVisibility;
        String str10 = str7;
        Date date4 = date;
        String str11 = str5;
        String str12 = str6;
        return artifactVersionRecord.m122copyBaA1eQs(str, str2, str3, str4, str11, str12, str10, date4, artifactSource2, artifactVisibility2, str9, date3);
    }

    public static final /* synthetic */ void write$Self$api(ArtifactVersionRecord self, vd4 output, SerialDescriptor serialDesc) {
        ir0 ir0Var = ir0.a;
        output.r(serialDesc, 0, ir0Var, ArtifactId.m957boximpl(self.uuid));
        output.r(serialDesc, 1, ir0Var, ArtifactId.m957boximpl(self.artifact_uuid));
        output.r(serialDesc, 2, ehb.a, MessageId.m1051boximpl(self.message_uuid));
        output.q(serialDesc, 3, self.artifact_type);
        srg srgVar = srg.a;
        output.B(serialDesc, 4, srgVar, self.code_language);
        output.B(serialDesc, 5, srgVar, self.title);
        output.q(serialDesc, 6, self.result_state);
        bc9 bc9Var = bc9.a;
        output.r(serialDesc, 7, bc9Var, self.created_at);
        output.B(serialDesc, 8, nt0.d, self.source);
        output.r(serialDesc, 9, fu0.d, self.visibility);
        swd swdVar = swd.a;
        String str = self.published_artifact_uuid;
        output.B(serialDesc, 10, swdVar, str != null ? PublishedArtifactId.m1086boximpl(str) : null);
        output.B(serialDesc, 11, bc9Var, self.published_artifact_deleted_at);
    }

    /* JADX INFO: renamed from: component1-QssJVS4, reason: not valid java name and from getter */
    public final String getUuid() {
        return this.uuid;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final ArtifactVisibility getVisibility() {
        return this.visibility;
    }

    /* JADX INFO: renamed from: component11-vF4hnP0, reason: not valid java name and from getter */
    public final String getPublished_artifact_uuid() {
        return this.published_artifact_uuid;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final Date getPublished_artifact_deleted_at() {
        return this.published_artifact_deleted_at;
    }

    /* JADX INFO: renamed from: component2-QssJVS4, reason: not valid java name and from getter */
    public final String getArtifact_uuid() {
        return this.artifact_uuid;
    }

    /* JADX INFO: renamed from: component3-PStrttk, reason: not valid java name and from getter */
    public final String getMessage_uuid() {
        return this.message_uuid;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getArtifact_type() {
        return this.artifact_type;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getCode_language() {
        return this.code_language;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getResult_state() {
        return this.result_state;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Date getCreated_at() {
        return this.created_at;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final ArtifactSource getSource() {
        return this.source;
    }

    /* JADX INFO: renamed from: copy-BaA1eQs, reason: not valid java name */
    public final ArtifactVersionRecord m122copyBaA1eQs(String uuid, String artifact_uuid, String message_uuid, String artifact_type, String code_language, String title, String result_state, Date created_at, ArtifactSource source, ArtifactVisibility visibility, String published_artifact_uuid, Date published_artifact_deleted_at) {
        y6a.s(uuid, artifact_uuid, message_uuid, artifact_type, result_state);
        created_at.getClass();
        visibility.getClass();
        return new ArtifactVersionRecord(uuid, artifact_uuid, message_uuid, artifact_type, code_language, title, result_state, created_at, source, visibility, published_artifact_uuid, published_artifact_deleted_at, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x007c  */
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
            boolean r1 = r5 instanceof com.anthropic.claude.api.artifacts.ArtifactVersionRecord
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.anthropic.claude.api.artifacts.ArtifactVersionRecord r5 = (com.anthropic.claude.api.artifacts.ArtifactVersionRecord) r5
            java.lang.String r1 = r4.uuid
            java.lang.String r3 = r5.uuid
            boolean r1 = com.anthropic.claude.types.strings.ArtifactId.m960equalsimpl0(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.lang.String r1 = r4.artifact_uuid
            java.lang.String r3 = r5.artifact_uuid
            boolean r1 = com.anthropic.claude.types.strings.ArtifactId.m960equalsimpl0(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            java.lang.String r1 = r4.message_uuid
            java.lang.String r3 = r5.message_uuid
            boolean r1 = com.anthropic.claude.types.strings.MessageId.m1054equalsimpl0(r1, r3)
            if (r1 != 0) goto L2d
            return r2
        L2d:
            java.lang.String r1 = r4.artifact_type
            java.lang.String r3 = r5.artifact_type
            boolean r1 = defpackage.x44.r(r1, r3)
            if (r1 != 0) goto L38
            return r2
        L38:
            java.lang.String r1 = r4.code_language
            java.lang.String r3 = r5.code_language
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
            java.lang.String r1 = r4.result_state
            java.lang.String r3 = r5.result_state
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
            com.anthropic.claude.api.artifacts.ArtifactSource r1 = r4.source
            com.anthropic.claude.api.artifacts.ArtifactSource r3 = r5.source
            if (r1 == r3) goto L6b
            return r2
        L6b:
            com.anthropic.claude.api.artifacts.ArtifactVisibility r1 = r4.visibility
            com.anthropic.claude.api.artifacts.ArtifactVisibility r3 = r5.visibility
            if (r1 == r3) goto L72
            return r2
        L72:
            java.lang.String r1 = r4.published_artifact_uuid
            java.lang.String r3 = r5.published_artifact_uuid
            if (r1 != 0) goto L7e
            if (r3 != 0) goto L7c
            r1 = r0
            goto L85
        L7c:
            r1 = r2
            goto L85
        L7e:
            if (r3 != 0) goto L81
            goto L7c
        L81:
            boolean r1 = com.anthropic.claude.types.strings.PublishedArtifactId.m1089equalsimpl0(r1, r3)
        L85:
            if (r1 != 0) goto L88
            return r2
        L88:
            java.util.Date r4 = r4.published_artifact_deleted_at
            java.util.Date r5 = r5.published_artifact_deleted_at
            boolean r4 = defpackage.x44.r(r4, r5)
            if (r4 != 0) goto L93
            return r2
        L93:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anthropic.claude.api.artifacts.ArtifactVersionRecord.equals(java.lang.Object):boolean");
    }

    public final String getArtifact_type() {
        return this.artifact_type;
    }

    /* JADX INFO: renamed from: getArtifact_uuid-QssJVS4, reason: not valid java name */
    public final String m123getArtifact_uuidQssJVS4() {
        return this.artifact_uuid;
    }

    public final String getCode_language() {
        return this.code_language;
    }

    public final Date getCreated_at() {
        return this.created_at;
    }

    /* JADX INFO: renamed from: getMessage_uuid-PStrttk, reason: not valid java name */
    public final String m124getMessage_uuidPStrttk() {
        return this.message_uuid;
    }

    public final Date getPublished_artifact_deleted_at() {
        return this.published_artifact_deleted_at;
    }

    /* JADX INFO: renamed from: getPublished_artifact_uuid-vF4hnP0, reason: not valid java name */
    public final String m125getPublished_artifact_uuidvF4hnP0() {
        return this.published_artifact_uuid;
    }

    public final String getResult_state() {
        return this.result_state;
    }

    public final ArtifactSource getSource() {
        return this.source;
    }

    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: getUuid-QssJVS4, reason: not valid java name */
    public final String m126getUuidQssJVS4() {
        return this.uuid;
    }

    public final ArtifactVisibility getVisibility() {
        return this.visibility;
    }

    public int hashCode() {
        int iL = kgh.l((MessageId.m1055hashCodeimpl(this.message_uuid) + ((ArtifactId.m961hashCodeimpl(this.artifact_uuid) + (ArtifactId.m961hashCodeimpl(this.uuid) * 31)) * 31)) * 31, 31, this.artifact_type);
        String str = this.code_language;
        int iHashCode = (iL + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.title;
        int iJ = ebh.j(this.created_at, kgh.l((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.result_state), 31);
        ArtifactSource artifactSource = this.source;
        int iHashCode2 = (this.visibility.hashCode() + ((iJ + (artifactSource == null ? 0 : artifactSource.hashCode())) * 31)) * 31;
        String str3 = this.published_artifact_uuid;
        int iM1090hashCodeimpl = (iHashCode2 + (str3 == null ? 0 : PublishedArtifactId.m1090hashCodeimpl(str3))) * 31;
        Date date = this.published_artifact_deleted_at;
        return iM1090hashCodeimpl + (date != null ? date.hashCode() : 0);
    }

    public String toString() {
        String strM962toStringimpl = ArtifactId.m962toStringimpl(this.uuid);
        String strM962toStringimpl2 = ArtifactId.m962toStringimpl(this.artifact_uuid);
        String strM1056toStringimpl = MessageId.m1056toStringimpl(this.message_uuid);
        String str = this.artifact_type;
        String str2 = this.code_language;
        String str3 = this.title;
        String str4 = this.result_state;
        Date date = this.created_at;
        ArtifactSource artifactSource = this.source;
        ArtifactVisibility artifactVisibility = this.visibility;
        String str5 = this.published_artifact_uuid;
        String strM1091toStringimpl = str5 == null ? "null" : PublishedArtifactId.m1091toStringimpl(str5);
        Date date2 = this.published_artifact_deleted_at;
        StringBuilder sbR = kgh.r("ArtifactVersionRecord(uuid=", strM962toStringimpl, ", artifact_uuid=", strM962toStringimpl2, ", message_uuid=");
        kgh.u(sbR, strM1056toStringimpl, ", artifact_type=", str, ", code_language=");
        kgh.u(sbR, str2, ", title=", str3, ", result_state=");
        sbR.append(str4);
        sbR.append(", created_at=");
        sbR.append(date);
        sbR.append(", source=");
        sbR.append(artifactSource);
        sbR.append(", visibility=");
        sbR.append(artifactVisibility);
        sbR.append(", published_artifact_uuid=");
        sbR.append(strM1091toStringimpl);
        sbR.append(", published_artifact_deleted_at=");
        sbR.append(date2);
        sbR.append(")");
        return sbR.toString();
    }

    private ArtifactVersionRecord(String str, String str2, String str3, String str4, String str5, String str6, String str7, Date date, ArtifactSource artifactSource, ArtifactVisibility artifactVisibility, String str8, Date date2) {
        y6a.s(str, str2, str3, str4, str7);
        date.getClass();
        artifactVisibility.getClass();
        this.uuid = str;
        this.artifact_uuid = str2;
        this.message_uuid = str3;
        this.artifact_type = str4;
        this.code_language = str5;
        this.title = str6;
        this.result_state = str7;
        this.created_at = date;
        this.source = artifactSource;
        this.visibility = artifactVisibility;
        this.published_artifact_uuid = str8;
        this.published_artifact_deleted_at = date2;
    }

    public /* synthetic */ ArtifactVersionRecord(String str, String str2, String str3, String str4, String str5, String str6, String str7, Date date, ArtifactSource artifactSource, ArtifactVisibility artifactVisibility, String str8, Date date2, mq5 mq5Var) {
        this(str, str2, str3, str4, str5, str6, str7, date, artifactSource, artifactVisibility, str8, date2);
    }

    public /* synthetic */ ArtifactVersionRecord(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, Date date, ArtifactSource artifactSource, ArtifactVisibility artifactVisibility, String str8, Date date2, vnf vnfVar, mq5 mq5Var) {
        this(i, str, str2, str3, str4, str5, str6, str7, date, artifactSource, artifactVisibility, str8, date2, vnfVar);
    }
}
