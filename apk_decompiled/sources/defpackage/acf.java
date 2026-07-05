package defpackage;

import androidx.health.platform.client.proto.g;
import com.anthropic.claude.sessions.types.SdkSystemEvent;
import com.anthropic.claude.sessions.types.SdkTaskPatch;
import com.anthropic.claude.sessions.types.SdkTaskUsage;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class acf implements w28 {
    public static final acf a;
    private static final SerialDescriptor descriptor;

    static {
        acf acfVar = new acf();
        a = acfVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.sessions.types.SdkSystemEvent", acfVar, 26);
        pluginGeneratedSerialDescriptor.j("type", false);
        pluginGeneratedSerialDescriptor.j("uuid", false);
        pluginGeneratedSerialDescriptor.j("subtype", true);
        pluginGeneratedSerialDescriptor.j("status", true);
        pluginGeneratedSerialDescriptor.j("permissionMode", true);
        pluginGeneratedSerialDescriptor.j("slash_commands", true);
        pluginGeneratedSerialDescriptor.j("estimated_tokens", true);
        pluginGeneratedSerialDescriptor.j("estimated_tokens_delta", true);
        pluginGeneratedSerialDescriptor.j("original_model", true);
        pluginGeneratedSerialDescriptor.j("fallback_model", true);
        pluginGeneratedSerialDescriptor.j("api_refusal_category", true);
        pluginGeneratedSerialDescriptor.j("api_refusal_explanation", true);
        pluginGeneratedSerialDescriptor.j("claude_code_version", true);
        pluginGeneratedSerialDescriptor.j("task_id", true);
        pluginGeneratedSerialDescriptor.j("tool_use_id", true);
        pluginGeneratedSerialDescriptor.j("description", true);
        pluginGeneratedSerialDescriptor.j("task_type", true);
        pluginGeneratedSerialDescriptor.j("workflow_name", true);
        pluginGeneratedSerialDescriptor.j("prompt", true);
        pluginGeneratedSerialDescriptor.j("usage", true);
        pluginGeneratedSerialDescriptor.j("last_tool_name", true);
        pluginGeneratedSerialDescriptor.j("summary", true);
        pluginGeneratedSerialDescriptor.j("workflow_progress", true);
        pluginGeneratedSerialDescriptor.j("output_file", true);
        pluginGeneratedSerialDescriptor.j("patch", true);
        pluginGeneratedSerialDescriptor.j("parent_tool_use_id", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        kw9[] kw9VarArr = SdkSystemEvent.$childSerializers;
        srg srgVar = srg.a;
        e79 e79Var = e79.a;
        return new KSerializer[]{srgVar, srgVar, d4c.S(srgVar), d4c.S(srgVar), d4c.S(srgVar), kw9VarArr[5].getValue(), d4c.S(e79Var), d4c.S(e79Var), d4c.S(srgVar), d4c.S(srgVar), d4c.S(srgVar), d4c.S(srgVar), d4c.S(srgVar), d4c.S(srgVar), d4c.S(srgVar), d4c.S(srgVar), d4c.S(srgVar), d4c.S(srgVar), d4c.S(srgVar), d4c.S(ecf.a), d4c.S(srgVar), d4c.S(srgVar), d4c.S((KSerializer) kw9VarArr[22].getValue()), d4c.S(srgVar), d4c.S(ccf.a), d4c.S(srgVar)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        String str;
        int i;
        int i2;
        String str2;
        SdkTaskPatch sdkTaskPatch;
        String str3;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = SdkSystemEvent.$childSerializers;
        SdkTaskPatch sdkTaskPatch2 = null;
        String str4 = null;
        List list = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        int i3 = 0;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        String str12 = null;
        String str13 = null;
        SdkTaskUsage sdkTaskUsage = null;
        boolean z = true;
        String strV = null;
        String strV2 = null;
        String str14 = null;
        String str15 = null;
        String str16 = null;
        List list2 = null;
        Integer num = null;
        Integer num2 = null;
        String str17 = null;
        String str18 = null;
        String str19 = null;
        String str20 = null;
        String str21 = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            switch (iX) {
                case -1:
                    str2 = str4;
                    z = false;
                    str8 = str8;
                    str4 = str2;
                    break;
                case 0:
                    sdkTaskPatch = sdkTaskPatch2;
                    str2 = str4;
                    str3 = str8;
                    strV = ud4VarC.v(serialDescriptor, 0);
                    i3 |= 1;
                    str8 = str3;
                    sdkTaskPatch2 = sdkTaskPatch;
                    str4 = str2;
                    break;
                case 1:
                    sdkTaskPatch = sdkTaskPatch2;
                    str2 = str4;
                    strV2 = ud4VarC.v(serialDescriptor, 1);
                    i3 |= 2;
                    sdkTaskPatch2 = sdkTaskPatch;
                    str4 = str2;
                    break;
                case 2:
                    sdkTaskPatch = sdkTaskPatch2;
                    str2 = str4;
                    str3 = str8;
                    str14 = (String) ud4VarC.m(serialDescriptor, 2, srg.a, str14);
                    i3 |= 4;
                    str8 = str3;
                    sdkTaskPatch2 = sdkTaskPatch;
                    str4 = str2;
                    break;
                case 3:
                    sdkTaskPatch = sdkTaskPatch2;
                    str2 = str4;
                    str3 = str8;
                    str15 = (String) ud4VarC.m(serialDescriptor, 3, srg.a, str15);
                    i3 |= 8;
                    str8 = str3;
                    sdkTaskPatch2 = sdkTaskPatch;
                    str4 = str2;
                    break;
                case 4:
                    sdkTaskPatch = sdkTaskPatch2;
                    str2 = str4;
                    str3 = str8;
                    str16 = (String) ud4VarC.m(serialDescriptor, 4, srg.a, str16);
                    i3 |= 16;
                    str8 = str3;
                    sdkTaskPatch2 = sdkTaskPatch;
                    str4 = str2;
                    break;
                case 5:
                    sdkTaskPatch = sdkTaskPatch2;
                    str2 = str4;
                    str3 = str8;
                    list2 = (List) ud4VarC.l(serialDescriptor, 5, (s06) kw9VarArr[5].getValue(), list2);
                    i3 |= 32;
                    str8 = str3;
                    sdkTaskPatch2 = sdkTaskPatch;
                    str4 = str2;
                    break;
                case 6:
                    sdkTaskPatch = sdkTaskPatch2;
                    str2 = str4;
                    str3 = str8;
                    num = (Integer) ud4VarC.m(serialDescriptor, 6, e79.a, num);
                    i3 |= 64;
                    str8 = str3;
                    sdkTaskPatch2 = sdkTaskPatch;
                    str4 = str2;
                    break;
                case 7:
                    sdkTaskPatch = sdkTaskPatch2;
                    str2 = str4;
                    str3 = str8;
                    num2 = (Integer) ud4VarC.m(serialDescriptor, 7, e79.a, num2);
                    i3 |= FreeTypeConstants.FT_LOAD_PEDANTIC;
                    str8 = str3;
                    sdkTaskPatch2 = sdkTaskPatch;
                    str4 = str2;
                    break;
                case 8:
                    sdkTaskPatch = sdkTaskPatch2;
                    str2 = str4;
                    str3 = str8;
                    str17 = (String) ud4VarC.m(serialDescriptor, 8, srg.a, str17);
                    i3 |= FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING;
                    str8 = str3;
                    sdkTaskPatch2 = sdkTaskPatch;
                    str4 = str2;
                    break;
                case 9:
                    sdkTaskPatch = sdkTaskPatch2;
                    str2 = str4;
                    str3 = str8;
                    str18 = (String) ud4VarC.m(serialDescriptor, 9, srg.a, str18);
                    i3 |= 512;
                    str8 = str3;
                    sdkTaskPatch2 = sdkTaskPatch;
                    str4 = str2;
                    break;
                case 10:
                    sdkTaskPatch = sdkTaskPatch2;
                    str2 = str4;
                    str3 = str8;
                    str19 = (String) ud4VarC.m(serialDescriptor, 10, srg.a, str19);
                    i3 |= FreeTypeConstants.FT_LOAD_NO_RECURSE;
                    str8 = str3;
                    sdkTaskPatch2 = sdkTaskPatch;
                    str4 = str2;
                    break;
                case 11:
                    sdkTaskPatch = sdkTaskPatch2;
                    str2 = str4;
                    str3 = str8;
                    str20 = (String) ud4VarC.m(serialDescriptor, 11, srg.a, str20);
                    i3 |= FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM;
                    str8 = str3;
                    sdkTaskPatch2 = sdkTaskPatch;
                    str4 = str2;
                    break;
                case 12:
                    sdkTaskPatch = sdkTaskPatch2;
                    str2 = str4;
                    str3 = str8;
                    str21 = (String) ud4VarC.m(serialDescriptor, 12, srg.a, str21);
                    i3 |= FreeTypeConstants.FT_LOAD_MONOCHROME;
                    str8 = str3;
                    sdkTaskPatch2 = sdkTaskPatch;
                    str4 = str2;
                    break;
                case 13:
                    sdkTaskPatch = sdkTaskPatch2;
                    str2 = str4;
                    str8 = (String) ud4VarC.m(serialDescriptor, 13, srg.a, str8);
                    i3 |= FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
                    sdkTaskPatch2 = sdkTaskPatch;
                    str4 = str2;
                    break;
                case 14:
                    str = str8;
                    str9 = (String) ud4VarC.m(serialDescriptor, 14, srg.a, str9);
                    i3 |= 16384;
                    str8 = str;
                    break;
                case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                    i = i3;
                    str = str8;
                    str10 = (String) ud4VarC.m(serialDescriptor, 15, srg.a, str10);
                    i2 = FreeTypeConstants.FT_LOAD_NO_AUTOHINT;
                    i3 = i | i2;
                    str8 = str;
                    break;
                case 16:
                    i = i3;
                    str = str8;
                    str11 = (String) ud4VarC.m(serialDescriptor, 16, srg.a, str11);
                    i2 = 65536;
                    i3 = i | i2;
                    str8 = str;
                    break;
                case g.MAX_FIELD_NUMBER /* 17 */:
                    i = i3;
                    str = str8;
                    str12 = (String) ud4VarC.m(serialDescriptor, 17, srg.a, str12);
                    i2 = 131072;
                    i3 = i | i2;
                    str8 = str;
                    break;
                case g.AVG_FIELD_NUMBER /* 18 */:
                    i = i3;
                    str = str8;
                    str13 = (String) ud4VarC.m(serialDescriptor, 18, srg.a, str13);
                    i2 = 262144;
                    i3 = i | i2;
                    str8 = str;
                    break;
                case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                    i = i3;
                    str = str8;
                    sdkTaskUsage = (SdkTaskUsage) ud4VarC.m(serialDescriptor, 19, ecf.a, sdkTaskUsage);
                    i2 = 524288;
                    i3 = i | i2;
                    str8 = str;
                    break;
                case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                    i = i3;
                    str = str8;
                    str7 = (String) ud4VarC.m(serialDescriptor, 20, srg.a, str7);
                    i2 = FreeTypeConstants.FT_LOAD_COLOR;
                    i3 = i | i2;
                    str8 = str;
                    break;
                case 21:
                    i = i3;
                    str = str8;
                    str5 = (String) ud4VarC.m(serialDescriptor, 21, srg.a, str5);
                    i2 = FreeTypeConstants.FT_LOAD_COMPUTE_METRICS;
                    i3 = i | i2;
                    str8 = str;
                    break;
                case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                    i = i3;
                    str = str8;
                    list = (List) ud4VarC.m(serialDescriptor, 22, (s06) kw9VarArr[22].getValue(), list);
                    i2 = 4194304;
                    i3 = i | i2;
                    str8 = str;
                    break;
                case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                    i = i3;
                    str = str8;
                    str4 = (String) ud4VarC.m(serialDescriptor, 23, srg.a, str4);
                    i2 = 8388608;
                    i3 = i | i2;
                    str8 = str;
                    break;
                case 24:
                    i = i3;
                    str = str8;
                    sdkTaskPatch2 = (SdkTaskPatch) ud4VarC.m(serialDescriptor, 24, ccf.a, sdkTaskPatch2);
                    i2 = 16777216;
                    i3 = i | i2;
                    str8 = str;
                    break;
                case BuildConfig.VERSION_CODE /* 25 */:
                    str = str8;
                    i = i3;
                    str6 = (String) ud4VarC.m(serialDescriptor, 25, srg.a, str6);
                    i2 = 33554432;
                    i3 = i | i2;
                    str8 = str;
                    break;
                default:
                    sz6.e(iX);
                    return null;
            }
        }
        String str22 = str4;
        String str23 = str8;
        String str24 = str14;
        ud4VarC.b(serialDescriptor);
        Integer num3 = num2;
        String str25 = str18;
        String str26 = str12;
        SdkTaskUsage sdkTaskUsage2 = sdkTaskUsage;
        return new SdkSystemEvent(i3, strV, strV2, str24, str15, str16, list2, num, num3, str17, str25, str19, str20, str21, str23, str9, str10, str11, str26, str13, sdkTaskUsage2, str7, str5, list, str22, sdkTaskPatch2, str6, null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        SdkSystemEvent sdkSystemEvent = (SdkSystemEvent) obj;
        encoder.getClass();
        sdkSystemEvent.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        SdkSystemEvent.write$Self$sessions(sdkSystemEvent, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
