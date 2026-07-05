package defpackage;

import com.anthropic.claude.tool.model.UserLocationV0OutputUserLocationResultGeocoded;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class tni implements w28 {
    public static final tni a;
    private static final SerialDescriptor descriptor;

    static {
        tni tniVar = new tni();
        a = tniVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.tool.model.UserLocationV0OutputUserLocationResultGeocoded", tniVar, 7);
        pluginGeneratedSerialDescriptor.j("address", true);
        pluginGeneratedSerialDescriptor.j("administrative_area", true);
        pluginGeneratedSerialDescriptor.j("country", true);
        pluginGeneratedSerialDescriptor.j("locality", true);
        pluginGeneratedSerialDescriptor.j("name", true);
        pluginGeneratedSerialDescriptor.j("postal_code", true);
        pluginGeneratedSerialDescriptor.j("sub_locality", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        srg srgVar = srg.a;
        return new KSerializer[]{d4c.S(srgVar), d4c.S(srgVar), d4c.S(srgVar), d4c.S(srgVar), d4c.S(srgVar), d4c.S(srgVar), d4c.S(srgVar)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            switch (iX) {
                case -1:
                    z = false;
                    break;
                case 0:
                    str = (String) ud4VarC.m(serialDescriptor, 0, srg.a, str);
                    i |= 1;
                    break;
                case 1:
                    str2 = (String) ud4VarC.m(serialDescriptor, 1, srg.a, str2);
                    i |= 2;
                    break;
                case 2:
                    str3 = (String) ud4VarC.m(serialDescriptor, 2, srg.a, str3);
                    i |= 4;
                    break;
                case 3:
                    str4 = (String) ud4VarC.m(serialDescriptor, 3, srg.a, str4);
                    i |= 8;
                    break;
                case 4:
                    str5 = (String) ud4VarC.m(serialDescriptor, 4, srg.a, str5);
                    i |= 16;
                    break;
                case 5:
                    str6 = (String) ud4VarC.m(serialDescriptor, 5, srg.a, str6);
                    i |= 32;
                    break;
                case 6:
                    str7 = (String) ud4VarC.m(serialDescriptor, 6, srg.a, str7);
                    i |= 64;
                    break;
                default:
                    sz6.e(iX);
                    return null;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new UserLocationV0OutputUserLocationResultGeocoded(i, str, str2, str3, str4, str5, str6, str7, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        UserLocationV0OutputUserLocationResultGeocoded userLocationV0OutputUserLocationResultGeocoded = (UserLocationV0OutputUserLocationResultGeocoded) obj;
        encoder.getClass();
        userLocationV0OutputUserLocationResultGeocoded.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        UserLocationV0OutputUserLocationResultGeocoded.write$Self$Claude_tool_model(userLocationV0OutputUserLocationResultGeocoded, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
