package defpackage;

import com.anthropic.claude.tool.model.PlacesMapDisplayV0InputDaysItem;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class m3d implements w28 {
    public static final m3d a;
    private static final SerialDescriptor descriptor;

    static {
        m3d m3dVar = new m3d();
        a = m3dVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.tool.model.PlacesMapDisplayV0InputDaysItem", m3dVar, 4);
        pluginGeneratedSerialDescriptor.j("day_number", false);
        pluginGeneratedSerialDescriptor.j("locations", false);
        pluginGeneratedSerialDescriptor.j("narrative", true);
        pluginGeneratedSerialDescriptor.j("title", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        kw9[] kw9VarArr = PlacesMapDisplayV0InputDaysItem.$childSerializers;
        srg srgVar = srg.a;
        return new KSerializer[]{e79.a, kw9VarArr[1].getValue(), d4c.S(srgVar), d4c.S(srgVar)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = PlacesMapDisplayV0InputDaysItem.$childSerializers;
        boolean z = true;
        int i = 0;
        int iR = 0;
        List list = null;
        String str = null;
        String str2 = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                iR = ud4VarC.r(serialDescriptor, 0);
                i |= 1;
            } else if (iX == 1) {
                list = (List) ud4VarC.l(serialDescriptor, 1, (s06) kw9VarArr[1].getValue(), list);
                i |= 2;
            } else if (iX == 2) {
                str = (String) ud4VarC.m(serialDescriptor, 2, srg.a, str);
                i |= 4;
            } else {
                if (iX != 3) {
                    sz6.e(iX);
                    return null;
                }
                str2 = (String) ud4VarC.m(serialDescriptor, 3, srg.a, str2);
                i |= 8;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new PlacesMapDisplayV0InputDaysItem(i, iR, list, str, str2, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        PlacesMapDisplayV0InputDaysItem placesMapDisplayV0InputDaysItem = (PlacesMapDisplayV0InputDaysItem) obj;
        encoder.getClass();
        placesMapDisplayV0InputDaysItem.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        PlacesMapDisplayV0InputDaysItem.write$Self$Claude_tool_model(placesMapDisplayV0InputDaysItem, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
