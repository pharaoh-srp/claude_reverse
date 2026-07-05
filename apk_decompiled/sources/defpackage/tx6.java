package defpackage;

import com.anthropic.claude.tool.model.EventCreateV1OutputEventCreateV1ResultCreateResultsItem;
import com.anthropic.claude.tool.model.EventCreateV1OutputEventCreateV1ResultCreateResultsItemError;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class tx6 implements w28 {
    public static final tx6 a;
    private static final SerialDescriptor descriptor;

    static {
        tx6 tx6Var = new tx6();
        a = tx6Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.tool.model.EventCreateV1OutputEventCreateV1ResultCreateResultsItem", tx6Var, 3);
        pluginGeneratedSerialDescriptor.j("calendar_id", true);
        pluginGeneratedSerialDescriptor.j("error", true);
        pluginGeneratedSerialDescriptor.j("event_id", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        srg srgVar = srg.a;
        return new KSerializer[]{d4c.S(srgVar), d4c.S(vx6.a), d4c.S(srgVar)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        boolean z = true;
        int i = 0;
        String str = null;
        EventCreateV1OutputEventCreateV1ResultCreateResultsItemError eventCreateV1OutputEventCreateV1ResultCreateResultsItemError = null;
        String str2 = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                str = (String) ud4VarC.m(serialDescriptor, 0, srg.a, str);
                i |= 1;
            } else if (iX == 1) {
                eventCreateV1OutputEventCreateV1ResultCreateResultsItemError = (EventCreateV1OutputEventCreateV1ResultCreateResultsItemError) ud4VarC.m(serialDescriptor, 1, vx6.a, eventCreateV1OutputEventCreateV1ResultCreateResultsItemError);
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
        return new EventCreateV1OutputEventCreateV1ResultCreateResultsItem(i, str, eventCreateV1OutputEventCreateV1ResultCreateResultsItemError, str2, (vnf) null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        EventCreateV1OutputEventCreateV1ResultCreateResultsItem eventCreateV1OutputEventCreateV1ResultCreateResultsItem = (EventCreateV1OutputEventCreateV1ResultCreateResultsItem) obj;
        encoder.getClass();
        eventCreateV1OutputEventCreateV1ResultCreateResultsItem.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        EventCreateV1OutputEventCreateV1ResultCreateResultsItem.write$Self$Claude_tool_model(eventCreateV1OutputEventCreateV1ResultCreateResultsItem, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
