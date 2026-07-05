package defpackage;

import com.anthropic.claude.tool.model.PlacesMapDisplayV0Input;
import com.anthropic.claude.tool.model.PlacesMapDisplayV0InputMode;
import com.anthropic.claude.tool.model.PlacesMapDisplayV0InputTravelMode;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k3d implements w28 {
    public static final k3d a;
    private static final SerialDescriptor descriptor;

    static {
        k3d k3dVar = new k3d();
        a = k3dVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.tool.model.PlacesMapDisplayV0Input", k3dVar, 7);
        pluginGeneratedSerialDescriptor.j("days", true);
        pluginGeneratedSerialDescriptor.j("locations", true);
        pluginGeneratedSerialDescriptor.j("mode", true);
        pluginGeneratedSerialDescriptor.j("narrative", true);
        pluginGeneratedSerialDescriptor.j("show_route", true);
        pluginGeneratedSerialDescriptor.j("title", true);
        pluginGeneratedSerialDescriptor.j("travel_mode", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        kw9[] kw9VarArr = PlacesMapDisplayV0Input.$childSerializers;
        KSerializer kSerializerS = d4c.S((KSerializer) kw9VarArr[0].getValue());
        KSerializer kSerializerS2 = d4c.S((KSerializer) kw9VarArr[1].getValue());
        KSerializer kSerializerS3 = d4c.S(t3d.d);
        srg srgVar = srg.a;
        return new KSerializer[]{kSerializerS, kSerializerS2, kSerializerS3, d4c.S(srgVar), d4c.S(zt1.a), d4c.S(srgVar), d4c.S(v3d.d)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = PlacesMapDisplayV0Input.$childSerializers;
        Object obj = null;
        boolean z = true;
        int i = 0;
        List list = null;
        List list2 = null;
        PlacesMapDisplayV0InputMode placesMapDisplayV0InputMode = null;
        String str = null;
        Boolean bool = null;
        String str2 = null;
        PlacesMapDisplayV0InputTravelMode placesMapDisplayV0InputTravelMode = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            switch (iX) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    list = (List) ud4VarC.m(serialDescriptor, 0, (s06) kw9VarArr[0].getValue(), list);
                    i |= 1;
                    break;
                case 1:
                    list2 = (List) ud4VarC.m(serialDescriptor, 1, (s06) kw9VarArr[1].getValue(), list2);
                    i |= 2;
                    break;
                case 2:
                    placesMapDisplayV0InputMode = (PlacesMapDisplayV0InputMode) ud4VarC.m(serialDescriptor, 2, t3d.d, placesMapDisplayV0InputMode);
                    i |= 4;
                    break;
                case 3:
                    str = (String) ud4VarC.m(serialDescriptor, 3, srg.a, str);
                    i |= 8;
                    break;
                case 4:
                    bool = (Boolean) ud4VarC.m(serialDescriptor, 4, zt1.a, bool);
                    i |= 16;
                    break;
                case 5:
                    str2 = (String) ud4VarC.m(serialDescriptor, 5, srg.a, str2);
                    i |= 32;
                    break;
                case 6:
                    placesMapDisplayV0InputTravelMode = (PlacesMapDisplayV0InputTravelMode) ud4VarC.m(serialDescriptor, 6, v3d.d, placesMapDisplayV0InputTravelMode);
                    i |= 64;
                    break;
                default:
                    sz6.e(iX);
                    return obj;
            }
            obj = null;
        }
        ud4VarC.b(serialDescriptor);
        return new PlacesMapDisplayV0Input(i, list, list2, placesMapDisplayV0InputMode, str, bool, str2, placesMapDisplayV0InputTravelMode, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        PlacesMapDisplayV0Input placesMapDisplayV0Input = (PlacesMapDisplayV0Input) obj;
        encoder.getClass();
        placesMapDisplayV0Input.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        PlacesMapDisplayV0Input.write$Self$Claude_tool_model(placesMapDisplayV0Input, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
