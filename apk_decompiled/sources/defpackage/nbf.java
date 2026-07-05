package defpackage;

import com.anthropic.claude.sessions.types.SdkMessage;
import com.anthropic.claude.sessions.types.SdkMessageEvent;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.json.JsonElement;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class nbf implements w28 {
    public static final nbf a;
    private static final SerialDescriptor descriptor;

    static {
        nbf nbfVar = new nbf();
        a = nbfVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.sessions.types.SdkMessageEvent", nbfVar, 13);
        pluginGeneratedSerialDescriptor.j("type", false);
        pluginGeneratedSerialDescriptor.j("uuid", false);
        pluginGeneratedSerialDescriptor.j("session_id", true);
        pluginGeneratedSerialDescriptor.j("parent_tool_use_id", true);
        pluginGeneratedSerialDescriptor.j("message", false);
        pluginGeneratedSerialDescriptor.j("tool_use_result", true);
        pluginGeneratedSerialDescriptor.j("isMeta", true);
        pluginGeneratedSerialDescriptor.j("isSynthetic", true);
        pluginGeneratedSerialDescriptor.j("isReplay", true);
        pluginGeneratedSerialDescriptor.j("error", true);
        pluginGeneratedSerialDescriptor.j("file_attachments", true);
        pluginGeneratedSerialDescriptor.j("created_at", true);
        pluginGeneratedSerialDescriptor.j("tool_use_meta", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        kw9[] kw9VarArr = SdkMessageEvent.$childSerializers;
        srg srgVar = srg.a;
        KSerializer kSerializerS = d4c.S(srgVar);
        KSerializer kSerializerS2 = d4c.S(srgVar);
        KSerializer kSerializerS3 = d4c.S(eh9.a);
        zt1 zt1Var = zt1.a;
        return new KSerializer[]{srgVar, srgVar, kSerializerS, kSerializerS2, pbf.c, kSerializerS3, d4c.S(zt1Var), d4c.S(zt1Var), d4c.S(zt1Var), d4c.S(srgVar), d4c.S((KSerializer) kw9VarArr[10].getValue()), d4c.S(srgVar), d4c.S((KSerializer) kw9VarArr[12].getValue())};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        String str;
        String str2;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = SdkMessageEvent.$childSerializers;
        String str3 = null;
        List list = null;
        String str4 = null;
        Boolean bool = null;
        List list2 = null;
        Boolean bool2 = null;
        int i = 0;
        String strV = null;
        String strV2 = null;
        String str5 = null;
        String str6 = null;
        SdkMessage sdkMessage = null;
        JsonElement jsonElement = null;
        Boolean bool3 = null;
        boolean z = true;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            switch (iX) {
                case -1:
                    str = strV2;
                    z = false;
                    strV2 = str;
                    break;
                case 0:
                    str = strV2;
                    i |= 1;
                    strV = ud4VarC.v(serialDescriptor, 0);
                    strV2 = str;
                    break;
                case 1:
                    strV2 = ud4VarC.v(serialDescriptor, 1);
                    i |= 2;
                    strV = strV;
                    break;
                case 2:
                    str2 = strV;
                    str = strV2;
                    str5 = (String) ud4VarC.m(serialDescriptor, 2, srg.a, str5);
                    i |= 4;
                    strV = str2;
                    strV2 = str;
                    break;
                case 3:
                    str2 = strV;
                    str = strV2;
                    str6 = (String) ud4VarC.m(serialDescriptor, 3, srg.a, str6);
                    i |= 8;
                    strV = str2;
                    strV2 = str;
                    break;
                case 4:
                    str2 = strV;
                    str = strV2;
                    sdkMessage = (SdkMessage) ud4VarC.l(serialDescriptor, 4, pbf.c, sdkMessage);
                    i |= 16;
                    strV = str2;
                    strV2 = str;
                    break;
                case 5:
                    str2 = strV;
                    str = strV2;
                    jsonElement = (JsonElement) ud4VarC.m(serialDescriptor, 5, eh9.a, jsonElement);
                    i |= 32;
                    strV = str2;
                    strV2 = str;
                    break;
                case 6:
                    str2 = strV;
                    str = strV2;
                    bool3 = (Boolean) ud4VarC.m(serialDescriptor, 6, zt1.a, bool3);
                    i |= 64;
                    strV = str2;
                    strV2 = str;
                    break;
                case 7:
                    str2 = strV;
                    str = strV2;
                    bool2 = (Boolean) ud4VarC.m(serialDescriptor, 7, zt1.a, bool2);
                    i |= FreeTypeConstants.FT_LOAD_PEDANTIC;
                    strV = str2;
                    strV2 = str;
                    break;
                case 8:
                    str2 = strV;
                    str = strV2;
                    bool = (Boolean) ud4VarC.m(serialDescriptor, 8, zt1.a, bool);
                    i |= FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING;
                    strV = str2;
                    strV2 = str;
                    break;
                case 9:
                    str2 = strV;
                    str = strV2;
                    str4 = (String) ud4VarC.m(serialDescriptor, 9, srg.a, str4);
                    i |= 512;
                    strV = str2;
                    strV2 = str;
                    break;
                case 10:
                    str2 = strV;
                    str = strV2;
                    list = (List) ud4VarC.m(serialDescriptor, 10, (s06) kw9VarArr[10].getValue(), list);
                    i |= FreeTypeConstants.FT_LOAD_NO_RECURSE;
                    strV = str2;
                    strV2 = str;
                    break;
                case 11:
                    str2 = strV;
                    str = strV2;
                    str3 = (String) ud4VarC.m(serialDescriptor, 11, srg.a, str3);
                    i |= FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM;
                    strV = str2;
                    strV2 = str;
                    break;
                case 12:
                    str2 = strV;
                    str = strV2;
                    list2 = (List) ud4VarC.m(serialDescriptor, 12, (s06) kw9VarArr[12].getValue(), list2);
                    i |= FreeTypeConstants.FT_LOAD_MONOCHROME;
                    strV = str2;
                    strV2 = str;
                    break;
                default:
                    sz6.e(iX);
                    return null;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new SdkMessageEvent(i, strV, strV2, str5, str6, sdkMessage, jsonElement, bool3, bool2, bool, str4, list, str3, list2, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        SdkMessageEvent sdkMessageEvent = (SdkMessageEvent) obj;
        encoder.getClass();
        sdkMessageEvent.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        SdkMessageEvent.write$Self$sessions(sdkMessageEvent, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
