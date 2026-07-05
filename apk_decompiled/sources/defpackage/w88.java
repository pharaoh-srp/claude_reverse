package defpackage;

import com.anthropic.claude.analytics.ads.GooglePlayReferrer;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class w88 implements w28 {
    public static final w88 a;
    private static final SerialDescriptor descriptor;

    static {
        w88 w88Var = new w88();
        a = w88Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.anthropic.claude.analytics.ads.GooglePlayReferrer", w88Var, 5);
        pluginGeneratedSerialDescriptor.j("install_referrer", false);
        pluginGeneratedSerialDescriptor.j("referrer_click_timestamp_seconds", false);
        pluginGeneratedSerialDescriptor.j("install_begin_timestamp_seconds", false);
        pluginGeneratedSerialDescriptor.j("referrer_click_timestamp_server_seconds", false);
        pluginGeneratedSerialDescriptor.j("install_begin_timestamp_server_seconds", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        xka xkaVar = xka.a;
        return new KSerializer[]{srg.a, xkaVar, xkaVar, xkaVar, xkaVar};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        int i = 0;
        String strV = null;
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        long j4 = 0;
        boolean z = true;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else if (iX == 0) {
                strV = ud4VarC.v(serialDescriptor, 0);
                i |= 1;
            } else if (iX == 1) {
                j = ud4VarC.j(serialDescriptor, 1);
                i |= 2;
            } else if (iX == 2) {
                j2 = ud4VarC.j(serialDescriptor, 2);
                i |= 4;
            } else if (iX == 3) {
                j3 = ud4VarC.j(serialDescriptor, 3);
                i |= 8;
            } else {
                if (iX != 4) {
                    sz6.e(iX);
                    return null;
                }
                j4 = ud4VarC.j(serialDescriptor, 4);
                i |= 16;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new GooglePlayReferrer(i, strV, j, j2, j3, j4, null);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        GooglePlayReferrer googlePlayReferrer = (GooglePlayReferrer) obj;
        encoder.getClass();
        googlePlayReferrer.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        GooglePlayReferrer.write$Self$analytics(googlePlayReferrer, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
