package defpackage;

import com.anthropic.claude.analytics.events.AppIntentEvents$AppIntentStart;
import com.anthropic.claude.analytics.events.AppIntentEvents$AppIntentType;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class tj0 implements w28 {
    public static final tj0 a;
    private static final SerialDescriptor descriptor;

    static {
        tj0 tj0Var = new tj0();
        a = tj0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("mobile_app_intent_start", tj0Var, 2);
        pluginGeneratedSerialDescriptor.j("intent_type", false);
        pluginGeneratedSerialDescriptor.j("app_intent_session_id", false);
        pluginGeneratedSerialDescriptor.k(new pi(5));
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{AppIntentEvents$AppIntentStart.$childSerializers[0].getValue(), srg.a};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        kw9[] kw9VarArr = AppIntentEvents$AppIntentStart.$childSerializers;
        vnf vnfVar = null;
        boolean z = true;
        int i = 0;
        AppIntentEvents$AppIntentType appIntentEvents$AppIntentType = null;
        String strV = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                appIntentEvents$AppIntentType = (AppIntentEvents$AppIntentType) ud4VarC.l(serialDescriptor, 0, (s06) kw9VarArr[0].getValue(), appIntentEvents$AppIntentType);
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
        return new AppIntentEvents$AppIntentStart(i, appIntentEvents$AppIntentType, strV, vnfVar);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        AppIntentEvents$AppIntentStart appIntentEvents$AppIntentStart = (AppIntentEvents$AppIntentStart) obj;
        encoder.getClass();
        appIntentEvents$AppIntentStart.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        AppIntentEvents$AppIntentStart.write$Self$analytics(appIntentEvents$AppIntentStart, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
