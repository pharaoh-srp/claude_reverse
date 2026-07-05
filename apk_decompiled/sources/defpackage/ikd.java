package defpackage;

import androidx.health.platform.client.proto.g;
import com.anthropic.claude.api.project.Project;
import com.anthropic.claude.api.project.ProjectActorAccount;
import com.anthropic.claude.api.project.ProjectSubtype;
import com.anthropic.claude.api.project.ProjectType;
import com.anthropic.claude.types.strings.ProjectId;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.Date;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ikd implements w28 {
    public static final ikd a;
    private static final SerialDescriptor descriptor;

    static {
        ikd ikdVar = new ikd();
        a = ikdVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.api.project.Project", ikdVar, 17);
        pluginGeneratedSerialDescriptor.j("uuid", false);
        pluginGeneratedSerialDescriptor.j("name", false);
        pluginGeneratedSerialDescriptor.j("description", true);
        pluginGeneratedSerialDescriptor.j("is_private", false);
        pluginGeneratedSerialDescriptor.j("created_at", false);
        pluginGeneratedSerialDescriptor.j("updated_at", false);
        pluginGeneratedSerialDescriptor.j("creator", true);
        pluginGeneratedSerialDescriptor.j("archived_at", true);
        pluginGeneratedSerialDescriptor.j("archiver", true);
        pluginGeneratedSerialDescriptor.j("is_starred", true);
        pluginGeneratedSerialDescriptor.j("is_starter_project", true);
        pluginGeneratedSerialDescriptor.j("type", true);
        pluginGeneratedSerialDescriptor.j("subtype", true);
        pluginGeneratedSerialDescriptor.j("prompt_template", true);
        pluginGeneratedSerialDescriptor.j("docs_count", true);
        pluginGeneratedSerialDescriptor.j("files_count", true);
        pluginGeneratedSerialDescriptor.j("permissions", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        kw9[] kw9VarArr = Project.$childSerializers;
        srg srgVar = srg.a;
        KSerializer kSerializerS = d4c.S(srgVar);
        bc9 bc9Var = bc9.a;
        kkd kkdVar = kkd.a;
        KSerializer kSerializerS2 = d4c.S(kkdVar);
        KSerializer kSerializerS3 = d4c.S(bc9Var);
        KSerializer kSerializerS4 = d4c.S(kkdVar);
        KSerializer kSerializerS5 = d4c.S(xod.d);
        KSerializer kSerializerS6 = d4c.S(ynd.d);
        KSerializer kSerializerS7 = d4c.S(srgVar);
        e79 e79Var = e79.a;
        KSerializer kSerializerS8 = d4c.S(e79Var);
        KSerializer kSerializerS9 = d4c.S(e79Var);
        KSerializer kSerializerS10 = d4c.S((KSerializer) kw9VarArr[16].getValue());
        zt1 zt1Var = zt1.a;
        return new KSerializer[]{emd.a, srgVar, kSerializerS, zt1Var, bc9Var, bc9Var, kSerializerS2, kSerializerS3, kSerializerS4, zt1Var, zt1Var, kSerializerS5, kSerializerS6, kSerializerS7, kSerializerS8, kSerializerS9, kSerializerS10};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        String str;
        String str2;
        int i;
        Integer num;
        String str3;
        String str4;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = Project.$childSerializers;
        Integer num2 = null;
        Integer num3 = null;
        String str5 = null;
        ProjectSubtype projectSubtype = null;
        List list = null;
        Date date = null;
        int i2 = 0;
        String strM1085unboximpl = null;
        ProjectActorAccount projectActorAccount = null;
        String str6 = null;
        ProjectType projectType = null;
        Date date2 = null;
        Date date3 = null;
        ProjectActorAccount projectActorAccount2 = null;
        boolean z = true;
        String strV = null;
        boolean zU = false;
        boolean zU2 = false;
        boolean zU3 = false;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            switch (iX) {
                case -1:
                    num = num2;
                    z = false;
                    num2 = num;
                    break;
                case 0:
                    Integer num4 = num2;
                    String str7 = strM1085unboximpl;
                    str = str6;
                    ProjectId projectId = (ProjectId) ud4VarC.l(serialDescriptor, 0, emd.a, str7 != null ? ProjectId.m1079boximpl(str7) : null);
                    strM1085unboximpl = projectId != null ? projectId.m1085unboximpl() : null;
                    i2 |= 1;
                    num2 = num4;
                    str6 = str;
                    break;
                case 1:
                    num = num2;
                    str3 = strM1085unboximpl;
                    strV = ud4VarC.v(serialDescriptor, 1);
                    i2 |= 2;
                    strM1085unboximpl = str3;
                    num2 = num;
                    break;
                case 2:
                    str3 = strM1085unboximpl;
                    num = num2;
                    str6 = (String) ud4VarC.m(serialDescriptor, 2, srg.a, str6);
                    i2 |= 4;
                    strM1085unboximpl = str3;
                    num2 = num;
                    break;
                case 3:
                    str4 = strM1085unboximpl;
                    zU = ud4VarC.u(serialDescriptor, 3);
                    i2 |= 8;
                    strM1085unboximpl = str4;
                    break;
                case 4:
                    str2 = strM1085unboximpl;
                    str = str6;
                    date2 = (Date) ud4VarC.l(serialDescriptor, 4, bc9.a, date2);
                    i2 |= 16;
                    strM1085unboximpl = str2;
                    str6 = str;
                    break;
                case 5:
                    str2 = strM1085unboximpl;
                    str = str6;
                    date3 = (Date) ud4VarC.l(serialDescriptor, 5, bc9.a, date3);
                    i2 |= 32;
                    strM1085unboximpl = str2;
                    str6 = str;
                    break;
                case 6:
                    str2 = strM1085unboximpl;
                    str = str6;
                    projectActorAccount2 = (ProjectActorAccount) ud4VarC.m(serialDescriptor, 6, kkd.a, projectActorAccount2);
                    i2 |= 64;
                    strM1085unboximpl = str2;
                    str6 = str;
                    break;
                case 7:
                    str2 = strM1085unboximpl;
                    str = str6;
                    date = (Date) ud4VarC.m(serialDescriptor, 7, bc9.a, date);
                    i2 |= FreeTypeConstants.FT_LOAD_PEDANTIC;
                    strM1085unboximpl = str2;
                    str6 = str;
                    break;
                case 8:
                    str2 = strM1085unboximpl;
                    str = str6;
                    projectActorAccount = (ProjectActorAccount) ud4VarC.m(serialDescriptor, 8, kkd.a, projectActorAccount);
                    i2 |= FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING;
                    strM1085unboximpl = str2;
                    str6 = str;
                    break;
                case 9:
                    str4 = strM1085unboximpl;
                    zU2 = ud4VarC.u(serialDescriptor, 9);
                    i2 |= 512;
                    strM1085unboximpl = str4;
                    break;
                case 10:
                    str4 = strM1085unboximpl;
                    zU3 = ud4VarC.u(serialDescriptor, 10);
                    i2 |= FreeTypeConstants.FT_LOAD_NO_RECURSE;
                    strM1085unboximpl = str4;
                    break;
                case 11:
                    str2 = strM1085unboximpl;
                    str = str6;
                    projectType = (ProjectType) ud4VarC.m(serialDescriptor, 11, xod.d, projectType);
                    i2 |= FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM;
                    strM1085unboximpl = str2;
                    str6 = str;
                    break;
                case 12:
                    str2 = strM1085unboximpl;
                    str = str6;
                    projectSubtype = (ProjectSubtype) ud4VarC.m(serialDescriptor, 12, ynd.d, projectSubtype);
                    i2 |= FreeTypeConstants.FT_LOAD_MONOCHROME;
                    strM1085unboximpl = str2;
                    str6 = str;
                    break;
                case 13:
                    str2 = strM1085unboximpl;
                    str = str6;
                    str5 = (String) ud4VarC.m(serialDescriptor, 13, srg.a, str5);
                    i2 |= FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
                    strM1085unboximpl = str2;
                    str6 = str;
                    break;
                case 14:
                    str2 = strM1085unboximpl;
                    str = str6;
                    num3 = (Integer) ud4VarC.m(serialDescriptor, 14, e79.a, num3);
                    i2 |= 16384;
                    strM1085unboximpl = str2;
                    str6 = str;
                    break;
                case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                    str2 = strM1085unboximpl;
                    str = str6;
                    num2 = (Integer) ud4VarC.m(serialDescriptor, 15, e79.a, num2);
                    i = FreeTypeConstants.FT_LOAD_NO_AUTOHINT;
                    i2 |= i;
                    strM1085unboximpl = str2;
                    str6 = str;
                    break;
                case 16:
                    str2 = strM1085unboximpl;
                    str = str6;
                    list = (List) ud4VarC.m(serialDescriptor, 16, (s06) kw9VarArr[16].getValue(), list);
                    i = 65536;
                    i2 |= i;
                    strM1085unboximpl = str2;
                    str6 = str;
                    break;
                default:
                    sz6.e(iX);
                    return null;
            }
        }
        String str8 = strM1085unboximpl;
        ud4VarC.b(serialDescriptor);
        return new Project(i2, str8, strV, str6, zU, date2, date3, projectActorAccount2, date, projectActorAccount, zU2, zU3, projectType, projectSubtype, str5, num3, num2, list, null, null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        Project project = (Project) obj;
        encoder.getClass();
        project.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        Project.write$Self$api(project, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
