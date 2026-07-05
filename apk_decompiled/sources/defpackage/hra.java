package defpackage;

import com.anthropic.claude.models.organization.configtypes.MapDisplayMarkersArrayDescription;
import com.anthropic.claude.models.organization.configtypes.MapDisplayMarkersItemDescription;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hra implements w28 {
    public static final hra a;
    private static final SerialDescriptor descriptor;

    static {
        hra hraVar = new hra();
        a = hraVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.models.organization.configtypes.MapDisplayMarkersArrayDescription", hraVar, 2);
        pluginGeneratedSerialDescriptor.j("description", false);
        pluginGeneratedSerialDescriptor.j("items", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{srg.a, jra.a};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        vnf vnfVar = null;
        boolean z = true;
        int i = 0;
        String strV = null;
        MapDisplayMarkersItemDescription mapDisplayMarkersItemDescription = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                strV = ud4VarC.v(serialDescriptor, 0);
                i |= 1;
            } else {
                if (iX != 1) {
                    sz6.e(iX);
                    return null;
                }
                mapDisplayMarkersItemDescription = (MapDisplayMarkersItemDescription) ud4VarC.l(serialDescriptor, 1, jra.a, mapDisplayMarkersItemDescription);
                i |= 2;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new MapDisplayMarkersArrayDescription(i, strV, mapDisplayMarkersItemDescription, vnfVar);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        MapDisplayMarkersArrayDescription mapDisplayMarkersArrayDescription = (MapDisplayMarkersArrayDescription) obj;
        encoder.getClass();
        mapDisplayMarkersArrayDescription.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        MapDisplayMarkersArrayDescription.write$Self$models(mapDisplayMarkersArrayDescription, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
