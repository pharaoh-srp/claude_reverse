package defpackage;

import com.anthropic.claude.tool.model.MapDisplayV0InputMarkersItem;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ura implements w28 {
    public static final ura a;
    private static final SerialDescriptor descriptor;

    static {
        ura uraVar = new ura();
        a = uraVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.tool.model.MapDisplayV0InputMarkersItem", uraVar, 4);
        pluginGeneratedSerialDescriptor.j("label", true);
        pluginGeneratedSerialDescriptor.j("latitude", false);
        pluginGeneratedSerialDescriptor.j("longitude", false);
        pluginGeneratedSerialDescriptor.j("title", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        srg srgVar = srg.a;
        na6 na6Var = na6.a;
        return new KSerializer[]{d4c.S(srgVar), na6Var, na6Var, srgVar};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        int i = 0;
        String str = null;
        String strV = null;
        double dZ = 0.0d;
        double dZ2 = 0.0d;
        boolean z = true;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                str = (String) ud4VarC.m(serialDescriptor, 0, srg.a, str);
                i |= 1;
            } else if (iX == 1) {
                dZ = ud4VarC.z(serialDescriptor, 1);
                i |= 2;
            } else if (iX == 2) {
                dZ2 = ud4VarC.z(serialDescriptor, 2);
                i |= 4;
            } else {
                if (iX != 3) {
                    sz6.e(iX);
                    return null;
                }
                strV = ud4VarC.v(serialDescriptor, 3);
                i |= 8;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new MapDisplayV0InputMarkersItem(i, str, dZ, dZ2, strV, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        MapDisplayV0InputMarkersItem mapDisplayV0InputMarkersItem = (MapDisplayV0InputMarkersItem) obj;
        encoder.getClass();
        mapDisplayV0InputMarkersItem.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        MapDisplayV0InputMarkersItem.write$Self$Claude_tool_model(mapDisplayV0InputMarkersItem, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
