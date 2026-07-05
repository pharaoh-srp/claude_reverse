package com.anthropic.claude.api.project;

import defpackage.ebh;
import defpackage.kgh;
import defpackage.mdj;
import defpackage.mq5;
import defpackage.onf;
import defpackage.srg;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import defpackage.zod;
import defpackage.zt1;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\b\u0087\b\u0018\u0000 /2\u00020\u0001:\u000201BO\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bBW\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b \u0010\u001eJ\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001bJX\u0010\"\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b$\u0010\u001bJ\u0010\u0010%\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010(\u001a\u00020\u00052\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b(\u0010)R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010\u001bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010*\u001a\u0004\b,\u0010\u001bR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010-\u001a\u0004\b\u0006\u0010\u001eR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010-\u001a\u0004\b\u0007\u0010\u001eR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\b\u0010-\u001a\u0004\b\b\u0010\u001eR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010*\u001a\u0004\b.\u0010\u001b¨\u00062"}, d2 = {"Lcom/anthropic/claude/api/project/ProjectUpdateParams;", "", "", "name", "description", "", "is_private", "is_starred", "is_archived", "prompt_template", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$api", "(Lcom/anthropic/claude/api/project/ProjectUpdateParams;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/lang/Boolean;", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;)Lcom/anthropic/claude/api/project/ProjectUpdateParams;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getName", "getDescription", "Ljava/lang/Boolean;", "getPrompt_template", "Companion", "yod", "zod", "api"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class ProjectUpdateParams {
    public static final int $stable = 0;
    public static final zod Companion = new zod();
    private final String description;
    private final Boolean is_archived;
    private final Boolean is_private;
    private final Boolean is_starred;
    private final String name;
    private final String prompt_template;

    public /* synthetic */ ProjectUpdateParams(int i, String str, String str2, Boolean bool, Boolean bool2, Boolean bool3, String str3, vnf vnfVar) {
        if ((i & 1) == 0) {
            this.name = null;
        } else {
            this.name = str;
        }
        if ((i & 2) == 0) {
            this.description = null;
        } else {
            this.description = str2;
        }
        if ((i & 4) == 0) {
            this.is_private = null;
        } else {
            this.is_private = bool;
        }
        if ((i & 8) == 0) {
            this.is_starred = null;
        } else {
            this.is_starred = bool2;
        }
        if ((i & 16) == 0) {
            this.is_archived = null;
        } else {
            this.is_archived = bool3;
        }
        if ((i & 32) == 0) {
            this.prompt_template = null;
        } else {
            this.prompt_template = str3;
        }
    }

    public static /* synthetic */ ProjectUpdateParams copy$default(ProjectUpdateParams projectUpdateParams, String str, String str2, Boolean bool, Boolean bool2, Boolean bool3, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = projectUpdateParams.name;
        }
        if ((i & 2) != 0) {
            str2 = projectUpdateParams.description;
        }
        if ((i & 4) != 0) {
            bool = projectUpdateParams.is_private;
        }
        if ((i & 8) != 0) {
            bool2 = projectUpdateParams.is_starred;
        }
        if ((i & 16) != 0) {
            bool3 = projectUpdateParams.is_archived;
        }
        if ((i & 32) != 0) {
            str3 = projectUpdateParams.prompt_template;
        }
        Boolean bool4 = bool3;
        String str4 = str3;
        return projectUpdateParams.copy(str, str2, bool, bool2, bool4, str4);
    }

    public static final /* synthetic */ void write$Self$api(ProjectUpdateParams self, vd4 output, SerialDescriptor serialDesc) {
        if (output.E(serialDesc) || self.name != null) {
            output.B(serialDesc, 0, srg.a, self.name);
        }
        if (output.E(serialDesc) || self.description != null) {
            output.B(serialDesc, 1, srg.a, self.description);
        }
        if (output.E(serialDesc) || self.is_private != null) {
            output.B(serialDesc, 2, zt1.a, self.is_private);
        }
        if (output.E(serialDesc) || self.is_starred != null) {
            output.B(serialDesc, 3, zt1.a, self.is_starred);
        }
        if (output.E(serialDesc) || self.is_archived != null) {
            output.B(serialDesc, 4, zt1.a, self.is_archived);
        }
        if (!output.E(serialDesc) && self.prompt_template == null) {
            return;
        }
        output.B(serialDesc, 5, srg.a, self.prompt_template);
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
    public final Boolean getIs_private() {
        return this.is_private;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Boolean getIs_starred() {
        return this.is_starred;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Boolean getIs_archived() {
        return this.is_archived;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getPrompt_template() {
        return this.prompt_template;
    }

    public final ProjectUpdateParams copy(String name, String description, Boolean is_private, Boolean is_starred, Boolean is_archived, String prompt_template) {
        return new ProjectUpdateParams(name, description, is_private, is_starred, is_archived, prompt_template);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProjectUpdateParams)) {
            return false;
        }
        ProjectUpdateParams projectUpdateParams = (ProjectUpdateParams) other;
        return x44.r(this.name, projectUpdateParams.name) && x44.r(this.description, projectUpdateParams.description) && x44.r(this.is_private, projectUpdateParams.is_private) && x44.r(this.is_starred, projectUpdateParams.is_starred) && x44.r(this.is_archived, projectUpdateParams.is_archived) && x44.r(this.prompt_template, projectUpdateParams.prompt_template);
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

    public int hashCode() {
        String str = this.name;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.description;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.is_private;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.is_starred;
        int iHashCode4 = (iHashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.is_archived;
        int iHashCode5 = (iHashCode4 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str3 = this.prompt_template;
        return iHashCode5 + (str3 != null ? str3.hashCode() : 0);
    }

    public final Boolean is_archived() {
        return this.is_archived;
    }

    public final Boolean is_private() {
        return this.is_private;
    }

    public final Boolean is_starred() {
        return this.is_starred;
    }

    public String toString() {
        String str = this.name;
        String str2 = this.description;
        Boolean bool = this.is_private;
        Boolean bool2 = this.is_starred;
        Boolean bool3 = this.is_archived;
        String str3 = this.prompt_template;
        StringBuilder sbR = kgh.r("ProjectUpdateParams(name=", str, ", description=", str2, ", is_private=");
        ebh.C(sbR, bool, ", is_starred=", bool2, ", is_archived=");
        sbR.append(bool3);
        sbR.append(", prompt_template=");
        sbR.append(str3);
        sbR.append(")");
        return sbR.toString();
    }

    public ProjectUpdateParams() {
        this((String) null, (String) null, (Boolean) null, (Boolean) null, (Boolean) null, (String) null, 63, (mq5) null);
    }

    public ProjectUpdateParams(String str, String str2, Boolean bool, Boolean bool2, Boolean bool3, String str3) {
        this.name = str;
        this.description = str2;
        this.is_private = bool;
        this.is_starred = bool2;
        this.is_archived = bool3;
        this.prompt_template = str3;
    }

    public /* synthetic */ ProjectUpdateParams(String str, String str2, Boolean bool, Boolean bool2, Boolean bool3, String str3, int i, mq5 mq5Var) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : bool, (i & 8) != 0 ? null : bool2, (i & 16) != 0 ? null : bool3, (i & 32) != 0 ? null : str3);
    }
}
