package defpackage;

import com.anthropic.claude.tool.model.PlacesMapDisplayV0OutputEnrichedPlacesValuePhotosItem;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a4d implements w28 {
    public static final a4d a;
    private static final SerialDescriptor descriptor;

    static {
        a4d a4dVar = new a4d();
        a = a4dVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.tool.model.PlacesMapDisplayV0OutputEnrichedPlacesValuePhotosItem", a4dVar, 2);
        pluginGeneratedSerialDescriptor.j("attributions", true);
        pluginGeneratedSerialDescriptor.j("url", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{d4c.S((KSerializer) PlacesMapDisplayV0OutputEnrichedPlacesValuePhotosItem.$childSerializers[0].getValue()), srg.a};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = PlacesMapDisplayV0OutputEnrichedPlacesValuePhotosItem.$childSerializers;
        vnf vnfVar = null;
        boolean z = true;
        int i = 0;
        List list = null;
        String strV = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                list = (List) ud4VarC.m(serialDescriptor, 0, (s06) kw9VarArr[0].getValue(), list);
                i |= 1;
            } else {
                if (iX != 1) {
                    sz6.e(iX);
                    return null;
                }
                strV = ud4VarC.v(serialDescriptor, 1);
                i |= 2;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new PlacesMapDisplayV0OutputEnrichedPlacesValuePhotosItem(i, list, strV, vnfVar);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        PlacesMapDisplayV0OutputEnrichedPlacesValuePhotosItem placesMapDisplayV0OutputEnrichedPlacesValuePhotosItem = (PlacesMapDisplayV0OutputEnrichedPlacesValuePhotosItem) obj;
        encoder.getClass();
        placesMapDisplayV0OutputEnrichedPlacesValuePhotosItem.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        PlacesMapDisplayV0OutputEnrichedPlacesValuePhotosItem.write$Self$Claude_tool_model(placesMapDisplayV0OutputEnrichedPlacesValuePhotosItem, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
