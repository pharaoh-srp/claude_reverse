package defpackage;

import com.anthropic.claude.models.organization.configtypes.ProjectUploadLimits;
import io.sentry.w6;

/* JADX INFO: loaded from: classes.dex */
public final class dmd {
    public final rc8 a;
    public final wz5 b;
    public final wz5 c;
    public final wz5 d;
    public final wz5 e;
    public final wz5 f;
    public final wz5 g;

    public dmd(rc8 rc8Var) {
        this.a = rc8Var;
        final int i = 0;
        this.b = mpk.w(new zy7(this) { // from class: cmd
            public final /* synthetic */ dmd F;

            {
                this.F = this;
            }

            @Override // defpackage.zy7
            public final Object a() {
                int i2 = i;
                dmd dmdVar = this.F;
                switch (i2) {
                    case 0:
                        Boolean bool = (Boolean) dmdVar.a.m("mobile_show_projects_ux").getValue();
                        bool.getClass();
                        return bool;
                    case 1:
                        Boolean bool2 = (Boolean) dmdVar.a.m("project_janus").getValue();
                        bool2.getClass();
                        return bool2;
                    case 2:
                        Boolean bool3 = (Boolean) dmdVar.a.m("project_image").getValue();
                        bool3.getClass();
                        return bool3;
                    case 3:
                        ProjectUploadLimits projectUploadLimits = (ProjectUploadLimits) dmdVar.a.g("mobile_project_file_size_limit", iv1.J(jce.b(ProjectUploadLimits.class))).getValue();
                        return Long.valueOf((projectUploadLimits != null ? projectUploadLimits.getProject_file_size_limit_mb() : 30L) * w6.MAX_EVENT_SIZE_BYTES);
                    case 4:
                        Boolean bool4 = (Boolean) dmdVar.a.m("claude_ai_project_bananagrams").getValue();
                        bool4.getClass();
                        return bool4;
                    default:
                        Boolean bool5 = (Boolean) dmdVar.a.m("mobile_project_knowledge_preview").getValue();
                        bool5.getClass();
                        return bool5;
                }
            }
        });
        final int i2 = 1;
        this.c = mpk.w(new zy7(this) { // from class: cmd
            public final /* synthetic */ dmd F;

            {
                this.F = this;
            }

            @Override // defpackage.zy7
            public final Object a() {
                int i22 = i2;
                dmd dmdVar = this.F;
                switch (i22) {
                    case 0:
                        Boolean bool = (Boolean) dmdVar.a.m("mobile_show_projects_ux").getValue();
                        bool.getClass();
                        return bool;
                    case 1:
                        Boolean bool2 = (Boolean) dmdVar.a.m("project_janus").getValue();
                        bool2.getClass();
                        return bool2;
                    case 2:
                        Boolean bool3 = (Boolean) dmdVar.a.m("project_image").getValue();
                        bool3.getClass();
                        return bool3;
                    case 3:
                        ProjectUploadLimits projectUploadLimits = (ProjectUploadLimits) dmdVar.a.g("mobile_project_file_size_limit", iv1.J(jce.b(ProjectUploadLimits.class))).getValue();
                        return Long.valueOf((projectUploadLimits != null ? projectUploadLimits.getProject_file_size_limit_mb() : 30L) * w6.MAX_EVENT_SIZE_BYTES);
                    case 4:
                        Boolean bool4 = (Boolean) dmdVar.a.m("claude_ai_project_bananagrams").getValue();
                        bool4.getClass();
                        return bool4;
                    default:
                        Boolean bool5 = (Boolean) dmdVar.a.m("mobile_project_knowledge_preview").getValue();
                        bool5.getClass();
                        return bool5;
                }
            }
        });
        final int i3 = 2;
        this.d = mpk.w(new zy7(this) { // from class: cmd
            public final /* synthetic */ dmd F;

            {
                this.F = this;
            }

            @Override // defpackage.zy7
            public final Object a() {
                int i22 = i3;
                dmd dmdVar = this.F;
                switch (i22) {
                    case 0:
                        Boolean bool = (Boolean) dmdVar.a.m("mobile_show_projects_ux").getValue();
                        bool.getClass();
                        return bool;
                    case 1:
                        Boolean bool2 = (Boolean) dmdVar.a.m("project_janus").getValue();
                        bool2.getClass();
                        return bool2;
                    case 2:
                        Boolean bool3 = (Boolean) dmdVar.a.m("project_image").getValue();
                        bool3.getClass();
                        return bool3;
                    case 3:
                        ProjectUploadLimits projectUploadLimits = (ProjectUploadLimits) dmdVar.a.g("mobile_project_file_size_limit", iv1.J(jce.b(ProjectUploadLimits.class))).getValue();
                        return Long.valueOf((projectUploadLimits != null ? projectUploadLimits.getProject_file_size_limit_mb() : 30L) * w6.MAX_EVENT_SIZE_BYTES);
                    case 4:
                        Boolean bool4 = (Boolean) dmdVar.a.m("claude_ai_project_bananagrams").getValue();
                        bool4.getClass();
                        return bool4;
                    default:
                        Boolean bool5 = (Boolean) dmdVar.a.m("mobile_project_knowledge_preview").getValue();
                        bool5.getClass();
                        return bool5;
                }
            }
        });
        final int i4 = 3;
        this.e = mpk.w(new zy7(this) { // from class: cmd
            public final /* synthetic */ dmd F;

            {
                this.F = this;
            }

            @Override // defpackage.zy7
            public final Object a() {
                int i22 = i4;
                dmd dmdVar = this.F;
                switch (i22) {
                    case 0:
                        Boolean bool = (Boolean) dmdVar.a.m("mobile_show_projects_ux").getValue();
                        bool.getClass();
                        return bool;
                    case 1:
                        Boolean bool2 = (Boolean) dmdVar.a.m("project_janus").getValue();
                        bool2.getClass();
                        return bool2;
                    case 2:
                        Boolean bool3 = (Boolean) dmdVar.a.m("project_image").getValue();
                        bool3.getClass();
                        return bool3;
                    case 3:
                        ProjectUploadLimits projectUploadLimits = (ProjectUploadLimits) dmdVar.a.g("mobile_project_file_size_limit", iv1.J(jce.b(ProjectUploadLimits.class))).getValue();
                        return Long.valueOf((projectUploadLimits != null ? projectUploadLimits.getProject_file_size_limit_mb() : 30L) * w6.MAX_EVENT_SIZE_BYTES);
                    case 4:
                        Boolean bool4 = (Boolean) dmdVar.a.m("claude_ai_project_bananagrams").getValue();
                        bool4.getClass();
                        return bool4;
                    default:
                        Boolean bool5 = (Boolean) dmdVar.a.m("mobile_project_knowledge_preview").getValue();
                        bool5.getClass();
                        return bool5;
                }
            }
        });
        final int i5 = 4;
        this.f = mpk.w(new zy7(this) { // from class: cmd
            public final /* synthetic */ dmd F;

            {
                this.F = this;
            }

            @Override // defpackage.zy7
            public final Object a() {
                int i22 = i5;
                dmd dmdVar = this.F;
                switch (i22) {
                    case 0:
                        Boolean bool = (Boolean) dmdVar.a.m("mobile_show_projects_ux").getValue();
                        bool.getClass();
                        return bool;
                    case 1:
                        Boolean bool2 = (Boolean) dmdVar.a.m("project_janus").getValue();
                        bool2.getClass();
                        return bool2;
                    case 2:
                        Boolean bool3 = (Boolean) dmdVar.a.m("project_image").getValue();
                        bool3.getClass();
                        return bool3;
                    case 3:
                        ProjectUploadLimits projectUploadLimits = (ProjectUploadLimits) dmdVar.a.g("mobile_project_file_size_limit", iv1.J(jce.b(ProjectUploadLimits.class))).getValue();
                        return Long.valueOf((projectUploadLimits != null ? projectUploadLimits.getProject_file_size_limit_mb() : 30L) * w6.MAX_EVENT_SIZE_BYTES);
                    case 4:
                        Boolean bool4 = (Boolean) dmdVar.a.m("claude_ai_project_bananagrams").getValue();
                        bool4.getClass();
                        return bool4;
                    default:
                        Boolean bool5 = (Boolean) dmdVar.a.m("mobile_project_knowledge_preview").getValue();
                        bool5.getClass();
                        return bool5;
                }
            }
        });
        final int i6 = 5;
        this.g = mpk.w(new zy7(this) { // from class: cmd
            public final /* synthetic */ dmd F;

            {
                this.F = this;
            }

            @Override // defpackage.zy7
            public final Object a() {
                int i22 = i6;
                dmd dmdVar = this.F;
                switch (i22) {
                    case 0:
                        Boolean bool = (Boolean) dmdVar.a.m("mobile_show_projects_ux").getValue();
                        bool.getClass();
                        return bool;
                    case 1:
                        Boolean bool2 = (Boolean) dmdVar.a.m("project_janus").getValue();
                        bool2.getClass();
                        return bool2;
                    case 2:
                        Boolean bool3 = (Boolean) dmdVar.a.m("project_image").getValue();
                        bool3.getClass();
                        return bool3;
                    case 3:
                        ProjectUploadLimits projectUploadLimits = (ProjectUploadLimits) dmdVar.a.g("mobile_project_file_size_limit", iv1.J(jce.b(ProjectUploadLimits.class))).getValue();
                        return Long.valueOf((projectUploadLimits != null ? projectUploadLimits.getProject_file_size_limit_mb() : 30L) * w6.MAX_EVENT_SIZE_BYTES);
                    case 4:
                        Boolean bool4 = (Boolean) dmdVar.a.m("claude_ai_project_bananagrams").getValue();
                        bool4.getClass();
                        return bool4;
                    default:
                        Boolean bool5 = (Boolean) dmdVar.a.m("mobile_project_knowledge_preview").getValue();
                        bool5.getClass();
                        return bool5;
                }
            }
        });
    }
}
