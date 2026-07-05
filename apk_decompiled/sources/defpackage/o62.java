package defpackage;

import com.anthropic.claude.tool.model.CalendarCreatePreviewData;
import com.anthropic.claude.tool.model.EventCreateV1Input;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o62 implements w28 {
    public static final o62 a;
    private static final SerialDescriptor descriptor;

    static {
        o62 o62Var = new o62();
        a = o62Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.tool.model.CalendarCreatePreviewData", o62Var, 1);
        pluginGeneratedSerialDescriptor.j("input", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{ow6.a};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        vnf vnfVar = null;
        boolean z = true;
        int i = 0;
        EventCreateV1Input eventCreateV1Input = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else {
                if (iX != 0) {
                    sz6.e(iX);
                    return null;
                }
                eventCreateV1Input = (EventCreateV1Input) ud4VarC.l(serialDescriptor, 0, ow6.a, eventCreateV1Input);
                i = 1;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new CalendarCreatePreviewData(i, eventCreateV1Input, vnfVar);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        CalendarCreatePreviewData calendarCreatePreviewData = (CalendarCreatePreviewData) obj;
        encoder.getClass();
        calendarCreatePreviewData.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        vd4VarC.r(serialDescriptor, 0, ow6.a, calendarCreatePreviewData.input);
        vd4VarC.b(serialDescriptor);
    }
}
