package defpackage;

import com.anthropic.claude.analytics.events.LoginEvents$ManagedLoginBlocked;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class pia implements w28 {
    public static final pia a;
    private static final SerialDescriptor descriptor;

    static {
        pia piaVar = new pia();
        a = piaVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("mobile.login.managed.blocked", piaVar, 1);
        pluginGeneratedSerialDescriptor.j("blocked_method", true);
        pluginGeneratedSerialDescriptor.k(new pi(24));
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.w28
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{d4c.S(srg.a)};
    }

    @Override // defpackage.s06
    public final Object deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        ud4 ud4VarC = decoder.c(serialDescriptor);
        vnf vnfVar = null;
        boolean z = true;
        int i = 0;
        String str = null;
        while (z) {
            int iX = ud4VarC.x(serialDescriptor);
            if (iX == -1) {
                z = false;
            } else {
                if (iX != 0) {
                    sz6.e(iX);
                    return null;
                }
                str = (String) ud4VarC.m(serialDescriptor, 0, srg.a, str);
                i = 1;
            }
        }
        ud4VarC.b(serialDescriptor);
        return new LoginEvents$ManagedLoginBlocked(i, str, vnfVar);
    }

    @Override // defpackage.znf, defpackage.s06
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.znf
    public final void serialize(Encoder encoder, Object obj) {
        LoginEvents$ManagedLoginBlocked loginEvents$ManagedLoginBlocked = (LoginEvents$ManagedLoginBlocked) obj;
        encoder.getClass();
        loginEvents$ManagedLoginBlocked.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        vd4 vd4VarC = encoder.c(serialDescriptor);
        LoginEvents$ManagedLoginBlocked.write$Self$analytics(loginEvents$ManagedLoginBlocked, vd4VarC, serialDescriptor);
        vd4VarC.b(serialDescriptor);
    }
}
