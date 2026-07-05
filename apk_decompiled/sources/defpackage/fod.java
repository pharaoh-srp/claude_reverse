package defpackage;

import com.anthropic.claude.api.project.ProjectSubtype;
import com.anthropic.claude.api.project.ProjectType;
import com.anthropic.claude.core.telemetry.SilentException;
import com.anthropic.claude.models.organization.configtypes.ProjectTemplateConfig;
import com.anthropic.claude.models.organization.configtypes.ProjectTemplateTextConfig;
import com.anthropic.claude.models.organization.configtypes.ProjectTemplatesCopyConfig;
import com.anthropic.claude.models.organization.configtypes.StarterPromptConfig;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class fod {
    public final pkc a;
    public final rc8 b;
    public final Map c;

    /* JADX WARN: Can't wrap try/catch for region: R(16:0|2|77|3|(23:6|(1:8)|9|(1:11)|12|(1:14)|15|19|(1:21)|22|(1:24)|25|(0)|81|28|32|(1:34)|35|(1:37)|38|(15:79|41|(1:54)(3:45|(4:48|(3:83|50|87)(1:86)|85|46)|84)|56|(1:58)|59|(1:62)|63|(1:66)|67|(1:69)|70|(2:73|71)|88|74)|75|76)|5|81|28|32|(0)|35|(0)|38|(0)|75|76) */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0097, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0098, code lost:
    
        r2 = new defpackage.hre(r2);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00b9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r3v4, types: [hre] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public fod(defpackage.pkc r7, defpackage.rc8 r8) {
        /*
            Method dump skipped, instruction units count: 334
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fod.<init>(pkc, rc8):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r15v1, types: [lm6] */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v3, types: [java.util.ArrayList] */
    public static znd b(ProjectTemplateConfig projectTemplateConfig, Map map, ProjectTemplatesCopyConfig projectTemplatesCopyConfig) {
        ?? arrayList;
        int i = eod.a[projectTemplateConfig.getSubtype().ordinal()];
        ProjectTemplateTextConfig research = i != 1 ? i != 2 ? i != 3 ? null : projectTemplatesCopyConfig.getStudent().getResearch() : projectTemplatesCopyConfig.getStudent().getCareer() : projectTemplatesCopyConfig.getStudent().getStudy();
        if (research == null) {
            return null;
        }
        p75 p75VarB = pik.b(research.getTitle(), research.getDescription(), research.getProject_title_input_header(), research.getProject_title_input_hint());
        pji pjiVarC = pik.c(research.getCustom_instruction_reason(), research.getUpload_material_title(), research.getUpload_material_placeholder());
        List list = (List) map.get(projectTemplateConfig.getSubtype());
        String strA = p75VarB.a();
        String project_description = research.getProject_description();
        ProjectType type = projectTemplateConfig.getType();
        ProjectSubtype subtype = projectTemplateConfig.getSubtype();
        String custom_instructions = projectTemplateConfig.getCustom_instructions();
        String icon_type = projectTemplateConfig.getIcon_type();
        if (list != null) {
            List<StarterPromptConfig> list2 = list;
            arrayList = new ArrayList(x44.y(list2, 10));
            for (StarterPromptConfig starterPromptConfig : list2) {
                arrayList.add(new olg(starterPromptConfig.getId(), starterPromptConfig.getMobile_prompt_title(), Integer.valueOf(sik.e(starterPromptConfig)), starterPromptConfig.getPrompt()));
            }
        } else {
            arrayList = lm6.E;
        }
        return new znd(strA, project_description, p75VarB, pjiVarC, type, subtype, custom_instructions, icon_type, arrayList);
    }

    public final void a(SilentException silentException) {
        if (((Boolean) this.a.a().x.getValue()).booleanValue()) {
            SilentException.a(silentException, null, false, 3);
        }
    }
}
