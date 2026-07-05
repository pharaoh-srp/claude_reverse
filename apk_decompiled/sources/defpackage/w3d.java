package defpackage;

import com.anthropic.claude.tool.model.PlacesMapDisplayV0Output;
import java.util.Map;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class w3d implements w28 {
    public static final w3d a;
    private static final SerialDescriptor descriptor;

    static {
        w3d w3dVar = new w3d();
        a = w3dVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.tool.model.PlacesMapDisplayV0Output", w3dVar, 1);
        pluginGeneratedSerialDescriptor.j("enriched_places", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{d4c.S((KSerializer) PlacesMapDisplayV0Output.$childSerializers[0].getValue())};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = PlacesMapDisplayV0Output.$childSerializers;
        vnf vnfVar = null;
        boolean z = true;
        int i = 0;
        Map map = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else {
                if (iX != 0) {
                    sz6.e(iX);
                    return null;
                }
                map = (Map) ud4VarC.m(serialDescriptor, 0, (s06) kw9VarArr[0].getValue(), map);
                i = 1;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new PlacesMapDisplayV0Output(i, map, vnfVar);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        PlacesMapDisplayV0Output placesMapDisplayV0Output = (PlacesMapDisplayV0Output) obj;
        encoder.getClass();
        placesMapDisplayV0Output.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        PlacesMapDisplayV0Output.write$Self$Claude_tool_model(placesMapDisplayV0Output, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
