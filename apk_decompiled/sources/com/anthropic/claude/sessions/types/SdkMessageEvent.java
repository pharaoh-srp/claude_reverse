package com.anthropic.claude.sessions.types;

import com.pvporbit.freetype.FreeTypeConstants;
import defpackage.afe;
import defpackage.eh9;
import defpackage.fvh;
import defpackage.gvj;
import defpackage.kw9;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.nbf;
import defpackage.obf;
import defpackage.onf;
import defpackage.orf;
import defpackage.pbf;
import defpackage.scf;
import defpackage.srg;
import defpackage.uo0;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.yb5;
import defpackage.znf;
import defpackage.zt1;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonElement;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001d\b\u0001\u0018\u0000 <2\u00020\u0001:\u0002=>B£\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0010¢\u0006\u0004\b\u0016\u0010\u0017B©\u0001\b\u0010\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0010\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u0016\u0010\u001cJ'\u0010%\u001a\u00020\"2\u0006\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 H\u0001¢\u0006\u0004\b#\u0010$R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010&\u001a\u0004\b)\u0010(R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b*\u0010(R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010&\u001a\u0004\b+\u0010(R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010,\u001a\u0004\b-\u0010.R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010/\u001a\u0004\b0\u00101R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u00102\u001a\u0004\b\f\u00103R\u0019\u0010\r\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\r\u00102\u001a\u0004\b\r\u00103R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\u000e\u00102\u001a\u0004\b\u000e\u00103R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010&\u001a\u0004\b4\u0010(R\u001f\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0012\u00105\u001a\u0004\b6\u00107R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010&\u001a\u0004\b8\u0010(R(\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0015\u00105\u0012\u0004\b:\u0010;\u001a\u0004\b9\u00107¨\u0006?"}, d2 = {"Lcom/anthropic/claude/sessions/types/SdkMessageEvent;", "Lcom/anthropic/claude/sessions/types/SdkEvent;", "", "type", "uuid", "session_id", "parent_tool_use_id", "Lcom/anthropic/claude/sessions/types/SdkMessage;", "message", "Lkotlinx/serialization/json/JsonElement;", "tool_use_result", "", "isMeta", "isSynthetic", "isReplay", "error", "", "Lcom/anthropic/claude/sessions/types/SessionFileAttachment;", "file_attachments", "created_at", "Lcom/anthropic/claude/sessions/types/SdkToolUseMeta;", "tool_use_meta", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/sessions/types/SdkMessage;Lkotlinx/serialization/json/JsonElement;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/sessions/types/SdkMessage;Lkotlinx/serialization/json/JsonElement;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$sessions", "(Lcom/anthropic/claude/sessions/types/SdkMessageEvent;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/String;", "getType", "()Ljava/lang/String;", "getUuid", "getSession_id", "getParent_tool_use_id", "Lcom/anthropic/claude/sessions/types/SdkMessage;", "getMessage", "()Lcom/anthropic/claude/sessions/types/SdkMessage;", "Lkotlinx/serialization/json/JsonElement;", "getTool_use_result", "()Lkotlinx/serialization/json/JsonElement;", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "getError", "Ljava/util/List;", "getFile_attachments", "()Ljava/util/List;", "getCreated_at", "getTool_use_meta", "getTool_use_meta$annotations", "()V", "Companion", "nbf", "obf", "sessions"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final class SdkMessageEvent implements SdkEvent {
    private static final kw9[] $childSerializers;
    public static final obf Companion = new obf();
    private final String created_at;
    private final String error;
    private final List<SessionFileAttachment> file_attachments;
    private final Boolean isMeta;
    private final Boolean isReplay;
    private final Boolean isSynthetic;
    private final SdkMessage message;
    private final String parent_tool_use_id;
    private final String session_id;
    private final List<SdkToolUseMeta> tool_use_meta;
    private final JsonElement tool_use_result;
    private final String type;
    private final String uuid;

    static {
        afe afeVar = new afe(25);
        w1a w1aVar = w1a.F;
        $childSerializers = new kw9[]{null, null, null, null, null, null, null, null, null, null, yb5.w(w1aVar, afeVar), null, yb5.w(w1aVar, new afe(26))};
    }

    public /* synthetic */ SdkMessageEvent(int i, String str, String str2, String str3, String str4, SdkMessage sdkMessage, JsonElement jsonElement, Boolean bool, Boolean bool2, Boolean bool3, String str5, List list, String str6, List list2, vnf vnfVar) {
        if (19 != (i & 19)) {
            gvj.f(i, 19, nbf.a.getDescriptor());
            throw null;
        }
        this.type = str;
        this.uuid = str2;
        if ((i & 4) == 0) {
            this.session_id = null;
        } else {
            this.session_id = str3;
        }
        if ((i & 8) == 0) {
            this.parent_tool_use_id = null;
        } else {
            this.parent_tool_use_id = str4;
        }
        this.message = sdkMessage;
        if ((i & 32) == 0) {
            this.tool_use_result = null;
        } else {
            this.tool_use_result = jsonElement;
        }
        if ((i & 64) == 0) {
            this.isMeta = null;
        } else {
            this.isMeta = bool;
        }
        if ((i & FreeTypeConstants.FT_LOAD_PEDANTIC) == 0) {
            this.isSynthetic = null;
        } else {
            this.isSynthetic = bool2;
        }
        if ((i & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) == 0) {
            this.isReplay = null;
        } else {
            this.isReplay = bool3;
        }
        if ((i & 512) == 0) {
            this.error = null;
        } else {
            this.error = str5;
        }
        if ((i & FreeTypeConstants.FT_LOAD_NO_RECURSE) == 0) {
            this.file_attachments = null;
        } else {
            this.file_attachments = list;
        }
        if ((i & FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM) == 0) {
            this.created_at = null;
        } else {
            this.created_at = str6;
        }
        if ((i & FreeTypeConstants.FT_LOAD_MONOCHROME) == 0) {
            this.tool_use_meta = null;
        } else {
            this.tool_use_meta = list2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new uo0(orf.a, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return new fvh(scf.a);
    }

    @onf(with = fvh.class)
    public static /* synthetic */ void getTool_use_meta$annotations() {
    }

    public static final /* synthetic */ void write$Self$sessions(SdkMessageEvent self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        output.q(serialDesc, 0, self.getType());
        output.q(serialDesc, 1, self.uuid);
        if (output.E(serialDesc) || self.session_id != null) {
            output.B(serialDesc, 2, srg.a, self.session_id);
        }
        if (output.E(serialDesc) || self.getParent_tool_use_id() != null) {
            output.B(serialDesc, 3, srg.a, self.getParent_tool_use_id());
        }
        output.r(serialDesc, 4, pbf.c, self.message);
        if (output.E(serialDesc) || self.tool_use_result != null) {
            output.B(serialDesc, 5, eh9.a, self.tool_use_result);
        }
        if (output.E(serialDesc) || self.isMeta != null) {
            output.B(serialDesc, 6, zt1.a, self.isMeta);
        }
        if (output.E(serialDesc) || self.isSynthetic != null) {
            output.B(serialDesc, 7, zt1.a, self.isSynthetic);
        }
        if (output.E(serialDesc) || self.isReplay != null) {
            output.B(serialDesc, 8, zt1.a, self.isReplay);
        }
        if (output.E(serialDesc) || self.error != null) {
            output.B(serialDesc, 9, srg.a, self.error);
        }
        if (output.E(serialDesc) || self.file_attachments != null) {
            output.B(serialDesc, 10, (znf) kw9VarArr[10].getValue(), self.file_attachments);
        }
        if (output.E(serialDesc) || self.created_at != null) {
            output.B(serialDesc, 11, srg.a, self.created_at);
        }
        if (!output.E(serialDesc) && self.tool_use_meta == null) {
            return;
        }
        output.B(serialDesc, 12, (znf) kw9VarArr[12].getValue(), self.tool_use_meta);
    }

    public final String getCreated_at() {
        return this.created_at;
    }

    public final String getError() {
        return this.error;
    }

    public final List<SessionFileAttachment> getFile_attachments() {
        return this.file_attachments;
    }

    public final SdkMessage getMessage() {
        return this.message;
    }

    @Override // com.anthropic.claude.sessions.types.SdkEvent
    public String getParent_tool_use_id() {
        return this.parent_tool_use_id;
    }

    public final String getSession_id() {
        return this.session_id;
    }

    public final List<SdkToolUseMeta> getTool_use_meta() {
        return this.tool_use_meta;
    }

    public final JsonElement getTool_use_result() {
        return this.tool_use_result;
    }

    @Override // com.anthropic.claude.sessions.types.SdkEvent
    public String getType() {
        return this.type;
    }

    public final String getUuid() {
        return this.uuid;
    }

    /* JADX INFO: renamed from: isMeta, reason: from getter */
    public final Boolean getIsMeta() {
        return this.isMeta;
    }

    /* JADX INFO: renamed from: isReplay, reason: from getter */
    public final Boolean getIsReplay() {
        return this.isReplay;
    }

    /* JADX INFO: renamed from: isSynthetic, reason: from getter */
    public final Boolean getIsSynthetic() {
        return this.isSynthetic;
    }

    public SdkMessageEvent(String str, String str2, String str3, String str4, SdkMessage sdkMessage, JsonElement jsonElement, Boolean bool, Boolean bool2, Boolean bool3, String str5, List<SessionFileAttachment> list, String str6, List<SdkToolUseMeta> list2) {
        str.getClass();
        str2.getClass();
        sdkMessage.getClass();
        this.type = str;
        this.uuid = str2;
        this.session_id = str3;
        this.parent_tool_use_id = str4;
        this.message = sdkMessage;
        this.tool_use_result = jsonElement;
        this.isMeta = bool;
        this.isSynthetic = bool2;
        this.isReplay = bool3;
        this.error = str5;
        this.file_attachments = list;
        this.created_at = str6;
        this.tool_use_meta = list2;
    }

    public /* synthetic */ SdkMessageEvent(String str, String str2, String str3, String str4, SdkMessage sdkMessage, JsonElement jsonElement, Boolean bool, Boolean bool2, Boolean bool3, String str5, List list, String str6, List list2, int i, mq5 mq5Var) {
        this(str, str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, sdkMessage, (i & 32) != 0 ? null : jsonElement, (i & 64) != 0 ? null : bool, (i & FreeTypeConstants.FT_LOAD_PEDANTIC) != 0 ? null : bool2, (i & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) != 0 ? null : bool3, (i & 512) != 0 ? null : str5, (i & FreeTypeConstants.FT_LOAD_NO_RECURSE) != 0 ? null : list, (i & FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM) != 0 ? null : str6, (i & FreeTypeConstants.FT_LOAD_MONOCHROME) != 0 ? null : list2);
    }
}
