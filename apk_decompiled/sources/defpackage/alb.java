package defpackage;

import com.anthropic.claude.analytics.events.MobileAppFeedbackEvents$CreateFeedback;
import com.anthropic.claude.analytics.events.MobileAppFeedbackEvents$FeedbackType;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class alb implements w28 {
    public static final alb a;
    private static final SerialDescriptor descriptor;

    static {
        alb albVar = new alb();
        a = albVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("mobile_app_feedback", albVar, 2);
        pluginGeneratedSerialDescriptor.j("type", false);
        pluginGeneratedSerialDescriptor.j("message", false);
        pluginGeneratedSerialDescriptor.k(new pi(28));
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{MobileAppFeedbackEvents$CreateFeedback.$childSerializers[0].getValue(), srg.a};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = MobileAppFeedbackEvents$CreateFeedback.$childSerializers;
        vnf vnfVar = null;
        boolean z = true;
        int i = 0;
        MobileAppFeedbackEvents$FeedbackType mobileAppFeedbackEvents$FeedbackType = null;
        String strV = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                mobileAppFeedbackEvents$FeedbackType = (MobileAppFeedbackEvents$FeedbackType) ud4VarC.l(serialDescriptor, 0, (s06) kw9VarArr[0].getValue(), mobileAppFeedbackEvents$FeedbackType);
                i |= 1;
            } else {
                if (iX != 1) {
                    sz6.e(iX);
                    return null;
                }
                strV = ud4VarC.v(serialDescriptor, 1);
                i |= 2;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new MobileAppFeedbackEvents$CreateFeedback(i, mobileAppFeedbackEvents$FeedbackType, strV, vnfVar);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        MobileAppFeedbackEvents$CreateFeedback mobileAppFeedbackEvents$CreateFeedback = (MobileAppFeedbackEvents$CreateFeedback) obj;
        encoder.getClass();
        mobileAppFeedbackEvents$CreateFeedback.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        MobileAppFeedbackEvents$CreateFeedback.write$Self$analytics(mobileAppFeedbackEvents$CreateFeedback, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
