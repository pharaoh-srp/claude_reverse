package defpackage;

import com.anthropic.claude.tool.model.EventSearchV0OutputEventSearchResult;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s07 implements w28 {
    public static final s07 a;
    private static final SerialDescriptor descriptor;

    static {
        s07 s07Var = new s07();
        a = s07Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("success", s07Var, 1);
        pluginGeneratedSerialDescriptor.j("calendar_events", false);
        pluginGeneratedSerialDescriptor.k(new gl0(1));
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{EventSearchV0OutputEventSearchResult.$childSerializers[0].getValue()};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = EventSearchV0OutputEventSearchResult.$childSerializers;
        vnf vnfVar = null;
        boolean z = true;
        int i = 0;
        List list = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else {
                if (iX != 0) {
                    sz6.e(iX);
                    return null;
                }
                list = (List) ud4VarC.l(serialDescriptor, 0, (s06) kw9VarArr[0].getValue(), list);
                i = 1;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new EventSearchV0OutputEventSearchResult(i, list, vnfVar);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        EventSearchV0OutputEventSearchResult eventSearchV0OutputEventSearchResult = (EventSearchV0OutputEventSearchResult) obj;
        encoder.getClass();
        eventSearchV0OutputEventSearchResult.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        vd4VarC.r(serialDescriptor, 0, (znf) EventSearchV0OutputEventSearchResult.$childSerializers[0].getValue(), eventSearchV0OutputEventSearchResult.calendar_events);
        vd4VarC.b(serialDescriptor);
    }
}
