package com.anthropic.claude.sessions.types;

import com.pvporbit.freetype.FreeTypeConstants;
import defpackage.acf;
import defpackage.afe;
import defpackage.bcf;
import defpackage.ccf;
import defpackage.e79;
import defpackage.ecf;
import defpackage.gvj;
import defpackage.kdf;
import defpackage.kw9;
import defpackage.lm6;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.srg;
import defpackage.uo0;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.w1a;
import defpackage.x44;
import defpackage.yb5;
import defpackage.znf;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b+\b\u0001\u0018\u0000 U2\u00020\u0001:\u0002VWBµ\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\b\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b!\u0010\"B«\u0002\b\u0010\u0012\u0006\u0010#\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\b\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010 \u001a\u0004\u0018\u00010\u001f\u0012\b\u0010$\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010&\u001a\u0004\u0018\u00010%¢\u0006\u0004\b!\u0010'J'\u00100\u001a\u00020-2\u0006\u0010(\u001a\u00020\u00002\u0006\u0010*\u001a\u00020)2\u0006\u0010,\u001a\u00020+H\u0001¢\u0006\u0004\b.\u0010/R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u00101\u001a\u0004\b2\u00103R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00101\u001a\u0004\b4\u00103R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u00101\u001a\u0004\b5\u00103R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u00101\u001a\u0004\b6\u00103R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u00101\u001a\u0004\b7\u00103R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u00108\u001a\u0004\b9\u0010:R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010;\u001a\u0004\b<\u0010=R\u0019\u0010\f\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\f\u0010;\u001a\u0004\b>\u0010=R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\r\u00101\u001a\u0004\b?\u00103R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u00101\u001a\u0004\b@\u00103R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u00101\u001a\u0004\bA\u00103R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u00101\u001a\u0004\bB\u00103R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u00101\u001a\u0004\bC\u00103R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u00101\u001a\u0004\bD\u00103R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u00101\u001a\u0004\bE\u00103R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u00101\u001a\u0004\bF\u00103R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u00101\u001a\u0004\bG\u00103R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u00101\u001a\u0004\bH\u00103R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u00101\u001a\u0004\bI\u00103R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010J\u001a\u0004\bK\u0010LR\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u00101\u001a\u0004\bM\u00103R\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u00101\u001a\u0004\bN\u00103R\u001f\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u001d\u00108\u001a\u0004\bO\u0010:R\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u00101\u001a\u0004\bP\u00103R\u0019\u0010 \u001a\u0004\u0018\u00010\u001f8\u0006¢\u0006\f\n\u0004\b \u0010Q\u001a\u0004\bR\u0010SR\u001c\u0010$\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u00101\u001a\u0004\bT\u00103¨\u0006X"}, d2 = {"Lcom/anthropic/claude/sessions/types/SdkSystemEvent;", "Lcom/anthropic/claude/sessions/types/SdkEvent;", "", "type", "uuid", "subtype", "status", "permissionMode", "", "slash_commands", "", "estimated_tokens", "estimated_tokens_delta", "original_model", "fallback_model", "api_refusal_category", "api_refusal_explanation", "claude_code_version", "task_id", "tool_use_id", "description", "task_type", "workflow_name", "prompt", "Lcom/anthropic/claude/sessions/types/SdkTaskUsage;", "usage", "last_tool_name", "summary", "Lcom/anthropic/claude/sessions/types/SdkWorkflowProgress;", "workflow_progress", "output_file", "Lcom/anthropic/claude/sessions/types/SdkTaskPatch;", "patch", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/sessions/types/SdkTaskUsage;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/anthropic/claude/sessions/types/SdkTaskPatch;)V", "seen0", "parent_tool_use_id", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/sessions/types/SdkTaskUsage;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/anthropic/claude/sessions/types/SdkTaskPatch;Ljava/lang/String;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$sessions", "(Lcom/anthropic/claude/sessions/types/SdkSystemEvent;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/String;", "getType", "()Ljava/lang/String;", "getUuid", "getSubtype", "getStatus", "getPermissionMode", "Ljava/util/List;", "getSlash_commands", "()Ljava/util/List;", "Ljava/lang/Integer;", "getEstimated_tokens", "()Ljava/lang/Integer;", "getEstimated_tokens_delta", "getOriginal_model", "getFallback_model", "getApi_refusal_category", "getApi_refusal_explanation", "getClaude_code_version", "getTask_id", "getTool_use_id", "getDescription", "getTask_type", "getWorkflow_name", "getPrompt", "Lcom/anthropic/claude/sessions/types/SdkTaskUsage;", "getUsage", "()Lcom/anthropic/claude/sessions/types/SdkTaskUsage;", "getLast_tool_name", "getSummary", "getWorkflow_progress", "getOutput_file", "Lcom/anthropic/claude/sessions/types/SdkTaskPatch;", "getPatch", "()Lcom/anthropic/claude/sessions/types/SdkTaskPatch;", "getParent_tool_use_id", "Companion", "acf", "bcf", "sessions"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final class SdkSystemEvent implements SdkEvent {
    private static final kw9[] $childSerializers;
    public static final bcf Companion = new bcf();
    private final String api_refusal_category;
    private final String api_refusal_explanation;
    private final String claude_code_version;
    private final String description;
    private final Integer estimated_tokens;
    private final Integer estimated_tokens_delta;
    private final String fallback_model;
    private final String last_tool_name;
    private final String original_model;
    private final String output_file;
    private final String parent_tool_use_id;
    private final SdkTaskPatch patch;
    private final String permissionMode;
    private final String prompt;
    private final List<String> slash_commands;
    private final String status;
    private final String subtype;
    private final String summary;
    private final String task_id;
    private final String task_type;
    private final String tool_use_id;
    private final String type;
    private final SdkTaskUsage usage;
    private final String uuid;
    private final String workflow_name;
    private final List<SdkWorkflowProgress> workflow_progress;

    static {
        afe afeVar = new afe(27);
        w1a w1aVar = w1a.F;
        $childSerializers = new kw9[]{null, null, null, null, null, yb5.w(w1aVar, afeVar), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, yb5.w(w1aVar, new afe(28)), null, null, null};
    }

    public /* synthetic */ SdkSystemEvent(int i, String str, String str2, String str3, String str4, String str5, List list, Integer num, Integer num2, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, SdkTaskUsage sdkTaskUsage, String str17, String str18, List list2, String str19, SdkTaskPatch sdkTaskPatch, String str20, vnf vnfVar) {
        if (3 != (i & 3)) {
            gvj.f(i, 3, acf.a.getDescriptor());
            throw null;
        }
        this.type = str;
        this.uuid = str2;
        if ((i & 4) == 0) {
            this.subtype = null;
        } else {
            this.subtype = str3;
        }
        if ((i & 8) == 0) {
            this.status = null;
        } else {
            this.status = str4;
        }
        if ((i & 16) == 0) {
            this.permissionMode = null;
        } else {
            this.permissionMode = str5;
        }
        if ((i & 32) == 0) {
            this.slash_commands = lm6.E;
        } else {
            this.slash_commands = list;
        }
        if ((i & 64) == 0) {
            this.estimated_tokens = null;
        } else {
            this.estimated_tokens = num;
        }
        if ((i & FreeTypeConstants.FT_LOAD_PEDANTIC) == 0) {
            this.estimated_tokens_delta = null;
        } else {
            this.estimated_tokens_delta = num2;
        }
        if ((i & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) == 0) {
            this.original_model = null;
        } else {
            this.original_model = str6;
        }
        if ((i & 512) == 0) {
            this.fallback_model = null;
        } else {
            this.fallback_model = str7;
        }
        if ((i & FreeTypeConstants.FT_LOAD_NO_RECURSE) == 0) {
            this.api_refusal_category = null;
        } else {
            this.api_refusal_category = str8;
        }
        if ((i & FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM) == 0) {
            this.api_refusal_explanation = null;
        } else {
            this.api_refusal_explanation = str9;
        }
        if ((i & FreeTypeConstants.FT_LOAD_MONOCHROME) == 0) {
            this.claude_code_version = null;
        } else {
            this.claude_code_version = str10;
        }
        if ((i & FreeTypeConstants.FT_LOAD_LINEAR_DESIGN) == 0) {
            this.task_id = null;
        } else {
            this.task_id = str11;
        }
        if ((i & 16384) == 0) {
            this.tool_use_id = null;
        } else {
            this.tool_use_id = str12;
        }
        if ((32768 & i) == 0) {
            this.description = null;
        } else {
            this.description = str13;
        }
        if ((65536 & i) == 0) {
            this.task_type = null;
        } else {
            this.task_type = str14;
        }
        if ((131072 & i) == 0) {
            this.workflow_name = null;
        } else {
            this.workflow_name = str15;
        }
        if ((262144 & i) == 0) {
            this.prompt = null;
        } else {
            this.prompt = str16;
        }
        if ((524288 & i) == 0) {
            this.usage = null;
        } else {
            this.usage = sdkTaskUsage;
        }
        if ((1048576 & i) == 0) {
            this.last_tool_name = null;
        } else {
            this.last_tool_name = str17;
        }
        if ((2097152 & i) == 0) {
            this.summary = null;
        } else {
            this.summary = str18;
        }
        if ((4194304 & i) == 0) {
            this.workflow_progress = null;
        } else {
            this.workflow_progress = list2;
        }
        if ((8388608 & i) == 0) {
            this.output_file = null;
        } else {
            this.output_file = str19;
        }
        if ((16777216 & i) == 0) {
            this.patch = null;
        } else {
            this.patch = sdkTaskPatch;
        }
        if ((i & 33554432) == 0) {
            this.parent_tool_use_id = null;
        } else {
            this.parent_tool_use_id = str20;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new uo0(srg.a, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        return new uo0(kdf.c, 0);
    }

    public static final /* synthetic */ void write$Self$sessions(SdkSystemEvent self, vd4 output, SerialDescriptor serialDesc) {
        kw9[] kw9VarArr = $childSerializers;
        output.q(serialDesc, 0, self.getType());
        output.q(serialDesc, 1, self.uuid);
        if (output.E(serialDesc) || self.subtype != null) {
            output.B(serialDesc, 2, srg.a, self.subtype);
        }
        if (output.E(serialDesc) || self.status != null) {
            output.B(serialDesc, 3, srg.a, self.status);
        }
        if (output.E(serialDesc) || self.permissionMode != null) {
            output.B(serialDesc, 4, srg.a, self.permissionMode);
        }
        if (output.E(serialDesc) || !x44.r(self.slash_commands, lm6.E)) {
            output.r(serialDesc, 5, (znf) kw9VarArr[5].getValue(), self.slash_commands);
        }
        if (output.E(serialDesc) || self.estimated_tokens != null) {
            output.B(serialDesc, 6, e79.a, self.estimated_tokens);
        }
        if (output.E(serialDesc) || self.estimated_tokens_delta != null) {
            output.B(serialDesc, 7, e79.a, self.estimated_tokens_delta);
        }
        if (output.E(serialDesc) || self.original_model != null) {
            output.B(serialDesc, 8, srg.a, self.original_model);
        }
        if (output.E(serialDesc) || self.fallback_model != null) {
            output.B(serialDesc, 9, srg.a, self.fallback_model);
        }
        if (output.E(serialDesc) || self.api_refusal_category != null) {
            output.B(serialDesc, 10, srg.a, self.api_refusal_category);
        }
        if (output.E(serialDesc) || self.api_refusal_explanation != null) {
            output.B(serialDesc, 11, srg.a, self.api_refusal_explanation);
        }
        if (output.E(serialDesc) || self.claude_code_version != null) {
            output.B(serialDesc, 12, srg.a, self.claude_code_version);
        }
        if (output.E(serialDesc) || self.task_id != null) {
            output.B(serialDesc, 13, srg.a, self.task_id);
        }
        if (output.E(serialDesc) || self.tool_use_id != null) {
            output.B(serialDesc, 14, srg.a, self.tool_use_id);
        }
        if (output.E(serialDesc) || self.description != null) {
            output.B(serialDesc, 15, srg.a, self.description);
        }
        if (output.E(serialDesc) || self.task_type != null) {
            output.B(serialDesc, 16, srg.a, self.task_type);
        }
        if (output.E(serialDesc) || self.workflow_name != null) {
            output.B(serialDesc, 17, srg.a, self.workflow_name);
        }
        if (output.E(serialDesc) || self.prompt != null) {
            output.B(serialDesc, 18, srg.a, self.prompt);
        }
        if (output.E(serialDesc) || self.usage != null) {
            output.B(serialDesc, 19, ecf.a, self.usage);
        }
        if (output.E(serialDesc) || self.last_tool_name != null) {
            output.B(serialDesc, 20, srg.a, self.last_tool_name);
        }
        if (output.E(serialDesc) || self.summary != null) {
            output.B(serialDesc, 21, srg.a, self.summary);
        }
        if (output.E(serialDesc) || self.workflow_progress != null) {
            output.B(serialDesc, 22, (znf) kw9VarArr[22].getValue(), self.workflow_progress);
        }
        if (output.E(serialDesc) || self.output_file != null) {
            output.B(serialDesc, 23, srg.a, self.output_file);
        }
        if (output.E(serialDesc) || self.patch != null) {
            output.B(serialDesc, 24, ccf.a, self.patch);
        }
        if (!output.E(serialDesc) && self.getParent_tool_use_id() == null) {
            return;
        }
        output.B(serialDesc, 25, srg.a, self.getParent_tool_use_id());
    }

    public final String getApi_refusal_category() {
        return this.api_refusal_category;
    }

    public final String getApi_refusal_explanation() {
        return this.api_refusal_explanation;
    }

    public final String getClaude_code_version() {
        return this.claude_code_version;
    }

    public final String getDescription() {
        return this.description;
    }

    public final Integer getEstimated_tokens() {
        return this.estimated_tokens;
    }

    public final Integer getEstimated_tokens_delta() {
        return this.estimated_tokens_delta;
    }

    public final String getFallback_model() {
        return this.fallback_model;
    }

    public final String getLast_tool_name() {
        return this.last_tool_name;
    }

    public final String getOriginal_model() {
        return this.original_model;
    }

    public final String getOutput_file() {
        return this.output_file;
    }

    @Override // com.anthropic.claude.sessions.types.SdkEvent
    public String getParent_tool_use_id() {
        return this.parent_tool_use_id;
    }

    public final SdkTaskPatch getPatch() {
        return this.patch;
    }

    public final String getPermissionMode() {
        return this.permissionMode;
    }

    public final String getPrompt() {
        return this.prompt;
    }

    public final List<String> getSlash_commands() {
        return this.slash_commands;
    }

    public final String getStatus() {
        return this.status;
    }

    public final String getSubtype() {
        return this.subtype;
    }

    public final String getSummary() {
        return this.summary;
    }

    public final String getTask_id() {
        return this.task_id;
    }

    public final String getTask_type() {
        return this.task_type;
    }

    public final String getTool_use_id() {
        return this.tool_use_id;
    }

    @Override // com.anthropic.claude.sessions.types.SdkEvent
    public String getType() {
        return this.type;
    }

    public final SdkTaskUsage getUsage() {
        return this.usage;
    }

    public final String getUuid() {
        return this.uuid;
    }

    public final String getWorkflow_name() {
        return this.workflow_name;
    }

    public final List<SdkWorkflowProgress> getWorkflow_progress() {
        return this.workflow_progress;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SdkSystemEvent(String str, String str2, String str3, String str4, String str5, List<String> list, Integer num, Integer num2, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, SdkTaskUsage sdkTaskUsage, String str17, String str18, List<? extends SdkWorkflowProgress> list2, String str19, SdkTaskPatch sdkTaskPatch) {
        str.getClass();
        str2.getClass();
        list.getClass();
        this.type = str;
        this.uuid = str2;
        this.subtype = str3;
        this.status = str4;
        this.permissionMode = str5;
        this.slash_commands = list;
        this.estimated_tokens = num;
        this.estimated_tokens_delta = num2;
        this.original_model = str6;
        this.fallback_model = str7;
        this.api_refusal_category = str8;
        this.api_refusal_explanation = str9;
        this.claude_code_version = str10;
        this.task_id = str11;
        this.tool_use_id = str12;
        this.description = str13;
        this.task_type = str14;
        this.workflow_name = str15;
        this.prompt = str16;
        this.usage = sdkTaskUsage;
        this.last_tool_name = str17;
        this.summary = str18;
        this.workflow_progress = list2;
        this.output_file = str19;
        this.patch = sdkTaskPatch;
    }

    public /* synthetic */ SdkSystemEvent(String str, String str2, String str3, String str4, String str5, List list, Integer num, Integer num2, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, SdkTaskUsage sdkTaskUsage, String str17, String str18, List list2, String str19, SdkTaskPatch sdkTaskPatch, int i, mq5 mq5Var) {
        this(str, str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? lm6.E : list, (i & 64) != 0 ? null : num, (i & FreeTypeConstants.FT_LOAD_PEDANTIC) != 0 ? null : num2, (i & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) != 0 ? null : str6, (i & 512) != 0 ? null : str7, (i & FreeTypeConstants.FT_LOAD_NO_RECURSE) != 0 ? null : str8, (i & FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM) != 0 ? null : str9, (i & FreeTypeConstants.FT_LOAD_MONOCHROME) != 0 ? null : str10, (i & FreeTypeConstants.FT_LOAD_LINEAR_DESIGN) != 0 ? null : str11, (i & 16384) != 0 ? null : str12, (32768 & i) != 0 ? null : str13, (65536 & i) != 0 ? null : str14, (131072 & i) != 0 ? null : str15, (262144 & i) != 0 ? null : str16, (524288 & i) != 0 ? null : sdkTaskUsage, (1048576 & i) != 0 ? null : str17, (2097152 & i) != 0 ? null : str18, (4194304 & i) != 0 ? null : list2, (8388608 & i) != 0 ? null : str19, (i & 16777216) != 0 ? null : sdkTaskPatch);
    }
}
