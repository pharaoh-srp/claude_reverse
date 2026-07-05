package defpackage;

import com.anthropic.claude.tool.model.PlacesMapDisplayV0InputLocationsItem;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class q3d implements w28 {
    public static final q3d a;
    private static final SerialDescriptor descriptor;

    static {
        q3d q3dVar = new q3d();
        a = q3dVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.tool.model.PlacesMapDisplayV0InputLocationsItem", q3dVar, 7);
        pluginGeneratedSerialDescriptor.j("address", true);
        pluginGeneratedSerialDescriptor.j("arrival_time", true);
        pluginGeneratedSerialDescriptor.j("latitude", false);
        pluginGeneratedSerialDescriptor.j("longitude", false);
        pluginGeneratedSerialDescriptor.j("name", false);
        pluginGeneratedSerialDescriptor.j("notes", true);
        pluginGeneratedSerialDescriptor.j("place_id", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        srg srgVar = srg.a;
        KSerializer kSerializerS = d4c.S(srgVar);
        KSerializer kSerializerS2 = d4c.S(srgVar);
        KSerializer kSerializerS3 = d4c.S(srgVar);
        KSerializer kSerializerS4 = d4c.S(srgVar);
        na6 na6Var = na6.a;
        return new KSerializer[]{kSerializerS, kSerializerS2, na6Var, na6Var, srgVar, kSerializerS3, kSerializerS4};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        Object obj = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String strV = null;
        double dZ = 0.0d;
        double dZ2 = 0.0d;
        int i = 0;
        boolean z = true;
        String str4 = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            switch (iX) {
                case -1:
                    z = false;
                    break;
                case 0:
                    str2 = (String) ud4VarC.m(serialDescriptor, 0, srg.a, str2);
                    i |= 1;
                    break;
                case 1:
                    str3 = (String) ud4VarC.m(serialDescriptor, 1, srg.a, str3);
                    i |= 2;
                    break;
                case 2:
                    dZ = ud4VarC.z(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    dZ2 = ud4VarC.z(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    strV = ud4VarC.v(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    str4 = (String) ud4VarC.m(serialDescriptor, 5, srg.a, str4);
                    i |= 32;
                    break;
                case 6:
                    str = (String) ud4VarC.m(serialDescriptor, 6, srg.a, str);
                    i |= 64;
                    break;
                default:
                    sz6.e(iX);
                    return obj;
            }
            obj = null;
        }
        ud4VarC.b(serialDescriptor);
        return new PlacesMapDisplayV0InputLocationsItem(i, str2, str3, dZ, dZ2, strV, str4, str, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        PlacesMapDisplayV0InputLocationsItem placesMapDisplayV0InputLocationsItem = (PlacesMapDisplayV0InputLocationsItem) obj;
        encoder.getClass();
        placesMapDisplayV0InputLocationsItem.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        PlacesMapDisplayV0InputLocationsItem.write$Self$Claude_tool_model(placesMapDisplayV0InputLocationsItem, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
