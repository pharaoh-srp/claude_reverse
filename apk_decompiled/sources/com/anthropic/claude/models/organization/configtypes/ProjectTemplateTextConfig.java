package com.anthropic.claude.models.organization.configtypes;

import com.pvporbit.freetype.FreeTypeConstants;
import defpackage.god;
import defpackage.grc;
import defpackage.gvj;
import defpackage.hod;
import defpackage.kgh;
import defpackage.mdj;
import defpackage.onf;
import defpackage.vb7;
import defpackage.vd4;
import defpackage.vnf;
import defpackage.x44;
import defpackage.y6a;
import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u0000 62\u00020\u0001:\u000278BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fBk\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001cJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001cJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001cJ\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001cJ\u0010\u0010\"\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u001cJ\u0010\u0010#\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u001cJ`\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b&\u0010\u001cJ\u0010\u0010'\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010+\u001a\u00020*2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b+\u0010,R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010-\u001a\u0004\b.\u0010\u001cR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010-\u001a\u0004\b/\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010-\u001a\u0004\b0\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010-\u001a\u0004\b1\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010-\u001a\u0004\b2\u0010\u001cR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010-\u001a\u0004\b3\u0010\u001cR\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010-\u001a\u0004\b4\u0010\u001cR\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010-\u001a\u0004\b5\u0010\u001c¨\u00069"}, d2 = {"Lcom/anthropic/claude/models/organization/configtypes/ProjectTemplateTextConfig;", "", "", "title", "description", "project_title_input_header", "project_title_input_hint", "custom_instruction_reason", "upload_material_title", "upload_material_placeholder", "project_description", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lvnf;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lvnf;)V", "self", "Lvd4;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Liei;", "write$Self$models", "(Lcom/anthropic/claude/models/organization/configtypes/ProjectTemplateTextConfig;Lvd4;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/anthropic/claude/models/organization/configtypes/ProjectTemplateTextConfig;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getDescription", "getProject_title_input_header", "getProject_title_input_hint", "getCustom_instruction_reason", "getUpload_material_title", "getUpload_material_placeholder", "getProject_description", "Companion", "god", "hod", "models"}, k = 1, mv = {2, 4, 0}, xi = mdj.f)
@onf
public final /* data */ class ProjectTemplateTextConfig {
    public static final int $stable = 0;
    public static final hod Companion = new hod();
    private final String custom_instruction_reason;
    private final String description;
    private final String project_description;
    private final String project_title_input_header;
    private final String project_title_input_hint;
    private final String title;
    private final String upload_material_placeholder;
    private final String upload_material_title;

    public /* synthetic */ ProjectTemplateTextConfig(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, vnf vnfVar) {
        if (255 != (i & 255)) {
            gvj.f(i, 255, god.a.getDescriptor());
            throw null;
        }
        this.title = str;
        this.description = str2;
        this.project_title_input_header = str3;
        this.project_title_input_hint = str4;
        this.custom_instruction_reason = str5;
        this.upload_material_title = str6;
        this.upload_material_placeholder = str7;
        this.project_description = str8;
    }

    public static /* synthetic */ ProjectTemplateTextConfig copy$default(ProjectTemplateTextConfig projectTemplateTextConfig, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, Object obj) {
        if ((i & 1) != 0) {
            str = projectTemplateTextConfig.title;
        }
        if ((i & 2) != 0) {
            str2 = projectTemplateTextConfig.description;
        }
        if ((i & 4) != 0) {
            str3 = projectTemplateTextConfig.project_title_input_header;
        }
        if ((i & 8) != 0) {
            str4 = projectTemplateTextConfig.project_title_input_hint;
        }
        if ((i & 16) != 0) {
            str5 = projectTemplateTextConfig.custom_instruction_reason;
        }
        if ((i & 32) != 0) {
            str6 = projectTemplateTextConfig.upload_material_title;
        }
        if ((i & 64) != 0) {
            str7 = projectTemplateTextConfig.upload_material_placeholder;
        }
        if ((i & FreeTypeConstants.FT_LOAD_PEDANTIC) != 0) {
            str8 = projectTemplateTextConfig.project_description;
        }
        String str9 = str7;
        String str10 = str8;
        String str11 = str5;
        String str12 = str6;
        return projectTemplateTextConfig.copy(str, str2, str3, str4, str11, str12, str9, str10);
    }

    public static final /* synthetic */ void write$Self$models(ProjectTemplateTextConfig self, vd4 output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.title);
        output.q(serialDesc, 1, self.description);
        output.q(serialDesc, 2, self.project_title_input_header);
        output.q(serialDesc, 3, self.project_title_input_hint);
        output.q(serialDesc, 4, self.custom_instruction_reason);
        output.q(serialDesc, 5, self.upload_material_title);
        output.q(serialDesc, 6, self.upload_material_placeholder);
        output.q(serialDesc, 7, self.project_description);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getProject_title_input_header() {
        return this.project_title_input_header;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getProject_title_input_hint() {
        return this.project_title_input_hint;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getCustom_instruction_reason() {
        return this.custom_instruction_reason;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getUpload_material_title() {
        return this.upload_material_title;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getUpload_material_placeholder() {
        return this.upload_material_placeholder;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getProject_description() {
        return this.project_description;
    }

    public final ProjectTemplateTextConfig copy(String title, String description, String project_title_input_header, String project_title_input_hint, String custom_instruction_reason, String upload_material_title, String upload_material_placeholder, String project_description) {
        y6a.s(title, description, project_title_input_header, project_title_input_hint, custom_instruction_reason);
        upload_material_title.getClass();
        upload_material_placeholder.getClass();
        project_description.getClass();
        return new ProjectTemplateTextConfig(title, description, project_title_input_header, project_title_input_hint, custom_instruction_reason, upload_material_title, upload_material_placeholder, project_description);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProjectTemplateTextConfig)) {
            return false;
        }
        ProjectTemplateTextConfig projectTemplateTextConfig = (ProjectTemplateTextConfig) other;
        return x44.r(this.title, projectTemplateTextConfig.title) && x44.r(this.description, projectTemplateTextConfig.description) && x44.r(this.project_title_input_header, projectTemplateTextConfig.project_title_input_header) && x44.r(this.project_title_input_hint, projectTemplateTextConfig.project_title_input_hint) && x44.r(this.custom_instruction_reason, projectTemplateTextConfig.custom_instruction_reason) && x44.r(this.upload_material_title, projectTemplateTextConfig.upload_material_title) && x44.r(this.upload_material_placeholder, projectTemplateTextConfig.upload_material_placeholder) && x44.r(this.project_description, projectTemplateTextConfig.project_description);
    }

    public final String getCustom_instruction_reason() {
        return this.custom_instruction_reason;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getProject_description() {
        return this.project_description;
    }

    public final String getProject_title_input_header() {
        return this.project_title_input_header;
    }

    public final String getProject_title_input_hint() {
        return this.project_title_input_hint;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getUpload_material_placeholder() {
        return this.upload_material_placeholder;
    }

    public final String getUpload_material_title() {
        return this.upload_material_title;
    }

    public int hashCode() {
        return this.project_description.hashCode() + kgh.l(kgh.l(kgh.l(kgh.l(kgh.l(kgh.l(this.title.hashCode() * 31, 31, this.description), 31, this.project_title_input_header), 31, this.project_title_input_hint), 31, this.custom_instruction_reason), 31, this.upload_material_title), 31, this.upload_material_placeholder);
    }

    public String toString() {
        String str = this.title;
        String str2 = this.description;
        String str3 = this.project_title_input_header;
        String str4 = this.project_title_input_hint;
        String str5 = this.custom_instruction_reason;
        String str6 = this.upload_material_title;
        String str7 = this.upload_material_placeholder;
        String str8 = this.project_description;
        StringBuilder sbR = kgh.r("ProjectTemplateTextConfig(title=", str, ", description=", str2, ", project_title_input_header=");
        kgh.u(sbR, str3, ", project_title_input_hint=", str4, ", custom_instruction_reason=");
        kgh.u(sbR, str5, ", upload_material_title=", str6, ", upload_material_placeholder=");
        return vb7.t(sbR, str7, ", project_description=", str8, ")");
    }

    public ProjectTemplateTextConfig(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        y6a.s(str, str2, str3, str4, str5);
        grc.B(str6, str7, str8);
        this.title = str;
        this.description = str2;
        this.project_title_input_header = str3;
        this.project_title_input_hint = str4;
        this.custom_instruction_reason = str5;
        this.upload_material_title = str6;
        this.upload_material_placeholder = str7;
        this.project_description = str8;
    }
}
