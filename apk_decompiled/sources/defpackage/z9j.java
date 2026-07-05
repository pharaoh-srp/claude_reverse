package defpackage;

import com.anthropic.claude.analytics.events.WidgetEvents$OpenAppURLActionType;
import com.anthropic.claude.analytics.events.WidgetEvents$OpenAppViaURL;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class z9j implements w28 {
    public static final z9j a;
    private static final SerialDescriptor descriptor;

    static {
        z9j z9jVar = new z9j();
        a = z9jVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("open_app_via_widget", z9jVar, 2);
        pluginGeneratedSerialDescriptor.j("action_type", false);
        pluginGeneratedSerialDescriptor.j("conversation_uuid", true);
        pluginGeneratedSerialDescriptor.k(new xmb(22));
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{WidgetEvents$OpenAppViaURL.$childSerializers[0].getValue(), d4c.S(srg.a)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = WidgetEvents$OpenAppViaURL.$childSerializers;
        vnf vnfVar = null;
        boolean z = true;
        int i = 0;
        WidgetEvents$OpenAppURLActionType widgetEvents$OpenAppURLActionType = null;
        String str = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                widgetEvents$OpenAppURLActionType = (WidgetEvents$OpenAppURLActionType) ud4VarC.l(serialDescriptor, 0, (s06) kw9VarArr[0].getValue(), widgetEvents$OpenAppURLActionType);
                i |= 1;
            } else {
                if (iX != 1) {
                    sz6.e(iX);
                    return null;
                }
                str = (String) ud4VarC.m(serialDescriptor, 1, srg.a, str);
                i |= 2;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new WidgetEvents$OpenAppViaURL(i, widgetEvents$OpenAppURLActionType, str, vnfVar);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        WidgetEvents$OpenAppViaURL widgetEvents$OpenAppViaURL = (WidgetEvents$OpenAppViaURL) obj;
        encoder.getClass();
        widgetEvents$OpenAppViaURL.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        WidgetEvents$OpenAppViaURL.write$Self$analytics(widgetEvents$OpenAppViaURL, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
