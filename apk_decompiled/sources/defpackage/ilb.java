package defpackage;

import com.anthropic.claude.analytics.events.MobileAppUseEvents$MobileAppUseChartCopied;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ilb implements w28 {
    public static final ilb a;
    private static final SerialDescriptor descriptor;

    static {
        ilb ilbVar = new ilb();
        a = ilbVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("mobile_app_use_chart_copied", ilbVar, 0);
        pluginGeneratedSerialDescriptor.k(new pi(29));
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[0];
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        int iX = ud4VarC.x(serialDescriptor);
        vnf vnfVar = null;
        if (iX == -1) {
            ud4VarC.b(serialDescriptor);
            return new MobileAppUseEvents$MobileAppUseChartCopied(0, vnfVar);
        }
        sz6.e(iX);
        return null;
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        MobileAppUseEvents$MobileAppUseChartCopied mobileAppUseEvents$MobileAppUseChartCopied = (MobileAppUseEvents$MobileAppUseChartCopied) obj;
        encoder.getClass();
        mobileAppUseEvents$MobileAppUseChartCopied.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        MobileAppUseEvents$MobileAppUseChartCopied.write$Self$analytics(mobileAppUseEvents$MobileAppUseChartCopied, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
