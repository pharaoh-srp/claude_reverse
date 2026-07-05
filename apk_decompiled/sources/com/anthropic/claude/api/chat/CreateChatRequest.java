package com.anthropic.claude.api.chat;

import com.anthropic.claude.types.strings.ChatId;
import com.anthropic.claude.types.strings.ModelId;
import com.anthropic.claude.types.strings.ProjectId;
import com.anthropic.claude.types.strings.ResearchMode;
import com.anthropic.claude.types.strings.ThinkingMode;
import com.pvporbit.freetype.FreeTypeConstants;
import defpackage.emd;
import defpackage.emh;
import defpackage.fsh;
import defpackage.gid;
import defpackage.gvj;
import defpackage.kgh;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.rle;
import defpackage.srg;
import defpackage.vd4;
import defpackage.vnb;
import defpackage.vnf;
import defpackage.vs2;
import defpackage.x55;
import defpackage.y55;
import defpackage.zt1;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0087\b\u0018\u0000 J2\u00020\u0001:\u0002KLBu\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0013\u0010\u0014B}\b\u0010\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0013\u0010\u0019J\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001bJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001bJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001bJ\u0012\u0010\"\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b!\u0010\u001bJ\u0012\u0010$\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b#\u0010\u001bJ\u0012\u0010&\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b%\u0010\u001bJ\u0010\u0010'\u001a\u00020\u000fHÆ\u0003¢\u0006\u0004\b'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b)\u0010*J\u0012\u0010+\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b+\u0010*J\u0082\u0001\u0010.\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000fHÆ\u0001¢\u0006\u0004\b,\u0010-J\u0010\u0010/\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b/\u0010\u001bJ\u0010\u00100\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b0\u00101J\u001a\u00103\u001a\u00020\u000f2\b\u00102\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b3\u00104J'\u0010=\u001a\u00020:2\u0006\u00105\u001a\u00020\u00002\u0006\u00107\u001a\u0002062\u0006\u00109\u001a\u000208H\u0001¢\u0006\u0004\b;\u0010<R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010>\u001a\u0004\b?\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010>\u001a\u0004\b@\u0010\u001bR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010>\u001a\u0004\bA\u0010\u001bR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010>\u001a\u0004\bB\u0010\u001bR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010>\u001a\u0004\bC\u0010\u001bR\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010>\u001a\u0004\bD\u0010\u001bR\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010>\u001a\u0004\bE\u0010\u001bR\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010F\u001a\u0004\b\u0010\u0010(R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0011\u0010G\u001a\u0004\bH\u0010*R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0012\u0010G\u001a\u0004\bI\u0010*¨\u0006M"}, d2 = {"Lcom/anthropic/claude/api/chat/CreateChatRequest;", "", "Lcom/anthropic/claude/types/strings/ChatId;", "uuid", "", "name", "summary", "Lcom/anthropic/claude/types/strings/ModelId;", "model", "Lcom/anthropic/claude/types/strings/ProjectId;", "project_uuid", "Lcom/anthropic/claude/types/strings/ThinkingMode;", "paprika_mode", "Lcom/anthropic/claude/types/strings/ResearchMode;", "compass_mode", "", "is_temporary", "include_conversation_preferences", "enabled_imagine", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Boolean;Ljava/lang/Boolean;Lmq5;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Boolean;Ljava/lang/Boolean;Lvnf;Lmq5;)V", "component1-RjYBDck", "()Ljava/lang/String;", "component1", "component2", "component3", "component4-a6HIKFk", "component4", "component5-v-f-JkQ", "component5", "component6-KLP3kNA", "component6", "component7-vlYN4T0", "component7", "component8", "()Z", "component9", "()Ljava/lang/Boolean;", "component10", "copy-QjC-mxc", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Boolean;Ljava/lang/Boolean;)Lcom/anthropic/claude/api/chat/CreateChatRequest;", "copy", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/chat/CreateChatRequest;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/String;", "getUuid-RjYBDck", "getName", "getSummary", "getModel-a6HIKFk", "getProject_uuid-v-f-JkQ", "getPaprika_mode-KLP3kNA", "getCompass_mode-vlYN4T0", "Z", "Ljava/lang/Boolean;", "getInclude_conversation_preferences", "getEnabled_imagine", "Companion", "x55", "y55", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class CreateChatRequest {
    public static final int $stable = 0;
    public static final y55 Companion = new y55();
    private final String compass_mode;
    private final Boolean enabled_imagine;
    private final Boolean include_conversation_preferences;
    private final boolean is_temporary;
    private final String model;
    private final String name;
    private final String paprika_mode;
    private final String project_uuid;
    private final String summary;
    private final String uuid;

    private /* synthetic */ CreateChatRequest(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, Boolean bool, Boolean bool2, vnf vnfVar) {
        if (3 != (i & 3)) {
            gvj.f(i, 3, x55.a.getDescriptor());
            throw null;
        }
        this.uuid = str;
        this.name = str2;
        if ((i & 4) == 0) {
            this.summary = null;
        } else {
            this.summary = str3;
        }
        if ((i & 8) == 0) {
            this.model = null;
        } else {
            this.model = str4;
        }
        if ((i & 16) == 0) {
            this.project_uuid = null;
        } else {
            this.project_uuid = str5;
        }
        if ((i & 32) == 0) {
            this.paprika_mode = null;
        } else {
            this.paprika_mode = str6;
        }
        if ((i & 64) == 0) {
            this.compass_mode = null;
        } else {
            this.compass_mode = str7;
        }
        if ((i & FreeTypeConstants.FT_LOAD_PEDANTIC) == 0) {
            this.is_temporary = false;
        } else {
            this.is_temporary = z;
        }
        if ((i & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) == 0) {
            this.include_conversation_preferences = null;
        } else {
            this.include_conversation_preferences = bool;
        }
        if ((i & 512) == 0) {
            this.enabled_imagine = null;
        } else {
            this.enabled_imagine = bool2;
        }
    }

    /* JADX INFO: renamed from: copy-QjC-mxc$default, reason: not valid java name */
    public static /* synthetic */ CreateChatRequest m217copyQjCmxc$default(CreateChatRequest createChatRequest, String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, Boolean bool, Boolean bool2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = createChatRequest.uuid;
        }
        if ((i & 2) != 0) {
            str2 = createChatRequest.name;
        }
        if ((i & 4) != 0) {
            str3 = createChatRequest.summary;
        }
        if ((i & 8) != 0) {
            str4 = createChatRequest.model;
        }
        if ((i & 16) != 0) {
            str5 = createChatRequest.project_uuid;
        }
        if ((i & 32) != 0) {
            str6 = createChatRequest.paprika_mode;
        }
        if ((i & 64) != 0) {
            str7 = createChatRequest.compass_mode;
        }
        if ((i & FreeTypeConstants.FT_LOAD_PEDANTIC) != 0) {
            z = createChatRequest.is_temporary;
        }
        if ((i & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) != 0) {
            bool = createChatRequest.include_conversation_preferences;
        }
        if ((i & 512) != 0) {
            bool2 = createChatRequest.enabled_imagine;
        }
        Boolean bool3 = bool;
        Boolean bool4 = bool2;
        String str8 = str7;
        boolean z2 = z;
        String str9 = str5;
        String str10 = str6;
        return createChatRequest.m223copyQjCmxc(str, str2, str3, str4, str9, str10, str8, z2, bool3, bool4);
    }

    public static final /* synthetic */ void write$Self$api(CreateChatRequest self, vd4 output, SerialDescriptor serialDesc) {
        output.r(serialDesc, 0, vs2.a, ChatId.m978boximpl(self.uuid));
        output.q(serialDesc, 1, self.name);
        if (output.E(serialDesc) || self.summary != null) {
            output.B(serialDesc, 2, srg.a, self.summary);
        }
        if (output.E(serialDesc) || self.model != null) {
            vnb vnbVar = vnb.a;
            String str = self.model;
            output.B(serialDesc, 3, vnbVar, str != null ? ModelId.m1058boximpl(str) : null);
        }
        if (output.E(serialDesc) || self.project_uuid != null) {
            emd emdVar = emd.a;
            String str2 = self.project_uuid;
            output.B(serialDesc, 4, emdVar, str2 != null ? ProjectId.m1079boximpl(str2) : null);
        }
        if (output.E(serialDesc) || self.paprika_mode != null) {
            emh emhVar = emh.a;
            String str3 = self.paprika_mode;
            output.B(serialDesc, 5, emhVar, str3 != null ? ThinkingMode.m1142boximpl(str3) : null);
        }
        if (output.E(serialDesc) || self.compass_mode != null) {
            rle rleVar = rle.a;
            String str4 = self.compass_mode;
            output.B(serialDesc, 6, rleVar, str4 != null ? ResearchMode.m1093boximpl(str4) : null);
        }
        if (output.E(serialDesc) || self.is_temporary) {
            output.p(serialDesc, 7, self.is_temporary);
        }
        if (output.E(serialDesc) || self.include_conversation_preferences != null) {
            output.B(serialDesc, 8, zt1.a, self.include_conversation_preferences);
        }
        if (!output.E(serialDesc) && self.enabled_imagine == null) {
            return;
        }
        output.B(serialDesc, 9, zt1.a, self.enabled_imagine);
    }

    /* JADX INFO: renamed from: component1-RjYBDck, reason: not valid java name and from getter */
    public final String getUuid() {
        return this.uuid;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Boolean getEnabled_imagine() {
        return this.enabled_imagine;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSummary() {
        return this.summary;
    }

    /* JADX INFO: renamed from: component4-a6HIKFk, reason: not valid java name and from getter */
    public final String getModel() {
        return this.model;
    }

    /* JADX INFO: renamed from: component5-v-f-JkQ, reason: not valid java name and from getter */
    public final String getProject_uuid() {
        return this.project_uuid;
    }

    /* JADX INFO: renamed from: component6-KLP3kNA, reason: not valid java name and from getter */
    public final String getPaprika_mode() {
        return this.paprika_mode;
    }

    /* JADX INFO: renamed from: component7-vlYN4T0, reason: not valid java name and from getter */
    public final String getCompass_mode() {
        return this.compass_mode;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final boolean getIs_temporary() {
        return this.is_temporary;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Boolean getInclude_conversation_preferences() {
        return this.include_conversation_preferences;
    }

    /* JADX INFO: renamed from: copy-QjC-mxc, reason: not valid java name */
    public final CreateChatRequest m223copyQjCmxc(String uuid, String name, String summary, String model, String project_uuid, String paprika_mode, String compass_mode, boolean is_temporary, Boolean include_conversation_preferences, Boolean enabled_imagine) {
        uuid.getClass();
        name.getClass();
        return new CreateChatRequest(uuid, name, summary, model, project_uuid, paprika_mode, compass_mode, is_temporary, include_conversation_preferences, enabled_imagine, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0079  */
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
            boolean r1 = r5 instanceof com.anthropic.claude.api.chat.CreateChatRequest
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.anthropic.claude.api.chat.CreateChatRequest r5 = (com.anthropic.claude.api.chat.CreateChatRequest) r5
            java.lang.String r1 = r4.uuid
            java.lang.String r3 = r5.uuid
            boolean r1 = com.anthropic.claude.types.strings.ChatId.m981equalsimpl0(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.lang.String r1 = r4.name
            java.lang.String r3 = r5.name
            boolean r1 = defpackage.x44.r(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            java.lang.String r1 = r4.summary
            java.lang.String r3 = r5.summary
            boolean r1 = defpackage.x44.r(r1, r3)
            if (r1 != 0) goto L2d
            return r2
        L2d:
            java.lang.String r1 = r4.model
            java.lang.String r3 = r5.model
            if (r1 != 0) goto L39
            if (r3 != 0) goto L37
            r1 = r0
            goto L40
        L37:
            r1 = r2
            goto L40
        L39:
            if (r3 != 0) goto L3c
            goto L37
        L3c:
            boolean r1 = com.anthropic.claude.types.strings.ModelId.m1061equalsimpl0(r1, r3)
        L40:
            if (r1 != 0) goto L43
            return r2
        L43:
            java.lang.String r1 = r4.project_uuid
            java.lang.String r3 = r5.project_uuid
            if (r1 != 0) goto L4f
            if (r3 != 0) goto L4d
            r1 = r0
            goto L56
        L4d:
            r1 = r2
            goto L56
        L4f:
            if (r3 != 0) goto L52
            goto L4d
        L52:
            boolean r1 = com.anthropic.claude.types.strings.ProjectId.m1082equalsimpl0(r1, r3)
        L56:
            if (r1 != 0) goto L59
            return r2
        L59:
            java.lang.String r1 = r4.paprika_mode
            java.lang.String r3 = r5.paprika_mode
            if (r1 != 0) goto L65
            if (r3 != 0) goto L63
            r1 = r0
            goto L6c
        L63:
            r1 = r2
            goto L6c
        L65:
            if (r3 != 0) goto L68
            goto L63
        L68:
            boolean r1 = com.anthropic.claude.types.strings.ThinkingMode.m1145equalsimpl0(r1, r3)
        L6c:
            if (r1 != 0) goto L6f
            return r2
        L6f:
            java.lang.String r1 = r4.compass_mode
            java.lang.String r3 = r5.compass_mode
            if (r1 != 0) goto L7b
            if (r3 != 0) goto L79
            r1 = r0
            goto L82
        L79:
            r1 = r2
            goto L82
        L7b:
            if (r3 != 0) goto L7e
            goto L79
        L7e:
            boolean r1 = com.anthropic.claude.types.strings.ResearchMode.m1096equalsimpl0(r1, r3)
        L82:
            if (r1 != 0) goto L85
            return r2
        L85:
            boolean r1 = r4.is_temporary
            boolean r3 = r5.is_temporary
            if (r1 == r3) goto L8c
            return r2
        L8c:
            java.lang.Boolean r1 = r4.include_conversation_preferences
            java.lang.Boolean r3 = r5.include_conversation_preferences
            boolean r1 = defpackage.x44.r(r1, r3)
            if (r1 != 0) goto L97
            return r2
        L97:
            java.lang.Boolean r4 = r4.enabled_imagine
            java.lang.Boolean r5 = r5.enabled_imagine
            boolean r4 = defpackage.x44.r(r4, r5)
            if (r4 != 0) goto La2
            return r2
        La2:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anthropic.claude.api.chat.CreateChatRequest.equals(java.lang.Object):boolean");
    }

    /* JADX INFO: renamed from: getCompass_mode-vlYN4T0, reason: not valid java name */
    public final String m224getCompass_modevlYN4T0() {
        return this.compass_mode;
    }

    public final Boolean getEnabled_imagine() {
        return this.enabled_imagine;
    }

    public final Boolean getInclude_conversation_preferences() {
        return this.include_conversation_preferences;
    }

    /* JADX INFO: renamed from: getModel-a6HIKFk, reason: not valid java name */
    public final String m225getModela6HIKFk() {
        return this.model;
    }

    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: getPaprika_mode-KLP3kNA, reason: not valid java name */
    public final String m226getPaprika_modeKLP3kNA() {
        return this.paprika_mode;
    }

    /* JADX INFO: renamed from: getProject_uuid-v-f-JkQ, reason: not valid java name */
    public final String m227getProject_uuidvfJkQ() {
        return this.project_uuid;
    }

    public final String getSummary() {
        return this.summary;
    }

    /* JADX INFO: renamed from: getUuid-RjYBDck, reason: not valid java name */
    public final String m228getUuidRjYBDck() {
        return this.uuid;
    }

    public int hashCode() {
        int iL = kgh.l(ChatId.m982hashCodeimpl(this.uuid) * 31, 31, this.name);
        String str = this.summary;
        int iHashCode = (iL + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.model;
        int iM1062hashCodeimpl = (iHashCode + (str2 == null ? 0 : ModelId.m1062hashCodeimpl(str2))) * 31;
        String str3 = this.project_uuid;
        int iM1083hashCodeimpl = (iM1062hashCodeimpl + (str3 == null ? 0 : ProjectId.m1083hashCodeimpl(str3))) * 31;
        String str4 = this.paprika_mode;
        int iM1146hashCodeimpl = (iM1083hashCodeimpl + (str4 == null ? 0 : ThinkingMode.m1146hashCodeimpl(str4))) * 31;
        String str5 = this.compass_mode;
        int iP = fsh.p((iM1146hashCodeimpl + (str5 == null ? 0 : ResearchMode.m1097hashCodeimpl(str5))) * 31, 31, this.is_temporary);
        Boolean bool = this.include_conversation_preferences;
        int iHashCode2 = (iP + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.enabled_imagine;
        return iHashCode2 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final boolean is_temporary() {
        return this.is_temporary;
    }

    public String toString() {
        String strM983toStringimpl = ChatId.m983toStringimpl(this.uuid);
        String str = this.name;
        String str2 = this.summary;
        String str3 = this.model;
        String strM1063toStringimpl = str3 == null ? "null" : ModelId.m1063toStringimpl(str3);
        String str4 = this.project_uuid;
        String strM1084toStringimpl = str4 == null ? "null" : ProjectId.m1084toStringimpl(str4);
        String str5 = this.paprika_mode;
        String strM1148toStringimpl = str5 == null ? "null" : ThinkingMode.m1148toStringimpl(str5);
        String str6 = this.compass_mode;
        String strM1098toStringimpl = str6 != null ? ResearchMode.m1098toStringimpl(str6) : "null";
        boolean z = this.is_temporary;
        Boolean bool = this.include_conversation_preferences;
        Boolean bool2 = this.enabled_imagine;
        StringBuilder sbR = kgh.r("CreateChatRequest(uuid=", strM983toStringimpl, ", name=", str, ", summary=");
        kgh.u(sbR, str2, ", model=", strM1063toStringimpl, ", project_uuid=");
        kgh.u(sbR, strM1084toStringimpl, ", paprika_mode=", strM1148toStringimpl, ", compass_mode=");
        gid.t(sbR, strM1098toStringimpl, ", is_temporary=", z, ", include_conversation_preferences=");
        sbR.append(bool);
        sbR.append(", enabled_imagine=");
        sbR.append(bool2);
        sbR.append(")");
        return sbR.toString();
    }

    public /* synthetic */ CreateChatRequest(String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, Boolean bool, Boolean bool2, mq5 mq5Var) {
        this(str, str2, str3, str4, str5, str6, str7, z, bool, bool2);
    }

    public /* synthetic */ CreateChatRequest(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, Boolean bool, Boolean bool2, vnf vnfVar, mq5 mq5Var) {
        this(i, str, str2, str3, str4, str5, str6, str7, z, bool, bool2, vnfVar);
    }

    private CreateChatRequest(String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, Boolean bool, Boolean bool2) {
        str.getClass();
        str2.getClass();
        this.uuid = str;
        this.name = str2;
        this.summary = str3;
        this.model = str4;
        this.project_uuid = str5;
        this.paprika_mode = str6;
        this.compass_mode = str7;
        this.is_temporary = z;
        this.include_conversation_preferences = bool;
        this.enabled_imagine = bool2;
    }

    public /* synthetic */ CreateChatRequest(String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, Boolean bool, Boolean bool2, int i, mq5 mq5Var) {
        this(str, str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & FreeTypeConstants.FT_LOAD_PEDANTIC) != 0 ? false : z, (i & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) != 0 ? null : bool, (i & 512) != 0 ? null : bool2, null);
    }
}
