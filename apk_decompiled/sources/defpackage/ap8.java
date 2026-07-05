package defpackage;

import com.anthropic.claude.mcpapps.transport.ContainerDimensions;
import com.anthropic.claude.mcpapps.transport.DeviceCapabilities;
import com.anthropic.claude.mcpapps.transport.HostContext;
import com.anthropic.claude.mcpapps.transport.SafeAreaInsets;
import com.anthropic.claude.mcpapps.transport.ToolInfo;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.json.JsonObject;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ap8 implements w28 {
    public static final ap8 a;
    private static final SerialDescriptor descriptor;

    static {
        ap8 ap8Var = new ap8();
        a = ap8Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.mcpapps.transport.HostContext", ap8Var, 12);
        pluginGeneratedSerialDescriptor.j("theme", true);
        pluginGeneratedSerialDescriptor.j("platform", true);
        pluginGeneratedSerialDescriptor.j("locale", true);
        pluginGeneratedSerialDescriptor.j("timeZone", true);
        pluginGeneratedSerialDescriptor.j("userAgent", true);
        pluginGeneratedSerialDescriptor.j("displayMode", true);
        pluginGeneratedSerialDescriptor.j("availableDisplayModes", true);
        pluginGeneratedSerialDescriptor.j("containerDimensions", true);
        pluginGeneratedSerialDescriptor.j("deviceCapabilities", true);
        pluginGeneratedSerialDescriptor.j("safeAreaInsets", true);
        pluginGeneratedSerialDescriptor.j("styles", true);
        pluginGeneratedSerialDescriptor.j("toolInfo", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        kw9[] kw9VarArr = HostContext.$childSerializers;
        srg srgVar = srg.a;
        return new KSerializer[]{d4c.S(srgVar), d4c.S(srgVar), d4c.S(srgVar), d4c.S(srgVar), d4c.S(srgVar), d4c.S(srgVar), d4c.S((KSerializer) kw9VarArr[6].getValue()), d4c.S(om4.a), d4c.S(k26.a), d4c.S(v2f.a), d4c.S(uh9.a), d4c.S(ixh.a)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        boolean z;
        String str;
        ToolInfo toolInfo;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = HostContext.$childSerializers;
        ToolInfo toolInfo2 = null;
        JsonObject jsonObject = null;
        SafeAreaInsets safeAreaInsets = null;
        DeviceCapabilities deviceCapabilities = null;
        boolean z2 = true;
        ContainerDimensions containerDimensions = null;
        int i = 0;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        List list = null;
        while (z2) {
            int iX = ud4VarC.x(serialDescriptor);
            switch (iX) {
                case -1:
                    toolInfo = toolInfo2;
                    z2 = false;
                    toolInfo2 = toolInfo;
                    break;
                case 0:
                    toolInfo = toolInfo2;
                    str2 = (String) ud4VarC.m(serialDescriptor, 0, srg.a, str2);
                    i |= 1;
                    z2 = z2;
                    toolInfo2 = toolInfo;
                    break;
                case 1:
                    z = z2;
                    str = str2;
                    str3 = (String) ud4VarC.m(serialDescriptor, 1, srg.a, str3);
                    i |= 2;
                    z2 = z;
                    str2 = str;
                    break;
                case 2:
                    z = z2;
                    str = str2;
                    str4 = (String) ud4VarC.m(serialDescriptor, 2, srg.a, str4);
                    i |= 4;
                    z2 = z;
                    str2 = str;
                    break;
                case 3:
                    z = z2;
                    str = str2;
                    str5 = (String) ud4VarC.m(serialDescriptor, 3, srg.a, str5);
                    i |= 8;
                    z2 = z;
                    str2 = str;
                    break;
                case 4:
                    z = z2;
                    str = str2;
                    str6 = (String) ud4VarC.m(serialDescriptor, 4, srg.a, str6);
                    i |= 16;
                    z2 = z;
                    str2 = str;
                    break;
                case 5:
                    z = z2;
                    str = str2;
                    str7 = (String) ud4VarC.m(serialDescriptor, 5, srg.a, str7);
                    i |= 32;
                    z2 = z;
                    str2 = str;
                    break;
                case 6:
                    z = z2;
                    str = str2;
                    list = (List) ud4VarC.m(serialDescriptor, 6, (s06) kw9VarArr[6].getValue(), list);
                    i |= 64;
                    z2 = z;
                    str2 = str;
                    break;
                case 7:
                    z = z2;
                    str = str2;
                    containerDimensions = (ContainerDimensions) ud4VarC.m(serialDescriptor, 7, om4.a, containerDimensions);
                    i |= FreeTypeConstants.FT_LOAD_PEDANTIC;
                    z2 = z;
                    str2 = str;
                    break;
                case 8:
                    z = z2;
                    str = str2;
                    deviceCapabilities = (DeviceCapabilities) ud4VarC.m(serialDescriptor, 8, k26.a, deviceCapabilities);
                    i |= FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING;
                    z2 = z;
                    str2 = str;
                    break;
                case 9:
                    z = z2;
                    str = str2;
                    safeAreaInsets = (SafeAreaInsets) ud4VarC.m(serialDescriptor, 9, v2f.a, safeAreaInsets);
                    i |= 512;
                    z2 = z;
                    str2 = str;
                    break;
                case 10:
                    z = z2;
                    str = str2;
                    jsonObject = (JsonObject) ud4VarC.m(serialDescriptor, 10, uh9.a, jsonObject);
                    i |= FreeTypeConstants.FT_LOAD_NO_RECURSE;
                    z2 = z;
                    str2 = str;
                    break;
                case 11:
                    z = z2;
                    str = str2;
                    toolInfo2 = (ToolInfo) ud4VarC.m(serialDescriptor, 11, ixh.a, toolInfo2);
                    i |= FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM;
                    z2 = z;
                    str2 = str;
                    break;
                default:
                    sz6.e(iX);
                    return null;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new HostContext(i, str2, str3, str4, str5, str6, str7, list, containerDimensions, deviceCapabilities, safeAreaInsets, jsonObject, toolInfo2, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        HostContext hostContext = (HostContext) obj;
        encoder.getClass();
        hostContext.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        HostContext.write$Self$Claude_mcpapp(hostContext, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
