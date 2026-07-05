package defpackage;

import com.anthropic.claude.tool.model.EventDeleteV0OutputEventDeleteResultDeleteResultsItem;
import com.anthropic.claude.tool.model.EventDeleteV0OutputEventDeleteResultDeleteResultsItemError;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class bz6 implements w28 {
    public static final bz6 a;
    private static final SerialDescriptor descriptor;

    static {
        bz6 bz6Var = new bz6();
        a = bz6Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.tool.model.EventDeleteV0OutputEventDeleteResultDeleteResultsItem", bz6Var, 3);
        pluginGeneratedSerialDescriptor.j("calendar_id", false);
        pluginGeneratedSerialDescriptor.j("error", true);
        pluginGeneratedSerialDescriptor.j("event_id", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        KSerializer kSerializerS = d4c.S(dz6.a);
        srg srgVar = srg.a;
        return new KSerializer[]{srgVar, kSerializerS, srgVar};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        boolean z = true;
        int i = 0;
        String strV = null;
        EventDeleteV0OutputEventDeleteResultDeleteResultsItemError eventDeleteV0OutputEventDeleteResultDeleteResultsItemError = null;
        String strV2 = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                strV = ud4VarC.v(serialDescriptor, 0);
                i |= 1;
            } else if (iX == 1) {
                eventDeleteV0OutputEventDeleteResultDeleteResultsItemError = (EventDeleteV0OutputEventDeleteResultDeleteResultsItemError) ud4VarC.m(serialDescriptor, 1, dz6.a, eventDeleteV0OutputEventDeleteResultDeleteResultsItemError);
                i |= 2;
            } else {
                if (iX != 2) {
                    sz6.e(iX);
                    return null;
                }
                strV2 = ud4VarC.v(serialDescriptor, 2);
                i |= 4;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new EventDeleteV0OutputEventDeleteResultDeleteResultsItem(i, strV, eventDeleteV0OutputEventDeleteResultDeleteResultsItemError, strV2, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        EventDeleteV0OutputEventDeleteResultDeleteResultsItem eventDeleteV0OutputEventDeleteResultDeleteResultsItem = (EventDeleteV0OutputEventDeleteResultDeleteResultsItem) obj;
        encoder.getClass();
        eventDeleteV0OutputEventDeleteResultDeleteResultsItem.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        EventDeleteV0OutputEventDeleteResultDeleteResultsItem.write$Self$Claude_tool_model(eventDeleteV0OutputEventDeleteResultDeleteResultsItem, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
