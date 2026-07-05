package com.anthropic.claude.api.mcp;

import com.anthropic.claude.types.strings.McpToolKey;
import com.pvporbit.freetype.FreeTypeConstants;
import defpackage.d4b;
import defpackage.e4b;
import defpackage.f4b;
import defpackage.gvj;
import defpackage.kgh;
import defpackage.m4b;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.p4b;
import defpackage.q4b;
import defpackage.srg;
import defpackage.vd4;
import defpackage.vnf;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0087\b\u0018\u0000 I2\u00020\u0001:\u0002JKB{\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0011\u0010\u0012B\u007f\b\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0011\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0019J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0019J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010 \u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0019J\u0012\u0010\"\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b!\u0010\u0019J\u0012\u0010#\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b'\u0010&J\u0086\u0001\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000eHÆ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010+\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b+\u0010\u0019J\u0010\u0010,\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b,\u0010-J\u001a\u00100\u001a\u00020/2\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b0\u00101J'\u0010:\u001a\u0002072\u0006\u00102\u001a\u00020\u00002\u0006\u00104\u001a\u0002032\u0006\u00106\u001a\u000205H\u0001¢\u0006\u0004\b8\u00109R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010;\u001a\u0004\b<\u0010\u0019R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010;\u001a\u0004\b=\u0010\u0019R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010;\u001a\u0004\b>\u0010\u0019R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010;\u001a\u0004\b?\u0010\u0019R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010@\u001a\u0004\bA\u0010\u001eR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010;\u001a\u0004\bB\u0010\u0019R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010;\u001a\u0004\bC\u0010\u0019R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010D\u001a\u0004\bE\u0010$R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010F\u001a\u0004\bG\u0010&R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u0010\u0010F\u001a\u0004\bH\u0010&¨\u0006L"}, d2 = {"Lcom/anthropic/claude/api/mcp/McpTool;", "", "", "name", "description", "display_description", "displayName", "Lcom/anthropic/claude/api/mcp/McpToolAnnotations;", "annotations", "Lcom/anthropic/claude/types/strings/McpToolKey;", "enabled_key", "always_approved_key", "Lcom/anthropic/claude/api/mcp/McpToolMeta;", "_meta", "Lcom/anthropic/claude/api/mcp/McpToolMaxPermission;", "effective_max_permission", "default_user_permission", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/api/mcp/McpToolAnnotations;Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/api/mcp/McpToolMeta;Lcom/anthropic/claude/api/mcp/McpToolMaxPermission;Lcom/anthropic/claude/api/mcp/McpToolMaxPermission;Lmq5;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/api/mcp/McpToolAnnotations;Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/api/mcp/McpToolMeta;Lcom/anthropic/claude/api/mcp/McpToolMaxPermission;Lcom/anthropic/claude/api/mcp/McpToolMaxPermission;Lvnf;Lmq5;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Lcom/anthropic/claude/api/mcp/McpToolAnnotations;", "component6-A4OzCrU", "component6", "component7-A4OzCrU", "component7", "component8", "()Lcom/anthropic/claude/api/mcp/McpToolMeta;", "component9", "()Lcom/anthropic/claude/api/mcp/McpToolMaxPermission;", "component10", "copy-IfMozL4", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/api/mcp/McpToolAnnotations;Ljava/lang/String;Ljava/lang/String;Lcom/anthropic/claude/api/mcp/McpToolMeta;Lcom/anthropic/claude/api/mcp/McpToolMaxPermission;Lcom/anthropic/claude/api/mcp/McpToolMaxPermission;)Lcom/anthropic/claude/api/mcp/McpTool;", "copy", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/mcp/McpTool;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/String;", "getName", "getDescription", "getDisplay_description", "getDisplayName", "Lcom/anthropic/claude/api/mcp/McpToolAnnotations;", "getAnnotations", "getEnabled_key-A4OzCrU", "getAlways_approved_key-A4OzCrU", "Lcom/anthropic/claude/api/mcp/McpToolMeta;", "get_meta", "Lcom/anthropic/claude/api/mcp/McpToolMaxPermission;", "getEffective_max_permission", "getDefault_user_permission", "Companion", "d4b", "e4b", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class McpTool {
    public static final int $stable = 0;
    public static final e4b Companion = new e4b();
    private final McpToolMeta _meta;
    private final String always_approved_key;
    private final McpToolAnnotations annotations;
    private final McpToolMaxPermission default_user_permission;
    private final String description;
    private final String displayName;
    private final String display_description;
    private final McpToolMaxPermission effective_max_permission;
    private final String enabled_key;
    private final String name;

    private /* synthetic */ McpTool(int i, String str, String str2, String str3, String str4, McpToolAnnotations mcpToolAnnotations, String str5, String str6, McpToolMeta mcpToolMeta, McpToolMaxPermission mcpToolMaxPermission, McpToolMaxPermission mcpToolMaxPermission2, vnf vnfVar) {
        if (1 != (i & 1)) {
            gvj.f(i, 1, d4b.a.getDescriptor());
            throw null;
        }
        this.name = str;
        if ((i & 2) == 0) {
            this.description = null;
        } else {
            this.description = str2;
        }
        if ((i & 4) == 0) {
            this.display_description = null;
        } else {
            this.display_description = str3;
        }
        if ((i & 8) == 0) {
            this.displayName = null;
        } else {
            this.displayName = str4;
        }
        if ((i & 16) == 0) {
            this.annotations = null;
        } else {
            this.annotations = mcpToolAnnotations;
        }
        if ((i & 32) == 0) {
            this.enabled_key = null;
        } else {
            this.enabled_key = str5;
        }
        if ((i & 64) == 0) {
            this.always_approved_key = null;
        } else {
            this.always_approved_key = str6;
        }
        if ((i & FreeTypeConstants.FT_LOAD_PEDANTIC) == 0) {
            this._meta = null;
        } else {
            this._meta = mcpToolMeta;
        }
        if ((i & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) == 0) {
            this.effective_max_permission = null;
        } else {
            this.effective_max_permission = mcpToolMaxPermission;
        }
        if ((i & 512) == 0) {
            this.default_user_permission = null;
        } else {
            this.default_user_permission = mcpToolMaxPermission2;
        }
    }

    /* JADX INFO: renamed from: copy-IfMozL4$default, reason: not valid java name */
    public static /* synthetic */ McpTool m347copyIfMozL4$default(McpTool mcpTool, String str, String str2, String str3, String str4, McpToolAnnotations mcpToolAnnotations, String str5, String str6, McpToolMeta mcpToolMeta, McpToolMaxPermission mcpToolMaxPermission, McpToolMaxPermission mcpToolMaxPermission2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = mcpTool.name;
        }
        if ((i & 2) != 0) {
            str2 = mcpTool.description;
        }
        if ((i & 4) != 0) {
            str3 = mcpTool.display_description;
        }
        if ((i & 8) != 0) {
            str4 = mcpTool.displayName;
        }
        if ((i & 16) != 0) {
            mcpToolAnnotations = mcpTool.annotations;
        }
        if ((i & 32) != 0) {
            str5 = mcpTool.enabled_key;
        }
        if ((i & 64) != 0) {
            str6 = mcpTool.always_approved_key;
        }
        if ((i & FreeTypeConstants.FT_LOAD_PEDANTIC) != 0) {
            mcpToolMeta = mcpTool._meta;
        }
        if ((i & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) != 0) {
            mcpToolMaxPermission = mcpTool.effective_max_permission;
        }
        if ((i & 512) != 0) {
            mcpToolMaxPermission2 = mcpTool.default_user_permission;
        }
        McpToolMaxPermission mcpToolMaxPermission3 = mcpToolMaxPermission;
        McpToolMaxPermission mcpToolMaxPermission4 = mcpToolMaxPermission2;
        String str7 = str6;
        McpToolMeta mcpToolMeta2 = mcpToolMeta;
        McpToolAnnotations mcpToolAnnotations2 = mcpToolAnnotations;
        String str8 = str5;
        return mcpTool.m350copyIfMozL4(str, str2, str3, str4, mcpToolAnnotations2, str8, str7, mcpToolMeta2, mcpToolMaxPermission3, mcpToolMaxPermission4);
    }

    public static final /* synthetic */ void write$Self$api(McpTool self, vd4 output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.name);
        if (output.E(serialDesc) || self.description != null) {
            output.B(serialDesc, 1, srg.a, self.description);
        }
        if (output.E(serialDesc) || self.display_description != null) {
            output.B(serialDesc, 2, srg.a, self.display_description);
        }
        if (output.E(serialDesc) || self.displayName != null) {
            output.B(serialDesc, 3, srg.a, self.displayName);
        }
        if (output.E(serialDesc) || self.annotations != null) {
            output.B(serialDesc, 4, f4b.a, self.annotations);
        }
        if (output.E(serialDesc) || self.enabled_key != null) {
            m4b m4bVar = m4b.a;
            String str = self.enabled_key;
            output.B(serialDesc, 5, m4bVar, str != null ? McpToolKey.m1043boximpl(str) : null);
        }
        if (output.E(serialDesc) || self.always_approved_key != null) {
            m4b m4bVar2 = m4b.a;
            String str2 = self.always_approved_key;
            output.B(serialDesc, 6, m4bVar2, str2 != null ? McpToolKey.m1043boximpl(str2) : null);
        }
        if (output.E(serialDesc) || self._meta != null) {
            output.B(serialDesc, 7, q4b.a, self._meta);
        }
        if (output.E(serialDesc) || self.effective_max_permission != null) {
            output.B(serialDesc, 8, p4b.d, self.effective_max_permission);
        }
        if (!output.E(serialDesc) && self.default_user_permission == null) {
            return;
        }
        output.B(serialDesc, 9, p4b.d, self.default_user_permission);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final McpToolMaxPermission getDefault_user_permission() {
        return this.default_user_permission;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDisplay_description() {
        return this.display_description;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getDisplayName() {
        return this.displayName;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final McpToolAnnotations getAnnotations() {
        return this.annotations;
    }

    /* JADX INFO: renamed from: component6-A4OzCrU, reason: not valid java name and from getter */
    public final String getEnabled_key() {
        return this.enabled_key;
    }

    /* JADX INFO: renamed from: component7-A4OzCrU, reason: not valid java name and from getter */
    public final String getAlways_approved_key() {
        return this.always_approved_key;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final McpToolMeta get_meta() {
        return this._meta;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final McpToolMaxPermission getEffective_max_permission() {
        return this.effective_max_permission;
    }

    /* JADX INFO: renamed from: copy-IfMozL4, reason: not valid java name */
    public final McpTool m350copyIfMozL4(String name, String description, String display_description, String displayName, McpToolAnnotations annotations, String enabled_key, String always_approved_key, McpToolMeta _meta, McpToolMaxPermission effective_max_permission, McpToolMaxPermission default_user_permission) {
        name.getClass();
        return new McpTool(name, description, display_description, displayName, annotations, enabled_key, always_approved_key, _meta, effective_max_permission, default_user_permission, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0063  */
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
            boolean r1 = r5 instanceof com.anthropic.claude.api.mcp.McpTool
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.anthropic.claude.api.mcp.McpTool r5 = (com.anthropic.claude.api.mcp.McpTool) r5
            java.lang.String r1 = r4.name
            java.lang.String r3 = r5.name
            boolean r1 = defpackage.x44.r(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.lang.String r1 = r4.description
            java.lang.String r3 = r5.description
            boolean r1 = defpackage.x44.r(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            java.lang.String r1 = r4.display_description
            java.lang.String r3 = r5.display_description
            boolean r1 = defpackage.x44.r(r1, r3)
            if (r1 != 0) goto L2d
            return r2
        L2d:
            java.lang.String r1 = r4.displayName
            java.lang.String r3 = r5.displayName
            boolean r1 = defpackage.x44.r(r1, r3)
            if (r1 != 0) goto L38
            return r2
        L38:
            com.anthropic.claude.api.mcp.McpToolAnnotations r1 = r4.annotations
            com.anthropic.claude.api.mcp.McpToolAnnotations r3 = r5.annotations
            boolean r1 = defpackage.x44.r(r1, r3)
            if (r1 != 0) goto L43
            return r2
        L43:
            java.lang.String r1 = r4.enabled_key
            java.lang.String r3 = r5.enabled_key
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
            boolean r1 = com.anthropic.claude.types.strings.McpToolKey.m1046equalsimpl0(r1, r3)
        L56:
            if (r1 != 0) goto L59
            return r2
        L59:
            java.lang.String r1 = r4.always_approved_key
            java.lang.String r3 = r5.always_approved_key
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
            boolean r1 = com.anthropic.claude.types.strings.McpToolKey.m1046equalsimpl0(r1, r3)
        L6c:
            if (r1 != 0) goto L6f
            return r2
        L6f:
            com.anthropic.claude.api.mcp.McpToolMeta r1 = r4._meta
            com.anthropic.claude.api.mcp.McpToolMeta r3 = r5._meta
            boolean r1 = defpackage.x44.r(r1, r3)
            if (r1 != 0) goto L7a
            return r2
        L7a:
            com.anthropic.claude.api.mcp.McpToolMaxPermission r1 = r4.effective_max_permission
            com.anthropic.claude.api.mcp.McpToolMaxPermission r3 = r5.effective_max_permission
            if (r1 == r3) goto L81
            return r2
        L81:
            com.anthropic.claude.api.mcp.McpToolMaxPermission r4 = r4.default_user_permission
            com.anthropic.claude.api.mcp.McpToolMaxPermission r5 = r5.default_user_permission
            if (r4 == r5) goto L88
            return r2
        L88:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anthropic.claude.api.mcp.McpTool.equals(java.lang.Object):boolean");
    }

    /* JADX INFO: renamed from: getAlways_approved_key-A4OzCrU, reason: not valid java name */
    public final String m351getAlways_approved_keyA4OzCrU() {
        return this.always_approved_key;
    }

    public final McpToolAnnotations getAnnotations() {
        return this.annotations;
    }

    public final McpToolMaxPermission getDefault_user_permission() {
        return this.default_user_permission;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    public final String getDisplay_description() {
        return this.display_description;
    }

    public final McpToolMaxPermission getEffective_max_permission() {
        return this.effective_max_permission;
    }

    /* JADX INFO: renamed from: getEnabled_key-A4OzCrU, reason: not valid java name */
    public final String m352getEnabled_keyA4OzCrU() {
        return this.enabled_key;
    }

    public final String getName() {
        return this.name;
    }

    public final McpToolMeta get_meta() {
        return this._meta;
    }

    public int hashCode() {
        int iHashCode = this.name.hashCode() * 31;
        String str = this.description;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.display_description;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.displayName;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        McpToolAnnotations mcpToolAnnotations = this.annotations;
        int iHashCode5 = (iHashCode4 + (mcpToolAnnotations == null ? 0 : mcpToolAnnotations.hashCode())) * 31;
        String str4 = this.enabled_key;
        int iM1048hashCodeimpl = (iHashCode5 + (str4 == null ? 0 : McpToolKey.m1048hashCodeimpl(str4))) * 31;
        String str5 = this.always_approved_key;
        int iM1048hashCodeimpl2 = (iM1048hashCodeimpl + (str5 == null ? 0 : McpToolKey.m1048hashCodeimpl(str5))) * 31;
        McpToolMeta mcpToolMeta = this._meta;
        int iHashCode6 = (iM1048hashCodeimpl2 + (mcpToolMeta == null ? 0 : mcpToolMeta.hashCode())) * 31;
        McpToolMaxPermission mcpToolMaxPermission = this.effective_max_permission;
        int iHashCode7 = (iHashCode6 + (mcpToolMaxPermission == null ? 0 : mcpToolMaxPermission.hashCode())) * 31;
        McpToolMaxPermission mcpToolMaxPermission2 = this.default_user_permission;
        return iHashCode7 + (mcpToolMaxPermission2 != null ? mcpToolMaxPermission2.hashCode() : 0);
    }

    public String toString() {
        String str = this.name;
        String str2 = this.description;
        String str3 = this.display_description;
        String str4 = this.displayName;
        McpToolAnnotations mcpToolAnnotations = this.annotations;
        String str5 = this.enabled_key;
        String strM1049toStringimpl = str5 == null ? "null" : McpToolKey.m1049toStringimpl(str5);
        String str6 = this.always_approved_key;
        String strM1049toStringimpl2 = str6 != null ? McpToolKey.m1049toStringimpl(str6) : "null";
        McpToolMeta mcpToolMeta = this._meta;
        McpToolMaxPermission mcpToolMaxPermission = this.effective_max_permission;
        McpToolMaxPermission mcpToolMaxPermission2 = this.default_user_permission;
        StringBuilder sbR = kgh.r("McpTool(name=", str, ", description=", str2, ", display_description=");
        kgh.u(sbR, str3, ", displayName=", str4, ", annotations=");
        sbR.append(mcpToolAnnotations);
        sbR.append(", enabled_key=");
        sbR.append(strM1049toStringimpl);
        sbR.append(", always_approved_key=");
        sbR.append(strM1049toStringimpl2);
        sbR.append(", _meta=");
        sbR.append(mcpToolMeta);
        sbR.append(", effective_max_permission=");
        sbR.append(mcpToolMaxPermission);
        sbR.append(", default_user_permission=");
        sbR.append(mcpToolMaxPermission2);
        sbR.append(")");
        return sbR.toString();
    }

    public /* synthetic */ McpTool(String str, String str2, String str3, String str4, McpToolAnnotations mcpToolAnnotations, String str5, String str6, McpToolMeta mcpToolMeta, McpToolMaxPermission mcpToolMaxPermission, McpToolMaxPermission mcpToolMaxPermission2, mq5 mq5Var) {
        this(str, str2, str3, str4, mcpToolAnnotations, str5, str6, mcpToolMeta, mcpToolMaxPermission, mcpToolMaxPermission2);
    }

    public /* synthetic */ McpTool(int i, String str, String str2, String str3, String str4, McpToolAnnotations mcpToolAnnotations, String str5, String str6, McpToolMeta mcpToolMeta, McpToolMaxPermission mcpToolMaxPermission, McpToolMaxPermission mcpToolMaxPermission2, vnf vnfVar, mq5 mq5Var) {
        this(i, str, str2, str3, str4, mcpToolAnnotations, str5, str6, mcpToolMeta, mcpToolMaxPermission, mcpToolMaxPermission2, vnfVar);
    }

    private McpTool(String str, String str2, String str3, String str4, McpToolAnnotations mcpToolAnnotations, String str5, String str6, McpToolMeta mcpToolMeta, McpToolMaxPermission mcpToolMaxPermission, McpToolMaxPermission mcpToolMaxPermission2) {
        str.getClass();
        this.name = str;
        this.description = str2;
        this.display_description = str3;
        this.displayName = str4;
        this.annotations = mcpToolAnnotations;
        this.enabled_key = str5;
        this.always_approved_key = str6;
        this._meta = mcpToolMeta;
        this.effective_max_permission = mcpToolMaxPermission;
        this.default_user_permission = mcpToolMaxPermission2;
    }

    public /* synthetic */ McpTool(String str, String str2, String str3, String str4, McpToolAnnotations mcpToolAnnotations, String str5, String str6, McpToolMeta mcpToolMeta, McpToolMaxPermission mcpToolMaxPermission, McpToolMaxPermission mcpToolMaxPermission2, int i, mq5 mq5Var) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : mcpToolAnnotations, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : str6, (i & FreeTypeConstants.FT_LOAD_PEDANTIC) != 0 ? null : mcpToolMeta, (i & FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING) != 0 ? null : mcpToolMaxPermission, (i & 512) != 0 ? null : mcpToolMaxPermission2, null);
    }
}
