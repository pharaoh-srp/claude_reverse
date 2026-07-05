package defpackage;

import com.anthropic.claude.tool.model.PlacesMapDisplayV0OutputEnrichedPlacesValuePhotosItemAttributionsItem;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class c4d implements w28 {
    public static final c4d a;
    private static final SerialDescriptor descriptor;

    static {
        c4d c4dVar = new c4d();
        a = c4dVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.tool.model.PlacesMapDisplayV0OutputEnrichedPlacesValuePhotosItemAttributionsItem", c4dVar, 3);
        pluginGeneratedSerialDescriptor.j("display_name", false);
        pluginGeneratedSerialDescriptor.j("photo_uri", true);
        pluginGeneratedSerialDescriptor.j("uri", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        srg srgVar = srg.a;
        return new KSerializer[]{srgVar, d4c.S(srgVar), d4c.S(srgVar)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        boolean z = true;
        int i = 0;
        String strV = null;
        String str = null;
        String str2 = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                strV = ud4VarC.v(serialDescriptor, 0);
                i |= 1;
            } else if (iX == 1) {
                str = (String) ud4VarC.m(serialDescriptor, 1, srg.a, str);
                i |= 2;
            } else {
                if (iX != 2) {
                    sz6.e(iX);
                    return null;
                }
                str2 = (String) ud4VarC.m(serialDescriptor, 2, srg.a, str2);
                i |= 4;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new PlacesMapDisplayV0OutputEnrichedPlacesValuePhotosItemAttributionsItem(i, strV, str, str2, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        PlacesMapDisplayV0OutputEnrichedPlacesValuePhotosItemAttributionsItem placesMapDisplayV0OutputEnrichedPlacesValuePhotosItemAttributionsItem = (PlacesMapDisplayV0OutputEnrichedPlacesValuePhotosItemAttributionsItem) obj;
        encoder.getClass();
        placesMapDisplayV0OutputEnrichedPlacesValuePhotosItemAttributionsItem.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        PlacesMapDisplayV0OutputEnrichedPlacesValuePhotosItemAttributionsItem.write$Self$Claude_tool_model(placesMapDisplayV0OutputEnrichedPlacesValuePhotosItemAttributionsItem, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
