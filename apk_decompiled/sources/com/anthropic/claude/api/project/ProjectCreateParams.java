package com.anthropic.claude.api.project;

import defpackage.fsh;
import defpackage.gvj;
import defpackage.kgh;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.okd;
import defpackage.onf;
import defpackage.pkd;
import defpackage.srg;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import defpackage.xod;
import defpackage.ynd;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\"\b\u0087\b\u0018\u0000 72\u00020\u0001:\u000289BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rBU\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0012J'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001dJ\u0012\u0010\"\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b$\u0010%JT\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b(\u0010\u001dJ\u0010\u0010)\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b)\u0010*J\u001a\u0010,\u001a\u00020\u00052\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b,\u0010-R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010.\u001a\u0004\b/\u0010\u001dR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010.\u001a\u0004\b0\u0010\u001dR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u00101\u001a\u0004\b\u0006\u0010 R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010.\u001a\u0004\b2\u0010\u001dR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u00103\u001a\u0004\b4\u0010#R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u00105\u001a\u0004\b6\u0010%¨\u0006:"}, d2 = {"Lcom/anthropic/claude/api/project/ProjectCreateParams;", "", "", "name", "description", "", "is_private", "prompt_template", "Lcom/anthropic/claude/api/project/ProjectType;", "type", "Lcom/anthropic/claude/api/project/ProjectSubtype;", "subtype", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lcom/anthropic/claude/api/project/ProjectType;Lcom/anthropic/claude/api/project/ProjectSubtype;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lcom/anthropic/claude/api/project/ProjectType;Lcom/anthropic/claude/api/project/ProjectSubtype;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/project/ProjectCreateParams;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Z", "component4", "component5", "()Lcom/anthropic/claude/api/project/ProjectType;", "component6", "()Lcom/anthropic/claude/api/project/ProjectSubtype;", "copy", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lcom/anthropic/claude/api/project/ProjectType;Lcom/anthropic/claude/api/project/ProjectSubtype;)Lcom/anthropic/claude/api/project/ProjectCreateParams;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getName", "getDescription", "Z", "getPrompt_template", "Lcom/anthropic/claude/api/project/ProjectType;", "getType", "Lcom/anthropic/claude/api/project/ProjectSubtype;", "getSubtype", "Companion", "okd", "pkd", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class ProjectCreateParams {
    public static final int $stable = 0;
    public static final pkd Companion = new pkd();
    private final String description;
    private final boolean is_private;
    private final String name;
    private final String prompt_template;
    private final ProjectSubtype subtype;
    private final ProjectType type;

    public /* synthetic */ ProjectCreateParams(int i, String str, String str2, boolean z, String str3, ProjectType projectType, ProjectSubtype projectSubtype, vnf vnfVar) {
        if (5 != (i & 5)) {
            gvj.f(i, 5, okd.a.getDescriptor());
            throw null;
        }
        this.name = str;
        if ((i & 2) == 0) {
            this.description = null;
        } else {
            this.description = str2;
        }
        this.is_private = z;
        if ((i & 8) == 0) {
            this.prompt_template = null;
        } else {
            this.prompt_template = str3;
        }
        if ((i & 16) == 0) {
            this.type = null;
        } else {
            this.type = projectType;
        }
        if ((i & 32) == 0) {
            this.subtype = null;
        } else {
            this.subtype = projectSubtype;
        }
    }

    public static /* synthetic */ ProjectCreateParams copy$default(ProjectCreateParams projectCreateParams, String str, String str2, boolean z, String str3, ProjectType projectType, ProjectSubtype projectSubtype, int i, Object obj) {
        if ((i & 1) != 0) {
            str = projectCreateParams.name;
        }
        if ((i & 2) != 0) {
            str2 = projectCreateParams.description;
        }
        if ((i & 4) != 0) {
            z = projectCreateParams.is_private;
        }
        if ((i & 8) != 0) {
            str3 = projectCreateParams.prompt_template;
        }
        if ((i & 16) != 0) {
            projectType = projectCreateParams.type;
        }
        if ((i & 32) != 0) {
            projectSubtype = projectCreateParams.subtype;
        }
        ProjectType projectType2 = projectType;
        ProjectSubtype projectSubtype2 = projectSubtype;
        return projectCreateParams.copy(str, str2, z, str3, projectType2, projectSubtype2);
    }

    public static final /* synthetic */ void write$Self$api(ProjectCreateParams self, vd4 output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.name);
        if (output.E(serialDesc) || self.description != null) {
            output.B(serialDesc, 1, srg.a, self.description);
        }
        output.p(serialDesc, 2, self.is_private);
        if (output.E(serialDesc) || self.prompt_template != null) {
            output.B(serialDesc, 3, srg.a, self.prompt_template);
        }
        if (output.E(serialDesc) || self.type != null) {
            output.B(serialDesc, 4, xod.d, self.type);
        }
        if (!output.E(serialDesc) && self.subtype == null) {
            return;
        }
        output.B(serialDesc, 5, ynd.d, self.subtype);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getIs_private() {
        return this.is_private;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getPrompt_template() {
        return this.prompt_template;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final ProjectType getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final ProjectSubtype getSubtype() {
        return this.subtype;
    }

    public final ProjectCreateParams copy(String name, String description, boolean is_private, String prompt_template, ProjectType type, ProjectSubtype subtype) {
        name.getClass();
        return new ProjectCreateParams(name, description, is_private, prompt_template, type, subtype);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProjectCreateParams)) {
            return false;
        }
        ProjectCreateParams projectCreateParams = (ProjectCreateParams) other;
        return x44.r(this.name, projectCreateParams.name) && x44.r(this.description, projectCreateParams.description) && this.is_private == projectCreateParams.is_private && x44.r(this.prompt_template, projectCreateParams.prompt_template) && this.type == projectCreateParams.type && this.subtype == projectCreateParams.subtype;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getName() {
        return this.name;
    }

    public final String getPrompt_template() {
        return this.prompt_template;
    }

    public final ProjectSubtype getSubtype() {
        return this.subtype;
    }

    public final ProjectType getType() {
        return this.type;
    }

    public int hashCode() {
        int iHashCode = this.name.hashCode() * 31;
        String str = this.description;
        int iP = fsh.p((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.is_private);
        String str2 = this.prompt_template;
        int iHashCode2 = (iP + (str2 == null ? 0 : str2.hashCode())) * 31;
        ProjectType projectType = this.type;
        int iHashCode3 = (iHashCode2 + (projectType == null ? 0 : projectType.hashCode())) * 31;
        ProjectSubtype projectSubtype = this.subtype;
        return iHashCode3 + (projectSubtype != null ? projectSubtype.hashCode() : 0);
    }

    public final boolean is_private() {
        return this.is_private;
    }

    public String toString() {
        String str = this.name;
        String str2 = this.description;
        boolean z = this.is_private;
        String str3 = this.prompt_template;
        ProjectType projectType = this.type;
        ProjectSubtype projectSubtype = this.subtype;
        StringBuilder sbR = kgh.r("ProjectCreateParams(name=", str, ", description=", str2, ", is_private=");
        sbR.append(z);
        sbR.append(", prompt_template=");
        sbR.append(str3);
        sbR.append(", type=");
        sbR.append(projectType);
        sbR.append(", subtype=");
        sbR.append(projectSubtype);
        sbR.append(")");
        return sbR.toString();
    }

    public ProjectCreateParams(String str, String str2, boolean z, String str3, ProjectType projectType, ProjectSubtype projectSubtype) {
        str.getClass();
        this.name = str;
        this.description = str2;
        this.is_private = z;
        this.prompt_template = str3;
        this.type = projectType;
        this.subtype = projectSubtype;
    }

    public /* synthetic */ ProjectCreateParams(String str, String str2, boolean z, String str3, ProjectType projectType, ProjectSubtype projectSubtype, int i, mq5 mq5Var) {
        this(str, (i & 2) != 0 ? null : str2, z, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : projectType, (i & 32) != 0 ? null : projectSubtype);
    }
}
